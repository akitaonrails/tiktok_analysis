package X;

/* JADX INFO: renamed from: X.0LUc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.aicreation.childtask.AICreationServerTask", f = "AICreationServerTask.kt", l = {97, 109, 110}, m = "handleInput")
public final class C543720LUc extends AbstractC23140094w {
    public C09JG LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0LUW LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C543720LUc(C0LUW c0luw, InterfaceC1364105Vn<? super C543720LUc> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c0luw;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AICreationServerTask@593.handleInput$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJJJLZIJ = this.LLILLL.LJJJLZIJ(null, this);
        C1C7U.LIZIZ("AICreationServerTask@593.handleInput$1");
        return objLJJJLZIJ;
    }
}
