package X;

import Y.ALAdapterS6S0300000_16;
import Y.ARunnableS113S0100000_13;
import Y.ARunnableS124S0100000_24;
import Y.AUListenerS151S0300000_16;
import Y.AsS50S0100000_24;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS140S0110000_24;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: renamed from: X.0rja, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1599840rja {
    public final C1319210kQx LIZ;
    public final C481090Itn LIZIZ;
    public final FrameLayout LIZJ;
    public final ViewGroup LIZLLL;
    public final FrameLayout LJ;
    public final C0FRT LJFF;
    public final LifecycleOwner LJI;
    public final Function0<C19EG> LJII;
    public final Function0<InterfaceC1598970riB> LJIIIIZZ;
    public final C2252321DDq LJIIIZ;
    public ValueAnimator LJIIJ;
    public C1599810rjX LJIIJJI;
    public AbstractC1599750rjR LJIIL;
    public boolean LJIILIIL;
    public ARunnableS124S0100000_24 LJIILJJIL;
    public boolean LJIILL;
    public boolean LJIILLIIL;
    public boolean LJIIZILJ;
    public C1599850rjb LJIJ;
    public C1599830rjZ LJIJI;
    public AsS50S0100000_24 LJIJJ;
    public C1599870rjd LJIJJLI;
    public C1600450rkZ LJIL;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.0rjd, X.19sM] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void LIZIZ() {
        C1598650rhf c1598650rhf;
        InterfaceC1598970riB interfaceC1598970riBInvoke = this.LJIIIIZZ.invoke();
        if (!(interfaceC1598970riBInvoke instanceof C1598650rhf) || (c1598650rhf = (C1598650rhf) interfaceC1598970riBInvoke) == null) {
            return;
        }
        C1600450rkZ c1600450rkZ = c1598650rhf.LLJJJJJIL;
        if (!(c1600450rkZ instanceof RecyclerView) || c1600450rkZ == 0) {
            return;
        }
        C1600450rkZ c1600450rkZ2 = this.LJIL;
        if (c1600450rkZ2 != c1600450rkZ || this.LJIJJ == null) {
            AsS50S0100000_24 asS50S0100000_24 = this.LJIJJ;
            if (asS50S0100000_24 != null && c1600450rkZ2 != null) {
                c1600450rkZ2.removeOnScrollListener(asS50S0100000_24);
            }
            C1599870rjd c1599870rjd = this.LJIJJLI;
            if (c1599870rjd != null && c1600450rkZ2 != null) {
                c1600450rkZ2.removeOnItemTouchListener(c1599870rjd);
            }
            this.LJIJJ = null;
            this.LJIJJLI = null;
            this.LJIL = null;
            AsS50S0100000_24 asS50S0100000_242 = new AsS50S0100000_24(this, 3);
            c1600450rkZ.addOnScrollListener(asS50S0100000_242);
            this.LJIJJ = asS50S0100000_242;
            final GestureDetector gestureDetector = new GestureDetector(c1600450rkZ.getContext(), new C21648719nx() { // from class: X.0rje
                @Override // X.C21648719nx, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
                public final boolean onSingleTapUp(MotionEvent motionEvent) {
                    C01VZ.LL.getClass();
                    C01VZ.LIZIZ();
                    return false;
                }
            });
            ?? r0 = new InterfaceC21676019sM() { // from class: X.0rjd
                @Override // X.InterfaceC21676019sM
                public final void LJIIJ(RecyclerView recyclerView, MotionEvent motionEvent) {
                }

                @Override // X.InterfaceC21676019sM
                public final void LJIIZILJ(boolean z) {
                }

                @Override // X.InterfaceC21676019sM
                public final boolean LJJIFFI(RecyclerView recyclerView, MotionEvent motionEvent) {
                    gestureDetector.onTouchEvent(motionEvent);
                    return false;
                }
            };
            c1600450rkZ.addOnItemTouchListener(r0);
            this.LJIJJLI = r0;
            this.LJIL = c1600450rkZ;
        }
    }

    public final void LIZLLL() {
        if (this.LJIILL && this.LJIIIZ.getValue() == EnumC1599860rjc.EXPANDED && !this.LJIILLIIL && this.LIZ.getScrollState() == 0) {
            this.LIZIZ.setOverScrollMode(EnumC19356710o9.ALWAYS);
            this.LJIILL = false;
        }
    }

    public final void LJ() {
        if (this.LJIILIIL && !(this.LJIIL instanceof C1599770rjT)) {
            C1598660rhg.LIZ.getClass();
            if (C1598660rhg.LJ.LIZ(4)) {
                if (C442590HXd.LIZ) {
                    if (C442590HXd.LIZIZ != null) {
                        this.LJIILIIL = false;
                        return;
                    }
                    C442590HXd.LIZIZ = "collapse_guide";
                }
                this.LJIILIIL = false;
                ARunnableS124S0100000_24 aRunnableS124S0100000_24 = new ARunnableS124S0100000_24(this, 37);
                this.LJIILJJIL = aRunnableS124S0100000_24;
                HandlerHook.viewPostDelay(this.LJ, aRunnableS124S0100000_24, ((Number) C0ALK.LIZ.getValue()).longValue());
            }
        }
    }

    public final void LJFF() {
        Object value = this.LJIIIZ.getValue();
        if (!((value == EnumC1599860rjc.COLLAPSED || value == EnumC1599860rjc.COLLAPSING || value == EnumC1599860rjc.POPUP_DISMISSING) && !(this.LJIIL instanceof C1599770rjT))) {
            if (this.LJ.getVisibility() == 0) {
                this.LJ.animate().alpha(0.0f).setDuration(200L).withEndAction(new ARunnableS113S0100000_13(this, 104)).start();
            }
        } else if (this.LJ.getVisibility() != 0) {
            C786410Ut5.U4(this.LJ, 0.0f);
            C786410Ut5.LJZ(0, this.LJ);
            this.LJ.animate().alpha(1.0f).setDuration(200L).start();
            C589910NBt c589910NBt = C589910NBt.LIZ;
            int iLIZ = C1599760rjS.LIZ(this.LJIIL);
            c589910NBt.getClass();
            C589910NBt.LIZ(iLIZ, "show");
        }
    }

    public final void LIZJ(boolean z) {
        C1598650rhf c1598650rhf;
        C1598800rhu c1598800rhu;
        final C994590bzN c994590bzN;
        InterfaceC1598970riB interfaceC1598970riBInvoke = this.LJIIIIZZ.invoke();
        if ((interfaceC1598970riBInvoke instanceof C1598650rhf) && (c1598650rhf = (C1598650rhf) interfaceC1598970riBInvoke) != null) {
            C1600450rkZ c1600450rkZ = c1598650rhf.LLJJJJJIL;
            if (!(c1600450rkZ instanceof C1600450rkZ) || c1600450rkZ == null || (c1598800rhu = c1598650rhf.LLJJL) == null || (c994590bzN = c1598650rhf.LLJJJJ) == null) {
                return;
            }
            final int iLIZIZ = C1607400rvm.LIZIZ.LJFF(EnumC1606080rte.INBOX_TOP_LIST, false).LIZLLL + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
            if (this.LJIIIZ.getValue() == EnumC1599860rjc.COLLAPSED) {
                this.LJIIIZ.setValue(EnumC1599860rjc.EXPANDING);
            }
            final AwS140S0110000_24 awS140S0110000_24 = new AwS140S0110000_24(this, z, 6);
            ValueAnimator valueAnimator = this.LJIIJ;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (c1598800rhu.LIZIZ == EnumC1599390rir.INBOX_VH) {
                ViewGroup.LayoutParams layoutParams = c1600450rkZ.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams = new FrameLayout.LayoutParams(-1, iLIZIZ);
                }
                layoutParams.height = iLIZIZ;
                C786410Ut5.s7(c1600450rkZ, layoutParams);
                final ViewGroup.LayoutParams layoutParams2 = c994590bzN.getLayoutParams();
                if (layoutParams2 == null) {
                    layoutParams2 = new ViewGroup.MarginLayoutParams(-1, 0);
                }
                layoutParams2.height = 0;
                C786410Ut5.a6(c994590bzN, layoutParams2);
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, iLIZIZ);
                valueAnimatorOfInt.addUpdateListener(new AUListenerS151S0300000_16(layoutParams2, valueAnimatorOfInt, c994590bzN, 2));
                valueAnimatorOfInt.addListener(new AnimatorListenerAdapter() { // from class: X.0bsp
                    public boolean LL;

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationCancel(Animator animator) {
                        this.LL = true;
                    }

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator) {
                        if (!this.LL) {
                            layoutParams2.height = iLIZIZ;
                            C786410Ut5.a6(c994590bzN, layoutParams2);
                        }
                        awS140S0110000_24.invoke();
                    }
                });
                valueAnimatorOfInt.setInterpolator(C1619980sG4.LJIILIIL());
                valueAnimatorOfInt.setDuration(300L);
                valueAnimatorOfInt.start();
                this.LJIIJ = valueAnimatorOfInt;
                return;
            }
            awS140S0110000_24.invoke();
        }
    }

    public final void LIZ(C1598800rhu c1598800rhu, C994590bzN c994590bzN, int i, Function0 function0) {
        ValueAnimator valueAnimator = this.LJIIJ;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (c1598800rhu.LIZIZ == EnumC1599390rir.INBOX_VH) {
            ViewGroup.LayoutParams layoutParams = c994590bzN.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new ViewGroup.MarginLayoutParams(-1, i);
            }
            int[] iArr = new int[2];
            Integer numValueOf = Integer.valueOf(layoutParams.height);
            if (numValueOf.intValue() > 0) {
                i = numValueOf.intValue();
            }
            iArr[0] = i;
            iArr[1] = 0;
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(iArr);
            valueAnimatorOfInt.addUpdateListener(new AUListenerS151S0300000_16(layoutParams, valueAnimatorOfInt, c994590bzN, 1));
            valueAnimatorOfInt.addListener(new ALAdapterS6S0300000_16(layoutParams, c994590bzN, function0, 3));
            valueAnimatorOfInt.setInterpolator(C1619980sG4.LIZLLL());
            valueAnimatorOfInt.setDuration(300L);
            valueAnimatorOfInt.start();
            this.LJIIJ = valueAnimatorOfInt;
            return;
        }
        function0.invoke();
    }

    public C1599840rja(C1319210kQx c1319210kQx, C481090Itn c481090Itn, FrameLayout frameLayout, ViewGroup viewGroup, FrameLayout frameLayout2, C0FRT c0frt, LifecycleOwner lifecycleOwner, AwS568S0100000_24 awS568S0100000_24, AwS568S0100000_24 awS568S0100000_242) {
        this.LIZ = c1319210kQx;
        this.LIZIZ = c481090Itn;
        this.LIZJ = frameLayout;
        this.LIZLLL = viewGroup;
        this.LJ = frameLayout2;
        this.LJFF = c0frt;
        this.LJI = lifecycleOwner;
        this.LJII = awS568S0100000_24;
        this.LJIIIIZZ = awS568S0100000_242;
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(EnumC1599860rjc.COLLAPSED);
        this.LJIIIZ = c2252321DDqLIZ;
        C09IC.LIZIZ(c2252321DDqLIZ);
        this.LJIIL = C1599770rjT.LIZ;
    }
}
