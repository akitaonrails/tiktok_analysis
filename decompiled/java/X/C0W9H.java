package X;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Properties;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0W9H, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0W9H {
    public static C0W9H LIZLLL;
    public final Context LIZ;
    public Properties LIZIZ;
    public final JSONObject LIZJ;

    public C0W9H(Context context) {
        String str;
        ApplicationInfo applicationInfo;
        this.LIZ = context;
        JSONObject jSONObject = null;
        try {
            try {
                applicationInfo = context.getApplicationInfo();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return;
            }
        } catch (Throwable th) {
            try {
                TryCatchGuardChecker.doCheck(th);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
            }
        }
        if (applicationInfo != null) {
            str = applicationInfo.sourceDir;
        } else {
            str = null;
        }
        String strLIZIZ = C0W9C.LIZIZ(str);
        if (!TextUtils.isEmpty(strLIZIZ)) {
            JSONObject jSONObject2 = new JSONObject(strLIZIZ);
            try {
                if (!TextUtils.isEmpty(JSONObjectProtectorUtils.getString(jSONObject2, "meta_channel"))) {
                    jSONObject = jSONObject2;
                }
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
            }
        }
        this.LIZJ = jSONObject;
    }

    public final String LIZ(String str) {
        Object obj;
        JSONObject jSONObject;
        try {
            jSONObject = this.LIZJ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (jSONObject != null) {
            obj = jSONObject.get(str);
        } else {
            obj = null;
        }
        if (obj == null) {
            try {
                if (this.LIZIZ == null) {
                    Properties properties = new Properties();
                    this.LIZIZ = properties;
                    try {
                        properties.load(this.LIZ.getAssets().open("ss.properties"));
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
                Properties properties2 = this.LIZIZ;
                if (properties2 != null && properties2.containsKey(str)) {
                    obj = this.LIZIZ.get(str);
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
            }
        }
        if (!(obj instanceof String)) {
            return "";
        }
        return (String) obj;
    }
}
