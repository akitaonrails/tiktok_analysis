package X;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0DY8, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.topsearch.horizontal.core.viewmodel.SearchLynxAwemeListRepoViewModel$SearchLynxAwemeListLoadMoreModel$loadMoreList$1", f = "SearchLynxAwemeListRepoViewModel.kt", l = {484}, m = "invokeSuspend")
public final class C0DY8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0DY9 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0DY8(C0DY9 c0dy9, InterfaceC1364105Vn<? super C0DY8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0dy9;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0DY8(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchLynxAwemeListRepoViewModel$SearchLynxAwemeListLoadMoreModel@70b0.loadMoreList$1");
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
            C0DYB c0dyb = this.LLILLJJLI.LLILLJJLI;
            this.LL = 1;
            if (c0dyb.LIZ(this) == objLJFF) {
                C1C7U.LIZIZ("SearchLynxAwemeListRepoViewModel$SearchLynxAwemeListLoadMoreModel@70b0.loadMoreList$1");
                return objLJFF;
            }
        }
        C0DY9 c0dy9 = this.LLILLJJLI;
        c0dy9.mIsLoading = false;
        List<InterfaceC1526205yG> list = c0dy9.mNotifyListeners;
        if (list != null) {
            Iterator<InterfaceC1526205yG> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().onSuccess();
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchLynxAwemeListRepoViewModel$SearchLynxAwemeListLoadMoreModel@70b0.loadMoreList$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
