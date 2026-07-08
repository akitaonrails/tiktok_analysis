package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.api.model.ToastContent;
import com.ss.android.ugc.aweme.ecommerce.base.address.api.AddressApi;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressAssociation;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.SaveData;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.SaveRequest;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS115S1100000_1;
import kotlin.jvm.internal.AwS580S0100000_1;
import njp.a;

/* JADX INFO: renamed from: X.03q4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelViewModel$savePudoAddress$2", f = "DeliveryPanelViewModel.kt", l = {1145}, m = "invokeSuspend")
public final class C965803q4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Address LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ DeliveryPanelViewModel LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C965803q4(Address address, String str, DeliveryPanelViewModel deliveryPanelViewModel, InterfaceC1364105Vn<? super C965803q4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = address;
        this.LLILLL = str;
        this.LLILZ = deliveryPanelViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C965803q4(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [T, X.03nC] */
    /* JADX WARN: Type inference failed for: r1v6, types: [T, X.03nC] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        ExceptionUX exceptionUX;
        Integer num;
        ToastContent toastContent;
        String str;
        C1C7U.LIZ("DeliveryPanelViewModel@1cc7.savePudoAddress$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        boolean z = true;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                C980703sT c980703sT = AddressApi.LIZ;
                Address address = this.LLILLJJLI;
                String str2 = this.LLILLL;
                this.LL = 1;
                c980703sT.getClass();
                obj = ((AddressApi) C980703sT.LIZIZ.create(AddressApi.class)).ht(new SaveRequest(address, null, C2286608xc.LJ(12), null, null, null, new AddressAssociation(str2)), this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("DeliveryPanelViewModel@1cc7.savePudoAddress$2");
                    return objLJFF;
                }
            }
            Response response = (Response) obj;
            SaveData saveData = (SaveData) response.data;
            if (response.isCodeOK() && saveData != null) {
                z = false;
            }
            if (z) {
                C259800zU c259800zU = new C259800zU();
                c259800zU.element = new C948003nC(C2286608xc.LJ(2131832569));
                if (saveData != null && (exceptionUX = saveData.exceptionUX) != null && (num = exceptionUX.exceptionUXType) != null && num.intValue() == 0 && (toastContent = exceptionUX.toastContent) != null && (str = toastContent.message) != null) {
                    c259800zU.element = new C948003nC(str);
                }
                this.LLILZ.setState(new AwS580S0100000_1(c259800zU, (C259800zU<String>) 379));
            } else {
                DeliveryPanelViewModel deliveryPanelViewModel = this.LLILZ;
                deliveryPanelViewModel.getClass();
                deliveryPanelViewModel.setState(new AwS115S1100000_1(deliveryPanelViewModel, "shipping_panel", 31));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1019103yf.LIZ(EnumC1014603xw.ERR_SEA_PUDO_SAVE_ADDRESS, e, null);
            this.LLILZ.setState(AFwS228S0000000_1.get$arr$(418));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DeliveryPanelViewModel@1cc7.savePudoAddress$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
