package X;

import com.bytedance.forest.experiments.ForestExperiment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.text.CharsKt__CharJVMKt;

/* JADX INFO: renamed from: X.0q15, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1533810q15 {
    public final Map<String, String> LIZ;
    public int LIZIZ;
    public int LIZJ;
    public Boolean LIZLLL;

    public final Integer LIZJ() {
        Object c098200Yq;
        try {
            int i = this.LIZIZ;
            CharsKt__CharJVMKt.checkRadix(10);
            String string = Integer.toString(i, 10);
            c098200Yq = C1244080iTm.LIZ(string.charAt(string.length() - (C1531180pwq.LIZ.indexOf("gecko") + 2)));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        return (Integer) c098200Yq;
    }

    public C1533810q15() {
        this.LIZ = ForestExperiment.INSTANCE.getOptimizeErrorInfoMap() ? new LinkedHashMap<>() : new ConcurrentHashMap<>();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(": ");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        for (Map.Entry<String, String> entry : this.LIZ.entrySet()) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(strLIZIZ);
            sbLIZ2.append(entry.getKey());
            sbLIZ2.append("Error:");
            sbLIZ2.append(entry.getValue());
            sbLIZ2.append(", ");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        }
        return strLIZIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(java.lang.String r5) {
        /*
            r4 = this;
            java.util.Map<java.lang.String, java.lang.String> r0 = r4.LIZ
            java.lang.String r3 = "_pipeline"
            java.lang.Object r0 = r0.get(r3)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L1e
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            r1.append(r0)
            java.lang.String r0 = ", "
            r1.append(r0)
            java.lang.String r2 = X.C2188811AlT.LIZIZ(r1)
            if (r2 != 0) goto L20
        L1e:
            java.lang.String r2 = ""
        L20:
            java.util.Map<java.lang.String, java.lang.String> r1 = r4.LIZ
            java.lang.StringBuilder r0 = X.C2188811AlT.LIZ()
            r0.append(r2)
            r0.append(r5)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r0)
            r1.put(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1533810q15.LIZLLL(java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(java.lang.String r4, java.lang.String r5) {
        /*
            r3 = this;
            java.util.Map<java.lang.String, java.lang.String> r0 = r3.LIZ
            java.lang.Object r0 = r0.get(r4)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L1c
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            r1.append(r0)
            r0 = 32
            r1.append(r0)
            java.lang.String r2 = X.C2188811AlT.LIZIZ(r1)
            if (r2 != 0) goto L1e
        L1c:
            java.lang.String r2 = ""
        L1e:
            java.util.Map<java.lang.String, java.lang.String> r1 = r3.LIZ
            java.lang.StringBuilder r0 = X.C2188811AlT.LIZ()
            r0.append(r2)
            r0.append(r5)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r0)
            r1.put(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1533810q15.LIZ(java.lang.String, java.lang.String):void");
    }

    public final void LJ(int i, String str) {
        this.LIZIZ += i;
        LIZLLL(str);
    }

    public final void LIZIZ(int i, String str, String str2) {
        if (Integer.valueOf(C1531180pwq.LIZ.indexOf(str)).intValue() != -1) {
            this.LIZIZ += ((int) Math.pow(10.0d, r2.intValue() + 1)) * i;
        }
        this.LIZ.put(str, str2);
    }
}
