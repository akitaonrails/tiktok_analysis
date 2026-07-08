package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;
import webcast.api.feed.LiveTabMG;
import webcast.api.feed.MGModuleInteraction;
import webcast.api.feed.TabMGTopLive;

/* JADX INFO: renamed from: X.0IpN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.hangout.component.interact.viewmodel.MultiTopLiveInteractModuleVM$requestTopModuleInternal$1$onSuccess$1$1", f = "MultiTopLiveInteractModuleVM.kt", l = {}, m = "invokeSuspend")
public final class C478350IpN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ List<MGModuleInteraction> LL;
    public final /* synthetic */ LiveTabMG LLILLJJLI;
    public final /* synthetic */ Function1<TabMGTopLive, Unit> LLILLL;
    public final /* synthetic */ EnumC479370Ir1 LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C478350IpN(List<MGModuleInteraction> list, LiveTabMG liveTabMG, Function1<? super TabMGTopLive, Unit> function1, EnumC479370Ir1 enumC479370Ir1, InterfaceC1364105Vn<? super C478350IpN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = list;
        this.LLILLJJLI = liveTabMG;
        this.LLILLL = function1;
        this.LLILZ = enumC479370Ir1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C478350IpN(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MultiTopLiveInteractModuleVM@63ef.requestTopModuleInternal$1$onSuccess$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<MGModuleInteraction> list = this.LL;
        if (list != null && !list.isEmpty()) {
            C478920IqI c478920IqI = C478920IqI.LIZ;
            TabMGTopLive tabMGTopLive = this.LLILLJJLI.topLive;
            c478920IqI.getClass();
            C478920IqI.LIZIZ(tabMGTopLive, "requestTopModuleInternal");
            this.LLILLL.invoke(this.LLILLJJLI.topLive);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("MultiTopLiveTopModuleVM requestInteractModules: onSuccess. scene: ");
            sbLIZ.append(this.LLILZ);
            C20441214yg.LIZIZ("MultiTopLiveTopModuleVM", C2188811AlT.LIZIZ(sbLIZ));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MultiTopLiveInteractModuleVM@63ef.requestTopModuleInternal$1$onSuccess$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
