package X;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Properties;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0W9I, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0W9I {
    public static C0W9I LIZJ;
    public final Properties LIZ = new Properties();
    public final JSONObject LIZIZ;

    public C0W9I(Context context) {
        String str;
        ApplicationInfo applicationInfo;
        JSONObject jSONObject = null;
        try {
            try {
                applicationInfo = context.getApplicationInfo();
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
            this.LIZIZ = jSONObject;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            this.LIZ.load(context.getAssets().open("ss.properties"));
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
    }

    public static C0W9I LIZIZ(Context context) {
        if (LIZJ == null) {
            synchronized (C0W9I.class) {
                try {
                    if (LIZJ == null) {
                        LIZJ = new C0W9I(context);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZJ;
    }

    public final String LIZ(String str, String str2) {
        Object obj;
        Object obj2 = null;
        try {
            JSONObject jSONObject = this.LIZIZ;
            if (jSONObject != null) {
                obj = jSONObject.get(str);
            } else {
                Properties properties = this.LIZ;
                if (properties != null && properties.containsKey(str)) {
                    obj = this.LIZ.get(str);
                } else {
                    obj = null;
                }
            }
            Logger.debug();
            obj2 = obj;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (!(obj2 instanceof String)) {
            return str2;
        }
        return (String) obj2;
    }
}
