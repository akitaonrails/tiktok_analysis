package X;

import com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.repo.SearchProsConsRepo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Cvv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.vm.SearchProsConsTabAssemViewModel$InnerFlowModel$loadMoreList$1", f = "SearchProsConsTabAssemViewModel.kt", l = {407, 409, 417}, m = "invokeSuspend")
public final class C329530Cvv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C329550Cvx LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C329530Cvv(C329550Cvx c329550Cvx, InterfaceC1364105Vn<? super C329530Cvv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c329550Cvx;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C329530Cvv(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objLIZ;
        C1C7U.LIZ("SearchProsConsTabAssemViewModel$InnerFlowModel@2af5.loadMoreList$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i != 2 && i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("SearchProsConsTabAssemViewModel$InnerFlowModel@2af5.loadMoreList$1");
                return unit;
            }
            C155000ia.LIZIZ(obj);
            objLIZ = ((C189200o6) obj).m10unboximpl();
        } else {
            C155000ia.LIZIZ(obj);
            C329550Cvx c329550Cvx = this.LLILLJJLI;
            SearchProsConsRepo searchProsConsRepo = c329550Cvx.LLILLJJLI;
            C329660Cw8 c329660Cw8 = c329550Cvx.LL;
            this.LL = 1;
            objLIZ = searchProsConsRepo.LIZ(c329660Cw8, this);
            if (objLIZ == objLJFF) {
                C1C7U.LIZIZ("SearchProsConsTabAssemViewModel$InnerFlowModel@2af5.loadMoreList$1");
                return objLJFF;
            }
        }
        C329550Cvx c329550Cvx2 = this.LLILLJJLI;
        if (C189200o6.m5exceptionOrNullimpl(objLIZ) == null) {
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C329540Cvw c329540Cvw = new C329540Cvw(c329550Cvx2, (C329560Cvy) objLIZ, null);
            this.LL = 2;
            if (C23250099c.LJI(this, abstractC2238408pq, c329540Cvw) == objLJFF) {
                C1C7U.LIZIZ("SearchProsConsTabAssemViewModel$InnerFlowModel@2af5.loadMoreList$1");
                return objLJFF;
            }
        } else {
            C1DFH c1dfh2 = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq2 = C2107308Nj.LIZ;
            C329520Cvu c329520Cvu = new C329520Cvu(c329550Cvx2, null);
            this.LL = 3;
            if (C23250099c.LJI(this, abstractC2238408pq2, c329520Cvu) == objLJFF) {
                C1C7U.LIZIZ("SearchProsConsTabAssemViewModel$InnerFlowModel@2af5.loadMoreList$1");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("SearchProsConsTabAssemViewModel$InnerFlowModel@2af5.loadMoreList$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
