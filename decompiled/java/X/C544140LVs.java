package X;

/* JADX INFO: renamed from: X.0LVs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.EditorProT2ITask", f = "EditorProT2ITask.kt", l = {417, 421}, m = "cancel")
public final class C544140LVs extends AbstractC23140094w {
    public long LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C543990LVd LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C544140LVs(C543990LVd c543990LVd, InterfaceC1364105Vn<? super C544140LVs> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c543990LVd;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EditorProT2ITask@3dc4.cancel$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJIIJ = this.LLILLL.LJIIJ(this);
        C1C7U.LIZIZ("EditorProT2ITask@3dc4.cancel$1");
        return objLJIIJ;
    }
}
