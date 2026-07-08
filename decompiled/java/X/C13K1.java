package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13K1, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
@InterfaceC1294060jmO
public /* synthetic */ class C13K1 implements C13H1<C13K2> {
    public static final C13K1 LIZ;
    public static final InterfaceC19983313Gt descriptor;

    @Override // X.C13H1
    public final C13HG<?>[] childSerializers() {
        C13GX c13gx = C13GX.LIZ;
        return new C13HG[]{c13gx, C19983613Gw.LIZ(c13gx)};
    }

    @Override // X.C13HG, X.InterfaceC19984413He, X.InterfaceC19984213Hc
    public final InterfaceC19983313Gt getDescriptor() {
        return descriptor;
    }

    @Override // X.C13H1
    public final /* synthetic */ C13HG[] typeParametersSerializers() {
        return C13H3.LIZ;
    }

    static {
        C13K1 c13k1 = new C13K1();
        LIZ = c13k1;
        C19983913Gz c19983913Gz = new C19983913Gz("com.tiktok.kmp.nuj.framework.strategy.NUFunctionModel", c13k1, 2);
        c19983913Gz.LJIIJ("name", true);
        c19983913Gz.LJIIJ("params", true);
        descriptor = c19983913Gz;
    }

    @Override // X.InterfaceC19984213Hc
    public final Object deserialize(C13HB c13hb) {
        InterfaceC19983313Gt interfaceC19983313Gt = descriptor;
        InterfaceC19986313Hx interfaceC19986313HxLIZIZ = c13hb.LIZIZ(interfaceC19983313Gt);
        interfaceC19986313HxLIZIZ.LJJII();
        String str = null;
        int i = 0;
        String strLJIILL = null;
        while (true) {
            int iLJIJJ = interfaceC19986313HxLIZIZ.LJIJJ(interfaceC19983313Gt);
            if (iLJIJJ != -1) {
                if (iLJIJJ != 0) {
                    if (iLJIJJ == 1) {
                        str = (String) interfaceC19986313HxLIZIZ.LJIIIZ(interfaceC19983313Gt, 1, C13GX.LIZ, str);
                        i |= 2;
                    } else {
                        throw new C13II(iLJIJJ);
                    }
                } else {
                    strLJIILL = interfaceC19986313HxLIZIZ.LJIILL(interfaceC19983313Gt, 0);
                    i |= 1;
                }
            } else {
                interfaceC19986313HxLIZIZ.LJIIJJI(interfaceC19983313Gt);
                return new C13K2(i, strLJIILL, str);
            }
        }
    }

    @Override // X.InterfaceC19984413He
    public final void serialize(C13HD c13hd, Object obj) {
        C13K2 c13k2 = (C13K2) obj;
        InterfaceC19983313Gt interfaceC19983313Gt = descriptor;
        InterfaceC19986513Hz interfaceC19986513HzLIZIZ = c13hd.LIZIZ(interfaceC19983313Gt);
        if (interfaceC19986513HzLIZIZ.LJIJJ() || !Intrinsics.LJFF(c13k2.LIZ, "")) {
            interfaceC19986513HzLIZIZ.LJIILIIL(interfaceC19983313Gt, 0, c13k2.LIZ);
        }
        if (interfaceC19986513HzLIZIZ.LJIJJ() || c13k2.LIZIZ != null) {
            interfaceC19986513HzLIZIZ.LJIIZILJ(interfaceC19983313Gt, 1, C13GX.LIZ, c13k2.LIZIZ);
        }
        interfaceC19986513HzLIZIZ.LIZLLL();
    }
}
