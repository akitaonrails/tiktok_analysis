package X;

import Y.ARunnableS104S0100000_4;
import Y.ARunnableS112S0100000_12;
import Y.ARunnableS17S1200000_12;
import Y.ARunnableS3S2200000_12;
import android.app.Application;
import android.content.ContentResolver;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0TK8, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TK8 {
    public static volatile String LJIIJ;
    public static volatile byte[] LJIIJJI = new byte[0];
    public static Map<String, String> LJIIL = new ConcurrentHashMap();
    public final String LIZ;
    public final Context LIZIZ;
    public JSONObject LIZJ;
    public final Map<String, Integer> LIZLLL;
    public final InterfaceC1112904Wx LJFF;
    public final C0COZ LJI;
    public final C742070T8z LJII;
    public Future LJIIIIZZ;
    public final Map<String, Object> LJ = new ConcurrentHashMap();
    public final Map<String, Runnable> LJIIIZ = new ConcurrentHashMap();

    public final void LIZJ() {
        try {
            new StringBuilder(this.LIZ);
            if (!LJIIL.isEmpty()) {
                this.LIZ.indexOf(63);
                boolean z = true;
                for (Map.Entry<String, String> entry : LJIIL.entrySet()) {
                    if (z) {
                        z = false;
                    }
                    URLEncoder.encode(entry.getKey(), "UTF-8");
                    URLEncoder.encode(entry.getValue(), "UTF-8");
                }
            }
            JSONObject jSONObject = new JSONObject(this.LJI.request());
            if (jSONObject.has("code") && jSONObject.has("data") && jSONObject.optInt("code", -1) == 0) {
                LIZLLL(JSONObjectProtectorUtils.getJSONObject(jSONObject, "data"));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static String LIZ(ContentResolver contentResolver) {
        if (TextUtils.equals("android_id", "android_id")) {
            if (C10EU.LJIILIIL() && C20123713oZ.LIZ()) {
                return "";
            }
            if (TextUtils.isEmpty(C20123713oZ.LIZ)) {
                C20123713oZ.LIZ = C2204961BRm.LLIIIL(contentResolver, "android_id", new C0WZX("dzBzEgAjS8/YVFkiQFyAZ/UiCZJWNNgPsj79FeMW71QTKNI2ONg9O9Ke", null));
            }
            return C20123713oZ.LIZ;
        }
        return C2204961BRm.LLIIIL(contentResolver, "android_id", new C0WZX("dzBzEgAjS8/YVFkiQFyAZ/UiCZJWNNgPsj79FeMW71QTKNI2ONg9O9Ke", null));
    }

    public static int LIZIZ(String str) {
        if (LJIIJJI.length > 1) {
            C0TK9.LJI.getClass();
            if (!C0TK9.LJ.contains(str)) {
                try {
                    byte[] bArr = LJIIJJI;
                    byte[] bArrLIZ = C318400Cdy.LIZ(str);
                    byte[] bArr2 = new byte[bArr.length + bArrLIZ.length];
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    System.arraycopy(bArrLIZ, 0, bArr2, bArr.length, bArrLIZ.length);
                    int iLIZIZ = C318400Cdy.LIZIZ(bArr2);
                    if (iLIZIZ < 0 || iLIZIZ >= 1000) {
                        return ((iLIZIZ % LSPassThroughRecordSizeConfig.DEFAULT) + LSPassThroughRecordSizeConfig.DEFAULT) % LSPassThroughRecordSizeConfig.DEFAULT;
                    }
                    return iLIZIZ;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    return new Random().nextInt(LSPassThroughRecordSizeConfig.DEFAULT);
                }
            }
        }
        return new Random().nextInt(LSPassThroughRecordSizeConfig.DEFAULT);
    }

    public final void LIZLLL(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                JSONObject jSONObject3 = JSONObjectProtectorUtils.getJSONObject(jSONObject, next);
                jSONObject2.put(next, jSONObject3.get("val"));
                String string = JSONObjectProtectorUtils.getString(jSONObject3, "vid");
                if (!TextUtils.isEmpty(string)) {
                    map.put(next, string);
                    long j = JSONObjectProtectorUtils.getLong(jSONObject3, "et");
                    if (j > 0) {
                        map2.put(string, Long.valueOf(j));
                    }
                }
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        ((ConcurrentHashMap) this.LJ).clear();
        this.LIZJ = jSONObject2;
        C0TKI.LIZ(new ARunnableS3S2200000_12(this.LIZIZ, jSONObject2, 0));
        C742070T8z c742070T8z = this.LJII;
        c742070T8z.LJIIIIZZ = map;
        C0TKI.LIZ(new ARunnableS17S1200000_12(c742070T8z.LIZ, map, 12));
        c742070T8z.LIZJ.retainAll(c742070T8z.LJIIIIZZ.values());
        C0TKI.LIZ(new ARunnableS3S2200000_12(c742070T8z.LIZ, "SP_EXPERIMENT_EXPOSURE_CACHE", c742070T8z.LIZJ, 1));
        c742070T8z.LIZJ();
    }

    public C0TK8(Application application, String str, boolean z, InterfaceC1112904Wx interfaceC1112904Wx, C0T92 c0t92, C0COZ c0coz, Map<String, String> map, Set<String> set) {
        JSONObject jSONObject;
        this.LIZ = str;
        LJIIL = map;
        this.LIZIZ = application;
        synchronized (this) {
            if (LJIIJ == null) {
                try {
                    String strLIZ = LIZ(application.getContentResolver());
                    if (strLIZ != null) {
                        LJIIJ = strLIZ;
                        LJIIJJI = C318400Cdy.LIZ(LJIIJ);
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
        try {
            jSONObject = new JSONObject(C0T6Q.LIZJ(this.LIZIZ, "SP_EXPERIMENT_CACHE").getString("SP_EXPERIMENT_CACHE", ""));
        } catch (JSONException e2) {
            TryCatchGuardChecker.doCheck(e2);
            jSONObject = new JSONObject();
        }
        this.LIZJ = jSONObject;
        this.LIZLLL = C0T6Q.LIZ(this.LIZIZ);
        C742070T8z c742070T8z = new C742070T8z(application, c0t92, set);
        this.LJII = c742070T8z;
        C0TK9.LJI.getClass();
        if (C0TK9.LIZJ == null) {
            C0TK9.LIZJ = c742070T8z;
            C0TKI.LIZ(new ARunnableS112S0100000_12(c742070T8z, 486));
        }
        this.LJFF = interfaceC1112904Wx;
        this.LJI = c0coz;
        if (z) {
            this.LJIIIIZZ = C0TKI.LIZ.scheduleWithFixedDelay(new ARunnableS104S0100000_4(this, 154), 2000L, 3600000L, TimeUnit.MILLISECONDS);
        }
    }
}
