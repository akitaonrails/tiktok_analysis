package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0NJZ, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.detail.container.newarchi.utils.InitialParamsCalibrateHelper$initialParamCalibration$initialDetail$2$1$1", f = "InitialParamsCalibrateHelper.kt", l = {}, m = "invokeSuspend")
public final class C0NJZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ C18C6 LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NJZ(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, C18C6 c18c6, InterfaceC1364105Vn<? super C0NJZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = str4;
        this.LLILZIL = str5;
        this.LLILZLL = str6;
        this.LLIZ = str7;
        this.LLIZLLLIL = str8;
        this.LLJ = c18c6;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NJZ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        C1C7U.LIZ("InitialParamsCalibrateHelper@9430.initialParamCalibration$initialDetail$2$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        JSONObject jSONObject = new JSONObject();
        String str = this.LL;
        String str2 = this.LLILLJJLI;
        String str3 = this.LLILLL;
        String str4 = this.LLILZ;
        String str5 = this.LLILZIL;
        String str6 = this.LLILZLL;
        String str7 = this.LLIZ;
        String str8 = this.LLIZLLLIL;
        C18C6 c18c6 = this.LLJ;
        if (str == null) {
            str = "";
        }
        jSONObject.put("initial_poi_enter_from_btm", str);
        if (str2 == null) {
            str2 = "";
        }
        jSONObject.put("initial_poi_enter_method_btm", str2);
        if (str3 == null) {
            str3 = "";
        }
        jSONObject.put("initial_poi_from_group_id_btm", str3);
        if (str4 == null) {
            str4 = "";
        }
        jSONObject.put("initial_poi_id_btm", str4);
        if (str5 == null) {
            str5 = "";
        }
        jSONObject.put("initial_poi_enter_from_origin", str5);
        if (str6 == null) {
            str6 = "";
        }
        jSONObject.put("initial_poi_enter_method_origin", str6);
        if (str7 == null) {
            str7 = "";
        }
        jSONObject.put("initial_poi_from_group_id_origin", str7);
        if (str8 == null) {
            str8 = "";
        }
        jSONObject.put("initial_poi_id_origin", str8);
        jSONObject.put("bcm_chain", c18c6.LIZ());
        C20684815ws.LJIJ("ttls_initial_params_btm_diff", jSONObject);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("InitialParamsCalibrateHelper@9430.initialParamCalibration$initialDetail$2$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
