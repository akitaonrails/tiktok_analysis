package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;

/* JADX INFO: renamed from: X.0D5t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.checkout.address.CheckoutAddressServiceProxy", f = "CheckoutAddressServiceProxy.kt", l = {BaseNotice.CREATOR}, m = "getCurrentEffectiveAddress-IoAF18A")
public final class C333550D5t extends AbstractC23140094w {
    public C333540D5s LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C333540D5s LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C333550D5t(C333540D5s c333540D5s, InterfaceC1364105Vn<? super C333550D5t> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c333540D5s;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CheckoutAddressServiceProxy@797c.getCurrentEffectiveAddress$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLL.LIZ(this);
        if (objLIZ == C099R.LJFF()) {
            C1C7U.LIZIZ("CheckoutAddressServiceProxy@797c.getCurrentEffectiveAddress$1");
            return objLIZ;
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objLIZ);
        C1C7U.LIZIZ("CheckoutAddressServiceProxy@797c.getCurrentEffectiveAddress$1");
        return c189200o6M1boximpl;
    }
}
