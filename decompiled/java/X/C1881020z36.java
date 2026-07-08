package X;

import com.bytedance.android.livesdk.livesetting.game.partnership.GameLiveLeaderBoardDSLSetting;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0z36, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.host.leaderboard.LeaderboardMixPageHost$onRequestDSL$1", f = "LeaderboardMixPageHost.kt", l = {}, m = "invokeSuspend")
public final class C1881020z36 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1881420z3k LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1881020z36(C1881420z3k c1881420z3k, InterfaceC1364105Vn<? super C1881020z36> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1881420z3k;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1881020z36(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LeaderboardMixPageHost@cc27.onRequestDSL$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        LJIJ(C1881030z37.LIZIZ(new C1881820z4O(GameLiveLeaderBoardDSLSetting.INSTANCE.getDSL(), null)), false);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LeaderboardMixPageHost@cc27.onRequestDSL$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
