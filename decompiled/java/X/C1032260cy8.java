package X;

import com.ss.android.ugc.aweme.rich.reward.ui.GmtRewardAdContainer;
import com.ss.android.ugc.aweme.rich.reward.video.GmtVideoPlayTaskManager;

/* JADX INFO: renamed from: X.0cy8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1032260cy8 {
    public final /* synthetic */ GmtRewardAdContainer LIZ;

    public final long LIZ() {
        InterfaceC1032290cyB interfaceC1032290cyBLIZLLL = this.LIZ.VR().LIZLLL();
        if (interfaceC1032290cyBLIZLLL != null) {
            return interfaceC1032290cyBLIZLLL.getDuration();
        }
        return 0L;
    }

    public final void LIZJ() {
        ((GmtVideoPlayTaskManager) this.LIZ.LLLIIIIL.getValue()).reset();
    }

    public C1032260cy8(GmtRewardAdContainer gmtRewardAdContainer) {
        this.LIZ = gmtRewardAdContainer;
    }

    public final void LIZIZ(C1034410d1b c1034410d1b) {
        ((GmtVideoPlayTaskManager) this.LIZ.LLLIIIIL.getValue()).LIZ(c1034410d1b);
    }
}
