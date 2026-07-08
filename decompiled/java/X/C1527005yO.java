package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.ecommerce.search.result.model.SearchLiveList;
import com.ss.android.ugc.aweme.ecommerce.search.result.vertical.viewmodel.LiveVerticalViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05yO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.result.vertical.viewmodel.LiveVerticalViewModel$fetchData$1$liveList$1", f = "LiveVerticalViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1527005yO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super SearchLiveList>, Object> {
    public final /* synthetic */ LiveVerticalViewModel LL;
    public final /* synthetic */ Object LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1527005yO(LiveVerticalViewModel liveVerticalViewModel, Object obj, InterfaceC1364105Vn<? super C1527005yO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = liveVerticalViewModel;
        this.LLILLJJLI = obj;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1527005yO(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveVerticalViewModel@b55d.fetchData$1$liveList$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            Gson gson = this.LL.LL;
            Object objLJII = gson.LJII(gson.LJIILL(this.LLILLJJLI), SearchLiveList.class);
            C1C7U.LIZIZ("LiveVerticalViewModel@b55d.fetchData$1$liveList$1");
            return objLJII;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1C7U.LIZIZ("LiveVerticalViewModel@b55d.fetchData$1$liveList$1");
            return null;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super SearchLiveList> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
