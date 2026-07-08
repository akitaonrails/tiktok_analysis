package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleKt;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: renamed from: X.0GmH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C425470GmH extends C425510GmL {
    public final LinearLayout LLILZIL;
    public final C01GW LLILZLL;
    public final C01GW LLIZ;

    @Override // X.C425510GmL
    public final void I5(final InterfaceC434700H2u interfaceC434700H2u, final int i) {
        this.LLILZ = interfaceC434700H2u;
        ((C1295960jpS) this.LLILZLL.getValue()).cancelAnimation();
        LinearLayout linearLayout = this.LLILZIL;
        C786410Ut5.LJJJJJL(linearLayout);
        linearLayout.addView((View) this.LLIZ.getValue());
        linearLayout.addView((View) this.LLILZLL.getValue());
        C1295960jpS c1295960jpS = (C1295960jpS) this.LLILZLL.getValue();
        c1295960jpS.removeAllAnimatorListeners();
        c1295960jpS.addAnimatorListener(new AnimatorListenerAdapter() { // from class: X.0GqY
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                super.onAnimationStart(animator);
                C23250099c.LIZLLL(LifecycleKt.androidx_lifecycle_LifecycleKt_com_ss_android_ugc_aweme_main_lancet_SAFTikTokLancet_getCoroutineScope(this.LL.LLILLJJLI), null, null, new C432260GxE(this.LL, interfaceC434700H2u, i, null), 3);
            }
        });
    }

    public C425470GmH(LinearLayout linearLayout, Lifecycle lifecycle, InterfaceC432280GxG interfaceC432280GxG) {
        super(linearLayout, lifecycle, interfaceC432280GxG);
        this.LLILZIL = linearLayout;
        this.LLILZLL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1138));
        this.LLIZ = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1137));
    }
}
