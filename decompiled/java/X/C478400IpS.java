package X;

import com.ss.android.ugc.aweme.hangout.component.interact.viewmodel.MultiTopLiveInteractModuleVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import webcast.api.feed.TabMGTopLive;

/* JADX INFO: renamed from: X.0IpS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.hangout.component.interact.viewmodel.MultiTopLiveInteractModuleVM$refreshViewFromServer$1", f = "MultiTopLiveInteractModuleVM.kt", l = {108, 109}, m = "invokeSuspend")
public final class C478400IpS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ MultiTopLiveInteractModuleVM LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C478400IpS(String str, MultiTopLiveInteractModuleVM multiTopLiveInteractModuleVM, String str2, InterfaceC1364105Vn<? super C478400IpS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = multiTopLiveInteractModuleVM;
        this.LLILZ = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C478400IpS(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MultiTopLiveInteractModuleVM@63ef.refreshViewFromServer$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("MultiTopLiveInteractModuleVM@63ef.refreshViewFromServer$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C478590Ipl c478590Ipl = C478590Ipl.LIZ;
            String str = this.LLILLJJLI;
            this.LL = 1;
            obj = c478590Ipl.LIZ(str, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("MultiTopLiveInteractModuleVM@63ef.refreshViewFromServer$1");
                return objLJFF;
            }
        }
        TabMGTopLive tabMGTopLive = (TabMGTopLive) obj;
        if (tabMGTopLive == null) {
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("MultiTopLiveInteractModuleVM@63ef.refreshViewFromServer$1");
            return unit2;
        }
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C478390IpR c478390IpR = new C478390IpR(this.LLILLL, tabMGTopLive, this.LLILZ, null);
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c478390IpR) == objLJFF) {
            C1C7U.LIZIZ("MultiTopLiveInteractModuleVM@63ef.refreshViewFromServer$1");
            return objLJFF;
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("MultiTopLiveInteractModuleVM@63ef.refreshViewFromServer$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
