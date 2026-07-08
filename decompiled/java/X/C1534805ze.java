package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.05ze, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1534805ze extends C09AY implements Function1<JSONObject, Unit> {
    public final /* synthetic */ Long LL;
    public final /* synthetic */ Long LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ long LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ C259800zU<EnumC1534705zd> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1534805ze(Long l, Long l2, long j, long j2, long j3, String str, C259800zU<EnumC1534705zd> c259800zU) {
        super(1);
        this.LL = l;
        this.LLILLJJLI = l2;
        this.LLILLL = j;
        this.LLILZ = j2;
        this.LLILZIL = j3;
        this.LLILZLL = str;
        this.LLIZ = c259800zU;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(JSONObject jSONObject) throws JSONException {
        String value;
        JSONObject jSONObject2 = jSONObject;
        Long l = this.LL;
        Long l2 = this.LLILLJJLI;
        long j = this.LLILLL;
        long j2 = this.LLILZ;
        long j3 = this.LLILZIL;
        String str = this.LLILZLL;
        C259800zU<EnumC1534705zd> c259800zU = this.LLIZ;
        if (l != null) {
            l.longValue();
            jSONObject2.put("t_click", l.longValue());
        }
        if (l2 != null) {
            l2.longValue();
            jSONObject2.put("t_open_schema", l2.longValue());
        }
        jSONObject2.put("t_parse_schema", j);
        jSONObject2.put("t_build_container", System.currentTimeMillis());
        jSONObject2.put("t_initial_fetch_start", j2);
        jSONObject2.put("d_click_to_parse_schema", System.currentTimeMillis() - j3);
        jSONObject2.put("enter_from", str);
        EnumC1534705zd enumC1534705zd = c259800zU.element;
        if (enumC1534705zd == null || (value = enumC1534705zd.getValue()) == null) {
            value = "";
        }
        jSONObject2.put("detail_aweme_from", value);
        return Unit.LIZ;
    }
}
