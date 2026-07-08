package X;

import com.google.gson.n;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.outreach.signal.model.OutreachPathEventConfig;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.15wR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20682115wR extends C09AY implements Function2<Integer, Throwable, Unit> {
    public final /* synthetic */ C20682015wQ LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ List<String> LLILLL;
    public final /* synthetic */ Map<String, Object> LLILZ;
    public final /* synthetic */ Map<String, AbstractC637050Oyl> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20682115wR(C20682015wQ c20682015wQ, String str, List<String> list, Map<String, Object> map, Map<String, AbstractC637050Oyl> map2) {
        super(2);
        this.LL = c20682015wQ;
        this.LLILLJJLI = str;
        this.LLILLL = list;
        this.LLILZ = map;
        this.LLILZIL = map2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Integer num, Throwable th) {
        int iIntValue = num.intValue();
        Throwable th2 = th;
        C20682015wQ c20682015wQ = this.LL;
        String str = this.LLILLJJLI;
        List<String> list = this.LLILLL;
        Map<String, Object> map = this.LLILZ;
        String strValueOf = String.valueOf(th2.getMessage());
        c20682015wQ.getClass();
        C20682015wQ.LJIIIIZZ(str, list, null, map, 0, strValueOf);
        C20571615ec c20571615ec = C20571615ec.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("signal: onTimingComing ");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", fetch fail, errorCode: ");
        sbLIZ.append(iIntValue);
        sbLIZ.append(", throwable: ");
        sbLIZ.append(th2.getMessage());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c20571615ec.getClass();
        C20571615ec.LIZIZ(strLIZIZ);
        Map<String, AbstractC637050Oyl> map2 = this.LLILZIL;
        String str2 = this.LLILLJJLI;
        Map<String, Object> map3 = this.LLILZ;
        for (Map.Entry<String, AbstractC637050Oyl> entry : map2.entrySet()) {
            String key = entry.getKey();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("fetch failed errorCode=");
            sbLIZ2.append(iIntValue);
            sbLIZ2.append(", ");
            sbLIZ2.append(th2.getMessage());
            C080G.LIZLLL("fetch_dispatch", str2, key, 30001, C2188811AlT.LIZIZ(sbLIZ2), null, null, 200);
            entry.getValue().LIZ(new C20554115bn(-1, ""), str2, new n(), map3);
            OutreachPathEventConfig outreachPathEventConfigLIZ = C20682815wY.LIZ();
            if (outreachPathEventConfigLIZ != null && outreachPathEventConfigLIZ.outreachCallback) {
                C20684815ws.LJIILLIIL("outreach_callback", C2097608Jq.LJIIJ(new Pair("outreach_type", entry.getKey()), new Pair("action_type", "fetch"), new Pair("outreach_timing_key", str2), new Pair("outreach_conditions", map3.toString()), new Pair("is_active", CardStruct.IStatusCode.DEFAULT), new Pair("error_info", "fetch fail")));
            }
        }
        return Unit.LIZ;
    }
}
