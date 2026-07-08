package X;

import com.bytedance.android.bcm.api.model.BcmParams;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0w56, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public class C1766940w56 {
    public final String LIZ;
    public String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final Boolean LJ;
    public final String LJFF;
    public final String LJI;
    public final Boolean LJII;
    public final String LJIIIIZZ;
    public C1766990w5B LJIIIZ;

    public JSONObject LIZ() {
        BcmParams bcmParams;
        BcmParams bcmParams2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("page_id", this.LIZ);
            jSONObject.put("btm", this.LIZIZ);
            jSONObject.put("btm_show_id", this.LIZJ);
            JSONObject jSONObject2 = new JSONObject();
            try {
                C1766990w5B c1766990w5B = this.LJIIIZ;
                JSONObject jSONObject3 = null;
                jSONObject2.put("page", (c1766990w5B == null || (bcmParams2 = c1766990w5B.LIZ) == null) ? null : bcmParams2.toJSONObject());
                C1766990w5B c1766990w5B2 = this.LJIIIZ;
                if (c1766990w5B2 != null && (bcmParams = c1766990w5B2.LIZIZ) != null) {
                    jSONObject3 = bcmParams.toJSONObject();
                }
                jSONObject2.put("unit", jSONObject3);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            jSONObject.put("content", jSONObject2);
            jSONObject.put("from_unknown", this.LIZLLL);
            jSONObject.put("override_page_btm", this.LJFF);
            jSONObject.put("has_page_recovery", this.LJI);
            jSONObject.put("launch_intent", this.LJIIIIZZ);
            Boolean bool = this.LJ;
            Boolean bool2 = Boolean.TRUE;
            if (Intrinsics.LJFF(bool, bool2)) {
                jSONObject.put("first_page", this.LJ.booleanValue());
            }
            if (Intrinsics.LJFF(this.LJII, bool2)) {
                jSONObject.put("has_activity_recovery", this.LJII.booleanValue());
                return jSONObject;
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
        return jSONObject;
    }

    public /* synthetic */ C1766940w56(String str, String str2, String str3, String str4, Boolean bool, String str5, String str6, Boolean bool2) {
        this(str, str2, str3, str4, bool, str5, str6, bool2, null);
    }

    public C1766940w56(String str, String str2, String str3, String str4, Boolean bool, String str5, String str6, Boolean bool2, String str7) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = bool;
        this.LJFF = str5;
        this.LJI = str6;
        this.LJII = bool2;
        this.LJIIIIZZ = str7;
    }
}
