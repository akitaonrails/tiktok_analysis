package X;

import Y.ARunnableS89S0000000_10;
import android.animation.AnimatorSet;
import android.os.Looper;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QzO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C688400QzO {
    public static AnimatorSet LIZ;

    public static void LIZ() {
        AnimatorSet animatorSet;
        if (!Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread())) {
            C786410Ut5.LJJZZIII(C799570VYd.LIZJ(), new ARunnableS89S0000000_10(4));
            return;
        }
        AnimatorSet animatorSet2 = LIZ;
        if (animatorSet2 == null || !animatorSet2.isRunning() || (animatorSet = LIZ) == null) {
            return;
        }
        animatorSet.cancel();
    }
}
