package X;

/* JADX INFO: renamed from: X.0fJC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.smbstate.SmbApiClient", f = "SmbApiClient.kt", l = {64}, m = "fetchSmbPreview")
public final class C1122200fJC extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1122160fJ8 LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1122200fJC(C1122160fJ8 c1122160fJ8, InterfaceC1364105Vn<? super C1122200fJC> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c1122160fJ8;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SmbApiClient@c6a0.fetchSmbPreview$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLJJLI.LIZIZ(null, null, null, this);
        C1C7U.LIZIZ("SmbApiClient@c6a0.fetchSmbPreview$1");
        return objLIZIZ;
    }
}
