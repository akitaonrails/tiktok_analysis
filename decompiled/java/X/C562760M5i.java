package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.airemix.api.IAIRemixService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.search.csi.profile.repo.SearchCSIProfileBannerRepoV3;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0M5i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.csi.profile.repo.SearchCSIProfileBannerRepoV3$tryTriggerInitWithAIRemix$1", f = "SearchCSIProfileBannerRepoV3.kt", l = {546}, m = "invokeSuspend")
public final class C562760M5i extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SearchCSIProfileBannerRepoV3 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C562760M5i(SearchCSIProfileBannerRepoV3 searchCSIProfileBannerRepoV3, InterfaceC1364105Vn<? super C562760M5i> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = searchCSIProfileBannerRepoV3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C562760M5i(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean zBooleanValue;
        C1C7U.LIZ("SearchCSIProfileBannerRepoV3@3eb2.tryTriggerInitWithAIRemix$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                IAIRemixService iAIRemixService = (IAIRemixService) PluggableExtentionKt.pluggableSpi$default(IAIRemixService.class, false, false, false, 14, null);
                if (iAIRemixService == null) {
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("SearchCSIProfileBannerRepoV3@3eb2.tryTriggerInitWithAIRemix$1");
                    return unit;
                }
                InterfaceC562800M5m interfaceC562800M5mLIZIZ = iAIRemixService.LIZIZ();
                if (interfaceC562800M5mLIZIZ == null) {
                    Unit unit2 = Unit.LIZ;
                    C1C7U.LIZIZ("SearchCSIProfileBannerRepoV3@3eb2.tryTriggerInitWithAIRemix$1");
                    return unit2;
                }
                this.LLILLJJLI.LJJII = true;
                C1DFB c1dfb = C0PEM.LIZJ;
                C562750M5h c562750M5h = new C562750M5h(interfaceC562800M5mLIZIZ, null);
                this.LL = 1;
                obj = C23250099c.LJI(this, c1dfb, c562750M5h);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("SearchCSIProfileBannerRepoV3@3eb2.tryTriggerInitWithAIRemix$1");
                    return objLJFF;
                }
            }
            zBooleanValue = ((Boolean) obj).booleanValue();
            this.LLILLJJLI.getClass();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLILLJJLI.LJJII = false;
        }
        if (!zBooleanValue) {
            this.LLILLJJLI.LJJII = false;
            Unit unit3 = Unit.LIZ;
            C1C7U.LIZIZ("SearchCSIProfileBannerRepoV3@3eb2.tryTriggerInitWithAIRemix$1");
            return unit3;
        }
        SearchCSIProfileBannerRepoV3 searchCSIProfileBannerRepoV3 = this.LLILLJJLI;
        if (searchCSIProfileBannerRepoV3.LJJIII) {
            Unit unit4 = Unit.LIZ;
            C1C7U.LIZIZ("SearchCSIProfileBannerRepoV3@3eb2.tryTriggerInitWithAIRemix$1");
            return unit4;
        }
        if (!searchCSIProfileBannerRepoV3.LJIJJLI) {
            searchCSIProfileBannerRepoV3.LJIL = true;
            searchCSIProfileBannerRepoV3.LJJII = false;
            Unit unit5 = Unit.LIZ;
            C1C7U.LIZIZ("SearchCSIProfileBannerRepoV3@3eb2.tryTriggerInitWithAIRemix$1");
            return unit5;
        }
        searchCSIProfileBannerRepoV3.LJJIII = true;
        searchCSIProfileBannerRepoV3.LJIIIIZZ(EnumC2193221Asa.PAGE_INIT);
        Unit unit6 = Unit.LIZ;
        C1C7U.LIZIZ("SearchCSIProfileBannerRepoV3@3eb2.tryTriggerInitWithAIRemix$1");
        return unit6;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
