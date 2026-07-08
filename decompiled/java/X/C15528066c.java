package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.streak.api.StreakData;
import com.ss.android.ugc.aweme.im.streak.api.pet.IStreakPetService;
import com.ss.android.ugc.aweme.im.streak.api.pet.StreakPetData;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.066c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.analytics.StreakPetPerformanceAnalytics$reportTriggerStreakPetEntry$1", f = "StreakPetPerformanceAnalytics.kt", l = {}, m = "invokeSuspend")
public final class C15528066c extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InterfaceC1493105sv LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15528066c(InterfaceC1493105sv interfaceC1493105sv, String str, int i, String str2, InterfaceC1364105Vn<? super C15528066c> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = interfaceC1493105sv;
        this.LLILLJJLI = str;
        this.LLILLL = i;
        this.LLILZ = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C15528066c(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        EnumC1579606Gk enumC1579606GkLJIIIIZZ;
        C1C7U.LIZ("StreakPetPerformanceAnalytics@3bd7.reportTriggerStreakPetEntry$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC1493105sv interfaceC1493105sv = this.LL;
        boolean z = false;
        Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(new Pair("conversation_id", this.LLILLJJLI), new Pair("conversation_type", String.valueOf(this.LLILLL)), new Pair("source", this.LLILZ));
        int i = this.LLILLL;
        String str = this.LLILLJJLI;
        if (i == AbstractC1711506n3.LIZ) {
            C066K c066k = C066K.LIZIZ;
            boolean zLIZ = C15546066u.LIZ();
            c066k.getClass();
            mapLJIIJ.put("enable_self", C066K.LIZ(zLIZ));
            IStreakPetService.LIZ.getClass();
            mapLJIIJ.put("enable_other", C066K.LIZ(C1586906Jf.LIZ().LJIJ(str)));
        } else if (i == AbstractC1711506n3.LIZIZ) {
            C066K c066k2 = C066K.LIZIZ;
            boolean zLIZ2 = C15546066u.LIZ();
            c066k2.getClass();
            mapLJIIJ.put("enable_self", C066K.LIZ(zLIZ2));
            IStreakPetService.LIZ.getClass();
            mapLJIIJ.put("enable_other", C066K.LIZ(C1586906Jf.LIZ().LJJI(str)));
        }
        String str2 = this.LLILLJJLI;
        C1575806Ey.LIZJ.getClass();
        StreakData streakDataLJIIIIZZ = C1575806Ey.LJIIIIZZ(str2);
        C06C6.LIZIZ.getClass();
        StreakPetData streakPetDataLIZIZ = C06C6.LIZIZ(str2);
        if (streakDataLJIIIIZZ != null && (enumC1579606GkLJIIIIZZ = C1567806Bw.LJIIIIZZ(streakDataLJIIIIZZ, false)) != null) {
            mapLJIIJ.put("streak_status", String.valueOf(enumC1579606GkLJIIIIZZ.ordinal()));
        }
        if (streakPetDataLIZIZ != null) {
            mapLJIIJ.put("pet_status", String.valueOf(streakPetDataLIZIZ.status));
            mapLJIIJ.put("pet_sub_status", String.valueOf(streakPetDataLIZIZ.subStatus));
        }
        mapLJIIJ.put("pet_type", C1567906Bx.LIZJ(streakPetDataLIZIZ));
        if (streakDataLJIIIIZZ != null && C1567806Bw.LJ(streakDataLJIIIIZZ)) {
            z = true;
        }
        if (z) {
            mapLJIIJ.put("is_restorable", "1");
        } else {
            mapLJIIJ.put("is_restorable", CardStruct.IStatusCode.DEFAULT);
        }
        interfaceC1493105sv.sendEvent("trigger_streak_pet_entry", mapLJIIJ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StreakPetPerformanceAnalytics@3bd7.reportTriggerStreakPetEntry$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
