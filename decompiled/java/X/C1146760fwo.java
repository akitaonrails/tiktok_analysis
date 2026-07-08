package X;

/* JADX INFO: renamed from: X.0fwo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.smbstate.SmbStateServiceImpl$special$$inlined$map$1$2", f = "SmbStateServiceImpl.kt", l = {223}, m = "emit")
public final class C1146760fwo extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ C1146750fwn LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1146760fwo(C1146750fwn c1146750fwn, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c1146750fwn;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SmbStateServiceImpl@d96b.special$$inlined$map$1$2$1");
        this.LL = obj;
        this.LLILLJJLI |= Integer.MIN_VALUE;
        Object objEmit = this.LLILLL.emit(null, this);
        C1C7U.LIZIZ("SmbStateServiceImpl@d96b.special$$inlined$map$1$2$1");
        return objEmit;
    }
}
