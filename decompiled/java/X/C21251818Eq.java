package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.18Eq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21251818Eq extends C09AY implements Function0<Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ C18F7 LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ C18E9 LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21251818Eq(String str, C18F7 c18f7, String str2, C18E9 c18e9) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = c18f7;
        this.LLILLL = str2;
        this.LLILZ = c18e9;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        JSONObject jSONObject = new JSONObject();
        String str = this.LL;
        C18F7 c18f7 = this.LLILLJJLI;
        String str2 = this.LLILLL;
        C18E9 c18e9 = this.LLILZ;
        try {
            jSONObject.put("activity", str);
            jSONObject.put("activityResumeOrigin", c18f7);
            jSONObject.put("activityResumeOriginV2", str2);
            jSONObject.put("pageTree", String.valueOf(c18e9));
            return jSONObject;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return jSONObject;
        }
    }
}
