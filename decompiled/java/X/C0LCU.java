package X;

import com.ss.android.ugc.aweme.aigc.asynctask.AIGCPushMessage;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;

/* JADX INFO: renamed from: X.0LCU, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.CreationAsyncTaskDraftHelper", f = "CreationAsyncTaskDraftHelper.kt", l = {95, 112, 113, 120, 129}, m = "updateDraft")
public final class C0LCU extends AbstractC23140094w {
    public AIGCPushMessage LL;
    public AwemeDraft LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public Object LLILZIL;
    public Object LLILZLL;
    public /* synthetic */ Object LLIZ;
    public final /* synthetic */ C0LCT LLIZLLLIL;
    public int LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LCU(C0LCT c0lct, InterfaceC1364105Vn<? super C0LCU> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLIZLLLIL = c0lct;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CreationAsyncTaskDraftHelper@dd98.updateDraft$1");
        this.LLIZ = obj;
        this.LLJ |= Integer.MIN_VALUE;
        Object objLJ = this.LLIZLLLIL.LJ(null, null, this);
        C1C7U.LIZIZ("CreationAsyncTaskDraftHelper@dd98.updateDraft$1");
        return objLJ;
    }
}
