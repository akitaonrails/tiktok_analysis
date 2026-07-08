package X;

import com.ss.android.ugc.aweme.feed.assem.tikbot.TakoAssem;
import com.ss.android.ugc.feed.platform.cell.shrink.VideoShrinkAbility;

/* JADX INFO: renamed from: X.14T9, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14T9 implements InterfaceC1350190lEv {
    public final VideoShrinkAbility LIZ;

    @Override // X.InterfaceC1350190lEv
    public final Boolean LIZIZ() {
        VideoShrinkAbility videoShrinkAbility = this.LIZ;
        if (videoShrinkAbility != null) {
            return Boolean.valueOf(videoShrinkAbility.dA0());
        }
        return null;
    }

    public C14T9(TakoAssem takoAssem) {
        this.LIZ = (VideoShrinkAbility) takoAssem.LLLIIII.getValue();
    }

    @Override // X.InterfaceC1350190lEv
    public final void LIZ(int i, int i2) {
        VideoShrinkAbility videoShrinkAbility = this.LIZ;
        if (videoShrinkAbility != null) {
            videoShrinkAbility.t1(i, i2);
        }
    }
}
