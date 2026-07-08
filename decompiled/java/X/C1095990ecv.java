package X;

import android.animation.AnimatorSet;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0ecv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final /* synthetic */ class C1095990ecv extends C2217421BqW implements Function0<AnimatorSet> {
    public C1095990ecv(Object obj) {
        super(0, obj, C1095910ecn.class, "buildFansAnimatorSet", "buildFansAnimatorSet()Landroid/animation/AnimatorSet;", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final AnimatorSet invoke() {
        C1095910ecn c1095910ecn = (C1095910ecn) this.receiver;
        AnimatorSet animatorSet = c1095910ecn.LJJIZ;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        c1095910ecn.LJJIZ = animatorSet2;
        return animatorSet2;
    }
}
