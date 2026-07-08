package X;

import com.ss.android.ugc.aweme.commercialize.ucp.api.model.CheckoutStoredUserAddress;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.checkout.CheckoutViewModel;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.onestep.OnestepCheckoutFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0D8d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.onestep.OnestepCheckoutFragment$refreshCurrentEffectiveAddress$1", f = "OnestepCheckoutFragment.kt", l = {1127}, m = "invokeSuspend")
public final class C334170D8d extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ OnestepCheckoutFragment LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C334170D8d(OnestepCheckoutFragment onestepCheckoutFragment, String str, boolean z, InterfaceC1364105Vn<? super C334170D8d> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = onestepCheckoutFragment;
        this.LLILLL = str;
        this.LLILZ = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C334170D8d(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLIZ;
        C1C7U.LIZ("OnestepCheckoutFragment@9eff.refreshCurrentEffectiveAddress$1");
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
            C333540D5s c333540D5s = this.LLILLJJLI.LLIZLLLIL;
            this.LL = 1;
            objLIZ = c333540D5s.LIZ(this);
            if (objLIZ == objLJFF) {
                C1C7U.LIZIZ("OnestepCheckoutFragment@9eff.refreshCurrentEffectiveAddress$1");
                return objLJFF;
            }
        }
        String str = this.LLILLL;
        OnestepCheckoutFragment onestepCheckoutFragment = this.LLILLJJLI;
        boolean z = this.LLILZ;
        String str2 = "";
        if (C189200o6.m8isSuccessimpl(objLIZ)) {
            CheckoutStoredUserAddress checkoutStoredUserAddress = (CheckoutStoredUserAddress) objLIZ;
            if (checkoutStoredUserAddress != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onestep.address.refresh.success source=");
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
                onestepCheckoutFragment.LLJIJIL = true;
                CheckoutViewModel checkoutViewModel = onestepCheckoutFragment.LLILLL;
                if (checkoutViewModel != null) {
                    checkoutViewModel.JQ2(checkoutStoredUserAddress);
                }
            } else if (onestepCheckoutFragment.LLJIJIL && !z) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("onestep.address.refresh.skipEmpty source=");
                sbLIZ2.append(str);
                sbLIZ2.append(" clearWhenMissing=");
                sbLIZ2.append(z);
                sbLIZ2.append(" currentSelectedAddressId=");
                String str5 = onestepCheckoutFragment.LLJI;
                if (str5 == null) {
                    str5 = "";
                }
                sbLIZ2.append(str5);
                sbLIZ2.append(" hasResolvedInitialAddress=");
                sbLIZ2.append(onestepCheckoutFragment.LLJIJIL);
                C2188811AlT.LIZIZ(sbLIZ2);
            } else {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("onestep.address.refresh.empty source=");
                sbLIZ3.append(str);
                sbLIZ3.append(" clearWhenMissing=");
                sbLIZ3.append(z);
                sbLIZ3.append(" currentSelectedAddressId=");
                String str6 = onestepCheckoutFragment.LLJI;
                if (str6 == null) {
                    str6 = "";
                }
                sbLIZ3.append(str6);
                sbLIZ3.append(" hasResolvedInitialAddress=");
                sbLIZ3.append(onestepCheckoutFragment.LLJIJIL);
                C2188811AlT.LIZIZ(sbLIZ3);
                onestepCheckoutFragment.LLJIJIL = true;
                CheckoutViewModel checkoutViewModel2 = onestepCheckoutFragment.LLILLL;
                if (checkoutViewModel2 != null) {
                    checkoutViewModel2.JQ2(null);
                }
            }
        }
        String str7 = this.LLILLL;
        boolean z2 = this.LLILZ;
        OnestepCheckoutFragment onestepCheckoutFragment2 = this.LLILLJJLI;
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(objLIZ);
        if (thM5exceptionOrNullimpl != null) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("onestep.address.refresh.failure source=");
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
            if (!onestepCheckoutFragment2.LLJIJIL || z2) {
                onestepCheckoutFragment2.LLJIJIL = true;
                CheckoutViewModel checkoutViewModel3 = onestepCheckoutFragment2.LLILLL;
                if (checkoutViewModel3 != null) {
                    checkoutViewModel3.JQ2(null);
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("OnestepCheckoutFragment@9eff.refreshCurrentEffectiveAddress$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
