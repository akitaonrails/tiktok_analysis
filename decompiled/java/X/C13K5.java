package X;

import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13K5, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
@InterfaceC1294060jmO
public /* synthetic */ class C13K5 implements C13H1<C13K4> {
    public static final C13K5 LIZ;
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
        C13K5 c13k5 = new C13K5();
        LIZ = c13k5;
        C19983913Gz c19983913Gz = new C19983913Gz("com.tiktok.kmp.nuj.framework.strategy.NUAbilityNode", c13k5, 7);
        c19983913Gz.LJIIJ(FollowStatusChangeMethod.PARAM_UID, true);
        c19983913Gz.LJIIJ("desc", true);
        c19983913Gz.LJIIJ("fallback_result", true);
        c19983913Gz.LJIIJ("filters", true);
        c19983913Gz.LJIIJ("triggers", true);
        c19983913Gz.LJIIJ("target_link", true);
        c19983913Gz.LJIIJ("functions", true);
        descriptor = c19983913Gz;
    }

    @Override // X.C13H1
    public final C13HG<?>[] childSerializers() {
        C01GW<C13HG<Object>>[] c01gwArr = C13K4.LJII;
        C13GX c13gx = C13GX.LIZ;
        return new C13HG[]{c13gx, c13gx, C19983613Gw.LIZ(c13gx), c01gwArr[3].getValue(), c01gwArr[4].getValue(), c01gwArr[5].getValue(), c01gwArr[6].getValue()};
    }

    @Override // X.InterfaceC19984213Hc
    public final Object deserialize(C13HB c13hb) {
        InterfaceC19983313Gt interfaceC19983313Gt = descriptor;
        InterfaceC19986313Hx interfaceC19986313HxLIZIZ = c13hb.LIZIZ(interfaceC19983313Gt);
        C01GW<C13HG<Object>>[] c01gwArr = C13K4.LJII;
        interfaceC19986313HxLIZIZ.LJJII();
        String strLJIILL = null;
        int i = 0;
        String strLJIILL2 = null;
        String str = null;
        List list = null;
        List list2 = null;
        List list3 = null;
        List list4 = null;
        while (true) {
            int iLJIJJ = interfaceC19986313HxLIZIZ.LJIJJ(interfaceC19983313Gt);
            switch (iLJIJJ) {
                case -1:
                    interfaceC19986313HxLIZIZ.LJIIJJI(interfaceC19983313Gt);
                    return new C13K4(i, strLJIILL, strLJIILL2, str, list, list2, list3, list4);
                case 0:
                    strLJIILL = interfaceC19986313HxLIZIZ.LJIILL(interfaceC19983313Gt, 0);
                    i |= 1;
                    break;
                case 1:
                    strLJIILL2 = interfaceC19986313HxLIZIZ.LJIILL(interfaceC19983313Gt, 1);
                    i |= 2;
                    break;
                case 2:
                    str = (String) interfaceC19986313HxLIZIZ.LJIIIZ(interfaceC19983313Gt, 2, C13GX.LIZ, str);
                    i |= 4;
                    break;
                case 3:
                    list = (List) interfaceC19986313HxLIZIZ.LJI(interfaceC19983313Gt, 3, c01gwArr[3].getValue(), list);
                    i |= 8;
                    break;
                case 4:
                    list2 = (List) interfaceC19986313HxLIZIZ.LJI(interfaceC19983313Gt, 4, c01gwArr[4].getValue(), list2);
                    i |= 16;
                    break;
                case 5:
                    list3 = (List) interfaceC19986313HxLIZIZ.LJI(interfaceC19983313Gt, 5, c01gwArr[5].getValue(), list3);
                    i |= 32;
                    break;
                case 6:
                    list4 = (List) interfaceC19986313HxLIZIZ.LJI(interfaceC19983313Gt, 6, c01gwArr[6].getValue(), list4);
                    i |= 64;
                    break;
                default:
                    throw new C13II(iLJIJJ);
            }
        }
    }

    @Override // X.InterfaceC19984413He
    public final void serialize(C13HD c13hd, Object obj) {
        C13K4 c13k4 = (C13K4) obj;
        InterfaceC19983313Gt interfaceC19983313Gt = descriptor;
        InterfaceC19986513Hz interfaceC19986513HzLIZIZ = c13hd.LIZIZ(interfaceC19983313Gt);
        C01GW<C13HG<Object>>[] c01gwArr = C13K4.LJII;
        if (interfaceC19986513HzLIZIZ.LJIJJ() || !Intrinsics.LJFF(c13k4.LIZ, "")) {
            interfaceC19986513HzLIZIZ.LJIILIIL(interfaceC19983313Gt, 0, c13k4.LIZ);
        }
        if (interfaceC19986513HzLIZIZ.LJIJJ() || !Intrinsics.LJFF(c13k4.LIZIZ, "")) {
            interfaceC19986513HzLIZIZ.LJIILIIL(interfaceC19983313Gt, 1, c13k4.LIZIZ);
        }
        if (interfaceC19986513HzLIZIZ.LJIJJ() || c13k4.LIZJ != null) {
            interfaceC19986513HzLIZIZ.LJIIZILJ(interfaceC19983313Gt, 2, C13GX.LIZ, c13k4.LIZJ);
        }
        if (interfaceC19986513HzLIZIZ.LJIJJ() || !Intrinsics.LJFF(c13k4.LIZLLL, C13BV.INSTANCE)) {
            interfaceC19986513HzLIZIZ.LJJIIJ(interfaceC19983313Gt, 3, c01gwArr[3].getValue(), c13k4.LIZLLL);
        }
        if (interfaceC19986513HzLIZIZ.LJIJJ() || !Intrinsics.LJFF(c13k4.LJ, C13BV.INSTANCE)) {
            interfaceC19986513HzLIZIZ.LJJIIJ(interfaceC19983313Gt, 4, c01gwArr[4].getValue(), c13k4.LJ);
        }
        if (interfaceC19986513HzLIZIZ.LJIJJ() || !Intrinsics.LJFF(c13k4.LJFF, C13BV.INSTANCE)) {
            interfaceC19986513HzLIZIZ.LJJIIJ(interfaceC19983313Gt, 5, c01gwArr[5].getValue(), c13k4.LJFF);
        }
        if (interfaceC19986513HzLIZIZ.LJIJJ() || !Intrinsics.LJFF(c13k4.LJI, C13BV.INSTANCE)) {
            interfaceC19986513HzLIZIZ.LJJIIJ(interfaceC19983313Gt, 6, c01gwArr[6].getValue(), c13k4.LJI);
        }
        interfaceC19986513HzLIZIZ.LIZLLL();
    }
}
