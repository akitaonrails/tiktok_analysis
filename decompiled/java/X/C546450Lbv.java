package X;

import com.ss.android.ugc.aweme.aigc.DraftServiceImpl;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;

/* JADX INFO: renamed from: X.0Lbv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.DraftServiceImpl", f = "DraftServiceImpl.kt", l = {306}, m = "updateAIGCInfoWhenRestore")
public final class C546450Lbv extends AbstractC23140094w {
    public AwemeDraft LL;
    public Object LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ DraftServiceImpl LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C546450Lbv(DraftServiceImpl draftServiceImpl, InterfaceC1364105Vn<? super C546450Lbv> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = draftServiceImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DraftServiceImpl@2753.updateAIGCInfoWhenRestore$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLJIJ = this.LLILZ.LIZJ(null, this);
        C1C7U.LIZIZ("DraftServiceImpl@2753.updateAIGCInfoWhenRestore$1");
        return objLJIJ;
    }
}
