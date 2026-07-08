package X;

import android.text.TextUtils;
import com.bytedance.android.livesdk.media.ttlhadaptive.engine.StrategySettingConfig;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0j6o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1268280j6o {
    public final Map<String, AbstractC1268360j6w> LIZ;
    public InterfaceC1268370j6x LIZIZ;
    public final StrategySettingConfig LIZJ;
    public C1267290j5D LIZLLL;
    public final Map<String, C1266710j4H> LJ;
    public int LJFF;
    public boolean LJI;

    public static void LJ(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("api", "handleEvent");
            jSONObject.put("message", str);
            C1267490j5X.LIZ(jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:91:0x01db, code lost:
    
        r4.LIZ = -1;
        r6 = r1.LIZIZ();
        r2 = r4.LIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01e3, code lost:
    
        r1 = new org.json.JSONObject();
        r1.put("api", "handleEvent");
        r1.put("failed_rule_name", r6);
        r1.put("error_code", r2);
        r1.put("input_params", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01fa, code lost:
    
        r1.put("api", "handleEvent");
        X.C1267490j5X.LIZ(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0201, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0202, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0206, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0207, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:120:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(java.util.Map r16) {
        /*
            Method dump skipped, instruction units count: 848
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1268280j6o.LIZ(java.util.Map):void");
    }

    public static void LIZJ(C1266710j4H c1266710j4H, int i) {
        if (c1266710j4H != null) {
            c1266710j4H.LIZJ++;
            ((ArrayList) c1266710j4H.LIZLLL).add(Integer.valueOf(i));
        }
    }

    public static void LIZLLL(int i, int i2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("api", "ttlh_adaptive_rule_search");
            jSONObject.put("is_succeed", i);
            jSONObject.put("error_code", i2);
            C1267490j5X.LIZ(jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void LIZIZ(int i, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("action", "fail");
            jSONObject.put("failed_process", str);
            jSONObject.put("node_cnt", i);
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("missing_rule_name", str2);
            }
            jSONObject.put("feature_null_count", this.LJFF);
            InterfaceC1267460j5U interfaceC1267460j5U = C1267480j5W.LIZ.LIZ;
            if (interfaceC1267460j5U != null) {
                ((C1266460j3s) interfaceC1267460j5U).LIZ("ttlh_adaptive_framework_execute", jSONObject);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00a6 A[Catch: Exception -> 0x013d, TryCatch #2 {Exception -> 0x013d, blocks: (B:31:0x009c, B:33:0x00a2, B:35:0x00a6, B:37:0x00ac, B:40:0x00b2), top: B:101:0x009c }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1268280j6o(com.bytedance.android.livesdk.media.ttlhadaptive.engine.StrategySettingConfig r19, java.util.Map<java.lang.String, com.bytedance.android.livesdk.media.ttlhadaptive.engine.StrategyNodeConfig> r20, android.content.Context r21, com.bytedance.android.starship.engine.strategy.IStarShipStrategy r22) {
        /*
            Method dump skipped, instruction units count: 594
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1268280j6o.<init>(com.bytedance.android.livesdk.media.ttlhadaptive.engine.StrategySettingConfig, java.util.Map, android.content.Context, com.bytedance.android.starship.engine.strategy.IStarShipStrategy):void");
    }
}
