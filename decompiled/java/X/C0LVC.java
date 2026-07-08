package X;

/* JADX INFO: renamed from: X.0LVC, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.aicreation.childtask.AICreationServerProgressTask", f = "AICreationServerProgressTask.kt", l = {230, 239, 254, 267, 268, 275}, m = "handleServerTaskDetail")
public final class C0LVC extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C0LV4 LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LVC(C0LV4 c0lv4, InterfaceC1364105Vn<? super C0LVC> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c0lv4;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AICreationServerProgressTask@fd9e.handleServerTaskDetail$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJJL = this.LLILLJJLI.LJJL(null, this);
        C1C7U.LIZIZ("AICreationServerProgressTask@fd9e.handleServerTaskDetail$1");
        return objLJJL;
    }
}
