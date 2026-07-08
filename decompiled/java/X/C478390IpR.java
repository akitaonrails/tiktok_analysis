package X;

import com.ss.android.ugc.aweme.hangout.component.interact.viewmodel.MultiTopLiveInteractModuleVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import webcast.api.feed.TabMGTopLive;

/* JADX INFO: renamed from: X.0IpR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.hangout.component.interact.viewmodel.MultiTopLiveInteractModuleVM$refreshViewFromServer$1$1", f = "MultiTopLiveInteractModuleVM.kt", l = {}, m = "invokeSuspend")
public final class C478390IpR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ MultiTopLiveInteractModuleVM LL;
    public final /* synthetic */ TabMGTopLive LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C478390IpR(MultiTopLiveInteractModuleVM multiTopLiveInteractModuleVM, TabMGTopLive tabMGTopLive, String str, InterfaceC1364105Vn<? super C478390IpR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = multiTopLiveInteractModuleVM;
        this.LLILLJJLI = tabMGTopLive;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C478390IpR(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MultiTopLiveInteractModuleVM@63ef.refreshViewFromServer$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        MultiTopLiveInteractModuleVM multiTopLiveInteractModuleVM = this.LL;
        TabMGTopLive tabMGTopLive = this.LLILLJJLI;
        MultiTopLiveInteractModuleVM.wQ2(multiTopLiveInteractModuleVM, tabMGTopLive.interactionModule, tabMGTopLive.tabModule, EnumC479370Ir1.INIT, this.LLILLL, 16);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MultiTopLiveInteractModuleVM@63ef.refreshViewFromServer$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
