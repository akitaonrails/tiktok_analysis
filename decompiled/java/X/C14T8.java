package X;

import com.ss.android.ugc.aweme.feed.assem.tikbot.TakoAssem;
import com.ss.android.ugc.feed.platform.cell.shrink.VideoShrinkAbility;

/* JADX INFO: renamed from: X.14T8, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14T8 implements InterfaceC679410Qkt {
    public final VideoShrinkAbility LL;

    public C14T8(TakoAssem takoAssem) {
        this.LL = (VideoShrinkAbility) takoAssem.LLLIIII.getValue();
    }

    @Override // X.InterfaceC679410Qkt
    public final void LLJLL(float f, float f2) {
        VideoShrinkAbility videoShrinkAbility = this.LL;
        if (videoShrinkAbility != null) {
            videoShrinkAbility.ob(f, f2, new C20571215eY(false, 0, 1023));
        }
    }
}
