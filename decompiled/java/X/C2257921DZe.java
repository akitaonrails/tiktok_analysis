package X;

import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;

/* JADX INFO: renamed from: X.1DZe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
@C09DV(c = "com.ss.android.ugc.aweme.utils.ChatCustomizeAnalytics", f = "ChatCustomizeAnalytics.kt", l = {DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL}, m = "reportExitEvent")
public final class C2257921DZe extends AbstractC23140094w {
    public InterfaceC1493105sv LL;
    public Object LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C2257891DZb LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2257921DZe(C2257891DZb c2257891DZb, InterfaceC1364105Vn<? super C2257921DZe> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c2257891DZb;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ChatCustomizeAnalytics@300f.reportExitEvent$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLJII = this.LLILZ.LJII(null, false, null, false, null, null, null, this);
        C1C7U.LIZIZ("ChatCustomizeAnalytics@300f.reportExitEvent$1");
        return objLJII;
    }
}
