package X;

/* JADX INFO: renamed from: X.0LRG, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.GeneralI2VTask", f = "GeneralI2VTask.kt", l = {70, 71, 78, 79, 80, 81, 82, 83, 84}, m = "run")
public final class C0LRG extends AbstractC23140094w {
    public C09JG LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0LRF LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LRG(C0LRF c0lrf, InterfaceC1364105Vn<? super C0LRG> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c0lrf;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GeneralI2VTask@5977.run$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJFF = this.LLILLL.LJFF(null, this);
        C1C7U.LIZIZ("GeneralI2VTask@5977.run$1");
        return objLJFF;
    }
}
