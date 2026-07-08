package X;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05t5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.analytics.StreakSharePanelAnalytics$reportStreakInviteFollowDialog$1", f = "StreakSharePanelAnalytics.kt", l = {}, m = "invokeSuspend")
public final class C1494105t5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InterfaceC1493105sv LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1494105t5(InterfaceC1493105sv interfaceC1493105sv, String str, String str2, InterfaceC1364105Vn<? super C1494105t5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = interfaceC1493105sv;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1494105t5(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StreakSharePanelAnalytics@fb9b.reportStreakInviteFollowDialog$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.sendEvent("streak_flow_follow_dialog", C2097608Jq.LJIIJ(new Pair("conversation_id", this.LLILLJJLI), new Pair("action", this.LLILLL)));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StreakSharePanelAnalytics@fb9b.reportStreakInviteFollowDialog$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
