package X;

import com.ss.android.ugc.aweme.aigc.asynctask.CheckCameoPermissionTaskInput;

/* JADX INFO: renamed from: X.0LNg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.aicreation.childtask.AICreationCheckCameoPermissionTask", f = "AICreationCheckCameoPermissionTask.kt", l = {99, 113}, m = "beginTask")
public final class C541940LNg extends AbstractC23140094w {
    public CheckCameoPermissionTaskInput LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C541920LNe LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C541940LNg(C541920LNe c541920LNe, InterfaceC1364105Vn<? super C541940LNg> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c541920LNe;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AICreationCheckCameoPermissionTask@499.beginTask$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJJJLIIL = this.LLILLL.LJJJLIIL(null, this);
        C1C7U.LIZIZ("AICreationCheckCameoPermissionTask@499.beginTask$1");
        return objLJJJLIIL;
    }
}
