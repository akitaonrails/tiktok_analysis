package X;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.lynx.service.trail.TrailServiceBridge;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.o;
import com.lynx.base.log.LynxLog;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.base.TraceEvent;
import java.util.HashMap;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: renamed from: X.0jul, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1299250jul {
    public static final Gson LJ = new Gson();
    public static volatile C1299250jul LJFF;
    public SharedPreferences LIZ;
    public HashMap<String, Object> LIZIZ;
    public final ReadWriteLock LIZJ = new ReentrantReadWriteLock();
    public Context LIZLLL = null;

    public static C1299250jul LIZJ() {
        if (LJFF == null) {
            synchronized (C1299250jul.class) {
                try {
                    if (LJFF == null) {
                        LJFF = new C1299250jul();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LJFF;
    }

    public final String LJFF() {
        SharedPreferences sharedPreferences = this.LIZ;
        String string = null;
        if (sharedPreferences == null) {
            LynxLog.e("LynxSettingsManager", "please call initialize first");
            return null;
        }
        if (!sharedPreferences.contains("settings")) {
            LynxLog.i("LynxSettingsManager", "Lynx load local cached settings: no cached.");
            return null;
        }
        try {
            string = this.LIZ.getString("settings", "");
            return string;
        } catch (ClassCastException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Lynx load local cached settings exception ");
            sbLIZ.append(e);
            LynxLog.e("LynxSettingsManager", C2188811AlT.LIZIZ(sbLIZ));
            return string;
        }
    }

    public static HashMap LIZ(String str) {
        HashMap map;
        if (str != null) {
            try {
                Gson gson = LJ;
                k kVar = (k) gson.LJII(str, k.class);
                if (kVar != null) {
                    map = (HashMap) gson.LIZJ(kVar.LJIILIIL(), HashMap.class);
                    try {
                        LynxLog.i("LynxSettingsManager", "Lynx load local cached settings success");
                        return map;
                    } catch (o e) {
                        e = e;
                        TryCatchGuardChecker.doCheck(e);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Lynx settings initialize exception ");
                        sbLIZ.append(e);
                        LynxLog.e("LynxSettingsManager", C2188811AlT.LIZIZ(sbLIZ));
                        return map;
                    } catch (IllegalStateException e2) {
                        e = e2;
                        TryCatchGuardChecker.doCheck(e);
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("Lynx settings initialize exception ");
                        sbLIZ2.append(e);
                        LynxLog.e("LynxSettingsManager", C2188811AlT.LIZIZ(sbLIZ2));
                        return map;
                    } catch (Throwable th) {
                        th = th;
                        TryCatchGuardChecker.doCheck(th);
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("Lynx settings unexpected exception ");
                        sbLIZ3.append(th);
                        LynxLog.e("LynxSettingsManager", C2188811AlT.LIZIZ(sbLIZ3));
                        return map;
                    }
                }
            } catch (o e3) {
                e = e3;
                map = null;
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ22 = C2188811AlT.LIZ();
                sbLIZ22.append("Lynx settings initialize exception ");
                sbLIZ22.append(e);
                LynxLog.e("LynxSettingsManager", C2188811AlT.LIZIZ(sbLIZ22));
                return map;
            } catch (IllegalStateException e4) {
                e = e4;
                map = null;
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ222 = C2188811AlT.LIZ();
                sbLIZ222.append("Lynx settings initialize exception ");
                sbLIZ222.append(e);
                LynxLog.e("LynxSettingsManager", C2188811AlT.LIZIZ(sbLIZ222));
                return map;
            } catch (Throwable th2) {
                th = th2;
                map = null;
            }
        }
        return null;
    }

    public final void LIZIZ(Context context) {
        String strLJFF;
        if (context != null && this.LIZ == null) {
            TraceEvent.LIZLLL("LynxSettingsManager.initialize");
            synchronized (this) {
                try {
                    if (this.LIZ == null) {
                        this.LIZLLL = context;
                        this.LIZ = C810670Vr7.LIZJ(context, 0, "lynx_settings_manager_sp");
                        strLJFF = LJFF();
                    } else {
                        strLJFF = null;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            HashMap<String, Object> mapLIZ = LIZ(strLJFF);
            if (mapLIZ != null) {
                LJI(mapLIZ);
            }
            TraceEvent.LJII("LynxSettingsManager.initialize");
        }
    }

    public final void LJI(HashMap<String, Object> map) {
        boolean z;
        ((ReentrantReadWriteLock) this.LIZJ).readLock().lock();
        HashMap<String, Object> map2 = this.LIZIZ;
        if (map2 != null && map2.equals(map)) {
            z = false;
        } else {
            z = true;
        }
        ((ReentrantReadWriteLock) this.LIZJ).readLock().unlock();
        if (z) {
            ((ReentrantReadWriteLock) this.LIZJ).writeLock().lock();
            this.LIZIZ = map;
            ((ReentrantReadWriteLock) this.LIZJ).writeLock().unlock();
            LynxEnv.inst().setSettings(this.LIZIZ);
            if (C1289580jfA.LIZ.ensureInitialized()) {
                TrailServiceBridge.nativeCleanCache();
                return;
            }
            return;
        }
        LynxLog.i("LynxSettingsManager", "settings hash not changed");
    }

    public final void LIZLLL(n nVar, long j) {
        String string = nVar.toString();
        if (!C1299180jue.LIZ.booleanValue()) {
            C1299270jun.LIZIZ().LIZJ(this.LIZLLL, string, Integer.valueOf((int) j));
        }
        synchronized (this) {
            try {
                SharedPreferences sharedPreferences = this.LIZ;
                if (sharedPreferences != null) {
                    sharedPreferences.edit().putString("settings", string).putLong("settings_time", j).apply();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        LJI((HashMap) GsonProtectorUtils.fromJson(LJ, (k) nVar, HashMap.class));
    }

    public final void LJ(String str, long j) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Lynx setSettings ");
        sbLIZ.append(str);
        LynxLog.i("LynxSettingsManager", C2188811AlT.LIZIZ(sbLIZ));
        try {
            n nVar = (n) LJ.LJII(str, n.class);
            if (nVar != null) {
                LIZLLL(nVar, j);
            }
        } catch (o e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Lynx set settings exception ");
            sbLIZ2.append(e);
            LynxLog.e("LynxSettingsManager", C2188811AlT.LIZIZ(sbLIZ2));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("Lynx settings unexpected exception ");
            sbLIZ3.append(th);
            LynxLog.e("LynxSettingsManager", C2188811AlT.LIZIZ(sbLIZ3));
        }
    }
}
