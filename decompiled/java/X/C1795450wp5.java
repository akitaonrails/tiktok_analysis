package X;

import com.bytedance.iap.channel.google.IAPGoogleChannel;

/* JADX INFO: renamed from: X.0wp5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.iap.channel.google.IAPGoogleChannel", f = "IAPGoogleChannel.kt", l = {369, 423, 425, 369, 423, 425}, m = "launchPurchaseFlow")
public final class C1795450wp5 extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public EnumC1782260wTo LLILZ;
    public Object LLILZIL;
    public Object LLILZLL;
    public C1795840wpi LLIZ;
    public /* synthetic */ Object LLIZLLLIL;
    public final /* synthetic */ IAPGoogleChannel LLJ;
    public int LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1795450wp5(IAPGoogleChannel iAPGoogleChannel, InterfaceC1364105Vn<? super C1795450wp5> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLJ = iAPGoogleChannel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IAPGoogleChannel@ef9a.launchPurchaseFlow$1");
        this.LLIZLLLIL = obj;
        this.LLJI |= Integer.MIN_VALUE;
        Object objLaunchPurchaseFlow = this.LLJ.launchPurchaseFlow(null, null, null, null, null, null, this);
        C1C7U.LIZIZ("IAPGoogleChannel@ef9a.launchPurchaseFlow$1");
        return objLaunchPurchaseFlow;
    }
}
