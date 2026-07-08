package X;

import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.api.PdpApi;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.CheckPopUpRequest;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.CheckPopUpResponse;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommercebase.pagesource.PageSourceInfo;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Nci, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.popup.trigger.TriggerHandler$handleCheckPopUp$1", f = "Trigger.kt", l = {281, 297}, m = "invokeSuspend")
public final class C597900Nci extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public C0NLD LLILLJJLI;
    public PdpViewModel LLILLL;
    public Object LLILZ;
    public int LLILZIL;
    public final /* synthetic */ PdpViewModel LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ Integer LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ List<Region> LLJI;
    public final /* synthetic */ String LLJIJIL;
    public final /* synthetic */ String LLJILJIL;
    public final /* synthetic */ C0NLD LLJILJILJ;
    public final /* synthetic */ String LLJILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C597900Nci(PdpViewModel pdpViewModel, String str, Integer num, String str2, List<Region> list, String str3, String str4, C0NLD c0nld, String str5, InterfaceC1364105Vn<? super C597900Nci> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZLL = pdpViewModel;
        this.LLIZ = str;
        this.LLIZLLLIL = num;
        this.LLJ = str2;
        this.LLJI = list;
        this.LLJIJIL = str3;
        this.LLJILJIL = str4;
        this.LLJILJILJ = c0nld;
        this.LLJILLL = str5;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C597900Nci(this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        PdpViewModel pdpViewModel;
        Integer num;
        C0NLD c0nld;
        String str;
        String strLJIIIIZZ;
        Integer num2;
        Object objLIZ = obj;
        C1C7U.LIZ("TriggerHandler@fab0.handleCheckPopUp$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILZIL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(objLIZ);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                str = (String) this.LLILZ;
                pdpViewModel = this.LLILLL;
                c0nld = this.LLILLJJLI;
                num = (Integer) this.LL;
                C155000ia.LIZIZ(objLIZ);
                CheckPopUpResponse checkPopUpResponse = (CheckPopUpResponse) objLIZ;
                num2 = checkPopUpResponse.code;
                if (num2 == null && num2.intValue() == 0) {
                    C1DFH c1dfh = C0PEM.LIZ;
                    AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
                    C604710Nnh c604710Nnh = new C604710Nnh(checkPopUpResponse, c0nld, pdpViewModel, str, num, null);
                    this.LL = null;
                    this.LLILLJJLI = null;
                    this.LLILLL = null;
                    this.LLILZ = null;
                    this.LLILZIL = 2;
                    if (C23250099c.LJI(this, abstractC2238408pq, c604710Nnh) == objLJFF) {
                        C1C7U.LIZIZ("TriggerHandler@fab0.handleCheckPopUp$1");
                        return objLJFF;
                    }
                } else {
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("TriggerHandler@fab0.handleCheckPopUp$1");
                    return unit;
                }
            }
        } else {
            C155000ia.LIZIZ(objLIZ);
            pdpViewModel = this.LLILZLL;
            ProductPackStruct productPackStruct = pdpViewModel.LLJILLL;
            if (productPackStruct != null) {
                String str2 = this.LLIZ;
                num = this.LLIZLLLIL;
                String str3 = this.LLJ;
                List<Region> list = this.LLJI;
                String str4 = this.LLJIJIL;
                String str5 = this.LLJILJIL;
                c0nld = this.LLJILJILJ;
                str = this.LLJILLL;
                C1758570vrb c1758570vrb = PdpApi.LIZ;
                String str6 = productPackStruct.productId;
                String str7 = "";
                if (str6 == null) {
                    str6 = "";
                }
                PageSourceInfo pageSourceInfoLJ = C1766860w4y.LJ(C1766860w4y.LIZ, null, 3);
                if (pageSourceInfoLJ != null && (strLJIIIIZZ = C1741890vQh.LJIIIIZZ(pageSourceInfoLJ)) != null) {
                    str7 = strLJIIIIZZ;
                }
                CheckPopUpRequest checkPopUpRequest = new CheckPopUpRequest(str6, str2, num, str3, list, str4, str7, str5, null);
                this.LL = num;
                this.LLILLJJLI = c0nld;
                this.LLILLL = pdpViewModel;
                this.LLILZ = str;
                this.LLILZIL = 1;
                objLIZ = c1758570vrb.LIZ(checkPopUpRequest, this);
                if (objLIZ == objLJFF) {
                    C1C7U.LIZIZ("TriggerHandler@fab0.handleCheckPopUp$1");
                    return objLJFF;
                }
                CheckPopUpResponse checkPopUpResponse2 = (CheckPopUpResponse) objLIZ;
                num2 = checkPopUpResponse2.code;
                if (num2 == null) {
                }
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("TriggerHandler@fab0.handleCheckPopUp$1");
                return unit2;
            }
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("TriggerHandler@fab0.handleCheckPopUp$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
