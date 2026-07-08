package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.n;
import kotlin.jvm.internal.AFwS212S0000000_23;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0pzZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1532870pzZ {
    public static final C1532870pzZ LIZ = new C1532870pzZ();
    public static final C21328418dO LIZIZ = new C21328418dO(0);
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(117));
    public static volatile String LIZLLL;

    public static String LIZ() {
        String strLJIJ;
        InterfaceC1532860pzY.LIZ.getClass();
        InterfaceC1532860pzY interfaceC1532860pzY = C1532910pzd.LIZJ;
        String string = null;
        if (interfaceC1532860pzY != null && (strLJIJ = interfaceC1532860pzY.LJIJ()) != null && (!a0.LJJJIL(strLJIJ))) {
            LIZ.getClass();
            LJ(strLJIJ);
            return strLJIJ;
        }
        String str = LIZLLL;
        if (str == null) {
            string = ((Keva) LIZJ.getValue()).getString("User-Agent", null);
            LIZLLL = string != null ? string : "";
        } else if (!Intrinsics.LJFF(str, "")) {
            return LIZLLL;
        }
        return string;
    }

    public static void LJ(String str) {
        String str2 = LIZLLL;
        if (str2 != null && str2.hashCode() == str.hashCode()) {
            return;
        }
        LIZLLL = str;
        ((Keva) LIZJ.getValue()).storeString("User-Agent", str);
    }

    public static boolean LIZLLL(String str, n nVar, C08FT c08ft) {
        Object c098200Yq;
        Object c098200Yq2;
        Object c098200Yq3 = null;
        try {
            k kVarLJJIIZ = nVar.LJJIIZ("expression");
            if (kVarLJJIIZ != null) {
                c098200Yq = kVarLJJIIZ.LJIL();
            } else {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            C1532930pzf c1532930pzf = C1532930pzf.LIZJ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("expression of ");
            sbLIZ.append(str);
            sbLIZ.append(" is not a string");
            c1532930pzf.LIZIZ("ParamParser", "parseRule", C2188811AlT.LIZIZ(sbLIZ));
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        String str2 = (String) c098200Yq;
        if (str2 != null) {
            Object objLIZ = LIZIZ.LIZ(str2, c08ft.LLILLL, null, null);
            if (!(objLIZ instanceof Boolean)) {
                objLIZ = null;
            }
            if (Intrinsics.LJFF(objLIZ, Boolean.TRUE)) {
                try {
                    c098200Yq2 = nVar.LJJIIZ("result_value");
                    C189200o6.m2constructorimpl(c098200Yq2);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    c098200Yq2 = new C098200Yq(th2);
                    C189200o6.m2constructorimpl(c098200Yq2);
                }
                if (C189200o6.m5exceptionOrNullimpl(c098200Yq2) != null) {
                    C1532930pzf c1532930pzf2 = C1532930pzf.LIZJ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("result_value of ");
                    sbLIZ2.append(str);
                    sbLIZ2.append(" is not a string");
                    c1532930pzf2.LIZIZ("ParamParser", "parseRule", C2188811AlT.LIZIZ(sbLIZ2));
                }
                if (C189200o6.m7isFailureimpl(c098200Yq2)) {
                    c098200Yq2 = null;
                }
                k kVar = (k) c098200Yq2;
                if (kVar != null) {
                    c08ft.LIZIZ(kVar, str, false);
                    return true;
                }
                try {
                    k kVarLJJIIZ2 = nVar.LJJIIZ("result_context_key");
                    if (kVarLJJIIZ2 != null) {
                        c098200Yq3 = kVarLJJIIZ2.LJIL();
                    }
                    C189200o6.m2constructorimpl(c098200Yq3);
                } catch (Throwable th3) {
                    TryCatchGuardChecker.doCheck(th3);
                    c098200Yq3 = new C098200Yq(th3);
                    C189200o6.m2constructorimpl(c098200Yq3);
                }
                if (C189200o6.m5exceptionOrNullimpl(c098200Yq3) != null) {
                    C1532930pzf c1532930pzf3 = C1532930pzf.LIZJ;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("result_context_key of ");
                    sbLIZ3.append(str);
                    sbLIZ3.append(" is not a string");
                    c1532930pzf3.LIZIZ("ParamParser", "parseRule", C2188811AlT.LIZIZ(sbLIZ3));
                }
                if (!C189200o6.m7isFailureimpl(c098200Yq3) && c098200Yq3 != null) {
                    Object obj = c08ft.LLILLL.get(c098200Yq3);
                    if (obj == null) {
                        C1532930pzf c1532930pzf4 = C1532930pzf.LIZJ;
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("result_context_key of ");
                        sbLIZ4.append(str);
                        sbLIZ4.append(" is missing in the params");
                        c1532930pzf4.LIZIZ("ParamParser", "parseRule", C2188811AlT.LIZIZ(sbLIZ4));
                    } else {
                        c08ft.LIZJ(str, obj.toString(), false);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x0254 A[Catch: all -> 0x025f, TryCatch #11 {all -> 0x025f, blocks: (B:133:0x024e, B:135:0x0254, B:136:0x0259), top: B:280:0x024e }] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x035e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0078 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C08FT LIZIZ(com.google.gson.n r19, boolean r20, java.util.Map r21, X.InterfaceC1514200pVS r22, boolean r23) {
        /*
            Method dump skipped, instruction units count: 1199
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1532870pzZ.LIZIZ(com.google.gson.n, boolean, java.util.Map, X.0pVS, boolean):X.08FT");
    }
}
