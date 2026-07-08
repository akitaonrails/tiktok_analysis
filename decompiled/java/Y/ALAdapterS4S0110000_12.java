package Y;

import X.C1338270kvh;
import X.C439101nJ;
import X.RunnableC776140UcW;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes13.dex */
public class ALAdapterS4S0110000_12 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case 0:
                this.z1 = true;
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
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.$t) {
            case 1:
                C1338270kvh.LIZ;
                break;
            case 2:
                onAnimationStart$1(this, animator);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ALAdapterS4S0110000_12(Object obj, Function0<Unit> function0) {
        this.$t = function0;
        this.l0 = obj;
    }

    public static final void onAnimationCancel$1(ALAdapterS4S0110000_12 aLAdapterS4S0110000_12, Animator animator) {
        super.onAnimationCancel(animator);
        aLAdapterS4S0110000_12.z1 = true;
        Map<String, Object> map = C1338270kvh.LIZ;
    }

    public static final void onAnimationEnd$0(ALAdapterS4S0110000_12 aLAdapterS4S0110000_12, Animator animator) {
        Function0 function0;
        super.onAnimationEnd(animator);
        if (!aLAdapterS4S0110000_12.z1 && (function0 = (Function0) aLAdapterS4S0110000_12.l0) != null) {
            function0.invoke();
        }
    }

    public static final void onAnimationEnd$1(ALAdapterS4S0110000_12 aLAdapterS4S0110000_12, Animator animator) {
        Map<String, Object> map = C1338270kvh.LIZ;
        if (!aLAdapterS4S0110000_12.z1) {
            ((Function0) aLAdapterS4S0110000_12.l0).invoke();
        }
    }

    public static final void onAnimationEnd$2(ALAdapterS4S0110000_12 aLAdapterS4S0110000_12, Animator animator) {
        int iLIZ = C439101nJ.LIZ(14);
        if (aLAdapterS4S0110000_12.z1) {
            ((RunnableC776140UcW) aLAdapterS4S0110000_12.l0).getIvRecordRedRingFromXml().setClickable(false);
            ((RunnableC776140UcW) aLAdapterS4S0110000_12.l0).getIvCloseFromXml().setClickable(false);
            iLIZ = C439101nJ.LIZ(8);
        }
        View ivRecordRedDotFromXml = ((RunnableC776140UcW) aLAdapterS4S0110000_12.l0).getIvRecordRedDotFromXml();
        ivRecordRedDotFromXml.getLayoutParams().width = iLIZ;
        ivRecordRedDotFromXml.getLayoutParams().height = iLIZ;
    }

    public static final void onAnimationStart$1(ALAdapterS4S0110000_12 aLAdapterS4S0110000_12, Animator animator) {
        if (!aLAdapterS4S0110000_12.z1) {
            ((RunnableC776140UcW) aLAdapterS4S0110000_12.l0).getIvRecordRedRingFromXml().setClickable(true);
            ((RunnableC776140UcW) aLAdapterS4S0110000_12.l0).getIvCloseFromXml().setClickable(true);
        }
    }

    public ALAdapterS4S0110000_12(RunnableC776140UcW runnableC776140UcW, boolean z, int i) {
        this.$t = i;
        this.z1 = z;
        this.l0 = runnableC776140UcW;
    }
}
