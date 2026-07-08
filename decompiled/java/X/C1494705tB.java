package X;

import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05tB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.analytics.StreakSharePanelAnalytics$onShareStreakInvite$1", f = "StreakSharePanelAnalytics.kt", l = {}, m = "invokeSuspend")
public final class C1494705tB extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InterfaceC1493105sv LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ Integer LLIZLLLIL;
    public final /* synthetic */ Integer LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1494705tB(InterfaceC1493105sv interfaceC1493105sv, String str, String str2, String str3, String str4, String str5, String str6, Integer num, Integer num2, InterfaceC1364105Vn<? super C1494705tB> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = interfaceC1493105sv;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = str4;
        this.LLILZLL = str5;
        this.LLIZ = str6;
        this.LLIZLLLIL = num;
        this.LLJ = num2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1494705tB(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StreakSharePanelAnalytics@fb9b.onShareStreakInvite$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC1493105sv interfaceC1493105sv = this.LL;
        Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(new Pair("enter_from", this.LLILLJJLI), new Pair("type", this.LLILLL));
        String str = this.LLILZ;
        String str2 = this.LLILZIL;
        String str3 = this.LLILZLL;
        String str4 = this.LLIZ;
        Integer num = this.LLIZLLLIL;
        Integer num2 = this.LLJ;
        if (str != null) {
            mapLJIIJ.put("rank_num", str);
        }
        if (str2 != null) {
            mapLJIIJ.put("rank_length", str2);
        }
        if (str3 != null) {
            mapLJIIJ.put("channel", str3);
        }
        if (str4 != null) {
            mapLJIIJ.put("button_type", str4);
        }
        if (num != null) {
            mapLJIIJ.put("single_chat_share_count", String.valueOf(num.intValue()));
        }
        if (num2 != null) {
            mapLJIIJ.put("group_chat_share_count", String.valueOf(num2.intValue()));
        }
        interfaceC1493105sv.sendEvent("share_streak_invite", mapLJIIJ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StreakSharePanelAnalytics@fb9b.onShareStreakInvite$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
