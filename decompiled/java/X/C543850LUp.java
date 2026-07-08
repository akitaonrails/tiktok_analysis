package X;

/* JADX INFO: renamed from: X.0LUp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.GeneralI2VServerTask", f = "GeneralI2VServerTask.kt", l = {74, 75, 78, 79, 81, 83}, m = "run")
public final class C543850LUp extends AbstractC23140094w {
    public C09JG LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C543820LUm LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C543850LUp(C543820LUm c543820LUm, InterfaceC1364105Vn<? super C543850LUp> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c543820LUm;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GeneralI2VServerTask@4e5.run$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJFF = this.LLILLL.LJFF(null, this);
        C1C7U.LIZIZ("GeneralI2VServerTask@4e5.run$1");
        return objLJFF;
    }
}
