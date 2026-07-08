package X;

import com.bytedance.android.livesdk.model.message.FanTicketRoomNoticeContent;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.HashMap;
import java.util.HashSet;
import webcast.data.multi_guest_play.TopGuestMetaContent;

/* JADX INFO: renamed from: X.01ZJ, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01ZJ extends C01ZI {
    public final C01ZN LJIJJ;
    public final C311401Iq LJIJJLI;
    public boolean LJIL;
    public final C5183020f LJJ;

    @Override // X.C01ZI
    public final String LJFF() {
        return "TopGuestGamePlayGuestModel";
    }

    @Override // X.C01ZI
    public final void LJIIIIZZ() {
        HashSet<C01HG> hashSet;
        this.LJIILJJIL = "guest_end";
        super.LJIIIIZZ();
        C311401Iq c311401Iq = this.LJIJJLI;
        c311401Iq.getClass();
        Object value = c311401Iq.LIZIZ.getValue();
        if (C924240a9u.LIZ().codeTechSwitchForAndroid != 0 && (hashSet = C01HE.LIZJ) != null) {
            hashSet.remove(value);
        }
        c311401Iq.LIZ = null;
    }

    @Override // X.C01ZI
    public final void LIZLLL() {
        HashSet<C01HG> hashSet;
        super.LIZLLL();
        C311401Iq c311401Iq = this.LJIJJLI;
        c311401Iq.LIZ = new C5183020f(this, 333);
        Object value = c311401Iq.LIZIZ.getValue();
        if (C924240a9u.LIZ().codeTechSwitchForAndroid == 0 || (hashSet = C01HE.LIZJ) == null) {
            return;
        }
        hashSet.add((C01HG) value);
    }

    @Override // X.C01ZI
    public final /* bridge */ /* synthetic */ C01ZL LJI() {
        return this.LJIJJ;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.01ZN] */
    public C01ZJ(DataChannel dataChannel) {
        super(dataChannel);
        this.LJIJJ = new C01ZL() { // from class: X.01ZN
            @Override // X.C01ZL
            public final boolean LIZLLL(TopGuestMetaContent topGuestMetaContent, String str) {
                Long lValueOf;
                if (!super.LIZLLL(topGuestMetaContent, str) || this.LIZLLL == 0 || topGuestMetaContent == null) {
                    return false;
                }
                long currentUserId = UserService.getInstance().user().getCurrentUserId();
                HashMap map = new HashMap();
                C404301hh.LIZIZ(map);
                map.put("guest_id", String.valueOf(currentUserId));
                map.put("top_guests_id", String.valueOf(topGuestMetaContent.playId));
                map.put("link_id", C921180a4y.LJIIJ(C915980Zwa.LJIIIIZZ()));
                C01ZR c01zrLIZIZ = C356501Zz.LIZIZ();
                Integer numValueOf = null;
                if (c01zrLIZIZ != null) {
                    lValueOf = Long.valueOf(c01zrLIZIZ.LIZIZ(currentUserId));
                } else {
                    lValueOf = null;
                }
                map.put("guest_points", String.valueOf(lValueOf));
                C01ZR c01zrLIZIZ2 = C356501Zz.LIZIZ();
                if (c01zrLIZIZ2 != null) {
                    numValueOf = Integer.valueOf(c01zrLIZIZ2.LIZ(currentUserId));
                }
                map.put("guest_rank", String.valueOf(numValueOf));
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_multi_guest_top_guests_apply");
                c474500IjALIZ.LJJIIZI(map);
                c474500IjALIZ.LIZ();
                this.LJFF = 0;
                return true;
            }

            @Override // X.C01ZL
            public final boolean LIZJ(TopGuestMetaContent topGuestMetaContent, int i, String str) {
                long jLIZIZ;
                Object objValueOf;
                if (!super.LIZJ(topGuestMetaContent, i, str) || this.LIZLLL == 0 || topGuestMetaContent == null) {
                    return false;
                }
                long jLIZ = LIZ(this.LIZLLL, System.currentTimeMillis());
                long currentUserId = UserService.getInstance().user().getCurrentUserId();
                HashMap map = new HashMap();
                C404301hh.LIZIZ(map);
                map.put("guest_cnt", String.valueOf(i));
                map.put("top_guests_id", String.valueOf(topGuestMetaContent.playId));
                map.put("link_id", C921180a4y.LJIIJ(C915980Zwa.LJIIIIZZ()));
                C01ZR c01zrLIZIZ = C356501Zz.LIZIZ();
                if (c01zrLIZIZ != null) {
                    jLIZIZ = c01zrLIZIZ.LIZIZ(currentUserId);
                } else {
                    jLIZIZ = 0;
                }
                map.put("guest_points", String.valueOf(jLIZIZ));
                C01ZR c01zrLIZIZ2 = C356501Zz.LIZIZ();
                if (c01zrLIZIZ2 != null) {
                    objValueOf = Integer.valueOf(c01zrLIZIZ2.LIZ(currentUserId));
                } else {
                    objValueOf = 0L;
                }
                map.put("guest_rank", objValueOf.toString());
                map.put("end_reason", str);
                long j = LSPassThroughRecordSizeConfig.DEFAULT;
                map.put("total_duration", String.valueOf(jLIZ / j));
                map.put("other_play_duration", String.valueOf(this.LIZIZ / j));
                map.put("guest_id", String.valueOf(currentUserId));
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_multi_guest_top_guests_end");
                c474500IjALIZ.LJJIIZI(map);
                c474500IjALIZ.LIZ();
                this.LJFF = 1;
                return true;
            }
        };
        this.LJIJJLI = new C311401Iq();
        this.LJJ = new C5183020f(this, 334);
    }

    @Override // X.C01ZI, X.C01ZQ
    public final void LIZ(FanTicketRoomNoticeContent fanTicketRoomNoticeContent) {
        super.LIZ(fanTicketRoomNoticeContent);
        if (this.LJIL) {
            LJIILJJIL(System.currentTimeMillis());
        }
    }

    public final void LJIILJJIL(long j) {
        this.LJIL = false;
        LIZLLL(this.LJIIIIZZ, "guest_connect");
        if (((Boolean) this.LJFF.getValue()).booleanValue()) {
            C01ZN c01zn = this.LJIJJ;
            c01zn.LIZJ = c01zn.LIZJ;
            if (c01zn.LIZIZ()) {
                c01zn.LIZ = j;
            }
        }
    }
}
