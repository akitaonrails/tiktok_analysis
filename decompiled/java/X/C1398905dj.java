package X;

import com.google.gson.n;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05dj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.page.mix.container.repo.BaseMixLoadMoreRepo$doLoadMoreChunkRequest$1$2$1$onNext$1$1$parseDataTask$1", f = "BaseMixLoadMoreRepo.kt", l = {}, m = "invokeSuspend")
public final class C1398905dj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C1399005dk>, Object> {
    public final /* synthetic */ C677540Qhs LL;
    public final /* synthetic */ n LLILLJJLI;
    public final /* synthetic */ C675270QeD LLILLL;
    public final /* synthetic */ Map<String, Object> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1398905dj(C677540Qhs c677540Qhs, n nVar, C675270QeD c675270QeD, Map<String, Object> map, InterfaceC1364105Vn<? super C1398905dj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c677540Qhs;
        this.LLILLJJLI = nVar;
        this.LLILLL = c675270QeD;
        this.LLILZ = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1398905dj(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BaseMixLoadMoreRepo@9cb2.doLoadMoreChunkRequest$1$2$1$onNext$1$1$parseDataTask$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1399005dk c1399005dk = new C1399005dk(this.LLILZ, this.LLILLJJLI, this.LL.LIZIZ(this.LLILLJJLI, this.LLILLL));
        C1C7U.LIZIZ("BaseMixLoadMoreRepo@9cb2.doLoadMoreChunkRequest$1$2$1$onNext$1$1$parseDataTask$1");
        return c1399005dk;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C1399005dk> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
