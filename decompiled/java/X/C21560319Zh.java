package X;

import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedList;

/* JADX INFO: renamed from: X.19Zh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21560319Zh implements InterfaceC21560619Zk, InterfaceC21560719Zl, ValueAnimator.AnimatorUpdateListener {
    public View LL;
    public final View LLILLJJLI;
    public View LLILLL;
    public View LLILZ;
    public View LLILZIL;
    public int LLILZLL;
    public boolean LLIZ = true;
    public boolean LLIZLLLIL = true;
    public C21560419Zi LLJ = new C21560419Zi();

    @Override // X.InterfaceC21560619Zk
    public boolean LIZ() {
        return this.LLIZ && this.LLJ.LIZIZ(this.LL);
    }

    public final void LJI() {
        this.LLJ.LIZIZ = null;
    }

    @Override // X.InterfaceC21560619Zk
    public boolean LJJJJI() {
        return this.LLIZLLLIL && this.LLJ.LIZ(this.LL);
    }

    public C21560319Zh(View view) {
        this.LLILLL = view;
        this.LLILLJJLI = view;
        this.LL = view;
    }

    @Override // X.InterfaceC21560619Zk
    public void LIZIZ(MotionEvent motionEvent) {
        PointF pointF = new PointF(motionEvent.getX(), motionEvent.getY());
        pointF.offset(-this.LL.getLeft(), -this.LL.getTop());
        View view = this.LLILLL;
        View view2 = this.LL;
        if (view != view2) {
            this.LLILLL = LIZJ(pointF, view2, view);
        }
        if (this.LLILLL == this.LL) {
            this.LLJ.LIZ = null;
        } else {
            this.LLJ.LIZ = pointF;
        }
    }

    public final C21560319Zh LJFF(int i) {
        View view = this.LLILLL;
        if (view != null && i != 0) {
            if (i < 0) {
                float f = C19ZZ.LIZIZ;
                if (!view.canScrollVertically(1)) {
                    return null;
                }
            } else {
                View view2 = this.LLILLL;
                float f2 = C19ZZ.LIZIZ;
                if (!view2.canScrollVertically(-1)) {
                    return null;
                }
            }
            this.LLILZLL = i;
            return this;
        }
        return null;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        try {
            float scaleY = (iIntValue - this.LLILZLL) * this.LLILLL.getScaleY();
            View view = this.LLILLL;
            if (view instanceof AbsListView) {
                float f = C19ZZ.LIZIZ;
                ((AbsListView) view).scrollListBy((int) scaleY);
            } else {
                view.scrollBy(0, (int) scaleY);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        this.LLILZLL = iIntValue;
    }

    public static View LIZJ(PointF pointF, View view, View view2) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            PointF pointF2 = new PointF();
            while (childCount > 0) {
                childCount--;
                View childAt = viewGroup.getChildAt(childCount);
                if (C19ZZ.LJ(viewGroup, childAt, pointF.x, pointF.y, pointF2)) {
                    if ((childAt instanceof ViewPager) || !C19ZZ.LIZLLL(childAt)) {
                        pointF.offset(pointF2.x, pointF2.y);
                        View viewLIZJ = LIZJ(pointF, childAt, view2);
                        pointF.offset(-pointF2.x, -pointF2.y);
                        return viewLIZJ;
                    }
                    return childAt;
                }
            }
        }
        return view2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(int r7, int r8, int r9) {
        /*
            r6 = this;
            r4 = 0
            r2 = 0
            r5 = -1
            if (r8 == r5) goto L61
            android.view.View r0 = r6.LLILLJJLI
            android.view.View r1 = r0.findViewById(r8)
            if (r1 == 0) goto L61
            if (r7 <= 0) goto L56
            float r0 = (float) r7
            X.C786410Ut5.ed(r1, r0)
            r3 = 1
        L14:
            if (r9 == r5) goto L4d
            android.view.View r0 = r6.LLILLJJLI
            android.view.View r1 = r0.findViewById(r9)
            if (r1 == 0) goto L4d
            if (r7 >= 0) goto L42
            float r0 = (float) r7
            X.C786410Ut5.ed(r1, r0)
        L24:
            android.view.View r0 = r6.LLILLJJLI
            X.C786410Ut5.ed(r0, r4)
        L29:
            android.view.View r1 = r6.LLILZ
            if (r1 == 0) goto L35
            int r0 = java.lang.Math.max(r2, r7)
            float r0 = (float) r0
            X.C786410Ut5.ed(r1, r0)
        L35:
            android.view.View r1 = r6.LLILZIL
            if (r1 == 0) goto L41
            int r0 = java.lang.Math.min(r2, r7)
            float r0 = (float) r0
            X.C786410Ut5.ed(r1, r0)
        L41:
            return
        L42:
            float r0 = r1.getTranslationY()
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 >= 0) goto L4d
            X.C786410Ut5.ed(r1, r4)
        L4d:
            if (r3 != 0) goto L24
            android.view.View r1 = r6.LLILLJJLI
            float r0 = (float) r7
            X.C786410Ut5.ed(r1, r0)
            goto L29
        L56:
            float r0 = r1.getTranslationY()
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 <= 0) goto L61
            X.C786410Ut5.ed(r1, r4)
        L61:
            r3 = 0
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21560319Zh.LIZLLL(int, int, int):void");
    }

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
    public final void LJII(C21577019cO c21577019cO, View view, View view2) {
        boolean z;
        View view3 = this.LL;
        boolean zIsInEditMode = view3.isInEditMode();
        View view4 = null;
        while (true) {
            if (view4 != null) {
                if (!(view4 instanceof InterfaceC1318530kPr) || (view4 instanceof InterfaceC1338650kwJ)) {
                    break;
                } else {
                    z = false;
                }
            } else {
                z = true;
            }
            LinkedList linkedList = new LinkedList();
            linkedList.add(view3);
            View view5 = null;
            while (true) {
                if (linkedList.size() > 0) {
                    if (view5 != null) {
                        break;
                    }
                    View view6 = (View) linkedList.poll();
                    if (view6 != null) {
                        if ((z || view6 != view3) && C19ZZ.LIZLLL(view6)) {
                            view5 = view6;
                        } else if (view6 instanceof ViewGroup) {
                            ViewGroup viewGroup = (ViewGroup) view6;
                            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                                linkedList.add(viewGroup.getChildAt(i));
                            }
                        }
                    }
                } else if (view5 == null) {
                    view5 = view3;
                }
            }
            if (view5 == view4) {
                break;
            }
            if (!zIsInEditMode) {
                try {
                    if (view5 instanceof C16G0) {
                        c21577019cO.LIZ.setNestedScrollingEnabled(false);
                        ViewGroup viewGroup2 = (ViewGroup) view5;
                        int childCount = viewGroup2.getChildCount();
                        while (true) {
                            childCount--;
                            if (childCount >= 0) {
                                View childAt = viewGroup2.getChildAt(childCount);
                                if (childAt instanceof C16GX) {
                                    ((C16GX) childAt).LIZ(new InterfaceC1324370kZH() { // from class: X.19Zj
                                        @Override // X.InterfaceC1324380kZI
                                        public final void LLZZJLIL(C16GX c16gx, int i2) {
                                            boolean z2;
                                            InterfaceC21560719Zl interfaceC21560719Zl = this;
                                            boolean z3 = true;
                                            if (i2 >= 0) {
                                                z2 = true;
                                            } else {
                                                z2 = false;
                                            }
                                            if (c16gx.getTotalScrollRange() + i2 > 0) {
                                                z3 = false;
                                            }
                                            C21560319Zh c21560319Zh = (C21560319Zh) interfaceC21560719Zl;
                                            c21560319Zh.LLIZ = z2;
                                            c21560319Zh.LLIZLLLIL = z3;
                                        }
                                    });
                                }
                            }
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
            view3 = view5;
            view4 = view5;
        }
        this.LLILLL = view4;
        if (view != null || view2 != null) {
            this.LLILZ = view;
            this.LLILZIL = view2;
            FrameLayout frameLayout = new FrameLayout(this.LL.getContext());
            C21576919cN c21576919cN = c21577019cO.LIZ;
            c21576919cN.getLayout();
            int iIndexOfChild = c21576919cN.indexOfChild(this.LL);
            C21576919cN c21576919cN2 = c21577019cO.LIZ;
            c21576919cN2.getLayout();
            C786410Ut5.LJJJLZIJ(this.LL, c21576919cN2);
            frameLayout.addView(this.LL, 0, new ViewGroup.LayoutParams(-1, -1));
            ViewGroup.LayoutParams layoutParams = this.LL.getLayoutParams();
            C21576919cN c21576919cN3 = c21577019cO.LIZ;
            c21576919cN3.getLayout();
            c21576919cN3.addView(frameLayout, iIndexOfChild, layoutParams);
            this.LL = frameLayout;
            if (view != null) {
                view.setTag("fixed-top");
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                ViewGroup viewGroup3 = (ViewGroup) view.getParent();
                int iIndexOfChild2 = viewGroup3.indexOfChild(view);
                C786410Ut5.LJJJLZIJ(view, viewGroup3);
                layoutParams2.height = C19ZZ.LJFF(view);
                viewGroup3.addView(new C1100300ejs(this.LL.getContext(), null), iIndexOfChild2, layoutParams2);
                frameLayout.addView(view, 1, layoutParams2);
            }
            if (view2 != null) {
                view2.setTag("fixed-bottom");
                ViewGroup.LayoutParams layoutParams3 = view2.getLayoutParams();
                ViewGroup viewGroup4 = (ViewGroup) view2.getParent();
                int iIndexOfChild3 = viewGroup4.indexOfChild(view2);
                C786410Ut5.LJJJLZIJ(view2, viewGroup4);
                FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(layoutParams3);
                layoutParams3.height = C19ZZ.LJFF(view2);
                viewGroup4.addView(new C1100300ejs(this.LL.getContext(), null), iIndexOfChild3, layoutParams3);
                layoutParams4.gravity = 80;
                frameLayout.addView(view2, 1, layoutParams4);
            }
        }
    }
}
