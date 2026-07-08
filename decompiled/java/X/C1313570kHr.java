package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0kHr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1313570kHr extends AnimatorListenerAdapter {
    public static final Map<String, Object> LLILLJJLI;
    public final WeakReference<C1313530kHn> LL;

    static {
        HashMap map = new HashMap();
        LLILLJJLI = map;
        map.put("animation_type", "keyframe-animation");
        map.put("animation_name", "");
    }

    public C1313570kHr(C1313530kHn c1313530kHn) {
        this.LL = new WeakReference<>(c1313530kHn);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        super.onAnimationCancel(animator);
        if (animator != null) {
            animator.removeAllListeners();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        String str;
        int i;
        boolean z;
        super.onAnimationEnd(animator);
        C1313530kHn c1313530kHn = this.LL.get();
        if (c1313530kHn == null) {
            return;
        }
        C1313710kI5 c1313710kI5 = c1313530kHn.LJIIIIZZ;
        if (c1313710kI5 != null) {
            str = c1313710kI5.LL;
        } else {
            str = "";
        }
        EnumC1313870kIL enumC1313870kIL = c1313530kHn.LJII;
        EnumC1313870kIL enumC1313870kIL2 = EnumC1313870kIL.RUNNING;
        if (enumC1313870kIL == enumC1313870kIL2) {
            LIZ(c1313530kHn.LJFF(), "animationend", str);
            if (c1313530kHn.LJII == enumC1313870kIL2) {
                z = true;
            } else {
                z = false;
            }
            C1314420kJE.LIZ(z);
            c1313530kHn.LJII = EnumC1313870kIL.IDLE;
        }
        if (c1313710kI5 != null && (i = c1313710kI5.LLJILJIL) != 1 && i != 3) {
            c1313530kHn.LJIIIIZZ();
        }
        c1313530kHn.LJI = null;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        String str;
        super.onAnimationRepeat(animator);
        C1313530kHn c1313530kHn = this.LL.get();
        if (c1313530kHn == null) {
            return;
        }
        C1313710kI5 c1313710kI5 = c1313530kHn.LJIIIIZZ;
        if (c1313710kI5 != null) {
            str = c1313710kI5.LL;
        } else {
            str = "";
        }
        LIZ(c1313530kHn.LJFF(), "animationiteration", str);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        super.onAnimationStart(animator);
    }

    public static void LIZ(AbstractC1313520kHm abstractC1313520kHm, String str, String str2) {
        Map<String, C1297940jse> map;
        if (abstractC1313520kHm != null && (map = abstractC1313520kHm.LLJIJIL) != null && map.containsKey(str)) {
            Map<String, Object> map2 = LLILLJJLI;
            ((HashMap) map2).put("animation_name", str2);
            abstractC1313520kHm.LLILZ.LLILLL.LIZJ(new C1294230jmf(abstractC1313520kHm.LLJJ, str, map2));
        }
    }
}
