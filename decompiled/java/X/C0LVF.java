package X;

/* JADX INFO: renamed from: X.0LVF, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.aicreation.childtask.AICreationServerProgressTask", f = "AICreationServerProgressTask.kt", l = {335}, m = "requestProgressMock")
public final class C0LVF extends AbstractC23140094w {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0LV4 LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LVF(C0LV4 c0lv4, InterfaceC1364105Vn<? super C0LVF> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c0lv4;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AICreationServerProgressTask@fd9e.requestProgressMock$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJJLIIIJ = this.LLILLL.LJJLIIIJ(this);
        C1C7U.LIZIZ("AICreationServerProgressTask@fd9e.requestProgressMock$1");
        return objLJJLIIIJ;
    }
}
