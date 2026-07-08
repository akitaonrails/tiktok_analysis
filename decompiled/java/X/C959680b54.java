package X;

import Y.AfS7S0401000_15;
import com.bytedance.android.live.liveinteract.cohost.remote.api.CoHostApi;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Calendar;
import java.util.Collections;
import java.util.Set;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AwS416S0200000_15;

/* JADX INFO: renamed from: X.0b54, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C959680b54 extends AbstractC959270b4P implements InterfaceC960010b5b {
    @Override // X.InterfaceC960070b5h
    public final Set LJIIIZ() {
        return Collections.singleton(EnumC958900b3o.WAITED);
    }

    public C959680b54(InterfaceC959730b59 interfaceC959730b59) {
        super(interfaceC959730b59);
    }

    @Override // X.InterfaceC960010b5b
    public final void LJFF(EnumC959750b5B enumC959750b5B, C950840aqo c950840aqo, C11NJ c11nj, AwS416S0200000_15 awS416S0200000_15, AFwS203S0000000_15 aFwS203S0000000_15) {
        long id;
        InterfaceC914930Zut<C960260b60> interfaceC914930Zut;
        int i;
        Number numberValueOf;
        InterfaceC914930Zut<C960260b60> interfaceC914930Zut2;
        Room roomInfo = this.LIZ.getRoomInfo();
        if (roomInfo != null) {
            id = roomInfo.getId();
        } else {
            id = 0;
        }
        long jLJFF = C950220apo.LJFF();
        if (id != 0 && jLJFF != 0) {
            this.LIZ.c0().LJFF = C915980Zwa.LJII().getChannelId();
            if (enumC959750b5B == EnumC959750b5B.TYPE_TEAM_PAIR_SYNC_STATE) {
                C20441214yg.LIZIZ("TeamPairNoneCoordinator", "Skip real auto_match request");
                awS416S0200000_15.invoke();
                if (c950840aqo != null && (interfaceC914930Zut2 = c950840aqo.LIZIZ) != null) {
                    interfaceC914930Zut2.onSuccess(new C960260b60(0));
                    return;
                }
                return;
            }
            C01GW<C958830b3h> c01gw = C958830b3h.LJII;
            C958830b3h c958830b3hLIZ = C944440agU.LIZ();
            long jLIZ = C158B.LIZ();
            C959600b4w c959600b4wC0 = this.LIZ.c0();
            c959600b4wC0.LIZLLL = jLIZ;
            c959600b4wC0.LJIILIIL = false;
            c959600b4wC0.LJIILJJIL = jLIZ / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
            long innerChannelId = C915980Zwa.LJII().getInnerChannelId();
            long channelId = C915980Zwa.LJII().getChannelId();
            int iLIZ = C958930b3r.LIZ(this.LIZ.d0());
            if (c950840aqo == null || (numberValueOf = c950840aqo.LIZ) == null) {
                if (enumC959750b5B == EnumC959750b5B.TYPE_INVITEE_LIST_DIALOG) {
                    i = 1;
                } else {
                    i = 0;
                }
                numberValueOf = Integer.valueOf(i);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("startQuickCoHost, innerChannelId=");
            sbLIZ.append(innerChannelId);
            sbLIZ.append(", groupChannelId=");
            sbLIZ.append(channelId);
            sbLIZ.append(", autoMatchScene=");
            sbLIZ.append(iLIZ);
            sbLIZ.append(", autoMatchEntrance=");
            sbLIZ.append(numberValueOf);
            C20441214yg.LIZIZ("TeamPairNoneCoordinator", C2188811AlT.LIZIZ(sbLIZ));
            c958830b3hLIZ.LJJIFFI(iLIZ, enumC959750b5B.name(), false);
            C480460Ism.LIZ().getClass();
            c11nj.LIZ(((CoHostApi) C480460Ism.LIZLLL(CoHostApi.class)).randomLinkMicAutoMatch(id, jLJFF, "", iLIZ, numberValueOf.intValue(), "", innerChannelId, channelId, this.LIZ.c0().LJIILJJIL, Calendar.getInstance().getTimeZone().getID(), Calendar.getInstance().getTimeZone().getOffset(System.currentTimeMillis()) / LSPassThroughRecordSizeConfig.DEFAULT, null, 0).LJIILIIL(new C0UO0()).LJJLL(new AfS7S0401000_15(this, iLIZ, enumC959750b5B, c950840aqo, awS416S0200000_15, 1), new AfS7S0401000_15(this, iLIZ, enumC959750b5B, c950840aqo, aFwS203S0000000_15, 2)));
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("roomId=");
        sbLIZ2.append(id);
        sbLIZ2.append(", userId=");
        sbLIZ2.append(jLJFF);
        C20441214yg.LJ("TeamPairNoneCoordinator", C2188811AlT.LIZIZ(sbLIZ2));
        if (c950840aqo != null && (interfaceC914930Zut = c950840aqo.LIZIZ) != null) {
            interfaceC914930Zut.LIZ(1, "invalid params", null);
        }
    }
}
