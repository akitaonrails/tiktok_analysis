package com.bytedance.android.live_settings;

import X.C01GW;
import X.C13BV;
import X.C13LP;
import X.C1C7U;
import X.C2179971ATj;
import X.C2188811AlT;
import X.C2209441Bde;
import X.C452501pT;
import X.InterfaceC1152360g5q;
import com.bytedance.android.live.annotation.ScopeValue;
import com.bytedance.android.live.settings.SettingModel;
import com.bytedance.android.live_settings.Monitor;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.PreciseExposureManager;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.live_settings.repo.OtherRepo;
import com.bytedance.android.live_settings.repo.SettingsRepo;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.internal.b;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.q;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes35.dex */
public final class SettingsManager {
    public static ExecutorService backgroundExecutor;
    public static SettingsDataProvider dataProvider;
    public static InterfaceC1152360g5q defineSettingProvider;
    public static volatile Boolean enableInitOptEnhance;
    public static volatile Boolean enableRemoveOutdatedData;
    public static volatile Boolean enableRepoInitOpt;
    public static volatile Boolean enableWhiteList;
    public static final SettingsManager INSTANCE = new SettingsManager();
    public static final String[] STRING_ARRAY_DEFAULT = new String[0];
    public static Monitor monitor = new MonitorImpl(false);
    public static volatile Map<String, LiveSettingModel> modelMap = new HashMap();
    public static final C2209441Bde settingValueCache = new C2209441Bde();
    public static AtomicBoolean hasInit = new AtomicBoolean(false);
    public static AtomicBoolean hasInitSplitRepo = new AtomicBoolean(false);
    public static volatile Map<String, Object> originalValues = new HashMap();
    public static volatile int enableCacheOpt = -1;
    public static volatile int enableGetValueAnrOpt = -1;
    public static final C01GW stashRepo$delegate = C452501pT.LIZIZ(new SettingsManager$stashRepo$2());

    public final synchronized void initSplitRepo() {
        if (hasInitSplitRepo.get()) {
            return;
        }
        DataCenter.initSplitRepo();
        hasInitSplitRepo.compareAndSet(false, true);
    }

    public static final boolean enableInitOptEnhance() {
        if (enableInitOptEnhance == null) {
            enableInitOptEnhance = Boolean.valueOf(INSTANCE.getBooleanValue("setting_init_opt_enhance", false));
        }
        return Intrinsics.LJFF(enableInitOptEnhance, Boolean.TRUE);
    }

    public static final boolean enableRemoveOutdatedData() {
        if (enableRemoveOutdatedData == null) {
            enableRemoveOutdatedData = Boolean.valueOf(INSTANCE.getBooleanValue("remove_outdated_data", true));
        }
        return Intrinsics.LJFF(enableRemoveOutdatedData, Boolean.TRUE);
    }

    public static final boolean enableRepoInitOpt() {
        if (enableRepoInitOpt == null) {
            enableRepoInitOpt = Boolean.valueOf(INSTANCE.getBooleanValue("setting_init_repo_opt", false));
        }
        return Intrinsics.LJFF(enableRepoInitOpt, Boolean.TRUE);
    }

    public static final boolean enableSaveBackup() {
        if (enableGetValueAnrOpt < 0) {
            enableGetValueAnrOpt = DataCenter.getIntValue("setting_get_value_anr_opt", 0);
        }
        return (enableGetValueAnrOpt & 8) != 0;
    }

    public static final boolean enableSettingsInitOpt() {
        if (enableGetValueAnrOpt < 0) {
            enableGetValueAnrOpt = DataCenter.getIntValue("setting_get_value_anr_opt", 0);
        }
        return (enableGetValueAnrOpt & 16) != 0;
    }

    public static final boolean enableWhiteList() {
        if (enableWhiteList == null) {
            enableWhiteList = Boolean.valueOf(INSTANCE.getBooleanValue("setting_init_hot_key_opt", false));
        }
        return Intrinsics.LJFF(enableWhiteList, Boolean.TRUE);
    }

    private final Keva getStashRepo() {
        return (Keva) stashRepo$delegate.getValue();
    }

    public static final boolean isFixModelMap() {
        if (enableGetValueAnrOpt < 0) {
            enableGetValueAnrOpt = DataCenter.getIntValue("setting_get_value_anr_opt", 0);
        }
        return (enableGetValueAnrOpt & 4) != 0;
    }

    public static final boolean isOptKevaSave() {
        if (enableGetValueAnrOpt < 0) {
            enableGetValueAnrOpt = DataCenter.getIntValue("setting_get_value_anr_opt", 0);
        }
        return (enableGetValueAnrOpt & 2) != 0;
    }

    public final long getLatestSettingsSavedTime() {
        return OtherRepo.INSTANCE.getLongValue("settings_saved_time", 0L);
    }

    public final List<LiveSettingModel> getModels() {
        SettingsDataProvider settingsDataProvider = dataProvider;
        if (settingsDataProvider == null) {
            return C13BV.INSTANCE;
        }
        Map<String, LiveSettingModel> liveSettingMap = settingsDataProvider.getLiveSettingMap();
        ArrayList arrayList = new ArrayList(liveSettingMap.size());
        Iterator<Map.Entry<String, LiveSettingModel>> it2 = liveSettingMap.entrySet().iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().getValue());
        }
        return arrayList;
    }

    public final boolean isEnableCacheOpt() {
        if (enableCacheOpt < 0) {
            enableCacheOpt = getIntValue("setting_cache_opt", 0);
        }
        return enableCacheOpt == 1;
    }

    public final boolean isOptGetValueAnr() {
        if (enableGetValueAnrOpt < 0) {
            enableGetValueAnrOpt = getIntValue("setting_get_value_anr_opt", 0);
        }
        return (enableGetValueAnrOpt & 1) != 0;
    }

    public final SettingsDataProvider getDataProvider() {
        return dataProvider;
    }

    public final int getEnableCacheOpt() {
        return enableCacheOpt;
    }

    public final int getEnableGetValueAnrOpt() {
        return enableGetValueAnrOpt;
    }

    public final Boolean getEnableInitOptEnhance() {
        return enableInitOptEnhance;
    }

    public final Boolean getEnableRemoveOutdatedData() {
        return enableRemoveOutdatedData;
    }

    public final Boolean getEnableRepoInitOpt() {
        return enableRepoInitOpt;
    }

    public final Boolean getEnableWhiteList() {
        return enableWhiteList;
    }

    public final Monitor getMonitor() {
        return monitor;
    }

    private final void appendExposedVidIfNecessary(final String str) {
        ExecutorService executorService = backgroundExecutor;
        if (executorService != null) {
            executorService.submit(new Runnable() { // from class: com.bytedance.android.live_settings.SettingsManager.appendExposedVidIfNecessary.1
                @Override // java.lang.Runnable
                public final void run() {
                    C1C7U.LIZ("SettingsManager@90de.appendExposedVidIfNecessary$1");
                    com_bytedance_android_live_settings_SettingsManager$appendExposedVidIfNecessary$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                    C1C7U.LIZIZ("SettingsManager@90de.appendExposedVidIfNecessary$1");
                }

                public final void com_bytedance_android_live_settings_SettingsManager$appendExposedVidIfNecessary$1__run$___twin___() {
                    PreciseExposureManager.INSTANCE.appendExposedVid(str);
                }

                public static void com_bytedance_android_live_settings_SettingsManager$appendExposedVidIfNecessary$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                    try {
                        anonymousClass1.com_bytedance_android_live_settings_SettingsManager$appendExposedVidIfNecessary$1__run$___twin___();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        if (!C2179971ATj.LIZ(th)) {
                            throw th;
                        }
                    }
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final n convertToJsonObject(Map<String, Object> map) {
        n nVar = new n();
        for (Object obj : map.keySet()) {
            Object obj2 = map.get(obj);
            if (obj2 instanceof String) {
                map.put(obj, INSTANCE.string2SortedJsonStr((String) obj2));
            }
        }
        try {
            Gson gsonSingleton = NormalGson.singleton();
            return (n) gsonSingleton.LJII(gsonSingleton.LJIILL(map), n.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return nVar;
        }
    }

    private final SettingModel getDefineSetting(String str) {
        InterfaceC1152360g5q interfaceC1152360g5q;
        InterfaceC1152360g5q interfaceC1152360g5q2 = defineSettingProvider;
        if (interfaceC1152360g5q2 != null) {
            return interfaceC1152360g5q2.getDefineSetting(str);
        }
        try {
            Object objNewInstance = Class.forName("com.bytedance.android.live.settings.initializer.LiveDefineSettingProvider").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            if ((objNewInstance instanceof InterfaceC1152360g5q) && (interfaceC1152360g5q = (InterfaceC1152360g5q) objNewInstance) != null) {
                defineSettingProvider = interfaceC1152360g5q;
                return interfaceC1152360g5q.getDefineSetting(str);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return null;
    }

    private final Object getValueByKeyOld(String str) {
        if (!originalValues.isEmpty()) {
            return originalValues.get(str);
        }
        Map<String, Object> allValues = DataCenter.getAllValues();
        originalValues = allValues;
        return allValues.get(str);
    }

    private final k string2SortedJsonStr(String str) {
        try {
            return (k) NormalGson.singleton().LJII(str, k.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return new q(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean getBooleanValue(java.lang.Class<?> r10) {
        /*
            r9 = this;
            long r7 = java.lang.System.nanoTime()
            java.lang.String r3 = r10.getName()
            java.util.Map<java.lang.String, com.bytedance.android.live_settings.LiveSettingModel> r0 = com.bytedance.android.live_settings.SettingsManager.modelMap
            java.lang.Object r6 = r0.get(r3)
            com.bytedance.android.live_settings.LiveSettingModel r6 = (com.bytedance.android.live_settings.LiveSettingModel) r6
            if (r6 == 0) goto L29
            java.lang.String r0 = r6.getSettingsKey()
            boolean r0 = r9.isRealPreciseExposure(r0)
            if (r0 == 0) goto L23
            java.lang.String r0 = r6.getSettingsKey()
            r9.appendExposedVidIfNecessary(r0)
        L23:
            java.lang.String r1 = r6.getSettingsKey()
            if (r1 != 0) goto L2d
        L29:
            java.lang.String r1 = com.bytedance.android.live_settings.DataCenter.getKey(r10)
        L2d:
            X.1Bde r2 = com.bytedance.android.live_settings.SettingsManager.settingValueCache
            r5 = 0
            java.lang.Object r0 = r2.LIZ(r5, r3)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L3d
            boolean r0 = r0.booleanValue()
            return r0
        L3d:
            boolean r0 = r9.isOptGetValueAnr()
            if (r0 == 0) goto L55
            if (r1 == 0) goto L55
            java.lang.Object r0 = r2.LIZ(r5, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L55
            r2.LIZIZ(r0, r3)
            boolean r0 = r0.booleanValue()
            return r0
        L55:
            com.bytedance.android.live.annotation.ScopeValue r4 = com.bytedance.android.live_settings.DataCenter.getScopeValue(r10)
            if (r6 == 0) goto L94
            boolean r0 = isOptKevaSave()
            if (r0 == 0) goto L87
            java.lang.String r1 = r6.getSettingsKey()
            boolean r0 = r6.getDefaultBoolean()
            boolean r4 = com.bytedance.android.live_settings.DataCenter.getBooleanValue(r1, r0, r4)
        L6d:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            r2.LIZIZ(r0, r3)
            com.bytedance.android.live_settings.Monitor r3 = com.bytedance.android.live_settings.SettingsManager.monitor
            if (r6 == 0) goto L7c
            java.lang.String r5 = r6.getSettingsKey()
        L7c:
            long r1 = java.lang.System.nanoTime()
            long r1 = r1 - r7
            java.lang.String r0 = "boolean"
            r3.reportSettingReadPerformance(r5, r1, r0)
            return r4
        L87:
            java.lang.String r1 = r6.getSettingsKey()
            boolean r0 = r6.getDefaultBoolean()
            boolean r4 = com.bytedance.android.live_settings.DataCenter.getBooleanValue(r1, r0)
            goto L6d
        L94:
            java.lang.Object r0 = com.bytedance.android.live_settings.DataCenter.getDefaultValue(r10)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto Laf
            boolean r1 = r0.booleanValue()
        La0:
            boolean r0 = isOptKevaSave()
            if (r0 == 0) goto Lb1
            java.lang.String r0 = com.bytedance.android.live_settings.DataCenter.getKey(r10)
            boolean r4 = com.bytedance.android.live_settings.DataCenter.getBooleanValue(r0, r1, r4)
            goto L6d
        Laf:
            r1 = 0
            goto La0
        Lb1:
            java.lang.String r0 = com.bytedance.android.live_settings.DataCenter.getKey(r10)
            boolean r4 = com.bytedance.android.live_settings.DataCenter.getBooleanValue(r0, r1)
            goto L6d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live_settings.SettingsManager.getBooleanValue(java.lang.Class):boolean");
    }

    public final String getCustomOriginalValue(String str) {
        String str2;
        Map<String, ? extends Object> map = settingValueCache.LIZIZ;
        if (map != null) {
            Object obj = map.get(str);
            if ((obj instanceof String) && (str2 = (String) obj) != null) {
                return str2;
            }
        }
        return DataCenter.getStringValue(str, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> Type getDefaultValueCustomTypeV2(T t) {
        if (t == null) {
            return Object.class;
        }
        if (t instanceof Map) {
            Map map = (Map) t;
            if (map.isEmpty()) {
                return new b.C0011b(null, LinkedHashMap.class, Object.class, Object.class);
            }
            Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
            return new b.C0011b(null, t.getClass(), getDefaultValueCustomTypeV2(entry.getKey()), getDefaultValueCustomTypeV2(entry.getValue()));
        }
        if (t instanceof List) {
            List list = (List) t;
            if (list.isEmpty()) {
                return new b.C0011b(null, ArrayList.class, Object.class);
            }
            return new b.C0011b(null, t.getClass(), getDefaultValueCustomTypeV2(C13LP.LJJJJZI(list)));
        }
        return t.getClass();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final double getDoubleValue(java.lang.Class<?> r12) {
        /*
            r11 = this;
            long r9 = java.lang.System.nanoTime()
            java.lang.String r6 = r12.getName()
            java.util.Map<java.lang.String, com.bytedance.android.live_settings.LiveSettingModel> r0 = com.bytedance.android.live_settings.SettingsManager.modelMap
            java.lang.Object r5 = r0.get(r6)
            com.bytedance.android.live_settings.LiveSettingModel r5 = (com.bytedance.android.live_settings.LiveSettingModel) r5
            if (r5 == 0) goto L29
            java.lang.String r0 = r5.getSettingsKey()
            boolean r0 = r11.isRealPreciseExposure(r0)
            if (r0 == 0) goto L23
            java.lang.String r0 = r5.getSettingsKey()
            r11.appendExposedVidIfNecessary(r0)
        L23:
            java.lang.String r1 = r5.getSettingsKey()
            if (r1 != 0) goto L2d
        L29:
            java.lang.String r1 = com.bytedance.android.live_settings.DataCenter.getKey(r12)
        L2d:
            X.1Bde r3 = com.bytedance.android.live_settings.SettingsManager.settingValueCache
            r4 = 0
            java.lang.Object r0 = r3.LIZ(r4, r6)
            java.lang.Double r0 = (java.lang.Double) r0
            if (r0 == 0) goto L3d
            double r0 = r0.doubleValue()
            return r0
        L3d:
            boolean r0 = r11.isOptGetValueAnr()
            if (r0 == 0) goto L55
            if (r1 == 0) goto L55
            java.lang.Object r0 = r3.LIZ(r4, r1)
            java.lang.Double r0 = (java.lang.Double) r0
            if (r0 == 0) goto L55
            r3.LIZIZ(r0, r6)
            double r0 = r0.doubleValue()
            return r0
        L55:
            com.bytedance.android.live.annotation.ScopeValue r7 = com.bytedance.android.live_settings.DataCenter.getScopeValue(r12)
            if (r5 == 0) goto L94
            boolean r0 = isOptKevaSave()
            if (r0 == 0) goto L87
            java.lang.String r2 = r5.getSettingsKey()
            double r0 = r5.getDefaultDouble()
            double r7 = com.bytedance.android.live_settings.DataCenter.getDoubleValue(r2, r0, r7)
        L6d:
            java.lang.Double r0 = java.lang.Double.valueOf(r7)
            r3.LIZIZ(r0, r6)
            com.bytedance.android.live_settings.Monitor r3 = com.bytedance.android.live_settings.SettingsManager.monitor
            if (r5 == 0) goto L7c
            java.lang.String r4 = r5.getSettingsKey()
        L7c:
            long r1 = java.lang.System.nanoTime()
            long r1 = r1 - r9
            java.lang.String r0 = "double"
            r3.reportSettingReadPerformance(r4, r1, r0)
            return r7
        L87:
            java.lang.String r2 = r5.getSettingsKey()
            double r0 = r5.getDefaultDouble()
            double r7 = com.bytedance.android.live_settings.DataCenter.getDoubleValue(r2, r0)
            goto L6d
        L94:
            java.lang.Object r0 = com.bytedance.android.live_settings.DataCenter.getDefaultValue(r12)
            java.lang.Double r0 = (java.lang.Double) r0
            if (r0 == 0) goto Laf
            double r1 = r0.doubleValue()
        La0:
            boolean r0 = isOptKevaSave()
            if (r0 == 0) goto Lb2
            java.lang.String r0 = com.bytedance.android.live_settings.DataCenter.getKey(r12)
            double r7 = com.bytedance.android.live_settings.DataCenter.getDoubleValue(r0, r1, r7)
            goto L6d
        Laf:
            r1 = 0
            goto La0
        Lb2:
            java.lang.String r0 = com.bytedance.android.live_settings.DataCenter.getKey(r12)
            double r7 = com.bytedance.android.live_settings.DataCenter.getDoubleValue(r0, r1)
            goto L6d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live_settings.SettingsManager.getDoubleValue(java.lang.Class):double");
    }

    public final float getFloatValue(Class<?> cls) {
        float fFloatValue;
        float floatValue;
        long jNanoTime = System.nanoTime();
        String name = cls.getName();
        LiveSettingModel liveSettingModel = modelMap.get(name);
        if (liveSettingModel != null && isRealPreciseExposure(liveSettingModel.getSettingsKey())) {
            appendExposedVidIfNecessary(liveSettingModel.getSettingsKey());
        }
        C2209441Bde c2209441Bde = settingValueCache;
        String settingsKey = null;
        Float f = (Float) c2209441Bde.LIZ(null, name);
        if (f != null) {
            return f.floatValue();
        }
        ScopeValue scopeValue = DataCenter.getScopeValue(cls);
        if (liveSettingModel != null) {
            if (isOptKevaSave()) {
                floatValue = DataCenter.getFloatValue(liveSettingModel.getSettingsKey(), liveSettingModel.getDefaultFloat(), scopeValue);
            } else {
                floatValue = DataCenter.getFloatValue(liveSettingModel.getSettingsKey(), liveSettingModel.getDefaultFloat());
            }
        } else {
            Float f2 = (Float) DataCenter.getDefaultValue(cls);
            if (f2 != null) {
                fFloatValue = f2.floatValue();
            } else {
                fFloatValue = 0.0f;
            }
            if (isOptKevaSave()) {
                floatValue = DataCenter.getFloatValue(DataCenter.getKey(cls), fFloatValue, scopeValue);
            } else {
                floatValue = DataCenter.getFloatValue(DataCenter.getKey(cls), fFloatValue);
            }
        }
        c2209441Bde.LIZIZ(Float.valueOf(floatValue), name);
        Monitor monitor2 = monitor;
        if (liveSettingModel != null) {
            settingsKey = liveSettingModel.getSettingsKey();
        }
        monitor2.reportSettingReadPerformance(settingsKey, System.nanoTime() - jNanoTime, "float");
        return floatValue;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int getIntValue(java.lang.Class<?> r10) {
        /*
            r9 = this;
            long r7 = java.lang.System.nanoTime()
            java.lang.String r3 = r10.getName()
            java.util.Map<java.lang.String, com.bytedance.android.live_settings.LiveSettingModel> r0 = com.bytedance.android.live_settings.SettingsManager.modelMap
            java.lang.Object r6 = r0.get(r3)
            com.bytedance.android.live_settings.LiveSettingModel r6 = (com.bytedance.android.live_settings.LiveSettingModel) r6
            if (r6 == 0) goto L29
            java.lang.String r0 = r6.getSettingsKey()
            boolean r0 = r9.isRealPreciseExposure(r0)
            if (r0 == 0) goto L23
            java.lang.String r0 = r6.getSettingsKey()
            r9.appendExposedVidIfNecessary(r0)
        L23:
            java.lang.String r1 = r6.getSettingsKey()
            if (r1 != 0) goto L2d
        L29:
            java.lang.String r1 = com.bytedance.android.live_settings.DataCenter.getKey(r10)
        L2d:
            X.1Bde r2 = com.bytedance.android.live_settings.SettingsManager.settingValueCache
            r5 = 0
            java.lang.Object r0 = r2.LIZ(r5, r3)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L3d
            int r0 = r0.intValue()
            return r0
        L3d:
            boolean r0 = r9.isOptGetValueAnr()
            if (r0 == 0) goto L55
            if (r1 == 0) goto L55
            java.lang.Object r0 = r2.LIZ(r5, r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L55
            r2.LIZIZ(r0, r3)
            int r0 = r0.intValue()
            return r0
        L55:
            com.bytedance.android.live.annotation.ScopeValue r4 = com.bytedance.android.live_settings.DataCenter.getScopeValue(r10)
            if (r6 == 0) goto L94
            boolean r0 = isOptKevaSave()
            if (r0 == 0) goto L87
            java.lang.String r1 = r6.getSettingsKey()
            int r0 = r6.getDefaultInt()
            int r4 = com.bytedance.android.live_settings.DataCenter.getIntValue(r1, r0, r4)
        L6d:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r2.LIZIZ(r0, r3)
            com.bytedance.android.live_settings.Monitor r3 = com.bytedance.android.live_settings.SettingsManager.monitor
            if (r6 == 0) goto L7c
            java.lang.String r5 = r6.getSettingsKey()
        L7c:
            long r1 = java.lang.System.nanoTime()
            long r1 = r1 - r7
            java.lang.String r0 = "int"
            r3.reportSettingReadPerformance(r5, r1, r0)
            return r4
        L87:
            java.lang.String r1 = r6.getSettingsKey()
            int r0 = r6.getDefaultInt()
            int r4 = com.bytedance.android.live_settings.DataCenter.getIntValue(r1, r0)
            goto L6d
        L94:
            java.lang.Object r0 = com.bytedance.android.live_settings.DataCenter.getDefaultValue(r10)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto Laf
            int r1 = r0.intValue()
        La0:
            boolean r0 = isOptKevaSave()
            if (r0 == 0) goto Lb1
            java.lang.String r0 = com.bytedance.android.live_settings.DataCenter.getKey(r10)
            int r4 = com.bytedance.android.live_settings.DataCenter.getIntValue(r0, r1, r4)
            goto L6d
        Laf:
            r1 = 0
            goto La0
        Lb1:
            java.lang.String r0 = com.bytedance.android.live_settings.DataCenter.getKey(r10)
            int r4 = com.bytedance.android.live_settings.DataCenter.getIntValue(r0, r1)
            goto L6d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live_settings.SettingsManager.getIntValue(java.lang.Class):int");
    }

    public final long getLongValue(Class<?> cls) {
        long jLongValue;
        long longValue;
        long jNanoTime = System.nanoTime();
        String name = cls.getName();
        LiveSettingModel liveSettingModel = modelMap.get(name);
        if (liveSettingModel != null && isRealPreciseExposure(liveSettingModel.getSettingsKey())) {
            appendExposedVidIfNecessary(liveSettingModel.getSettingsKey());
        }
        C2209441Bde c2209441Bde = settingValueCache;
        String settingsKey = null;
        Long l = (Long) c2209441Bde.LIZ(null, name);
        if (l != null) {
            return l.longValue();
        }
        ScopeValue scopeValue = DataCenter.getScopeValue(cls);
        if (liveSettingModel != null) {
            if (isOptKevaSave()) {
                longValue = DataCenter.getLongValue(liveSettingModel.getSettingsKey(), liveSettingModel.getDefaultLong(), scopeValue);
            } else {
                longValue = DataCenter.getLongValue(liveSettingModel.getSettingsKey(), liveSettingModel.getDefaultLong());
            }
        } else {
            Long l2 = (Long) DataCenter.getDefaultValue(cls);
            if (l2 != null) {
                jLongValue = l2.longValue();
            } else {
                jLongValue = 0;
            }
            if (isOptKevaSave()) {
                longValue = DataCenter.getLongValue(DataCenter.getKey(cls), jLongValue, scopeValue);
            } else {
                longValue = DataCenter.getLongValue(DataCenter.getKey(cls), jLongValue);
            }
        }
        c2209441Bde.LIZIZ(Long.valueOf(longValue), name);
        Monitor monitor2 = monitor;
        if (liveSettingModel != null) {
            settingsKey = liveSettingModel.getSettingsKey();
        }
        monitor2.reportSettingReadPerformance(settingsKey, System.nanoTime() - jNanoTime, "long");
        return longValue;
    }

    public final Object getMockValueByKey(String str) {
        return settingValueCache.LIZ(null, str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final Object getSettingValue(String str) {
        SettingModel defineSetting = getDefineSetting(str);
        if (defineSetting == null) {
            return null;
        }
        String valueType = defineSetting.getValueType();
        switch (valueType.hashCode()) {
            case -1325958191:
                if (valueType.equals("double")) {
                    return Double.valueOf(getDoubleValue(str, ((Double) defineSetting.getDefaultValue()).doubleValue()));
                }
                return null;
            case 104431:
                if (valueType.equals("int")) {
                    return Integer.valueOf(getIntValue(str, ((Integer) defineSetting.getDefaultValue()).intValue()));
                }
                return null;
            case 3327612:
                if (valueType.equals("long")) {
                    return Long.valueOf(getLongValue(str, ((Long) defineSetting.getDefaultValue()).longValue()));
                }
                return null;
            case 64711720:
                if (valueType.equals("boolean")) {
                    return Boolean.valueOf(getBooleanValue(str, ((Boolean) defineSetting.getDefaultValue()).booleanValue()));
                }
                return null;
            case 97526364:
                if (valueType.equals("float")) {
                    return Float.valueOf(getFloatValue(str, ((Float) defineSetting.getDefaultValue()).floatValue()));
                }
                return null;
            case 1063877011:
                if (valueType.equals("java.lang.Object")) {
                    return getCustomOriginalValue(str);
                }
                return null;
            case 1195259493:
                if (valueType.equals("java.lang.String")) {
                    return getStringValue(str, (String) defineSetting.getDefaultValue());
                }
                return null;
            case 1888107655:
                if (valueType.equals("java.lang.String[]")) {
                    return GsonProtectorUtils.toJson(NormalGson.singleton(), getStringArrayValue(str, (String[]) defineSetting.getDefaultValue()));
                }
                return null;
            default:
                return null;
        }
    }

    public final String getSettingValueType(String str) {
        SettingModel defineSetting = getDefineSetting(str);
        if (defineSetting == null) {
            return null;
        }
        return defineSetting.getValueType();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final String[] getStringArrayValue(Class<?> cls) {
        String[] stringArrayValue;
        long jNanoTime = System.nanoTime();
        String name = cls.getName();
        LiveSettingModel liveSettingModel = modelMap.get(name);
        if (liveSettingModel != null && isRealPreciseExposure(liveSettingModel.getSettingsKey())) {
            appendExposedVidIfNecessary(liveSettingModel.getSettingsKey());
        }
        C2209441Bde c2209441Bde = settingValueCache;
        String settingsKey = null;
        String[] strArr = (String[]) c2209441Bde.LIZ(null, name);
        if (strArr != null) {
            return strArr;
        }
        String[] strArr2 = (String[]) DataCenter.getDefaultValue(cls);
        if (strArr2 == null) {
            strArr2 = STRING_ARRAY_DEFAULT;
        }
        ScopeValue scopeValue = DataCenter.getScopeValue(cls);
        if (liveSettingModel != null) {
            if (isOptKevaSave()) {
                stringArrayValue = DataCenter.getStringArrayValue(liveSettingModel.getSettingsKey(), strArr2, scopeValue);
            } else {
                stringArrayValue = DataCenter.getStringArrayValue(liveSettingModel.getSettingsKey(), strArr2);
            }
        } else if (isOptKevaSave()) {
            stringArrayValue = DataCenter.getStringArrayValue(DataCenter.getKey(cls), strArr2, scopeValue);
        } else {
            stringArrayValue = DataCenter.getStringArrayValue(DataCenter.getKey(cls), strArr2);
        }
        c2209441Bde.LIZIZ(stringArrayValue, name);
        Monitor monitor2 = monitor;
        if (liveSettingModel != null) {
            settingsKey = liveSettingModel.getSettingsKey();
        }
        monitor2.reportSettingReadPerformance(settingsKey, System.nanoTime() - jNanoTime, "java.lang.String[]");
        return stringArrayValue;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String getStringValue(java.lang.Class<?> r11) {
        /*
            r10 = this;
            long r8 = java.lang.System.nanoTime()
            java.lang.String r7 = r11.getName()
            java.util.Map<java.lang.String, com.bytedance.android.live_settings.LiveSettingModel> r0 = com.bytedance.android.live_settings.SettingsManager.modelMap
            java.lang.Object r6 = r0.get(r7)
            com.bytedance.android.live_settings.LiveSettingModel r6 = (com.bytedance.android.live_settings.LiveSettingModel) r6
            if (r6 == 0) goto L29
            java.lang.String r0 = r6.getSettingsKey()
            boolean r0 = r10.isRealPreciseExposure(r0)
            if (r0 == 0) goto L23
            java.lang.String r0 = r6.getSettingsKey()
            r10.appendExposedVidIfNecessary(r0)
        L23:
            java.lang.String r1 = r6.getSettingsKey()
            if (r1 != 0) goto L2d
        L29:
            java.lang.String r1 = com.bytedance.android.live_settings.DataCenter.getKey(r11)
        L2d:
            X.1Bde r3 = com.bytedance.android.live_settings.SettingsManager.settingValueCache
            r5 = 0
            java.lang.Object r0 = r3.LIZ(r5, r7)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L39
            return r0
        L39:
            boolean r0 = r10.isOptGetValueAnr()
            if (r0 == 0) goto L4d
            if (r1 == 0) goto L4d
            java.lang.Object r0 = r3.LIZ(r5, r1)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L4d
            r3.LIZIZ(r0, r7)
            return r0
        L4d:
            com.bytedance.android.live.annotation.ScopeValue r2 = com.bytedance.android.live_settings.DataCenter.getScopeValue(r11)
            if (r6 == 0) goto L88
            boolean r0 = isOptKevaSave()
            if (r0 == 0) goto L7b
            java.lang.String r1 = r6.getSettingsKey()
            java.lang.String r0 = r6.getDefaultString()
            java.lang.String r4 = com.bytedance.android.live_settings.DataCenter.getStringValue(r1, r0, r2)
        L65:
            r3.LIZIZ(r4, r7)
            com.bytedance.android.live_settings.Monitor r3 = com.bytedance.android.live_settings.SettingsManager.monitor
            if (r6 == 0) goto L70
            java.lang.String r5 = r6.getSettingsKey()
        L70:
            long r1 = java.lang.System.nanoTime()
            long r1 = r1 - r8
            java.lang.String r0 = "java.lang.String"
            r3.reportSettingReadPerformance(r5, r1, r0)
            return r4
        L7b:
            java.lang.String r1 = r6.getSettingsKey()
            java.lang.String r0 = r6.getDefaultString()
            java.lang.String r4 = com.bytedance.android.live_settings.DataCenter.getStringValue(r1, r0)
            goto L65
        L88:
            java.lang.Object r1 = com.bytedance.android.live_settings.DataCenter.getDefaultValue(r11)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L92
            java.lang.String r1 = ""
        L92:
            boolean r0 = isOptKevaSave()
            if (r0 == 0) goto La1
            java.lang.String r0 = com.bytedance.android.live_settings.DataCenter.getKey(r11)
            java.lang.String r4 = com.bytedance.android.live_settings.DataCenter.getStringValue(r0, r1, r2)
            goto L65
        La1:
            java.lang.String r0 = com.bytedance.android.live_settings.DataCenter.getKey(r11)
            java.lang.String r4 = com.bytedance.android.live_settings.DataCenter.getStringValue(r0, r1)
            goto L65
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live_settings.SettingsManager.getStringValue(java.lang.Class):java.lang.String");
    }

    public final Object getValueByKey(String str) {
        if (isEnableCacheOpt()) {
            return getSettingValue(str);
        }
        return getValueByKeyOld(str);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final <T> T getValueSafely(Class<?> cls) {
        String key;
        T t;
        String settingsKey;
        T t2;
        long jNanoTime = System.nanoTime();
        String name = cls.getName();
        LiveSettingModel liveSettingModel = modelMap.get(name);
        if (liveSettingModel != null && isRealPreciseExposure(liveSettingModel.getSettingsKey())) {
            appendExposedVidIfNecessary(liveSettingModel.getSettingsKey());
        }
        Object defaultValue = DataCenter.getDefaultValue(cls);
        C2209441Bde c2209441Bde = settingValueCache;
        T t3 = (T) c2209441Bde.LIZ(defaultValue, name);
        if (t3 != null) {
            return t3;
        }
        if (liveSettingModel == null || (key = liveSettingModel.getSettingsKey()) == null) {
            key = DataCenter.getKey(cls);
        }
        if (isOptGetValueAnr() && key != null && (t2 = (T) c2209441Bde.LIZ(defaultValue, key)) != null) {
            c2209441Bde.LIZIZ(t2, name);
            return t2;
        }
        Class configType = DataCenter.getConfigType(cls);
        ScopeValue scopeValue = DataCenter.getScopeValue(cls);
        if (liveSettingModel != null) {
            if (isOptKevaSave()) {
                t = (T) DataCenter.getValueSafely(liveSettingModel.getSettingsKey(), (Class<?>) configType, defaultValue, scopeValue);
            } else {
                t = (T) DataCenter.getValueSafely(liveSettingModel.getSettingsKey(), (Class<?>) configType, defaultValue);
            }
        } else if (isOptKevaSave()) {
            t = (T) DataCenter.getValueSafely(DataCenter.getKey(cls), (Class<?>) configType, defaultValue, scopeValue);
        } else {
            t = (T) DataCenter.getValueSafely(DataCenter.getKey(cls), (Class<?>) configType, defaultValue);
        }
        if (t != null) {
            c2209441Bde.LIZIZ(t, name);
        }
        Monitor monitor2 = monitor;
        String fieldTypeName = null;
        if (liveSettingModel != null) {
            settingsKey = liveSettingModel.getSettingsKey();
        } else {
            settingsKey = null;
        }
        long jNanoTime2 = System.nanoTime() - jNanoTime;
        if (liveSettingModel != null) {
            fieldTypeName = liveSettingModel.getFieldTypeName();
        }
        monitor2.reportSettingReadPerformance(settingsKey, jNanoTime2, fieldTypeName);
        return t;
    }

    public final boolean isRealPreciseExposure(String str) {
        return PreciseExposureManager.INSTANCE.isRealPreciseExposure$live_settings_release(str);
    }

    public final void setDataProvider(SettingsDataProvider settingsDataProvider) {
        dataProvider = settingsDataProvider;
    }

    public final void setEnableCacheOpt(int i) {
        enableCacheOpt = i;
    }

    public final void setEnableGetValueAnrOpt(int i) {
        enableGetValueAnrOpt = i;
    }

    public final void setEnableInitOptEnhance(Boolean bool) {
        enableInitOptEnhance = bool;
    }

    public final void setEnableRemoveOutdatedData(Boolean bool) {
        enableRemoveOutdatedData = bool;
    }

    public final void setEnableRepoInitOpt(Boolean bool) {
        enableRepoInitOpt = bool;
    }

    public final void setEnableWhiteList(Boolean bool) {
        enableWhiteList = bool;
    }

    public final boolean getBooleanValue(String str, boolean z) {
        boolean booleanValue;
        if (isRealPreciseExposure(str)) {
            appendExposedVidIfNecessary(str);
        }
        C2209441Bde c2209441Bde = settingValueCache;
        Boolean bool = (Boolean) c2209441Bde.LIZ(Boolean.valueOf(z), str);
        if (bool != null) {
            return bool.booleanValue();
        }
        if (isOptKevaSave()) {
            booleanValue = DataCenter.getBooleanValue(str, z, DataCenter.getScopeValueByKey(str));
        } else {
            booleanValue = DataCenter.getBooleanValue(str, z);
        }
        c2209441Bde.LIZIZ(Boolean.valueOf(booleanValue), str);
        return booleanValue;
    }

    public final double getDoubleValue(String str, double d) {
        double doubleValue;
        long jNanoTime = System.nanoTime();
        if (isRealPreciseExposure(str)) {
            appendExposedVidIfNecessary(str);
        }
        C2209441Bde c2209441Bde = settingValueCache;
        Double d2 = (Double) c2209441Bde.LIZ(Double.valueOf(d), str);
        if (d2 != null) {
            return d2.doubleValue();
        }
        if (isOptKevaSave()) {
            doubleValue = DataCenter.getDoubleValue(str, d, DataCenter.getScopeValueByKey(str));
        } else {
            doubleValue = DataCenter.getDoubleValue(str, d);
        }
        c2209441Bde.LIZIZ(Double.valueOf(doubleValue), str);
        long jNanoTime2 = System.nanoTime() - jNanoTime;
        if (jNanoTime2 >= 1000000) {
            monitor.reportSettingReadPerformance(str, jNanoTime2, "double");
        }
        return doubleValue;
    }

    public final float getFloatValue(String str, float f) {
        float floatValue;
        long jNanoTime = System.nanoTime();
        if (isRealPreciseExposure(str)) {
            appendExposedVidIfNecessary(str);
        }
        C2209441Bde c2209441Bde = settingValueCache;
        Float f2 = (Float) c2209441Bde.LIZ(Float.valueOf(f), str);
        if (f2 != null) {
            return f2.floatValue();
        }
        if (isOptKevaSave()) {
            floatValue = DataCenter.getFloatValue(str, f, DataCenter.getScopeValueByKey(str));
        } else {
            floatValue = DataCenter.getFloatValue(str, f);
        }
        c2209441Bde.LIZIZ(Float.valueOf(floatValue), str);
        long jNanoTime2 = System.nanoTime() - jNanoTime;
        if (jNanoTime2 >= 1000000) {
            monitor.reportSettingReadPerformance(str, jNanoTime2, "float");
        }
        return floatValue;
    }

    public final int getIntValue(String str, int i) {
        int intValue;
        if (isRealPreciseExposure(str)) {
            appendExposedVidIfNecessary(str);
        }
        C2209441Bde c2209441Bde = settingValueCache;
        Integer num = (Integer) c2209441Bde.LIZ(Integer.valueOf(i), str);
        if (num != null) {
            return num.intValue();
        }
        if (isOptKevaSave()) {
            intValue = DataCenter.getIntValue(str, i, DataCenter.getScopeValueByKey(str));
        } else {
            intValue = DataCenter.getIntValue(str, i);
        }
        c2209441Bde.LIZIZ(Integer.valueOf(intValue), str);
        return intValue;
    }

    public final long getLongValue(String str, long j) {
        long longValue;
        long jNanoTime = System.nanoTime();
        if (isRealPreciseExposure(str)) {
            appendExposedVidIfNecessary(str);
        }
        C2209441Bde c2209441Bde = settingValueCache;
        Long l = (Long) c2209441Bde.LIZ(Long.valueOf(j), str);
        if (l != null) {
            return l.longValue();
        }
        if (isOptKevaSave()) {
            longValue = DataCenter.getLongValue(str, j, DataCenter.getScopeValueByKey(str));
        } else {
            longValue = DataCenter.getLongValue(str, j);
        }
        c2209441Bde.LIZIZ(Long.valueOf(longValue), str);
        long jNanoTime2 = System.nanoTime() - jNanoTime;
        if (jNanoTime2 >= 1000000) {
            monitor.reportSettingReadPerformance(str, jNanoTime2, "long");
        }
        return longValue;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final String[] getStringArrayValue(String str, String[] strArr) {
        String[] stringArrayValue;
        long jNanoTime = System.nanoTime();
        if (isRealPreciseExposure(str)) {
            appendExposedVidIfNecessary(str);
        }
        C2209441Bde c2209441Bde = settingValueCache;
        String[] strArr2 = (String[]) c2209441Bde.LIZ(strArr, str);
        if (strArr2 != null) {
            return strArr2;
        }
        if (isOptKevaSave()) {
            stringArrayValue = DataCenter.getStringArrayValue(str, strArr, DataCenter.getScopeValueByKey(str));
        } else {
            stringArrayValue = DataCenter.getStringArrayValue(str, strArr);
        }
        c2209441Bde.LIZIZ(stringArrayValue, str);
        long jNanoTime2 = System.nanoTime() - jNanoTime;
        if (jNanoTime2 >= 1000000) {
            monitor.reportSettingReadPerformance(str, jNanoTime2, "java.lang.String[]");
        }
        return stringArrayValue;
    }

    public final String getStringValue(String str, String str2) {
        String stringValue;
        long jNanoTime = System.nanoTime();
        if (isRealPreciseExposure(str)) {
            appendExposedVidIfNecessary(str);
        }
        C2209441Bde c2209441Bde = settingValueCache;
        String str3 = (String) c2209441Bde.LIZ(str2, str);
        if (str3 != null) {
            return str3;
        }
        if (isOptKevaSave()) {
            stringValue = DataCenter.getStringValue(str, str2, DataCenter.getScopeValueByKey(str));
        } else {
            stringValue = DataCenter.getStringValue(str, str2);
        }
        c2209441Bde.LIZIZ(stringValue, str);
        long jNanoTime2 = System.nanoTime() - jNanoTime;
        if (jNanoTime2 >= 1000000) {
            monitor.reportSettingReadPerformance(str, jNanoTime2, "java.lang.String");
        }
        return stringValue;
    }

    public final String getStringValueWithoutCache(String str, String str2) {
        return DataCenter.getStringValue(str, str2);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final <T> T getValueSafely(String str, T t) {
        T t2;
        long jNanoTime = System.nanoTime();
        if (isRealPreciseExposure(str)) {
            appendExposedVidIfNecessary(str);
        }
        C2209441Bde c2209441Bde = settingValueCache;
        T t3 = (T) c2209441Bde.LIZ(t, str);
        if (t3 != null) {
            return t3;
        }
        Type defaultValueCustomTypeV2 = getDefaultValueCustomTypeV2(t);
        if (isOptKevaSave()) {
            t2 = (T) DataCenter.getValueSafely(str, defaultValueCustomTypeV2, t, DataCenter.getScopeValueByKey(str));
        } else {
            t2 = (T) DataCenter.getValueSafely(str, defaultValueCustomTypeV2, t);
        }
        c2209441Bde.LIZIZ(t2, str);
        long jNanoTime2 = System.nanoTime() - jNanoTime;
        if (jNanoTime2 >= 1000000) {
            monitor.reportSettingReadPerformance(str, jNanoTime2, "java.lang.Object");
        }
        return t2;
    }

    public final int peekIntValue(String str, int i) {
        int intValue;
        C2209441Bde c2209441Bde = settingValueCache;
        Integer num = (Integer) c2209441Bde.LIZ(Integer.valueOf(i), str);
        if (num != null) {
            return num.intValue();
        }
        if (isOptKevaSave()) {
            intValue = DataCenter.getIntValue(str, i, DataCenter.getScopeValueByKey(str));
        } else {
            intValue = DataCenter.getIntValue(str, i);
        }
        c2209441Bde.LIZIZ(Integer.valueOf(intValue), str);
        return intValue;
    }

    public final void removeCacheValueForMock(String str, String str2) {
        C2209441Bde c2209441Bde = settingValueCache;
        if (str != null) {
            c2209441Bde.LIZ.remove(str);
        } else {
            c2209441Bde.getClass();
        }
        if (str2 != null) {
            c2209441Bde.LIZ.remove(str2);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:50:0x0101. Please report as an issue. */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:236:0x034f A[Catch: Exception -> 0x0355, TryCatch #0 {Exception -> 0x0355, blocks: (B:13:0x008a, B:14:0x008e, B:16:0x0094, B:18:0x00a0, B:20:0x00a8, B:22:0x00ae, B:24:0x00b6, B:27:0x00bc, B:31:0x00ca, B:32:0x00ce, B:34:0x00d4, B:41:0x00e5, B:49:0x00f8, B:50:0x0101, B:51:0x0104, B:53:0x0108, B:55:0x010c, B:57:0x0110, B:103:0x01ab, B:104:0x01b0, B:106:0x01b4, B:109:0x01ba, B:110:0x01bf, B:236:0x034f, B:111:0x01c5, B:113:0x01c9, B:115:0x01cd, B:116:0x01db, B:58:0x0114, B:60:0x011c, B:62:0x0120, B:121:0x01ef, B:122:0x01f7, B:124:0x01fb, B:127:0x0201, B:131:0x020f, B:63:0x0124, B:65:0x012c, B:67:0x0130, B:68:0x0132, B:70:0x0136, B:137:0x021c, B:139:0x0222, B:144:0x0230, B:146:0x0236, B:150:0x023f, B:143:0x022c, B:72:0x013c, B:74:0x0144, B:76:0x0148, B:158:0x024f, B:160:0x0255, B:161:0x025d, B:163:0x0261, B:166:0x0267, B:168:0x026d, B:172:0x027b, B:77:0x014c, B:79:0x0154, B:81:0x0158, B:82:0x015a, B:84:0x015e, B:178:0x0288, B:180:0x028e, B:185:0x029c, B:187:0x02a2, B:191:0x02ad, B:184:0x0298, B:86:0x0164, B:88:0x016c, B:90:0x0170, B:196:0x02b9, B:197:0x02c1, B:199:0x02c5, B:202:0x02cb, B:206:0x02d9, B:91:0x0174, B:93:0x017c, B:95:0x0180, B:97:0x0184, B:209:0x02e0, B:211:0x02e4, B:213:0x02e8, B:214:0x02f5, B:216:0x02f9, B:222:0x0305, B:227:0x0327, B:231:0x0345, B:226:0x0323, B:218:0x02fd, B:220:0x0301, B:98:0x0192, B:100:0x019a, B:44:0x00eb, B:46:0x00ef, B:37:0x00da, B:39:0x00de, B:30:0x00c5, B:229:0x032b, B:224:0x0309), top: B:250:0x008a, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0104 A[Catch: Exception -> 0x0355, TryCatch #0 {Exception -> 0x0355, blocks: (B:13:0x008a, B:14:0x008e, B:16:0x0094, B:18:0x00a0, B:20:0x00a8, B:22:0x00ae, B:24:0x00b6, B:27:0x00bc, B:31:0x00ca, B:32:0x00ce, B:34:0x00d4, B:41:0x00e5, B:49:0x00f8, B:50:0x0101, B:51:0x0104, B:53:0x0108, B:55:0x010c, B:57:0x0110, B:103:0x01ab, B:104:0x01b0, B:106:0x01b4, B:109:0x01ba, B:110:0x01bf, B:236:0x034f, B:111:0x01c5, B:113:0x01c9, B:115:0x01cd, B:116:0x01db, B:58:0x0114, B:60:0x011c, B:62:0x0120, B:121:0x01ef, B:122:0x01f7, B:124:0x01fb, B:127:0x0201, B:131:0x020f, B:63:0x0124, B:65:0x012c, B:67:0x0130, B:68:0x0132, B:70:0x0136, B:137:0x021c, B:139:0x0222, B:144:0x0230, B:146:0x0236, B:150:0x023f, B:143:0x022c, B:72:0x013c, B:74:0x0144, B:76:0x0148, B:158:0x024f, B:160:0x0255, B:161:0x025d, B:163:0x0261, B:166:0x0267, B:168:0x026d, B:172:0x027b, B:77:0x014c, B:79:0x0154, B:81:0x0158, B:82:0x015a, B:84:0x015e, B:178:0x0288, B:180:0x028e, B:185:0x029c, B:187:0x02a2, B:191:0x02ad, B:184:0x0298, B:86:0x0164, B:88:0x016c, B:90:0x0170, B:196:0x02b9, B:197:0x02c1, B:199:0x02c5, B:202:0x02cb, B:206:0x02d9, B:91:0x0174, B:93:0x017c, B:95:0x0180, B:97:0x0184, B:209:0x02e0, B:211:0x02e4, B:213:0x02e8, B:214:0x02f5, B:216:0x02f9, B:222:0x0305, B:227:0x0327, B:231:0x0345, B:226:0x0323, B:218:0x02fd, B:220:0x0301, B:98:0x0192, B:100:0x019a, B:44:0x00eb, B:46:0x00ef, B:37:0x00da, B:39:0x00de, B:30:0x00c5, B:229:0x032b, B:224:0x0309), top: B:250:0x008a, inners: #1, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map<java.lang.String, java.util.Set<java.lang.String>> updateDiffWithCurrentCache(com.google.gson.n r15, com.bytedance.android.live_settings.SettingsDataProvider r16) {
        /*
            Method dump skipped, instruction units count: 932
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live_settings.SettingsManager.updateDiffWithCurrentCache(com.google.gson.n, com.bytedance.android.live_settings.SettingsDataProvider):java.util.Map");
    }

    public final synchronized void init(SettingsDataProvider settingsDataProvider, Monitor monitor2, ExecutorService executorService) {
        if (hasInit.get()) {
            return;
        }
        DataCenter.init();
        if (monitor2 == null) {
            monitor2 = new MonitorImpl(false);
        }
        monitor = monitor2;
        dataProvider = settingsDataProvider;
        backgroundExecutor = executorService;
        hasInit.compareAndSet(false, true);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [X.1Bdb] */
    public final synchronized List<LiveSettingModel> saveSettingsValue(n nVar, SettingsDataProvider settingsDataProvider, final boolean z) {
        ArrayList arrayList;
        boolean zLJI = MethodIDManager.LJI(196631);
        dataProvider = settingsDataProvider;
        Map<String, LiveSettingModel> liveSettingMap = settingsDataProvider.getLiveSettingMap();
        arrayList = new ArrayList(liveSettingMap.size());
        Iterator<Map.Entry<String, LiveSettingModel>> it2 = liveSettingMap.entrySet().iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().getValue());
        }
        if (isFixModelMap()) {
            modelMap = liveSettingMap;
        }
        PreciseExposureManager.INSTANCE.savePreciseSettingInfo(settingsDataProvider.getPreciseLiveSettings());
        final C2209441Bde c2209441Bde = settingValueCache;
        new Object(c2209441Bde, z) { // from class: X.1Bdb
            public static final /* synthetic */ int LJFF = 0;
            public final C2209441Bde LIZ;
            public final C2209431Bdd LIZIZ;
            public final C2209421Bdc LIZJ;
            public final List<String> LIZLLL = C1697810uHb.LJIIJJI("setting_init_repo_opt", "setting_init_hot_key_opt", "watch_live_task_schedule_setting", "live_strategy_platform_all_config_map", "smart_game_anchor_ai_strategy_control_config");
            public final String LJ = "setting_get_value_anr_opt";

            /* JADX WARN: Type inference failed for: r0v0, types: [X.1Bdd] */
            /* JADX WARN: Type inference failed for: r0v1, types: [X.1Bdc] */
            {
                this.LIZ = c2209441Bde;
                this.LIZIZ = new InterfaceC2209451Bdf(z) { // from class: X.1Bdd
                    public final boolean LIZ;

                    {
                        this.LIZ = z;
                    }

                    @Override // X.InterfaceC2209451Bdf
                    public final Integer LJFF(n nVar2, String str) {
                        int i;
                        try {
                            q qVarLJJIJIIJI = nVar2.LJJIJIIJI(str);
                            if (qVarLJJIJIIJI != null) {
                                if (qVarLJJIJIIJI.LL instanceof Boolean) {
                                    if (qVarLJJIJIIJI.LJ()) {
                                        i = 1;
                                    } else {
                                        i = 0;
                                    }
                                    return Integer.valueOf(i);
                                }
                                return Integer.valueOf(qVarLJJIJIIJI.LJIIJJI());
                            }
                            return null;
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            Monitor monitor2 = SettingsManager.INSTANCE.getMonitor();
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("exception: ");
                            sbLIZ.append(e.getMessage());
                            sbLIZ.append(", key: ");
                            sbLIZ.append(str);
                            monitor2.reportException("Normal#parseIntValue", C2188811AlT.LIZIZ(sbLIZ));
                            return null;
                        }
                    }

                    @Override // X.InterfaceC2209451Bdf
                    public final String LJII(n nVar2, String str) {
                        try {
                            k kVarLJJIIZ = nVar2.LJJIIZ(str);
                            if (kVarLJJIIZ != null) {
                                return kVarLJJIIZ.toString();
                            }
                            return null;
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            Monitor monitor2 = SettingsManager.INSTANCE.getMonitor();
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("exception: ");
                            sbLIZ.append(e.getMessage());
                            sbLIZ.append(", key: ");
                            sbLIZ.append(str);
                            monitor2.reportException("Normal#parseCustomTypeValue", C2188811AlT.LIZIZ(sbLIZ));
                            return null;
                        }
                    }

                    @Override // X.InterfaceC2209451Bdf
                    public final Float LJIIIZ(n nVar2, String str) {
                        try {
                            k kVarLJJIIZ = nVar2.LJJIIZ(str);
                            if (kVarLJJIIZ != null) {
                                return Float.valueOf(kVarLJJIIZ.LJIIJ());
                            }
                            return null;
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            Monitor monitor2 = SettingsManager.INSTANCE.getMonitor();
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("exception: ");
                            sbLIZ.append(e.getMessage());
                            sbLIZ.append(", key: ");
                            sbLIZ.append(str);
                            monitor2.reportException("Normal#parseFloatValue", C2188811AlT.LIZIZ(sbLIZ));
                            return null;
                        }
                    }

                    @Override // X.InterfaceC2209451Bdf
                    public final String[] LJIIJJI(n nVar2, String str) {
                        try {
                            k kVarLJJIIZ = nVar2.LJJIIZ(str);
                            if (kVarLJJIIZ != null) {
                                return (String[]) NormalGson.singleton().LIZJ(kVarLJJIIZ, String[].class);
                            }
                            return null;
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            Monitor monitor2 = SettingsManager.INSTANCE.getMonitor();
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("exception: ");
                            sbLIZ.append(e.getMessage());
                            sbLIZ.append(", key: ");
                            sbLIZ.append(str);
                            monitor2.reportException("Normal#parseStringArrayValue", C2188811AlT.LIZIZ(sbLIZ));
                            return null;
                        }
                    }

                    @Override // X.InterfaceC2209451Bdf
                    public final Double LJIILIIL(n nVar2, String str) {
                        try {
                            k kVarLJJIIZ = nVar2.LJJIIZ(str);
                            if (kVarLJJIIZ != null) {
                                return Double.valueOf(kVarLJJIIZ.LJIIIZ());
                            }
                            return null;
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            Monitor monitor2 = SettingsManager.INSTANCE.getMonitor();
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("exception: ");
                            sbLIZ.append(e.getMessage());
                            sbLIZ.append(", key: ");
                            sbLIZ.append(str);
                            monitor2.reportException("Normal#parseDoubleValue", C2188811AlT.LIZIZ(sbLIZ));
                            return null;
                        }
                    }

                    @Override // X.InterfaceC2209451Bdf
                    public final String LJIJJ(n nVar2, String str) {
                        try {
                            k kVarLJJIIZ = nVar2.LJJIIZ(str);
                            if (kVarLJJIIZ != null) {
                                if (kVarLJJIIZ instanceof q) {
                                    return ((q) kVarLJJIIZ).LJIL();
                                }
                                return kVarLJJIIZ.toString();
                            }
                            return null;
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            Monitor monitor2 = SettingsManager.INSTANCE.getMonitor();
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("exception: ");
                            sbLIZ.append(e.getMessage());
                            sbLIZ.append(", key: ");
                            sbLIZ.append(str);
                            monitor2.reportException("Normal#parseStringValue", C2188811AlT.LIZIZ(sbLIZ));
                            return null;
                        }
                    }

                    @Override // X.InterfaceC2209451Bdf
                    public final Long LJIJJLI(n nVar2, String str) {
                        try {
                            k kVarLJJIIZ = nVar2.LJJIIZ(str);
                            if (kVarLJJIIZ != null) {
                                return Long.valueOf(kVarLJJIIZ.LJIIZILJ());
                            }
                            return null;
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            Monitor monitor2 = SettingsManager.INSTANCE.getMonitor();
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("exception: ");
                            sbLIZ.append(e.getMessage());
                            sbLIZ.append(", key: ");
                            sbLIZ.append(str);
                            monitor2.reportException("Normal#parseLongValue", C2188811AlT.LIZIZ(sbLIZ));
                            return null;
                        }
                    }

                    @Override // X.InterfaceC2209451Bdf
                    public final Boolean LJIL(n nVar2, String str) {
                        boolean z2;
                        try {
                            q qVarLJJIJIIJI = nVar2.LJJIJIIJI(str);
                            if (qVarLJJIJIIJI != null) {
                                if (qVarLJJIJIIJI.LL instanceof Number) {
                                    if (qVarLJJIJIIJI.LJIIJJI() != 0) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    return Boolean.valueOf(z2);
                                }
                                return Boolean.valueOf(qVarLJJIJIIJI.LJ());
                            }
                            return null;
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            Monitor monitor2 = SettingsManager.INSTANCE.getMonitor();
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("exception: ");
                            sbLIZ.append(e.getMessage());
                            sbLIZ.append(", key: ");
                            sbLIZ.append(str);
                            monitor2.reportException("Normal#parseBooleanValue", C2188811AlT.LIZIZ(sbLIZ));
                            return null;
                        }
                    }

                    @Override // X.InterfaceC2209451Bdf
                    public final void LIZIZ(Boolean bool, n nVar2, String str) {
                        if (bool != null) {
                            SettingsRepo.INSTANCE.storeBooleanValue(str, bool.booleanValue());
                        } else {
                            if (!this.LIZ) {
                                return;
                            }
                            SettingsRepo.INSTANCE.erase(str);
                        }
                    }

                    @Override // X.InterfaceC2209451Bdf
                    public final void LIZJ(n nVar2, String str, String str2) {
                        if (str2 != null) {
                            SettingsRepo.INSTANCE.storeStringValue(str, str2);
                        } else if (nVar2.LJJIJIIJIL(str)) {
                            SettingsRepo.INSTANCE.storeStringValue(str, null);
                        } else {
                            if (!this.LIZ) {
                                return;
                            }
                            SettingsRepo.INSTANCE.erase(str);
                        }
                    }

                    @Override // X.InterfaceC2209451Bdf
                    public final void LJI(n nVar2, String str, String str2) {
                        if (str2 != null) {
                            SettingsRepo.INSTANCE.storeStringValue(str, str2);
                        } else if (nVar2.LJJIJIIJIL(str)) {
                            SettingsRepo.INSTANCE.storeStringValue(str, null);
                        } else {
                            if (!this.LIZ) {
                                return;
                            }
                            SettingsRepo.INSTANCE.erase(str);
                        }
                    }

                    @Override // X.InterfaceC2209451Bdf
                    public final void LJIIIIZZ(n nVar2, String str, String[] strArr) {
                        if (strArr != null) {
                            SettingsRepo.INSTANCE.storeStringArrayValue(str, strArr);
                        } else if (nVar2.LJJIJIIJIL(str)) {
                            SettingsRepo.INSTANCE.storeStringArrayValue(str, null);
                        } else {
                            if (!this.LIZ) {
                                return;
                            }
                            SettingsRepo.INSTANCE.erase(str);
                        }
                    }

                    @Override // X.InterfaceC2209451Bdf
                    public final void LJIIJ(n nVar2, String str, Float f) {
                        if (f != null) {
                            SettingsRepo.INSTANCE.storeFloatValue(str, f.floatValue());
                        } else {
                            if (!this.LIZ) {
                                return;
                            }
                            SettingsRepo.INSTANCE.erase(str);
                        }
                    }

                    @Override // X.InterfaceC2209451Bdf
                    public final void LJIILJJIL(n nVar2, String str, Long l) {
                        if (l != null) {
                            SettingsRepo.INSTANCE.storeLongValue(str, l.longValue());
                        } else {
                            if (!this.LIZ) {
                                return;
                            }
                            SettingsRepo.INSTANCE.erase(str);
                        }
                    }

                    @Override // X.InterfaceC2209451Bdf
                    public final void LJIILLIIL(Integer num, String str, n nVar2) {
                        if (num != null) {
                            SettingsRepo.INSTANCE.storeIntValue(str, num.intValue());
                        } else {
                            if (!this.LIZ) {
                                return;
                            }
                            SettingsRepo.INSTANCE.erase(str);
                        }
                    }

                    @Override // X.InterfaceC2209451Bdf
                    public final void LJJ(n nVar2, String str, Double d) {
                        if (d != null) {
                            SettingsRepo.INSTANCE.storeDoubleValue(str, d.doubleValue());
                        } else {
                            if (!this.LIZ) {
                                return;
                            }
                            SettingsRepo.INSTANCE.erase(str);
                        }
                    }

                    @Override // X.InterfaceC2209451Bdf
                    public final void LIZ(ScopeValue scopeValue, n nVar2, String str, Double d) {
                        if (d != null) {
                            if (scopeValue != null) {
                                SettingsRepo.INSTANCE.storeDoubleValue(scopeValue, str, d.doubleValue());
                                return;
                            } else {
                                SettingsRepo.INSTANCE.storeDoubleValue(str, d.doubleValue());
                                return;
                            }
                        }
                        if (!this.LIZ) {
                            return;
                        }
                        if (scopeValue != null) {
                            SettingsRepo.INSTANCE.erase(scopeValue, str);
                        } else {
                            SettingsRepo.INSTANCE.erase(str);
                        }
                    }

                    @Override // X.InterfaceC2209451Bdf
                    public final void LIZLLL(ScopeValue scopeValue, n nVar2, String str, String str2) {
                        if (str2 != null) {
                            if (scopeValue != null) {
                                SettingsRepo.INSTANCE.storeStringValue(scopeValue, str, str2);
                                return;
                            } else {
                                SettingsRepo.INSTANCE.storeStringValue(str, str2);
                                return;
                            }
                        }
                        if (nVar2.LJJIJIIJIL(str)) {
                            if (scopeValue != null) {
                                SettingsRepo.INSTANCE.storeStringValue(scopeValue, str, null);
                                return;
                            } else {
                                SettingsRepo.INSTANCE.storeStringValue(str, null);
                                return;
                            }
                        }
                        if (!this.LIZ) {
                            return;
                        }
                        if (scopeValue != null) {
                            SettingsRepo.INSTANCE.erase(scopeValue, str);
                        } else {
                            SettingsRepo.INSTANCE.erase(str);
                        }
                    }

                    @Override // X.InterfaceC2209451Bdf
                    public final void LJ(ScopeValue scopeValue, n nVar2, String str, Integer num) {
                        if (num != null) {
                            if (scopeValue != null) {
                                SettingsRepo.INSTANCE.storeIntValue(scopeValue, str, num.intValue());
                                return;
                            } else {
                                SettingsRepo.INSTANCE.storeIntValue(str, num.intValue());
                                return;
                            }
                        }
                        if (!this.LIZ) {
                            return;
                        }
                        if (scopeValue != null) {
                            SettingsRepo.INSTANCE.erase(scopeValue, str);
                        } else {
                            SettingsRepo.INSTANCE.erase(str);
                        }
                    }

                    @Override // X.InterfaceC2209451Bdf
                    public final void LJIIL(ScopeValue scopeValue, n nVar2, String str, Float f) {
                        if (f != null) {
                            if (scopeValue != null) {
                                SettingsRepo.INSTANCE.storeFloatValue(scopeValue, str, f.floatValue());
                                return;
                            } else {
                                SettingsRepo.INSTANCE.storeFloatValue(str, f.floatValue());
                                return;
                            }
                        }
                        if (!this.LIZ) {
                            return;
                        }
                        if (scopeValue != null) {
                            SettingsRepo.INSTANCE.erase(scopeValue, str);
                        } else {
                            SettingsRepo.INSTANCE.erase(str);
                        }
                    }

                    @Override // X.InterfaceC2209451Bdf
                    public final void LJIILL(ScopeValue scopeValue, n nVar2, String str, Long l) {
                        if (l != null) {
                            if (scopeValue != null) {
                                SettingsRepo.INSTANCE.storeLongValue(scopeValue, str, l.longValue());
                                return;
                            } else {
                                SettingsRepo.INSTANCE.storeLongValue(str, l.longValue());
                                return;
                            }
                        }
                        if (!this.LIZ) {
                            return;
                        }
                        if (scopeValue != null) {
                            SettingsRepo.INSTANCE.erase(scopeValue, str);
                        } else {
                            SettingsRepo.INSTANCE.erase(str);
                        }
                    }

                    @Override // X.InterfaceC2209451Bdf
                    public final void LJIIZILJ(ScopeValue scopeValue, n nVar2, String str, Boolean bool) {
                        if (bool != null) {
                            if (scopeValue != null) {
                                SettingsRepo.INSTANCE.storeBooleanValue(scopeValue, str, bool.booleanValue());
                                return;
                            } else {
                                SettingsRepo.INSTANCE.storeBooleanValue(str, bool.booleanValue());
                                return;
                            }
                        }
                        if (!this.LIZ) {
                            return;
                        }
                        if (scopeValue != null) {
                            SettingsRepo.INSTANCE.erase(scopeValue, str);
                        } else {
                            SettingsRepo.INSTANCE.erase(str);
                        }
                    }

                    @Override // X.InterfaceC2209451Bdf
                    public final void LJIJ(ScopeValue scopeValue, n nVar2, String str, String[] strArr) {
                        if (strArr != null) {
                            if (scopeValue != null) {
                                SettingsRepo.INSTANCE.storeStringArrayValue(scopeValue, str, strArr);
                                return;
                            } else {
                                SettingsRepo.INSTANCE.storeStringArrayValue(str, strArr);
                                return;
                            }
                        }
                        if (nVar2.LJJIJIIJIL(str)) {
                            if (scopeValue != null) {
                                SettingsRepo.INSTANCE.storeStringArrayValue(scopeValue, str, null);
                                return;
                            } else {
                                SettingsRepo.INSTANCE.storeStringArrayValue(str, null);
                                return;
                            }
                        }
                        if (!this.LIZ) {
                            return;
                        }
                        if (scopeValue != null) {
                            SettingsRepo.INSTANCE.erase(scopeValue, str);
                        } else {
                            SettingsRepo.INSTANCE.erase(str);
                        }
                    }

                    @Override // X.InterfaceC2209451Bdf
                    public final void LJIJI(ScopeValue scopeValue, n nVar2, String str, String str2) {
                        if (str2 != null) {
                            if (scopeValue != null) {
                                SettingsRepo.INSTANCE.storeStringValue(scopeValue, str, str2);
                                return;
                            } else {
                                SettingsRepo.INSTANCE.storeStringValue(str, str2);
                                return;
                            }
                        }
                        if (nVar2.LJJIJIIJIL(str)) {
                            if (scopeValue != null) {
                                SettingsRepo.INSTANCE.storeStringValue(scopeValue, str, null);
                                return;
                            } else {
                                SettingsRepo.INSTANCE.storeStringValue(str, null);
                                return;
                            }
                        }
                        if (!this.LIZ) {
                            return;
                        }
                        if (scopeValue != null) {
                            SettingsRepo.INSTANCE.erase(scopeValue, str);
                        } else {
                            SettingsRepo.INSTANCE.erase(str);
                        }
                    }
                };
                this.LIZJ = new InterfaceC2209451Bdf(z) { // from class: X.1Bdc
                    public static final /* synthetic */ int LIZIZ = 0;
                    public final boolean LIZ;

                    {
                        this.LIZ = z;
                    }

                    @Override // X.InterfaceC2209451Bdf
                    public final Integer LJFF(n nVar2, String str) {
                        int i;
                        try {
                            q qVarLJJIJIIJI = nVar2.LJJIJ(str).LJJIJIIJI("val");
                            if (qVarLJJIJIIJI != null) {
                                if (qVarLJJIJIIJI.LL instanceof Boolean) {
                                    if (qVarLJJIJIIJI.LJ()) {
                                        i = 1;
                                    } else {
                                        i = 0;
                                    }
                                    return Integer.valueOf(i);
                                }
                                return Integer.valueOf(qVarLJJIJIIJI.LJIIJJI());
                            }
                            return null;
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            Monitor monitor2 = SettingsManager.INSTANCE.getMonitor();
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("exception: ");
                            sbLIZ.append(e.getMessage());
                            sbLIZ.append(", key: ");
                            sbLIZ.append(str);
                            monitor2.reportException("Precise#parseIntValue", C2188811AlT.LIZIZ(sbLIZ));
                            return null;
                        }
                    }

                    @Override // X.InterfaceC2209451Bdf
                    public final String LJII(n nVar2, String str) {
                        try {
                            k kVarLJJIIZ = nVar2.LJJIJ(str).LJJIIZ("val");
                            if (kVarLJJIIZ != null) {
                                return kVarLJJIIZ.toString();
                            }
                            return null;
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            Monitor monitor2 = SettingsManager.INSTANCE.getMonitor();
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("exception: ");
                            sbLIZ.append(e.getMessage());
                            sbLIZ.append(", key: ");
                            sbLIZ.append(str);
                            monitor2.reportException("Precise#parseCustomTypeValue", C2188811AlT.LIZIZ(sbLIZ));
                            return null;
                        }
                    }

                    @Override // X.InterfaceC2209451Bdf
                    public final Float LJIIIZ(n nVar2, String str) {
                        try {
                            k kVarLJJIIZ = nVar2.LJJIJ(str).LJJIIZ("val");
                            if (kVarLJJIIZ != null) {
                                return Float.valueOf(kVarLJJIIZ.LJIIJ());
                            }
                            return null;
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            Monitor monitor2 = SettingsManager.INSTANCE.getMonitor();
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("exception: ");
                            sbLIZ.append(e.getMessage());
                            sbLIZ.append(", key: ");
                            sbLIZ.append(str);
                            monitor2.reportException("Precise#parseFloatValue", C2188811AlT.LIZIZ(sbLIZ));
                            return null;
                        }
                    }

                    @Override // X.InterfaceC2209451Bdf
                    public final String[] LJIIJJI(n nVar2, String str) {
                        try {
                            k kVarLJJIIZ = nVar2.LJJIJ(str).LJJIIZ("val");
                            if (kVarLJJIIZ != null) {
                                return (String[]) NormalGson.singleton().LIZJ(kVarLJJIIZ, String[].class);
                            }
                            return null;
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            Monitor monitor2 = SettingsManager.INSTANCE.getMonitor();
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("exception: ");
                            sbLIZ.append(e.getMessage());
                            sbLIZ.append(", key: ");
                            sbLIZ.append(str);
                            monitor2.reportException("Precise#parseStringValue", C2188811AlT.LIZIZ(sbLIZ));
                            return null;
                        }
                    }

                    @Override // X.InterfaceC2209451Bdf
                    public final Double LJIILIIL(n nVar2, String str) {
                        try {
                            k kVarLJJIIZ = nVar2.LJJIJ(str).LJJIIZ("val");
                            if (kVarLJJIIZ != null) {
                                return Double.valueOf(kVarLJJIIZ.LJIIIZ());
                            }
                            return null;
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            Monitor monitor2 = SettingsManager.INSTANCE.getMonitor();
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("exception: ");
                            sbLIZ.append(e.getMessage());
                            sbLIZ.append(", key: ");
                            sbLIZ.append(str);
                            monitor2.reportException("Precise#parseDoubleValue", C2188811AlT.LIZIZ(sbLIZ));
                            return null;
                        }
                    }

                    @Override // X.InterfaceC2209451Bdf
                    public final String LJIJJ(n nVar2, String str) {
                        try {
                            k kVarLJJIIZ = nVar2.LJJIJ(str).LJJIIZ("val");
                            if (kVarLJJIIZ != null) {
                                if (kVarLJJIIZ instanceof q) {
                                    return ((q) kVarLJJIIZ).LJIL();
                                }
                                return kVarLJJIIZ.toString();
                            }
                            return null;
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            Monitor monitor2 = SettingsManager.INSTANCE.getMonitor();
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("exception: ");
                            sbLIZ.append(e.getMessage());
                            sbLIZ.append(", key: ");
                            sbLIZ.append(str);
                            monitor2.reportException("Precise#parseStringValue", C2188811AlT.LIZIZ(sbLIZ));
                            return null;
                        }
                    }

                    @Override // X.InterfaceC2209451Bdf
                    public final Long LJIJJLI(n nVar2, String str) {
                        try {
                            k kVarLJJIIZ = nVar2.LJJIJ(str).LJJIIZ("val");
                            if (kVarLJJIIZ != null) {
                                return Long.valueOf(kVarLJJIIZ.LJIIZILJ());
                            }
                            return null;
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            Monitor monitor2 = SettingsManager.INSTANCE.getMonitor();
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("exception: ");
                            sbLIZ.append(e.getMessage());
                            sbLIZ.append(", key: ");
                            sbLIZ.append(str);
                            monitor2.reportException("Precise#parseLongValue", C2188811AlT.LIZIZ(sbLIZ));
                            return null;
                        }
                    }

                    @Override // X.InterfaceC2209451Bdf
                    public final Boolean LJIL(n nVar2, String str) {
                        boolean z2;
                        try {
                            q qVarLJJIJIIJI = nVar2.LJJIJ(str).LJJIJIIJI("val");
                            if (qVarLJJIJIIJI != null) {
                                if (qVarLJJIJIIJI.LL instanceof Number) {
                                    if (qVarLJJIJIIJI.LJIIJJI() != 0) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    return Boolean.valueOf(z2);
                                }
                                return Boolean.valueOf(qVarLJJIJIIJI.LJ());
                            }
                            return null;
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            Monitor monitor2 = SettingsManager.INSTANCE.getMonitor();
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("exception: ");
                            sbLIZ.append(e.getMessage());
                            sbLIZ.append(", key: ");
                            sbLIZ.append(str);
                            monitor2.reportException("Precise#parseBooleanValue", C2188811AlT.LIZIZ(sbLIZ));
                            return null;
                        }
                    }

                    @Override // X.InterfaceC2209451Bdf
                    public final void LIZIZ(Boolean bool, n nVar2, String str) {
                        PreciseExposureManager.INSTANCE.saveKeyVid(nVar2, str);
                        if (bool != null) {
                            SettingsRepo.INSTANCE.storeBooleanValue(str, bool.booleanValue());
                        } else {
                            if (!this.LIZ) {
                                return;
                            }
                            SettingsRepo.INSTANCE.erase(str);
                        }
                    }

                    @Override // X.InterfaceC2209451Bdf
                    public final void LIZJ(n nVar2, String str, String str2) {
                        PreciseExposureManager.INSTANCE.saveKeyVid(nVar2, str);
                        if (str2 != null) {
                            SettingsRepo.INSTANCE.storeStringValue(str, str2);
                        } else if (nVar2.LJJIJIIJIL(str)) {
                            SettingsRepo.INSTANCE.storeStringValue(str, null);
                        } else {
                            if (!this.LIZ) {
                                return;
                            }
                            SettingsRepo.INSTANCE.erase(str);
                        }
                    }

                    @Override // X.InterfaceC2209451Bdf
                    public final void LJI(n nVar2, String str, String str2) {
                        PreciseExposureManager.INSTANCE.saveKeyVid(nVar2, str);
                        if (str2 != null) {
                            SettingsRepo.INSTANCE.storeStringValue(str, str2);
                        } else if (nVar2.LJJIJIIJIL(str)) {
                            SettingsRepo.INSTANCE.storeStringValue(str, null);
                        } else {
                            if (!this.LIZ) {
                                return;
                            }
                            SettingsRepo.INSTANCE.erase(str);
                        }
                    }

                    @Override // X.InterfaceC2209451Bdf
                    public final void LJIIIIZZ(n nVar2, String str, String[] strArr) {
                        PreciseExposureManager.INSTANCE.saveKeyVid(nVar2, str);
                        if (strArr != null) {
                            SettingsRepo.INSTANCE.storeStringArrayValue(str, strArr);
                        } else if (nVar2.LJJIJIIJIL(str)) {
                            SettingsRepo.INSTANCE.storeStringArrayValue(str, null);
                        } else {
                            if (!this.LIZ) {
                                return;
                            }
                            SettingsRepo.INSTANCE.erase(str);
                        }
                    }

                    @Override // X.InterfaceC2209451Bdf
                    public final void LJIIJ(n nVar2, String str, Float f) {
                        PreciseExposureManager.INSTANCE.saveKeyVid(nVar2, str);
                        if (f != null) {
                            SettingsRepo.INSTANCE.storeFloatValue(str, f.floatValue());
                        } else {
                            if (!this.LIZ) {
                                return;
                            }
                            SettingsRepo.INSTANCE.erase(str);
                        }
                    }

                    @Override // X.InterfaceC2209451Bdf
                    public final void LJIILJJIL(n nVar2, String str, Long l) {
                        PreciseExposureManager.INSTANCE.saveKeyVid(nVar2, str);
                        if (l != null) {
                            SettingsRepo.INSTANCE.storeLongValue(str, l.longValue());
                        } else {
                            if (!this.LIZ) {
                                return;
                            }
                            SettingsRepo.INSTANCE.erase(str);
                        }
                    }

                    @Override // X.InterfaceC2209451Bdf
                    public final void LJIILLIIL(Integer num, String str, n nVar2) {
                        PreciseExposureManager.INSTANCE.saveKeyVid(nVar2, str);
                        if (num != null) {
                            SettingsRepo.INSTANCE.storeIntValue(str, num.intValue());
                        } else {
                            if (!this.LIZ) {
                                return;
                            }
                            SettingsRepo.INSTANCE.erase(str);
                        }
                    }

                    @Override // X.InterfaceC2209451Bdf
                    public final void LJJ(n nVar2, String str, Double d) {
                        PreciseExposureManager.INSTANCE.saveKeyVid(nVar2, str);
                        if (d != null) {
                            SettingsRepo.INSTANCE.storeDoubleValue(str, d.doubleValue());
                        } else {
                            if (!this.LIZ) {
                                return;
                            }
                            SettingsRepo.INSTANCE.erase(str);
                        }
                    }

                    @Override // X.InterfaceC2209451Bdf
                    public final void LIZ(ScopeValue scopeValue, n nVar2, String str, Double d) {
                        PreciseExposureManager.INSTANCE.saveKeyVid(nVar2, str);
                        if (d != null) {
                            if (scopeValue != null) {
                                SettingsRepo.INSTANCE.storeDoubleValue(scopeValue, str, d.doubleValue());
                                return;
                            } else {
                                SettingsRepo.INSTANCE.storeDoubleValue(str, d.doubleValue());
                                return;
                            }
                        }
                        if (!this.LIZ) {
                            return;
                        }
                        if (scopeValue != null) {
                            SettingsRepo.INSTANCE.erase(scopeValue, str);
                        } else {
                            SettingsRepo.INSTANCE.erase(str);
                        }
                    }

                    @Override // X.InterfaceC2209451Bdf
                    public final void LIZLLL(ScopeValue scopeValue, n nVar2, String str, String str2) {
                        PreciseExposureManager.INSTANCE.saveKeyVid(nVar2, str);
                        if (str2 != null) {
                            if (scopeValue != null) {
                                SettingsRepo.INSTANCE.storeStringValue(scopeValue, str, str2);
                                return;
                            } else {
                                SettingsRepo.INSTANCE.storeStringValue(str, str2);
                                return;
                            }
                        }
                        if (nVar2.LJJIJIIJIL(str)) {
                            if (scopeValue != null) {
                                SettingsRepo.INSTANCE.storeStringValue(scopeValue, str, null);
                                return;
                            } else {
                                SettingsRepo.INSTANCE.storeStringValue(str, null);
                                return;
                            }
                        }
                        if (!this.LIZ) {
                            return;
                        }
                        if (scopeValue != null) {
                            SettingsRepo.INSTANCE.erase(scopeValue, str);
                        } else {
                            SettingsRepo.INSTANCE.erase(str);
                        }
                    }

                    @Override // X.InterfaceC2209451Bdf
                    public final void LJ(ScopeValue scopeValue, n nVar2, String str, Integer num) {
                        PreciseExposureManager.INSTANCE.saveKeyVid(nVar2, str);
                        if (num != null) {
                            if (scopeValue != null) {
                                SettingsRepo.INSTANCE.storeIntValue(scopeValue, str, num.intValue());
                                return;
                            } else {
                                SettingsRepo.INSTANCE.storeIntValue(str, num.intValue());
                                return;
                            }
                        }
                        if (!this.LIZ) {
                            return;
                        }
                        if (scopeValue != null) {
                            SettingsRepo.INSTANCE.erase(scopeValue, str);
                        } else {
                            SettingsRepo.INSTANCE.erase(str);
                        }
                    }

                    @Override // X.InterfaceC2209451Bdf
                    public final void LJIIL(ScopeValue scopeValue, n nVar2, String str, Float f) {
                        PreciseExposureManager.INSTANCE.saveKeyVid(nVar2, str);
                        if (f != null) {
                            if (scopeValue != null) {
                                SettingsRepo.INSTANCE.storeFloatValue(scopeValue, str, f.floatValue());
                                return;
                            } else {
                                SettingsRepo.INSTANCE.storeFloatValue(str, f.floatValue());
                                return;
                            }
                        }
                        if (!this.LIZ) {
                            return;
                        }
                        if (scopeValue != null) {
                            SettingsRepo.INSTANCE.erase(scopeValue, str);
                        } else {
                            SettingsRepo.INSTANCE.erase(str);
                        }
                    }

                    @Override // X.InterfaceC2209451Bdf
                    public final void LJIILL(ScopeValue scopeValue, n nVar2, String str, Long l) {
                        PreciseExposureManager.INSTANCE.saveKeyVid(nVar2, str);
                        if (l != null) {
                            if (scopeValue != null) {
                                SettingsRepo.INSTANCE.storeLongValue(scopeValue, str, l.longValue());
                                return;
                            } else {
                                SettingsRepo.INSTANCE.storeLongValue(str, l.longValue());
                                return;
                            }
                        }
                        if (!this.LIZ) {
                            return;
                        }
                        if (scopeValue != null) {
                            SettingsRepo.INSTANCE.erase(scopeValue, str);
                        } else {
                            SettingsRepo.INSTANCE.erase(str);
                        }
                    }

                    @Override // X.InterfaceC2209451Bdf
                    public final void LJIIZILJ(ScopeValue scopeValue, n nVar2, String str, Boolean bool) {
                        PreciseExposureManager.INSTANCE.saveKeyVid(nVar2, str);
                        if (bool != null) {
                            if (scopeValue != null) {
                                SettingsRepo.INSTANCE.storeBooleanValue(scopeValue, str, bool.booleanValue());
                                return;
                            } else {
                                SettingsRepo.INSTANCE.storeBooleanValue(str, bool.booleanValue());
                                return;
                            }
                        }
                        if (!this.LIZ) {
                            return;
                        }
                        if (scopeValue != null) {
                            SettingsRepo.INSTANCE.erase(scopeValue, str);
                        } else {
                            SettingsRepo.INSTANCE.erase(str);
                        }
                    }

                    @Override // X.InterfaceC2209451Bdf
                    public final void LJIJ(ScopeValue scopeValue, n nVar2, String str, String[] strArr) {
                        PreciseExposureManager.INSTANCE.saveKeyVid(nVar2, str);
                        if (strArr != null) {
                            if (scopeValue != null) {
                                SettingsRepo.INSTANCE.storeStringArrayValue(scopeValue, str, strArr);
                                return;
                            } else {
                                SettingsRepo.INSTANCE.storeStringArrayValue(str, strArr);
                                return;
                            }
                        }
                        if (nVar2.LJJIJIIJIL(str)) {
                            if (scopeValue != null) {
                                SettingsRepo.INSTANCE.storeStringArrayValue(scopeValue, str, null);
                                return;
                            } else {
                                SettingsRepo.INSTANCE.storeStringArrayValue(str, null);
                                return;
                            }
                        }
                        if (!this.LIZ) {
                            return;
                        }
                        if (scopeValue != null) {
                            SettingsRepo.INSTANCE.erase(scopeValue, str);
                        } else {
                            SettingsRepo.INSTANCE.erase(str);
                        }
                    }

                    @Override // X.InterfaceC2209451Bdf
                    public final void LJIJI(ScopeValue scopeValue, n nVar2, String str, String str2) {
                        PreciseExposureManager.INSTANCE.saveKeyVid(nVar2, str);
                        if (str2 != null) {
                            if (scopeValue != null) {
                                SettingsRepo.INSTANCE.storeStringValue(scopeValue, str, str2);
                                return;
                            } else {
                                SettingsRepo.INSTANCE.storeStringValue(str, str2);
                                return;
                            }
                        }
                        if (nVar2.LJJIJIIJIL(str)) {
                            if (scopeValue != null) {
                                SettingsRepo.INSTANCE.storeStringValue(scopeValue, str, null);
                                return;
                            } else {
                                SettingsRepo.INSTANCE.storeStringValue(str, null);
                                return;
                            }
                        }
                        if (!this.LIZ) {
                            return;
                        }
                        if (scopeValue != null) {
                            SettingsRepo.INSTANCE.erase(scopeValue, str);
                        } else {
                            SettingsRepo.INSTANCE.erase(str);
                        }
                    }
                };
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            /* JADX WARN: Removed duplicated region for block: B:102:0x01d6  */
            /* JADX WARN: Removed duplicated region for block: B:107:0x01e8  */
            /* JADX WARN: Removed duplicated region for block: B:130:0x0249  */
            /* JADX WARN: Removed duplicated region for block: B:135:0x025b  */
            /* JADX WARN: Removed duplicated region for block: B:136:0x025f  */
            /* JADX WARN: Removed duplicated region for block: B:445:0x01ff A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:557:0x0191 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:75:0x0166 A[Catch: Exception -> 0x0177, TryCatch #1 {Exception -> 0x0177, blocks: (B:73:0x0162, B:75:0x0166, B:76:0x0168), top: B:381:0x0162 }] */
            /* JADX WARN: Removed duplicated region for block: B:77:0x0175  */
            /* JADX WARN: Removed duplicated region for block: B:99:0x01ce  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(java.util.List r20, com.google.gson.n r21) {
                /*
                    Method dump skipped, instruction units count: 1704
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C2209411Bdb.LIZ(java.util.List, com.google.gson.n):void");
            }
        }.LIZ(arrayList, nVar);
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return arrayList;
    }

    public final n mergeSeperateSettingConfig(n nVar, n nVar2, List<String> list, boolean z) {
        Set<String> setLJJIJIL;
        Object obj = nVar2;
        if (!z) {
            try {
                Object objLJII = NormalGson.singleton().LJII(getStashRepo().getString("live_setting_increment_config_stash", "{}"), n.class);
                obj = nVar2;
                if (objLJII != null) {
                    if (list != null) {
                        Iterator<String> it2 = list.iterator();
                        while (it2.hasNext()) {
                            ((n) objLJII).LJJIJL(it2.next());
                        }
                    }
                    if (nVar2 != null && (setLJJIJIL = nVar2.LJJIJIL()) != null) {
                        for (String str : setLJJIJIL) {
                            ((n) objLJII).LJJIFFI(str, nVar2.LJJIIZ(str));
                        }
                    }
                    obj = objLJII;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                obj = nVar2;
            }
        }
        n nVar3 = (n) obj;
        if (nVar3 != null) {
            Set<String> setLJJIJIL2 = nVar3.LJJIJIL();
            if (setLJJIJIL2 != null) {
                for (String str2 : setLJJIJIL2) {
                    if (nVar.LJJIIZ(str2) == null) {
                        nVar.LJJIFFI(str2, nVar3.LJJIIZ(str2));
                    }
                }
            }
            INSTANCE.getStashRepo().storeString("live_setting_increment_config_stash", GsonProtectorUtils.toJson(NormalGson.singleton(), (k) obj));
        }
        return nVar;
    }

    public final void updateCacheValueForMock(String str, String str2, String str3, Object obj) {
        if (str != null && obj != null) {
            C2209441Bde c2209441Bde = settingValueCache;
            c2209441Bde.LIZIZ(obj, str);
            if (str3 != null) {
                c2209441Bde.LIZIZ(obj, str3);
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("get settingKey: ");
            sbLIZ.append(str);
            sbLIZ.append(" class name failed, it is null.");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            strLIZIZ.toString();
            throw new IllegalArgumentException(strLIZIZ);
        }
    }
}
