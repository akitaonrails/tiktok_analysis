package X;

import com.ss.android.ugc.aweme.im.common.setting.StreakPetResourceConfig;
import com.ss.android.ugc.aweme.im.common.setting.StreakPetResourceDescription;
import com.ss.android.ugc.aweme.im.streak.api.pet.StreakPetResourceStatus;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS116S1100000_2;

/* JADX INFO: renamed from: X.06I4, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.pet.res.StreakPetResourceHelper$preloadColdStartStreakPetResource$1", f = "StreakPetResourceHelper.kt", l = {}, m = "invokeSuspend")
public final class C06I4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C06I4(InterfaceC1364105Vn<? super C06I4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C06I4(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StreakPetResourceHelper@d9a5.preloadColdStartStreakPetResource$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C06I0.LIZIZ.getClass();
        for (StreakPetResourceDescription streakPetResourceDescription : ((StreakPetResourceConfig) C06I0.LJIIJ.getValue()).coldStartResourceDescriptionList) {
            String str = streakPetResourceDescription.channel;
            String str2 = streakPetResourceDescription.bundle;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(str2);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            C06I0.LJI.put(strLIZIZ, new StreakPetResourceStatus(streakPetResourceDescription, C06I6.LOADING));
            C06I0 c06i0 = C06I0.LIZIZ;
            AwS116S1100000_2 awS116S1100000_2 = new AwS116S1100000_2(strLIZIZ, streakPetResourceDescription, 15);
            c06i0.getClass();
            C06I0.LIZ(streakPetResourceDescription, awS116S1100000_2);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StreakPetResourceHelper@d9a5.preloadColdStartStreakPetResource$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C06I4(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
