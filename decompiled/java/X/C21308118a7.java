package X;

import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.18a7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.common.util.imageloading.IMImageMonitorListener$onImageLoaded$1", f = "IMImageLoadingMonitor.kt", l = {}, m = "invokeSuspend")
public final class C21308118a7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ JSONObject LL;
    public final /* synthetic */ C21308018a6 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21308118a7(JSONObject jSONObject, C21308018a6 c21308018a6, InterfaceC1364105Vn<? super C21308118a7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = jSONObject;
        this.LLILLJJLI = c21308018a6;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C21308118a7(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("IMImageMonitorListener@1896.onImageLoaded$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        boolean zLJFF = Intrinsics.LJFF(this.LL.optString("load_status"), "success");
        Pair[] pairArr = new Pair[13];
        pairArr[0] = new Pair("format", this.LL.optString("image_type"));
        pairArr[1] = new Pair("is_success", String.valueOf(zLJFF));
        pairArr[2] = new Pair(Scene.SCENE_SERVICE, this.LLILLJJLI.LL);
        pairArr[3] = new Pair("url", this.LL.optString("uri"));
        pairArr[4] = new Pair("load_time", this.LL.optString("duration"));
        pairArr[5] = new Pair("network_type", this.LL.optString("network_quality"));
        pairArr[6] = new Pair("from_cache", CardStruct.IStatusCode.DEFAULT);
        pairArr[7] = new Pair("queue_duration", this.LL.optString("queue_duration"));
        pairArr[8] = new Pair("decode_duration", this.LL.optString("decode_duration"));
        pairArr[9] = new Pair("download_duration", this.LL.optString("download_duration"));
        pairArr[10] = new Pair("fail_phase", this.LL.optString("fail_phase"));
        pairArr[11] = new Pair("error_msg", this.LL.optString("err_msg"));
        String strLIZJ = C21307818a4.LIZJ(this.LL.optString("err_desc"));
        if (strLIZJ == null && (strLIZJ = C21307818a4.LIZ(this.LL.optString("err_msg"))) == null) {
            strLIZJ = "Unknown";
        }
        pairArr[12] = new Pair("failure_reason", strLIZJ);
        Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        JSONObject jSONObject = this.LL;
        C21308018a6 c21308018a6 = this.LLILLJJLI;
        String strOptString = jSONObject.optString("server_ip");
        if (strOptString == null) {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("net_timing_detail");
            if (jSONObjectOptJSONObject != null) {
                strOptString = jSONObjectOptJSONObject.optString("timing_remoteIP");
            } else {
                strOptString = null;
            }
        }
        mapLJIIJ.put("server_ip", strOptString);
        mapLJIIJ.put("hit_cdn_cache", jSONObject.optString("hit_cdn_cache"));
        mapLJIIJ.put("x_response_cache", jSONObject.optString("x_response_cache"));
        mapLJIIJ.put("file_size", jSONObject.optString("file_size"));
        mapLJIIJ.put("error_code", jSONObject.optString("err_code"));
        mapLJIIJ.put("time_from_last_load", c21308018a6.LIZIZ(zLJFF));
        c21308018a6.LIZ(mapLJIIJ, c21308018a6.LLILLL);
        C869590Y9l c869590Y9l = this.LLILLJJLI.LLILLJJLI;
        if (c869590Y9l != null) {
            mapLJIIJ.put("is_first_load_success", String.valueOf(C21307818a4.LIZLLL(c869590Y9l, zLJFF)));
            String sourceVregion = c869590Y9l.getSourceVregion();
            if (sourceVregion == null) {
                sourceVregion = "";
            }
            mapLJIIJ.put("vregion", sourceVregion);
        }
        mapLJIIJ.putAll((ConcurrentHashMap) this.LLILLJJLI.LLILZIL.getValue());
        C21308018a6 c21308018a62 = this.LLILLJJLI;
        c21308018a62.LLILZ.sendEvent(((AbstractC1492605sq) c21308018a62.LLILZLL.getValue()).LIZ, mapLJIIJ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IMImageMonitorListener@1896.onImageLoaded$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
