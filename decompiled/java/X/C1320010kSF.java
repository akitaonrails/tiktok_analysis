package X;

import java.util.ArrayList;

/* JADX INFO: renamed from: X.0kSF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1320010kSF extends AbstractC1316490kMZ<C1320010kSF, C1325710kbR, C1323050kX9<AbstractC1327750kej>, InterfaceC1330440kj4> {
    public final C1325540kbA LJIIJJI = C1322200kVm.LIZ();
    public final InterfaceC1320130kSR LJIIL;

    public final C1320030kSH LIZIZ() {
        final C1320030kSH c1320030kSH;
        C1316690kMt c1316690kMt;
        InterfaceC1320070kSL c1321190kU9;
        AbstractC1319960kSA abstractC1319960kSA = this.LJII;
        final String strValueOf = String.valueOf(AbstractC1316490kMZ.LJIIJ.getAndIncrement());
        if (abstractC1319960kSA instanceof C1320030kSH) {
            c1320030kSH = (C1320030kSH) abstractC1319960kSA;
        } else {
            synchronized (C1316690kMt.class) {
                if (C1316690kMt.LIZJ == null) {
                    C1316690kMt.LIZJ = new C1316690kMt();
                }
                c1316690kMt = C1316690kMt.LIZJ;
            }
            c1320030kSH = new C1320030kSH(c1316690kMt, this.LJIIL, this.LIZ ? C822680WPa.LIZ() : C822690WPb.LIZ(), this.LJIIJJI.LIZLLL);
        }
        final REQUEST request = this.LIZJ;
        if (request != 0) {
            final EnumC1320050kSJ enumC1320050kSJ = EnumC1320050kSJ.FULL_FETCH;
            final Object obj = this.LIZIZ;
            c1321190kU9 = new InterfaceC1320070kSL<InterfaceC1320200kSY<Object>>(c1320030kSH, strValueOf, request, obj, enumC1320050kSJ) { // from class: X.0kSG
                public final /* synthetic */ AbstractC1319960kSA LIZ;
                public final /* synthetic */ Object LIZIZ;
                public final /* synthetic */ Object LIZJ;
                public final /* synthetic */ EnumC1320050kSJ LIZLLL;

                @Override // X.InterfaceC1320070kSL
                public final InterfaceC1320200kSY<Object> get() {
                    return this.LJ.LIZ(this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL);
                }

                public final String toString() {
                    C1320100kSO c1320100kSOLIZIZ = C1320090kSN.LIZIZ(this);
                    c1320100kSOLIZIZ.LIZIZ(this.LIZIZ.toString(), "request");
                    return c1320100kSOLIZIZ.toString();
                }

                {
                    this.LIZIZ = request;
                    this.LIZJ = obj;
                    this.LIZLLL = enumC1320050kSJ;
                }
            };
            if (this.LIZLLL != 0) {
                ArrayList arrayList = new ArrayList(2);
                arrayList.add(c1321190kU9);
                final REQUEST request2 = this.LIZLLL;
                final EnumC1320050kSJ enumC1320050kSJ2 = EnumC1320050kSJ.FULL_FETCH;
                final Object obj2 = this.LIZIZ;
                arrayList.add(new InterfaceC1320070kSL<InterfaceC1320200kSY<Object>>(c1320030kSH, strValueOf, request2, obj2, enumC1320050kSJ2) { // from class: X.0kSG
                    public final /* synthetic */ AbstractC1319960kSA LIZ;
                    public final /* synthetic */ Object LIZIZ;
                    public final /* synthetic */ Object LIZJ;
                    public final /* synthetic */ EnumC1320050kSJ LIZLLL;

                    @Override // X.InterfaceC1320070kSL
                    public final InterfaceC1320200kSY<Object> get() {
                        return this.LJ.LIZ(this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL);
                    }

                    public final String toString() {
                        C1320100kSO c1320100kSOLIZIZ = C1320090kSN.LIZIZ(this);
                        c1320100kSOLIZIZ.LIZIZ(this.LIZIZ.toString(), "request");
                        return c1320100kSOLIZIZ.toString();
                    }

                    {
                        this.LIZIZ = request2;
                        this.LIZJ = obj2;
                        this.LIZLLL = enumC1320050kSJ2;
                    }
                });
                c1321190kU9 = new C1320170kSV(arrayList);
            }
        } else {
            c1321190kU9 = new C1321190kU9(AbstractC1316490kMZ.LJIIIZ);
        }
        Object obj3 = this.LIZIZ;
        c1320030kSH.LJIJI = null;
        c1320030kSH.LJII(obj3, strValueOf);
        c1320030kSH.LJIIIZ = false;
        c1320030kSH.LJIJ = c1321190kU9;
        return c1320030kSH;
    }

    public C1320010kSF(C1320120kSQ c1320120kSQ) {
        this.LJIIL = c1320120kSQ;
    }

    @Override // X.AbstractC1316490kMZ
    public final InterfaceC1320200kSY LIZ(AbstractC1319960kSA abstractC1319960kSA, Object obj, Object obj2, EnumC1320050kSJ enumC1320050kSJ) {
        EnumC1320950kTl enumC1320950kTl;
        C1325710kbR c1325710kbR = (C1325710kbR) obj;
        C1325540kbA c1325540kbA = this.LJIIJJI;
        int i = C1320040kSI.LIZ[enumC1320050kSJ.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    enumC1320950kTl = EnumC1320950kTl.BITMAP_MEMORY_CACHE;
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Cache level");
                    sbLIZ.append(enumC1320050kSJ);
                    sbLIZ.append("is not supported. ");
                    throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
                }
            } else {
                enumC1320950kTl = EnumC1320950kTl.DISK_CACHE;
            }
        } else {
            enumC1320950kTl = EnumC1320950kTl.FULL_FETCH;
        }
        C1320060kSK c1320060kSK = null;
        if (abstractC1319960kSA instanceof C1320030kSH) {
            C1320030kSH c1320030kSH = (C1320030kSH) abstractC1319960kSA;
            synchronized (c1320030kSH) {
                InterfaceC1320080kSM interfaceC1320080kSM = c1320030kSH.LJIJI;
                if (interfaceC1320080kSM != null) {
                    c1320060kSK = new C1320060kSK(c1320030kSH.LJIILJJIL, interfaceC1320080kSM);
                }
            }
        }
        return c1325540kbA.LJII(c1325710kbR, obj2, enumC1320950kTl, c1320060kSK);
    }
}
