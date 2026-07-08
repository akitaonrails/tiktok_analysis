package X;

import com.bytedance.iap.channel.google.IAPGoogleChannel;

/* JADX INFO: renamed from: X.0wpM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.iap.channel.google.IAPGoogleChannel", f = "IAPGoogleChannel.kt", l = {172, 174}, m = "initChannel")
public final class C1795620wpM extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ IAPGoogleChannel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1795620wpM(IAPGoogleChannel iAPGoogleChannel, InterfaceC1364105Vn<? super C1795620wpM> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = iAPGoogleChannel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IAPGoogleChannel@ef9a.initChannel$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objInitChannel = this.LLILLJJLI.initChannel(null, false, this);
        C1C7U.LIZIZ("IAPGoogleChannel@ef9a.initChannel$1");
        return objInitChannel;
    }
}
