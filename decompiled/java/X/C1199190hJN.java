package X;

import com.ss.android.ugc.aweme.poi.api.PoiSearchApi;
import defpackage.w5;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0hJN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.videopublish.PoiPublishExtensionRepository$operator$1$fetchRecommendPoiList$1", f = "PoiPublishExtensionRepository.kt", l = {91}, m = "invokeSuspend")
public final class C1199190hJN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC1631620sYq<PoiSearchApi.PoiSearchResultWrapper, Long, Long, Unit> LLILLJJLI;
    public final /* synthetic */ InterfaceC497601wk LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ C1199140hJI LLILZLL;
    public final /* synthetic */ boolean LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1199190hJN(InterfaceC1631620sYq<? super PoiSearchApi.PoiSearchResultWrapper, ? super Long, ? super Long, Unit> interfaceC1631620sYq, InterfaceC497601wk interfaceC497601wk, long j, String str, C1199140hJI c1199140hJI, boolean z, InterfaceC1364105Vn<? super C1199190hJN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC1631620sYq;
        this.LLILLL = interfaceC497601wk;
        this.LLILZ = j;
        this.LLILZIL = str;
        this.LLILZLL = c1199140hJI;
        this.LLIZ = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1199190hJN(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PoiPublishExtensionRepository@30c1.operator$1$fetchRecommendPoiList$1");
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
            w5 w5Var = new w5();
            C1199180hJM c1199180hJM = new C1199180hJM(this.LLILZLL, this.LLILZIL, this.LLIZ, null);
            InterfaceC1631620sYq<PoiSearchApi.PoiSearchResultWrapper, Long, Long, Unit> interfaceC1631620sYq = this.LLILLJJLI;
            InterfaceC497601wk interfaceC497601wk = this.LLILLL;
            long j = this.LLILZ;
            String str = this.LLILZIL;
            this.LL = 1;
            if (w5Var.LIZIZ(c1199180hJM, interfaceC1631620sYq, interfaceC497601wk, j, str, this) == objLJFF) {
                C1C7U.LIZIZ("PoiPublishExtensionRepository@30c1.operator$1$fetchRecommendPoiList$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PoiPublishExtensionRepository@30c1.operator$1$fetchRecommendPoiList$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
