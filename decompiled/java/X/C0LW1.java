package X;

/* JADX INFO: renamed from: X.0LW1, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.EditorProT2VTask", f = "EditorProT2VTask.kt", l = {125, 137, 149}, m = "beginTask")
public final class C0LW1 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C543970LVb LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LW1(C543970LVb c543970LVb, InterfaceC1364105Vn<? super C0LW1> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c543970LVb;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EditorProT2VTask@7008.beginTask$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJJJJJL = this.LLILLJJLI.LJJJJJL(null, null, this);
        C1C7U.LIZIZ("EditorProT2VTask@7008.beginTask$1");
        return objLJJJJJL;
    }
}
