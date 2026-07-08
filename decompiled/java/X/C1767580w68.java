package X;

import com.bytedance.crash.Npth;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0w68, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1767580w68 {
    public static final C1767580w68 LIZ = new C1767580w68();

    /* JADX WARN: Removed duplicated region for block: B:18:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(X.C19EG r18, X.C1741260vPg r19, X.C1767790w6T r20) {
        /*
            Method dump skipped, instruction units count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1767580w68.LIZ(X.19EG, X.0vPg, X.0w6T):void");
    }

    public static void LIZIZ(String str, Throwable th, Map map) {
        Map mapLJ = C2097608Jq.LJ();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            if (!a0.LJJJIL((String) entry.getValue())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Npth.reportBizException("ec_mall_ug_refactor", th, str, mapLJ, linkedHashMap, true);
    }
}
