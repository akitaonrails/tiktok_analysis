package X;

/* JADX INFO: renamed from: X.1D7l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
@C09DV(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1", f = "Emitters.kt", l = {117, 121}, m = "collect")
public final class C2250711D7l extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ C2325381G0q LLILLL;
    public C2325381G0q LLILZ;
    public InterfaceC346701Wf LLILZIL;
    public C09A4 LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2250711D7l(C2325381G0q c2325381G0q, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c2325381G0q;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        this.LL = obj;
        this.LLILLJJLI |= Integer.MIN_VALUE;
        return this.LLILLL.collect(null, this);
    }
}
