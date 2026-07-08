package X;

/* JADX INFO: renamed from: X.0LRO, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.GeneralI2VTask", f = "GeneralI2VTask.kt", l = {134}, m = "beginTask")
public final class C0LRO extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C0LRF LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LRO(C0LRF c0lrf, InterfaceC1364105Vn<? super C0LRO> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c0lrf;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GeneralI2VTask@5977.beginTask$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJJJJJL = this.LLILLJJLI.LJJJJJL(this);
        C1C7U.LIZIZ("GeneralI2VTask@5977.beginTask$1");
        return objLJJJJJL;
    }
}
