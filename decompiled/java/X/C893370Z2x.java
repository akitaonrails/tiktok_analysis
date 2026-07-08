package X;

import Y.AgS295S0100000_14;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.im.messagelist.RecentActivityCardUISlot;
import com.ss.android.ugc.aweme.im.messagelist.api.IAwemeStatusViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Z2x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.messagelist.RecentActivityCardUISlot$onViewCreated$8", f = "RecentActivityMessageListProtocol.kt", l = {209}, m = "invokeSuspend")
public final class C893370Z2x extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ RecentActivityCardUISlot LLILLJJLI;
    public final /* synthetic */ C1722406oo LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C893370Z2x(C1722406oo c1722406oo, RecentActivityCardUISlot recentActivityCardUISlot, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = recentActivityCardUISlot;
        this.LLILLL = c1722406oo;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C893370Z2x(this.LLILLL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RecentActivityCardUISlot@768d.onViewCreated$8");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            AssemVMLazy assemVMLazy = this.LLILLJJLI.LLJZ;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = RecentActivityCardUISlot.LLLI;
            InterfaceC332260D0u interfaceC332260D0uVQ2 = ((IAwemeStatusViewModel) assemVMLazy.getValue()).vQ2(String.valueOf(this.LLILLL.awemeId));
            AgS295S0100000_14 agS295S0100000_14 = new AgS295S0100000_14(this.LLILLJJLI, 9);
            this.LL = 1;
            if (interfaceC332260D0uVQ2.collect(agS295S0100000_14, this) == objLJFF) {
                C1C7U.LIZIZ("RecentActivityCardUISlot@768d.onViewCreated$8");
                return objLJFF;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
