package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkFragment;
import com.bytedance.touchpoint.core.crossplatform.IncentiveTaskPageFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0J38, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.touchpoint.core.crossplatform.IncentiveTaskPageFragment$onHiddenChanged$1$1", f = "IncentiveTaskPageFragment.kt", l = {}, m = "invokeSuspend")
public final class C0J38 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ IncentiveTaskPageFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0J38(IncentiveTaskPageFragment incentiveTaskPageFragment, InterfaceC1364105Vn<? super C0J38> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = incentiveTaskPageFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0J38(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        SparkContext sparkContext;
        InterfaceC1541990qEH kitView;
        C1C7U.LIZ("IncentiveTaskPageFragment@261d.onHiddenChanged$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1537480q70 hybridContext = null;
        this.LL.MR("viewDisappeared", null);
        IncentiveTaskPageFragment incentiveTaskPageFragment = this.LL;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", "cover");
        incentiveTaskPageFragment.MR("viewDisappearedWithType", jSONObject);
        IncentiveTaskPageFragment incentiveTaskPageFragment2 = this.LL;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("click_time", System.currentTimeMillis());
        incentiveTaskPageFragment2.MR("exitCoinTab", jSONObject2);
        SparkFragment sparkFragment = (SparkFragment) this.LL.LL.getValue();
        if (sparkFragment != null && (kitView = sparkFragment.getKitView()) != null) {
            hybridContext = kitView.getHybridContext();
        }
        if ((hybridContext instanceof SparkContext) && (sparkContext = (SparkContext) hybridContext) != null) {
            C1893540zNI.LIZ.getClass();
            C1893540zNI.LIZ(sparkContext, false);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IncentiveTaskPageFragment@261d.onHiddenChanged$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
