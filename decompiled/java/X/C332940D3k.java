package X;

import Y.AgS285S0100000_4;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.onestep.OnestepCheckoutViewModel;
import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0D3k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.onestep.OnestepCheckoutViewModel$2", f = "OnestepCheckoutViewModel.kt", l = {DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE}, m = "invokeSuspend")
public final class C332940D3k extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ OnestepCheckoutViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C332940D3k(OnestepCheckoutViewModel onestepCheckoutViewModel, InterfaceC1364105Vn<? super C332940D3k> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = onestepCheckoutViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C332940D3k(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OnestepCheckoutViewModel@9169.<init>$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            OnestepCheckoutViewModel onestepCheckoutViewModel = this.LLILLJJLI;
            AnonymousClass0950 anonymousClass0950 = onestepCheckoutViewModel.LL.LJ;
            AgS285S0100000_4 agS285S0100000_4 = new AgS285S0100000_4(onestepCheckoutViewModel, 13);
            this.LL = 1;
            if (anonymousClass0950.collect(agS285S0100000_4, this) == objLJFF) {
                C1C7U.LIZIZ("OnestepCheckoutViewModel@9169.<init>$2");
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
