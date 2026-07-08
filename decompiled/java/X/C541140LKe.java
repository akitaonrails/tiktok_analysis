package X;

/* JADX INFO: renamed from: X.0LKe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.AutoCut2MAETask", f = "AutoCut2MAETask.kt", l = {890, 894}, m = "cancel")
public final class C541140LKe extends AbstractC23140094w {
    public long LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C541110LKb LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C541140LKe(C541110LKb c541110LKb, InterfaceC1364105Vn<? super C541140LKe> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c541110LKb;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AutoCut2MAETask@5514.cancel$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJIIJ = this.LLILLL.LJIIJ(this);
        C1C7U.LIZIZ("AutoCut2MAETask@5514.cancel$1");
        return objLJIIJ;
    }
}
