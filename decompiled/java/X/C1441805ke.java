package X;

import Y.AgS283S0100000_2;
import com.bytedance.tts.pigeon.paas.components.api.PigeonConversationListComponentApi;
import com.ss.android.ugc.aweme.ecommerce.base.messagecenter.SellerMessageListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05ke, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.messagecenter.SellerMessageListViewModel$onPrepared$1", f = "SellerMessageListViewModel.kt", l = {106}, m = "invokeSuspend")
public final class C1441805ke extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SellerMessageListViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1441805ke(SellerMessageListViewModel sellerMessageListViewModel, InterfaceC1364105Vn<? super C1441805ke> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = sellerMessageListViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1441805ke(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SellerMessageListViewModel@16a7.onPrepared$1");
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
            C23036090w c23036090wLJJIIZ = C09IC.LJJIIZ(C09IC.LIZJ(new C1768806wI(new C414301jJ(((PigeonConversationListComponentApi) this.LLILLJJLI.LLILZIL.getValue()).LJIJI(), this.LLILLJJLI.LLILZLL, new C1441605kc(null)), 0), 1, EnumC2252401DDy.DROP_OLDEST), 1000L);
            AgS283S0100000_2 agS283S0100000_2 = new AgS283S0100000_2(this.LLILLJJLI, 13);
            this.LL = 1;
            if (c23036090wLJJIIZ.collect(agS283S0100000_2, this) == objLJFF) {
                C1C7U.LIZIZ("SellerMessageListViewModel@16a7.onPrepared$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SellerMessageListViewModel@16a7.onPrepared$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
