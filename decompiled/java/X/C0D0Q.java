package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0D0Q, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.components.waterfall.WaterfallRecommendationLoader", f = "WaterfallRecommendationLoader.kt", l = {LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT, 39}, m = "load$ucp_impl_release")
public final class C0D0Q extends AbstractC23140094w {
    public C0D0E LL;
    public C0D0R LLILLJJLI;
    public Function2 LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C0D0O LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0D0Q(C0D0O c0d0o, InterfaceC1364105Vn<? super C0D0Q> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = c0d0o;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("WaterfallRecommendationLoader@fa8a.load$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLIZJ = this.LLILZIL.LIZJ(null, null, null, this);
        C1C7U.LIZIZ("WaterfallRecommendationLoader@fa8a.load$1");
        return objLIZJ;
    }
}
