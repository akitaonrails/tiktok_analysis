package X;

import android.view.View;

/* JADX INFO: renamed from: X.0svq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1645880svq implements InterfaceC1644640stq {
    public final View LIZ;
    public final C19510511Ux LIZIZ;
    public EnumC1645870svp LIZJ;
    public EnumC1645900svs LIZLLL;
    public final C11RK LJ;

    @Override // X.InterfaceC1644640stq
    public final void V0() {
        this.LIZJ = EnumC1645870svp.LLILZIL;
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
        EnumC1645870svp enumC1645870svp = this.LIZJ;
        return enumC1645870svp == EnumC1645870svp.LLILLJJLI || enumC1645870svp == EnumC1645870svp.LLILLL;
    }

    @Override // X.InterfaceC1644640stq
    public final void Y0() {
        this.LIZJ = EnumC1645870svp.LL;
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
            this.LIZLLL = EnumC1645900svs.LLILLL;
        } else if (iOrdinal == 3 || iOrdinal == 4) {
            this.LIZLLL = EnumC1645900svs.LL;
        } else {
            this.LIZJ = EnumC1645870svp.LLILZ;
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
            this.LIZLLL = EnumC1645900svs.LL;
        } else if (iOrdinal == 3) {
            this.LIZLLL = EnumC1645900svs.LLILLJJLI;
        } else {
            this.LIZJ = EnumC1645870svp.LLILLJJLI;
            this.LIZIZ.LIZJ(new C19510311Uv());
        }
    }

    @Override // X.InterfaceC1644640stq
    public final C11ON LIZ() {
        return W0().LJJIL(new InterfaceC19483011Ki() { // from class: X.0spD
            @Override // X.InterfaceC19483011Ki
            public final boolean test(Object obj) {
                if (obj != EnumC1159880gHy.PRE_SHOW && obj != EnumC1159880gHy.HIDDEN) {
                    return false;
                }
                return true;
            }
        }).LJJJJZI(new InterfaceC1487280oo2() { // from class: X.0gJS
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

    public C1645880svq(View view, View view2) {
        C19510511Ux c19510511Ux;
        this.LIZ = view;
        if (view2 != null) {
            c19510511Ux = new C19510511Ux(view2);
        } else {
            c19510511Ux = null;
        }
        this.LIZIZ = c19510511Ux;
        this.LIZJ = EnumC1645870svp.LL;
        this.LIZLLL = EnumC1645900svs.LL;
        this.LJ = new C11RK();
        if (c19510511Ux != null) {
            c19510511Ux.LIZJ = new C194551119p() { // from class: X.0svr
                @Override // X.C194551119p, X.InterfaceC19510211Uu
                public final void LIZ() {
                    C1645880svq c1645880svq = this.LIZ;
                    c1645880svq.LIZJ = EnumC1645870svp.LLILZIL;
                    C786410Ut5.LJLLLLLL(8, c1645880svq.LIZ);
                    this.LIZ.LJ.onNext(EnumC1159880gHy.HIDDEN);
                    C1645880svq c1645880svq2 = this.LIZ;
                    EnumC1645900svs enumC1645900svs = c1645880svq2.LIZLLL;
                    if (enumC1645900svs == EnumC1645900svs.LLILLJJLI) {
                        c1645880svq2.show();
                    } else if (enumC1645900svs == EnumC1645900svs.LLILLL) {
                        c1645880svq2.hide();
                    }
                    c1645880svq2.LIZLLL = EnumC1645900svs.LL;
                }

                @Override // X.C194551119p, X.InterfaceC19510211Uu
                public final void LIZIZ() {
                    C1645880svq c1645880svq = this.LIZ;
                    c1645880svq.LIZJ = EnumC1645870svp.LLILLL;
                    c1645880svq.LJ.onNext(EnumC1159880gHy.SHOWN);
                    C1645880svq c1645880svq2 = this.LIZ;
                    EnumC1645900svs enumC1645900svs = c1645880svq2.LIZLLL;
                    if (enumC1645900svs == EnumC1645900svs.LLILLJJLI) {
                        c1645880svq2.show();
                    } else if (enumC1645900svs == EnumC1645900svs.LLILLL) {
                        c1645880svq2.hide();
                    }
                    c1645880svq2.LIZLLL = EnumC1645900svs.LL;
                }

                @Override // X.C194551119p, X.InterfaceC19510211Uu
                public final void LJI() {
                    C786410Ut5.LJLLLLLL(0, this.LIZ.LIZ);
                    this.LIZ.LJ.onNext(EnumC1159880gHy.PRE_SHOW);
                }

                @Override // X.C194551119p, X.InterfaceC19510211Uu
                public final void LJII() {
                    this.LIZ.LJ.onNext(EnumC1159880gHy.PRE_HIDE);
                }
            };
        }
    }
}
