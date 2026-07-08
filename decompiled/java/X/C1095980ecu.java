package X;

import android.animation.AnimatorSet;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0ecu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final /* synthetic */ class C1095980ecu extends C2217421BqW implements Function0<AnimatorSet> {
    public C1095980ecu(Object obj) {
        super(0, obj, C1095920eco.class, "buildFansAnimatorSet", "buildFansAnimatorSet()Landroid/animation/AnimatorSet;", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final AnimatorSet invoke() {
        C1095920eco c1095920eco = (C1095920eco) this.receiver;
        AnimatorSet animatorSet = c1095920eco.LJIJJLI;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        c1095920eco.LJIJJLI = animatorSet2;
        return animatorSet2;
    }
}
