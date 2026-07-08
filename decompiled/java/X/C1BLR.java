package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1BLR, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BLR {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(C1BLC c1blc) {
        try {
            JSONObject jSONObject = new JSONObject(c1blc.LJFF());
            C793770VBv.LJII("df_install_start", jSONObject, null, null);
            if (c1blc instanceof C1BLX) {
                int i = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("InstallStart:");
                sbLIZ.append(jSONObject);
                C1720106oR.LJI("DynamicLanguageTask", C2188811AlT.LIZIZ(sbLIZ));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0040 A[Catch: Exception -> 0x0105, TRY_LEAVE, TryCatch #1 {Exception -> 0x0105, blocks: (B:2:0x0000, B:24:0x00a9, B:41:0x00ff, B:34:0x00ba, B:36:0x00d3, B:37:0x00e6, B:39:0x00ec, B:40:0x00f3, B:8:0x0036, B:23:0x00a2, B:11:0x0040, B:18:0x0064, B:21:0x0079, B:16:0x0060, B:12:0x0049), top: B:48:0x0000, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(X.C1BLC r10, int r11, X.C1BLM r12) {
        /*
            Method dump skipped, instruction units count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1BLR.LIZ(X.1BLC, int, X.1BLM):void");
    }
}
