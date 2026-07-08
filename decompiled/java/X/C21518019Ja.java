package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastDoubleProtector;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.19Ja, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21518019Ja {
    public String LIZ;
    public float LIZIZ;
    public List<C21518219Jc> LIZJ;
    public long LIZLLL;
    public long LJ;
    public String LJFF;

    public static C21518019Ja LIZ(C19JH c19jh, JSONObject jSONObject) {
        long j;
        C21518219Jc c21518219Jc;
        Context context;
        long j2;
        if (jSONObject == null) {
            return null;
        }
        C21518019Ja c21518019Ja = new C21518019Ja();
        c21518019Ja.LIZ = jSONObject.optString("ordering");
        String strOptString = jSONObject.optString("loop");
        if (TextUtils.equals("infinite", strOptString)) {
            c21518019Ja.LIZIZ = -1.0f;
        } else {
            try {
                c21518019Ja.LIZIZ = CastFloatProtector.parseFloat(strOptString);
            } catch (NumberFormatException e) {
                TryCatchGuardChecker.doCheck(e);
                c21518019Ja.LIZIZ = 0.0f;
            }
        }
        c21518019Ja.LIZLLL = jSONObject.optLong("duration", 0L);
        try {
            j = CastLongProtector.parseLong(C1981907pZ.LIZ(jSONObject.optString("startDelay"), c19jh.LLILLL));
        } catch (NumberFormatException e2) {
            TryCatchGuardChecker.doCheck(e2);
            j = 0;
        }
        c21518019Ja.LJ = j;
        c21518019Ja.LJFF = jSONObject.optString("loopMode");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("animators");
        if (jSONArrayOptJSONArray == null) {
            return c21518019Ja;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject == null) {
                c21518219Jc = null;
            } else {
                c21518219Jc = new C21518219Jc();
                c21518219Jc.LIZ = jSONObjectOptJSONObject.optLong("duration");
                String strOptString2 = jSONObjectOptJSONObject.optString("loop");
                if (TextUtils.equals("infinite", strOptString2)) {
                    c21518219Jc.LIZIZ = -1.0f;
                } else {
                    try {
                        c21518219Jc.LIZIZ = CastFloatProtector.parseFloat(strOptString2);
                    } catch (NumberFormatException e3) {
                        TryCatchGuardChecker.doCheck(e3);
                        c21518219Jc.LIZIZ = 0.0f;
                    }
                }
                c21518219Jc.LIZJ = jSONObjectOptJSONObject.optString("loopMode");
                String strOptString3 = jSONObjectOptJSONObject.optString("type");
                c21518219Jc.LJ = strOptString3;
                if (TextUtils.equals(strOptString3, "ripple")) {
                    c21518219Jc.LJIIIZ = jSONObjectOptJSONObject.optString("rippleColor");
                }
                T t = c19jh.LLILZ;
                if (t != 0) {
                    context = t.getContext();
                } else {
                    context = null;
                }
                if (TextUtils.equals(c21518219Jc.LJ, "backgroundColor")) {
                    String strLIZ = C1981907pZ.LIZ(jSONObjectOptJSONObject.optString("valueTo"), c19jh.LLILLL);
                    int iLIZJ = C21367718jj.LIZJ(jSONObjectOptJSONObject.optString("valueFrom"));
                    int iLIZJ2 = C21367718jj.LIZJ(strLIZ);
                    c21518219Jc.LJFF = iLIZJ;
                    c21518219Jc.LJI = iLIZJ2;
                } else if ((TextUtils.equals(c21518219Jc.LJ, "translateX") || TextUtils.equals(c21518219Jc.LJ, "translateY")) && context != null) {
                    try {
                        float fLIZ = C1100060ejU.LIZ((float) jSONObjectOptJSONObject.optDouble("valueFrom"), context);
                        float fLIZ2 = C1100060ejU.LIZ((float) jSONObjectOptJSONObject.optDouble("valueTo"), context);
                        c21518219Jc.LJFF = fLIZ;
                        c21518219Jc.LJI = fLIZ2;
                    } catch (Exception e4) {
                        TryCatchGuardChecker.doCheck(e4);
                    }
                } else {
                    c21518219Jc.LJFF = (float) jSONObjectOptJSONObject.optDouble("valueFrom");
                    c21518219Jc.LJI = (float) jSONObjectOptJSONObject.optDouble("valueTo");
                }
                c21518219Jc.LJIIIIZZ = jSONObjectOptJSONObject.optString("interpolator");
                try {
                    j2 = CastLongProtector.parseLong(C1981907pZ.LIZ(jSONObjectOptJSONObject.optString("startDelay"), c19jh.LLILLL));
                } catch (NumberFormatException e5) {
                    TryCatchGuardChecker.doCheck(e5);
                    j2 = 0;
                }
                c21518219Jc.LIZLLL = j2;
                JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray("values");
                if (jSONArrayOptJSONArray2 != null && jSONArrayOptJSONArray2.length() > 0) {
                    float[] fArr = new float[jSONArrayOptJSONArray2.length()];
                    if ((TextUtils.equals(c21518219Jc.LJ, "translateX") || TextUtils.equals(c21518219Jc.LJ, "translateY")) && context != null) {
                        for (int i2 = 0; i2 < jSONArrayOptJSONArray2.length(); i2++) {
                            fArr[i2] = C1100060ejU.LIZ((float) LIZIZ(jSONArrayOptJSONArray2.optString(i2), c19jh.LLILLL), context);
                        }
                    } else {
                        for (int i3 = 0; i3 < jSONArrayOptJSONArray2.length(); i3++) {
                            fArr[i3] = (float) LIZIZ(jSONArrayOptJSONArray2.optString(i3), c19jh.LLILLL);
                        }
                    }
                    c21518219Jc.LJII = fArr;
                }
            }
            arrayList.add(c21518219Jc);
        }
        c21518019Ja.LIZJ = arrayList;
        return c21518019Ja;
    }

    public static double LIZIZ(Object obj, JSONObject jSONObject) {
        double d = 0.0d;
        if (obj instanceof String) {
            try {
                d = CastDoubleProtector.parseDouble(C1981907pZ.LIZ((String) obj, jSONObject));
                return d;
            } catch (NumberFormatException e) {
                TryCatchGuardChecker.doCheck(e);
                return d;
            }
        }
        if (obj instanceof Double) {
            return ((Double) obj).doubleValue();
        }
        if (obj instanceof Long) {
            return ((Double) obj).doubleValue();
        }
        if (!(obj instanceof Integer)) {
            return 0.0d;
        }
        return ((Double) obj).doubleValue();
    }
}
