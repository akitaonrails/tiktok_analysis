package X;

import com.ss.android.ugc.aweme.commercialize.ucp.impl.spi.AddressServiceImpl;

/* JADX INFO: renamed from: X.0D5y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.spi.AddressServiceImpl", f = "AddressServiceImpl.kt", l = {19}, m = "getCurrentEffectiveAddress-IoAF18A")
public final class C333600D5y extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ AddressServiceImpl LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C333600D5y(AddressServiceImpl addressServiceImpl, InterfaceC1364105Vn<? super C333600D5y> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = addressServiceImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AddressServiceImpl@4378.getCurrentEffectiveAddress$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLJJLI.LIZIZ(this);
        if (objLIZIZ == C099R.LJFF()) {
            C1C7U.LIZIZ("AddressServiceImpl@4378.getCurrentEffectiveAddress$1");
            return objLIZIZ;
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objLIZIZ);
        C1C7U.LIZIZ("AddressServiceImpl@4378.getCurrentEffectiveAddress$1");
        return c189200o6M1boximpl;
    }
}
