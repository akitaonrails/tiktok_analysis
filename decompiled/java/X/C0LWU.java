package X;

/* JADX INFO: renamed from: X.0LWU, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.workflowmanager.aigcbusiness.text2image.Text2ImageProgressTask", f = "Text2ImageProgressTask.kt", l = {132, 134}, m = "requestProgress")
public final class C0LWU extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C544010LVf LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LWU(C544010LVf c544010LVf, InterfaceC1364105Vn<? super C0LWU> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c544010LVf;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("Text2ImageProgressTask@31bc.requestProgress$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJJJJLL = this.LLILLJJLI.LJJJJLL(null, this);
        C1C7U.LIZIZ("Text2ImageProgressTask@31bc.requestProgress$1");
        return objLJJJJLL;
    }
}
