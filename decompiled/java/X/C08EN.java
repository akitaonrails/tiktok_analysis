package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

/* JADX INFO: renamed from: X.08EN, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08EN {
    public static String LIZ = "";
    public static String LIZIZ = "";
    public static String LIZJ = "";

    public static String LIZIZ(Context context, String str, boolean z) {
        InputStream c0vsp;
        byte[] bArr = new byte[1024];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        InputStream inputStream = null;
        try {
            try {
                if (z) {
                    c0vsp = context.getAssets().open(str);
                } else {
                    c0vsp = new C0VSP(str);
                }
                inputStream = c0vsp;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                if (inputStream != null) {
                    try {
                        inputStream.close();
                        throw th;
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        C1520960pgM.LIZIZ(e);
                        throw th;
                    }
                }
                throw th;
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C1520960pgM.LIZIZ(e2);
            if (inputStream != null) {
                break;
            }
            return byteArrayOutputStream.toString();
        }
        while (true) {
            int i = inputStream.read(bArr);
            if (i != -1) {
                byteArrayOutputStream.write(bArr, 0, i);
            }
            try {
                break;
            } catch (Exception e3) {
                TryCatchGuardChecker.doCheck(e3);
                C1520960pgM.LIZIZ(e3);
            }
        }
        inputStream.close();
        return byteArrayOutputStream.toString();
    }

    public static final String LIZ(Context context, String str, String str2, boolean z) {
        if (TextUtils.isEmpty(LIZ)) {
            if (TextUtils.isEmpty(str)) {
                LIZ = LIZIZ(context, "webview_monitor_js_file_v2/slardar_sdk.js", true);
            } else {
                LIZ = LIZIZ(context, str, false);
            }
        }
        if (TextUtils.isEmpty(LIZIZ)) {
            LIZIZ = LIZIZ(context, "webview_monitor_js_file_v2/slardar_bridge.js", true);
        }
        LIZJ = str2;
        if (str2 == null) {
            str2 = "";
        }
        LIZJ = str2;
        if (!z) {
            LIZ = "";
            LIZJ = "";
            LIZIZ = "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" javascript:(  function(){ ");
        sbLIZ.append(LIZ);
        sbLIZ.append(LIZIZ);
        sbLIZ.append(LIZJ);
        sbLIZ.append(" }  )() ");
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
