package X;

/* JADX INFO: renamed from: X.0LUh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.workflowmanager.aigcbusiness.text2image.Text2ImageServerTask", f = "Text2ImageServerTask.kt", l = {185, 186}, m = "cancel")
public final class C543770LUh extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C543750LUf LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C543770LUh(C543750LUf c543750LUf, InterfaceC1364105Vn<? super C543770LUh> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c543750LUf;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("Text2ImageServerTask@3222.cancel$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJIIJ = this.LLILLJJLI.LJIIJ(this);
        C1C7U.LIZIZ("Text2ImageServerTask@3222.cancel$1");
        return objLJIIJ;
    }
}
