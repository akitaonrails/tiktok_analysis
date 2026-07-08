package X;

import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import org.json.JSONObject;
import webcast.api.partnership.ClickAttributionResponse;

/* JADX INFO: renamed from: X.0X8j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C843830X8j extends C09AY implements InterfaceC1631620sYq<Boolean, ClickAttributionResponse.ResponseData, String, Unit> {
    public final /* synthetic */ HashMap<String, String> LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ C0JT6<Map<String, String>> LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ int LLJI;
    public final /* synthetic */ int LLJIJIL;
    public final /* synthetic */ JSONObject LLJILJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C843830X8j(HashMap<String, String> map, String str, long j, C0JT6<Map<String, String>> c0jt6, int i, String str2, String str3, String str4, String str5, int i2, int i3, JSONObject jSONObject) {
        super(3);
        this.LL = map;
        this.LLILLJJLI = str;
        this.LLILLL = j;
        this.LLILZ = c0jt6;
        this.LLILZIL = i;
        this.LLILZLL = str2;
        this.LLIZ = str3;
        this.LLIZLLLIL = str4;
        this.LLJ = str5;
        this.LLJI = i2;
        this.LLJIJIL = i3;
        this.LLJILJIL = jSONObject;
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(Boolean bool, ClickAttributionResponse.ResponseData responseData, String str) {
        boolean z;
        ClickAttributionResponse.ResponseData responseData2 = responseData;
        if (bool.booleanValue()) {
            this.LL.put(this.LLILLJJLI, String.valueOf(this.LLILLL));
            this.LLILZ.LIZJ(this.LL);
            if (responseData2 != null) {
                z = responseData2.isReport;
            } else {
                z = true;
            }
            C843880X8o.LIZJ(this.LLILZIL, this.LLJI, this.LLJIJIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, z);
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_gamepad_attributing_mmp_report_trace");
            c474500IjALIZ.LJJII("report_success", "step");
            c474500IjALIZ.LJJIIJZLJL(this.LLJILJIL);
            c474500IjALIZ.LIZ();
        } else {
            C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_gamepad_attributing_mmp_report_exception");
            c474500IjALIZ2.LJJII(102, "code");
            c474500IjALIZ2.LJJII(str, "msg");
            c474500IjALIZ2.LJJIIJZLJL(this.LLJILJIL);
            c474500IjALIZ2.LIZ();
        }
        ((C823180WQy) C843880X8o.LIZIZ.getValue()).remove(this.LLILLJJLI);
        return Unit.LIZ;
    }
}
