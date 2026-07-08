package X;

import Y.ACallableS155S0000000_30;
import Y.AObjectS79S0000000_30;
import android.content.ContentResolver;
import android.content.SharedPreferences;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.BusinessModuleService;

/* JADX INFO: renamed from: X.1440, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class AnonymousClass1440 {
    public static String LIZ;
    public static String LIZIZ;
    public static boolean LIZJ = false;
    public static boolean LIZLLL = false;
    public static final SharedPreferences LJ;

    static {
        C844470XAv.LIZ.getClass();
        LJ = C810670Vr7.LIZJ(C844470XAv.LIZ(), 0, "gaid_sp_name");
    }

    public static String LIZIZ() {
        BusinessModuleService businessModuleService;
        if (LIZIZ == null) {
            if (Looper.myLooper() == Looper.getMainLooper() || (LJ() && LIZLLL && (businessModuleService = (BusinessModuleService) PluggableExtentionKt.pluggableSpi(BusinessModuleService.class)) != null && businessModuleService.getDelayGetAidReturnCacheOpt())) {
                return LJ.getString("key_android_id", "");
            }
            LJII();
        }
        return LIZIZ;
    }

    public static String LIZJ() {
        BusinessModuleService businessModuleService;
        if (LIZ == null) {
            if (Looper.myLooper() == Looper.getMainLooper() || (LJ() && LIZLLL && (businessModuleService = (BusinessModuleService) PluggableExtentionKt.pluggableSpi(BusinessModuleService.class)) != null && businessModuleService.getDelayGetAidReturnCacheOpt())) {
                return LJ.getString("key_gaid", "");
            }
            LJII();
        }
        return LIZ;
    }

    public static String LIZLLL() {
        String str = LIZ;
        if (str != null) {
            return str;
        }
        if (C2206241BWk.LIZIZ()) {
            C15O7.LIZIZ(new ACallableS155S0000000_30(0), C823050WQl.LIZLLL(), null);
        } else {
            C15O7.LIZJ(new ACallableS155S0000000_30(1));
        }
        return LJ.getString("key_gaid", "");
    }

    public static boolean LJ() {
        BusinessModuleService businessModuleService = (BusinessModuleService) PluggableExtentionKt.pluggableSpi(BusinessModuleService.class);
        return businessModuleService != null && businessModuleService.getDelayGetAidTaskOpt();
    }

    public static void LJFF() {
        SharedPreferences.Editor editorEdit = LJ.edit();
        String strLIZ = null;
        try {
            C844470XAv.LIZ.getClass();
            AdvertisingIdClient.Info infoLIZIZ = C837870Wtt.LIZIZ(C844470XAv.LIZ());
            if (infoLIZIZ != null && !TextUtils.isEmpty(C2204961BRm.LLLLLIL(infoLIZIZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2wrdWs/KO2rbtHv2CQK0/GngBm8x/cFQdQoPLCFQyk=", null)))) {
                editorEdit.putString("key_gaid", C2204961BRm.LLLLLIL(infoLIZIZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2wrdWs/KO2rbtHv2CQK0/GngBm8x/cFQdQoPLCFQyk=", null)));
                LIZ = C2204961BRm.LLLLLIL(infoLIZIZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2wrdWs/KO2rbtHv2CQK0/GngBm8x/cFQdQoPLCFQyk=", null));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJFF(th, "update gaid failed");
        }
        try {
            C844470XAv.LIZ.getClass();
            strLIZ = LIZ(C844470XAv.LIZ().getContentResolver());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (!TextUtils.isEmpty(strLIZ)) {
            editorEdit.putString("key_android_id", strLIZ);
            LIZIZ = strLIZ;
        }
        editorEdit.commit();
    }

    public static void LJII() {
        if (LIZJ) {
            return;
        }
        if (LJ() && LIZLLL) {
            return;
        }
        try {
            C1492110ovp.LIZJ("aid_update_opt", new AObjectS79S0000000_30(0), new AObjectS79S0000000_30(1), ((Boolean) C07M1.LIZLLL.getValue()).booleanValue());
            AppLog.setGoogleAId(LIZ);
            LIZJ = true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LJI() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            if (LJ() && LIZLLL) {
                return;
            }
            LJII();
        }
    }

    public static String LIZ(ContentResolver contentResolver) {
        if (TextUtils.equals("android_id", "android_id")) {
            if (C10EU.LJIILIIL() && C20123913ob.LIZ()) {
                return "";
            }
            if (TextUtils.isEmpty(C20123913ob.LIZ)) {
                C20123913ob.LIZ = C2204961BRm.LLIIIZ(contentResolver, "android_id", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2wrdWs/KO2rbtHv2CQK0/GngBm8x/cFQdQoPLCFQyk=", null));
            }
            return C20123913ob.LIZ;
        }
        return C2204961BRm.LLIIIZ(contentResolver, "android_id", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2wrdWs/KO2rbtHv2CQK0/GngBm8x/cFQdQoPLCFQyk=", null));
    }
}
