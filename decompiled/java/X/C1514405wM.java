package X;

import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05wM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.analytics.StreakPetAnalytics$reportStreakPetInvitationEntranceShow$1", f = "StreakPetAnalytics.kt", l = {}, m = "invokeSuspend")
public final class C1514405wM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InterfaceC1493105sv LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1514405wM(InterfaceC1493105sv interfaceC1493105sv, String str, int i, String str2, InterfaceC1364105Vn<? super C1514405wM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = interfaceC1493105sv;
        this.LLILLJJLI = str;
        this.LLILLL = i;
        this.LLILZ = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1514405wM(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StreakPetAnalytics@6f57.reportStreakPetInvitationEntranceShow$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC1493105sv interfaceC1493105sv = this.LL;
        Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(new Pair("entrance", this.LLILLJJLI), new Pair("rank", String.valueOf(this.LLILLL)));
        String str = this.LLILZ;
        C1567906Bx.LIZ(str, mapLJIIJ);
        C066Y.LIZ(C066Y.LIZIZ, mapLJIIJ, str, C08CX.INSTANCE, null, 12);
        interfaceC1493105sv.sendEvent("streak_pet_invitation_entrance_show", mapLJIIJ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StreakPetAnalytics@6f57.reportStreakPetInvitationEntranceShow$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
