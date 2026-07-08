package X;

import Y.AfS151S0200000_15;
import com.bytedance.android.live.liveinteract.cohost.remote.api.CoHostApi;
import com.bytedance.android.live.liveinteract.multihost.biz.link.fragment.MultiHostEOYInviteListFragment;
import com.bytedance.android.live.liveinteract.multihost.core.countdown.MultiCoHostCountDownEvent;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.CohostServerOptVersionSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: renamed from: X.0arU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C951260arU extends AbstractC960500b6O {
    public List<? extends Room> LLJZ;

    @Override // X.AbstractC960950b77
    public final void LJJIJIIJI() {
    }

    @Override // X.AbstractC960500b6O
    public final boolean LJJIZ() {
        return !C0IKQ.LIZ(this.LLJZ);
    }

    @Override // X.AbstractC960500b6O, com.bytedance.android.live.liveinteract.linkroom.business.contract.InteractDialogFragmentBaseContract$AbsPresenter
    public final void LJIIIIZZ() {
        super.LJIIIIZZ();
        ((LinkedHashMap) C955400ayA.LJII).clear();
        this.LLJJJJJIL.zQ2(this);
    }

    public C951260arU(MultiHostEOYInviteListFragment multiHostEOYInviteListFragment, DataChannel dataChannel) {
        super(multiHostEOYInviteListFragment, dataChannel);
        C948450amx.LIZIZ.LIZJ(this);
        dataChannel.CQ2(MultiCoHostCountDownEvent.class, this, new AwS594S0100000_15(this, 70));
        this.LLJZ = C13BV.INSTANCE;
    }

    @Override // X.AbstractC960950b77
    public final void LJIILJJIL(int i, boolean z) {
        long id;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        String strLIZ = C0KRV.LIZ();
        new C955440ayE().LJJIIZ(EnumC952640ati.DEFAULT, strLIZ);
        C955440ayE c955440ayE = new C955440ayE();
        C480460Ism.LIZ().getClass();
        CoHostApi coHostApi = (CoHostApi) C480460Ism.LIZLLL(CoHostApi.class);
        if (room != null) {
            id = room.getId();
        } else {
            id = 0;
        }
        String id2 = Calendar.getInstance().getTimeZone().getID();
        int offset = Calendar.getInstance().getTimeZone().getOffset(System.currentTimeMillis()) / LSPassThroughRecordSizeConfig.DEFAULT;
        boolean z2 = this.LLJJL;
        long version = this.LLJJIJIL.getVersion();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("cohost-arch-version", String.valueOf(CohostServerOptVersionSetting.INSTANCE.getValue()));
        ((C0J1N) coHostApi.rivalsListForMultiCoHost(1, id, i, id2, offset, 0L, z2, 0L, 0L, linkedHashMap, version, strLIZ, 2, "", null, 0, "", false).LJIILIIL(new C0UO0()).LIZJ(LJII())).LIZ(new AfS151S0200000_15(this, c955440ayE, 13), new AfS151S0200000_15(this, c955440ayE, 14));
    }
}
