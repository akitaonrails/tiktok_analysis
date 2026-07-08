package X;

import android.app.Activity;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.offline.gp.newuser.INewUserDebugService;
import com.ss.android.ugc.aweme.personalized.trial.PersonalizedTrialHelperInternal;
import com.ss.android.ugc.aweme.plugin.IPluginService;
import com.ss.android.ugc.aweme.plugin.personalizednuj.PersonalizedNUJV2Data;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.10SI, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10SI implements C10SM {
    public static C10SM LIZIZ;
    public static PersonalizedNUJV2Data LIZJ;
    public static final C10SI LIZ = new C10SI();
    public static final Keva LIZLLL = Keva.getRepo("personalized_nuj_trial_keva_v2");
    public static final C01GW LJ = C452501pT.LIZIZ(new C10SO());

    public static C10SM LJIIL() {
        if (LIZIZ == null) {
            PersonalizedNUJV2Data personalizedNUJV2DataLJIILIIL = LJIILIIL(false);
            Boolean bool = personalizedNUJV2DataLJIILIIL.shouldTryAgeGate;
            Boolean bool2 = Boolean.TRUE;
            LIZIZ = (Intrinsics.LJFF(bool, bool2) && (Intrinsics.LJFF(personalizedNUJV2DataLJIILIIL.enableUnloginTimeLimit, bool2) || Intrinsics.LJFF(personalizedNUJV2DataLJIILIIL.enableAppUsageUnloginTimeLimit, bool2))) ? PersonalizedTrialHelperInternal.LIZ : new C10SM() { // from class: X.0wxC
                @Override // X.C10SM
                public final boolean LIZ() {
                    return false;
                }

                @Override // X.C10SM
                public final String LIZIZ() {
                    return null;
                }

                @Override // X.C10SM
                public final boolean LIZJ(String str) {
                    return false;
                }

                @Override // X.C10SM
                public final void LIZLLL(String str) {
                }

                @Override // X.C10SM
                public final boolean LJ() {
                    return false;
                }

                @Override // X.C10SM
                public final boolean LJFF() {
                    return false;
                }

                @Override // X.C10SM
                public final void LJI() {
                }

                @Override // X.C10SM
                public final void LJII() {
                }

                @Override // X.C10SM
                public final void LJIIJ() {
                }

                @Override // X.C10SM
                public final void LJIIJJI(Activity activity, Aweme aweme, String str) {
                }

                @Override // X.C10SM
                public final boolean LJIIIIZZ() {
                    C10SI.LIZ.getClass();
                    C10SI.LJIILJJIL("isTrialExpires: emptyImpl, return false");
                    return false;
                }

                @Override // X.C10SM
                public final boolean LJIIIZ(long j) {
                    C10SI.LIZ.getClass();
                    C10SI.LJIILJJIL("isTrailFirstDay: emptyImpl, return false");
                    return true;
                }
            };
        }
        C10SM c10sm = LIZIZ;
        return c10sm == null ? new C10SM() { // from class: X.0wxC
            @Override // X.C10SM
            public final boolean LIZ() {
                return false;
            }

            @Override // X.C10SM
            public final String LIZIZ() {
                return null;
            }

            @Override // X.C10SM
            public final boolean LIZJ(String str) {
                return false;
            }

            @Override // X.C10SM
            public final void LIZLLL(String str) {
            }

            @Override // X.C10SM
            public final boolean LJ() {
                return false;
            }

            @Override // X.C10SM
            public final boolean LJFF() {
                return false;
            }

            @Override // X.C10SM
            public final void LJI() {
            }

            @Override // X.C10SM
            public final void LJII() {
            }

            @Override // X.C10SM
            public final void LJIIJ() {
            }

            @Override // X.C10SM
            public final void LJIIJJI(Activity activity, Aweme aweme, String str) {
            }

            @Override // X.C10SM
            public final boolean LJIIIIZZ() {
                C10SI.LIZ.getClass();
                C10SI.LJIILJJIL("isTrialExpires: emptyImpl, return false");
                return false;
            }

            @Override // X.C10SM
            public final boolean LJIIIZ(long j) {
                C10SI.LIZ.getClass();
                C10SI.LJIILJJIL("isTrailFirstDay: emptyImpl, return false");
                return true;
            }
        } : c10sm;
    }

    @Override // X.C10SM
    public final boolean LJFF() {
        return LIZLLL.getBoolean("hasLoginStatusChanged", false);
    }

    @Override // X.C10SM
    public final void LJI() {
        LIZLLL.storeBoolean("hasLoginStatusChanged", true);
    }

    @Override // X.C10SM
    public final void LJIIJ() {
        List<C0TA0> currentPluginList;
        C0TA0 next;
        IPluginService.PluginDataWrapper value;
        PersonalizedNUJV2Data personalizedNUJV2Data;
        IPluginService iPluginService = (IPluginService) PluggableExtentionKt.pluggableSpi$default(IPluginService.class, false, false, false, 14, null);
        if (iPluginService != null && (currentPluginList = iPluginService.getCurrentPluginList()) != null) {
            Iterator<C0TA0> it2 = currentPluginList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it2.next();
                    if (next.getType() == EnumC19241510Pl.PERSONALIZED_NUJ_V2_DATA) {
                        break;
                    }
                }
            }
            C0TA0 c0ta0 = next;
            if (c0ta0 != null && (value = c0ta0.getValue()) != null && (personalizedNUJV2Data = value.personalizedNUJV2Data) != null) {
                Keva keva = LIZLLL;
                Boolean bool = personalizedNUJV2Data.shouldTrySmartLock;
                Boolean bool2 = Boolean.TRUE;
                keva.storeBoolean("should_try_smart_lock", Intrinsics.LJFF(bool, bool2));
                keva.storeBoolean("should_try_age_gate", Intrinsics.LJFF(personalizedNUJV2Data.shouldTryAgeGate, bool2));
                keva.storeBoolean("should_try_push_popup", Intrinsics.LJFF(personalizedNUJV2Data.shouldTryPushPopup, bool2));
                keva.storeBoolean("need_nuj_in_age_gate_flow", Intrinsics.LJFF(personalizedNUJV2Data.needNUJInAgeGateFlow, bool2));
                keva.storeBoolean("need_nuj_quick_login_flow", Intrinsics.LJFF(personalizedNUJV2Data.needNUJInQuickLoginFlow, bool2));
                keva.storeBoolean("enable_unlogin_time_limit", Intrinsics.LJFF(personalizedNUJV2Data.enableUnloginTimeLimit, bool2));
                Integer num = personalizedNUJV2Data.loginTimeLimitMin;
                keva.storeInt("login_time_limit_min", num != null ? num.intValue() : 0);
                keva.storeBoolean("enable_unlogin_app_usage_time_limit", Intrinsics.LJFF(personalizedNUJV2Data.enableAppUsageUnloginTimeLimit, bool2));
                Integer num2 = personalizedNUJV2Data.appUsageUnloginTimeLimitMin;
                keva.storeInt("unlogin_app_usage_time_limit_min", num2 != null ? num2.intValue() : 0);
                keva.storeBoolean("enable_second_chance_enter_pnuj", Intrinsics.LJFF(personalizedNUJV2Data.enableSecondChanceEnterPnuj, bool2));
                keva.storeInt("personalized_nuj_label", personalizedNUJV2Data.personalizedNUJLabel);
                LJIILIIL(true);
            }
        }
        LIZIZ = null;
        LJIIL();
        LJIIL().LJIIJ();
    }

    @Override // X.C10SM
    public final boolean LIZ() {
        return LJIIL().LIZ();
    }

    @Override // X.C10SM
    public final String LIZIZ() {
        return LJIIL().LIZIZ();
    }

    @Override // X.C10SM
    public final boolean LJ() {
        return LJIIL().LJ();
    }

    @Override // X.C10SM
    public final void LJII() {
        LJIIL().LJII();
    }

    @Override // X.C10SM
    public final boolean LJIIIIZZ() {
        return LJIIL().LJIIIIZZ();
    }

    public static PersonalizedNUJV2Data LJIILIIL(boolean z) {
        PersonalizedNUJV2Data personalizedNUJV2Data = LIZJ;
        if (personalizedNUJV2Data != null && !z) {
            return personalizedNUJV2Data;
        }
        Keva keva = LIZLLL;
        PersonalizedNUJV2Data personalizedNUJV2Data2 = new PersonalizedNUJV2Data(Boolean.valueOf(keva.getBoolean("should_try_smart_lock", false)), Boolean.valueOf(keva.getBoolean("should_try_age_gate", false)), Boolean.valueOf(keva.getBoolean("should_try_push_popup", false)), Boolean.valueOf(keva.getBoolean("need_nuj_in_age_gate_flow", false)), Boolean.valueOf(keva.getBoolean("need_nuj_quick_login_flow", false)), keva.getInt("personalized_nuj_label", 0), Boolean.valueOf(keva.getBoolean("enable_unlogin_time_limit", false)), Integer.valueOf(keva.getInt("login_time_limit_min", 0)), Boolean.valueOf(keva.getBoolean("enable_unlogin_app_usage_time_limit", false)), Integer.valueOf(keva.getInt("unlogin_app_usage_time_limit_min", 0)), Boolean.valueOf(keva.getBoolean("enable_second_chance_enter_pnuj", false)), Boolean.FALSE, Boolean.FALSE, 0, "", Boolean.FALSE, null, null);
        LIZJ = personalizedNUJV2Data2;
        return personalizedNUJV2Data2;
    }

    public static void LJIILJJIL(String str) {
        INewUserDebugService iNewUserDebugService = (INewUserDebugService) LJ.getValue();
        if (iNewUserDebugService != null) {
            iNewUserDebugService.LJI("nuj_trial", str);
        }
    }

    @Override // X.C10SM
    public final boolean LIZJ(String str) {
        return LJIIL().LIZJ(str);
    }

    @Override // X.C10SM
    public final void LIZLLL(String str) {
        LJIIL().LIZLLL(str);
    }

    @Override // X.C10SM
    public final boolean LJIIIZ(long j) {
        return LJIIL().LJIIIZ(j);
    }

    @Override // X.C10SM
    public final void LJIIJJI(Activity activity, Aweme aweme, String str) {
        C10SW c10sw = C10SW.LIZ;
        boolean zLJFF = Intrinsics.LJFF(str, "homepage_hot");
        c10sw.getClass();
        C10SW.LJIIJJI++;
        if (zLJFF) {
            C10SW.LJIIL++;
        }
        LJIIL().LJIIJJI(activity, aweme, str);
    }
}
