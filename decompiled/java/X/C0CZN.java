package X;

import com.ss.android.ugc.aweme.portrait.network.PortraitStylesResponse;
import com.ss.android.ugc.aweme.portrait.tab.AIPortraitTabViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CZN, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.portrait.tab.AIPortraitTabViewModel$loggedInLoad$2$recommendDeferred$1", f = "AIPortraitTabViewModel.kt", l = {484}, m = "invokeSuspend")
public final class C0CZN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super PortraitStylesResponse>, Object> {
    public int LL;
    public final /* synthetic */ AIPortraitTabViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0CZN(AIPortraitTabViewModel aIPortraitTabViewModel, InterfaceC1364105Vn<? super C0CZN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = aIPortraitTabViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0CZN(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIPortraitTabViewModel@fa0d.loggedInLoad$2$recommendDeferred$1");
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
            C1687000u0A c1687000u0A = this.LLILLJJLI.LL;
            this.LL = 1;
            obj = c1687000u0A.LIZLLL(0, 20, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("AIPortraitTabViewModel@fa0d.loggedInLoad$2$recommendDeferred$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("AIPortraitTabViewModel@fa0d.loggedInLoad$2$recommendDeferred$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super PortraitStylesResponse> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
