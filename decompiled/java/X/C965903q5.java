package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.address.api.AddressApi;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressAssociation;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS228S0000000_1;
import njp.a;

/* JADX INFO: renamed from: X.03q5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelViewModel$changeOnOrder$2", f = "DeliveryPanelViewModel.kt", l = {1219}, m = "invokeSuspend")
public final class C965903q5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Integer LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Address LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ Boolean LLILZLL;
    public final /* synthetic */ DeliveryPanelViewModel LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C965903q5(Integer num, String str, Address address, String str2, Boolean bool, DeliveryPanelViewModel deliveryPanelViewModel, InterfaceC1364105Vn<? super C965903q5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = num;
        this.LLILLL = str;
        this.LLILZ = address;
        this.LLILZIL = str2;
        this.LLILZLL = bool;
        this.LLIZ = deliveryPanelViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C965903q5(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DeliveryPanelViewModel@1cc7.changeOnOrder$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                C980703sT c980703sT = AddressApi.LIZ;
                Integer num = this.LLILLJJLI;
                String str = this.LLILLL;
                Address address = this.LLILZ;
                AddressAssociation addressAssociation = new AddressAssociation(this.LLILZIL);
                Integer numLJ = C2286608xc.LJ(2);
                Boolean bool = this.LLILZLL;
                this.LL = 1;
                obj = C980703sT.LIZ(c980703sT, num, str, "", null, null, address, addressAssociation, numLJ, bool, this, 24);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("DeliveryPanelViewModel@1cc7.changeOnOrder$2");
                    return objLJFF;
                }
            }
            this.LLIZ.xR2((Response) obj);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1019103yf.LIZ(EnumC1014603xw.ERR_SEA_PUDO_CHANGE_ADDRESS, e, null);
            this.LLIZ.setState(AFwS228S0000000_1.get$arr$(410));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DeliveryPanelViewModel@1cc7.changeOnOrder$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
