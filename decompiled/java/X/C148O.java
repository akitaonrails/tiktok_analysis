package X;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.net.URLEncoder;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.148O, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C148O {
    public static final int LIZJ(Activity activity) {
        if (activity == null) {
            return 0;
        }
        int rotation = C2204961BRm.LLILZIL(activity.getWindowManager(), new C0WZX("dzBzEhYuTITTUFQ3QACNYHJPSk1yapMr9qMODPGxAQ==", null)).getRotation();
        Intrinsics.LJIIJJI(Integer.valueOf(rotation), "rotation current ");
        int i = 2;
        if (rotation != 0) {
            if (rotation != 1) {
                if (rotation != 2) {
                    if (rotation != 3) {
                        return 0;
                    }
                    i = 1;
                }
            } else {
                i = 1;
            }
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("result", i);
            jSONObject.put("key", "orientation");
            C202191149l.LIZJ("oec_verify_sdk", jSONObject);
            return i;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            C14A6.LIZIZ();
            return i;
        }
    }

    public static final float LIZLLL(Context context) {
        try {
            Method declaredMethod = DisplayMetrics.class.getDeclaredMethod("getDeviceDensity", null);
            declaredMethod.setAccessible(true);
            if (declaredMethod.invoke(null, new Object[0]) != null) {
                return ((Integer) r0).intValue() / 160.0f;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return C786410Ut5.N3(context).getResources().getDisplayMetrics().density;
        }
    }

    public static final String LJ(Activity activity) {
        if (activity == null) {
            return null;
        }
        DisplayMetrics displayMetrics = activity.getResources().getDisplayMetrics();
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(i);
        sbLIZ.append('*');
        sbLIZ.append(i2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final void LIZ(StringBuilder sb, String str, int i) {
        LIZIZ(sb, str, String.valueOf(i));
    }

    public static final void LIZIZ(StringBuilder sb, String str, String str2) {
        if (str2 == null) {
            return;
        }
        try {
            sb.append("&");
            sb.append(str);
            sb.append("=");
            sb.append(URLEncoder.encode(str2, "utf-8"));
        } catch (UnsupportedEncodingException e) {
            TryCatchGuardChecker.doCheck(e);
            C14A6.LIZIZ();
        }
    }
}
