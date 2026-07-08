package X;

/* JADX INFO: renamed from: X.0LUt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.GeneralI2VServerTask", f = "GeneralI2VServerTask.kt", l = {122, 133}, m = "beginTask")
public final class C543890LUt extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C543820LUm LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C543890LUt(C543820LUm c543820LUm, InterfaceC1364105Vn<? super C543890LUt> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c543820LUm;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GeneralI2VServerTask@4e5.beginTask$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJJJJJL = this.LLILLJJLI.LJJJJJL(null, this);
        C1C7U.LIZIZ("GeneralI2VServerTask@4e5.beginTask$1");
        return objLJJJJJL;
    }
}
