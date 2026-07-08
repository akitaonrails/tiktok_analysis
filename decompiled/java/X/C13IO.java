package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13IO, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
@InterfaceC1294060jmO
public /* synthetic */ class C13IO implements C13H1<C19266610Zc> {
    public static final C13IO LIZ;
    public static final InterfaceC19983313Gt descriptor;

    @Override // X.C13H1
    public final C13HG<?>[] childSerializers() {
        C13GX c13gx = C13GX.LIZ;
        return new C13HG[]{C13H6.LIZ, c13gx, c13gx};
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
        C13IO c13io = new C13IO();
        LIZ = c13io;
        C19983913Gz c19983913Gz = new C19983913Gz("com.tiktok.kmp.deeplink.s2l.Short2LongRequest.S2LResponse", c13io, 3);
        c19983913Gz.LJIIJ("status_code", true);
        c19983913Gz.LJIIJ("status_msg", true);
        c19983913Gz.LJIIJ("landing_url", true);
        descriptor = c19983913Gz;
    }

    @Override // X.InterfaceC19984213Hc
    public final Object deserialize(C13HB c13hb) {
        InterfaceC19983313Gt interfaceC19983313Gt = descriptor;
        InterfaceC19986313Hx interfaceC19986313HxLIZIZ = c13hb.LIZIZ(interfaceC19983313Gt);
        interfaceC19986313HxLIZIZ.LJJII();
        String strLJIILL = null;
        int i = 0;
        long jLJIIIIZZ = 0;
        String strLJIILL2 = null;
        while (true) {
            int iLJIJJ = interfaceC19986313HxLIZIZ.LJIJJ(interfaceC19983313Gt);
            if (iLJIJJ != -1) {
                if (iLJIJJ != 0) {
                    if (iLJIJJ != 1) {
                        if (iLJIJJ == 2) {
                            strLJIILL2 = interfaceC19986313HxLIZIZ.LJIILL(interfaceC19983313Gt, 2);
                            i |= 4;
                        } else {
                            throw new C13II(iLJIJJ);
                        }
                    } else {
                        strLJIILL = interfaceC19986313HxLIZIZ.LJIILL(interfaceC19983313Gt, 1);
                        i |= 2;
                    }
                } else {
                    jLJIIIIZZ = interfaceC19986313HxLIZIZ.LJIIIIZZ(interfaceC19983313Gt, 0);
                    i |= 1;
                }
            } else {
                interfaceC19986313HxLIZIZ.LJIIJJI(interfaceC19983313Gt);
                return new C19266610Zc(i, jLJIIIIZZ, strLJIILL, strLJIILL2);
            }
        }
    }

    @Override // X.InterfaceC19984413He
    public final void serialize(C13HD c13hd, Object obj) {
        C19266610Zc c19266610Zc = (C19266610Zc) obj;
        InterfaceC19983313Gt interfaceC19983313Gt = descriptor;
        InterfaceC19986513Hz interfaceC19986513HzLIZIZ = c13hd.LIZIZ(interfaceC19983313Gt);
        if (interfaceC19986513HzLIZIZ.LJIJJ() || c19266610Zc.LIZ != -1) {
            interfaceC19986513HzLIZIZ.LJFF(interfaceC19983313Gt, 0, c19266610Zc.LIZ);
        }
        if (interfaceC19986513HzLIZIZ.LJIJJ() || !Intrinsics.LJFF(c19266610Zc.LIZIZ, "default error")) {
            interfaceC19986513HzLIZIZ.LJIILIIL(interfaceC19983313Gt, 1, c19266610Zc.LIZIZ);
        }
        if (interfaceC19986513HzLIZIZ.LJIJJ() || !Intrinsics.LJFF(c19266610Zc.LIZJ, "")) {
            interfaceC19986513HzLIZIZ.LJIILIIL(interfaceC19983313Gt, 2, c19266610Zc.LIZJ);
        }
        interfaceC19986513HzLIZIZ.LIZLLL();
    }
}
