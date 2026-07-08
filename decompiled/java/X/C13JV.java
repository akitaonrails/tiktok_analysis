package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13JV, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
@InterfaceC1294060jmO
public /* synthetic */ class C13JV implements C13H1<C10VJ> {
    public static final C13JV LIZ;
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
        C13JV c13jv = new C13JV();
        LIZ = c13jv;
        C19983913Gz c19983913Gz = new C19983913Gz("com.tiktok.kmp.nuj.framework.strategy.NUJConfig", c13jv, 2);
        c19983913Gz.LJIIJ("expose_type", true);
        c19983913Gz.LJIIJ("config", true);
        descriptor = c19983913Gz;
    }

    @Override // X.C13H1
    public final C13HG<?>[] childSerializers() {
        return new C13HG[]{C13GX.LIZ, C10VJ.LIZJ[1].getValue()};
    }

    @Override // X.InterfaceC19984213Hc
    public final Object deserialize(C13HB c13hb) {
        InterfaceC19983313Gt interfaceC19983313Gt = descriptor;
        InterfaceC19986313Hx interfaceC19986313HxLIZIZ = c13hb.LIZIZ(interfaceC19983313Gt);
        C01GW<C13HG<Object>>[] c01gwArr = C10VJ.LIZJ;
        interfaceC19986313HxLIZIZ.LJJII();
        List list = null;
        int i = 0;
        String strLJIILL = null;
        while (true) {
            int iLJIJJ = interfaceC19986313HxLIZIZ.LJIJJ(interfaceC19983313Gt);
            if (iLJIJJ != -1) {
                if (iLJIJJ != 0) {
                    if (iLJIJJ == 1) {
                        list = (List) interfaceC19986313HxLIZIZ.LJI(interfaceC19983313Gt, 1, c01gwArr[1].getValue(), list);
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
                return new C10VJ(i, strLJIILL, list);
            }
        }
    }

    @Override // X.InterfaceC19984413He
    public final void serialize(C13HD c13hd, Object obj) {
        C10VJ c10vj = (C10VJ) obj;
        InterfaceC19983313Gt interfaceC19983313Gt = descriptor;
        InterfaceC19986513Hz interfaceC19986513HzLIZIZ = c13hd.LIZIZ(interfaceC19983313Gt);
        C01GW<C13HG<Object>>[] c01gwArr = C10VJ.LIZJ;
        if (interfaceC19986513HzLIZIZ.LJIJJ() || !Intrinsics.LJFF(c10vj.LIZ, "")) {
            interfaceC19986513HzLIZIZ.LJIILIIL(interfaceC19983313Gt, 0, c10vj.LIZ);
        }
        if (interfaceC19986513HzLIZIZ.LJIJJ() || !Intrinsics.LJFF(c10vj.LIZIZ, C13BV.INSTANCE)) {
            interfaceC19986513HzLIZIZ.LJJIIJ(interfaceC19983313Gt, 1, c01gwArr[1].getValue(), c10vj.LIZIZ);
        }
        interfaceC19986513HzLIZIZ.LIZLLL();
    }
}
