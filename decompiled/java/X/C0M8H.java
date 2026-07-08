package X;

import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.tools.draft.operate.DraftCopy;

/* JADX INFO: renamed from: X.0M8H, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.operate.DraftCopy", f = "DraftCopy.kt", l = {315}, m = "copyDraft")
public final class C0M8H extends AbstractC23140094w {
    public AwemeDraft LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public AwemeDraft LLILZIL;
    public Object LLILZLL;
    public /* synthetic */ Object LLIZ;
    public final /* synthetic */ DraftCopy LLIZLLLIL;
    public int LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0M8H(DraftCopy draftCopy, InterfaceC1364105Vn<? super C0M8H> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLIZLLLIL = draftCopy;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DraftCopy@7ae.copyDraft$4");
        this.LLIZ = obj;
        this.LLJ |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLIZLLLIL.LIZIZ(null, null, null, null, false, null, null, null, this);
        C1C7U.LIZIZ("DraftCopy@7ae.copyDraft$4");
        return objLIZIZ;
    }
}
