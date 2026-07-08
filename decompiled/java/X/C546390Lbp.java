package X;

import com.ss.android.ugc.aweme.portrait.service.AIPortraitDraftServiceImpl;

/* JADX INFO: renamed from: X.0Lbp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.portrait.service.AIPortraitDraftServiceImpl", f = "AIPortraitDraftServiceImpl.kt", l = {35}, m = "isLocalDraftImageMode")
public final class C546390Lbp extends AbstractC23140094w {
    public InterfaceC546090LbL LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ AIPortraitDraftServiceImpl LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C546390Lbp(AIPortraitDraftServiceImpl aIPortraitDraftServiceImpl, InterfaceC1364105Vn<? super C546390Lbp> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = aIPortraitDraftServiceImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIPortraitDraftServiceImpl@1418.isLocalDraftImageMode$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLL.LIZ(null, this);
        C1C7U.LIZIZ("AIPortraitDraftServiceImpl@1418.isLocalDraftImageMode$1");
        return objLIZ;
    }
}
