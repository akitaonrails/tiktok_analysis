package X;

import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0X8k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C843840X8k extends C09AY implements Function2<Boolean, String, Unit> {
    public final /* synthetic */ HashMap<String, String> LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ C0JT6<Map<String, String>> LLILZ;
    public final /* synthetic */ JSONObject LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C843840X8k(HashMap<String, String> map, String str, long j, C0JT6<Map<String, String>> c0jt6, JSONObject jSONObject) {
        super(2);
        this.LL = map;
        this.LLILLJJLI = str;
        this.LLILLL = j;
        this.LLILZ = c0jt6;
        this.LLILZIL = jSONObject;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Boolean bool, String str) {
        if (bool.booleanValue()) {
            this.LL.put(this.LLILLJJLI, String.valueOf(this.LLILLL));
            this.LLILZ.LIZJ(this.LL);
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_gamepad_attributing_mmp_report_trace");
            c474500IjALIZ.LJJII("report_success", "step");
            c474500IjALIZ.LJJIIJZLJL(this.LLILZIL);
            c474500IjALIZ.LIZ();
        } else {
            C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_gamepad_attributing_mmp_report_exception");
            c474500IjALIZ2.LJJII(101, "code");
            c474500IjALIZ2.LJJII(str, "msg");
            c474500IjALIZ2.LJJIIJZLJL(this.LLILZIL);
            c474500IjALIZ2.LIZ();
        }
        ((C823180WQy) C843880X8o.LIZ.getValue()).remove(this.LLILLJJLI);
        return Unit.LIZ;
    }
}
