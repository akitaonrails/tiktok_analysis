package X;

import com.bytedance.iap.channel.google.IAPGoogleChannel;

/* JADX INFO: renamed from: X.0wpF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.iap.channel.google.IAPGoogleChannel", f = "IAPGoogleChannel.kt", l = {334, 491, 334, 491}, m = "queryProductDetailsInternal$iap_channel_google_release")
public final class C1795550wpF extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ IAPGoogleChannel LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1795550wpF(IAPGoogleChannel iAPGoogleChannel, InterfaceC1364105Vn<? super C1795550wpF> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = iAPGoogleChannel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IAPGoogleChannel@ef9a.queryProductDetailsInternal$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objQueryProductDetailsInternal$iap_channel_google_release = this.LLILZIL.queryProductDetailsInternal$iap_channel_google_release(null, null, this);
        C1C7U.LIZIZ("IAPGoogleChannel@ef9a.queryProductDetailsInternal$1");
        return objQueryProductDetailsInternal$iap_channel_google_release;
    }
}
