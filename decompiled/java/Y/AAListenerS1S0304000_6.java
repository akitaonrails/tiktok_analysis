package Y;

import X.C424500Gki;
import X.C786410Ut5;
import android.animation.Animator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes7.dex */
public class AAListenerS1S0304000_6 implements Animator.AnimatorListener {
    public final int $t;
    public int i3;
    public int i4;
    public int i5;
    public int i6;
    public Object l0;
    public Object l1;
    public Object l2;

    public static final void onAnimationRepeat$0(AAListenerS1S0304000_6 aAListenerS1S0304000_6, Animator animator) {
    }

    public static final void onAnimationRepeat$1(AAListenerS1S0304000_6 aAListenerS1S0304000_6, Animator animator) {
    }

    public static final void onAnimationStart$0(AAListenerS1S0304000_6 aAListenerS1S0304000_6, Animator animator) {
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
        }
    }

    public static final void onAnimationCancel$0(AAListenerS1S0304000_6 aAListenerS1S0304000_6, Animator animator) {
        RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) aAListenerS1S0304000_6.l0;
        View view = viewHolder.itemView;
        int i = aAListenerS1S0304000_6.i3;
        int i2 = aAListenerS1S0304000_6.i4;
        int i3 = aAListenerS1S0304000_6.i5;
        int i4 = aAListenerS1S0304000_6.i6;
        C786410Ut5.Ob(view, 1.0f);
        C786410Ut5.pc(view, 1.0f);
        if (i != i2) {
            C786410Ut5.Jc(viewHolder.itemView, 0.0f);
        }
        if (i3 != i4) {
            C786410Ut5.ed(viewHolder.itemView, 0.0f);
        }
    }

    public static final void onAnimationCancel$1(AAListenerS1S0304000_6 aAListenerS1S0304000_6, Animator animator) {
        RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) aAListenerS1S0304000_6.l1;
        View view = viewHolder.itemView;
        int i = aAListenerS1S0304000_6.i3;
        int i2 = aAListenerS1S0304000_6.i4;
        int i3 = aAListenerS1S0304000_6.i5;
        int i4 = aAListenerS1S0304000_6.i6;
        C786410Ut5.Ob(view, 1.0f);
        C786410Ut5.pc(view, 1.0f);
        if (i != i2) {
            C786410Ut5.Jc(viewHolder.itemView, 0.0f);
        }
        if (i3 != i4) {
            C786410Ut5.ed(viewHolder.itemView, 0.0f);
        }
    }

    public static final void onAnimationEnd$0(AAListenerS1S0304000_6 aAListenerS1S0304000_6, Animator animator) {
        ((ViewPropertyAnimator) aAListenerS1S0304000_6.l1).setListener(null);
        ((C424500Gki) aAListenerS1S0304000_6.l2).LJIIIZ((RecyclerView.ViewHolder) aAListenerS1S0304000_6.l0);
        ((C424500Gki) aAListenerS1S0304000_6.l2).LLJJI.remove((RecyclerView.ViewHolder) aAListenerS1S0304000_6.l0);
        ((C424500Gki) aAListenerS1S0304000_6.l2).LJJIIZI();
    }

    public static final void onAnimationEnd$1(AAListenerS1S0304000_6 aAListenerS1S0304000_6, Animator animator) {
        ((ViewPropertyAnimator) aAListenerS1S0304000_6.l2).setListener(null);
    }

    public static final void onAnimationStart$1(AAListenerS1S0304000_6 aAListenerS1S0304000_6, Animator animator) {
        ((C424500Gki) aAListenerS1S0304000_6.l0).getClass();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AAListenerS1S0304000_6(int r2, int r3, int r4, int r5, android.view.ViewPropertyAnimator r6, androidx.recyclerview.widget.RecyclerView.ViewHolder r7, X.C424500Gki r8, int r9) {
        /*
            r1 = this;
            r1.$t = r9
            if (r9 == 0) goto L17
            r0 = r1
            r0.l0 = r8
            r0.l1 = r7
            r0.i3 = r2
            r0.i4 = r3
            r0.i5 = r4
            r0.i6 = r5
            r0.l2 = r6
        L13:
            r0.<init>()
            return
        L17:
            r0 = r1
            r0.l0 = r7
            r0.i3 = r2
            r0.i4 = r3
            r0.i5 = r4
            r0.i6 = r5
            r0.l1 = r6
            r0.l2 = r8
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AAListenerS1S0304000_6.<init>(int, int, int, int, android.view.ViewPropertyAnimator, androidx.recyclerview.widget.RecyclerView$ViewHolder, X.0Gki, int):void");
    }
}
