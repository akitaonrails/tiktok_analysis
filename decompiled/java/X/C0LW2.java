package X;

/* JADX INFO: renamed from: X.0LW2, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.EditorProT2VTask", f = "EditorProT2VTask.kt", l = {422, 423}, m = "stop")
public final class C0LW2 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C543970LVb LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LW2(C543970LVb c543970LVb, InterfaceC1364105Vn<? super C0LW2> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c543970LVb;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EditorProT2VTask@7008.stop$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLJJLI.LIZIZ(this);
        C1C7U.LIZIZ("EditorProT2VTask@7008.stop$1");
        return objLIZIZ;
    }
}
