package X;

import androidx.fragment.app.Fragment;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService;
import com.ss.android.ugc.aweme.configuration.models.NUJFlow;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.awemepushapi.IPushPermissionApi;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS315S0000000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.10MP, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10MP {
    public static boolean LIZIZ;
    public static boolean LIZJ;
    public static Boolean LIZLLL;
    public static final C10MP LIZ = new C10MP();
    public static int LJ = -1;
    public static final List<String> LJFF = C1697810uHb.LJIIJJI("slogan_consent_box_page", "consent_box_page_hu", "consent_box_page", "push_popup_background", "login", "age_gate");
    public static final List<String> LJI = C1697810uHb.LJIIJJI("consent_box", "push_popup");

    public static Boolean LIZ() {
        IAccountService iAccountService;
        AccountUserService accountUserServiceLJIIJ;
        if (C1514430pVp.LIZLLL().booleanValue()) {
            return Boolean.FALSE;
        }
        boolean z = true;
        if (C19254610Um.LIZIZ.LJJIL().LJIIIIZZ() && (iAccountService = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null)) != null && (accountUserServiceLJIIJ = iAccountService.LJIIJ()) != null && !accountUserServiceLJIIJ.isLogin()) {
            return Boolean.FALSE;
        }
        if (LIZIZ) {
            return Boolean.FALSE;
        }
        if (!((Boolean) C277340Atw.LIZ.getValue()).booleanValue()) {
            return Boolean.FALSE;
        }
        if (LIZLLL == null) {
            C1911410zq7.LIZ("NUJ_Extend_Helper", "check should start");
            if (Keva.getRepo("nuj_extend").getBoolean("not_show_again", false)) {
                C1911410zq7.LIZ("NUJ_Extend_Helper", "check not run again");
            } else {
                Iterator it2 = LIZIZ(new C1912470zrp(new C10H4() { // from class: X.10Pu
                    @Override // X.C10H4
                    public final void LIZJ() {
                    }

                    @Override // X.C10H4
                    public final Fragment LIZ() {
                        return new Fragment();
                    }

                    @Override // X.C10H4
                    public final C19EG LIZIZ() {
                        return new C19EG();
                    }

                    @Override // X.C10H4
                    public final Function2<Fragment, Boolean, Unit> LJ() {
                        return AFwS315S0000000_28.get$arr$(44);
                    }

                    @Override // X.C10H4
                    public final C1912560zry LJFF() {
                        return new C1912560zry(false, 0, false, false, null);
                    }

                    @Override // X.C10H4
                    public final C19EG LLILLIZIL() {
                        return new C19EG();
                    }

                    @Override // X.C10H4
                    public final Runnable LIZLLL() {
                        return new Runnable() { // from class: X.10Pw
                            @Override // java.lang.Runnable
                            public final void run() {
                                C1C7U.LIZ("NUJExtendHelper@e95b.realCheckShouldStart$recoveredList$1$completeAction$1");
                                C1C7U.LIZIZ("NUJExtendHelper@e95b.realCheckShouldStart$recoveredList$1$completeAction$1");
                            }
                        };
                    }
                }), false).iterator();
                while (it2.hasNext()) {
                    if (((C10ND) it2.next()).LJFF().getSecond().booleanValue()) {
                        C1911410zq7.LIZ("NUJ_Extend_Helper", "should run second");
                        break;
                    }
                }
                C1911410zq7.LIZ("NUJ_Extend_Helper", "not run second");
                Keva.getRepo("nuj_extend").storeBoolean("not_show_again", true);
            }
            z = false;
            LIZLLL = Boolean.valueOf(z);
        }
        return LIZLLL;
    }

    public static List LIZIZ(C1912470zrp c1912470zrp, boolean z) {
        boolean z2;
        NUJFlow nUJFlow;
        boolean z3;
        boolean z4;
        int i;
        Object next;
        Object next2;
        Object next3;
        Object next4;
        String string = Keva.getRepo("nuj_extend").getString("component_list", "");
        boolean z5 = true;
        if (string != null && string.length() != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        Object obj = null;
        if (!z2) {
            Type type = new TypeToken<NUJFlow>() { // from class: X.10MQ
            }.getType();
            try {
                C1227904rF.LIZ.getClass();
                nUJFlow = (NUJFlow) C1227904rF.LIZJ(string, type);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                nUJFlow = null;
            }
        } else {
            nUJFlow = null;
        }
        if (nUJFlow == null) {
            return C13BV.INSTANCE;
        }
        List listLIZ = C10NV.LIZ(c1912470zrp, nUJFlow);
        String string2 = Keva.getRepo("nuj_extend").getString("current_step", "");
        ArrayList arrayList = (ArrayList) listLIZ;
        Iterator it2 = arrayList.iterator();
        int i2 = 0;
        while (true) {
            if (it2.hasNext()) {
                if (Intrinsics.LJFF(((C10ND) it2.next()).getId(), string2)) {
                    break;
                }
                i2++;
            } else {
                i2 = -1;
                break;
            }
        }
        IPushPermissionApi iPushPermissionApi = (IPushPermissionApi) PluggableExtentionKt.pluggableSpi$default(IPushPermissionApi.class, false, false, false, 14, null);
        if (!C1514430pVp.LIZLLL().booleanValue() && iPushPermissionApi != null) {
            iPushPermissionApi.LJIIJJI();
        }
        if (iPushPermissionApi != null && iPushPermissionApi.LJFF(C1BWL.LIZ())) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3 && !Keva.getRepo("nuj_extend").getBoolean("push_page_passed", false)) {
            z4 = true;
        } else {
            z4 = false;
        }
        ITpcConsentService iTpcConsentService = (ITpcConsentService) PluggableExtentionKt.pluggableSpi$default(ITpcConsentService.class, false, false, false, 14, null);
        if (iTpcConsentService == null || !iTpcConsentService.LJ()) {
            z5 = false;
        }
        if (i2 >= 0) {
            if (LJFF.contains(string2) || (Intrinsics.LJFF(string2, "interest_list") && (z4 || z5))) {
                C1911410zq7.LIZ("NUJ_Extend_Helper", "last is necessary page");
                i = i2;
            } else {
                C1911410zq7.LIZ("NUJ_Extend_Helper", "last is not necessary page");
                i = i2 + 1;
            }
            if (i < arrayList.size()) {
                if (z) {
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LIZJ(LJ, "nuj_times");
                    c2344009Gk.LJIIIIZZ("nuj_leave_from", ((C10ND) ListProtector.get(listLIZ, i2)).getId());
                    c2344009Gk.LJIIIIZZ("nuj_lead_to", ((C10ND) ListProtector.get(listLIZ, i)).getId());
                    C20684815ws.LJIILLIIL("nuj_start_timing", c2344009Gk.LIZ);
                }
                ArrayList arrayList2 = new ArrayList(arrayList.subList(i, arrayList.size()));
                for (Object obj2 : C13LP.LJLJJLL(LJI)) {
                    Iterator it3 = arrayList2.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            next3 = it3.next();
                            if (Intrinsics.LJFF(((C10ND) next3).getId(), obj2)) {
                                break;
                            }
                        } else {
                            next3 = null;
                            break;
                        }
                    }
                    if (next3 == null) {
                        Iterator it4 = arrayList.iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                next4 = it4.next();
                                if (Intrinsics.LJFF(((C10ND) next4).getId(), obj2)) {
                                    break;
                                }
                            } else {
                                next4 = null;
                                break;
                            }
                        }
                        if (next4 != null) {
                            ListProtector.add(arrayList2, 0, next4);
                        }
                    }
                }
                if (Intrinsics.LJFF(string2, "slogan_consent_box_page")) {
                    Iterator it5 = arrayList2.iterator();
                    while (true) {
                        if (it5.hasNext()) {
                            next = it5.next();
                            if (Intrinsics.LJFF(((C10ND) next).getId(), "slogan_page")) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    if (next == null) {
                        Iterator it6 = arrayList.iterator();
                        while (true) {
                            if (it6.hasNext()) {
                                next2 = it6.next();
                                if (Intrinsics.LJFF(((C10ND) next2).getId(), "slogan_page")) {
                                    break;
                                }
                            } else {
                                next2 = null;
                                break;
                            }
                        }
                        if (next2 != null) {
                            ListProtector.add(arrayList2, 0, next2);
                        }
                    }
                    C1911490zqF.LIZ.getClass();
                    if (C1911490zqF.LIZ() && z5) {
                        Iterator it7 = arrayList.iterator();
                        while (true) {
                            if (!it7.hasNext()) {
                                break;
                            }
                            Object next5 = it7.next();
                            if (Intrinsics.LJFF(((C10ND) next5).getId(), "consent_box")) {
                                obj = next5;
                                break;
                            }
                        }
                        if (obj != null) {
                            ListProtector.add(arrayList2, 0, obj);
                        }
                    }
                }
                return arrayList2;
            }
        }
        return C13BV.INSTANCE;
    }
}
