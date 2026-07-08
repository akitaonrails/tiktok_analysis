package X;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.15sJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20656515sJ {
    public final long[] LIZ;
    public final long[] LIZIZ;

    public C20656515sJ() {
        int length = EnumC20656915sN.values().length;
        long[] jArr = new long[length];
        for (int i = 0; i < length; i++) {
            jArr[i] = -1;
        }
        this.LIZ = jArr;
        int length2 = EnumC20656915sN.values().length;
        long[] jArr2 = new long[length2];
        for (int i2 = 0; i2 < length2; i2++) {
            jArr2[i2] = -1;
        }
        this.LIZIZ = jArr2;
    }

    public final void LIZ(Map<String, String> map) {
        for (EnumC20656915sN enumC20656915sN : EnumC20656915sN.values()) {
            long j = this.LIZ[enumC20656915sN.ordinal()];
            long j2 = this.LIZIZ[enumC20656915sN.ordinal()];
            if (j > 0 && j2 > 0) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("cost_time_");
                sbLIZ.append(enumC20656915sN.getStage());
                long j3 = j2 - j;
                ((HashMap) map).put(C2188811AlT.LIZIZ(sbLIZ), String.valueOf(j3));
                int i = C2187451AjH.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("performance:cost_time_");
                sbLIZ2.append(enumC20656915sN.getStage());
                sbLIZ2.append(": ");
                sbLIZ2.append(j3);
                sbLIZ2.append("ms");
                C20651915rZ.LIZIZ(C2188811AlT.LIZIZ(sbLIZ2));
            }
        }
    }
}
