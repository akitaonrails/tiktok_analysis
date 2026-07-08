package Y;

import X.C194405113z;
import X.C786410Ut5;
import android.animation.Animator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes30.dex */
public class AAListenerS142S0300000_29 implements Animator.AnimatorListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    public static final void onAnimationEnd$1(AAListenerS142S0300000_29 aAListenerS142S0300000_29, Animator animator) {
    }

    public static final void onAnimationEnd$2(AAListenerS142S0300000_29 aAListenerS142S0300000_29, Animator animator) {
    }

    public static final void onAnimationEnd$3(AAListenerS142S0300000_29 aAListenerS142S0300000_29, Animator animator) {
    }

    public static final void onAnimationEnd$4(AAListenerS142S0300000_29 aAListenerS142S0300000_29, Animator animator) {
    }

    public static final void onAnimationRepeat$0(AAListenerS142S0300000_29 aAListenerS142S0300000_29, Animator animator) {
    }

    public static final void onAnimationRepeat$1(AAListenerS142S0300000_29 aAListenerS142S0300000_29, Animator animator) {
    }

    public static final void onAnimationRepeat$2(AAListenerS142S0300000_29 aAListenerS142S0300000_29, Animator animator) {
    }

    public static final void onAnimationRepeat$3(AAListenerS142S0300000_29 aAListenerS142S0300000_29, Animator animator) {
    }

    public static final void onAnimationRepeat$4(AAListenerS142S0300000_29 aAListenerS142S0300000_29, Animator animator) {
    }

    public static final void onAnimationStart$0(AAListenerS142S0300000_29 aAListenerS142S0300000_29, Animator animator) {
    }

    public static final void onAnimationStart$1(AAListenerS142S0300000_29 aAListenerS142S0300000_29, Animator animator) {
    }

    public static final void onAnimationStart$2(AAListenerS142S0300000_29 aAListenerS142S0300000_29, Animator animator) {
    }

    public static final void onAnimationStart$3(AAListenerS142S0300000_29 aAListenerS142S0300000_29, Animator animator) {
    }

    public static final void onAnimationStart$4(AAListenerS142S0300000_29 aAListenerS142S0300000_29, Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationCancel$0(this, animator);
                break;
            case 1:
                onAnimationCancel$1(this, animator);
                break;
            case 2:
                onAnimationCancel$2(this, animator);
                break;
            case 3:
                onAnimationCancel$3(this, animator);
                break;
            case 4:
                onAnimationCancel$4(this, animator);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
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
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationRepeat$0(this, animator);
                break;
            case 1:
                onAnimationRepeat$1(this, animator);
                break;
            case 2:
                onAnimationRepeat$2(this, animator);
                break;
            case 3:
                onAnimationRepeat$3(this, animator);
                break;
            case 4:
                onAnimationRepeat$4(this, animator);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationStart$0(this, animator);
                break;
            case 1:
                onAnimationStart$1(this, animator);
                break;
            case 2:
                onAnimationStart$2(this, animator);
                break;
            case 3:
                onAnimationStart$3(this, animator);
                break;
            case 4:
                onAnimationStart$4(this, animator);
                break;
        }
    }

    public static final void onAnimationCancel$0(AAListenerS142S0300000_29 aAListenerS142S0300000_29, Animator animator) {
        Function0 function0 = (Function0) aAListenerS142S0300000_29.l2;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void onAnimationCancel$1(AAListenerS142S0300000_29 aAListenerS142S0300000_29, Animator animator) {
        ((ViewPropertyAnimator) aAListenerS142S0300000_29.l0).setListener(null);
        C786410Ut5.T4(((RecyclerView.ViewHolder) aAListenerS142S0300000_29.l1).itemView, 1.0f);
        C786410Ut5.Jc(((RecyclerView.ViewHolder) aAListenerS142S0300000_29.l1).itemView, 0.0f);
        ((ArrayList) ((C194405113z) aAListenerS142S0300000_29.l2).LLJJJJLIIL).remove((RecyclerView.ViewHolder) aAListenerS142S0300000_29.l1);
        ((C194405113z) aAListenerS142S0300000_29.l2).LJJIIJ((RecyclerView.ViewHolder) aAListenerS142S0300000_29.l1);
        C194405113z.LJJIJIL((C194405113z) aAListenerS142S0300000_29.l2);
    }

    public static final void onAnimationCancel$2(AAListenerS142S0300000_29 aAListenerS142S0300000_29, Animator animator) {
        ((ViewPropertyAnimator) aAListenerS142S0300000_29.l0).setListener(null);
        ((ArrayList) ((C194405113z) aAListenerS142S0300000_29.l1).LLJJL).remove((RecyclerView.ViewHolder) aAListenerS142S0300000_29.l2);
        C786410Ut5.T4(((RecyclerView.ViewHolder) aAListenerS142S0300000_29.l2).itemView, 1.0f);
        ((C194405113z) aAListenerS142S0300000_29.l1).LJJIIJ((RecyclerView.ViewHolder) aAListenerS142S0300000_29.l2);
        C194405113z.LJJIJIL((C194405113z) aAListenerS142S0300000_29.l1);
    }

    public static final void onAnimationCancel$3(AAListenerS142S0300000_29 aAListenerS142S0300000_29, Animator animator) {
        ((ViewPropertyAnimator) aAListenerS142S0300000_29.l0).setListener(null);
        ((ArrayList) ((C194405113z) aAListenerS142S0300000_29.l1).LLJL).remove((RecyclerView.ViewHolder) aAListenerS142S0300000_29.l2);
        C786410Ut5.T4(((RecyclerView.ViewHolder) aAListenerS142S0300000_29.l2).itemView, 1.0f);
        ((C194405113z) aAListenerS142S0300000_29.l1).LJIIIZ((RecyclerView.ViewHolder) aAListenerS142S0300000_29.l2);
        C194405113z.LJJIJIL((C194405113z) aAListenerS142S0300000_29.l1);
    }

    public static final void onAnimationCancel$4(AAListenerS142S0300000_29 aAListenerS142S0300000_29, Animator animator) {
        ((ViewPropertyAnimator) aAListenerS142S0300000_29.l0).setListener(null);
        ((ArrayList) ((C194405113z) aAListenerS142S0300000_29.l1).LLJL).remove((RecyclerView.ViewHolder) aAListenerS142S0300000_29.l2);
        C786410Ut5.Jc(((RecyclerView.ViewHolder) aAListenerS142S0300000_29.l2).itemView, 0.0f);
        C786410Ut5.T4(((RecyclerView.ViewHolder) aAListenerS142S0300000_29.l2).itemView, 1.0f);
        ((C194405113z) aAListenerS142S0300000_29.l1).LJIIIZ((RecyclerView.ViewHolder) aAListenerS142S0300000_29.l2);
        C194405113z.LJJIJIL((C194405113z) aAListenerS142S0300000_29.l1);
    }

    public static final void onAnimationEnd$0(AAListenerS142S0300000_29 aAListenerS142S0300000_29, Animator animator) {
        C786410Ut5.LJLLLLLL(8, (View) aAListenerS142S0300000_29.l0);
        Function0 function0 = (Function0) aAListenerS142S0300000_29.l1;
        if (function0 != null) {
            function0.invoke();
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AAListenerS142S0300000_29(android.view.ViewPropertyAnimator r2, androidx.recyclerview.widget.RecyclerView.ViewHolder r3, X.C194405113z r4, int r5) {
        /*
            r1 = this;
            r1.$t = r5
            int r5 = 1 - r5
            if (r5 == 0) goto L11
            r0 = r1
            r0.l0 = r2
            r0.l1 = r4
            r0.l2 = r3
        Ld:
            r0.<init>()
            return
        L11:
            r0 = r1
            r0.l0 = r2
            r0.l1 = r3
            r0.l2 = r4
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AAListenerS142S0300000_29.<init>(android.view.ViewPropertyAnimator, androidx.recyclerview.widget.RecyclerView$ViewHolder, X.113z, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AAListenerS142S0300000_29(View view, View view2, Function0<Unit> function0, Function0<Unit> function02) {
        this.$t = function02;
        this.l0 = view;
        this.l1 = view2;
        this.l2 = function0;
    }
}
