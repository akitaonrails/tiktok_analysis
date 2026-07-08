package X;

import com.ss.android.ugc.aweme.commercialize.ucp.api.model.CheckoutStoredUserAddress;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.checkout.CheckoutFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0D8e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.checkout.CheckoutFragment$refreshCurrentEffectiveAddress$1", f = "CheckoutFragment.kt", l = {456}, m = "invokeSuspend")
public final class C334180D8e extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ CheckoutFragment LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C334180D8e(CheckoutFragment checkoutFragment, String str, boolean z, InterfaceC1364105Vn<? super C334180D8e> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = checkoutFragment;
        this.LLILLL = str;
        this.LLILZ = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C334180D8e(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLIZ;
        C1C7U.LIZ("CheckoutFragment@f43c.refreshCurrentEffectiveAddress$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
                objLIZ = ((C189200o6) obj).m10unboximpl();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C333540D5s c333540D5s = this.LLILLJJLI.LLILLJJLI;
            this.LL = 1;
            objLIZ = c333540D5s.LIZ(this);
            if (objLIZ == objLJFF) {
                C1C7U.LIZIZ("CheckoutFragment@f43c.refreshCurrentEffectiveAddress$1");
                return objLJFF;
            }
        }
        String str = this.LLILLL;
        CheckoutFragment checkoutFragment = this.LLILLJJLI;
        boolean z = this.LLILZ;
        String str2 = "";
        if (C189200o6.m8isSuccessimpl(objLIZ)) {
            CheckoutStoredUserAddress checkoutStoredUserAddress = (CheckoutStoredUserAddress) objLIZ;
            if (checkoutStoredUserAddress != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("address.refresh.success source=");
                sbLIZ.append(str);
                sbLIZ.append(" addressId=");
                String str3 = checkoutStoredUserAddress.id;
                if (str3 == null) {
                    str3 = "";
                }
                sbLIZ.append(str3);
                sbLIZ.append(" email=");
                String str4 = checkoutStoredUserAddress.email;
                if (str4 == null) {
                    str4 = "";
                }
                sbLIZ.append(str4);
                sbLIZ.append(" country=");
                sbLIZ.append(checkoutStoredUserAddress.countryCode);
                C2188811AlT.LIZIZ(sbLIZ);
                checkoutFragment.LLILZIL = true;
                checkoutFragment.MR().JQ2(checkoutStoredUserAddress);
            } else if (checkoutFragment.LLILZIL && !z) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("address.refresh.skipEmpty source=");
                sbLIZ2.append(str);
                sbLIZ2.append(" clearWhenMissing=");
                sbLIZ2.append(z);
                sbLIZ2.append(" currentSelectedAddressId=");
                String str5 = checkoutFragment.LLILZ;
                if (str5 == null) {
                    str5 = "";
                }
                sbLIZ2.append(str5);
                sbLIZ2.append(" hasResolvedInitialAddress=");
                sbLIZ2.append(checkoutFragment.LLILZIL);
                C2188811AlT.LIZIZ(sbLIZ2);
            } else {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("address.refresh.empty source=");
                sbLIZ3.append(str);
                sbLIZ3.append(" clearWhenMissing=");
                sbLIZ3.append(z);
                sbLIZ3.append(" currentSelectedAddressId=");
                String str6 = checkoutFragment.LLILZ;
                if (str6 == null) {
                    str6 = "";
                }
                sbLIZ3.append(str6);
                sbLIZ3.append(" hasResolvedInitialAddress=");
                sbLIZ3.append(checkoutFragment.LLILZIL);
                C2188811AlT.LIZIZ(sbLIZ3);
                checkoutFragment.LLILZIL = true;
                checkoutFragment.MR().JQ2(null);
            }
        }
        String str7 = this.LLILLL;
        boolean z2 = this.LLILZ;
        CheckoutFragment checkoutFragment2 = this.LLILLJJLI;
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(objLIZ);
        if (thM5exceptionOrNullimpl != null) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("address.refresh.failure source=");
            sbLIZ4.append(str7);
            sbLIZ4.append(" clearWhenMissing=");
            sbLIZ4.append(z2);
            sbLIZ4.append(" message=");
            String message = thM5exceptionOrNullimpl.getMessage();
            if (message != null) {
                str2 = message;
            }
            sbLIZ4.append(str2);
            C2188811AlT.LIZIZ(sbLIZ4);
            if (!checkoutFragment2.LLILZIL || z2) {
                checkoutFragment2.LLILZIL = true;
                checkoutFragment2.MR().JQ2(null);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CheckoutFragment@f43c.refreshCurrentEffectiveAddress$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
