package X;

import android.graphics.Rect;
import com.bytedance.android.live.liveinteract.multiguestv3.MultiGuestV3VideoSizeChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.MultiGuestV3VideoViewRealSizeChannel;
import com.bytedance.android.live.livepullstream.api.IPullStreamService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0ajp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C946510ajp extends AbstractC946520ajq {
    public final DataChannel LIZIZ;

    @Override // X.AbstractC946520ajq
    public final void LIZLLL(Rect rect, Pair<Integer, Integer> pair) {
    }

    @Override // X.InterfaceC2181941AaO
    public final void reset() {
    }

    @Override // X.AbstractC946520ajq
    public final Rect LIZJ() {
        DataChannel dataChannel = this.LIZIZ;
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
        DataChannel dataChannel = this.LIZIZ;
        if (dataChannel != null) {
            return (Pair) dataChannel.gg0(MultiGuestV3VideoSizeChannel.class);
        }
        return null;
    }

    public C946510ajp(DataChannel dataChannel) {
        this.LIZIZ = dataChannel;
    }
}
