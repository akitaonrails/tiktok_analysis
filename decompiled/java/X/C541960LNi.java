package X;

/* JADX INFO: renamed from: X.0LNi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.aicreation.childtask.AICreationCheckCameoPermissionTask", f = "AICreationCheckCameoPermissionTask.kt", l = {118, 119, 123, 126, 127, 131}, m = "checkCameoPermission")
public final class C541960LNi extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C541920LNe LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C541960LNi(C541920LNe c541920LNe, InterfaceC1364105Vn<? super C541960LNi> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c541920LNe;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AICreationCheckCameoPermissionTask@499.checkCameoPermission$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJJJLL = this.LLILLJJLI.LJJJLL(null, this);
        C1C7U.LIZIZ("AICreationCheckCameoPermissionTask@499.checkCameoPermission$1");
        return objLJJJLL;
    }
}
