package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13IX, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13IX {
    public static final InterfaceC19983313Gt LIZ(InterfaceC19983313Gt interfaceC19983313Gt, AbstractC19984913Hj abstractC19984913Hj) {
        C13HG c13hgLIZJ;
        InterfaceC19983313Gt descriptor;
        InterfaceC19983313Gt interfaceC19983313GtLIZ;
        if (Intrinsics.LJFF(interfaceC19983313Gt.LIZIZ(), C13GV.LIZ)) {
            C13IQ<?> c13iqLIZ = C19983413Gu.LIZ(interfaceC19983313Gt);
            if (c13iqLIZ != null && (c13hgLIZJ = AbstractC19984913Hj.LIZJ(abstractC19984913Hj, c13iqLIZ)) != null && (descriptor = c13hgLIZJ.getDescriptor()) != null && (interfaceC19983313GtLIZ = LIZ(descriptor, abstractC19984913Hj)) != null) {
                return interfaceC19983313GtLIZ;
            }
        } else if (interfaceC19983313Gt.isInline()) {
            return LIZ(interfaceC19983313Gt.LJIIIIZZ(0), abstractC19984913Hj);
        }
        return interfaceC19983313Gt;
    }

    public static final EnumC19987013Ie LIZIZ(InterfaceC19983313Gt interfaceC19983313Gt, AbstractC19987213Ig abstractC19987213Ig) {
        C13GW c13gwLIZIZ = interfaceC19983313Gt.LIZIZ();
        if (c13gwLIZIZ instanceof C13GL) {
            return EnumC19987013Ie.POLY_OBJ;
        }
        if (Intrinsics.LJFF(c13gwLIZIZ, C19982613Gm.LIZ)) {
            return EnumC19987013Ie.LIST;
        }
        if (Intrinsics.LJFF(c13gwLIZIZ, C19982713Gn.LIZ)) {
            InterfaceC19983313Gt interfaceC19983313GtLIZ = LIZ(interfaceC19983313Gt.LJIIIIZZ(0), abstractC19987213Ig.LIZIZ);
            C13GW c13gwLIZIZ2 = interfaceC19983313GtLIZ.LIZIZ();
            if (!(c13gwLIZIZ2 instanceof C13HJ) && !Intrinsics.LJFF(c13gwLIZIZ2, C13GS.LIZ)) {
                if (abstractC19987213Ig.LIZ.LIZLLL) {
                    return EnumC19987013Ie.LIST;
                }
                throw C19988213Iq.LIZJ(interfaceC19983313GtLIZ);
            }
            return EnumC19987013Ie.MAP;
        }
        return EnumC19987013Ie.OBJ;
    }
}
