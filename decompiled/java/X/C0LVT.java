package X;

/* JADX INFO: renamed from: X.0LVT, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.EditI2VServerTask", f = "EditI2VServerTask.kt", l = {223, 226, 230, 231, 232, 244}, m = "requestProgress")
public final class C0LVT extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C0LVQ LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LVT(C0LVQ c0lvq, InterfaceC1364105Vn<? super C0LVT> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c0lvq;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EditI2VServerTask@cf5c.requestProgress$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLJJJJZ = this.LLILZ.LJJJJZ(null, this);
        C1C7U.LIZIZ("EditI2VServerTask@cf5c.requestProgress$1");
        return objLJJJJZ;
    }
}
