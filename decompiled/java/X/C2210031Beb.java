package X;

import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Beb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2210031Beb {
    public static volatile boolean LJIILL = true;
    public static volatile long LJIILLIIL = 300000;
    public static volatile long LJIIZILJ = 30000;
    public static volatile boolean LJIJ;
    public static volatile int LJIJI;
    public static volatile int LJIJJ;
    public SharedPreferences LIZ;
    public boolean LIZIZ = LJIILL;
    public int LIZJ = 1048576;
    public int LIZLLL = 10;
    public boolean LJ = true;
    public boolean LJFF = true;
    public long LJI = LJIILLIIL;
    public long LJII = LJIIZILJ;
    public int LJIIIIZZ = 7;
    public boolean LJIIIZ = LJIJ;
    public int LJIIJ = LJIJI;
    public int LJIIJJI = LJIJJ;
    public Map<String, Integer> LJIIL = null;
    public JSONObject LJIILIIL;
    public volatile boolean LJIILJJIL;

    public final void LIZ(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.LJIIL.clear();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            int iOptInt = jSONObject.optInt(next, 0);
            if (iOptInt > 0 && iOptInt <= 10000) {
                this.LJIIL.put(next, Integer.valueOf(iOptInt));
            }
        }
    }

    public final void LIZIZ(JSONObject jSONObject) {
        SharedPreferences.Editor editorEdit;
        boolean z;
        boolean z2;
        boolean z3;
        if (jSONObject == null) {
            return;
        }
        SharedPreferences sharedPreferences = this.LIZ;
        if (sharedPreferences != null) {
            editorEdit = sharedPreferences.edit();
        } else {
            this.LJIILIIL = jSONObject;
            editorEdit = null;
        }
        boolean z4 = false;
        if (jSONObject.optInt("enabled", LJIILL ? 1 : 0) == 1) {
            z = true;
        } else {
            z = false;
        }
        this.LIZIZ = z;
        if (editorEdit != null) {
            editorEdit.putBoolean("enabled", z);
        }
        if (jSONObject.has("max_request_body_size_kb")) {
            int iOptInt = jSONObject.optInt("max_request_body_size_kb", 1024) * 1024;
            this.LIZJ = iOptInt;
            if (editorEdit != null) {
                editorEdit.putInt("max_request_body_size_kb", iOptInt);
            }
        }
        if (jSONObject.has("max_request_count")) {
            int iOptInt2 = jSONObject.optInt("max_request_count", 10);
            this.LIZLLL = iOptInt2;
            if (editorEdit != null) {
                editorEdit.putInt("max_request_count", iOptInt2);
            }
        }
        if (jSONObject.has("error_report_enable")) {
            if (jSONObject.optInt("error_report_enable", 1) == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.LJ = z3;
            if (editorEdit != null) {
                editorEdit.putBoolean("error_report_enable", z3);
            }
        }
        if (jSONObject.has("latency_report_enable")) {
            if (jSONObject.optInt("latency_report_enable", 1) == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.LJFF = z2;
            if (editorEdit != null) {
                editorEdit.putBoolean("latency_report_enable", z2);
            }
        }
        if (jSONObject.has("report_interval_ms")) {
            long jOptLong = jSONObject.optLong("report_interval_ms", LJIILLIIL);
            this.LJI = jOptLong;
            if (editorEdit != null) {
                editorEdit.putLong("report_interval_ms", jOptLong);
            }
        }
        if (jSONObject.has("coldstart_report_delay_ms")) {
            long jOptLong2 = jSONObject.optLong("coldstart_report_delay_ms", LJIIZILJ);
            this.LJII = jOptLong2;
            if (editorEdit != null) {
                editorEdit.putLong("coldstart_report_delay_ms", jOptLong2);
            }
        }
        if (jSONObject.has("data_keep_alive_days")) {
            int iOptInt3 = jSONObject.optInt("data_keep_alive_days", 7);
            this.LJIIIIZZ = iOptInt3;
            if (editorEdit != null) {
                editorEdit.putLong("data_keep_alive_days", iOptInt3);
            }
        }
        if (jSONObject.has("sentry_enabled")) {
            if (jSONObject.optInt("sentry_enabled", LJIJ ? 1 : 0) == 1) {
                z4 = true;
            }
            this.LJIIIZ = z4;
            if (editorEdit != null) {
                editorEdit.putBoolean("sentry_enabled", z4);
            }
        }
        if (jSONObject.has("sentry_coldstart_sampling_rate")) {
            int iOptInt4 = jSONObject.optInt("sentry_coldstart_sampling_rate", LJIJI);
            this.LJIIJ = iOptInt4;
            if (editorEdit != null) {
                editorEdit.putInt("sentry_coldstart_sampling_rate", iOptInt4);
            }
        }
        if (jSONObject.has("network_coldstart_sampling_rate")) {
            int iOptInt5 = jSONObject.optInt("network_coldstart_sampling_rate", LJIJJ);
            this.LJIIJJI = iOptInt5;
            if (editorEdit != null) {
                editorEdit.putInt("network_coldstart_sampling_rate", iOptInt5);
            }
        }
        if (jSONObject.has("sentry_events")) {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("sentry_events");
            LIZ(jSONObjectOptJSONObject);
            if (editorEdit != null) {
                editorEdit.putString("sentry_events", C786410Ut5.J3(jSONObjectOptJSONObject));
                editorEdit.apply();
            }
        } else if (editorEdit != null) {
            editorEdit.apply();
        }
        if (this.LJIILJJIL) {
            LIZJ(true);
        }
    }

    public final void LIZJ(boolean z) {
        if (!z) {
            this.LJIILJJIL = false;
            return;
        }
        this.LJIILJJIL = true;
        LJIILL = true;
        LJIJ = true;
        LJIJI = 10000;
        LJIJJ = 10000;
        this.LIZIZ = LJIILL;
        this.LJIIIZ = LJIJ;
        this.LJIIJ = LJIJI;
        this.LJIIJJI = LJIJJ;
        this.LJIIL = null;
    }
}
