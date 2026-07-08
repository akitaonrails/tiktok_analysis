package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.discover.model.suggest.SuggestWordResponse;
import com.ss.android.ugc.aweme.ecommerce.search.suggest.ability.ISearchSuggestContextAbilityNew;
import com.ss.android.ugc.aweme.ecommerce.search.suggest.ability.ISearchSuggestSubPageAbility;
import com.ss.android.ugc.aweme.ecommerce.search.suggest.vm.EcSearchSuggestViewModelNew;
import com.ss.android.ugc.aweme.ecommerce.search.utils.EcIntermediatePreload;
import com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS589S0100000_10;
import njp.a;

/* JADX INFO: renamed from: X.0Qax, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.suggest.vm.EcSearchSuggestViewModelNew$fetchGuessData$1", f = "EcSearchSuggestViewModelNew.kt", l = {368}, m = "invokeSuspend")
public final class C673250Qax extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public EcSearchSuggestViewModelNew LL;
    public C673430QbF LLILLJJLI;
    public long LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public /* synthetic */ Object LLILZLL;
    public final /* synthetic */ EcSearchSuggestViewModelNew LLIZ;
    public final /* synthetic */ Map<String, Object> LLIZLLLIL;
    public final /* synthetic */ long LLJ;
    public final /* synthetic */ C673430QbF LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C673250Qax(EcSearchSuggestViewModelNew ecSearchSuggestViewModelNew, Map<String, Object> map, long j, C673430QbF c673430QbF, InterfaceC1364105Vn<? super C673250Qax> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZ = ecSearchSuggestViewModelNew;
        this.LLIZLLLIL = map;
        this.LLJ = j;
        this.LLJI = c673430QbF;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C673250Qax c673250Qax = new C673250Qax(this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
        c673250Qax.LLILZLL = obj;
        return c673250Qax;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC497601wk interfaceC497601wk;
        EcSearchSuggestViewModelNew ecSearchSuggestViewModelNew;
        long j;
        C673430QbF c673430QbF;
        int i;
        boolean zXq2;
        boolean zKF2;
        boolean z;
        boolean z2;
        boolean zXq22;
        boolean z3;
        boolean zXq23;
        boolean zKF22;
        Map<String, String> timingLog;
        ECSearchEntranceData ecSearchEntranceData;
        Object objT0 = obj;
        C1C7U.LIZ("EcSearchSuggestViewModelNew@29c4.fetchGuessData$1");
        Object objLJFF = C099R.LJFF();
        int i2 = this.LLILZIL;
        boolean z4 = true;
        boolean zKF23 = false;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    i = this.LLILZ;
                    j = this.LLILLL;
                    c673430QbF = this.LLILLJJLI;
                    ecSearchSuggestViewModelNew = this.LL;
                    interfaceC497601wk = (InterfaceC497601wk) this.LLILZLL;
                    C155000ia.LIZIZ(objT0);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(objT0);
                interfaceC497601wk = (InterfaceC497601wk) this.LLILZLL;
                ecSearchSuggestViewModelNew = this.LLIZ;
                Map<String, Object> map = this.LLIZLLLIL;
                j = this.LLJ;
                c673430QbF = this.LLJI;
                C0QWI c0qwi = ecSearchSuggestViewModelNew.LLILLL;
                if (c0qwi != null) {
                    ISearchSuggestSubPageAbility iSearchSuggestSubPageAbility = ecSearchSuggestViewModelNew.LLILZLL;
                    if (iSearchSuggestSubPageAbility != null) {
                        zXq2 = iSearchSuggestSubPageAbility.xq2();
                    } else {
                        zXq2 = false;
                    }
                    ISearchSuggestSubPageAbility iSearchSuggestSubPageAbility2 = ecSearchSuggestViewModelNew.LLILZLL;
                    if (iSearchSuggestSubPageAbility2 != null) {
                        zKF2 = iSearchSuggestSubPageAbility2.KF2();
                    } else {
                        zKF2 = false;
                    }
                    c0qwi.LJ("guess", "request", false, zXq2, zKF2, null, null, false, false, null);
                }
                C0QVZ c0qvz = C0QVZ.LIZ;
                C0QER c0qerV4 = ecSearchSuggestViewModelNew.v4();
                ISearchSuggestContextAbilityNew iSearchSuggestContextAbilityNew = ecSearchSuggestViewModelNew.LLILZIL;
                boolean z5 = ecSearchSuggestViewModelNew.LLIZLLLIL;
                String str = ecSearchSuggestViewModelNew.LLJI;
                c0qvz.getClass();
                C671380QVc c671380QVcLIZ = C0QVZ.LIZ(c0qerV4, iSearchSuggestContextAbilityNew, z5, map, str);
                EcIntermediatePreload.Companion.getClass();
                EcIntermediatePreload.hasPreloading = false;
                ISearchSuggestContextAbilityNew iSearchSuggestContextAbilityNew2 = ecSearchSuggestViewModelNew.LLILZIL;
                if (iSearchSuggestContextAbilityNew2 != null && !iSearchSuggestContextAbilityNew2.n90()) {
                    i = 1;
                } else {
                    i = 0;
                }
                InterfaceC673060Qae interfaceC673060Qae = (InterfaceC673060Qae) ecSearchSuggestViewModelNew.zQ2().getOperator();
                this.LLILZLL = interfaceC497601wk;
                this.LL = ecSearchSuggestViewModelNew;
                this.LLILLJJLI = c673430QbF;
                this.LLILLL = j;
                this.LLILZ = i;
                this.LLILZIL = 1;
                objT0 = interfaceC673060Qae.t0(c671380QVcLIZ, this);
                if (objT0 == objLJFF) {
                    C1C7U.LIZIZ("EcSearchSuggestViewModelNew@29c4.fetchGuessData$1");
                    return objLJFF;
                }
            }
            String str2 = (String) objT0;
            C673320Qb4 c673320Qb4 = C673320Qb4.LIZ;
            C673320Qb4.LJIILJJIL();
            C672820QaG.LIZ.getClass();
            SuggestWordResponse suggestWordResponseLJII = C672820QaG.LJII(str2);
            C0QER c0qerV42 = ecSearchSuggestViewModelNew.v4();
            if (c0qerV42 != null && (ecSearchEntranceData = c0qerV42.getEcSearchEntranceData()) != null && ecSearchEntranceData.getBooleanStrategy("disable_guess_strategy")) {
                z = true;
            } else {
                z = false;
            }
            if (z && C672820QaG.LIZJ(c0qerV42.getEcSearchEntranceData())) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                ecSearchSuggestViewModelNew.BQ2(suggestWordResponseLJII);
            } else {
                TemplateData templateDataXQ2 = ecSearchSuggestViewModelNew.xQ2(j, str2, false);
                C673320Qb4.LJ();
                if (templateDataXQ2 != null && suggestWordResponseLJII != null) {
                    int iLJFF = C672820QaG.LJFF(suggestWordResponseLJII);
                    ISearchSuggestSubPageAbility iSearchSuggestSubPageAbility3 = ecSearchSuggestViewModelNew.LLILZLL;
                    if (iSearchSuggestSubPageAbility3 != null && iSearchSuggestSubPageAbility3.xq2()) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        C673940Qc4.LJI(EnumC673970Qc7.SEARCH, true);
                    }
                    C0QWI c0qwi2 = ecSearchSuggestViewModelNew.LLILLL;
                    if (c0qwi2 != null) {
                        ISearchSuggestSubPageAbility iSearchSuggestSubPageAbility4 = ecSearchSuggestViewModelNew.LLILZLL;
                        if (iSearchSuggestSubPageAbility4 != null) {
                            zXq23 = iSearchSuggestSubPageAbility4.xq2();
                        } else {
                            zXq23 = false;
                        }
                        ISearchSuggestSubPageAbility iSearchSuggestSubPageAbility5 = ecSearchSuggestViewModelNew.LLILZLL;
                        if (iSearchSuggestSubPageAbility5 != null) {
                            zKF22 = iSearchSuggestSubPageAbility5.KF2();
                        } else {
                            zKF22 = false;
                        }
                        Integer numLJ = C2286608xc.LJ(iLJFF);
                        Long lLJFF = C2286608xc.LJFF(System.currentTimeMillis() - j);
                        SuggestWordResponse.Extra extra = suggestWordResponseLJII.extra;
                        if (extra != null) {
                            timingLog = extra.getTimingLog();
                        } else {
                            timingLog = null;
                        }
                        c0qwi2.LJ("guess", "response_success", false, zXq23, zKF22, numLJ, lLJFF, false, false, timingLog);
                    }
                    if (ecSearchSuggestViewModelNew.LLIZLLLIL && iLJFF > 0 && c673430QbF != null) {
                        c673430QbF.LJIIL = true;
                    }
                    ecSearchSuggestViewModelNew.LLIZLLLIL = false;
                    ecSearchSuggestViewModelNew.LLJI = "";
                    ecSearchSuggestViewModelNew.BQ2(suggestWordResponseLJII);
                    C1DFB c1dfb = C0PEM.LIZJ;
                    if (i == 0) {
                        z4 = false;
                    }
                    C23250099c.LIZLLL(interfaceC497601wk, c1dfb, null, new C673240Qaw(ecSearchSuggestViewModelNew, str2, z4, null), 2);
                    ecSearchSuggestViewModelNew.setState(new AwS589S0100000_10(new C673510QbN(false, j, suggestWordResponseLJII, templateDataXQ2), 81));
                } else {
                    ISearchSuggestSubPageAbility iSearchSuggestSubPageAbility6 = ecSearchSuggestViewModelNew.LLILZLL;
                    if (iSearchSuggestSubPageAbility6 == null || !iSearchSuggestSubPageAbility6.xq2()) {
                        z4 = false;
                    }
                    if (z4) {
                        C673940Qc4.LJI(EnumC673970Qc7.SEARCH, false);
                    }
                    C0QWI c0qwi3 = ecSearchSuggestViewModelNew.LLILLL;
                    if (c0qwi3 != null) {
                        ISearchSuggestSubPageAbility iSearchSuggestSubPageAbility7 = ecSearchSuggestViewModelNew.LLILZLL;
                        if (iSearchSuggestSubPageAbility7 != null) {
                            zXq22 = iSearchSuggestSubPageAbility7.xq2();
                        } else {
                            zXq22 = false;
                        }
                        ISearchSuggestSubPageAbility iSearchSuggestSubPageAbility8 = ecSearchSuggestViewModelNew.LLILZLL;
                        if (iSearchSuggestSubPageAbility8 != null) {
                            zKF23 = iSearchSuggestSubPageAbility8.KF2();
                        }
                        c0qwi3.LJ("guess", "response_fail", false, zXq22, zKF23, null, C2286608xc.LJFF(System.currentTimeMillis() - j), false, false, null);
                    }
                }
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EcSearchSuggestViewModelNew@29c4.fetchGuessData$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
