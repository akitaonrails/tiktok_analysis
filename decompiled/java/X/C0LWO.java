package X;

/* JADX INFO: renamed from: X.0LWO, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.EditorProR2VTask", f = "EditorProR2VTask.kt", l = {221, 224, 227}, m = "requestProgress")
public final class C0LWO extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C543980LVc LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LWO(C543980LVc c543980LVc, InterfaceC1364105Vn<? super C0LWO> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c543980LVc;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EditorProR2VTask@7046.requestProgress$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJJJJLL = this.LLILLL.LJJJJLL(this);
        C1C7U.LIZIZ("EditorProR2VTask@7046.requestProgress$1");
        return objLJJJJLL;
    }
}
