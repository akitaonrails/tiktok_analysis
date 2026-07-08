package X;

/* JADX INFO: renamed from: X.0LRK, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.GeneralI2VTask", f = "GeneralI2VTask.kt", l = {256, 264, 272, 293, 301, 309, 312, 313}, m = "stepDownload")
public final class C0LRK extends AbstractC23140094w {
    public Object LL;
    public C09JG LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C0LRF LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LRK(C0LRF c0lrf, InterfaceC1364105Vn<? super C0LRK> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c0lrf;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GeneralI2VTask@5977.stepDownload$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLJJJJLI = this.LLILZ.LJJJJLI(this);
        C1C7U.LIZIZ("GeneralI2VTask@5977.stepDownload$1");
        return objLJJJJLI;
    }
}
