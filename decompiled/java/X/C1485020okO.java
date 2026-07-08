package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0okO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1485020okO {
    public static int LIZIZ;
    public static final C1485020okO LIZ = new C1485020okO();
    public static int LIZJ = -1;

    public static final float LIZJ() {
        String str;
        double dOptDouble;
        float volLoudUnity;
        try {
            str = (String) C1474810oTv.f204k0.getValue();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            str = null;
        }
        if (C123100dR.LIZ(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                int iLJ = LJ();
                if (iLJ == 1) {
                    dOptDouble = jSONObject.optDouble("small_spl_target_LU", 1.401298464324817E-45d);
                } else if (iLJ == 2) {
                    dOptDouble = jSONObject.optDouble("medium_spl_target_LU", 1.401298464324817E-45d);
                } else if (iLJ == 3) {
                    dOptDouble = jSONObject.optDouble("large_spl_target_LU", 1.401298464324817E-45d);
                }
                float f = (float) dOptDouble;
                if (f != Float.MIN_VALUE) {
                    return f;
                }
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        try {
            volLoudUnity = C607330Nrv.LIZ.LIZIZ().getVolLoudUnity();
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
        if (volLoudUnity == 0.0f) {
            return -12.0f;
        }
        return volLoudUnity;
    }

    public static final synchronized int LJ() {
        int i;
        int iLJ = C2179771ASp.LJ();
        if (iLJ == LIZIZ && (i = LIZJ) != -1) {
            return i;
        }
        try {
            LIZIZ = iLJ;
            int iLIZ = C0CJL.LIZ.LIZ(LIZIZ);
            LIZJ = iLIZ;
            return iLIZ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return -1;
        }
    }

    public static final float LIZ(String str) {
        float fLJFF = LJFF(str);
        float fLIZJ = LIZJ();
        if (LIZLLL(Float.valueOf(fLJFF)) && LIZLLL(Float.valueOf(fLIZJ))) {
            return fLJFF - fLIZJ;
        }
        return Float.MIN_VALUE;
    }

    public static final float LIZIZ(String str) {
        float fLJFF = LJFF(str);
        float fLIZJ = LIZJ();
        if (LIZLLL(Float.valueOf(fLJFF)) && LIZLLL(Float.valueOf(fLIZJ))) {
            return (float) Math.pow(10.0d, Math.min(24.0f, (fLIZJ - fLJFF) + C1485030okP.LIZ.editingPageBgmLoudnessBias) / 20.0f);
        }
        return Float.MIN_VALUE;
    }

    public static final boolean LIZLLL(Float f) {
        if (f != null && !Intrinsics.LIZLLL(f, Float.MIN_VALUE)) {
            return true;
        }
        return false;
    }

    public static final float LJFF(String str) {
        boolean z;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return Float.MIN_VALUE;
        }
        try {
            return (float) new JSONObject(str).optDouble("Loudness", 1.401298464324817E-45d);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return Float.MIN_VALUE;
        }
    }
}
