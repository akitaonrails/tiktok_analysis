package X;

import com.ss.android.ugc.aweme.draft.model.AwemeDraft;

/* JADX INFO: renamed from: X.0LQa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.workflowmanager.aigcbusiness.text2image.Text2ImageTask", f = "Text2ImageTask.kt", l = {89, 73, 74, 77}, m = "finishTask")
public final class C542660LQa extends AbstractC23140094w {
    public InterfaceC383701eN LL;
    public AwemeDraft LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C0LQZ LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C542660LQa(C0LQZ c0lqz, InterfaceC1364105Vn<? super C542660LQa> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c0lqz;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("Text2ImageTask@92c7.finishTask$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLJJJLIIL = LJJJLIIL(this);
        C1C7U.LIZIZ("Text2ImageTask@92c7.finishTask$1");
        return objLJJJLIIL;
    }
}
