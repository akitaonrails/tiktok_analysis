package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.p;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.08kF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2203708kF {
    public static final /* synthetic */ int LIZ = 0;

    public static Map LIZ(String str) {
        String strLJIL;
        if (str == null) {
            return new HashMap();
        }
        HashMap map = new HashMap();
        try {
            new p();
            n nVarLJIILIIL = p.LIZJ(str).LJIILIIL();
            for (String str2 : nVarLJIILIIL.LJJIJIL()) {
                k kVarLJJIIZ = nVarLJIILIIL.LJJIIZ(str2);
                if (kVarLJJIIZ == null || (strLJIL = kVarLJJIIZ.LJIILJJIL().LJIL()) == null) {
                    strLJIL = "";
                }
                map.put(str2, strLJIL);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJFF(e, "extra helper json decode error");
        }
        return map;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
    
        r0 = r3.LJJIIZ(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        if (r0 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
    
        r0 = r0.LJIILJJIL().LJIL();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
    
        if (r0 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZIZ(java.lang.String r5) {
        /*
            java.lang.String r4 = ""
            if (r5 != 0) goto L5
            return r4
        L5:
            com.google.gson.p r0 = new com.google.gson.p     // Catch: java.lang.Exception -> L3f
            r0.<init>()     // Catch: java.lang.Exception -> L3f
            com.google.gson.k r0 = com.google.gson.p.LIZJ(r5)     // Catch: java.lang.Exception -> L3f
            com.google.gson.n r3 = r0.LJIILIIL()     // Catch: java.lang.Exception -> L3f
            java.util.Set r0 = r3.LJJIJIL()     // Catch: java.lang.Exception -> L3f
            java.util.Iterator r2 = r0.iterator()     // Catch: java.lang.Exception -> L3f
        L1a:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Exception -> L3f
            if (r0 == 0) goto L48
            java.lang.Object r1 = r2.next()     // Catch: java.lang.Exception -> L3f
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L3f
            java.lang.String r0 = "log_id"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)     // Catch: java.lang.Exception -> L3f
            if (r0 == 0) goto L1a
            com.google.gson.k r0 = r3.LJJIIZ(r1)     // Catch: java.lang.Exception -> L3f
            if (r0 == 0) goto L48
            com.google.gson.q r0 = r0.LJIILJJIL()     // Catch: java.lang.Exception -> L3f
            java.lang.String r0 = r0.LJIL()     // Catch: java.lang.Exception -> L3f
            if (r0 == 0) goto L48
            return r0
        L3f:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            java.lang.String r0 = "log id helper json decode error"
            X.C1AF0.LJFF(r1, r0)
        L48:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2203708kF.LIZIZ(java.lang.String):java.lang.String");
    }
}
