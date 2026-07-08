package X;

import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0phQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1521620phQ implements InterfaceC1521900phs {
    public final AbstractC1514820pWS<?> LIZ;
    public final boolean LIZIZ;

    public C1521620phQ(AbstractC1514820pWS<?> abstractC1514820pWS, boolean z) {
        this.LIZ = abstractC1514820pWS;
        this.LIZIZ = z;
    }

    @Override // X.InterfaceC1521900phs
    public final void LIZ(Object obj, final AbstractC1521830phl abstractC1521830phl) {
        final String strOptString;
        if (obj != null && (obj instanceof JSONObject)) {
            if (!this.LIZIZ) {
                strOptString = ((JSONObject) obj).optString("name");
            } else {
                strOptString = ((JSONObject) obj).optString("qualifiedName");
            }
            if ((!a0.LJJJIL(strOptString)) && strOptString != null) {
                Long lValueOf = Long.valueOf(((JSONObject) obj).optLong("value", -1L));
                if (lValueOf.longValue() >= 0) {
                    final long jLongValue = lValueOf.longValue();
                    C1491570oux.LJI(C1491570oux.LIZ, this.LIZ.LLILZIL, new InterfaceC1491630ov3() { // from class: X.0phR
                        @Override // X.InterfaceC1491630ov3
                        public final void onReceiveValue(Object obj2) {
                            C1491690ov9 c1491690ov9 = (C1491690ov9) obj2;
                            if (c1491690ov9 != null) {
                                if (!this.LIZ.LIZIZ) {
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("user_");
                                    sbLIZ.append(strOptString);
                                    c1491690ov9.LIZLLL(C2188811AlT.LIZIZ(sbLIZ), Long.valueOf(jLongValue));
                                    return;
                                }
                                c1491690ov9.LIZLLL(strOptString, Long.valueOf(jLongValue));
                                return;
                            }
                            abstractC1521830phl.LIZ();
                        }
                    });
                    return;
                } else {
                    abstractC1521830phl.LIZ();
                    return;
                }
            }
            abstractC1521830phl.LIZ();
            return;
        }
        abstractC1521830phl.LIZ();
    }
}
