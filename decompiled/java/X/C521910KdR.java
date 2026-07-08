package X;

import com.bytedance.android.livesdk.comp.api.event.api.data.LiveEventModule;
import com.bytedance.android.livesdk.dataChannel.PaidEventStatusChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.model.LiveEventInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.video.SubOnlyVideoContentFragment;
import com.ss.android.ugc.aweme.video.model.SubOnlyVideoViewModel;
import kotlin.jvm.internal.AwS583S0100000_4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0KdR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C521910KdR implements InterfaceC1141530foN {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        switch (this.$t) {
            case 0:
                mh2$0(this, c262100zr);
                break;
            case 1:
                mh2$1(this, c262100zr);
                break;
        }
    }

    public C521910KdR(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void mh2$0(C521910KdR c521910KdR, C262100zr c262100zr) {
        InterfaceC1107590evd interfaceC1107590evd;
        LiveEventModule liveEventModuleLIZ;
        LiveEventInfo liveEventInfo;
        Room room;
        LiveEventInfo liveEventInfo2;
        if (!Intrinsics.LJFF(c262100zr.LIZ, "live_event_update_result") || (interfaceC1107590evd = c262100zr.LIZIZ) == null || (liveEventModuleLIZ = C477380Ino.LIZ(interfaceC1107590evd)) == null) {
            return;
        }
        DataChannel dataChannel = ((C0KAM) c521910KdR.l0).LIZ;
        Long l = null;
        if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null && (liveEventInfo2 = room.liveEventInfo) != null) {
            l = liveEventInfo2.eventId;
        }
        String strValueOf = String.valueOf(l);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPaidSuccessEvent:");
        sbLIZ.append(liveEventModuleLIZ.id);
        sbLIZ.append("   ");
        sbLIZ.append(strValueOf);
        C20441214yg.LIZIZ("PaidEventManager", C2188811AlT.LIZIZ(sbLIZ));
        if (C500260Jjc.LJJIIZ(liveEventModuleLIZ.id) && Intrinsics.LJFF(liveEventModuleLIZ.id, strValueOf)) {
            C20441214yg.LIZIZ("PaidEventManager", "sendEvent");
            DataChannel dataChannel2 = ((C0KAM) c521910KdR.l0).LIZ;
            if (dataChannel2 != null) {
                dataChannel2.zW(PaidEventStatusChannel.class, EnumC464630IJx.PAY_SUCCESS);
            }
            Room room2 = ((C0KAM) c521910KdR.l0).LIZJ;
            if (room2 != null && (liveEventInfo = room2.liveEventInfo) != null) {
                liveEventInfo.subscribed = Boolean.TRUE;
            }
        }
    }

    public static final void mh2$1(C521910KdR c521910KdR, C262100zr c262100zr) {
        SubOnlyVideoViewModel subOnlyVideoViewModel = ((SubOnlyVideoContentFragment) c521910KdR.l0).LLJJIJIL;
        if (subOnlyVideoViewModel != null) {
            subOnlyVideoViewModel.withState(new AwS583S0100000_4(subOnlyVideoViewModel, 367));
        }
    }
}
