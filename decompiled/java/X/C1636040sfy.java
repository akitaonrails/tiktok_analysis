package X;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0sfy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1636040sfy {
    public final ViewGroup LIZ;
    public final View LIZIZ;
    public final View LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final C194551119p LJFF;
    public final C11RK LJI;
    public EnumC1641570sot LJII;
    public EnumC994440bz8 LJIIIIZZ;
    public boolean LJIIIZ;

    public final void LIZ() {
        EnumC994440bz8 enumC994440bz8 = this.LJIIIIZZ;
        if (enumC994440bz8 == EnumC994440bz8.LLILLJJLI) {
            if (this.LJ && this.LJIIIZ) {
                LJFF();
            } else {
                LJ();
            }
        } else if (enumC994440bz8 == EnumC994440bz8.LLILLL) {
            LIZIZ();
        }
        this.LJIIIIZZ = EnumC994440bz8.LL;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [X.0siD, X.119p] */
    public final void LIZIZ() {
        if (this.LJFF == null) {
            LIZJ();
            return;
        }
        int iOrdinal = this.LJII.ordinal();
        if (iOrdinal == 0) {
            this.LJIIIIZZ = EnumC994440bz8.LLILLL;
            return;
        }
        if (iOrdinal == 2 || iOrdinal == 3) {
            this.LJIIIIZZ = EnumC994440bz8.LL;
            return;
        }
        this.LJII = EnumC1641570sot.LLILLL;
        this.LJFF.LJFF(new C19510311Uv());
        if (this.LIZLLL) {
            this.LJI.onNext(EnumC1159860gHw.HIDDEN);
        }
    }

    public final void LIZJ() {
        this.LJII = EnumC1641570sot.LLILZ;
        C786410Ut5.LJLLLLLL(8, this.LIZIZ);
        this.LJI.onNext(EnumC1159860gHw.PRE_HIDE);
        this.LJI.onNext(EnumC1159860gHw.HIDDEN);
    }

    public final C19475711Hn LIZLLL() {
        C11RK c11rk = this.LJI;
        c11rk.getClass();
        return new C19475711Hn(c11rk);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [X.0siD, X.119p] */
    public final void LJ() {
        if (this.LJFF == null) {
            LJFF();
            return;
        }
        int iOrdinal = this.LJII.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            this.LJIIIIZZ = EnumC994440bz8.LL;
        } else {
            if (iOrdinal == 2) {
                this.LJIIIIZZ = EnumC994440bz8.LLILLJJLI;
                return;
            }
            this.LJIIIZ = false;
            this.LJII = EnumC1641570sot.LL;
            this.LJFF.LIZJ(new C19510311Uv());
        }
    }

    public final void LJFF() {
        ViewGroup viewGroup;
        if (this.LJFF == null || !this.LJ) {
            this.LJII = EnumC1641570sot.LLILLJJLI;
            C786410Ut5.LJLLLLLL(0, this.LIZIZ);
            this.LJI.onNext(EnumC1159860gHw.PRE_SHOW);
            this.LJI.onNext(EnumC1159860gHw.SHOWN);
            return;
        }
        int iOrdinal = this.LJII.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            this.LJIIIIZZ = EnumC994440bz8.LL;
            return;
        }
        if (iOrdinal == 2) {
            this.LJIIIIZZ = EnumC994440bz8.LLILLJJLI;
            return;
        }
        this.LJIIIZ = false;
        this.LJII = EnumC1641570sot.LLILLJJLI;
        if (this.LIZIZ.getParent() == null) {
            this.LIZ.addView(this.LIZIZ);
        } else if (!Intrinsics.LJFF(this.LIZIZ.getParent(), this.LIZ)) {
            ViewParent parent = this.LIZIZ.getParent();
            if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                C786410Ut5.LJJJLZIJ(this.LIZIZ, viewGroup);
            }
            this.LIZ.addView(this.LIZIZ);
        }
        C786410Ut5.LJLLLLLL(0, this.LIZIZ);
        View view = this.LIZJ;
        if (view != null) {
            C786410Ut5.LJLLLLLL(0, view);
            C786410Ut5.ed(view, 0.0f);
        }
        this.LJI.onNext(EnumC1159860gHw.PRE_SHOW);
        this.LJI.onNext(EnumC1159860gHw.SHOWN);
    }

    public C1636040sfy(ViewGroup viewGroup, View view, View view2, long j, Interpolator interpolator, boolean z, boolean z2) {
        C19510411Uw c19510411Uw;
        this.LIZ = viewGroup;
        this.LIZIZ = view;
        this.LIZJ = view2;
        this.LIZLLL = z;
        this.LJ = z2;
        if (view2 != null) {
            c19510411Uw = new C19510411Uw(viewGroup, view, view2, j, 250L, interpolator, new Pair("prop_panel_enter", "prop_panel_hide"));
        } else {
            c19510411Uw = null;
        }
        this.LJFF = c19510411Uw;
        this.LJI = new C11RK();
        this.LJII = EnumC1641570sot.LLILZ;
        this.LJIIIIZZ = EnumC994440bz8.LL;
        if (z) {
            view.setOnTouchListener(new View.OnTouchListener() { // from class: X.0sg0
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view3, MotionEvent motionEvent) {
                    return false;
                }
            });
        }
        if (c19510411Uw != null) {
            c19510411Uw.LIZLLL(new C194551119p() { // from class: X.0sfz
                @Override // X.C194551119p, X.InterfaceC19510211Uu
                public final void LIZ() {
                    C1636040sfy c1636040sfy = this.LIZ;
                    c1636040sfy.LJII = EnumC1641570sot.LLILZ;
                    C786410Ut5.LJLLLLLL(8, c1636040sfy.LIZIZ);
                    this.LIZ.LJI.onNext(EnumC1159860gHw.HIDDEN);
                    this.LIZ.LIZ();
                }

                @Override // X.C194551119p, X.InterfaceC19510211Uu
                public final void LIZIZ() {
                    C1636040sfy c1636040sfy = this.LIZ;
                    c1636040sfy.LJII = EnumC1641570sot.LLILLJJLI;
                    c1636040sfy.LJI.onNext(EnumC1159860gHw.SHOWN);
                    this.LIZ.LIZ();
                }

                @Override // X.C194551119p, X.InterfaceC19510211Uu
                public final void LJI() {
                    C786410Ut5.LJLLLLLL(0, this.LIZ.LIZIZ);
                    this.LIZ.LJI.onNext(EnumC1159860gHw.PRE_SHOW);
                }

                @Override // X.C194551119p, X.InterfaceC19510211Uu
                public final void LJII() {
                    this.LIZ.LJI.onNext(EnumC1159860gHw.PRE_HIDE);
                }
            });
        }
        this.LJIIIZ = true;
    }
}
