package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0JlX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C501450JlX {
    public static String LIZ(C0X52 c0x52) {
        List<C080U> listLIZIZ = c0x52.LIZ.LIZIZ("X-Tt-Logid");
        if (listLIZIZ != null && listLIZIZ.size() > 0) {
            return ((C080U) ListProtector.get(listLIZIZ, 0)).LIZIZ;
        }
        return "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0265  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(com.bytedance.retrofit2.client.Request r19, X.C0X52 r20) {
        /*
            Method dump skipped, instruction units count: 1344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C501450JlX.LIZIZ(com.bytedance.retrofit2.client.Request, X.0X52):void");
    }

    public static void LIZJ(int i, String str, JSONObject jSONObject) {
        try {
            jSONObject.put(str, i);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LIZLLL(String str, String str2, JSONObject jSONObject) {
        try {
            jSONObject.put(str, str2);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
