package X;

/* JADX INFO: renamed from: X.0LUi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.workflowmanager.aigcbusiness.text2image.Text2ImageServerTask", f = "Text2ImageServerTask.kt", l = {61, 68, 69}, m = "handleInput")
public final class C543780LUi extends AbstractC23140094w {
    public C09JG LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C543750LUf LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C543780LUi(C543750LUf c543750LUf, InterfaceC1364105Vn<? super C543780LUi> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c543750LUf;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("Text2ImageServerTask@3222.handleInput$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJJJJL = this.LLILLL.LJJJJL(null, this);
        C1C7U.LIZIZ("Text2ImageServerTask@3222.handleInput$1");
        return objLJJJJL;
    }
}
