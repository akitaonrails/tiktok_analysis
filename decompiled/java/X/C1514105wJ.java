package X;

import java.util.Collections;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05wJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.analytics.StreakPetAnalytics$reportStreakPetWidgetShow$1", f = "StreakPetAnalytics.kt", l = {}, m = "invokeSuspend")
public final class C1514105wJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InterfaceC1493105sv LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1514105wJ(InterfaceC1493105sv interfaceC1493105sv, String str, InterfaceC1364105Vn<? super C1514105wJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = interfaceC1493105sv;
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1514105wJ(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StreakPetAnalytics@6f57.reportStreakPetWidgetShow$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC1493105sv interfaceC1493105sv = this.LL;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = this.LLILLJJLI;
        C1567906Bx.LIZ(str, linkedHashMap);
        C066Y.LIZ(C066Y.LIZIZ, linkedHashMap, str, Collections.singleton("is_streak_pet_available"), null, 12);
        interfaceC1493105sv.sendEvent("streak_pet_widget_show", linkedHashMap);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StreakPetAnalytics@6f57.reportStreakPetWidgetShow$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
