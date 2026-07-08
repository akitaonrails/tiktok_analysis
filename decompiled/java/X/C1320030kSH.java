package X;

import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: X.0kSH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1320030kSH extends AbstractC1319960kSA<C1323050kX9<AbstractC1327750kej>, InterfaceC1330440kj4> {
    public final InterfaceC1320130kSR LJIILLIIL;
    public final InterfaceC1325150kaX<InterfaceC1324680kZm, AbstractC1327750kej> LJIIZILJ;
    public InterfaceC1320070kSL<InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>>> LJIJ;
    public InterfaceC1320080kSM LJIJI;

    @Override // X.AbstractC1319960kSA
    public final InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> LJ() {
        return this.LJIJ.get();
    }

    @Override // X.AbstractC1319960kSA
    public final String toString() {
        C1320100kSO c1320100kSOLIZIZ = C1320090kSN.LIZIZ(this);
        c1320100kSOLIZIZ.LIZIZ(super.toString(), "super");
        c1320100kSOLIZIZ.LIZIZ(this.LJIJ, "dataSourceSupplier");
        return c1320100kSOLIZIZ.toString();
    }

    @Override // X.AbstractC1319960kSA
    public final Drawable LIZJ(C1323050kX9<AbstractC1327750kej> c1323050kX9) {
        C1323050kX9<AbstractC1327750kej> c1323050kX92 = c1323050kX9;
        C1322350kW1.LJFF(C1323050kX9.LJIJJ(c1323050kX92));
        AbstractC1327750kej abstractC1327750kej = c1323050kX92.get();
        Drawable drawableLIZJ = this.LJIILLIIL.LIZJ(abstractC1327750kej);
        if (drawableLIZJ != null) {
            return drawableLIZJ;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Unrecognized image class: ");
        sbLIZ.append(abstractC1327750kej);
        throw new UnsupportedOperationException(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.AbstractC1319960kSA
    public final int LJFF(C1323050kX9<AbstractC1327750kej> c1323050kX9) {
        C1323050kX9<AbstractC1327750kej> c1323050kX92 = c1323050kX9;
        if (c1323050kX92 != null) {
            return c1323050kX92.LJIILL();
        }
        return 0;
    }

    @Override // X.AbstractC1319960kSA
    public final InterfaceC1330440kj4 LJI(Object obj) {
        C1323050kX9 c1323050kX9 = (C1323050kX9) obj;
        C1322350kW1.LJFF(C1323050kX9.LJIJJ(c1323050kX9));
        return (InterfaceC1330440kj4) c1323050kX9.get();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1319960kSA
    public final void LJIIJ(Drawable drawable) {
        if (drawable instanceof InterfaceC1316680kMs) {
            ((InterfaceC1316680kMs) drawable).LIZ();
        }
    }

    @Override // X.AbstractC1319960kSA
    public final void LJIIL(C1323050kX9<AbstractC1327750kej> c1323050kX9) {
        C1323050kX9.LJII(c1323050kX9);
    }

    public C1320030kSH(C1316690kMt c1316690kMt, InterfaceC1320130kSR interfaceC1320130kSR, C0WPZ c0wpz, InterfaceC1325150kaX interfaceC1325150kaX) {
        super(c1316690kMt, c0wpz);
        this.LJIILLIIL = interfaceC1320130kSR;
        this.LJIIZILJ = interfaceC1325150kaX;
    }
}
