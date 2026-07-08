package X;

import com.bytedance.scene.Scene;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01je, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.dc.core.LayeredDiskCacheMetrics$reportPOStore$2", f = "LayeredDiskCacheMetrics.kt", l = {}, m = "invokeSuspend")
public final class C416401je extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ long LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ long LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C416401je(int i, long j, int i2, int i3, long j2, int i4, long j3, InterfaceC1364105Vn<? super C416401je> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = i;
        this.LLILLJJLI = j;
        this.LLILLL = i2;
        this.LLILZ = i3;
        this.LLILZIL = j2;
        this.LLILZLL = i4;
        this.LLIZ = j3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C416401je(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LayeredDiskCacheMetrics@2679.reportPOStore$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C20684815ws.LJIILLIIL("layered_po_store", C2097608Jq.LJIIIIZZ(new Pair(Scene.SCENE_SERVICE, String.valueOf(this.LL)), new Pair("duration_ms", String.valueOf(this.LLILLJJLI)), new Pair("po_cnt", String.valueOf(this.LLILLL)), new Pair("story_cnt", String.valueOf(this.LLILZ)), new Pair("story_duration_ms", String.valueOf(this.LLILZIL)), new Pair("live_cnt", String.valueOf(this.LLILZLL)), new Pair("live_duration_ms", String.valueOf(this.LLIZ))));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LayeredDiskCacheMetrics@2679.reportPOStore$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
