package X;

import com.google.gson.n;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.fetch.OutreachExtra;
import com.ss.android.ugc.aweme.fetch.OutreachFetchResponse;
import com.ss.android.ugc.aweme.outreach.signal.model.OutreachPathEventConfig;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.15wU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20682415wU extends C09AY implements Function1<OutreachFetchResponse, Unit> {
    public final /* synthetic */ C20682015wQ LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ List<String> LLILLL;
    public final /* synthetic */ Map<String, Object> LLILZ;
    public final /* synthetic */ Map<String, AbstractC637050Oyl> LLILZIL;
    public final /* synthetic */ long LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20682415wU(C20682015wQ c20682015wQ, String str, List<String> list, Map<String, Object> map, Map<String, AbstractC637050Oyl> map2, long j) {
        super(1);
        this.LL = c20682015wQ;
        this.LLILLJJLI = str;
        this.LLILLL = list;
        this.LLILZ = map;
        this.LLILZIL = map2;
        this.LLILZLL = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(OutreachFetchResponse outreachFetchResponse) {
        String str;
        n nVar;
        String str2;
        OutreachFetchResponse outreachFetchResponse2 = outreachFetchResponse;
        C20682015wQ c20682015wQ = this.LL;
        String str3 = this.LLILLJJLI;
        List<String> list = this.LLILLL;
        Map<String, Object> map = this.LLILZ;
        c20682015wQ.getClass();
        C20682015wQ.LJIIIIZZ(str3, list, outreachFetchResponse2, map, 0, "success");
        Map<String, AbstractC637050Oyl> map2 = this.LLILZIL;
        String str4 = this.LLILLJJLI;
        Map<String, Object> map3 = this.LLILZ;
        long j = this.LLILZLL;
        for (Map.Entry<String, AbstractC637050Oyl> entry : map2.entrySet()) {
            AbstractC637050Oyl value = entry.getValue();
            Map<String, String> map4 = outreachFetchResponse2.switchMap;
            String str5 = null;
            if (map4 != null) {
                str = map4.get(entry.getKey());
            } else {
                str = null;
            }
            if (str != null) {
                Map<String, n> map5 = outreachFetchResponse2.bizResp;
                if (map5 == null || (nVar = map5.get(str)) == null) {
                    nVar = new n();
                }
                C20571615ec c20571615ec = C20571615ec.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("signal: onTimingComing: ");
                sbLIZ.append(str4);
                sbLIZ.append(", fetch result:, outreach: ");
                sbLIZ.append(entry.getKey());
                sbLIZ.append(", content: ");
                sbLIZ.append(nVar);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                c20571615ec.getClass();
                C20571615ec.LIZJ(strLIZIZ);
                C080A.LIZIZ("fetch_dispatch", str4, entry.getKey(), null, null);
                C20554115bn c20554115bn = new C20554115bn(0, "");
                OutreachExtra outreachExtra = outreachFetchResponse2.extra;
                if (outreachExtra != null) {
                    str5 = outreachExtra.logId;
                }
                c20554115bn.LIZJ = str5;
                c20554115bn.LIZLLL = j;
                value.LIZ(c20554115bn, str4, nVar, map3);
                OutreachPathEventConfig outreachPathEventConfigLIZ = C20682815wY.LIZ();
                if (outreachPathEventConfigLIZ != null && outreachPathEventConfigLIZ.outreachCallback) {
                    C20684815ws.LJIILLIIL("outreach_callback", C2097608Jq.LJIIJ(new Pair("outreach_type", entry.getKey()), new Pair("action_type", "fetch"), new Pair("outreach_timing_key", str4), new Pair("outreach_conditions", map3.toString()), new Pair("is_active", CardStruct.IStatusCode.DEFAULT), new Pair("error_info", "success")));
                }
            } else {
                C20571615ec c20571615ec2 = C20571615ec.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("signal: onTimingComing: ");
                sbLIZ2.append(str4);
                sbLIZ2.append(": ,outreach: ");
                sbLIZ2.append(entry.getKey());
                sbLIZ2.append(" mapping key is null");
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                c20571615ec2.getClass();
                C20571615ec.LIZJ(strLIZIZ2);
                String key = entry.getKey();
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("no mapping key for ");
                sbLIZ3.append(entry.getKey());
                String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ3);
                OutreachExtra outreachExtra2 = outreachFetchResponse2.extra;
                if (outreachExtra2 != null) {
                    str2 = outreachExtra2.logId;
                } else {
                    str2 = null;
                }
                C080G.LIZLLL("fetch_dispatch", str4, key, 30002, strLIZIZ3, str2, null, 136);
                C20554115bn c20554115bn2 = new C20554115bn(0, "");
                OutreachExtra outreachExtra3 = outreachFetchResponse2.extra;
                if (outreachExtra3 != null) {
                    str5 = outreachExtra3.logId;
                }
                c20554115bn2.LIZJ = str5;
                c20554115bn2.LIZLLL = j;
                value.LIZ(c20554115bn2, str4, new n(), map3);
                OutreachPathEventConfig outreachPathEventConfigLIZ2 = C20682815wY.LIZ();
                if (outreachPathEventConfigLIZ2 != null && outreachPathEventConfigLIZ2.outreachCallback) {
                    C20684815ws.LJIILLIIL("outreach_callback", C2097608Jq.LJIIJ(new Pair("outreach_type", entry.getKey()), new Pair("action_type", "fetch"), new Pair("outreach_timing_key", str4), new Pair("outreach_conditions", map3.toString()), new Pair("is_active", CardStruct.IStatusCode.DEFAULT), new Pair("error_info", "no mapping key")));
                }
            }
        }
        return Unit.LIZ;
    }
}
