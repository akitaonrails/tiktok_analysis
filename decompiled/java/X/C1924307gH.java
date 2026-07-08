package X;

import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07gH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1924307gH {
    public final Map<String, Function0<InterfaceC1921807fs>> LIZ;

    /* JADX WARN: Multi-variable type inference failed */
    public C1924307gH(Map<String, ? extends Function0<? extends InterfaceC1921807fs>> map) {
        this.LIZ = map;
    }

    public static Object LIZ(Iterator it2) {
        if (!it2.hasNext()) {
            Boolean bool = Boolean.TRUE;
            C189200o6.m2constructorimpl(bool);
            return bool;
        }
        C1924407gI c1924407gI = (C1924407gI) it2.next();
        if (c1924407gI.LIZLLL == EnumC1980707pN.OPERATOR && Intrinsics.LJFF(c1924407gI.LIZ(), "&")) {
            Boolean bool2 = Boolean.TRUE;
            C189200o6.m2constructorimpl(bool2);
            return bool2;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Syntax error, except '&' or EOF, got '");
        sbLIZ.append(c1924407gI.LIZ());
        sbLIZ.append("'!");
        C098200Yq c098200Yq = new C098200Yq(new Error(C2188811AlT.LIZIZ(sbLIZ)));
        C189200o6.m2constructorimpl(c098200Yq);
        return c098200Yq;
    }

    public static Object LIZIZ(C1924407gI c1924407gI) {
        int i = C1924507gJ.LIZ[c1924407gI.LIZLLL.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Syntax error, Single value excepted, but got ");
                    sbLIZ.append(c1924407gI.LIZ());
                    C098200Yq c098200Yq = new C098200Yq(new Error(C2188811AlT.LIZIZ(sbLIZ)));
                    C189200o6.m2constructorimpl(c098200Yq);
                    return c098200Yq;
                }
                String strLIZ = c1924407gI.LIZ();
                if (Intrinsics.LJFF(strLIZ, "true")) {
                    C12870051w c12870051w = new C12870051w(true);
                    C189200o6.m2constructorimpl(c12870051w);
                    return c12870051w;
                }
                if (Intrinsics.LJFF(strLIZ, "false")) {
                    C12870051w c12870051w2 = new C12870051w(false);
                    C189200o6.m2constructorimpl(c12870051w2);
                    return c12870051w2;
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Syntax error, invalid identifier here: ");
                sbLIZ2.append(strLIZ);
                C098200Yq c098200Yq2 = new C098200Yq(new Error(C2188811AlT.LIZIZ(sbLIZ2)));
                C189200o6.m2constructorimpl(c098200Yq2);
                return c098200Yq2;
            }
            C1922907g3 c1922907g3 = new C1922907g3(c1924407gI.LIZ());
            C189200o6.m2constructorimpl(c1922907g3);
            return c1922907g3;
        }
        String strLIZ2 = c1924407gI.LIZ();
        Long lLJIILIIL = C2095008Iq.LJIILIIL(strLIZ2);
        if (lLJIILIIL != null) {
            C12872051y c12872051y = new C12872051y(lLJIILIIL.longValue());
            C189200o6.m2constructorimpl(c12872051y);
            return c12872051y;
        }
        Double dLJII = C2327809Ae.LJII(strLIZ2);
        if (dLJII != null) {
            C1921607fq c1921607fq = new C1921607fq(dLJII.doubleValue());
            C189200o6.m2constructorimpl(c1921607fq);
            return c1921607fq;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("Invalid number ");
        sbLIZ3.append(strLIZ2);
        sbLIZ3.append('!');
        C098200Yq c098200Yq3 = new C098200Yq(new Error(C2188811AlT.LIZIZ(sbLIZ3)));
        C189200o6.m2constructorimpl(c098200Yq3);
        return c098200Yq3;
    }
}
