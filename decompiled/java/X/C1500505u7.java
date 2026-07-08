package X;

import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05u7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.analytics.StreakSharePanelAnalytics$onStreakPetInviteSend$1", f = "StreakSharePanelAnalytics.kt", l = {}, m = "invokeSuspend")
public final class C1500505u7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InterfaceC1493105sv LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1500505u7(InterfaceC1493105sv interfaceC1493105sv, String str, String str2, String str3, String str4, InterfaceC1364105Vn<? super C1500505u7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = interfaceC1493105sv;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = str4;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1500505u7(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StreakSharePanelAnalytics@fb9b.onStreakPetInviteSend$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC1493105sv interfaceC1493105sv = this.LL;
        Pair[] pairArr = new Pair[2];
        pairArr[0] = new Pair("invitation_panel_source", this.LLILLJJLI);
        String str = this.LLILLL;
        if (str == null) {
            str = this.LLILZ;
        }
        pairArr[1] = new Pair("pet_type", str);
        Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        String str2 = this.LLILZIL;
        if (str2 == null) {
            str2 = "";
        }
        C1567906Bx.LIZ(str2, mapLJIIJ);
        interfaceC1493105sv.sendEvent("streak_pet_invite_send", mapLJIIJ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StreakSharePanelAnalytics@fb9b.onStreakPetInviteSend$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
