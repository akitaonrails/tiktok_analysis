package Y;

import X.AbstractC705300RlY;
import X.C1AV2;
import X.C1AVH;
import X.C2180521AVm;
import X.C786410Ut5;
import X.EnumC2180541AVo;
import X.InterfaceC20343214is;
import android.animation.Animator;
import android.view.View;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public class AAListenerS50S0210000_11 implements Animator.AnimatorListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

    public static final void onAnimationCancel$0(AAListenerS50S0210000_11 aAListenerS50S0210000_11, Animator animator) {
    }

    public static final void onAnimationCancel$1(AAListenerS50S0210000_11 aAListenerS50S0210000_11, Animator animator) {
    }

    public static final void onAnimationRepeat$0(AAListenerS50S0210000_11 aAListenerS50S0210000_11, Animator animator) {
    }

    public static final void onAnimationRepeat$1(AAListenerS50S0210000_11 aAListenerS50S0210000_11, Animator animator) {
    }

    public static final void onAnimationStart$1(AAListenerS50S0210000_11 aAListenerS50S0210000_11, Animator animator) {
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

    public static final void onAnimationEnd$0(AAListenerS50S0210000_11 aAListenerS50S0210000_11, Animator animator) {
        C1AV2 c1av2;
        if (!aAListenerS50S0210000_11.z2) {
            List<View> list = (List) aAListenerS50S0210000_11.l0;
            C1AV2 c1av22 = (C1AV2) aAListenerS50S0210000_11.l1;
            for (View view : list) {
                view.setTag(R.id.ekv, Integer.valueOf(view.getVisibility()));
                if (view instanceof InterfaceC20343214is) {
                    if (c1av22 == null) {
                        c1av2 = (C1AV2) C1AVH.LJIILIIL.getValue();
                    } else {
                        c1av2 = c1av22;
                    }
                    C2180521AVm.LIZ(view, EnumC2180541AVo.V_VISIBLITY, c1av2);
                }
                C786410Ut5.LJLLLLLL(8, view);
                C786410Ut5.T4(view, 1.0f);
            }
        }
    }

    public static final void onAnimationEnd$1(AAListenerS50S0210000_11 aAListenerS50S0210000_11, Animator animator) {
        Function0<Unit> function0;
        Function0 function02 = (Function0) aAListenerS50S0210000_11.l0;
        if (function02 != null) {
            function02.invoke();
        }
        if (aAListenerS50S0210000_11.z2 && (function0 = ((AbstractC705300RlY) aAListenerS50S0210000_11.l1).LJIILJJIL) != null) {
            function0.invoke();
        }
    }

    public static final void onAnimationStart$0(AAListenerS50S0210000_11 aAListenerS50S0210000_11, Animator animator) {
        if (aAListenerS50S0210000_11.z2) {
            for (View view : (List) aAListenerS50S0210000_11.l0) {
                if (Intrinsics.LJFF(view.getTag(R.id.ekv), 0)) {
                    view.setTag(R.id.ekv, null);
                    C786410Ut5.LJLLLLLL(0, view);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AAListenerS50S0210000_11(Object obj, Function0<Unit> function0, boolean z, AbstractC705300RlY<T> abstractC705300RlY) {
        this.$t = abstractC705300RlY;
        this.l0 = obj;
        this.z2 = function0;
        this.l1 = z;
    }
}
