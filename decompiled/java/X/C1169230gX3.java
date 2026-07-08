package X;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Arrays;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0gX3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1169230gX3 {
    public static Object LIZIZ(Intent intent, String... strArr) {
        Bundle extras;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        int length = strArr.length;
        int i = 0;
        while (true) {
            Object obj = null;
            if (i >= length) {
                return null;
            }
            String str = strArr[i];
            try {
                extras = intent.getExtras();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                extras = null;
            }
            if (extras == null || !extras.containsKey(str)) {
                Uri data = intent.getData();
                if (data != null && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(data, str)) != null) {
                    return strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
                }
                i++;
            } else {
                try {
                    obj = extras.get(str);
                    return obj;
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    return obj;
                } catch (OutOfMemoryError e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    return obj;
                }
            }
        }
    }

    public static String LIZJ(Intent intent, String... strArr) {
        String string;
        Object objLIZIZ = LIZIZ(intent, (String[]) Arrays.copyOf(strArr, strArr.length));
        if (objLIZIZ != null && (string = objLIZIZ.toString()) != null && string.length() > 0) {
            return string;
        }
        return null;
    }

    public static boolean LIZ(C1169230gX3 c1169230gX3, Intent intent, String str) {
        Boolean boolLJLI;
        Object objLIZIZ = LIZIZ(intent, str);
        if (objLIZIZ instanceof Boolean) {
            return ((Boolean) objLIZIZ).booleanValue();
        }
        if (objLIZIZ instanceof Number) {
            if (((Number) objLIZIZ).intValue() != 0) {
                return true;
            }
            return false;
        }
        if ((objLIZIZ instanceof String) && (boolLJLI = a0.LJLI((String) objLIZIZ)) != null) {
            return boolLJLI.booleanValue();
        }
        return false;
    }
}
