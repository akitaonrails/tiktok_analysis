package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.lynx.base.log.LynxLog;
import com.lynx.tasm.behavior.ui.LynxUI;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0kHP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1313290kHP extends AnimatorListenerAdapter {
    public static final Map<String, Object> LLILLJJLI;
    public final WeakReference<C1313330kHT> LL;

    static {
        HashMap map = new HashMap();
        LLILLJJLI = map;
        map.put("animation_type", "keyframe-animation");
        map.put("animation_name", "");
    }

    public C1313290kHP(C1313330kHT c1313330kHT) {
        this.LL = new WeakReference<>(c1313330kHT);
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
        C1313330kHT c1313330kHT = this.LL.get();
        if (c1313330kHT == null) {
            return;
        }
        C1313370kHX c1313370kHX = c1313330kHT.LJIIIIZZ;
        if (c1313370kHX != null) {
            str = c1313370kHX.LL;
        } else {
            str = "";
        }
        EnumC1313880kIM enumC1313880kIM = c1313330kHT.LJII;
        EnumC1313880kIM enumC1313880kIM2 = EnumC1313880kIM.RUNNING;
        if (enumC1313880kIM == enumC1313880kIM2) {
            LynxUI lynxUILJII = c1313330kHT.LJII();
            LIZ(lynxUILJII, "animationend", str);
            if (lynxUILJII != null) {
                lynxUILJII.onAnimationEnd(str);
            }
            if (c1313330kHT.LJII == enumC1313880kIM2) {
                z = true;
            } else {
                z = false;
            }
            LynxLog.DCHECK(z);
            c1313330kHT.LJII = EnumC1313880kIM.IDLE;
        }
        if (c1313370kHX != null && (i = c1313370kHX.LLJILJIL) != 1 && i != 3) {
            c1313330kHT.LJIIJ();
        }
        c1313330kHT.LJI = null;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        String str;
        super.onAnimationRepeat(animator);
        C1313330kHT c1313330kHT = this.LL.get();
        if (c1313330kHT == null) {
            return;
        }
        C1313370kHX c1313370kHX = c1313330kHT.LJIIIIZZ;
        if (c1313370kHX != null) {
            str = c1313370kHX.LL;
        } else {
            str = "";
        }
        LIZ(c1313330kHT.LJII(), "animationiteration", str);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        super.onAnimationStart(animator);
    }

    public static void LIZ(LynxUI lynxUI, String str, String str2) {
        if (lynxUI != null && lynxUI.getEvents() != null && lynxUI.getEvents().containsKey(str)) {
            Map<String, Object> map = LLILLJJLI;
            ((HashMap) map).put("animation_name", str2);
            lynxUI.mContext.LLIZ.LIZIZ(new C1298700jts(lynxUI.getSign(), str, map));
        }
    }
}
