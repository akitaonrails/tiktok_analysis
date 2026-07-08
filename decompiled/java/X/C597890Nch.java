package X;

import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.api.PdpApi;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.CheckPopUpRequest;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.CheckPopUpResponse;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.ss.android.ugc.aweme.ecommercebase.pagesource.PageSourceInfo;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Nch, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.manager.trigger.SeaTriggerHandler$handleCheckPopUp$1", f = "SeaTrigger.kt", l = {89, 104}, m = "invokeSuspend")
public final class C597890Nch extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public SeaPdpViewModel LL;
    public int LLILLJJLI;
    public final /* synthetic */ SeaPdpViewModel LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ Integer LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ List<Region> LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ String LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C597890Nch(SeaPdpViewModel seaPdpViewModel, String str, Integer num, String str2, List<Region> list, String str3, String str4, InterfaceC1364105Vn<? super C597890Nch> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = seaPdpViewModel;
        this.LLILZ = str;
        this.LLILZIL = num;
        this.LLILZLL = str2;
        this.LLIZ = list;
        this.LLIZLLLIL = str3;
        this.LLJ = str4;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C597890Nch(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        SeaPdpViewModel seaPdpViewModel;
        String strLJIIIIZZ;
        Integer num;
        Object objLIZ = obj;
        C1C7U.LIZ("SeaTriggerHandler@1bc9.handleCheckPopUp$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(objLIZ);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                seaPdpViewModel = this.LL;
                C155000ia.LIZIZ(objLIZ);
                CheckPopUpResponse checkPopUpResponse = (CheckPopUpResponse) objLIZ;
                num = checkPopUpResponse.code;
                if (num == null && num.intValue() == 0) {
                    C1DFH c1dfh = C0PEM.LIZ;
                    AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
                    C1759120vsU c1759120vsU = new C1759120vsU(checkPopUpResponse, seaPdpViewModel, null);
                    this.LL = null;
                    this.LLILLJJLI = 2;
                    if (C23250099c.LJI(this, abstractC2238408pq, c1759120vsU) == objLJFF) {
                        C1C7U.LIZIZ("SeaTriggerHandler@1bc9.handleCheckPopUp$1");
                        return objLJFF;
                    }
                } else {
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("SeaTriggerHandler@1bc9.handleCheckPopUp$1");
                    return unit;
                }
            }
        } else {
            C155000ia.LIZIZ(objLIZ);
            seaPdpViewModel = this.LLILLL;
            ProductPackStruct productPackStruct = seaPdpViewModel.LLJIJIL;
            if (productPackStruct != null) {
                String str = this.LLILZ;
                Integer num2 = this.LLILZIL;
                String str2 = this.LLILZLL;
                List<Region> list = this.LLIZ;
                String str3 = this.LLIZLLLIL;
                String str4 = this.LLJ;
                C1758570vrb c1758570vrb = PdpApi.LIZ;
                String str5 = productPackStruct.productId;
                String str6 = "";
                if (str5 == null) {
                    str5 = "";
                }
                PageSourceInfo pageSourceInfoLJ = C1766860w4y.LJ(C1766860w4y.LIZ, null, 3);
                if (pageSourceInfoLJ != null && (strLJIIIIZZ = C1741890vQh.LJIIIIZZ(pageSourceInfoLJ)) != null) {
                    str6 = strLJIIIIZZ;
                }
                CheckPopUpRequest checkPopUpRequest = new CheckPopUpRequest(str5, str, num2, str2, list, str3, str6, str4, null);
                this.LL = seaPdpViewModel;
                this.LLILLJJLI = 1;
                objLIZ = c1758570vrb.LIZ(checkPopUpRequest, this);
                if (objLIZ == objLJFF) {
                    C1C7U.LIZIZ("SeaTriggerHandler@1bc9.handleCheckPopUp$1");
                    return objLJFF;
                }
                CheckPopUpResponse checkPopUpResponse2 = (CheckPopUpResponse) objLIZ;
                num = checkPopUpResponse2.code;
                if (num == null) {
                }
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("SeaTriggerHandler@1bc9.handleCheckPopUp$1");
                return unit2;
            }
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("SeaTriggerHandler@1bc9.handleCheckPopUp$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
