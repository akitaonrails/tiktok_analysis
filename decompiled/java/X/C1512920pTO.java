package X;

import android.util.ArrayMap;
import com.bytedance.scene.Scene;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0pTO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.performance.IMResourceLogger$trackResources$1", f = "IMResourceLogger.kt", l = {}, m = "invokeSuspend")
public final class C1512920pTO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ InterfaceC1493105sv LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1512920pTO(InterfaceC1493105sv interfaceC1493105sv, String str, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = interfaceC1493105sv;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1512920pTO(this.LLILLJJLI, this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMResourceLogger@f86d.trackResources$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1512840pTG c1512840pTGLIZLLL = C1BCA.LIZLLL();
        C1512820pTE c1512820pTELJIIIIZZ = C1BCA.LJIIIIZZ();
        C1512830pTF c1512830pTFLJIIJJI = C1BCA.LJIIJJI();
        C2200981BCe c2200981BCeLJIIIZ = C1BCA.LJIIIZ();
        C1512930pTP c1512930pTPLIZJ = C1BCA.LIZJ();
        C1514210pVT c1514210pVTLJII = C1BCA.LJII();
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put("cpu_usage", String.valueOf(c1512840pTGLIZLLL.LIZIZ));
        arrayMap.put("total_mem", String.valueOf(c1512820pTELJIIIIZZ.LIZJ));
        arrayMap.put("avail_mem", String.valueOf(c1512820pTELJIIIIZZ.LIZIZ));
        arrayMap.put("gc_count", String.valueOf(c1512820pTELJIIIIZZ.LIZLLL));
        arrayMap.put("gc_time", String.valueOf(c1512820pTELJIIIIZZ.LJ));
        arrayMap.put("block_gc_count", String.valueOf(c1512820pTELJIIIIZZ.LJFF));
        arrayMap.put("block_gc_time", String.valueOf(c1512820pTELJIIIIZZ.LJI));
        arrayMap.put("available_external_disk_size", String.valueOf(c1512830pTFLJIIJJI.LIZJ));
        arrayMap.put("available_internal_disk_size", String.valueOf(c1512830pTFLJIIJJI.LIZIZ));
        arrayMap.put("connect_state", c2200981BCeLJIIIZ.LIZ.name());
        arrayMap.put("connect_type", c2200981BCeLJIIIZ.LIZIZ.name());
        arrayMap.put("is_charging", String.valueOf(c1512930pTPLIZJ.LIZIZ));
        arrayMap.put("current_battery_percent", String.valueOf(c1512930pTPLIZJ.LIZLLL));
        arrayMap.put("is_save_power_mode", String.valueOf(c1512930pTPLIZJ.LJ));
        arrayMap.put("is_idle", String.valueOf(c1514210pVTLJII.LIZ));
        arrayMap.put(Scene.SCENE_SERVICE, this.LL);
        this.LLILLJJLI.sendEvent("im_resource_monitor", arrayMap);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IMResourceLogger@f86d.trackResources$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
