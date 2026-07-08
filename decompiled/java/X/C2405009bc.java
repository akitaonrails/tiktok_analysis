package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* JADX INFO: renamed from: X.09bc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2405009bc {
    public static volatile C2405009bc LIZIZ;
    public final Map<String, Object> LIZ = new HashMap();

    public static String LIZ() {
        if (LIZIZ == null) {
            LIZIZ = new C2405009bc();
        }
        Object obj = ((HashMap) LIZIZ.LIZ).get("release_build");
        if (obj == null) {
            return "invalid";
        }
        String strValueOf = String.valueOf(obj);
        return strValueOf.length() >= 16 ? strValueOf : "invalid";
    }

    public C2405009bc() {
        Context contextLJ = C0VX9.LJ();
        if (contextLJ == null) {
            return;
        }
        Properties properties = new Properties();
        try {
            properties.load(contextLJ.getAssets().open("slardar.properties"));
            for (Map.Entry entry : properties.entrySet()) {
                this.LIZ.put(String.valueOf(entry.getKey()), entry.getValue());
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
