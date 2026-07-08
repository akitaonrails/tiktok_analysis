package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.address.api.AddressApi;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressSku;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.GetShippingAddressRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.03pO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel$preloadAddressList$1", f = "OrderSubmitAssemViewModel.kt", l = {3741}, m = "invokeSuspend")
public final class C961603pO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ OrderSubmitAssemViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C961603pO(OrderSubmitAssemViewModel orderSubmitAssemViewModel, InterfaceC1364105Vn<? super C961603pO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = orderSubmitAssemViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C961603pO(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean zLIZIZ;
        Unit unit;
        C1C7U.LIZ("OrderSubmitAssemViewModel@f79d.preloadAddressList$1");
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
            C962103pT c962103pT = C962103pT.LIZ;
            String productId = this.LLILLJJLI.getProductId();
            this.LL = 1;
            c962103pT.getClass();
            C7879035x.LIZ();
            try {
                zLIZIZ = C036E.LIZ.LIZIZ();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                zLIZIZ = false;
            }
            if (!zLIZIZ || C962103pT.LIZ(2).LIZ()) {
                unit = Unit.LIZ;
            } else {
                ArrayList arrayList = null;
                int iLJIIJJI = AnonymousClass0408.LJIIJJI(AnonymousClass0408.LIZ, C955103oL.LIZ(null), "shipping_info", null, null, 12);
                if (C770702zh.LIZIZ(productId)) {
                    arrayList = new ArrayList();
                    arrayList.add(new AddressSku(productId, null, null));
                }
                GetShippingAddressRequest getShippingAddressRequest = new GetShippingAddressRequest(null, null, null, null, arrayList, null, null, 0, C2286608xc.LJ(iLJIIJJI), C1747870vaL.LIZ);
                AddressApi.LIZ.getClass();
                C980703sT.LIZJ(getShippingAddressRequest).LJL(C11S5.LIZ()).LJJLL(new C09JN() { // from class: X.03pP
                    @Override // X.C09JN
                    public final void accept(Object obj2) {
                        C1C7U.LIZ("AddressCacheManager@fc41.preloadAddressList$2");
                        Response response = (Response) ((C0X52) obj2).LIZIZ;
                        T t = response.data;
                        if (response.isCodeOK() && t != null) {
                            C962103pT c962103pT2 = C962103pT.LIZ;
                            String strLJIIIIZZ = C1741890vQh.LJIIIIZZ(t);
                            c962103pT2.getClass();
                            C962103pT.LIZIZ(2, strLJIIIIZZ);
                        }
                        C1C7U.LIZIZ("AddressCacheManager@fc41.preloadAddressList$2");
                    }
                }, new C09JN() { // from class: X.035v
                    @Override // X.C09JN
                    public final void accept(Object obj2) {
                        C1C7U.LIZ("AddressCacheManager@fc41.preloadAddressList$3");
                        C1019103yf.LIZ(EnumC1014603xw.ERR80, (Throwable) obj2, null);
                        C1C7U.LIZIZ("AddressCacheManager@fc41.preloadAddressList$3");
                    }
                });
                unit = Unit.LIZ;
            }
            if (unit == objLJFF) {
                C1C7U.LIZIZ("OrderSubmitAssemViewModel@f79d.preloadAddressList$1");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("OrderSubmitAssemViewModel@f79d.preloadAddressList$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
