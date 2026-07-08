package X;

import Y.AUListenerS256S0100000_6;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bsc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C990400bsc extends AbstractC998040c4w<AbstractC986700bme, AbstractC989020bqO> {
    public final View LIZLLL;
    public final View LJ;
    public final View LJFF;
    public ValueAnimator LJI;

    @Override // X.AbstractC998040c4w
    public final void LIZIZ(AbstractC989020bqO abstractC989020bqO, AbstractC989020bqO abstractC989020bqO2) {
        Object c098200Yq;
        Object c098200Yq2;
        Object c098200Yq3;
        AbstractC989020bqO abstractC989020bqO3 = abstractC989020bqO2;
        try {
            ValueAnimator valueAnimator = this.LJI;
            this.LJI = null;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C20441214yg.LJFF("StreakRenderer", "cancelInFlight failed", thM5exceptionOrNullimpl);
        }
        try {
            C786410Ut5.LJLLLLLL(8, this.LIZLLL);
            C786410Ut5.LJLLLLLL(8, this.LJ);
            C786410Ut5.LJLLLLLL(8, this.LJFF);
            c098200Yq2 = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq2);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq2 = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq2);
        }
        Throwable thM5exceptionOrNullimpl2 = C189200o6.m5exceptionOrNullimpl(c098200Yq2);
        if (thM5exceptionOrNullimpl2 != null) {
            C20441214yg.LJFF("StreakRenderer", "snapAllGone failed", thM5exceptionOrNullimpl2);
        }
        try {
            if (!Intrinsics.LJFF(abstractC989020bqO3, C989030bqP.LIZ)) {
                long j = 200;
                if (abstractC989020bqO3 instanceof C989000bqM) {
                    LJ(200L, this.LJFF, ((C989000bqM) abstractC989020bqO3).LIZ);
                } else if (abstractC989020bqO3 instanceof C989010bqN) {
                    if (abstractC989020bqO instanceof C989010bqN) {
                        j = 0;
                    }
                    LJ(j, this.LIZLLL, ((C989010bqN) abstractC989020bqO3).LIZ);
                } else if (abstractC989020bqO3 instanceof C989040bqQ) {
                    if (abstractC989020bqO instanceof C989040bqQ) {
                        j = 0;
                    }
                    LJ(j, this.LJ, null);
                } else {
                    throw new C1954807lC();
                }
            }
            c098200Yq3 = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq3);
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
            c098200Yq3 = new C098200Yq(th3);
            C189200o6.m2constructorimpl(c098200Yq3);
        }
        Throwable thM5exceptionOrNullimpl3 = C189200o6.m5exceptionOrNullimpl(c098200Yq3);
        if (thM5exceptionOrNullimpl3 != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("animateIn failed for ");
            sbLIZ.append(abstractC989020bqO3);
            C20441214yg.LJFF("StreakRenderer", C2188811AlT.LIZIZ(sbLIZ), thM5exceptionOrNullimpl3);
        }
    }

    public final void LJ(long j, final View view, final Function0 function0) {
        final ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.LJI = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS256S0100000_6(view, 82));
        valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: X.0bsd
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                C990400bsc c990400bsc = this;
                if (c990400bsc.LJI != valueAnimatorOfFloat) {
                    return;
                }
                c990400bsc.LJI = null;
                Function0<Unit> function02 = function0;
                if (function02 != null) {
                    function02.invoke();
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                super.onAnimationStart(animator);
                C786410Ut5.T4(view, 0.0f);
                C786410Ut5.LJLLLLLL(0, view);
            }
        });
        valueAnimatorOfFloat.setDuration(j);
        valueAnimatorOfFloat.start();
    }

    public C990400bsc(C1121720fIQ c1121720fIQ, View view, C973130bQl c973130bQl, final AwS559S0100000_15 awS559S0100000_15) {
        super(C989030bqP.LIZ, new InterfaceC998030c4v<AbstractC986700bme, AbstractC989020bqO>(awS559S0100000_15) { // from class: X.0c4t
            public final Function0<Long> LIZ;
            public AbstractC986700bme LIZIZ = C986710bmf.LIZIZ;

            @Override // X.InterfaceC998030c4v
            public final /* bridge */ /* synthetic */ AbstractC986700bme getState() {
                return this.LIZIZ;
            }

            {
                this.LIZ = awS559S0100000_15;
            }

            @Override // X.InterfaceC998030c4v
            public final boolean LIZ(AbstractC986700bme abstractC986700bme) {
                return C998020c4u.LIZ(this, abstractC986700bme);
            }

            @Override // X.InterfaceC998030c4v
            public final void LIZIZ(AbstractC986700bme abstractC986700bme) {
                this.LIZIZ = abstractC986700bme;
            }

            @Override // X.InterfaceC998030c4v
            public final AbstractC989020bqO apply(AbstractC989020bqO abstractC989020bqO) {
                if (this.LIZIZ instanceof C986690bmd) {
                    long jLongValue = this.LIZ.invoke().longValue();
                    Long lLJII = C930540aK4.LJII();
                    if (lLJII == null || jLongValue != lLJII.longValue() || jLongValue != ((C986690bmd) this.LIZIZ).LIZIZ) {
                        return C989030bqP.LIZ;
                    }
                }
                return abstractC989020bqO;
            }
        });
        this.LIZLLL = c1121720fIQ;
        this.LJ = view;
        this.LJFF = c973130bQl;
    }
}
