package X;

import com.google.gson.n;
import com.ss.android.ugc.aweme.outreach.signal.model.OutreachPathEventConfig;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.15wT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20682315wT extends C09AY implements Function2<Integer, Throwable, Unit> {
    public final /* synthetic */ C20682015wQ LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ List<String> LLILLL;
    public final /* synthetic */ Map<String, Object> LLILZ;
    public final /* synthetic */ EnumC20654715s1 LLILZIL;
    public final /* synthetic */ AbstractC637050Oyl LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20682315wT(C20682015wQ c20682015wQ, String str, List<String> list, Map<String, Object> map, EnumC20654715s1 enumC20654715s1, AbstractC637050Oyl abstractC637050Oyl) {
        super(2);
        this.LL = c20682015wQ;
        this.LLILLJJLI = str;
        this.LLILLL = list;
        this.LLILZ = map;
        this.LLILZIL = enumC20654715s1;
        this.LLILZLL = abstractC637050Oyl;
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
        C20682015wQ.LJIIIIZZ(str, list, null, map, 1, strValueOf);
        String str2 = this.LLILLJJLI;
        String typeName = this.LLILZIL.getTypeName();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fetch failed errorCode=");
        sbLIZ.append(iIntValue);
        sbLIZ.append(", ");
        sbLIZ.append(th2.getMessage());
        C080G.LIZLLL("fetch_dispatch", str2, typeName, 30001, C2188811AlT.LIZIZ(sbLIZ), null, null, 200);
        C080A.LIZIZ("fetch_dispatch", this.LLILLJJLI, this.LLILZIL.getTypeName(), null, "fetch failed");
        AbstractC637050Oyl abstractC637050Oyl = this.LLILZLL;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("fetch failed errorCode=");
        sbLIZ2.append(iIntValue);
        sbLIZ2.append(", ");
        sbLIZ2.append(th2.getMessage());
        abstractC637050Oyl.LIZ(new C20554115bn(-1, C2188811AlT.LIZIZ(sbLIZ2)), this.LLILLJJLI, new n(), this.LLILZ);
        C20571615ec c20571615ec = C20571615ec.LIZ;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("signal: trigger fetchTiming ");
        sbLIZ3.append(this.LLILLJJLI);
        sbLIZ3.append(", fetch fail, errorCode: ");
        sbLIZ3.append(iIntValue);
        sbLIZ3.append(", throwable: ");
        sbLIZ3.append(th2.getMessage());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
        c20571615ec.getClass();
        C20571615ec.LIZIZ(strLIZIZ);
        OutreachPathEventConfig outreachPathEventConfigLIZ = C20682815wY.LIZ();
        if (outreachPathEventConfigLIZ != null && outreachPathEventConfigLIZ.outreachCallback) {
            C20684815ws.LJIILLIIL("outreach_callback", C2097608Jq.LJIIJ(new Pair("outreach_type", this.LLILZIL.getTypeName()), new Pair("action_type", "fetch"), new Pair("outreach_timing_key", this.LLILLJJLI), new Pair("outreach_conditions", this.LLILZ.toString()), new Pair("is_active", "1"), new Pair("error_info", "fetch fail")));
        }
        return Unit.LIZ;
    }
}
