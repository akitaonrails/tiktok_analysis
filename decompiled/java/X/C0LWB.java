package X;

/* JADX INFO: renamed from: X.0LWB, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.EditorProT2VTask", f = "EditorProT2VTask.kt", l = {464, 469}, m = "setTaskFailAttempt")
public final class C0LWB extends AbstractC23140094w {
    public int LL;
    public Object LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C543970LVb LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LWB(C543970LVb c543970LVb, InterfaceC1364105Vn<? super C0LWB> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c543970LVb;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EditorProT2VTask@7008.setTaskFailAttempt$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLJJJJZI = this.LLILZ.LJJJJZI(0, null, null, this);
        C1C7U.LIZIZ("EditorProT2VTask@7008.setTaskFailAttempt$1");
        return objLJJJJZI;
    }
}
