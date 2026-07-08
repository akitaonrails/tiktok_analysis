package X;

import com.bytedance.android.livesdk.livesetting.LiveLogSampleConfigSetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0kWF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.image.fresco.LiveBDFrescoMonitor$onImageLoaded$1", f = "LiveBDFrescoMonitor.kt", l = {}, m = "invokeSuspend")
public final class C1322490kWF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ JSONObject LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1322490kWF(JSONObject jSONObject, String str, boolean z, String str2, InterfaceC1364105Vn<? super C1322490kWF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = jSONObject;
        this.LLILLJJLI = str;
        this.LLILLL = z;
        this.LLILZ = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1322490kWF(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("LiveBDFrescoMonitor@7690.onImageLoaded$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        JSONObject jSONObject = this.LL;
        String str = this.LLILLJJLI;
        boolean z = this.LLILLL;
        String str2 = this.LLILZ;
        try {
            C474500IjA c474500IjALIZIZ = C0IJT.LIZIZ("live_image_monitor", C2286608xc.LIZJ(LiveLogSampleConfigSetting.getSAMPLE_100()));
            c474500IjALIZIZ.LJIL();
            c474500IjALIZIZ.LJJII(C2286608xc.LJ(jSONObject.optInt("file_size")), "file_size");
            c474500IjALIZIZ.LJJII(C2286608xc.LJ(jSONObject.optInt("applied_image_size")), "applied_image_size");
            c474500IjALIZIZ.LJJII(C2286608xc.LJFF(jSONObject.optLong("duration")), "duration");
            c474500IjALIZIZ.LJJII(C2286608xc.LJ(jSONObject.optInt("queue_duration")), "queue_duration");
            c474500IjALIZIZ.LJJII(C2286608xc.LJFF(jSONObject.optLong("download_duration")), "download_duration");
            c474500IjALIZIZ.LJJII(C2286608xc.LJ(jSONObject.optInt("decode_duration")), "decode_duration");
            c474500IjALIZIZ.LJJII(jSONObject.optString("image_type"), "image_type");
            c474500IjALIZIZ.LJJII(jSONObject.optString("load_status"), "load_status");
            c474500IjALIZIZ.LJJII(Boolean.valueOf(jSONObject.optBoolean("is_request_network")), "is_request_network");
            c474500IjALIZIZ.LJJII(str, "biz_tag");
            if (!z) {
                c474500IjALIZIZ.LJJII(jSONObject.optString("fail_phase"), "fail_phase");
                c474500IjALIZIZ.LJJII(C2286608xc.LJ(jSONObject.optInt("err_code")), "err_code");
                c474500IjALIZIZ.LJJII(jSONObject.optString("err_desc"), "err_desc");
                c474500IjALIZIZ.LJJII(str2, "uri");
            }
            c474500IjALIZIZ.LIZ();
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveBDFrescoMonitor@7690.onImageLoaded$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
