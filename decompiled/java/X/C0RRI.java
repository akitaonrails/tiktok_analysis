package X;

import Y.ACallableS243S0200000_11;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.ss.android.ugc.feed.platform.ab.ComponentMarginConfig;
import com.ss.android.ugc.feed.platform.ab.LowScreenOptimizeAB;
import com.ss.android.ugc.feed.platform.container.info.ConstraintSizeVM;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RRI, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RRI implements C0RPK {
    public final LinearLayout LL;
    public final C0RRN LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ;
    public boolean LLILZIL;
    public List<? extends View> LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public int LLJIJIL;
    public final int[] LLJILJIL;

    @Override // X.C0RPK
    public final void nl() {
        this.LLIZLLLIL = false;
        List<? extends View> list = this.LLILZLL;
        if (list != null) {
            Iterator it2 = ((ArrayList) list).iterator();
            while (it2.hasNext()) {
                C694320RLi.LIZ((View) it2.next(), null);
            }
        }
        this.LLILZLL = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0185  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ() {
        /*
            Method dump skipped, instruction units count: 549
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0RRI.LIZJ():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0281  */
    /* JADX WARN: Type inference failed for: r1v12, types: [T, kotlin.jvm.internal.AwS625S0100000_11] */
    /* JADX WARN: Type inference failed for: r1v3, types: [T, kotlin.jvm.internal.AwS625S0100000_11] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL() {
        /*
            Method dump skipped, instruction units count: 649
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0RRI.LIZLLL():void");
    }

    @Override // X.C0RPK
    public final void w5() {
        if (this.LLIZLLLIL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("notifyBottomBannerShow: hash=");
            sbLIZ.append(this.LL.hashCode());
            C2188811AlT.LIZIZ(sbLIZ);
            if (LIZ()) {
                LIZLLL();
            } else {
                LIZJ();
            }
        }
    }

    @Override // X.C0RPK
    public final void wF() {
        if (!this.LLIZLLLIL || this.LLILZIL) {
            return;
        }
        this.LLILZIL = true;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("triggerUnifiedSpacing: hash=");
        sbLIZ.append(this.LL.hashCode());
        C2188811AlT.LIZIZ(sbLIZ);
        if (LIZ()) {
            LIZLLL();
        } else {
            LIZJ();
        }
    }

    public final boolean LIZ() {
        return (!LowScreenOptimizeAB.LJ() || this.LLIZ || this.LLJ) ? false : true;
    }

    public final boolean LIZIZ(View view) {
        if (view.getId() != R.id.elx && view.getId() != R.id.els) {
            if (view.getId() != R.id.elt || !this.LLJ) {
                if (view.getId() == R.id.emp && this.LLJ) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // X.C0RPK
    public final void SC(boolean z) {
        this.LLIZ = z;
    }

    @Override // X.C0RPK
    public final void oC(boolean z) {
        this.LLJ = z;
    }

    @Override // X.C0RPK
    public final void qe(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setEnableUnifiedSpacing: enable=");
        sbLIZ.append(z);
        sbLIZ.append(" hash=");
        sbLIZ.append(this.LL.hashCode());
        C2188811AlT.LIZIZ(sbLIZ);
        this.LLIZLLLIL = z;
        this.LLILZLL = null;
        this.LLILZIL = false;
    }

    public C0RRI(LinearLayout linearLayout, C0RRN c0rrn) {
        this.LL = linearLayout;
        this.LLILLJJLI = c0rrn;
        C01GW<Integer> c01gw = ConstraintSizeVM.LL;
        this.LLILLL = ConstraintSizeVM.LLILLL.getValue().intValue();
        C01GW c01gw2 = C694320RLi.LIZ;
        this.LLILZ = C694320RLi.LIZJ;
        this.LLJIJIL = -1;
        this.LLJILJIL = new int[2];
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJFF(final View view, ComponentMarginConfig componentMarginConfig, final List list) {
        final C259800zU c259800zU = new C259800zU();
        c259800zU.element = componentMarginConfig;
        final C013C c013c = new C013C();
        if (!this.LLIZ && Intrinsics.LJFF(C695740RQu.LIZLLL(R.id.elu, view), Boolean.TRUE)) {
            c013c.element = true;
        }
        ((ArrayList) list).add(new Callable() { // from class: X.0RRK
            public final /* synthetic */ String LLILLL = "unifyFeedComponentsMargins";

            @Override // java.util.concurrent.Callable
            public final Object call() {
                Boolean boolValueOf;
                C1C7U.LIZ("FeedInteractInfoAreaOnLayoutChangeListener@8a52.updateViewMargins$1");
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("update: hash=");
                sbLIZ.append(this.LL.LL.hashCode());
                sbLIZ.append(" task=");
                sbLIZ.append(list.hashCode());
                sbLIZ.append(", invoke:");
                sbLIZ.append(this.LLILLL);
                sbLIZ.append(" view=");
                sbLIZ.append(view.hashCode());
                sbLIZ.append(", cm=");
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                sbLIZ.append(marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0);
                sbLIZ.append(", tm=");
                sbLIZ.append(c259800zU.element);
                C2188811AlT.LIZIZ(sbLIZ);
                if (c013c.element) {
                    this.LL.LLILLJJLI.ln(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c259800zU.element.bottomGap))), view);
                    boolValueOf = Boolean.TRUE;
                } else {
                    C01GW c01gw = C694320RLi.LIZ;
                    boolValueOf = Boolean.valueOf(C694320RLi.LIZJ(view, c259800zU.element, false));
                }
                C1C7U.LIZIZ("FeedInteractInfoAreaOnLayoutChangeListener@8a52.updateViewMargins$1");
                return boolValueOf;
            }
        });
    }

    public final void LJ(final int i, View view, final String str, final List list) {
        final View viewFindViewById;
        final int i2;
        if (view.getId() == R.id.elx) {
            viewFindViewById = view.findViewById(R.id.ekp);
            if (viewFindViewById == null) {
                return;
            }
        } else {
            viewFindViewById = view;
        }
        if (view.getId() == R.id.elm) {
            i2 = i - ConstraintSizeVM.LLIZ;
        } else {
            i2 = i;
        }
        if (viewFindViewById.getId() == R.id.els) {
            ((ArrayList) list).add(new ACallableS243S0200000_11(this, viewFindViewById, i2, 2));
        } else if (Intrinsics.LJFF(C695740RQu.LIZLLL(R.id.elu, viewFindViewById), Boolean.TRUE)) {
            ((ArrayList) list).add(new Callable() { // from class: X.0RRM
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    C1C7U.LIZ("FeedInteractInfoAreaOnLayoutChangeListener@8a52.updateViewBottomMargin$2");
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("update: hash=");
                    sbLIZ.append(this.LL.LL.hashCode());
                    sbLIZ.append(" task=");
                    sbLIZ.append(list.hashCode());
                    sbLIZ.append(", notify musicTitle change margin, realMargin:");
                    sbLIZ.append(i2);
                    C2188811AlT.LIZIZ(sbLIZ);
                    Boolean boolValueOf = Boolean.valueOf(this.LL.LLILLJJLI.ln(i2, viewFindViewById));
                    C1C7U.LIZIZ("FeedInteractInfoAreaOnLayoutChangeListener@8a52.updateViewBottomMargin$2");
                    return boolValueOf;
                }
            });
        } else {
            ((ArrayList) list).add(new Callable() { // from class: X.0RRL
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    C1C7U.LIZ("FeedInteractInfoAreaOnLayoutChangeListener@8a52.updateViewBottomMargin$3");
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("update: hash=");
                    sbLIZ.append(this.LL.LL.hashCode());
                    sbLIZ.append(" task=");
                    sbLIZ.append(list.hashCode());
                    sbLIZ.append(", invoke:");
                    sbLIZ.append(str);
                    sbLIZ.append(" view=");
                    sbLIZ.append(viewFindViewById.hashCode());
                    sbLIZ.append(", cm=");
                    ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                    sbLIZ.append(marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0);
                    sbLIZ.append(", tm=");
                    sbLIZ.append(i);
                    sbLIZ.append(", rm=");
                    sbLIZ.append(i2);
                    C2188811AlT.LIZIZ(sbLIZ);
                    C01GW c01gw = C694320RLi.LIZ;
                    Boolean boolValueOf = Boolean.valueOf(C694320RLi.LIZIZ(i2, viewFindViewById, false));
                    C1C7U.LIZIZ("FeedInteractInfoAreaOnLayoutChangeListener@8a52.updateViewBottomMargin$3");
                    return boolValueOf;
                }
            });
        }
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        View view2;
        View view3;
        if (LIZ()) {
            LIZLLL();
        } else {
            LIZJ();
        }
        C589800NBi.LIZ.getClass();
        if (C589800NBi.LIZIZ() && !this.LLJI) {
            this.LLJI = true;
            Object parent = this.LL.getParent();
            Object parent2 = null;
            if ((parent instanceof View) && (view3 = (View) parent) != null) {
                parent2 = view3.getParent();
            }
            if (!(parent2 instanceof View) || (view2 = (View) parent2) == null) {
                Object parent3 = this.LL.getParent();
                if (!(parent3 instanceof View) || (view2 = (View) parent3) == null) {
                    view2 = this.LL;
                }
            }
            view2.postOnAnimation(new Runnable() { // from class: X.0RRJ
                public final void LIZ() {
                    if (!this.LL.LL.isAttachedToWindow()) {
                        this.LL.LLJI = false;
                        return;
                    }
                    C0RRI c0rri = this.LL;
                    c0rri.LL.getLocationOnScreen(c0rri.LLJILJIL);
                    C0RRI c0rri2 = this.LL;
                    int i9 = c0rri2.LLJILJIL[1];
                    if (i9 != c0rri2.LLJIJIL && i9 > 0) {
                        c0rri2.LLJIJIL = i9;
                        c0rri2.LLILLJJLI.pf();
                    }
                    this.LL.LLJI = false;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("FeedInteractInfoAreaOnLayoutChangeListener@8a52.onLayoutChange$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("FeedInteractInfoAreaOnLayoutChangeListener@8a52.onLayoutChange$1");
                }
            });
        }
    }
}
