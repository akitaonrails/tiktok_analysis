package com.bytedance.android.live_settings;

import X.C2188811AlT;
import com.bytedance.android.live.annotation.BusinessScope;
import com.bytedance.android.live.annotation.ScopeValue;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.repo.InitialRepo;
import com.bytedance.android.live_settings.repo.PreciseExposureRepo;
import com.bytedance.android.live_settings.repo.SettingsRepo;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes35.dex */
public class DataCenter {
    public static volatile Map<String, ScopeValue> keyToScopeMapCache;

    public static void clear() {
        SettingsRepo.INSTANCE.clear();
    }

    public static Map<String, Object> getAllValues() {
        return new HashMap(SettingsRepo.INSTANCE.getAll());
    }

    public static void init() {
        InitialRepo.INSTANCE.load();
        SettingsRepo.INSTANCE.load();
        PreciseExposureRepo.Companion.getINATANCE().load();
    }

    public static void initSplitRepo() {
        SettingsRepo.INSTANCE.loadSplitRepos();
    }

    public static Class getConfigType(Class cls) {
        try {
            Field declaredField = cls.getDeclaredField(LivePreviewCTASmartDisplayManager.DEFAULT);
            declaredField.setAccessible(true);
            return declaredField.getType();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Can not find DEFAULT field in ");
            sbLIZ.append(cls.getName());
            throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static <T> T getDefaultValue(Class cls) {
        try {
            Field declaredField = cls.getDeclaredField(LivePreviewCTASmartDisplayManager.DEFAULT);
            boolean z = true;
            declaredField.setAccessible(true);
            if ((declaredField.getModifiers() & 8) != 8) {
                z = false;
            }
            if (!z) {
                return null;
            }
            return (T) declaredField.get(null);
        } catch (NoSuchFieldException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    public static String getKey(Class cls) {
        try {
            SettingsKey settingsKey = (SettingsKey) cls.getAnnotation(SettingsKey.class);
            if (settingsKey == null) {
                return "";
            }
            return settingsKey.value();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }

    public static ScopeValue getScopeValue(Class cls) {
        try {
            BusinessScope businessScope = (BusinessScope) cls.getAnnotation(BusinessScope.class);
            if (businessScope != null) {
                return businessScope.value();
            }
            return null;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static ScopeValue getScopeValueByKey(String str) {
        try {
            if (keyToScopeMapCache == null) {
                synchronized (DataCenter.class) {
                    try {
                        if (keyToScopeMapCache == null) {
                            Class<?> cls = Class.forName("com.bytedance.android.live.settings.initializer.SettingsInitializer");
                            keyToScopeMapCache = (Map) cls.getMethod("getKeyToScopeMap", new Class[0]).invoke(cls.newInstance(), new Object[0]);
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
            return keyToScopeMapCache.get(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static boolean getBooleanValue(String str, boolean z) {
        return getBooleanValue(str, z, null);
    }

    public static double getDoubleValue(String str, double d) {
        return getDoubleValue(str, d, null);
    }

    public static float getFloatValue(String str, float f) {
        return getFloatValue(str, f, null);
    }

    public static int getIntValue(String str, int i) {
        return getIntValue(str, i, null);
    }

    public static long getLongValue(String str, long j) {
        return getLongValue(str, j, null);
    }

    public static String[] getStringArrayValue(String str, String[] strArr) {
        return getStringArrayValue(str, strArr, null);
    }

    public static String getStringValue(String str, String str2) {
        return getStringValue(str, str2, null);
    }

    public static boolean getBooleanValue(String str, boolean z, ScopeValue scopeValue) {
        if (str != null && str.length() != 0) {
            InitialRepo initialRepo = InitialRepo.INSTANCE;
            if (initialRepo.contains(str)) {
                return initialRepo.getBooleanValue(str, z);
            }
            if (scopeValue != null) {
                return SettingsRepo.INSTANCE.getBooleanValue(scopeValue, str, z);
            }
            return SettingsRepo.INSTANCE.getBooleanValue(str, z);
        }
        return z;
    }

    public static double getDoubleValue(String str, double d, ScopeValue scopeValue) {
        if (str != null && str.length() != 0) {
            InitialRepo initialRepo = InitialRepo.INSTANCE;
            if (initialRepo.contains(str)) {
                return initialRepo.getDoubleValue(str, d);
            }
            if (scopeValue != null) {
                return SettingsRepo.INSTANCE.getDoubleValue(scopeValue, str, d);
            }
            return SettingsRepo.INSTANCE.getDoubleValue(str, d);
        }
        return d;
    }

    public static float getFloatValue(String str, float f, ScopeValue scopeValue) {
        if (str != null && str.length() != 0) {
            InitialRepo initialRepo = InitialRepo.INSTANCE;
            if (initialRepo.contains(str)) {
                return initialRepo.getFloatValue(str, f);
            }
            if (scopeValue != null) {
                return SettingsRepo.INSTANCE.getFloatValue(scopeValue, str, f);
            }
            return SettingsRepo.INSTANCE.getFloatValue(str, f);
        }
        return f;
    }

    public static int getIntValue(String str, int i, ScopeValue scopeValue) {
        if (str != null && str.length() != 0) {
            InitialRepo initialRepo = InitialRepo.INSTANCE;
            if (initialRepo.contains(str)) {
                return initialRepo.getIntValue(str, i);
            }
            if (scopeValue != null) {
                return SettingsRepo.INSTANCE.getIntValue(scopeValue, str, i);
            }
            return SettingsRepo.INSTANCE.getIntValue(str, i);
        }
        return i;
    }

    public static long getLongValue(String str, long j, ScopeValue scopeValue) {
        if (str != null && str.length() != 0) {
            InitialRepo initialRepo = InitialRepo.INSTANCE;
            if (initialRepo.contains(str)) {
                return initialRepo.getLongValue(str, j);
            }
            if (scopeValue != null) {
                return SettingsRepo.INSTANCE.getLongValue(scopeValue, str, j);
            }
            return SettingsRepo.INSTANCE.getLongValue(str, j);
        }
        return j;
    }

    public static String[] getStringArrayValue(String str, String[] strArr, ScopeValue scopeValue) {
        if (str != null && str.length() != 0) {
            InitialRepo initialRepo = InitialRepo.INSTANCE;
            if (initialRepo.contains(str)) {
                return initialRepo.getStringArrayValue(str, strArr);
            }
            if (scopeValue != null) {
                return SettingsRepo.INSTANCE.getStringArrayValue(scopeValue, str, strArr);
            }
            return SettingsRepo.INSTANCE.getStringArrayValue(str, strArr);
        }
        return strArr;
    }

    public static String getStringValue(String str, String str2, ScopeValue scopeValue) {
        if (str != null && str.length() != 0) {
            InitialRepo initialRepo = InitialRepo.INSTANCE;
            if (initialRepo.contains(str)) {
                return initialRepo.getStringValue(str, str2);
            }
            if (scopeValue != null) {
                return SettingsRepo.INSTANCE.getStringValue(scopeValue, str, str2);
            }
            return SettingsRepo.INSTANCE.getStringValue(str, str2);
        }
        return str2;
    }

    public static <T> T getValueSafely(String str, Class<?> cls, Object obj) {
        return (T) getValueSafely(str, cls, obj, (ScopeValue) null);
    }

    public static <T> T getValueSafely(String str, Type type, Object obj) {
        return (T) getValueSafely(str, type, obj, (ScopeValue) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T getValueSafely(String str, Class<?> cls, Object obj, ScopeValue scopeValue) {
        T t;
        if (str != null && str.length() != 0) {
            InitialRepo initialRepo = InitialRepo.INSTANCE;
            if (initialRepo.contains(str)) {
                t = (T) initialRepo.getValue(str, (Class) cls);
            } else if (scopeValue != null) {
                t = (T) SettingsRepo.INSTANCE.getValue(scopeValue, str, (Class) cls);
            } else {
                t = (T) SettingsRepo.INSTANCE.getValue(str, (Class) cls);
            }
            if (t != null) {
                return t;
            }
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T getValueSafely(String str, Type type, Object obj, ScopeValue scopeValue) {
        T t;
        if (str != null && str.length() != 0) {
            InitialRepo initialRepo = InitialRepo.INSTANCE;
            if (initialRepo.contains(str)) {
                t = (T) initialRepo.getValue(str, type);
            } else if (scopeValue != null) {
                t = (T) SettingsRepo.INSTANCE.getValue(scopeValue, str, type);
            } else {
                t = (T) SettingsRepo.INSTANCE.getValue(str, type);
            }
            if (t != null) {
                return t;
            }
        }
        return obj;
    }
}
