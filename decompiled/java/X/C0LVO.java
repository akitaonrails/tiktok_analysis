package X;

/* JADX INFO: renamed from: X.0LVO, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.GeneralI2VServerProgressTask", f = "GeneralI2VServerProgressTask.kt", l = {148, 160}, m = "requestProgress")
public final class C0LVO extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0LVI LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LVO(C0LVI c0lvi, InterfaceC1364105Vn<? super C0LVO> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c0lvi;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GeneralI2VServerProgressTask@5734.requestProgress$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJJJJLL = this.LLILLL.LJJJJLL(null, this);
        C1C7U.LIZIZ("GeneralI2VServerProgressTask@5734.requestProgress$1");
        return objLJJJJLL;
    }
}
