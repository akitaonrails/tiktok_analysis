package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.internal.w;
import com.google.gson.k;
import java.io.IOException;
import java.io.StringWriter;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0kvi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1338280kvi {
    public volatile int LIZ;
    public final Keva LIZIZ;
    public volatile JSONObject LIZJ;
    public volatile JSONObject[] LIZLLL = new JSONObject[32];

    public C1338280kvi(Keva keva) {
        this.LIZIZ = keva;
    }

    public static JSONObject LIZ(String str) {
        if (str != null && !str.isEmpty()) {
            try {
                return new JSONObject(str);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                return null;
            }
        }
        return new JSONObject();
    }

    public final JSONObject LIZIZ(String str) {
        int i;
        if (this.LIZ == 0) {
            this.LIZ = this.LIZIZ.getInt("setting_part_enable", -1);
        }
        if (this.LIZ == -1) {
            if (this.LIZJ != null) {
                return this.LIZJ;
            }
            JSONObject jSONObjectLIZ = LIZ(this.LIZIZ.getString("setting_key", ""));
            if (jSONObjectLIZ == null) {
                return new JSONObject();
            }
            this.LIZJ = jSONObjectLIZ;
            return jSONObjectLIZ;
        }
        if (str != null) {
            int iHashCode = str.hashCode();
            i = iHashCode ^ (iHashCode >>> 16);
        } else {
            i = 0;
        }
        int i2 = i & 31;
        synchronized (C1338280kvi.class) {
            try {
                JSONObject jSONObject = this.LIZLLL[i2];
                if (jSONObject != null) {
                    return jSONObject;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("setting_key_part");
                sbLIZ.append(i2);
                JSONObject jSONObjectLIZ2 = LIZ(this.LIZIZ.getString(C2188811AlT.LIZIZ(sbLIZ), ""));
                if (jSONObjectLIZ2 == null) {
                    return new JSONObject();
                }
                synchronized (C1338280kvi.class) {
                    try {
                        this.LIZLLL[i2] = jSONObjectLIZ2;
                    } finally {
                    }
                }
                return jSONObjectLIZ2;
            } finally {
            }
        }
    }

    public static String LIZJ(int i, k kVar) {
        if (kVar == null) {
            return "";
        }
        try {
            StringWriter stringWriter = new StringWriter(i);
            C09DL c09dl = new C09DL(stringWriter);
            c09dl.LLILZLL = true;
            w.LIZIZ(kVar, c09dl);
            return stringWriter.toString();
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new AssertionError(e);
        }
    }
}
