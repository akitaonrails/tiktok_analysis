package X;

/* JADX INFO: renamed from: X.0LVt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.EditorProT2VTask", f = "EditorProT2VTask.kt", l = {480, 484}, m = "cancel")
public final class C544150LVt extends AbstractC23140094w {
    public long LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C543970LVb LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C544150LVt(C543970LVb c543970LVb, InterfaceC1364105Vn<? super C544150LVt> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c543970LVb;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EditorProT2VTask@7008.cancel$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJIIJ = this.LLILLL.LJIIJ(this);
        C1C7U.LIZIZ("EditorProT2VTask@7008.cancel$1");
        return objLJIIJ;
    }
}
