package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13IK, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
@InterfaceC1294060jmO
public /* synthetic */ class C13IK implements C13H1<C19282410cA> {
    public static final C13IK LIZ;
    public static final InterfaceC19983313Gt descriptor;

    @Override // X.C13H1
    public final C13HG<?>[] childSerializers() {
        C13GX c13gx = C13GX.LIZ;
        C13HI c13hi = C13HI.LIZ;
        return new C13HG[]{C13H6.LIZ, c13gx, c13gx, c13hi, c13hi, c13hi, c13hi};
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
        C13IK c13ik = new C13IK();
        LIZ = c13ik;
        C19983913Gz c19983913Gz = new C19983913Gz("com.tiktok.kmp.active.manager.core.ActiveDaysModel", c13ik, 7);
        c19983913Gz.LJIIJ("timestamp", true);
        c19983913Gz.LJIIJ("date_str", true);
        c19983913Gz.LJIIJ("user_type", true);
        c19983913Gz.LJIIJ("active_day_in_30", true);
        c19983913Gz.LJIIJ("active_day_in_5", true);
        c19983913Gz.LJIIJ("day_since_first_launch", true);
        c19983913Gz.LJIIJ("day_since_last_launch", true);
        descriptor = c19983913Gz;
    }

    @Override // X.InterfaceC19984213Hc
    public final Object deserialize(C13HB c13hb) {
        InterfaceC19983313Gt interfaceC19983313Gt = descriptor;
        InterfaceC19986313Hx interfaceC19986313HxLIZIZ = c13hb.LIZIZ(interfaceC19983313Gt);
        interfaceC19986313HxLIZIZ.LJJII();
        String strLJIILL = null;
        int i = 0;
        int iLJIJJLI = 0;
        int iLJIJJLI2 = 0;
        int iLJIJJLI3 = 0;
        int iLJIJJLI4 = 0;
        long jLJIIIIZZ = 0;
        String strLJIILL2 = null;
        while (true) {
            int iLJIJJ = interfaceC19986313HxLIZIZ.LJIJJ(interfaceC19983313Gt);
            switch (iLJIJJ) {
                case -1:
                    interfaceC19986313HxLIZIZ.LJIIJJI(interfaceC19983313Gt);
                    return new C19282410cA(i, jLJIIIIZZ, strLJIILL, strLJIILL2, iLJIJJLI, iLJIJJLI2, iLJIJJLI3, iLJIJJLI4);
                case 0:
                    jLJIIIIZZ = interfaceC19986313HxLIZIZ.LJIIIIZZ(interfaceC19983313Gt, 0);
                    i |= 1;
                    break;
                case 1:
                    strLJIILL = interfaceC19986313HxLIZIZ.LJIILL(interfaceC19983313Gt, 1);
                    i |= 2;
                    break;
                case 2:
                    strLJIILL2 = interfaceC19986313HxLIZIZ.LJIILL(interfaceC19983313Gt, 2);
                    i |= 4;
                    break;
                case 3:
                    iLJIJJLI = interfaceC19986313HxLIZIZ.LJIJJLI(interfaceC19983313Gt, 3);
                    i |= 8;
                    break;
                case 4:
                    iLJIJJLI2 = interfaceC19986313HxLIZIZ.LJIJJLI(interfaceC19983313Gt, 4);
                    i |= 16;
                    break;
                case 5:
                    iLJIJJLI3 = interfaceC19986313HxLIZIZ.LJIJJLI(interfaceC19983313Gt, 5);
                    i |= 32;
                    break;
                case 6:
                    iLJIJJLI4 = interfaceC19986313HxLIZIZ.LJIJJLI(interfaceC19983313Gt, 6);
                    i |= 64;
                    break;
                default:
                    throw new C13II(iLJIJJ);
            }
        }
    }

    @Override // X.InterfaceC19984413He
    public final void serialize(C13HD c13hd, Object obj) {
        C19282410cA c19282410cA = (C19282410cA) obj;
        InterfaceC19983313Gt interfaceC19983313Gt = descriptor;
        InterfaceC19986513Hz interfaceC19986513HzLIZIZ = c13hd.LIZIZ(interfaceC19983313Gt);
        if (interfaceC19986513HzLIZIZ.LJIJJ() || c19282410cA.LIZ != 0) {
            interfaceC19986513HzLIZIZ.LJFF(interfaceC19983313Gt, 0, c19282410cA.LIZ);
        }
        if (interfaceC19986513HzLIZIZ.LJIJJ() || !Intrinsics.LJFF(c19282410cA.LIZIZ, "")) {
            interfaceC19986513HzLIZIZ.LJIILIIL(interfaceC19983313Gt, 1, c19282410cA.LIZIZ);
        }
        if (interfaceC19986513HzLIZIZ.LJIJJ() || !Intrinsics.LJFF(c19282410cA.LIZJ, "")) {
            interfaceC19986513HzLIZIZ.LJIILIIL(interfaceC19983313Gt, 2, c19282410cA.LIZJ);
        }
        if (interfaceC19986513HzLIZIZ.LJIJJ() || c19282410cA.LIZLLL != 0) {
            interfaceC19986513HzLIZIZ.LJ(3, c19282410cA.LIZLLL, interfaceC19983313Gt);
        }
        if (interfaceC19986513HzLIZIZ.LJIJJ() || c19282410cA.LJ != 0) {
            interfaceC19986513HzLIZIZ.LJ(4, c19282410cA.LJ, interfaceC19983313Gt);
        }
        if (interfaceC19986513HzLIZIZ.LJIJJ() || c19282410cA.LJFF != 0) {
            interfaceC19986513HzLIZIZ.LJ(5, c19282410cA.LJFF, interfaceC19983313Gt);
        }
        if (interfaceC19986513HzLIZIZ.LJIJJ() || c19282410cA.LJI != 0) {
            interfaceC19986513HzLIZIZ.LJ(6, c19282410cA.LJI, interfaceC19983313Gt);
        }
        interfaceC19986513HzLIZIZ.LIZLLL();
    }
}
