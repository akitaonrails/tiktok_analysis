package X;

import com.ss.android.ugc.aweme.aigc.asynctask.CommonAigcQuotaInput;

/* JADX INFO: renamed from: X.0LSW, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.aicreation.childtask.AICreationQuotaTask", f = "AICreationQuotaTask.kt", l = {79, 92}, m = "beginTask")
public final class C0LSW extends AbstractC23140094w {
    public CommonAigcQuotaInput LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0LSS LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LSW(C0LSS c0lss, InterfaceC1364105Vn<? super C0LSW> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c0lss;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AICreationQuotaTask@5481.beginTask$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJJJLIIL = this.LLILLL.LJJJLIIL(null, this);
        C1C7U.LIZIZ("AICreationQuotaTask@5481.beginTask$1");
        return objLJJJLIIL;
    }
}
