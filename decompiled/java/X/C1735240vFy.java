package X;

import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.fragment.app.DialogFragment;
import com.bytedance.hox.Hox;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.compliance.repository.dto.ApplyAuthData;
import com.ss.android.ugc.aweme.ecommerce.compliance.repository.dto.AuthPopup;
import com.ss.android.ugc.aweme.ecommerce.dependency.account.AccountDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.log.LogDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.account.IAccountDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.event.ILogDependencyService;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;

/* JADX INFO: renamed from: X.0vFy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1735240vFy {
    public static final C1735240vFy LIZ = new C1735240vFy();
    public static Map<String, ApplyAuthData> LIZIZ;
    public static C2252611DEt LIZJ;

    static {
        Map<String, ApplyAuthData> linkedHashMap;
        Type type;
        String string = C1257480ipO.LIZ.getString("auth_data_disk_cache", null);
        try {
            Gson gsonLJFF = C1741890vQh.LJFF();
            C1120604Zw.LIZ.getClass();
            C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
            if (c1121904a9LIZIZ == null || !c1121904a9LIZIZ.LJII) {
                type = new TypeToken<HashMap<String, ApplyAuthData>>() { // from class: X.0vG1
                }.getType();
            } else {
                C13JX c13jx = KTypeProjection.LIZJ;
                C13JW c13jwLJII = C13LE.LJII(String.class);
                c13jx.getClass();
                type = C2371409Qy.LIZJ(C13LE.LJIIIZ(HashMap.class, C13JX.LIZ(c13jwLJII), C13JX.LIZ(C13LE.LJ(ApplyAuthData.class))));
            }
            Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, string, type);
            if (!(objFromJson instanceof HashMap)) {
                objFromJson = null;
            }
            linkedHashMap = (HashMap) objFromJson;
        } catch (s e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap<>();
        }
        LIZIZ = linkedHashMap;
    }

    public static void LIZIZ() {
        try {
            Activity activityLIZ = C036A.LIZ();
            if (activityLIZ != null) {
                if (!Intrinsics.LJFF(activityLIZ.getClass().getSimpleName(), "MainActivity") && !Intrinsics.LJFF(activityLIZ.getClass().getSimpleName(), "SplashActivity")) {
                    activityLIZ.finish();
                    return;
                }
                C19EG c19egLIZIZ = C1388190mED.LIZIZ(activityLIZ);
                if (c19egLIZIZ != null) {
                    Hox.LLJILJIL.LIZ(c19egLIZIZ).TQ2(new Bundle(), "For You", false);
                }
            }
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static void LIZLLL() {
        try {
            Activity activityLIZ = C036A.LIZ();
            if (activityLIZ != null) {
                C19EG c19egLIZIZ = C1388190mED.LIZIZ(activityLIZ);
                DialogFragment dialogFragmentLIZ = C0THI.LIZ(c19egLIZIZ != null ? c19egLIZIZ.getSupportFragmentManager() : null);
                if (dialogFragmentLIZ != null) {
                    dialogFragmentLIZ.dismiss();
                }
            }
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static String LJ() {
        AnonymousClass0317 anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin;
        AnonymousClass0317 anonymousClass0317CreateILogDependencyServicebyMonsterPlugin;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin = AccountDependencyService.createIAccountDependencyServicebyMonsterPlugin(false);
            C1AQS.LIZJ(jElapsedRealtime, 1, IAccountDependencyService.class.getName(), anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAccountDependencyService.class);
        }
        IAccountDependencyService iAccountDependencyService = (IAccountDependencyService) anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin;
        if (iAccountDependencyService.isLogin()) {
            return iAccountDependencyService.getUserId();
        }
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            anonymousClass0317CreateILogDependencyServicebyMonsterPlugin = LogDependencyService.createILogDependencyServicebyMonsterPlugin(false);
            C1AQS.LIZJ(jElapsedRealtime2, 1, ILogDependencyService.class.getName(), anonymousClass0317CreateILogDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateILogDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateILogDependencyServicebyMonsterPlugin != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateILogDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILogDependencyService.class);
        }
        return ((ILogDependencyService) anonymousClass0317CreateILogDependencyServicebyMonsterPlugin).getServerDeviceId();
    }

    public static void LIZJ(boolean z) {
        C2252611DEt c2252611DEt;
        C2252611DEt c2252611DEt2 = LIZJ;
        if (c2252611DEt2 != null) {
            if (c2252611DEt2.isActive() && (c2252611DEt = LIZJ) != null) {
                Boolean boolValueOf = Boolean.valueOf(z);
                C189200o6.m2constructorimpl(boolValueOf);
                c2252611DEt.resumeWith(boolValueOf);
            }
            LIZJ = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(boolean r7, X.InterfaceC1364105Vn<? super kotlin.Unit> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C1735250vFz
            if (r0 == 0) goto L6c
            r5 = r8
            X.0vFz r5 = (X.C1735250vFz) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6c
            int r2 = r2 - r1
            r5.LLILZ = r2
        L12:
            java.lang.Object r1 = r5.LLILLJJLI
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILZ
            r3 = 1
            if (r0 == 0) goto L53
            if (r0 != r3) goto L72
            boolean r7 = r5.LL
            X.C155000ia.LIZIZ(r1)
        L24:
            com.ss.android.ugc.aweme.ecommerce.compliance.repository.dto.ExposureAuthResponse r1 = (com.ss.android.ugc.aweme.ecommerce.compliance.repository.dto.ExposureAuthResponse) r1
            if (r7 == 0) goto L50
            if (r1 == 0) goto L50
            com.ss.android.ugc.aweme.ecommerce.compliance.repository.dto.ExposureAuthData r0 = r1.data
            if (r0 == 0) goto L50
            java.lang.Boolean r1 = r0.isSuccess
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L50
            java.lang.String r4 = LJ()
            if (r4 == 0) goto L50
            java.util.Map<java.lang.String, com.ss.android.ugc.aweme.ecommerce.compliance.repository.dto.ApplyAuthData> r3 = X.C1735240vFy.LIZIZ
            com.ss.android.ugc.aweme.ecommerce.compliance.repository.dto.ApplyAuthData r2 = new com.ss.android.ugc.aweme.ecommerce.compliance.repository.dto.ApplyAuthData
            r0 = 2
            java.lang.Integer r1 = X.C2286608xc.LJ(r0)
            r0 = 0
            r2.<init>(r1, r0)
            r3.put(r4, r2)
        L50:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L53:
            X.C155000ia.LIZIZ(r1)
            X.0vG7 r2 = X.InterfaceC1735340vG8.LIZ
            com.ss.android.ugc.aweme.ecommerce.compliance.repository.dto.ExposureAuthRequest r1 = new com.ss.android.ugc.aweme.ecommerce.compliance.repository.dto.ExposureAuthRequest
            java.lang.Integer r0 = X.C2286608xc.LJ(r3)
            r1.<init>(r0)
            r5.LL = r7
            r5.LLILZ = r3
            java.lang.Object r1 = r2.LIZJ(r1, r5)
            if (r1 != r4) goto L24
            return r4
        L6c:
            X.0vFz r5 = new X.0vFz
            r5.<init>(r6, r8)
            goto L12
        L72:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1735240vFy.LIZ(boolean, X.05Vn):java.lang.Object");
    }

    public static void LJII(int i, String str, Function1 function1) {
        if (function1 != null) {
            function1.invoke(Boolean.FALSE);
            if (i == EnumC1735260vG0.TAB.getValue()) {
                LIZIZ();
                return;
            }
            return;
        }
        if (i != EnumC1735260vG0.TAB.getValue()) {
            if (i == EnumC1735260vG0.HALF_SCREEN.getValue()) {
                LIZLLL();
                return;
            }
            if (i == EnumC1735260vG0.FULL_SCREEN.getValue()) {
                LIZIZ();
                return;
            }
            if (i != EnumC1735260vG0.PDP.getValue() || str == null) {
                return;
            }
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(str), "fullScreen");
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null && Boolean.parseBoolean(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) {
                LIZIZ();
            } else {
                LIZLLL();
            }
        }
    }

    public static void LJI(String str, String str2, String str3, boolean z) {
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        Pair[] pairArr = new Pair[3];
        String str4 = "";
        if (str == null) {
            str = "";
        }
        pairArr[0] = new Pair("page_name", str);
        if (str2 != null && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(str2), "previous_page")) != null) {
            str4 = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        }
        pairArr[1] = new Pair("previous_page", str4);
        pairArr[2] = new Pair("action_area", str3);
        Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        if (z) {
            mapLJIIJ.put("btn_name", "agree");
        }
        C1507790pL7.LIZ.getClass();
        C1507790pL7.LIZJ("rd_tiktokec_agree_auth_btn_press", mapLJIIJ);
    }

    public static void LJFF(int i, int i2, String str, String str2, Function1 function1) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        LJI(str, str2, "close", false);
                        LJII(i2, str2, function1);
                        return;
                    }
                    return;
                }
                LJII(i2, str2, function1);
                return;
            }
            LJI(str, str2, "grey_area", false);
            LJII(i2, str2, function1);
            return;
        }
        LIZJ(true);
        String strLJ = LJ();
        if (strLJ != null) {
            LIZIZ.put(strLJ, new ApplyAuthData(2, null));
        }
        C817503Hh c817503Hh = C817503Hh.LL;
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(c817503Hh, C2107308Nj.LIZ.LLIILII(), null, new C1735210vFv(str, str2, null), 2);
        LJI(str, str2, "button", true);
    }

    public static void LJIIIIZZ(String str, AuthPopup authPopup, int i, String str2, C1407900mk0 c1407900mk0, Function1 function1) {
        try {
            C817503Hh c817503Hh = C817503Hh.LL;
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(c817503Hh, C2107308Nj.LIZ.LLIILII(), null, new C1735200vFu(str, str2, authPopup, c1407900mk0, i, function1, null), 2);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
