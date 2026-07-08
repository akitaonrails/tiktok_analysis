package X;

import com.bytedance.iap.channel.google.IAPGoogleChannel;

/* JADX INFO: renamed from: X.0wpL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.iap.channel.google.IAPGoogleChannel", f = "IAPGoogleChannel.kt", l = {313}, m = "queryProductDetails")
public final class C1795610wpL extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ IAPGoogleChannel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1795610wpL(IAPGoogleChannel iAPGoogleChannel, InterfaceC1364105Vn<? super C1795610wpL> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = iAPGoogleChannel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IAPGoogleChannel@ef9a.queryProductDetails$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objQueryProductDetails = this.LLILLJJLI.queryProductDetails(null, null, this);
        C1C7U.LIZIZ("IAPGoogleChannel@ef9a.queryProductDetails$1");
        return objQueryProductDetails;
    }
}
