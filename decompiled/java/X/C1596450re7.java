package X;

import com.ss.android.ugc.aweme.bean.MixRankSkylightRequest;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0re7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.base.util.SkylightNetworkUtil", f = "SkylightNetworkUtil.kt", l = {238}, m = "requestMixRankSkylightData$feed_skylight_release")
public final class C1596450re7 extends AbstractC23140094w {
    public MixRankSkylightRequest LL;
    public Function1 LLILLJJLI;
    public long LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C1596430re5 LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1596450re7(C1596430re5 c1596430re5, InterfaceC1364105Vn<? super C1596450re7> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = c1596430re5;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SkylightNetworkUtil@4ee0.requestMixRankSkylightData$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLJ = this.LLILZIL.LJ(null, null, this);
        C1C7U.LIZIZ("SkylightNetworkUtil@4ee0.requestMixRankSkylightData$1");
        return objLJ;
    }
}
