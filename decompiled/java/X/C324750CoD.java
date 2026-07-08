package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoBaseResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0CoD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C324750CoD extends C09AY implements Function0<Unit> {
    public final /* synthetic */ TakoBaseResponse LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C324750CoD(TakoBaseResponse takoBaseResponse, String str, String str2, String str3, String str4) {
        super(0);
        this.LL = takoBaseResponse;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = str4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C1862330yYx c1862330yYx = C1862330yYx.LIZ;
        TakoBaseResponse takoBaseResponse = this.LL;
        String str = this.LLILLJJLI;
        String str2 = this.LLILLL;
        String str3 = this.LLILZ;
        String str4 = this.LLILZIL;
        try {
            C20235014Fo c20235014Fo = C1862330yYx.LIZLLL;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("time_stamp", System.currentTimeMillis());
            jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, takoBaseResponse.statusCode == 0 ? 1 : 2);
            jSONObject.put("error_code", takoBaseResponse.statusCode);
            jSONObject.put("error_message", takoBaseResponse.statusMessage);
            jSONObject.put("enter_from", str);
            jSONObject.put("process_id", str2);
            jSONObject.put("tako_session_id", str3);
            jSONObject.put("tako_chat_id", str4);
            c20235014Fo.LIZIZ("tikbot_fetch_first_round_sug_end", jSONObject);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        return Unit.LIZ;
    }
}
