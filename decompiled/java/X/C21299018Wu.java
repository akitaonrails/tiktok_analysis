package X;

import Y.ARunnableS132S0100000_32;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.18Wu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21299018Wu implements InterfaceC21297318Wd {
    public final C21299118Wv LIZ;

    @Override // X.InterfaceC21297318Wd
    public final boolean LLIIIL() {
        C21299118Wv c21299118Wv = this.LIZ;
        return (c21299118Wv != null ? c21299118Wv.getState() : null) == EnumC21299518Wz.EXPANDED;
    }

    public C21299018Wu(C21299118Wv c21299118Wv) {
        this.LIZ = c21299118Wv;
    }

    @Override // X.InterfaceC21297318Wd
    public final void LIZ(final ARunnableS132S0100000_32 aRunnableS132S0100000_32) {
        C21299118Wv c21299118Wv = this.LIZ;
        if (c21299118Wv != null) {
            int i = C21299118Wv.LLJLLL;
            c21299118Wv.LLJLIL.LIZJ(EnumC21299518Wz.EXPANDED, true);
        }
        C21299118Wv c21299118Wv2 = this.LIZ;
        if (c21299118Wv2 != null) {
            ((ArrayList) c21299118Wv2.LLJLL.LIZIZ).add(new C18X4() { // from class: X.18Wt
                @Override // X.C18X4
                public final void LJJJI(float f) {
                }

                @Override // X.C18X4
                public final void LJJJIL() {
                }

                @Override // X.C18X4
                public final void LJJJJ() {
                }

                @Override // X.C18X4
                public final void e0() {
                }

                @Override // X.C18X4
                public final void g0() {
                }

                @Override // X.C18X4
                public final void f0(EnumC21299518Wz enumC21299518Wz) {
                    if (enumC21299518Wz == EnumC21299518Wz.EXPANDED) {
                        ((ArrayList) this.LIZ.LIZ.LLJLL.LIZIZ).remove(this);
                        aRunnableS132S0100000_32.run();
                    }
                }
            });
        }
    }

    @Override // X.InterfaceC21297318Wd
    public final void LIZIZ(final ARunnableS132S0100000_32 aRunnableS132S0100000_32) {
        C21299118Wv c21299118Wv = this.LIZ;
        if (c21299118Wv != null) {
            int i = C21299118Wv.LLJLLL;
            c21299118Wv.LLJLIL.LIZJ(EnumC21299518Wz.COLLAPSED, true);
        }
        C21299118Wv c21299118Wv2 = this.LIZ;
        if (c21299118Wv2 != null) {
            ((ArrayList) c21299118Wv2.LLJLL.LIZIZ).add(new C18X4() { // from class: X.18X2
                @Override // X.C18X4
                public final void LJJJI(float f) {
                }

                @Override // X.C18X4
                public final void LJJJIL() {
                }

                @Override // X.C18X4
                public final void LJJJJ() {
                }

                @Override // X.C18X4
                public final void e0() {
                }

                @Override // X.C18X4
                public final void g0() {
                }

                @Override // X.C18X4
                public final void f0(EnumC21299518Wz enumC21299518Wz) {
                    if (enumC21299518Wz == EnumC21299518Wz.COLLAPSED) {
                        ((ArrayList) this.LIZ.LIZ.LLJLL.LIZIZ).remove(this);
                        aRunnableS132S0100000_32.run();
                    }
                }
            });
        }
    }
}
