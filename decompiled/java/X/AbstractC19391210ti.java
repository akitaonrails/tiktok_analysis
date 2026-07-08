package X;

import Y.ALAdapterS23S0200000_29;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.ViewGroup;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.10ti, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public abstract class AbstractC19391210ti {
    public static final float LJIIZILJ;
    public static final int LJIJ;
    public final Context LIZ;
    public final WindowManager LIZIZ;
    public C19386110st LIZJ;
    public final Rect LIZLLL;
    public final Rect LJ;
    public C19391510tl LJFF;
    public final List<InterfaceC19391310tj> LJI;
    public final C19392910tz LJII;
    public final Point LJIIIIZZ;
    public boolean LJIIIZ;
    public int LJIIJ;
    public int LJIIJJI;
    public int LJIIL;
    public int LJIILIIL;
    public float LJIILJJIL;
    public final CopyOnWriteArraySet<Animator> LJIILL;
    public final C01GW LJIILLIIL;

    public final void LIZ() {
        WindowManager.LayoutParams layoutParams;
        Iterator<Animator> it2 = this.LJIILL.iterator();
        while (it2.hasNext()) {
            it2.next().cancel();
        }
        C19391510tl c19391510tl = this.LJFF;
        ViewGroup.LayoutParams layoutParams2 = c19391510tl != null ? c19391510tl.getLayoutParams() : null;
        if (!(layoutParams2 instanceof WindowManager.LayoutParams) || (layoutParams = (WindowManager.LayoutParams) layoutParams2) == null) {
            return;
        }
        final int i = layoutParams.width;
        final int i2 = layoutParams.height;
        C19386110st c19386110st = this.LIZJ;
        if (c19386110st == null) {
            c19386110st = null;
        }
        int iLIZJ = c19386110st.LIZJ();
        C19386110st c19386110st2 = this.LIZJ;
        int iLIZ = (c19386110st2 != null ? c19386110st2 : null).LIZ();
        if (iLIZ == i2 && iLIZJ == i) {
            return;
        }
        final int i3 = iLIZJ - i;
        final int i4 = iLIZ - i2;
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
        final boolean z = this.LJIIIIZZ.x + (i / 2) > this.LJIIJ / 2;
        duration.setInterpolator(C1619980sG4.LIZLLL());
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.10th
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                WindowManager.LayoutParams layoutParams3;
                this.LL.LIZJ(valueAnimator);
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                AbstractC19391210ti abstractC19391210ti = this.LL;
                int i5 = (int) (i + (i3 * fFloatValue));
                int i6 = (int) (i2 + (i4 * fFloatValue));
                boolean z2 = z;
                C19391510tl c19391510tl2 = abstractC19391210ti.LJFF;
                ViewGroup.LayoutParams layoutParams4 = null;
                if (c19391510tl2 != null) {
                    layoutParams4 = c19391510tl2.getLayoutParams();
                }
                if ((layoutParams4 instanceof WindowManager.LayoutParams) && (layoutParams3 = (WindowManager.LayoutParams) layoutParams4) != null) {
                    layoutParams3.width = i5;
                    layoutParams3.height = i6;
                    abstractC19391210ti.LJIIIIZZ(i5, i6);
                    int i7 = layoutParams3.y;
                    Rect rect = abstractC19391210ti.LIZLLL;
                    layoutParams3.y = C419990GdR.LIZIZ(i7, rect.top, rect.bottom);
                    if (z2) {
                        layoutParams3.x = (abstractC19391210ti.LJIIJ - AbstractC19391210ti.LJIJ) - i5;
                    }
                    abstractC19391210ti.LIZIZ.updateViewLayout(abstractC19391210ti.LJFF, layoutParams3);
                    abstractC19391210ti.LJIIIIZZ.set(layoutParams3.x, layoutParams3.y);
                    int i8 = abstractC19391210ti.LJIIJJI;
                    int i9 = abstractC19391210ti.LJIIL;
                    abstractC19391210ti.LJIILJJIL = (abstractC19391210ti.LJIIIIZZ.y - i9) / ((i8 - i9) - abstractC19391210ti.LJIILIIL);
                }
            }
        });
        duration.addListener(new ALAdapterS23S0200000_29(this, duration, 22));
        duration.start();
    }

    public abstract void LIZJ(ValueAnimator valueAnimator);

    public abstract void LIZLLL(String str);

    public abstract C19386210su LJ();

    static {
        C814420VxA.LIZIZ(C418440Gaw.LIZIZ(352));
        C814420VxA.LIZIZ(C418440Gaw.LIZIZ(220));
        C814420VxA.LIZIZ(C418440Gaw.LIZIZ(180));
        LJIIZILJ = 0.5625f;
        LJIJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
    }

    public void LIZIZ() {
        Iterator it2 = ((ArrayList) this.LJI).iterator();
        while (it2.hasNext()) {
            ((InterfaceC19391310tj) it2.next()).LIZ();
        }
        C19391510tl c19391510tl = this.LJFF;
        if (c19391510tl == null) {
            return;
        }
        this.LIZIZ.removeViewImmediate(c19391510tl);
        this.LJFF = null;
        ((ArrayList) C2434009gI.LIZIZ).clear();
        C844470XAv.LIZ.getClass();
        C786410Ut5.LJJIFFI(C844470XAv.LIZ(), (BroadcastReceiver) C2434009gI.LIZ.getValue());
        LJFF().LJIIJJI(AFwS218S0000000_29.get$arr$(452));
    }

    public final AbstractC1604130rqV LJFF() {
        return (AbstractC1604130rqV) this.LJIILLIIL.getValue();
    }

    public AbstractC19391210ti(Context context) {
        this.LIZ = context;
        this.LIZIZ = (WindowManager) C786410Ut5.H2(context, "window");
        new C19386210su(LJIIZILJ, true, C19384810sg.LIZIZ(EnumC19384410sc.DEFAULT));
        this.LIZLLL = new Rect();
        this.LJ = new Rect();
        this.LJI = new ArrayList();
        this.LJII = new C19392910tz(this);
        this.LJIIIIZZ = new Point();
        this.LJIIJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(C1389340mG4.LJ())));
        this.LJIIJJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(C1389340mG4.LIZLLL())));
        this.LJIIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(C497270Jen.LIZ(0))));
        this.LJIILL = new CopyOnWriteArraySet<>();
        this.LJIILLIIL = C587650N3b.LIZ("pipWnd");
    }

    public final void LJI(Point point) {
        WindowManager.LayoutParams layoutParams;
        C19391510tl c19391510tl = this.LJFF;
        if (c19391510tl == null) {
            return;
        }
        C19386110st c19386110st = this.LIZJ;
        if (c19386110st == null) {
            c19386110st = null;
        }
        c19386110st.LIZJ();
        C19386110st c19386110st2 = this.LIZJ;
        if (c19386110st2 == null) {
            c19386110st2 = null;
        }
        c19386110st2.LIZ();
        int i = point.x;
        Rect rect = this.LJ;
        point.x = C419990GdR.LIZIZ(i, rect.left, rect.right);
        int i2 = point.y;
        Rect rect2 = this.LJ;
        point.y = C419990GdR.LIZIZ(i2, rect2.top, rect2.bottom);
        if (Intrinsics.LJFF(point, this.LJIIIIZZ)) {
            return;
        }
        ViewGroup.LayoutParams layoutParams2 = c19391510tl.getLayoutParams();
        if ((layoutParams2 instanceof WindowManager.LayoutParams) && (layoutParams = (WindowManager.LayoutParams) layoutParams2) != null) {
            layoutParams.x = point.x;
            layoutParams.y = point.y;
            this.LIZIZ.updateViewLayout(this.LJFF, layoutParams);
            this.LJIIIIZZ.set(layoutParams.x, layoutParams.y);
            int i3 = this.LJIIJJI;
            int i4 = this.LJIIL;
            this.LJIILJJIL = (this.LJIIIIZZ.y - i4) / ((i3 - i4) - this.LJIILIIL);
        }
    }

    public void LJII(C19386110st c19386110st) {
        ViewGroup.LayoutParams layoutParams;
        WindowManager.LayoutParams layoutParams2;
        int i;
        AbstractC1604130rqV abstractC1604130rqVLJFF = LJFF();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[setWindowSizeDirectly] ");
        sbLIZ.append(c19386110st);
        abstractC1604130rqVLJFF.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
        this.LIZJ = c19386110st;
        int iLIZJ = c19386110st.LIZJ();
        C19386110st c19386110st2 = this.LIZJ;
        C19386110st c19386110st3 = null;
        if (c19386110st2 == null) {
            c19386110st2 = null;
        }
        LJIIIIZZ(iLIZJ, c19386110st2.LIZ());
        C19391510tl c19391510tl = this.LJFF;
        if (c19391510tl != null) {
            layoutParams = c19391510tl.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if ((layoutParams instanceof WindowManager.LayoutParams) && (layoutParams2 = (WindowManager.LayoutParams) layoutParams) != null) {
            float f = this.LJIILJJIL;
            int i2 = this.LJIIJJI;
            int i3 = ((int) (f * ((i2 - r1) - this.LJIILIIL))) + this.LJIIL;
            Rect rect = this.LIZLLL;
            int iLIZIZ = C419990GdR.LIZIZ(i3, rect.top, rect.bottom);
            if (this.LJIIIZ) {
                i = this.LIZLLL.left;
            } else {
                i = this.LIZLLL.right;
            }
            layoutParams2.x = i;
            layoutParams2.y = iLIZIZ;
            C19386110st c19386110st4 = this.LIZJ;
            if (c19386110st4 == null) {
                c19386110st4 = null;
            }
            layoutParams2.height = c19386110st4.LIZ();
            C19386110st c19386110st5 = this.LIZJ;
            if (c19386110st5 != null) {
                c19386110st3 = c19386110st5;
            }
            layoutParams2.width = c19386110st3.LIZJ();
            AbstractC1604130rqV abstractC1604130rqVLJFF2 = LJFF();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("[restoreWindowPosition] origin (");
            sbLIZ2.append(layoutParams2.x);
            sbLIZ2.append(", ");
            sbLIZ2.append(layoutParams2.y);
            sbLIZ2.append("), size (");
            sbLIZ2.append(layoutParams2.height);
            sbLIZ2.append(", ");
            sbLIZ2.append(layoutParams2.width);
            sbLIZ2.append(") bound ");
            sbLIZ2.append(this.LIZLLL);
            sbLIZ2.append(", yParam: ");
            sbLIZ2.append(this.LJIILJJIL);
            abstractC1604130rqVLJFF2.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ2));
            this.LIZIZ.updateViewLayout(this.LJFF, layoutParams2);
            this.LJIIIIZZ.set(layoutParams2.x, layoutParams2.y);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIZ(kotlin.jvm.functions.Function0<kotlin.Unit> r10) {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC19391210ti.LJIIIZ(kotlin.jvm.functions.Function0):void");
    }

    public final void LJIIIIZZ(int i, int i2) {
        int i3 = this.LJIIJ;
        int i4 = this.LJIIJJI;
        Rect rect = this.LIZLLL;
        int i5 = LJIJ;
        rect.set(i5, 0, (i3 - i) - i5, (((i4 - i2) - this.LJIILIIL) - this.LJIIL) - i5);
        Rect rect2 = this.LJ;
        Rect rect3 = this.LIZLLL;
        rect2.set(rect3.left - i, rect3.top, rect3.right + i, rect3.bottom);
    }
}
