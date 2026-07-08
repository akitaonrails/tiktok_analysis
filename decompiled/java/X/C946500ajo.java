package X;

import android.graphics.Rect;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.multiguestv3.AudienceVideoViewParams;
import com.bytedance.android.live.liveinteract.multiguestv3.MultiGuestV3VideoSizeChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.MultiGuestV3VideoViewRealSizeChannel;
import com.bytedance.android.live.livepullstream.api.IPullStreamService;
import com.bytedance.android.livesdk.dataChannel.PIPModeChangeEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Pair;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: renamed from: X.0ajo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C946500ajo extends AbstractC946520ajq {
    public final View LIZIZ;
    public final DataChannel LIZJ;
    public final EnumC939140aXw LIZLLL;

    @Override // X.AbstractC946520ajq
    public final Rect LIZJ() {
        DataChannel dataChannel = this.LIZJ;
        if (dataChannel != null) {
            return (Rect) dataChannel.gg0(MultiGuestV3VideoViewRealSizeChannel.class);
        }
        return null;
    }

    @Override // X.InterfaceC2181941AaO
    public final Pair<Integer, Integer> getResolution() {
        C480680It8 c480680It8YY;
        InterfaceC480510Isr interfaceC480510Isr;
        IPullStreamService iPullStreamService = (IPullStreamService) C1161920gLG.LIZJ(IPullStreamService.class);
        if (iPullStreamService != null && (c480680It8YY = iPullStreamService.YY()) != null && (interfaceC480510Isr = c480680It8YY.LIZIZ) != null) {
            int iP0 = interfaceC480510Isr.p0();
            return new Pair<>(Integer.valueOf(65535 & iP0), Integer.valueOf(iP0 >> 16));
        }
        DataChannel dataChannel = this.LIZJ;
        if (dataChannel != null) {
            return (Pair) dataChannel.gg0(MultiGuestV3VideoSizeChannel.class);
        }
        return null;
    }

    @Override // X.InterfaceC2181941AaO
    public final void reset() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("type:");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(" reset");
        C939200aY2.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("type:");
        sbLIZ2.append(this.LIZLLL);
        sbLIZ2.append(" reset");
        C20441214yg.LIZIZ("RoomStreamPlayer", C2188811AlT.LIZIZ(sbLIZ2));
        C0IEU c0ieu = new C0IEU(-1, -1, 0, 0, 0, true, EnumC918990a1R.NORMAL, (String) null, (InterfaceC463550IFt) null, "RoomStreamPlayer_reset", false, 2432);
        DataChannel dataChannel = this.LIZJ;
        if (dataChannel != null) {
            dataChannel.zW(AudienceVideoViewParams.class, c0ieu);
        }
        this.LIZ.setEmpty();
    }

    @Override // X.AbstractC946520ajq
    public final void LIZLLL(Rect rect, Pair<Integer, Integer> pair) {
        boolean z;
        Pair<Integer, Integer> pair2 = pair;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("type:");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(" updateSizeAfterFilter:");
        sbLIZ.append(rect);
        sbLIZ.append(" parentSize:");
        sbLIZ.append(pair2);
        sbLIZ.append(" dataChannel:");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(" anchorContainer:");
        sbLIZ.append(this.LIZIZ);
        C939200aY2.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("type:");
        sbLIZ2.append(this.LIZLLL);
        sbLIZ2.append(" updateSizeAfterFilter:");
        sbLIZ2.append(rect);
        sbLIZ2.append(" anchorContainer:");
        sbLIZ2.append(this.LIZIZ);
        C20441214yg.LIZIZ("RoomStreamPlayer", C2188811AlT.LIZIZ(sbLIZ2));
        View view = this.LIZIZ;
        if (view != null) {
            if (pair2 == null) {
                pair2 = new Pair<>(Integer.valueOf(view.getWidth()), Integer.valueOf(view.getHeight()));
            }
            if (pair2.getFirst().intValue() == rect.width() && pair2.getSecond().intValue() == rect.height()) {
                z = true;
            } else {
                z = false;
            }
            int iIntValue = pair2.getFirst().intValue() - rect.right;
            C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
            C307001Gy.LIZ().getClass();
            C0IEU c0ieu = new C0IEU(rect.width(), rect.height(), rect.top, rect.left, iIntValue, z, C927600aFK.LJIIJ(), (String) null, (InterfaceC463550IFt) null, "RoomStreamPlayer_updateSizeAfterFilter", false, 2944);
            DataChannel dataChannel = this.LIZJ;
            if (dataChannel != null) {
                dataChannel.zW(AudienceVideoViewParams.class, c0ieu);
            }
        }
    }

    public C946500ajo(LifecycleOwner lifecycleOwner, View view, DataChannel dataChannel, EnumC939140aXw enumC939140aXw) {
        this.LIZIZ = view;
        this.LIZJ = dataChannel;
        this.LIZLLL = enumC939140aXw;
        if (dataChannel != null) {
            dataChannel.BQ2(lifecycleOwner, PIPModeChangeEvent.class, new AwS594S0100000_15(this, 1093));
        }
    }
}
