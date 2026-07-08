package X;

/* JADX INFO: renamed from: X.0LUs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.GeneralI2VServerTask", f = "GeneralI2VServerTask.kt", l = {139, 205, 209, 214, 216}, m = "stepRequestServer")
public final class C543880LUs extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C543820LUm LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C543880LUs(C543820LUm c543820LUm, InterfaceC1364105Vn<? super C543880LUs> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c543820LUm;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GeneralI2VServerTask@4e5.stepRequestServer$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJJJZ = this.LLILLL.LJJJZ(null, this);
        C1C7U.LIZIZ("GeneralI2VServerTask@4e5.stepRequestServer$1");
        return objLJJJZ;
    }
}
