package X;

import Y.ARunnableS0S3100000_13;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0WHw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C820820WHw {
    public static boolean LIZJ;
    public static Context LIZLLL;
    public static final C820820WHw LIZ = new C820820WHw();
    public static C313480CQo LIZIZ = new C313480CQo();
    public static final C01GW LJ = C452501pT.LIZIZ(new C820850WHz());

    public static boolean LIZ(String str) {
        if (!LIZJ) {
            C0WI2 c0wi2 = new C0WI2();
            c0wi2.LIZIZ("share_sdk_no_init");
            c0wi2.LIZJ();
            return false;
        }
        String str2 = "";
        if (!TextUtils.isEmpty(str) && LIZJ && C13LP.LJJJJ(str, LIZIZ.LIZ.keySet())) {
            C820830WHx c820830WHx = C820830WHx.LIZ;
            Context context = LIZLLL;
            String lowerCase = null;
            if (context == null) {
                context = null;
            }
            c820830WHx.getClass();
            try {
                String strLIZ = C820830WHx.LIZ(C786410Ut5.Y3(context.getPackageManager(), str, 64).signatures[0]);
                if (strLIZ != null) {
                    str2 = strLIZ;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C0WI2 c0wi22 = new C0WI2();
                c0wi22.LIZIZ("share_sdk_get_pkg_sign_failed");
                c0wi22.LIZ(e.getMessage(), "err_msg");
                c0wi22.LIZ(Log.getStackTraceString(e), "err_msg_stack");
                c0wi22.LIZJ();
            }
            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(LIZIZ.LIZ.get(str))) {
                String lowerCase2 = str2.toLowerCase();
                String str3 = LIZIZ.LIZ.get(str);
                if (str3 != null) {
                    lowerCase = str3.toLowerCase();
                }
                if (Intrinsics.LJFF(lowerCase2, lowerCase)) {
                    return true;
                }
            }
        }
        C0WI2 c0wi23 = new C0WI2();
        c0wi23.LIZIZ("share_sdk_check_pkg_sign_failed");
        c0wi23.LIZ(str, "pkg_name");
        c0wi23.LIZ(str2, "pkg_sign");
        c0wi23.LIZJ();
        return false;
    }

    public static void LIZIZ(Context context, String str) {
        RunnableC823120WQs.LIZIZ(new ARunnableS0S3100000_13(context, null, str, 2));
        C810670Vr7.LIZJ(C820130WFf.LIZ(context).LIZ, 0, "account_sec_share_data").edit().putString("key_account_info", str).apply();
    }
}
