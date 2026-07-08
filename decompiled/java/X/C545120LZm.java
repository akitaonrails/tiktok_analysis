package X;

import com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager;
import com.ss.android.ugc.aweme.aigc.asynctask.models.ParentTaskInput;

/* JADX INFO: renamed from: X.0LZm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.draftbox.utils.aigc.AIGCArchNewFrameworkDraftTools", f = "AIGCArchNewFrameworkDraftTools.kt", l = {237, 254, 279, 282}, m = "performGradeDown")
public final class C545120LZm extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public ICreationAsyncTaskManager LLILZIL;
    public ParentTaskInput LLILZLL;
    public /* synthetic */ Object LLIZ;
    public final /* synthetic */ C545110LZl LLIZLLLIL;
    public int LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C545120LZm(C545110LZl c545110LZl, InterfaceC1364105Vn<? super C545120LZm> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLIZLLLIL = c545110LZl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIGCArchNewFrameworkDraftTools@d6e0.performGradeDown$1");
        this.LLIZ = obj;
        this.LLJ |= Integer.MIN_VALUE;
        Object objLIZLLL = this.LLIZLLLIL.LIZLLL(null, null, null, null, this);
        C1C7U.LIZIZ("AIGCArchNewFrameworkDraftTools@d6e0.performGradeDown$1");
        return objLIZLLL;
    }
}
