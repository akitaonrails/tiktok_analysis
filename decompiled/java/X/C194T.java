package X;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.194T, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C194T {
    public final C830530Wi3<String, C194U> LIZ = new C830530Wi3<>();
    public final C830530Wi3<String, PropertyValuesHolder[]> LIZIZ = new C830530Wi3<>();

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        return "\n" + C194T.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.LIZ + "}\n";
    }

    public static C194T LIZIZ(List<Animator> list) {
        C194T c194t = new C194T();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) ListProtector.get(list, i);
            if (animator instanceof ObjectAnimator) {
                ObjectAnimator objectAnimator = (ObjectAnimator) animator;
                c194t.LIZIZ.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
                String propertyName = objectAnimator.getPropertyName();
                long startDelay = objectAnimator.getStartDelay();
                long duration = objectAnimator.getDuration();
                TimeInterpolator interpolator = objectAnimator.getInterpolator();
                if (!(interpolator instanceof AccelerateDecelerateInterpolator) && interpolator != null) {
                    if (interpolator instanceof AccelerateInterpolator) {
                        interpolator = C194V.LIZJ;
                    } else if (interpolator instanceof DecelerateInterpolator) {
                        interpolator = C194V.LIZLLL;
                    }
                } else {
                    interpolator = C194V.LIZIZ;
                }
                C194U c194u = new C194U(startDelay, duration, interpolator);
                c194u.LIZLLL = objectAnimator.getRepeatCount();
                c194u.LJ = objectAnimator.getRepeatMode();
                c194t.LIZ.put(propertyName, c194u);
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Animator must be an ObjectAnimator: ");
                sbLIZ.append(animator);
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        return c194t;
    }

    public final C194U LIZJ(String str) {
        if (this.LIZ.get(str) != null) {
            return this.LIZ.get(str);
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C194T)) {
            return false;
        }
        return this.LIZ.equals(((C194T) obj).LIZ);
    }

    public static C194T LIZ(int i, Context context) {
        try {
            Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (animatorLoadAnimator instanceof AnimatorSet) {
                return LIZIZ(((AnimatorSet) animatorLoadAnimator).getChildAnimations());
            }
            if (animatorLoadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(animatorLoadAnimator);
            return LIZIZ(arrayList);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
