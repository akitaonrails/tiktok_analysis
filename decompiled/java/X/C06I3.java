package X;

import com.ss.android.ugc.aweme.im.common.setting.StreakPetResourceConfig;
import com.ss.android.ugc.aweme.im.common.setting.StreakPetResourceDescription;
import com.ss.android.ugc.aweme.im.streak.api.pet.StreakPetData;
import com.ss.android.ugc.aweme.im.streak.api.pet.StreakPetResourceStatus;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS116S1100000_2;
import njp.a;

/* JADX INFO: renamed from: X.06I3, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.pet.res.StreakPetResourceHelper$preloadStreakPetResource$1", f = "StreakPetResourceHelper.kt", l = {}, m = "invokeSuspend")
public final class C06I3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ StreakPetData LL;
    public final /* synthetic */ Object LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06I3(StreakPetData streakPetData, Object obj, InterfaceC1364105Vn<? super C06I3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = streakPetData;
        this.LLILLJJLI = obj;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C06I3(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        StreakPetResourceDescription streakPetResourceDescription;
        C1C7U.LIZ("StreakPetResourceHelper@d9a5.preloadStreakPetResource$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0Y8T c0y8tLJIL = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LJIL(this.LL.conversationId);
        if (c0y8tLJIL != null && c0y8tLJIL.isSingleChat()) {
            C06I0.LIZIZ.getClass();
            streakPetResourceDescription = ((StreakPetResourceConfig) C06I0.LJIIJ.getValue()).streakPetResourceDescriptionMap.get(this.LLILLJJLI);
            if (streakPetResourceDescription == null) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("StreakPetResourceHelper@d9a5.preloadStreakPetResource$1");
                return unit;
            }
        } else {
            C06I0.LIZIZ.getClass();
            streakPetResourceDescription = ((StreakPetResourceConfig) C06I0.LJIIJ.getValue()).streakGroupPetResourceDescriptionMap.get(this.LLILLJJLI);
            if (streakPetResourceDescription == null) {
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("StreakPetResourceHelper@d9a5.preloadStreakPetResource$1");
                return unit2;
            }
        }
        String str = streakPetResourceDescription.channel;
        String str2 = streakPetResourceDescription.bundle;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(str2);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        ConcurrentHashMap<String, StreakPetResourceStatus> concurrentHashMap = C06I0.LJIIIZ;
        if (concurrentHashMap.get(strLIZIZ) != null) {
            Unit unit3 = Unit.LIZ;
            C1C7U.LIZIZ("StreakPetResourceHelper@d9a5.preloadStreakPetResource$1");
            return unit3;
        }
        concurrentHashMap.put(strLIZIZ, new StreakPetResourceStatus(streakPetResourceDescription, C06I6.LOADING));
        C06I0 c06i0 = C06I0.LIZIZ;
        AwS116S1100000_2 awS116S1100000_2 = new AwS116S1100000_2(strLIZIZ, streakPetResourceDescription, 14);
        c06i0.getClass();
        C06I0.LIZ(streakPetResourceDescription, awS116S1100000_2);
        Unit unit4 = Unit.LIZ;
        C1C7U.LIZIZ("StreakPetResourceHelper@d9a5.preloadStreakPetResource$1");
        return unit4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
