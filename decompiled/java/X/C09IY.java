package X;

/* JADX INFO: renamed from: X.09IY, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1", f = "Errors.kt", l = {118, 120}, m = "collect")
public final class C09IY extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ C2501109r7 LLILLL;
    public C2501109r7 LLILZ;
    public InterfaceC346701Wf LLILZIL;
    public Object LLILZLL;
    public long LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C09IY(C2501109r7 c2501109r7, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c2501109r7;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        this.LL = obj;
        this.LLILLJJLI |= Integer.MIN_VALUE;
        return this.LLILLL.collect(null, this);
    }
}
