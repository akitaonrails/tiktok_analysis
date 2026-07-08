package X;

import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;

/* JADX INFO: renamed from: X.0yb6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.base.handlers.MessageOperatorHandler", f = "MessageOperatorHandler.kt", l = {297, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL}, m = "tryInitTako")
public final class C1863660yb6 extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1863280yaU LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1863660yb6(C1863280yaU c1863280yaU, InterfaceC1364105Vn<? super C1863660yb6> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c1863280yaU;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MessageOperatorHandler@b589.tryInitTako$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJJLIIIJJIZ = this.LLILLL.LJJLIIIJJIZ(this, null, false);
        C1C7U.LIZIZ("MessageOperatorHandler@b589.tryInitTako$1");
        return objLJJLIIIJJIZ;
    }
}
