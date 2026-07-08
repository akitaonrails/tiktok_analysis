package X;

import com.ss.android.ugc.nearby.inittask.InitNearbyTask;
import com.ss.android.ugc.nearby.roaming.RoamingLocationInfo;
import com.ss.ugc.clientai.core.api.FeatureProducer;
import com.ss.ugc.clientai.core.api.FeatureServiceManager;
import com.ss.ugc.clientai.core.api.meta.ReturnCode;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0NRX, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.nearby.inittask.InitNearbyTask$preloadDoubleColumnFeed$1", f = "InitNearbyTask.kt", l = {108, 112}, m = "invokeSuspend")
public final class C0NRX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public boolean LL;
    public int LLILLJJLI;
    public final /* synthetic */ InitNearbyTask LLILLL;
    public final /* synthetic */ RoamingLocationInfo LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NRX(InitNearbyTask initNearbyTask, RoamingLocationInfo roamingLocationInfo, String str, InterfaceC1364105Vn<? super C0NRX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = initNearbyTask;
        this.LLILZ = roamingLocationInfo;
        this.LLILZIL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NRX(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object feature$default;
        Object feature$default2;
        Object feature$default3;
        Object feature$default4;
        Object feature$default5;
        boolean zLJFF;
        C1C7U.LIZ("InitNearbyTask@bca5.preloadDoubleColumnFeed$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                zLJFF = this.LL;
                C155000ia.LIZIZ(obj);
                C0NRY.LIZ.storeBoolean("do_preload", zLJFF);
            }
        } else {
            C155000ia.LIZIZ(obj);
            if (((Boolean) C593880NRa.LIZ.getValue()).booleanValue()) {
                this.LLILLL.getClass();
                FeatureServiceManager.Companion.getClass();
                FeatureProducer producer = C1510050pOl.LIZ().getProducer("ttm_nearby", 2);
                Object obj2 = null;
                if (producer != null) {
                    feature$default = FeatureProducer.getFeature$default(producer, "ttls_nearby_last_7_days_enter_times", (JSONObject) null, "ttm_nearby_ttls_nearby_last_7_days_enter_times", (ReturnCode) null, 10, (Object) null);
                    feature$default2 = FeatureProducer.getFeature$default(producer, "ttls_nearby_7_days_card_show_times", (JSONObject) null, "ttm_nearby_ttls_nearby_7_days_card_show_times", (ReturnCode) null, 10, (Object) null);
                    feature$default3 = FeatureProducer.getFeature$default(producer, "ttls_nearby_7_days_card_click_times", (JSONObject) null, "ttm_nearby_ttls_nearby_7_days_card_click_times", (ReturnCode) null, 10, (Object) null);
                    feature$default4 = FeatureProducer.getFeature$default(producer, "ttls_nearby_7_days_interactive_times", (JSONObject) null, "ttm_nearby_ttls_nearby_7_days_interactive_times", (ReturnCode) null, 10, (Object) null);
                } else {
                    feature$default = null;
                    feature$default2 = null;
                    feature$default3 = null;
                    feature$default4 = null;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("PRINT Feature: \nenterTimesFeature=");
                sbLIZ.append(feature$default);
                sbLIZ.append(" \ncardShowFeature=");
                sbLIZ.append(feature$default2);
                sbLIZ.append(" \ncardClickFeature=");
                sbLIZ.append(feature$default3);
                sbLIZ.append(" \ninteractiveFeature=");
                sbLIZ.append(feature$default4);
                C2188811AlT.LIZIZ(sbLIZ);
                if (producer != null) {
                    feature$default5 = FeatureProducer.getFeature$default(producer, "ttls_nearby_prediction_result", (JSONObject) null, "ttm_nearby_ttls_nearby_prediction_result", (ReturnCode) null, 10, (Object) null);
                } else {
                    feature$default5 = null;
                }
                if (feature$default5 instanceof Boolean) {
                    obj2 = feature$default5;
                }
                zLJFF = Intrinsics.LJFF(obj2, Boolean.TRUE);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("getDynamicFeature=");
                sbLIZ2.append(zLJFF);
                C2188811AlT.LIZIZ(sbLIZ2);
                if (zLJFF) {
                    InitNearbyTask initNearbyTask = this.LLILLL;
                    RoamingLocationInfo roamingLocationInfo = this.LLILZ;
                    String str = this.LLILZIL;
                    this.LL = zLJFF;
                    this.LLILLJJLI = 1;
                    if (initNearbyTask.LIZ(roamingLocationInfo, str, this) == objLJFF) {
                        C1C7U.LIZIZ("InitNearbyTask@bca5.preloadDoubleColumnFeed$1");
                        return objLJFF;
                    }
                }
                C0NRY.LIZ.storeBoolean("do_preload", zLJFF);
            } else {
                InitNearbyTask initNearbyTask2 = this.LLILLL;
                RoamingLocationInfo roamingLocationInfo2 = this.LLILZ;
                String str2 = this.LLILZIL;
                this.LLILLJJLI = 2;
                if (initNearbyTask2.LIZ(roamingLocationInfo2, str2, this) == objLJFF) {
                    C1C7U.LIZIZ("InitNearbyTask@bca5.preloadDoubleColumnFeed$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("InitNearbyTask@bca5.preloadDoubleColumnFeed$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
