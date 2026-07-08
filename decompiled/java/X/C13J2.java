package X;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13J2, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13J2 {
    /* JADX WARN: Type inference failed for: r1v5, types: [X.13IV] */
    public static C13IV LIZ(Function1 function1) {
        C13J1 c13j1 = new C13J1(AbstractC19987213Ig.LIZLLL);
        function1.invoke(c13j1);
        if (c13j1.LJIILL) {
            if (Intrinsics.LJFF(c13j1.LJII, "type")) {
                if (c13j1.LJIIIIZZ != EnumC1779370wP9.POLYMORPHIC) {
                    "useArrayPolymorphism option can only be used if classDiscriminatorMode in a default POLYMORPHIC state.".toString();
                    throw new IllegalArgumentException("useArrayPolymorphism option can only be used if classDiscriminatorMode in a default POLYMORPHIC state.");
                }
            } else {
                "Class discriminator should not be specified when array polymorphism is specified".toString();
                throw new IllegalArgumentException("Class discriminator should not be specified when array polymorphism is specified");
            }
        }
        if (!c13j1.LJ) {
            if (!Intrinsics.LJFF(c13j1.LJFF, "    ")) {
                "Indent should not be specified when default printing mode is used".toString();
                throw new IllegalArgumentException("Indent should not be specified when default printing mode is used");
            }
        } else if (!Intrinsics.LJFF(c13j1.LJFF, "    ")) {
            String str = c13j1.LJFF;
            for (int i = 0; i < str.length(); i++) {
                char cCharAt = str.charAt(i);
                if (cCharAt != ' ' && cCharAt != '\t' && cCharAt != '\r' && cCharAt != '\n') {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Only whitespace, tab, newline and carriage return are allowed as pretty print symbols. Had ");
                    sbLIZ.append(c13j1.LJFF);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    strLIZIZ.toString();
                    throw new IllegalArgumentException(strLIZIZ);
                }
            }
        }
        final C19988913Ix c19988913Ix = new C19988913Ix(c13j1.LIZ, c13j1.LIZJ, c13j1.LIZLLL, c13j1.LJIILJJIL, c13j1.LJ, c13j1.LIZIZ, c13j1.LJFF, c13j1.LJI, c13j1.LJIILL, c13j1.LJII, c13j1.LJIILIIL, c13j1.LJIIIZ, c13j1.LJIIJ, c13j1.LJIIJJI, c13j1.LJIIL, c13j1.LJIIIIZZ);
        final AbstractC19984913Hj abstractC19984913Hj = c13j1.LJIILLIIL;
        return new AbstractC19987213Ig(c19988913Ix, abstractC19984913Hj) { // from class: X.13IV
            {
                super(c19988913Ix, abstractC19984913Hj);
                if (!Intrinsics.LJFF(abstractC19984913Hj, C13G7.LIZ)) {
                    abstractC19984913Hj.LIZ(new C13IU(c19988913Ix));
                }
            }
        };
    }
}
