package X;

/* JADX INFO: renamed from: X.0fwr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.smbstate.SmbStateServiceImpl$special$$inlined$map$2$2", f = "SmbStateServiceImpl.kt", l = {223}, m = "emit")
public final class C1146790fwr extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ C1146780fwq LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1146790fwr(C1146780fwq c1146780fwq, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c1146780fwq;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SmbStateServiceImpl@d96b.special$$inlined$map$2$2$1");
        this.LL = obj;
        this.LLILLJJLI |= Integer.MIN_VALUE;
        Object objEmit = this.LLILLL.emit(null, this);
        C1C7U.LIZIZ("SmbStateServiceImpl@d96b.special$$inlined$map$2$2$1");
        return objEmit;
    }
}
