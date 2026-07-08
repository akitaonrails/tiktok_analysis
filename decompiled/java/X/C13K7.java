package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13K7, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
@InterfaceC1294060jmO
public /* synthetic */ class C13K7 implements C13H1<C13K6> {
    public static final C13K7 LIZ;
    public static final InterfaceC19983313Gt descriptor;

    @Override // X.C13HG, X.InterfaceC19984413He, X.InterfaceC19984213Hc
    public final InterfaceC19983313Gt getDescriptor() {
        return descriptor;
    }

    @Override // X.C13H1
    public final /* synthetic */ C13HG[] typeParametersSerializers() {
        return C13H3.LIZ;
    }

    static {
        C13K7 c13k7 = new C13K7();
        LIZ = c13k7;
        C19983913Gz c19983913Gz = new C19983913Gz("com.tiktok.kmp.nuj.framework.strategy.filter.base.FilterAbilityModel", c13k7, 5);
        c19983913Gz.LJIIJ("name", true);
        c19983913Gz.LJIIJ("operator", true);
        c19983913Gz.LJIIJ("value", true);
        c19983913Gz.LJIIJ("result", true);
        c19983913Gz.LJIIJ("sub_filters", true);
        descriptor = c19983913Gz;
    }

    @Override // X.C13H1
    public final C13HG<?>[] childSerializers() {
        C01GW<C13HG<Object>>[] c01gwArr = C13K6.LJFF;
        C13GX c13gx = C13GX.LIZ;
        return new C13HG[]{c13gx, c13gx, c13gx, c13gx, c01gwArr[4].getValue()};
    }

    @Override // X.InterfaceC19984213Hc
    public final Object deserialize(C13HB c13hb) {
        InterfaceC19983313Gt interfaceC19983313Gt = descriptor;
        InterfaceC19986313Hx interfaceC19986313HxLIZIZ = c13hb.LIZIZ(interfaceC19983313Gt);
        C01GW<C13HG<Object>>[] c01gwArr = C13K6.LJFF;
        interfaceC19986313HxLIZIZ.LJJII();
        String strLJIILL = null;
        int i = 0;
        String strLJIILL2 = null;
        String strLJIILL3 = null;
        String strLJIILL4 = null;
        List list = null;
        while (true) {
            int iLJIJJ = interfaceC19986313HxLIZIZ.LJIJJ(interfaceC19983313Gt);
            if (iLJIJJ != -1) {
                if (iLJIJJ != 0) {
                    if (iLJIJJ != 1) {
                        if (iLJIJJ != 2) {
                            if (iLJIJJ != 3) {
                                if (iLJIJJ == 4) {
                                    list = (List) interfaceC19986313HxLIZIZ.LJI(interfaceC19983313Gt, 4, c01gwArr[4].getValue(), list);
                                    i |= 16;
                                } else {
                                    throw new C13II(iLJIJJ);
                                }
                            } else {
                                strLJIILL4 = interfaceC19986313HxLIZIZ.LJIILL(interfaceC19983313Gt, 3);
                                i |= 8;
                            }
                        } else {
                            strLJIILL3 = interfaceC19986313HxLIZIZ.LJIILL(interfaceC19983313Gt, 2);
                            i |= 4;
                        }
                    } else {
                        strLJIILL2 = interfaceC19986313HxLIZIZ.LJIILL(interfaceC19983313Gt, 1);
                        i |= 2;
                    }
                } else {
                    strLJIILL = interfaceC19986313HxLIZIZ.LJIILL(interfaceC19983313Gt, 0);
                    i |= 1;
                }
            } else {
                interfaceC19986313HxLIZIZ.LJIIJJI(interfaceC19983313Gt);
                return new C13K6(i, strLJIILL, strLJIILL2, strLJIILL3, strLJIILL4, list);
            }
        }
    }

    @Override // X.InterfaceC19984413He
    public final void serialize(C13HD c13hd, Object obj) {
        C13K6 c13k6 = (C13K6) obj;
        InterfaceC19983313Gt interfaceC19983313Gt = descriptor;
        InterfaceC19986513Hz interfaceC19986513HzLIZIZ = c13hd.LIZIZ(interfaceC19983313Gt);
        C01GW<C13HG<Object>>[] c01gwArr = C13K6.LJFF;
        if (interfaceC19986513HzLIZIZ.LJIJJ() || !Intrinsics.LJFF(c13k6.LIZ, "")) {
            interfaceC19986513HzLIZIZ.LJIILIIL(interfaceC19983313Gt, 0, c13k6.LIZ);
        }
        if (interfaceC19986513HzLIZIZ.LJIJJ() || !Intrinsics.LJFF(c13k6.LIZIZ, "")) {
            interfaceC19986513HzLIZIZ.LJIILIIL(interfaceC19983313Gt, 1, c13k6.LIZIZ);
        }
        if (interfaceC19986513HzLIZIZ.LJIJJ() || !Intrinsics.LJFF(c13k6.LIZJ, "")) {
            interfaceC19986513HzLIZIZ.LJIILIIL(interfaceC19983313Gt, 2, c13k6.LIZJ);
        }
        if (interfaceC19986513HzLIZIZ.LJIJJ() || !Intrinsics.LJFF(c13k6.LIZLLL, "")) {
            interfaceC19986513HzLIZIZ.LJIILIIL(interfaceC19983313Gt, 3, c13k6.LIZLLL);
        }
        if (interfaceC19986513HzLIZIZ.LJIJJ() || !Intrinsics.LJFF(c13k6.LJ, C13BV.INSTANCE)) {
            interfaceC19986513HzLIZIZ.LJJIIJ(interfaceC19983313Gt, 4, c01gwArr[4].getValue(), c13k6.LJ);
        }
        interfaceC19986513HzLIZIZ.LIZLLL();
    }
}
