package X;

/* JADX INFO: renamed from: X.0LRL, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.GeneralI2VTask", f = "GeneralI2VTask.kt", l = {140, 171, 172, 175}, m = "stepImageUpload")
public final class C0LRL extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0LRF LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LRL(C0LRF c0lrf, InterfaceC1364105Vn<? super C0LRL> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c0lrf;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GeneralI2VTask@5977.stepImageUpload$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJJJJLL = this.LLILLL.LJJJJLL(null, this);
        C1C7U.LIZIZ("GeneralI2VTask@5977.stepImageUpload$1");
        return objLJJJJLL;
    }
}
