package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0DRS, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.topsearch.horizontal.ng.viewmodel.SearchAwemePoolViewModelNG$RepoImpl$doLoadMore$3", f = "SearchAwemePoolViewModelNG.kt", l = {}, m = "invokeSuspend")
public final class C0DRS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends Aweme>>, Object> {
    public final /* synthetic */ C0DRR LL;
    public final /* synthetic */ List<Aweme> LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ Long LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0DRS(C0DRR c0drr, List<? extends Aweme> list, boolean z, Long l, InterfaceC1364105Vn<? super C0DRS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0drr;
        this.LLILLJJLI = list;
        this.LLILLL = z;
        this.LLILZ = l;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0DRS(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchAwemePoolViewModelNG$RepoImpl@6c1.doLoadMore$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LIZ.wQ2(this.LLILLJJLI);
        ((ArrayList) this.LL.LJ).addAll(this.LLILLJJLI);
        C0DRR c0drr = this.LL;
        c0drr.LJFF = this.LLILLL;
        c0drr.LIZLLL = this.LLILZ;
        List<Aweme> list = this.LLILLJJLI;
        C1C7U.LIZIZ("SearchAwemePoolViewModelNG$RepoImpl@6c1.doLoadMore$3");
        return list;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends Aweme>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
