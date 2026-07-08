package X;

import com.ss.android.ugc.aweme.aigc.NavigateServiceImpl;
import com.ss.android.ugc.aweme.aikit.api.common.AIGCDraft;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;

/* JADX INFO: renamed from: X.0LO9, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.NavigateServiceImpl", f = "NavigateServiceImpl.kt", l = {311, 313, 323}, m = "realNavigateGenerateFail")
public final class C0LO9 extends AbstractC23140094w {
    public Object LL;
    public AIGCDraft LLILLJJLI;
    public AwemeDraft LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ NavigateServiceImpl LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LO9(NavigateServiceImpl navigateServiceImpl, InterfaceC1364105Vn<? super C0LO9> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = navigateServiceImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("NavigateServiceImpl@832b.realNavigateGenerateFail$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLJIIIIZZ = this.LLILZIL.LJIIIIZZ(null, null, null, this);
        C1C7U.LIZIZ("NavigateServiceImpl@832b.realNavigateGenerateFail$1");
        return objLJIIIIZZ;
    }
}
