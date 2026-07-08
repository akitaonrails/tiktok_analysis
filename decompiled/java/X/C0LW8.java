package X;

/* JADX INFO: renamed from: X.0LW8, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.workflowmanager.aigcbusiness.text2image.Text2ImageProgressTask", f = "Text2ImageProgressTask.kt", l = {92}, m = "handleInput")
public final class C0LW8 extends AbstractC23140094w {
    public C09JG LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C544010LVf LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LW8(C544010LVf c544010LVf, InterfaceC1364105Vn<? super C0LW8> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c544010LVf;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("Text2ImageProgressTask@31bc.handleInput$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJJJJLI = this.LLILLL.LJJJJLI(null, this);
        C1C7U.LIZIZ("Text2ImageProgressTask@31bc.handleInput$1");
        return objLJJJJLI;
    }
}
