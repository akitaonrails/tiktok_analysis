package X;

import com.ss.android.ugc.aweme.aigc.DraftServiceImpl;

/* JADX INFO: renamed from: X.0Lbt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.DraftServiceImpl", f = "DraftServiceImpl.kt", l = {197, 199, 203, 240}, m = "queryDraftByServerTaskId")
public final class C546430Lbt extends AbstractC23140094w {
    public InterfaceC546090LbL LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ DraftServiceImpl LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C546430Lbt(DraftServiceImpl draftServiceImpl, InterfaceC1364105Vn<? super C546430Lbt> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = draftServiceImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DraftServiceImpl@2753.queryDraftByServerTaskId$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLJII = this.LLILZIL.LJII(null, null, null, this);
        C1C7U.LIZIZ("DraftServiceImpl@2753.queryDraftByServerTaskId$1");
        return objLJII;
    }
}
