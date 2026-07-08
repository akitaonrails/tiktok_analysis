package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;

/* JADX INFO: renamed from: X.0Czv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.data.recommend.source.RecommendApiDataSource", f = "RecommendApiDataSource.kt", l = {LiveToolbarIconStyleSetting.GRAY_WITH_TEXT}, m = "fetchRecommendations-gIAlu-s")
public final class C332010Czv extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C332000Czu LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C332010Czv(C332000Czu c332000Czu, InterfaceC1364105Vn<? super C332010Czv> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c332000Czu;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RecommendApiDataSource@1564.fetchRecommendations$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLJJLI.LIZ(null, this);
        if (objLIZ == C099R.LJFF()) {
            C1C7U.LIZIZ("RecommendApiDataSource@1564.fetchRecommendations$1");
            return objLIZ;
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objLIZ);
        C1C7U.LIZIZ("RecommendApiDataSource@1564.fetchRecommendations$1");
        return c189200o6M1boximpl;
    }
}
