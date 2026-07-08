package X;

import java.util.List;
import kotlin.jvm.internal.AwS564S0100000_20;
import kotlin.jvm.internal.AwS599S0100000_20;

/* JADX INFO: renamed from: X.0kbj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1325890kbj implements InterfaceC1325980kbs {
    public final InterfaceC1326050kbz LIZ;

    public C1325890kbj(C1326020kbw c1326020kbw) {
        this.LIZ = c1326020kbw;
    }

    public static Object LIZIZ(C1325710kbR c1325710kbR, InterfaceC1364105Vn interfaceC1364105Vn) {
        final C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        C1321200kUA c1321200kUALJIILIIL = C1322200kVm.LIZ().LJIILIIL(c1325710kbR);
        c1321200kUALJIILIIL.LIZJ(new C0HWE<Boolean>() { // from class: X.0kak
            @Override // X.C0HWE
            public final void LJ(InterfaceC1320200kSY<Boolean> interfaceC1320200kSY) {
                InterfaceC20236714Gf<Boolean> interfaceC20236714Gf = c2252611DEt;
                Boolean bool = Boolean.FALSE;
                C189200o6.m2constructorimpl(bool);
                interfaceC20236714Gf.resumeWith(bool);
                if (interfaceC1320200kSY != null) {
                    interfaceC1320200kSY.close();
                }
            }

            @Override // X.C0HWE
            public final void LJFF(InterfaceC1320200kSY<Boolean> interfaceC1320200kSY) {
                boolean zBooleanValue = false;
                if (interfaceC1320200kSY != null && interfaceC1320200kSY.LIZ()) {
                    InterfaceC20236714Gf<Boolean> interfaceC20236714Gf = c2252611DEt;
                    Boolean result = interfaceC1320200kSY.getResult();
                    if (result != null) {
                        zBooleanValue = result.booleanValue();
                    }
                    Boolean boolValueOf = Boolean.valueOf(zBooleanValue);
                    C189200o6.m2constructorimpl(boolValueOf);
                    interfaceC20236714Gf.resumeWith(boolValueOf);
                } else {
                    InterfaceC20236714Gf<Boolean> interfaceC20236714Gf2 = c2252611DEt;
                    Boolean bool = Boolean.FALSE;
                    C189200o6.m2constructorimpl(bool);
                    interfaceC20236714Gf2.resumeWith(bool);
                    if (interfaceC1320200kSY == null) {
                        return;
                    }
                }
                interfaceC1320200kSY.close();
            }
        }, C823050WQl.LIZLLL());
        c2252611DEt.LJJII(new AwS599S0100000_20(c1321200kUALJIILIIL, 34));
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLJIJ;
    }

    public final Object LIZJ(C1325710kbR c1325710kbR, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        final C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        InterfaceC1326050kbz interfaceC1326050kbz = this.LIZ;
        new AwS564S0100000_20(c1325710kbR, 27);
        interfaceC1326050kbz.LJ();
        AbstractC1321260kUG abstractC1321260kUGLJIJ = C1322200kVm.LIZ().LJIJ(c1325710kbR, "ecom_operation_resource");
        abstractC1321260kUGLJIJ.LIZJ(new C0HWE<Void>() { // from class: X.0kbk
            @Override // X.C0HWE
            public final void LJ(InterfaceC1320200kSY<Void> interfaceC1320200kSY) {
                if (c2252611DEt.isActive()) {
                    InterfaceC20236714Gf<Boolean> interfaceC20236714Gf = c2252611DEt;
                    Boolean bool = Boolean.FALSE;
                    C189200o6.m2constructorimpl(bool);
                    interfaceC20236714Gf.resumeWith(bool);
                }
            }

            @Override // X.C0HWE
            public final void LJFF(InterfaceC1320200kSY<Void> interfaceC1320200kSY) {
                if (interfaceC1320200kSY == null) {
                    if (c2252611DEt.isActive()) {
                        InterfaceC20236714Gf<Boolean> interfaceC20236714Gf = c2252611DEt;
                        Boolean bool = Boolean.FALSE;
                        C189200o6.m2constructorimpl(bool);
                        interfaceC20236714Gf.resumeWith(bool);
                        return;
                    }
                    return;
                }
                if (interfaceC1320200kSY.LIZ() && c2252611DEt.isActive()) {
                    InterfaceC20236714Gf<Boolean> interfaceC20236714Gf2 = c2252611DEt;
                    Boolean bool2 = Boolean.TRUE;
                    C189200o6.m2constructorimpl(bool2);
                    interfaceC20236714Gf2.resumeWith(bool2);
                }
            }
        }, C823050WQl.LIZLLL());
        c2252611DEt.LJJII(new AwS599S0100000_20(abstractC1321260kUGLJIJ, 35));
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLJIJ;
    }

    @Override // X.InterfaceC1325980kbs
    public final Object LIZ(int i, List list, InterfaceC1364105Vn interfaceC1364105Vn) {
        return C2296808zG.LJ(new C1325920kbm(list, this, i, null), interfaceC1364105Vn);
    }
}
