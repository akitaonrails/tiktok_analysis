package X;

import com.ss.android.ugc.aweme.im.streak.api.StreakData;
import com.ss.android.ugc.aweme.im.streak.api.pet.StreakPetData;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06DM, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.analytics.StreakInlineAnalytics$reportStreakInlineMessageActionClick$1", f = "StreakInlineAnalytics.kt", l = {}, m = "invokeSuspend")
public final class C06DM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ C06H2 LLILLL;
    public final /* synthetic */ InterfaceC1493105sv LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06DM(String str, String str2, C06H2 c06h2, InterfaceC1493105sv interfaceC1493105sv, InterfaceC1364105Vn<? super C06DM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = c06h2;
        this.LLILZ = interfaceC1493105sv;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C06DM(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StreakInlineAnalytics@ca80.reportStreakInlineMessageActionClick$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1575806Ey c1575806Ey = C1575806Ey.LIZJ;
        String str = this.LL;
        c1575806Ey.getClass();
        StreakData streakDataLJIIIIZZ = C1575806Ey.LJIIIIZZ(str);
        C06C6 c06c6 = C06C6.LIZIZ;
        String str2 = this.LL;
        c06c6.getClass();
        StreakPetData streakPetDataLIZIZ = C06C6.LIZIZ(str2);
        Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(new Pair(C06DL.MSG_SCENE.getValue(), this.LLILLJJLI), new Pair(C06DL.ENTER_FROM.getValue(), this.LLILLL.getValue()), new Pair(C06DL.CONVERSATION_ID.getValue(), this.LL), new Pair(C06DL.CONVERSATION_TYPE.getValue(), String.valueOf(C1567806Bw.LIZIZ(this.LL))));
        C06DK.LIZ(mapLJIIJ, this.LL, streakDataLJIIIIZZ, streakPetDataLIZIZ);
        this.LLILZ.sendEvent("streak_inline_message_click", mapLJIIJ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StreakInlineAnalytics@ca80.reportStreakInlineMessageActionClick$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
