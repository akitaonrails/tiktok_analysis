package X;

import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;

/* JADX INFO: renamed from: X.0CXp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.amazon.AmazonLoginHandler", f = "AmazonLoginHandler.kt", l = {DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL}, m = "refreshTokensRequest")
public final class C315310CXp extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C0DHD LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C315310CXp(C0DHD c0dhd, InterfaceC1364105Vn<? super C315310CXp> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c0dhd;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AmazonLoginHandler@ccef.refreshTokensRequest$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZLLL = this.LLILLJJLI.LIZLLL(this);
        C1C7U.LIZIZ("AmazonLoginHandler@ccef.refreshTokensRequest$1");
        return objLIZLLL;
    }
}
