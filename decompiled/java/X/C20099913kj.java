package X;

/* JADX INFO: renamed from: X.13kj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1", f = "Limit.kt", l = {116}, m = "collect")
public final class C20099913kj extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ C20099713kh LLILLL;
    public InterfaceC346701Wf LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20099913kj(C20099713kh c20099713kh, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c20099713kh;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        this.LL = obj;
        this.LLILLJJLI |= Integer.MIN_VALUE;
        return this.LLILLL.collect(null, this);
    }
}
