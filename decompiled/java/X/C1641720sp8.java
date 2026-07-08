package X;

import android.view.View;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0sp8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1641720sp8 implements InterfaceC1644640stq {
    public final View LIZ;
    public final InterfaceC1637430siD LIZIZ;
    public EnumC1641740spA LIZJ;
    public EnumC1641750spB LIZLLL;
    public final C11RK LJ;

    @Override // X.InterfaceC1644640stq
    public final void V0() {
        this.LIZJ = EnumC1641740spA.LLILZIL;
        C786410Ut5.LJLLLLLL(8, this.LIZ);
        this.LJ.onNext(EnumC1159880gHy.PRE_HIDE);
        this.LJ.onNext(EnumC1159880gHy.HIDDEN);
    }

    @Override // X.InterfaceC1644640stq
    public final C19475711Hn W0() {
        C11RK c11rk = this.LJ;
        c11rk.getClass();
        return new C19475711Hn(c11rk);
    }

    @Override // X.InterfaceC1644640stq
    public final boolean X0() {
        EnumC1641740spA enumC1641740spA = this.LIZJ;
        return enumC1641740spA == EnumC1641740spA.LLILLJJLI || enumC1641740spA == EnumC1641740spA.LLILLL;
    }

    @Override // X.InterfaceC1644640stq
    public final void Y0() {
        this.LIZJ = EnumC1641740spA.LL;
        C786410Ut5.LJLLLLLL(0, this.LIZ);
        this.LJ.onNext(EnumC1159880gHy.PRE_SHOW);
        this.LJ.onNext(EnumC1159880gHy.SHOWN);
    }

    @Override // X.InterfaceC1644640stq
    public final void hide() {
        if (this.LIZIZ == null) {
            V0();
            return;
        }
        int iOrdinal = this.LIZJ.ordinal();
        if (iOrdinal == 1) {
            this.LIZLLL = EnumC1641750spB.LLILLL;
        } else if (iOrdinal == 3 || iOrdinal == 4) {
            this.LIZLLL = EnumC1641750spB.LL;
        } else {
            this.LIZJ = EnumC1641740spA.LLILZ;
            this.LIZIZ.LJFF(new C19510311Uv());
        }
    }

    @Override // X.InterfaceC1644640stq
    public final void show() {
        if (this.LIZIZ == null) {
            Y0();
            return;
        }
        int iOrdinal = this.LIZJ.ordinal();
        if (iOrdinal == 1 || iOrdinal == 2) {
            this.LIZLLL = EnumC1641750spB.LL;
        } else if (iOrdinal == 3) {
            this.LIZLLL = EnumC1641750spB.LLILLJJLI;
        } else {
            this.LIZJ = EnumC1641740spA.LLILLJJLI;
            this.LIZIZ.LIZJ(new C19510311Uv());
        }
    }

    @Override // X.InterfaceC1644640stq
    public final C11ON LIZ() {
        return W0().LJJIL(new InterfaceC19483011Ki() { // from class: X.0spC
            @Override // X.InterfaceC19483011Ki
            public final boolean test(Object obj) {
                if (obj != EnumC1159880gHy.PRE_SHOW && obj != EnumC1159880gHy.PRE_HIDE) {
                    return false;
                }
                return true;
            }
        }).LJJJJZI(new InterfaceC1487280oo2() { // from class: X.0gJT
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                boolean z;
                if (obj == EnumC1159880gHy.PRE_SHOW) {
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        });
    }

    public C1641720sp8(View view, final View view2, View view3, Function1<? super View, ? extends InterfaceC1637430siD> function1) {
        InterfaceC1637430siD interfaceC1637430siDInvoke;
        this.LIZ = view;
        if (view3 != null) {
            interfaceC1637430siDInvoke = function1.invoke(view3);
        } else {
            interfaceC1637430siDInvoke = null;
        }
        this.LIZIZ = interfaceC1637430siDInvoke;
        this.LIZJ = EnumC1641740spA.LL;
        this.LIZLLL = EnumC1641750spB.LL;
        this.LJ = new C11RK();
        if (interfaceC1637430siDInvoke != null) {
            interfaceC1637430siDInvoke.LIZLLL(new C194551119p() { // from class: X.0sp9
                @Override // X.C194551119p, X.InterfaceC19510211Uu
                public final void LIZ() {
                    this.LIZ.LIZJ = EnumC1641740spA.LLILZIL;
                    View view4 = view2;
                    if (view4 != null) {
                        C786410Ut5.LJLLLLLL(8, view4);
                    }
                    C786410Ut5.LJLLLLLL(8, this.LIZ.LIZ);
                    this.LIZ.LJ.onNext(EnumC1159880gHy.HIDDEN);
                    C1641720sp8 c1641720sp8 = this.LIZ;
                    EnumC1641750spB enumC1641750spB = c1641720sp8.LIZLLL;
                    if (enumC1641750spB == EnumC1641750spB.LLILLJJLI) {
                        c1641720sp8.show();
                    } else if (enumC1641750spB == EnumC1641750spB.LLILLL) {
                        c1641720sp8.hide();
                    }
                    c1641720sp8.LIZLLL = EnumC1641750spB.LL;
                }

                @Override // X.C194551119p, X.InterfaceC19510211Uu
                public final void LIZIZ() {
                    this.LIZ.LIZJ = EnumC1641740spA.LLILLL;
                    View view4 = view2;
                    if (view4 != null) {
                        C786410Ut5.LJLLLLLL(8, view4);
                    }
                    this.LIZ.LJ.onNext(EnumC1159880gHy.SHOWN);
                    C1641720sp8 c1641720sp8 = this.LIZ;
                    EnumC1641750spB enumC1641750spB = c1641720sp8.LIZLLL;
                    if (enumC1641750spB == EnumC1641750spB.LLILLJJLI) {
                        c1641720sp8.show();
                    } else if (enumC1641750spB == EnumC1641750spB.LLILLL) {
                        c1641720sp8.hide();
                    }
                    c1641720sp8.LIZLLL = EnumC1641750spB.LL;
                }

                @Override // X.C194551119p, X.InterfaceC19510211Uu
                public final void LJI() {
                    C786410Ut5.LJLLLLLL(0, this.LIZ.LIZ);
                    View view4 = view2;
                    if (view4 != null) {
                        C786410Ut5.LJLLLLLL(0, view4);
                    }
                    this.LIZ.LJ.onNext(EnumC1159880gHy.PRE_SHOW);
                }

                @Override // X.C194551119p, X.InterfaceC19510211Uu
                public final void LJII() {
                    View view4 = view2;
                    if (view4 != null) {
                        C786410Ut5.LJLLLLLL(0, view4);
                    }
                    this.LIZ.LJ.onNext(EnumC1159880gHy.PRE_HIDE);
                }
            });
        }
    }
}
