package X;

import com.bytedance.iap.channel.google.IAPGoogleChannel;

/* JADX INFO: renamed from: X.0wpE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.iap.channel.google.IAPGoogleChannel", f = "IAPGoogleChannel.kt", l = {440, 485, 499}, m = "consumePurchase")
public final class C1795540wpE extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ IAPGoogleChannel LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1795540wpE(IAPGoogleChannel iAPGoogleChannel, InterfaceC1364105Vn<? super C1795540wpE> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = iAPGoogleChannel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IAPGoogleChannel@ef9a.consumePurchase$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objConsumePurchase = this.LLILZ.consumePurchase(null, null, this);
        C1C7U.LIZIZ("IAPGoogleChannel@ef9a.consumePurchase$1");
        return objConsumePurchase;
    }
}
