package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0uvx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.home.usecase.GetPiListUseCase$parallelWithSupervisor$2$deferred2$1", f = "GetPiListUseCase.kt", l = {78}, m = "invokeSuspend")
public final class C1722830uvx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super AbstractC1623806Xk<? extends String>>, Object> {
    public int LL;
    public final /* synthetic */ C1722900uw4 LLILLJJLI;
    public final /* synthetic */ C1722790uvt LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1722830uvx(C1722900uw4 c1722900uw4, C1722790uvt c1722790uvt, InterfaceC1364105Vn<? super C1722830uvx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1722900uw4;
        this.LLILLL = c1722790uvt;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1722830uvx(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("GetPiListUseCase@6b87.parallelWithSupervisor$2$deferred2$1");
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
            C1722900uw4 c1722900uw4 = this.LLILLJJLI;
            C1722790uvt c1722790uvt = this.LLILLL;
            this.LL = 1;
            c1722900uw4.getClass();
            obj = C23250099c.LJI(this, C0PEM.LIZJ, new C1722770uvr(c1722790uvt, null));
            if (obj == objLJFF) {
                C1C7U.LIZIZ("GetPiListUseCase@6b87.parallelWithSupervisor$2$deferred2$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("GetPiListUseCase@6b87.parallelWithSupervisor$2$deferred2$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super AbstractC1623806Xk<? extends String>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
