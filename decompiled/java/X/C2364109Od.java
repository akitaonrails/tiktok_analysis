package X;

import com.bytedance.geckox.model.UpdatePackage;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.09Od, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.utils.GeckoDownloadZipObserver$registerGeckoUpdateListener$1$onUpdateSuccess$1", f = "GeckoDownloadZipObserver.kt", l = {}, m = "invokeSuspend")
public final class C2364109Od extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ UpdatePackage LL;
    public final /* synthetic */ C238400w2 LLILLJJLI;
    public final /* synthetic */ C238400w2 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2364109Od(UpdatePackage updatePackage, C238400w2 c238400w2, C238400w2 c238400w22, InterfaceC1364105Vn<? super C2364109Od> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = updatePackage;
        this.LLILLJJLI = c238400w2;
        this.LLILLL = c238400w22;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2364109Od(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        String channel;
        C1C7U.LIZ("GeckoDownloadZipObserver@5f95.registerGeckoUpdateListener$1$onUpdateSuccess$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        JSONObject jSONObject = new JSONObject();
        UpdatePackage updatePackage = this.LL;
        if (updatePackage != null) {
            channel = updatePackage.getChannel();
        } else {
            channel = null;
        }
        jSONObject.put("channel_id", channel);
        JSONObject jSONObject2 = new JSONObject();
        C238400w2 c238400w2 = this.LLILLJJLI;
        C238400w2 c238400w22 = this.LLILLL;
        jSONObject2.put("size", c238400w2.element);
        jSONObject2.put("duration", c238400w22.element);
        C1CC2.LJI("ttlive_live_gecko_download_evaluate_monitor", jSONObject, jSONObject2, new JSONObject());
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GeckoDownloadZipObserver@5f95.registerGeckoUpdateListener$1$onUpdateSuccess$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
