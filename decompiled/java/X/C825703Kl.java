package X;

import android.content.Context;
import com.ss.android.ugc.aweme.ecommerce.base.address.AddressPageStarter;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.DynamicSchema;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.IdentityInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.03Kl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.address.OspAddressViewModel$openAddressListPage$2", f = "OspAddressViewModel.kt", l = {194}, m = "invokeSuspend")
public final class C825703Kl extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ OrderSubmitAssemViewModel LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ Context LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ Float LLIZLLLIL;
    public final /* synthetic */ Boolean LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C825703Kl(OrderSubmitAssemViewModel orderSubmitAssemViewModel, String str, String str2, Context context, String str3, String str4, Float f, Boolean bool, InterfaceC1364105Vn<? super C825703Kl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = orderSubmitAssemViewModel;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = context;
        this.LLILZLL = str3;
        this.LLIZ = str4;
        this.LLIZLLLIL = f;
        this.LLJ = bool;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C825703Kl(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String strLIZJ;
        Boolean enableAddressIdentity;
        DynamicSchema dynamicSchema;
        String str;
        C1C7U.LIZ("OspAddressViewModel@f5ca.openAddressListPage$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        String str2 = null;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            AddressPageStarter addressPageStarter = AddressPageStarter.LIZ;
            String strKR2 = this.LLILLJJLI.kR2(C2097608Jq.LJ());
            String addressListSchema = this.LLILLL;
            if (addressListSchema == null) {
                BillInfoData billInfoData = this.LLILLJJLI.LLJJI;
                if (billInfoData != null && (dynamicSchema = billInfoData.schemaInfo) != null) {
                    addressListSchema = dynamicSchema.getAddressListSchema();
                } else {
                    addressListSchema = null;
                }
            }
            Integer numAR2 = this.LLILLJJLI.AR2();
            String str3 = this.LLILZ;
            if (str3 != null) {
                strLIZJ = this.LLILLJJLI.LLLZLZ.LIZJ(str3, null);
            } else {
                strLIZJ = null;
            }
            OrderSubmitAssemViewModel orderSubmitAssemViewModel = this.LLILLJJLI;
            String str4 = orderSubmitAssemViewModel.n;
            IdentityInfo identityInfo = orderSubmitAssemViewModel.LLZLI;
            if (identityInfo != null) {
                enableAddressIdentity = identityInfo.getEnableAddressIdentity();
            } else {
                enableAddressIdentity = null;
            }
            Context context = this.LLILZIL;
            String str5 = this.LLILZLL;
            String str6 = this.LLIZ;
            Integer numLJ = C2286608xc.LJ(7);
            Float f = this.LLIZLLLIL;
            Boolean bool = this.LLJ;
            this.LL = 1;
            str2 = null;
            if (AddressPageStarter.LIZLLL(addressPageStarter, context, str5, strKR2, addressListSchema, str6, numAR2, false, strLIZJ, str4, numLJ, null, f, enableAddressIdentity, bool, this, 2176) == objLJFF) {
                C1C7U.LIZIZ("OspAddressViewModel@f5ca.openAddressListPage$2");
                return objLJFF;
            }
        }
        OrderSubmitAssemViewModel orderSubmitAssemViewModel2 = this.LLILLJJLI;
        AddressPageStarter.AddressEvent addressEvent = orderSubmitAssemViewModel2.LLLZL;
        if (addressEvent != null) {
            if (addressEvent.addressId.length() == 0) {
                str = str2;
            } else {
                str = addressEvent.addressId;
            }
            orderSubmitAssemViewModel2.TR2(str, str2, addressEvent.type, str2, str2);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("OspAddressViewModel@f5ca.openAddressListPage$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
