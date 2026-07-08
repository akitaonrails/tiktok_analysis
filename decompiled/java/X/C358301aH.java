package X;

/* JADX INFO: renamed from: X.01aH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.infra.datacenter.fetcher.Fetcher$getResultFlowByUrl$$inlined$filter$1$2", f = "Fetcher.kt", l = {223}, m = "emit")
public final class C358301aH extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ C358201aG LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C358301aH(C358201aG c358201aG, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c358201aG;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("Fetcher@eed5.getResultFlowByUrl$$inlined$filter$1$2$1");
        this.LL = obj;
        this.LLILLJJLI |= Integer.MIN_VALUE;
        Object objEmit = this.LLILLL.emit(null, this);
        C1C7U.LIZIZ("Fetcher@eed5.getResultFlowByUrl$$inlined$filter$1$2$1");
        return objEmit;
    }
}
