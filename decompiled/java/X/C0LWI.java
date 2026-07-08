package X;

/* JADX INFO: renamed from: X.0LWI, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.EditorProT2VTask", f = "EditorProT2VTask.kt", l = {255}, m = "checkTimeOut")
public final class C0LWI extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C543970LVb LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LWI(C543970LVb c543970LVb, InterfaceC1364105Vn<? super C0LWI> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c543970LVb;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EditorProT2VTask@7008.checkTimeOut$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJJJJL = this.LLILLJJLI.LJJJJL(null, this);
        C1C7U.LIZIZ("EditorProT2VTask@7008.checkTimeOut$1");
        return objLJJJJL;
    }
}
