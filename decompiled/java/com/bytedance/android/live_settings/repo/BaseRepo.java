package com.bytedance.android.live_settings.repo;

import X.C2188811AlT;
import com.bytedance.android.live.annotation.ScopeValue;
import com.bytedance.android.live_settings.Monitor;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes35.dex */
public abstract class BaseRepo {
    public Keva dataRepo;
    public final ConcurrentHashMap<ScopeValue, Keva> scopeRepoCache = new ConcurrentHashMap<>();

    public abstract Keva getDataRepo();

    public abstract String getTag();

    private Keva realGetDataRepo() {
        if (this.dataRepo == null) {
            synchronized (BaseRepo.class) {
                try {
                    this.dataRepo = getDataRepo();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return this.dataRepo;
    }

    public void clear() {
        realGetDataRepo().clear();
    }

    public Map<String, ?> getAll() {
        return realGetDataRepo().getAll();
    }

    public Gson getGson() {
        return NormalGson.singleton();
    }

    public void load() {
        realGetDataRepo();
    }

    public boolean contains(String str) {
        return realGetDataRepo().contains(str);
    }

    public void erase(String str) {
        realGetDataRepo().erase(str);
    }

    public Keva getDataRepoByScope(ScopeValue scopeValue) {
        return getDataRepo();
    }

    public Keva realGetDataRepo(ScopeValue scopeValue) {
        Keva dataRepoByScope;
        Keva keva = this.scopeRepoCache.get(scopeValue);
        if (keva != null) {
            return keva;
        }
        synchronized (this.scopeRepoCache) {
            try {
                dataRepoByScope = this.scopeRepoCache.get(scopeValue);
                if (dataRepoByScope == null) {
                    dataRepoByScope = getDataRepoByScope(scopeValue);
                    this.scopeRepoCache.put(scopeValue, dataRepoByScope);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return dataRepoByScope;
    }

    public boolean contains(ScopeValue scopeValue, String str) {
        if (scopeValue != null) {
            return realGetDataRepo(scopeValue).contains(str);
        }
        return realGetDataRepo().contains(str);
    }

    public void erase(ScopeValue scopeValue, String str) {
        if (scopeValue != null) {
            realGetDataRepo(scopeValue).erase(str);
            realGetDataRepo().erase(str);
        } else {
            realGetDataRepo().erase(str);
        }
    }

    public boolean getBooleanValue(String str, boolean z) {
        return realGetDataRepo().getBoolean(str, z);
    }

    public double getDoubleValue(String str, double d) {
        return realGetDataRepo().getDouble(str, d);
    }

    public float getFloatValue(String str, float f) {
        return realGetDataRepo().getFloat(str, f);
    }

    public int getIntValue(String str, int i) {
        return realGetDataRepo().getInt(str, i);
    }

    public long getLongValue(String str, long j) {
        return realGetDataRepo().getLong(str, j);
    }

    public String[] getStringArrayValue(String str, String[] strArr) {
        String[] stringArray = realGetDataRepo().getStringArray(str, strArr);
        if (stringArray != null) {
            return stringArray;
        }
        return strArr;
    }

    public String getStringValue(String str, String str2) {
        return realGetDataRepo().getString(str, str2);
    }

    public Object getValue(String str, Class cls) {
        try {
            return getGson().LJII(realGetDataRepo().getString(str, null), cls);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Monitor monitor = SettingsManager.INSTANCE.getMonitor();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("exception: ");
            sbLIZ.append(th.getMessage());
            sbLIZ.append("  , key = ");
            sbLIZ.append(str);
            monitor.reportException("BaseRepo#getValue(Class)", C2188811AlT.LIZIZ(sbLIZ));
            return null;
        }
    }

    public void storeBooleanValue(String str, boolean z) {
        realGetDataRepo().storeBoolean(str, z);
    }

    public void storeDoubleValue(String str, double d) {
        realGetDataRepo().storeDouble(str, d);
    }

    public void storeFloatValue(String str, float f) {
        realGetDataRepo().storeFloat(str, f);
    }

    public void storeIntValue(String str, int i) {
        realGetDataRepo().storeInt(str, i);
    }

    public void storeLongValue(String str, long j) {
        realGetDataRepo().storeLong(str, j);
    }

    public void storeStringArrayValue(String str, String[] strArr) {
        realGetDataRepo().storeStringArray(str, strArr);
    }

    public void storeStringValue(String str, String str2) {
        realGetDataRepo().storeString(str, str2);
    }

    public Object getValue(String str, Type type) {
        try {
            return getGson().LJIIIIZZ(realGetDataRepo().getString(str, null), type);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Monitor monitor = SettingsManager.INSTANCE.getMonitor();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("exception: ");
            sbLIZ.append(th.getMessage());
            sbLIZ.append("  , key = ");
            sbLIZ.append(str);
            monitor.reportException("BaseRepo#getValue(Type)", C2188811AlT.LIZIZ(sbLIZ));
            return null;
        }
    }

    public boolean getBooleanValue(ScopeValue scopeValue, String str, boolean z) {
        if (scopeValue != null) {
            return realGetDataRepo(scopeValue).getBoolean(str, z);
        }
        return realGetDataRepo().getBoolean(str, z);
    }

    public double getDoubleValue(ScopeValue scopeValue, String str, double d) {
        if (scopeValue != null) {
            return realGetDataRepo(scopeValue).getDouble(str, d);
        }
        return realGetDataRepo().getDouble(str, d);
    }

    public float getFloatValue(ScopeValue scopeValue, String str, float f) {
        if (scopeValue != null) {
            return realGetDataRepo(scopeValue).getFloat(str, f);
        }
        return realGetDataRepo().getFloat(str, f);
    }

    public int getIntValue(ScopeValue scopeValue, String str, int i) {
        if (scopeValue != null) {
            return realGetDataRepo(scopeValue).getInt(str, i);
        }
        return realGetDataRepo().getInt(str, i);
    }

    public long getLongValue(ScopeValue scopeValue, String str, long j) {
        if (scopeValue != null) {
            return realGetDataRepo(scopeValue).getLong(str, j);
        }
        return realGetDataRepo().getLong(str, j);
    }

    public String[] getStringArrayValue(ScopeValue scopeValue, String str, String[] strArr) {
        if (scopeValue != null) {
            return realGetDataRepo(scopeValue).getStringArray(str, strArr);
        }
        return realGetDataRepo().getStringArray(str, strArr);
    }

    public String getStringValue(ScopeValue scopeValue, String str, String str2) {
        if (scopeValue != null) {
            return realGetDataRepo(scopeValue).getString(str, str2);
        }
        return realGetDataRepo().getString(str, str2);
    }

    public Object getValue(ScopeValue scopeValue, String str, Class cls) {
        String string;
        try {
            if (scopeValue != null) {
                string = realGetDataRepo(scopeValue).getString(str, null);
            } else {
                string = realGetDataRepo().getString(str, null);
            }
            return getGson().LJII(string, cls);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Monitor monitor = SettingsManager.INSTANCE.getMonitor();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("exception: ");
            sbLIZ.append(th.getMessage());
            sbLIZ.append("  , key = ");
            sbLIZ.append(str);
            monitor.reportException("BaseRepo#getValue(ScopeValue, Class)", C2188811AlT.LIZIZ(sbLIZ));
            return null;
        }
    }

    public void storeBooleanValue(ScopeValue scopeValue, String str, boolean z) {
        if (scopeValue != null) {
            realGetDataRepo(scopeValue).storeBoolean(str, z);
        } else {
            realGetDataRepo().storeBoolean(str, z);
        }
    }

    public void storeDoubleValue(ScopeValue scopeValue, String str, double d) {
        if (scopeValue != null) {
            realGetDataRepo(scopeValue).storeDouble(str, d);
        } else {
            realGetDataRepo().storeDouble(str, d);
        }
    }

    public void storeFloatValue(ScopeValue scopeValue, String str, float f) {
        if (scopeValue != null) {
            realGetDataRepo(scopeValue).storeFloat(str, f);
        } else {
            realGetDataRepo().storeFloat(str, f);
        }
    }

    public void storeIntValue(ScopeValue scopeValue, String str, int i) {
        if (scopeValue != null) {
            realGetDataRepo(scopeValue).storeInt(str, i);
        } else {
            realGetDataRepo().storeInt(str, i);
        }
    }

    public void storeLongValue(ScopeValue scopeValue, String str, long j) {
        if (scopeValue != null) {
            realGetDataRepo(scopeValue).storeLong(str, j);
        } else {
            realGetDataRepo().storeLong(str, j);
        }
    }

    public void storeStringArrayValue(ScopeValue scopeValue, String str, String[] strArr) {
        if (scopeValue != null) {
            realGetDataRepo(scopeValue).storeStringArray(str, strArr);
        } else {
            realGetDataRepo().storeStringArray(str, strArr);
        }
    }

    public void storeStringValue(ScopeValue scopeValue, String str, String str2) {
        if (scopeValue != null) {
            realGetDataRepo(scopeValue).storeString(str, str2);
        } else {
            realGetDataRepo().storeString(str, str2);
        }
    }

    public Object getValue(ScopeValue scopeValue, String str, Type type) {
        String string;
        try {
            if (scopeValue != null) {
                string = realGetDataRepo(scopeValue).getString(str, null);
            } else {
                string = realGetDataRepo().getString(str, null);
            }
            return getGson().LJIIIIZZ(string, type);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Monitor monitor = SettingsManager.INSTANCE.getMonitor();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("exception: ");
            sbLIZ.append(th.getMessage());
            sbLIZ.append("  , key = ");
            sbLIZ.append(str);
            monitor.reportException("BaseRepo#getValue(ScopeValue, Type)", C2188811AlT.LIZIZ(sbLIZ));
            return null;
        }
    }
}
