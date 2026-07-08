package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1BJJ, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BJJ {
    public static final C1BJJ LIZ = new C1BJJ();
    public static final AtomicBoolean LIZIZ = new AtomicBoolean(false);
    public static final AtomicBoolean LIZJ = new AtomicBoolean(false);
    public static final C1BJZ LIZLLL = new C1BJZ(true, "com.facebook.sdk.AutoInitEnabled");
    public static final C1BJZ LJ = new C1BJZ(true, "com.facebook.sdk.AutoLogAppEventsEnabled");
    public static final C1BJZ LJFF = new C1BJZ(true, "com.facebook.sdk.AdvertiserIDCollectionEnabled");
    public static final C1BJZ LJI = new C1BJZ(false, "auto_event_setup_enabled");
    public static final C1BJZ LJII = new C1BJZ(true, "com.facebook.sdk.MonitorEnabled");
    public static SharedPreferences LJIIIIZZ;

    public static final boolean LIZIZ() {
        if (C807660VmG.LIZ(C1BJJ.class)) {
            return false;
        }
        try {
            LIZ.LJ();
            return LJFF.LIZ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return false;
        }
    }

    public static final boolean LIZJ() {
        if (C807660VmG.LIZ(C1BJJ.class)) {
            return false;
        }
        try {
            C1BJJ c1bjj = LIZ;
            c1bjj.LJ();
            return c1bjj.LIZ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return false;
        }
    }

    public static final Boolean LJIIIIZZ() {
        if (C807660VmG.LIZ(C1BJJ.class)) {
            return null;
        }
        try {
            LIZ.LJIIJ();
            try {
                SharedPreferences sharedPreferences = LJIIIIZZ;
                sharedPreferences.getClass();
                String string = sharedPreferences.getString(LJ.LIZIZ, "");
                String str = string != null ? string : "";
                if (str.length() > 0) {
                    return Boolean.valueOf(new JSONObject(str).getBoolean("value"));
                }
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            return null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    public final void LJII() {
        int i;
        int i2;
        ApplicationInfo applicationInfoV3;
        if (C807660VmG.LIZ(this)) {
            return;
        }
        try {
            if (LIZIZ.get() && FacebookSdk.LJII()) {
                Context contextLIZJ = FacebookSdk.LIZJ();
                int i3 = 0;
                int i4 = ((LIZLLL.LIZ() ? 1 : 0) << 0) | ((LJ.LIZ() ? 1 : 0) << 1) | ((LJFF.LIZ() ? 1 : 0) << 2) | ((LJII.LIZ() ? 1 : 0) << 3);
                SharedPreferences sharedPreferences = LJIIIIZZ;
                if (sharedPreferences == null) {
                    throw null;
                }
                int i5 = sharedPreferences.getInt("com.facebook.sdk.USER_SETTINGS_BITMASK", 0);
                if (i5 != i4) {
                    SharedPreferences sharedPreferences2 = LJIIIIZZ;
                    if (sharedPreferences2 == null) {
                        throw null;
                    }
                    sharedPreferences2.edit().putInt("com.facebook.sdk.USER_SETTINGS_BITMASK", i4).apply();
                    try {
                        applicationInfoV3 = C786410Ut5.V3(contextLIZJ.getPackageManager(), contextLIZJ.getPackageName(), 128);
                    } catch (PackageManager.NameNotFoundException e) {
                        e = e;
                        i = 0;
                    }
                    if (applicationInfoV3.metaData == null) {
                        i2 = 0;
                        Bundle bundle = new Bundle();
                        bundle.putInt("usage", i3);
                        bundle.putInt("initial", i2);
                        bundle.putInt("previous", i5);
                        bundle.putInt("current", i4);
                    }
                    String[] strArr = {"com.facebook.sdk.AutoInitEnabled", "com.facebook.sdk.AutoLogAppEventsEnabled", "com.facebook.sdk.AdvertiserIDCollectionEnabled", "com.facebook.sdk.MonitorEnabled"};
                    boolean[] zArr = {true, true, true, true};
                    int i6 = 0;
                    i = 0;
                    i2 = 0;
                    while (true) {
                        int i7 = i6 + 1;
                        try {
                            i |= (applicationInfoV3.metaData.containsKey(strArr[i6]) ? 1 : 0) << i6;
                            i2 |= (applicationInfoV3.metaData.getBoolean(strArr[i6], zArr[i6]) ? 1 : 0) << i6;
                            if (i7 > 3) {
                                break;
                            } else {
                                i6 = i7;
                            }
                        } catch (PackageManager.NameNotFoundException e2) {
                            e = e2;
                            i3 = i2;
                            TryCatchGuardChecker.doCheck(e);
                            i2 = i3;
                        }
                    }
                    i3 = i;
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt("usage", i3);
                    bundle2.putInt("initial", i2);
                    bundle2.putInt("previous", i5);
                    bundle2.putInt("current", i4);
                    TryCatchGuardChecker.doCheck(e);
                    i2 = i3;
                    i3 = i;
                    Bundle bundle22 = new Bundle();
                    bundle22.putInt("usage", i3);
                    bundle22.putInt("initial", i2);
                    bundle22.putInt("previous", i5);
                    bundle22.putInt("current", i4);
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final boolean LIZ() {
        Boolean boolValueOf;
        if (C807660VmG.LIZ(this)) {
            return false;
        }
        try {
            Map<String, Boolean> mapLIZIZ = C1BJL.LIZIZ();
            if (mapLIZIZ == null || mapLIZIZ.isEmpty()) {
                return LJ.LIZ();
            }
            Boolean bool = mapLIZIZ.get("auto_log_app_events_enabled");
            Boolean bool2 = mapLIZIZ.get("auto_log_app_events_default");
            if (bool != null) {
                return bool.booleanValue();
            }
            if (!C807660VmG.LIZ(this)) {
                try {
                    Boolean boolLJIIIIZZ = LJIIIIZZ();
                    if (boolLJIIIIZZ == null) {
                        Boolean boolLJFF = LJFF();
                        if (boolLJFF != null) {
                            boolValueOf = Boolean.valueOf(boolLJFF.booleanValue());
                        }
                    } else {
                        boolValueOf = Boolean.valueOf(boolLJIIIIZZ.booleanValue());
                    }
                    if (boolValueOf != null) {
                        return boolValueOf.booleanValue();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
            if (bool2 == null) {
                return true;
            }
            return bool2.booleanValue();
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            return false;
        }
    }

    public final void LIZLLL() {
        if (C807660VmG.LIZ(this)) {
            return;
        }
        try {
            C1BJZ c1bjz = LJI;
            LJIIIZ(c1bjz);
            final long jCurrentTimeMillis = System.currentTimeMillis();
            if (c1bjz.LIZJ == null || jCurrentTimeMillis - c1bjz.LIZLLL >= 604800000) {
                c1bjz.LIZJ = null;
                c1bjz.LIZLLL = 0L;
                if (LIZJ.compareAndSet(false, true)) {
                    FacebookSdk.LJ().execute(new Runnable() { // from class: X.1BJI
                        @Override // java.lang.Runnable
                        public final void run() {
                            C1BJK c1bjkLJI;
                            C0W7P c0w7pLIZ;
                            String strLIZ;
                            long j = jCurrentTimeMillis;
                            C1C7U.LIZ("UserSettingsManager@661c.initializeCodelessSetupEnabledAsync$1L");
                            if (!C807660VmG.LIZ(C1BJJ.class)) {
                                try {
                                    if (C1BJJ.LJFF.LIZ() && (c1bjkLJI = C1BJL.LJI(FacebookSdk.LIZLLL())) != null && c1bjkLJI.LJFF && (c0w7pLIZ = C0W7O.LIZ(FacebookSdk.LIZJ())) != null && c0w7pLIZ.LIZ() != null && (strLIZ = c0w7pLIZ.LIZ()) != null) {
                                        Bundle bundle = new Bundle();
                                        C786410Ut5.LJJJI("advertiser_id", strLIZ, bundle);
                                        C786410Ut5.LJJJI("fields", "auto_event_setup_enabled", bundle);
                                        String str = GraphRequest.LJIIIIZZ;
                                        GraphRequest graphRequestLJFF = C1BJA.LJFF(null, "app", null);
                                        graphRequestLJFF.LIZLLL = bundle;
                                        JSONObject jSONObject = graphRequestLJFF.LIZJ().LIZIZ;
                                        if (jSONObject != null) {
                                            C1BJZ c1bjz2 = C1BJJ.LJI;
                                            c1bjz2.LIZJ = Boolean.valueOf(jSONObject.optBoolean("auto_event_setup_enabled", false));
                                            c1bjz2.LIZLLL = j;
                                            C1BJJ.LIZ.LJIIJJI(c1bjz2);
                                        }
                                    }
                                    C1BJJ.LIZJ.set(false);
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                }
                            }
                            C1C7U.LIZIZ("UserSettingsManager@661c.initializeCodelessSetupEnabledAsync$1L");
                        }
                    });
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final void LJ() {
        if (C807660VmG.LIZ(this)) {
            return;
        }
        try {
            if (FacebookSdk.LJII()) {
                int i = 0;
                if (LIZIZ.compareAndSet(false, true)) {
                    LJIIIIZZ = C810670Vr7.LIZJ(FacebookSdk.LIZJ(), 0, "com.facebook.sdk.USER_SETTINGS");
                    C1BJZ[] c1bjzArr = {LJ, LJFF, LIZLLL};
                    if (!C807660VmG.LIZ(this)) {
                        do {
                            try {
                                C1BJZ c1bjz = c1bjzArr[i];
                                i++;
                                if (c1bjz == LJI) {
                                    LIZLLL();
                                } else if (c1bjz.LIZJ == null) {
                                    LJIIIZ(c1bjz);
                                    if (c1bjz.LIZJ == null) {
                                        LJI(c1bjz);
                                    }
                                } else {
                                    LJIIJJI(c1bjz);
                                }
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                            }
                        } while (i < 3);
                    }
                    LIZLLL();
                    if (!C807660VmG.LIZ(this)) {
                        try {
                            try {
                                Context contextLIZJ = FacebookSdk.LIZJ();
                                Bundle bundle = C786410Ut5.V3(contextLIZJ.getPackageManager(), contextLIZJ.getPackageName(), 128).metaData;
                                if (bundle != null) {
                                    bundle.containsKey("com.facebook.sdk.AdvertiserIDCollectionEnabled");
                                    LIZIZ();
                                }
                            } catch (PackageManager.NameNotFoundException e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                        }
                    }
                    LJII();
                }
            }
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
        }
    }

    public final Boolean LJFF() {
        if (C807660VmG.LIZ(this)) {
            return null;
        }
        try {
            LJIIJ();
            try {
                Context contextLIZJ = FacebookSdk.LIZJ();
                ApplicationInfo applicationInfoV3 = C786410Ut5.V3(contextLIZJ.getPackageManager(), contextLIZJ.getPackageName(), 128);
                Bundle bundle = applicationInfoV3.metaData;
                if (bundle != null) {
                    C1BJZ c1bjz = LJ;
                    if (bundle.containsKey(c1bjz.LIZIZ)) {
                        return Boolean.valueOf(applicationInfoV3.metaData.getBoolean(c1bjz.LIZIZ));
                    }
                }
            } catch (PackageManager.NameNotFoundException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            return null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    public final void LJIIJ() {
        if (C807660VmG.LIZ(this)) {
            return;
        }
        try {
            if (LIZIZ.get()) {
            } else {
                throw new C2202821BJg("The UserSettingManager has not been initialized successfully");
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final void LJI(C1BJZ c1bjz) {
        if (C807660VmG.LIZ(this)) {
            return;
        }
        try {
            LJIIJ();
            try {
                Context contextLIZJ = FacebookSdk.LIZJ();
                ApplicationInfo applicationInfoV3 = C786410Ut5.V3(contextLIZJ.getPackageManager(), contextLIZJ.getPackageName(), 128);
                Bundle bundle = applicationInfoV3.metaData;
                if (bundle != null && bundle.containsKey(c1bjz.LIZIZ)) {
                    c1bjz.LIZJ = Boolean.valueOf(applicationInfoV3.metaData.getBoolean(c1bjz.LIZIZ, c1bjz.LIZ));
                    return;
                }
                return;
            } catch (PackageManager.NameNotFoundException e) {
                TryCatchGuardChecker.doCheck(e);
                return;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        TryCatchGuardChecker.doCheck(th);
    }

    public final void LJIIIZ(C1BJZ c1bjz) {
        String str = "";
        if (C807660VmG.LIZ(this)) {
            return;
        }
        try {
            LJIIJ();
            try {
                SharedPreferences sharedPreferences = LJIIIIZZ;
                if (sharedPreferences != null) {
                    String string = sharedPreferences.getString(c1bjz.LIZIZ, "");
                    if (string != null) {
                        str = string;
                    }
                    if (str.length() > 0) {
                        JSONObject jSONObject = new JSONObject(str);
                        c1bjz.LIZJ = Boolean.valueOf(jSONObject.getBoolean("value"));
                        c1bjz.LIZLLL = jSONObject.getLong("last_timestamp");
                        return;
                    }
                    return;
                }
                throw null;
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final void LJIIJJI(C1BJZ c1bjz) {
        if (C807660VmG.LIZ(this)) {
            return;
        }
        try {
            LJIIJ();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("value", c1bjz.LIZJ);
                jSONObject.put("last_timestamp", c1bjz.LIZLLL);
                SharedPreferences sharedPreferences = LJIIIIZZ;
                if (sharedPreferences != null) {
                    sharedPreferences.edit().putString(c1bjz.LIZIZ, C786410Ut5.J3(jSONObject)).apply();
                    LJII();
                    return;
                }
                throw null;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
