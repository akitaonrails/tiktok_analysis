package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13IN, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
@InterfaceC1294060jmO
public /* synthetic */ class C13IN implements C13H1<C19266410Za> {
    public static final C13IN LIZ;
    public static final InterfaceC19983313Gt descriptor;

    @Override // X.C13H1
    public final C13HG<?>[] childSerializers() {
        C13GX c13gx = C13GX.LIZ;
        return new C13HG[]{c13gx, C19983613Gw.LIZ(C13HI.LIZ), C19983613Gw.LIZ(c13gx)};
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
        C13IN c13in = new C13IN();
        LIZ = c13in;
        C19983913Gz c19983913Gz = new C19983913Gz("com.tiktok.kmp.shareprop.Long2ShortRequest.L2SResponse", c13in, 3);
        c19983913Gz.LJIIJ("shorten_url", true);
        c19983913Gz.LJIIJ("status_code", true);
        c19983913Gz.LJIIJ("status_msg", true);
        descriptor = c19983913Gz;
    }

    @Override // X.InterfaceC19984213Hc
    public final Object deserialize(C13HB c13hb) {
        InterfaceC19983313Gt interfaceC19983313Gt = descriptor;
        InterfaceC19986313Hx interfaceC19986313HxLIZIZ = c13hb.LIZIZ(interfaceC19983313Gt);
        interfaceC19986313HxLIZIZ.LJJII();
        String strLJIILL = null;
        int i = 0;
        Integer num = null;
        String str = null;
        while (true) {
            int iLJIJJ = interfaceC19986313HxLIZIZ.LJIJJ(interfaceC19983313Gt);
            if (iLJIJJ != -1) {
                if (iLJIJJ != 0) {
                    if (iLJIJJ != 1) {
                        if (iLJIJJ == 2) {
                            str = (String) interfaceC19986313HxLIZIZ.LJIIIZ(interfaceC19983313Gt, 2, C13GX.LIZ, str);
                            i |= 4;
                        } else {
                            throw new C13II(iLJIJJ);
                        }
                    } else {
                        num = (Integer) interfaceC19986313HxLIZIZ.LJIIIZ(interfaceC19983313Gt, 1, C13HI.LIZ, num);
                        i |= 2;
                    }
                } else {
                    strLJIILL = interfaceC19986313HxLIZIZ.LJIILL(interfaceC19983313Gt, 0);
                    i |= 1;
                }
            } else {
                interfaceC19986313HxLIZIZ.LJIIJJI(interfaceC19983313Gt);
                return new C19266410Za(i, strLJIILL, num, str);
            }
        }
    }

    @Override // X.InterfaceC19984413He
    public final void serialize(C13HD c13hd, Object obj) {
        C19266410Za c19266410Za = (C19266410Za) obj;
        InterfaceC19983313Gt interfaceC19983313Gt = descriptor;
        InterfaceC19986513Hz interfaceC19986513HzLIZIZ = c13hd.LIZIZ(interfaceC19983313Gt);
        if (interfaceC19986513HzLIZIZ.LJIJJ() || !Intrinsics.LJFF(c19266410Za.LIZ, "")) {
            interfaceC19986513HzLIZIZ.LJIILIIL(interfaceC19983313Gt, 0, c19266410Za.LIZ);
        }
        if (interfaceC19986513HzLIZIZ.LJIJJ() || c19266410Za.LIZIZ != null) {
            interfaceC19986513HzLIZIZ.LJIIZILJ(interfaceC19983313Gt, 1, C13HI.LIZ, c19266410Za.LIZIZ);
        }
        if (interfaceC19986513HzLIZIZ.LJIJJ() || c19266410Za.LIZJ != null) {
            interfaceC19986513HzLIZIZ.LJIIZILJ(interfaceC19983313Gt, 2, C13GX.LIZ, c19266410Za.LIZJ);
        }
        interfaceC19986513HzLIZIZ.LIZLLL();
    }
}
