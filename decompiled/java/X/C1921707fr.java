package X;

/* JADX INFO: renamed from: X.07fr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1921707fr {
    public static final Object LIZ(boolean z, boolean z2, InterfaceC1921807fs interfaceC1921807fs, InterfaceC1921807fs interfaceC1921807fs2) {
        boolean z3 = true;
        if (interfaceC1921807fs2 instanceof C12872051y) {
            Long lLIZLLL = interfaceC1921807fs.LIZLLL();
            if (lLIZLLL != null) {
                long jLongValue = lLIZLLL.longValue();
                if (!z ? jLongValue >= ((C12872051y) interfaceC1921807fs2).LIZ : jLongValue <= ((C12872051y) interfaceC1921807fs2).LIZ) {
                    if (!z2 || jLongValue != ((C12872051y) interfaceC1921807fs2).LIZ) {
                        z3 = false;
                    }
                }
                Boolean boolValueOf = Boolean.valueOf(z3);
                C189200o6.m2constructorimpl(boolValueOf);
                return boolValueOf;
            }
            C098200Yq c098200Yq = new C098200Yq(new IllegalArgumentException("Invalid param for CompareOp!"));
            C189200o6.m2constructorimpl(c098200Yq);
            return c098200Yq;
        }
        if (interfaceC1921807fs2 instanceof C1921607fq) {
            Double dLIZJ = interfaceC1921807fs.LIZJ();
            if (dLIZJ != null) {
                double dDoubleValue = dLIZJ.doubleValue();
                if (!z ? dDoubleValue >= ((C1921607fq) interfaceC1921807fs2).LIZ : dDoubleValue <= ((C1921607fq) interfaceC1921807fs2).LIZ) {
                    if (!z2 || dDoubleValue != ((C1921607fq) interfaceC1921807fs2).LIZ) {
                        z3 = false;
                    }
                }
                Boolean boolValueOf2 = Boolean.valueOf(z3);
                C189200o6.m2constructorimpl(boolValueOf2);
                return boolValueOf2;
            }
            C098200Yq c098200Yq2 = new C098200Yq(new IllegalArgumentException("Invalid param for CompareOp!"));
            C189200o6.m2constructorimpl(c098200Yq2);
            return c098200Yq2;
        }
        C098200Yq c098200Yq3 = new C098200Yq(new IllegalArgumentException("CompareOp only support number type!"));
        C189200o6.m2constructorimpl(c098200Yq3);
        return c098200Yq3;
    }
}
