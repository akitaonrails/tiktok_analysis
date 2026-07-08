package X;

/* JADX INFO: renamed from: X.0LUZ, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.aicreation.childtask.AICreationServerTask", f = "AICreationServerTask.kt", l = {400, 156, 221, 237, 242, 251, 259}, m = "stepRequestServer")
public final class C0LUZ extends AbstractC23140094w {
    public C09JG LL;
    public InterfaceC383701eN LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C0LUW LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LUZ(C0LUW c0luw, InterfaceC1364105Vn<? super C0LUZ> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c0luw;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AICreationServerTask@593.stepRequestServer$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLJJJZ = this.LLILZ.LJJJZ(null, this);
        C1C7U.LIZIZ("AICreationServerTask@593.stepRequestServer$1");
        return objLJJJZ;
    }
}
