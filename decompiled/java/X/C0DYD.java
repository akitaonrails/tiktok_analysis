package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0DYD, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.topsearch.horizontal.core.viewmodel.SearchLynxAwemeListRepoViewModel$RepoImpl$doLoadMore$3", f = "SearchLynxAwemeListRepoViewModel.kt", l = {}, m = "invokeSuspend")
public final class C0DYD extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends Aweme>>, Object> {
    public final /* synthetic */ List<Aweme> LL;
    public final /* synthetic */ C0DYF LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0DYD(List<? extends Aweme> list, C0DYF c0dyf, boolean z, InterfaceC1364105Vn<? super C0DYD> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = list;
        this.LLILLJJLI = c0dyf;
        this.LLILLL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0DYD(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchLynxAwemeListRepoViewModel$RepoImpl@a2b7.doLoadMore$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<Aweme> list = this.LL;
        if (list != null) {
            C0DYF c0dyf = this.LLILLJJLI;
            c0dyf.LIZIZ(list);
            Boolean.valueOf(((ArrayList) c0dyf.LIZLLL).addAll(list));
        }
        this.LLILLJJLI.LJ = this.LLILLL;
        Object obj2 = this.LL;
        if (obj2 == null) {
            obj2 = C13BV.INSTANCE;
        }
        C1C7U.LIZIZ("SearchLynxAwemeListRepoViewModel$RepoImpl@a2b7.doLoadMore$3");
        return obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends Aweme>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
