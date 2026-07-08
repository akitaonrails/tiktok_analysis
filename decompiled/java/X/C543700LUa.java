package X;

/* JADX INFO: renamed from: X.0LUa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.aicreation.childtask.AICreationServerTask", f = "AICreationServerTask.kt", l = {339, 340}, m = "cancel")
public final class C543700LUa extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C0LUW LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C543700LUa(C0LUW c0luw, InterfaceC1364105Vn<? super C543700LUa> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c0luw;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AICreationServerTask@593.cancel$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJIIJ = this.LLILLJJLI.LJIIJ(this);
        C1C7U.LIZIZ("AICreationServerTask@593.cancel$1");
        return objLJIIJ;
    }
}
