package X;

import com.ss.android.ugc.aweme.unifiedauthapi.model.UnifiedAuthPopupConfig;

/* JADX INFO: renamed from: X.10Cx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.ss.android.ugc.aweme.unifiedauth.intelligent.PushServerIntelligentPopupHelper", f = "PushServerIntelligentPopupHelper.kt", l = {189, 203}, m = "onServerIntelligentResult")
public final class C19208910Cx extends AbstractC23140094w {
    public UnifiedAuthPopupConfig LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public Object LLILZIL;
    public Object LLILZLL;
    public boolean LLIZ;
    public long LLIZLLLIL;
    public /* synthetic */ Object LLJ;
    public final /* synthetic */ C19208210Cq LLJI;
    public int LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19208910Cx(C19208210Cq c19208210Cq, InterfaceC1364105Vn<? super C19208910Cx> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLJI = c19208210Cq;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PushServerIntelligentPopupHelper@92aa.onServerIntelligentResult$1");
        this.LLJ = obj;
        this.LLJIJIL |= Integer.MIN_VALUE;
        Object objLIZJ = this.LLJI.LIZJ(null, null, false, null, null, null, null, 0L, null, this);
        C1C7U.LIZIZ("PushServerIntelligentPopupHelper@92aa.onServerIntelligentResult$1");
        return objLIZJ;
    }
}
