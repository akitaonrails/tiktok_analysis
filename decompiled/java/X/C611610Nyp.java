package X;

import com.ss.android.ugc.aweme.base.vm.FeedSkylightListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Nyp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.base.vm.FeedSkylightListViewModel$loadLegacySkylightCache$2", f = "FeedSkylightListViewModel.kt", l = {}, m = "invokeSuspend")
public final class C611610Nyp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ FeedSkylightListViewModel LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C611610Nyp(FeedSkylightListViewModel feedSkylightListViewModel, String str, InterfaceC1364105Vn<? super C611610Nyp> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = feedSkylightListViewModel;
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C611610Nyp(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FeedSkylightListViewModel@458.loadLegacySkylightCache$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        FeedSkylightListViewModel feedSkylightListViewModel = this.LL;
        feedSkylightListViewModel.LLJJJJJIL = feedSkylightListViewModel.FQ2().LIZIZ(this.LL.HQ2(), this.LLILLJJLI);
        if (this.LL.LLJJJJJIL != null) {
            super/*com.bytedance.ext_power_list.AssemListViewModel*/.manualListRefresh();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FeedSkylightListViewModel@458.loadLegacySkylightCache$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
