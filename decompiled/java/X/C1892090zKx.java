package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.fyp.affiliate.button.EcProductAddButtonViewModel;
import com.ss.android.ugc.aweme.ecommerce.fyp.affiliate.button.api.EcProductAddApi;
import com.ss.android.ugc.aweme.ecommerce.fyp.affiliate.button.model.GetFypAffiliateInfoRequest;
import com.ss.android.ugc.aweme.ecommerce.fyp.affiliate.button.model.GetFypAffiliateInfoResponse;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS607S0100000_28;
import njp.a;

/* JADX INFO: renamed from: X.0zKx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.fyp.affiliate.button.EcProductAddButtonViewModel$fetchEcFypProductAddButtonData$1", f = "EcProductAddButtonViewModel.kt", l = {127}, m = "invokeSuspend")
public final class C1892090zKx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ EcProductAddButtonViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1892090zKx(EcProductAddButtonViewModel ecProductAddButtonViewModel, InterfaceC1364105Vn<? super C1892090zKx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = ecProductAddButtonViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1892090zKx(this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Response response;
        GetFypAffiliateInfoResponse getFypAffiliateInfoResponse;
        Long l;
        C1C7U.LIZ("EcProductAddButtonViewModel@c632.fetchEcFypProductAddButtonData$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        C0X52 c0x52 = null;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                C1892270zLF c1892270zLF = C1892260zLE.LLILLJJLI.getValue().LL;
                String[] strArr = new String[1];
                List<Long> list = this.LLILLJJLI.LLILZLL;
                if (list != null) {
                    l = (Long) C13LP.LJJJLL(list);
                } else {
                    l = null;
                }
                strArr[0] = String.valueOf(l);
                List listLJIILJJIL = C1697810uHb.LJIILJJIL(strArr);
                EcProductAddButtonViewModel ecProductAddButtonViewModel = this.LLILLJJLI;
                String str = ecProductAddButtonViewModel.LLILLJJLI;
                String str2 = ecProductAddButtonViewModel.LLILZIL;
                C1892160zL4.LIZ.getClass();
                GetFypAffiliateInfoRequest getFypAffiliateInfoRequest = new GetFypAffiliateInfoRequest(listLJIILJJIL, str, str2, C1892160zL4.LIZJ().LIZLLL());
                this.LL = 1;
                c1892270zLF.getClass();
                EcProductAddApi.LIZ.getClass();
                obj = C1892100zKy.LIZIZ.getValue().fetchEcFypProductAddButtonData(getFypAffiliateInfoRequest, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("EcProductAddButtonViewModel@c632.fetchEcFypProductAddButtonData$1");
                    return objLJFF;
                }
            }
            c0x52 = (C0X52) obj;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        ConcurrentHashMap<String, Object> concurrentHashMap = C1892170zL5.LIZ;
        C1892170zL5.LIZJ("SEND_REQUEST".toLowerCase(Locale.ROOT), this.LLILLJJLI.LLILLJJLI);
        if (c0x52 != null && (response = (Response) c0x52.LIZIZ) != null && (getFypAffiliateInfoResponse = (GetFypAffiliateInfoResponse) response.data) != null) {
            EcProductAddButtonViewModel ecProductAddButtonViewModel2 = this.LLILLJJLI;
            ecProductAddButtonViewModel2.LLIZLLLIL = getFypAffiliateInfoResponse;
            ecProductAddButtonViewModel2.setState(new AwS607S0100000_28(getFypAffiliateInfoResponse, 234));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EcProductAddButtonViewModel@c632.fetchEcFypProductAddButtonData$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
