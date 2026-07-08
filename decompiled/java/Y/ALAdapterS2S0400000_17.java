package Y;

import X.C013C;
import X.C1095140ebY;
import X.C1095930ecp;
import X.C1114120f6A;
import X.C1114140f6C;
import X.C1114150f6D;
import X.C1118760fDe;
import X.C12ES;
import X.C19719512Dh;
import X.C20736316Cj;
import X.C430340Gu8;
import X.C497740JfY;
import X.C500260Jjc;
import X.C786410Ut5;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes18.dex */
public class ALAdapterS2S0400000_17 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationCancel$0(this, animator);
                break;
            case 1:
                onAnimationCancel$1(this, animator);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationEnd$0(this, animator);
                break;
            case 1:
                onAnimationEnd$1(this, animator);
                break;
            case 2:
                onAnimationEnd$2(this, animator);
                break;
            case 3:
                onAnimationEnd$3(this, animator);
                break;
            case 4:
                onAnimationEnd$4(this, animator);
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.$t) {
            case 1:
                onAnimationStart$0(this, animator);
                break;
            case 2:
                onAnimationStart$1(this, animator);
                break;
            case 3:
                onAnimationStart$2(this, animator);
                break;
            case 4:
                onAnimationStart$3(this, animator);
                break;
            case 5:
                onAnimationStart$4(this, animator);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public static final void onAnimationCancel$0(ALAdapterS2S0400000_17 aLAdapterS2S0400000_17, Animator animator) {
        super.onAnimationCancel(animator);
        ((C013C) aLAdapterS2S0400000_17.l0).element = true;
    }

    public static final void onAnimationCancel$1(ALAdapterS2S0400000_17 aLAdapterS2S0400000_17, Animator animator) {
        if (((C1114120f6A) aLAdapterS2S0400000_17.l0).LLJJJJLIIL) {
            C786410Ut5.T4((View) aLAdapterS2S0400000_17.l2, 1.0f);
        } else {
            C786410Ut5.ed((View) aLAdapterS2S0400000_17.l2, 0.0f);
        }
    }

    public static final void onAnimationEnd$0(ALAdapterS2S0400000_17 aLAdapterS2S0400000_17, Animator animator) {
        ((AnimatorSet) aLAdapterS2S0400000_17.l1).removeListener(aLAdapterS2S0400000_17);
        if (!((C013C) aLAdapterS2S0400000_17.l0).element) {
            try {
                ImageView imageView = (ImageView) aLAdapterS2S0400000_17.l2;
                if (imageView != null && imageView.getParent() != null) {
                    C500260Jjc.LJJJLL((ImageView) aLAdapterS2S0400000_17.l2);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            Map<ImageView, AnimatorSet> map = ((C1118760fDe) aLAdapterS2S0400000_17.l3).LL;
            C19719512Dh.LIZJ(map).remove((ImageView) aLAdapterS2S0400000_17.l2);
            ((C013C) aLAdapterS2S0400000_17.l0).element = false;
        }
        ((C1118760fDe) aLAdapterS2S0400000_17.l3).LJIIIIZZ("onAnimationEnd");
    }

    public static final void onAnimationEnd$1(ALAdapterS2S0400000_17 aLAdapterS2S0400000_17, Animator animator) {
        ((C1114150f6D) aLAdapterS2S0400000_17.l3).LIZ(null);
        ((C1114120f6A) aLAdapterS2S0400000_17.l0).LJJIIJ((RecyclerView.ViewHolder) aLAdapterS2S0400000_17.l1);
        ((C1114120f6A) aLAdapterS2S0400000_17.l0).LLJJIJI.remove((RecyclerView.ViewHolder) aLAdapterS2S0400000_17.l1);
        ((C1114120f6A) aLAdapterS2S0400000_17.l0).LJJIIZI();
        ((C1114120f6A) aLAdapterS2S0400000_17.l0).LLJ.run();
    }

    public static final void onAnimationEnd$2(ALAdapterS2S0400000_17 aLAdapterS2S0400000_17, Animator animator) {
        ((C1114150f6D) aLAdapterS2S0400000_17.l2).LIZ(null);
        C786410Ut5.T4((View) aLAdapterS2S0400000_17.l3, 1.0f);
        C786410Ut5.Jc((View) aLAdapterS2S0400000_17.l3, 0.0f);
        C786410Ut5.ed((View) aLAdapterS2S0400000_17.l3, 0.0f);
        ((C1114120f6A) aLAdapterS2S0400000_17.l0).LJIIIZ(((C1114140f6C) aLAdapterS2S0400000_17.l1).LIZ);
        ((C1114120f6A) aLAdapterS2S0400000_17.l0).LLJJJ.remove(((C1114140f6C) aLAdapterS2S0400000_17.l1).LIZ);
        ((C1114120f6A) aLAdapterS2S0400000_17.l0).LJJIIZI();
    }

    public static final void onAnimationEnd$3(ALAdapterS2S0400000_17 aLAdapterS2S0400000_17, Animator animator) {
        ((C1114150f6D) aLAdapterS2S0400000_17.l2).LIZ(null);
        C786410Ut5.T4((View) aLAdapterS2S0400000_17.l3, 1.0f);
        C786410Ut5.Jc((View) aLAdapterS2S0400000_17.l3, 0.0f);
        C786410Ut5.ed((View) aLAdapterS2S0400000_17.l3, 0.0f);
        ((C1114120f6A) aLAdapterS2S0400000_17.l0).LJIIIZ(((C1114140f6C) aLAdapterS2S0400000_17.l1).LIZIZ);
        ((C1114120f6A) aLAdapterS2S0400000_17.l0).LLJJJ.remove(((C1114140f6C) aLAdapterS2S0400000_17.l1).LIZIZ);
        ((C1114120f6A) aLAdapterS2S0400000_17.l0).LJJIIZI();
    }

    public static final void onAnimationEnd$4(ALAdapterS2S0400000_17 aLAdapterS2S0400000_17, Animator animator) {
        ((C1114150f6D) aLAdapterS2S0400000_17.l2).LIZ(null);
        C786410Ut5.T4((View) aLAdapterS2S0400000_17.l3, 1.0f);
        ((C1114120f6A) aLAdapterS2S0400000_17.l0).LJIIIZ((RecyclerView.ViewHolder) aLAdapterS2S0400000_17.l1);
        ((C1114120f6A) aLAdapterS2S0400000_17.l0).LLJJIJIL.remove((RecyclerView.ViewHolder) aLAdapterS2S0400000_17.l1);
        ((C1114120f6A) aLAdapterS2S0400000_17.l0).LJJIIZI();
    }

    public static final void onAnimationStart$0(ALAdapterS2S0400000_17 aLAdapterS2S0400000_17, Animator animator) {
        ((C1114120f6A) aLAdapterS2S0400000_17.l0).getClass();
        ((C1114120f6A) aLAdapterS2S0400000_17.l0).LLIZLLLIL.run();
    }

    public static final void onAnimationStart$1(ALAdapterS2S0400000_17 aLAdapterS2S0400000_17, Animator animator) {
        ((C1114120f6A) aLAdapterS2S0400000_17.l0).getClass();
    }

    public static final void onAnimationStart$2(ALAdapterS2S0400000_17 aLAdapterS2S0400000_17, Animator animator) {
        ((C1114120f6A) aLAdapterS2S0400000_17.l0).getClass();
    }

    public static final void onAnimationStart$3(ALAdapterS2S0400000_17 aLAdapterS2S0400000_17, Animator animator) {
        ((C1114120f6A) aLAdapterS2S0400000_17.l0).getClass();
    }

    public static final void onAnimationStart$4(ALAdapterS2S0400000_17 aLAdapterS2S0400000_17, Animator animator) {
        Context context;
        C430340Gu8 c430340Gu8;
        super.onAnimationStart(animator);
        if (!((C013C) aLAdapterS2S0400000_17.l0).element) {
            C12ES.LJIILL(0, ((C1095930ecp) aLAdapterS2S0400000_17.l1).LJIIIZ);
        }
        C430340Gu8 c430340Gu82 = ((C1095930ecp) aLAdapterS2S0400000_17.l1).LJIILIIL;
        if (c430340Gu82 != null) {
            c430340Gu82.setText(String.valueOf(((C1095140ebY) aLAdapterS2S0400000_17.l2).LIZ));
        }
        ViewGroup viewGroup = ((C1095930ecp) aLAdapterS2S0400000_17.l1).LJ;
        if (viewGroup != null && (context = viewGroup.getContext()) != null && (c430340Gu8 = ((C1095930ecp) aLAdapterS2S0400000_17.l1).LJIILIIL) != null) {
            c430340Gu8.LJJJJI(C20736316Cj.LIZIZ(R.attr.c9i, context));
        }
        C430340Gu8 c430340Gu83 = ((C1095930ecp) aLAdapterS2S0400000_17.l1).LJIILIIL;
        if (c430340Gu83 != null) {
            String str = ((C1095140ebY) aLAdapterS2S0400000_17.l2).LJI;
            if (str == null) {
                str = "#FFFFA25F";
            }
            c430340Gu83.setTextColor(C497740JfY.LJI(0, str));
        }
        ((Function0) aLAdapterS2S0400000_17.l3).invoke();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ALAdapterS2S0400000_17(android.view.View r2, androidx.recyclerview.widget.RecyclerView.ViewHolder r3, X.C1114150f6D r4, X.C1114120f6A r5, int r6) {
        /*
            r1 = this;
            r1.$t = r6
            int r6 = 1 - r6
            if (r6 == 0) goto L13
            r0 = r1
            r0.l0 = r5
            r0.l1 = r3
            r0.l2 = r4
            r0.l3 = r2
        Lf:
            r0.<init>()
            return
        L13:
            r0 = r1
            r0.l0 = r5
            r0.l1 = r3
            r0.l2 = r2
            r0.l3 = r4
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ALAdapterS2S0400000_17.<init>(android.view.View, androidx.recyclerview.widget.RecyclerView$ViewHolder, X.0f6D, X.0f6A, int):void");
    }

    public ALAdapterS2S0400000_17(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
    }
}
