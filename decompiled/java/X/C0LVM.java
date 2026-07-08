package X;

/* JADX INFO: renamed from: X.0LVM, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.GeneralI2VServerProgressTask", f = "GeneralI2VServerProgressTask.kt", l = {109, 120}, m = "beginTask")
public final class C0LVM extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C0LVI LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LVM(C0LVI c0lvi, InterfaceC1364105Vn<? super C0LVM> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c0lvi;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GeneralI2VServerProgressTask@5734.beginTask$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJJJJJL = this.LLILLJJLI.LJJJJJL(null, this);
        C1C7U.LIZIZ("GeneralI2VServerProgressTask@5734.beginTask$1");
        return objLJJJJJL;
    }
}
