package Y;

import X.C01GW;
import X.C098200Yq;
import X.C0RR7;
import X.C128Y;
import X.C1388190mED;
import X.C189200o6;
import X.C694320RLi;
import X.C695730RQt;
import X.C695740RQu;
import X.C714420S0q;
import X.C786410Ut5;
import X.InterfaceC214902198i;
import android.animation.Animator;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IDetailFeedSafService;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.feed.platform.ab.LowScreenOptimizeAB;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public class AAListenerS28S0301000_9 implements Animator.AnimatorListener {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public Object l2;

    public static final void onAnimationCancel$1(AAListenerS28S0301000_9 aAListenerS28S0301000_9, Animator animator) {
    }

    public static final void onAnimationCancel$2(AAListenerS28S0301000_9 aAListenerS28S0301000_9, Animator animator) {
    }

    public static final void onAnimationEnd$0(AAListenerS28S0301000_9 aAListenerS28S0301000_9, Animator animator) {
    }

    public static final void onAnimationRepeat$0(AAListenerS28S0301000_9 aAListenerS28S0301000_9, Animator animator) {
    }

    public static final void onAnimationRepeat$1(AAListenerS28S0301000_9 aAListenerS28S0301000_9, Animator animator) {
    }

    public static final void onAnimationRepeat$2(AAListenerS28S0301000_9 aAListenerS28S0301000_9, Animator animator) {
    }

    public static final void onAnimationStart$0(AAListenerS28S0301000_9 aAListenerS28S0301000_9, Animator animator) {
    }

    public static final void onAnimationStart$1(AAListenerS28S0301000_9 aAListenerS28S0301000_9, Animator animator) {
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
        }
    }

    public static final void onAnimationCancel$0(AAListenerS28S0301000_9 aAListenerS28S0301000_9, Animator animator) {
        C786410Ut5.T4((View) aAListenerS28S0301000_9.l0, 1.0f);
        C786410Ut5.LJLLLLLL(0, (View) aAListenerS28S0301000_9.l0);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) aAListenerS28S0301000_9.l1;
        if (marginLayoutParams != null) {
            marginLayoutParams.bottomMargin = aAListenerS28S0301000_9.i3;
        }
        C786410Ut5.W5((View) aAListenerS28S0301000_9.l0, (ViewGroup.MarginLayoutParams) aAListenerS28S0301000_9.l1);
        Function0 function0 = (Function0) aAListenerS28S0301000_9.l2;
        if (function0 != null) {
            function0.invoke();
        }
        if (C0RR7.LIZ() || LowScreenOptimizeAB.LJ() || C695730RQt.LIZ()) {
            C01GW c01gw = C694320RLi.LIZ;
            C695740RQu.LJ(R.id.elp, (View) aAListenerS28S0301000_9.l0, null);
        }
    }

    public static final void onAnimationEnd$1(AAListenerS28S0301000_9 aAListenerS28S0301000_9, Animator animator) {
        C786410Ut5.LJLLLLLL(0, (View) aAListenerS28S0301000_9.l0);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) aAListenerS28S0301000_9.l1;
        if (marginLayoutParams != null) {
            marginLayoutParams.bottomMargin = aAListenerS28S0301000_9.i3;
        }
        C786410Ut5.W5((View) aAListenerS28S0301000_9.l0, (ViewGroup.MarginLayoutParams) aAListenerS28S0301000_9.l1);
        Function0 function0 = (Function0) aAListenerS28S0301000_9.l2;
        if (function0 != null) {
            function0.invoke();
        }
        if (C0RR7.LIZ() || LowScreenOptimizeAB.LJ() || C695730RQt.LIZ()) {
            C01GW c01gw = C694320RLi.LIZ;
            C695740RQu.LJ(R.id.elp, (View) aAListenerS28S0301000_9.l0, null);
        }
    }

    public static final void onAnimationEnd$2(AAListenerS28S0301000_9 aAListenerS28S0301000_9, Animator animator) {
        C128Y c128yLIZLLL;
        InterfaceC214902198i interfaceC214902198i;
        boolean zIsFinishing;
        IDetailFeedSafService iDetailFeedSafService = (IDetailFeedSafService) PluggableExtentionKt.pluggableSpi$default(IDetailFeedSafService.class, false, false, false, 14, null);
        Boolean boolValueOf = null;
        if (iDetailFeedSafService != null) {
            c128yLIZLLL = iDetailFeedSafService.LIZLLL((Fragment) aAListenerS28S0301000_9.l0);
        } else {
            c128yLIZLLL = null;
        }
        if (c128yLIZLLL instanceof InterfaceC214902198i) {
            interfaceC214902198i = (InterfaceC214902198i) c128yLIZLLL;
        } else {
            interfaceC214902198i = null;
        }
        if (interfaceC214902198i != null) {
            if (!SAFExtensionKt.LJIIZILJ(interfaceC214902198i) && !interfaceC214902198i.SL()) {
                zIsFinishing = false;
            } else {
                zIsFinishing = true;
            }
        } else {
            Activity activityLIZ = C1388190mED.LIZ(((C714420S0q) aAListenerS28S0301000_9.l1).getContext());
            if (activityLIZ != null) {
                zIsFinishing = activityLIZ.isFinishing();
            }
            if (!Intrinsics.LJFF(boolValueOf, Boolean.FALSE) && ((Fragment) aAListenerS28S0301000_9.l0).getActivity() != null) {
                C714420S0q c714420S0q = (C714420S0q) aAListenerS28S0301000_9.l1;
                try {
                    c714420S0q.LJIIL();
                    c714420S0q.LLFFF(aAListenerS28S0301000_9.i3, false);
                    C189200o6.m2constructorimpl(Unit.LIZ);
                    return;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                    return;
                }
            }
        }
        boolValueOf = Boolean.valueOf(zIsFinishing);
        if (!Intrinsics.LJFF(boolValueOf, Boolean.FALSE)) {
        }
    }

    public static final void onAnimationStart$2(AAListenerS28S0301000_9 aAListenerS28S0301000_9, Animator animator) {
        ((C714420S0q) aAListenerS28S0301000_9.l2).LJFF();
    }

    public AAListenerS28S0301000_9(Object obj, Object obj2, int i, Object obj3, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.l1 = obj2;
        this.i3 = i;
        this.l2 = obj3;
    }
}
