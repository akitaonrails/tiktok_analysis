package X;

import java.util.Collections;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05wK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.analytics.StreakPetAnalytics$reportStreakPetWidgetInteraction$1", f = "StreakPetAnalytics.kt", l = {}, m = "invokeSuspend")
public final class C1514205wK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ InterfaceC1493105sv LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1514205wK(boolean z, InterfaceC1493105sv interfaceC1493105sv, String str, InterfaceC1364105Vn<? super C1514205wK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = z;
        this.LLILLJJLI = interfaceC1493105sv;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1514205wK(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C1C7U.LIZ("StreakPetAnalytics@6f57.reportStreakPetWidgetInteraction$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL) {
            str = "click";
        } else {
            str = "drag";
        }
        InterfaceC1493105sv interfaceC1493105sv = this.LLILLJJLI;
        Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(new Pair("action", str));
        String str2 = this.LLILLL;
        C1567906Bx.LIZ(str2, mapLJIIJ);
        C066Y.LIZ(C066Y.LIZIZ, mapLJIIJ, str2, Collections.singleton("is_streak_pet_available"), null, 12);
        interfaceC1493105sv.sendEvent("streak_pet_widget_interaction", mapLJIIJ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StreakPetAnalytics@6f57.reportStreakPetWidgetInteraction$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
