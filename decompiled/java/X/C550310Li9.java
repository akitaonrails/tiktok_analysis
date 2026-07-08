package X;

import com.ss.android.ugc.aweme.portrait.model.AIPortraitGeneratingModel;

/* JADX INFO: renamed from: X.0Li9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.portrait.config.AIPortraitDraftRestoreHandler", f = "AIPortraitDraftRestoreHandler.kt", l = {100}, m = "updateModeForFailed")
public final class C550310Li9 extends AbstractC23140094w {
    public AIPortraitGeneratingModel LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C550280Li6 LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C550310Li9(C550280Li6 c550280Li6, InterfaceC1364105Vn<? super C550310Li9> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c550280Li6;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIPortraitDraftRestoreHandler@541f.updateModeForFailed$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZLLL = this.LLILLL.LIZLLL(this);
        C1C7U.LIZIZ("AIPortraitDraftRestoreHandler@541f.updateModeForFailed$1");
        return objLIZLLL;
    }
}
