package X;

import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01jc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.dc.core.LayeredDiskCacheMetrics$reportRead$2", f = "LayeredDiskCacheMetrics.kt", l = {}, m = "invokeSuspend")
public final class C416201jc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ boolean LLIZ;
    public final /* synthetic */ int LLIZLLLIL;
    public final /* synthetic */ double LLJ;
    public final /* synthetic */ long LLJI;
    public final /* synthetic */ long LLJIJIL;
    public final /* synthetic */ long LLJILJIL;
    public final /* synthetic */ int LLJILJILJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C416201jc(String str, String str2, boolean z, long j, int i, int i2, boolean z2, int i3, double d, long j2, long j3, long j4, int i4, InterfaceC1364105Vn<? super C416201jc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = z;
        this.LLILZ = j;
        this.LLILZIL = i;
        this.LLILZLL = i2;
        this.LLIZ = z2;
        this.LLIZLLLIL = i3;
        this.LLJ = d;
        this.LLJI = j2;
        this.LLJIJIL = j3;
        this.LLJILJIL = j4;
        this.LLJILJILJ = i4;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C416201jc(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LayeredDiskCacheMetrics@2679.reportRead$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("list_key", this.LL), new Pair("op", this.LLILLJJLI), new Pair("success", String.valueOf(this.LLILLL ? 1 : 0)), new Pair("duration_ms", String.valueOf(this.LLILZ)), new Pair("entry_cnt", String.valueOf(this.LLILZIL)), new Pair("po_cnt", String.valueOf(this.LLILZLL)), new Pair("miss", String.valueOf(this.LLIZ ? 1 : 0)), new Pair("miss_reason", String.valueOf(this.LLIZLLLIL)), new Pair("hit_rate", String.valueOf(this.LLJ)), new Pair("snapshot_duration_ms", String.valueOf(this.LLJI)), new Pair("po_duration_ms", String.valueOf(this.LLJIJIL)), new Pair("map_duration_ms", String.valueOf(this.LLJILJIL)));
        int i = this.LLJILJILJ;
        if (i >= 0) {
            mapLJIIJ.put("page_index", String.valueOf(i));
        }
        C20684815ws.LJIILLIIL("layered_cache_read", mapLJIIJ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LayeredDiskCacheMetrics@2679.reportRead$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
