package X;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.util.Pair;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.148N, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C148N {
    public static final StringBuilder LIZLLL(JSONObject jSONObject) {
        String string;
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                string = JSONObjectProtectorUtils.getString(jSONObject, next);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                string = null;
            }
            arrayList.add(new Pair(next, string));
        }
        sb.append(C804420Vh2.LIZJ(arrayList));
        return sb;
    }

    public static final int LJ(Activity activity) {
        if (activity == null) {
            return 0;
        }
        int rotation = C2204961BRm.LLILZIL(activity.getWindowManager(), new C0WZX("dzBzEgAjS8/YVFkiQFyGYn7cm4RGPatnlDWPDOyDdIVDgv/5", null)).getRotation();
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
            C202179148z.LIZJ("turing_verify_sdk", jSONObject);
            return i;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            C20221514Aj.LIZIZ();
            return i;
        }
    }

    public static final float LJFF(Context context) {
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

    public static final String LJI(Activity activity) {
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

    public static final StringBuilder LIZJ(String str, JSONObject jSONObject) {
        String string;
        StringBuilder sb = new StringBuilder(str);
        if (a0.LJJIZ(str, '?', 0, false, 6) < 0) {
            sb.append("?");
        } else {
            sb.append("&");
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                string = JSONObjectProtectorUtils.getString(jSONObject, next);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                string = null;
            }
            arrayList.add(new Pair(next, string));
        }
        sb.append(C804420Vh2.LIZJ(arrayList));
        return sb;
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
            C20221514Aj.LIZIZ();
        }
    }
}
