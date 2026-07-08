package X;

import com.bytedance.scene.Scene;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.18a8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.common.util.imageloading.IMImageMonitorListener$onImageSensibleLoaded$2", f = "IMImageLoadingMonitor.kt", l = {}, m = "invokeSuspend")
public final class C21308218a8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ C21308018a6 LLILLJJLI;
    public final /* synthetic */ JSONObject LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21308218a8(boolean z, C21308018a6 c21308018a6, JSONObject jSONObject, InterfaceC1364105Vn<? super C21308218a8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = z;
        this.LLILLJJLI = c21308018a6;
        this.LLILLL = jSONObject;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C21308218a8(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("IMImageMonitorListener@1896.onImageSensibleLoaded$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(new Pair("is_success", String.valueOf(this.LL)), new Pair(Scene.SCENE_SERVICE, this.LLILLJJLI.LL), new Pair("from_cache", this.LLILLL.optString("from")), new Pair("url", this.LLILLL.optString("uri")), new Pair("load_time", this.LLILLL.optString("duration")));
        C21308018a6 c21308018a6 = this.LLILLJJLI;
        C869590Y9l c869590Y9l = c21308018a6.LLILLJJLI;
        if (c869590Y9l != null) {
            boolean z = this.LL;
            mapLJIIJ.put("is_first_load_success", String.valueOf(C21307818a4.LIZLLL(c869590Y9l, z)));
            mapLJIIJ.put("time_from_last_load", c21308018a6.LIZIZ(z));
            String sourceVregion = c869590Y9l.getSourceVregion();
            if (sourceVregion == null) {
                sourceVregion = "";
            }
            mapLJIIJ.put("vregion", sourceVregion);
        }
        mapLJIIJ.putAll((ConcurrentHashMap) this.LLILLJJLI.LLILZIL.getValue());
        C21308018a6 c21308018a62 = this.LLILLJJLI;
        c21308018a62.LIZ(mapLJIIJ, c21308018a62.LLILLL);
        C21308018a6 c21308018a63 = this.LLILLJJLI;
        c21308018a63.LLILZ.sendEvent(((AbstractC1492605sq) c21308018a63.LLILZLL.getValue()).LIZ, mapLJIIJ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IMImageMonitorListener@1896.onImageSensibleLoaded$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
