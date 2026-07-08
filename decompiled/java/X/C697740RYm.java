package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RYm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C697740RYm<DATA> implements InterfaceC702060RgK<DATA> {
    public final Function0<InterfaceC697220RWm> LIZ;
    public final InterfaceC700020Rd2<DATA> LIZIZ;

    @Override // X.InterfaceC702060RgK
    public final void LIZ() {
    }

    @Override // X.InterfaceC702060RgK
    public final void LIZIZ() {
    }

    @Override // X.InterfaceC702060RgK
    public final void LIZLLL() {
    }

    @Override // X.InterfaceC702060RgK
    public final String Ko() {
        return this.LIZ.invoke().o1();
    }

    public final void LJ(InterfaceC702410Rgt interfaceC702410Rgt) {
        this.LIZ.invoke().Ah(interfaceC702410Rgt);
    }

    public C697740RYm(C697750RYn c697750RYn, C0RYN c0ryn) {
        this.LIZ = c697750RYn;
        this.LIZIZ = c0ryn;
    }

    @Override // X.InterfaceC702060RgK
    public final void LIZJ(C701300Rf6 c701300Rf6, String str, boolean z) {
        this.LIZ.invoke().gg(new C700260RdQ(C0RXO.LIZ(str, "fallback", C0RY8.LIZ(this.LIZIZ.LJLI())), c701300Rf6, z, null, 8));
    }
}
