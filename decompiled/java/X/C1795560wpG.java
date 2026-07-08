package X;

import com.bytedance.iap.channel.google.IAPGoogleChannel;

/* JADX INFO: renamed from: X.0wpG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.iap.channel.google.IAPGoogleChannel", f = "IAPGoogleChannel.kt", l = {276, 485}, m = "queryPurchases")
public final class C1795560wpG extends AbstractC23140094w {
    public C1795120woY LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ IAPGoogleChannel LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1795560wpG(IAPGoogleChannel iAPGoogleChannel, InterfaceC1364105Vn<? super C1795560wpG> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = iAPGoogleChannel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IAPGoogleChannel@ef9a.queryPurchases$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objQueryPurchases = this.LLILLL.queryPurchases(null, this);
        C1C7U.LIZIZ("IAPGoogleChannel@ef9a.queryPurchases$1");
        return objQueryPurchases;
    }
}
