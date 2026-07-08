package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Cvw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.vm.SearchProsConsTabAssemViewModel$InnerFlowModel$loadMoreList$1$1$1", f = "SearchProsConsTabAssemViewModel.kt", l = {}, m = "invokeSuspend")
public final class C329540Cvw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C329550Cvx LL;
    public final /* synthetic */ C329560Cvy LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C329540Cvw(C329550Cvx c329550Cvx, C329560Cvy c329560Cvy, InterfaceC1364105Vn<? super C329540Cvw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c329550Cvx;
        this.LLILLJJLI = c329560Cvy;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C329540Cvw(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchProsConsTabAssemViewModel$InnerFlowModel@2af5.loadMoreList$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C329550Cvx c329550Cvx = this.LL;
        c329550Cvx.mIsLoading = false;
        C329560Cvy c329560Cvy = this.LLILLJJLI;
        c329550Cvx.LLILZIL = c329560Cvy.LIZIZ;
        ArrayList<Aweme> arrayList = c329550Cvx.LLILZ;
        List<InterfaceC329670Cw9> list = c329560Cvy.LIZJ;
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<InterfaceC329670Cw9> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(it2.next().getAweme());
        }
        this.LL.LLILLL.invoke(arrayList2);
        arrayList.addAll(arrayList2);
        List<InterfaceC1526205yG> list2 = this.LL.mNotifyListeners;
        if (list2 != null) {
            Iterator<InterfaceC1526205yG> it3 = list2.iterator();
            while (it3.hasNext()) {
                it3.next().onSuccess();
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchProsConsTabAssemViewModel$InnerFlowModel@2af5.loadMoreList$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
