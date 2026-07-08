package X;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0DRU, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.topsearch.horizontal.ng.viewmodel.SearchAwemePoolViewModelNG$SearchLynxAwemeListLoadMoreModelNG$loadMoreList$1", f = "SearchAwemePoolViewModelNG.kt", l = {592}, m = "invokeSuspend")
public final class C0DRU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0DRV LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0DRU(C0DRV c0drv, InterfaceC1364105Vn<? super C0DRU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0drv;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0DRU(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchAwemePoolViewModelNG$SearchLynxAwemeListLoadMoreModelNG@a52f.loadMoreList$1");
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
            C0DRX c0drx = this.LLILLJJLI.LLILLJJLI;
            this.LL = 1;
            if (c0drx.LIZ(this) == objLJFF) {
                C1C7U.LIZIZ("SearchAwemePoolViewModelNG$SearchLynxAwemeListLoadMoreModelNG@a52f.loadMoreList$1");
                return objLJFF;
            }
        }
        C0DRV c0drv = this.LLILLJJLI;
        c0drv.mIsLoading = false;
        List<InterfaceC1526205yG> list = c0drv.mNotifyListeners;
        if (list != null) {
            Iterator<InterfaceC1526205yG> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().onSuccess();
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchAwemePoolViewModelNG$SearchLynxAwemeListLoadMoreModelNG@a52f.loadMoreList$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
