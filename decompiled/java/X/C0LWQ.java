package X;

/* JADX INFO: renamed from: X.0LWQ, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.EditorProT2VTask", f = "EditorProT2VTask.kt", l = {264, 267, 272}, m = "requestProgress")
public final class C0LWQ extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C543970LVb LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LWQ(C543970LVb c543970LVb, InterfaceC1364105Vn<? super C0LWQ> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c543970LVb;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EditorProT2VTask@7008.requestProgress$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJJJJLL = this.LLILLL.LJJJJLL(this);
        C1C7U.LIZIZ("EditorProT2VTask@7008.requestProgress$1");
        return objLJJJJLL;
    }
}
