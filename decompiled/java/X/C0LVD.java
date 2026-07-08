package X;

/* JADX INFO: renamed from: X.0LVD, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.aicreation.childtask.AICreationServerProgressTask", f = "AICreationServerProgressTask.kt", l = {141, 142}, m = "checkTimeOut")
public final class C0LVD extends AbstractC23140094w {
    public long LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0LV4 LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LVD(C0LV4 c0lv4, InterfaceC1364105Vn<? super C0LVD> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c0lv4;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AICreationServerProgressTask@fd9e.checkTimeOut$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJJJLL = this.LLILLL.LJJJLL(this);
        C1C7U.LIZIZ("AICreationServerProgressTask@fd9e.checkTimeOut$1");
        return objLJJJLL;
    }
}
