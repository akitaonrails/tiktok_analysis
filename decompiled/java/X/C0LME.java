package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;

/* JADX INFO: renamed from: X.0LME, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.aicreation.childtask.AICreationSaveDraftTask", f = "AICreationSaveDraftTask.kt", l = {BaseNotice.RECOMMEND_LIVE}, m = "handleInput")
public final class C0LME extends AbstractC23140094w {
    public C09JG LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0LMB LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LME(C0LMB c0lmb, InterfaceC1364105Vn<? super C0LME> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c0lmb;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AICreationSaveDraftTask@c95e.handleInput$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJJJLL = this.LLILLL.LJJJLL(null, this);
        C1C7U.LIZIZ("AICreationSaveDraftTask@c95e.handleInput$1");
        return objLJJJLL;
    }
}
