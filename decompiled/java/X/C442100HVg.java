package X;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import com.bytedance.bpea.cert.token.TokenCert;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS192S0000000_6;

/* JADX INFO: renamed from: X.0HVg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C442100HVg {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(624));

    public static boolean LIZ(Context context) {
        if (context == null || Build.VERSION.SDK_INT < 34) {
            return false;
        }
        return LIZIZ(context, new String[]{"android.permission.READ_MEDIA_VISUAL_USER_SELECTED"});
    }

    public static boolean LIZIZ(Context context, String[] strArr) {
        Integer numValueOf;
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            String str = (String) C13LQ.LJJIIZ(i, strArr);
            if (str == null || (numValueOf = Integer.valueOf(C838410Wul.LIZ(context, str))) == null || numValueOf.intValue() != 0) {
                return false;
            }
        }
        return true;
    }

    public static void LIZJ(Activity activity, Function2 function2) {
        C19514711Wn.LIZIZ.LIZIZ(activity, TokenCert.Companion.with("bpea-ttls_require_camera_when_write_review")).LIZIZ("android.permission.CAMERA").LIZJ(new C462980IDo(function2, 7));
    }
}
