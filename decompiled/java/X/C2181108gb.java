package X;

import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.host.debug.MixLayoutDebugPreviewActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.08gb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.host.debug.MixLayoutDebugPreviewActivity$loadDataFromFile$2", f = "MixLayoutDebugPreviewActivity.kt", l = {89}, m = "invokeSuspend")
public final class C2181108gb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ MixLayoutDebugPreviewActivity LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2181108gb(MixLayoutDebugPreviewActivity mixLayoutDebugPreviewActivity, InterfaceC1364105Vn<? super C2181108gb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = mixLayoutDebugPreviewActivity;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2181108gb(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        String strJ3;
        String strJ32;
        String strJ33;
        C1C7U.LIZ("MixLayoutDebugPreviewActivity@39f5.loadDataFromFile$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            String strLJIIL = C2355009Kq.LJIIL(new C0VSJ("/data/local/tmp/mixlayout_debug_data_source.json"));
            if (strLJIIL.length() > 0) {
                JSONObject jSONObject = new JSONObject(strLJIIL);
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("card_map");
                String str = "";
                if (jSONObjectOptJSONObject == null || (strJ3 = C786410Ut5.J3(jSONObjectOptJSONObject)) == null) {
                    strJ3 = "";
                }
                JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("dsl");
                if (jSONObjectOptJSONObject2 == null || (strJ32 = C786410Ut5.J3(jSONObjectOptJSONObject2)) == null) {
                    strJ32 = "";
                }
                JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("common_params");
                if (jSONObjectOptJSONObject3 != null && (strJ33 = C786410Ut5.J3(jSONObjectOptJSONObject3)) != null) {
                    str = strJ33;
                }
                C1DFH c1dfh = C0PEM.LIZ;
                AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
                C2181208gc c2181208gc = new C2181208gc(strJ32, this.LLILLJJLI, str, strJ3, null);
                this.LL = 1;
                if (C23250099c.LJI(this, abstractC2238408pq, c2181208gc) == objLJFF) {
                    C1C7U.LIZIZ("MixLayoutDebugPreviewActivity@39f5.loadDataFromFile$2");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MixLayoutDebugPreviewActivity@39f5.loadDataFromFile$2");
        return unit;
    }
}
