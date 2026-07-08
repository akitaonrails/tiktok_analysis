package Y;

import X.C1697810uHb;
import X.C455920HuI;
import X.C531650Kt9;
import X.C786410Ut5;
import X.C904030ZdJ;
import X.C904190ZdZ;
import android.animation.Animator;
import android.provider.Settings;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes15.dex */
public class AAListenerS137S0300000_14 implements Animator.AnimatorListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    public static final void onAnimationCancel$0(AAListenerS137S0300000_14 aAListenerS137S0300000_14, Animator animator) {
    }

    public static final void onAnimationCancel$1(AAListenerS137S0300000_14 aAListenerS137S0300000_14, Animator animator) {
    }

    public static final void onAnimationEnd$0(AAListenerS137S0300000_14 aAListenerS137S0300000_14, Animator animator) {
    }

    public static final void onAnimationRepeat$0(AAListenerS137S0300000_14 aAListenerS137S0300000_14, Animator animator) {
    }

    public static final void onAnimationRepeat$1(AAListenerS137S0300000_14 aAListenerS137S0300000_14, Animator animator) {
    }

    public static final void onAnimationStart$1(AAListenerS137S0300000_14 aAListenerS137S0300000_14, Animator animator) {
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

    public static final void onAnimationEnd$1(AAListenerS137S0300000_14 aAListenerS137S0300000_14, Animator animator) {
        C531650Kt9 it2 = C1697810uHb.LJIIIZ(((C904030ZdJ) aAListenerS137S0300000_14.l0).LLILLJJLI).iterator();
        while (it2.LLILLL) {
            ((C904030ZdJ) aAListenerS137S0300000_14.l0).notifyItemChanged(it2.nextInt(), C904190ZdZ.LIZ);
        }
        C786410Ut5.LLIZLLLIL((RecyclerView) aAListenerS137S0300000_14.l1, 0);
        C786410Ut5.T4((View) aAListenerS137S0300000_14.l2, 1.0f);
        C531650Kt9 it3 = C1697810uHb.LJIIIZ(((C904030ZdJ) aAListenerS137S0300000_14.l0).LLILLJJLI).iterator();
        while (it3.LLILLL) {
            int iNextInt = it3.nextInt();
            C904030ZdJ c904030ZdJ = (C904030ZdJ) aAListenerS137S0300000_14.l0;
            C786410Ut5.LJLIIL((long) (((long) iNextInt) * 150 * Settings.Global.getFloat(c904030ZdJ.LL.getContentResolver(), "animator_duration_scale", 1.0f)), c904030ZdJ.LLILZ, new ARunnableS25S0101000_14(iNextInt, c904030ZdJ, 8));
        }
    }

    public static final void onAnimationStart$0(AAListenerS137S0300000_14 aAListenerS137S0300000_14, Animator animator) {
        C786410Ut5.T4((View) aAListenerS137S0300000_14.l0, 0.0f);
        C786410Ut5.LJLLLLLL(0, (View) aAListenerS137S0300000_14.l0);
        ((View) aAListenerS137S0300000_14.l0).setPivotY(r1.getHeight());
        ((Function0) aAListenerS137S0300000_14.l1).invoke();
        RecyclerView recyclerView = (RecyclerView) ((C455920HuI) aAListenerS137S0300000_14.l2).findViewById(R.id.h0f);
        if (recyclerView != null) {
            recyclerView.scrollToPosition(0);
        }
        RecyclerView recyclerView2 = (RecyclerView) ((C455920HuI) aAListenerS137S0300000_14.l2).findViewById(R.id.aun);
        if (recyclerView2 != null) {
            recyclerView2.scrollToPosition(0);
        }
    }

    public AAListenerS137S0300000_14(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
