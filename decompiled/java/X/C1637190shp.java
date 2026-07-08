package X;

import com.ss.android.ugc.aweme.effectcreator.IEffectCreatorService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.profile.platform.business.tabs.container.other.UserAwemePagerAssemV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0shp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.profile.platform.business.tabs.container.other.UserAwemePagerAssemV2$createFragments$3", f = "UserAwemePagerAssemV2.kt", l = {}, m = "invokeSuspend")
public final class C1637190shp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ UserAwemePagerAssemV2 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1637190shp(UserAwemePagerAssemV2 userAwemePagerAssemV2, InterfaceC1364105Vn<? super C1637190shp> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = userAwemePagerAssemV2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1637190shp(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        IEffectCreatorService iEffectCreatorService;
        InterfaceC1637170shn interfaceC1637170shnLIZ;
        C1C7U.LIZ("UserAwemePagerAssemV2@ac6e.createFragments$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (C1656550tD3.LIZ() && C724240Sb0.LIZ(this.LL) != null && (iEffectCreatorService = (IEffectCreatorService) PluggableExtentionKt.pluggableSpi$default(IEffectCreatorService.class, false, false, false, 14, null)) != null) {
            InterfaceC1637200shq interfaceC1637200shqPreloadService = iEffectCreatorService.preloadService();
            if (interfaceC1637200shqPreloadService != null) {
                interfaceC1637200shqPreloadService.LIZJ();
            }
            InterfaceC1637200shq interfaceC1637200shqPreloadService2 = iEffectCreatorService.preloadService();
            if (interfaceC1637200shqPreloadService2 != null && (interfaceC1637170shnLIZ = interfaceC1637200shqPreloadService2.LIZ()) != null) {
                interfaceC1637170shnLIZ.LIZ(EnumC2274181Dzs.TT_MAIN_PROFILE);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("UserAwemePagerAssemV2@ac6e.createFragments$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
