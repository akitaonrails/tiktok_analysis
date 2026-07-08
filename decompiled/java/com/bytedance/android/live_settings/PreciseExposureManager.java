package com.bytedance.android.live_settings;

import X.C13LP;
import X.C13LQ;
import X.C19719612Di;
import X.C2097608Jq;
import X.C2188811AlT;
import com.bytedance.android.live.annotation.CacheLevel;
import com.bytedance.android.live_settings.repo.PreciseExposureRepo;
import com.bytedance.android.live_settings.repo.SettingsRepo;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.q;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes35.dex */
public final class PreciseExposureManager {
    public static final PreciseExposureManager INSTANCE = new PreciseExposureManager();
    public static Map<String, ? extends CacheLevel> preciseSettings = C2097608Jq.LJ();
    public static final ConcurrentHashMap<String, String> keyVidMap = new ConcurrentHashMap<>();
    public static final CopyOnWriteArraySet<String> deletedVids = new CopyOnWriteArraySet<>();
    public static final CopyOnWriteArraySet<String> exposedVids = new CopyOnWriteArraySet<>();
    public static final CopyOnWriteArraySet<String> exposedVidsByUid = new CopyOnWriteArraySet<>();

    public final synchronized void tryExposeLastExposedVids() {
        exposedVidsByUid.clear();
        exposedVids.clear();
        SettingsDataProvider dataProvider = SettingsManager.INSTANCE.getDataProvider();
        if (dataProvider != null) {
            PreciseExposureRepo inatance = PreciseExposureRepo.Companion.getINATANCE();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("exposed_vids_for_current_user_");
            sbLIZ.append(dataProvider.getCurrentUid());
            String[] stringArrayValue = inatance.getStringArrayValue(C2188811AlT.LIZIZ(sbLIZ), new String[0]);
            for (String str : stringArrayValue) {
                if (keyVidMap.values().contains(str)) {
                    exposedVidsByUid.add(str);
                } else {
                    deletedVids.add(str);
                }
            }
            for (String str2 : PreciseExposureRepo.Companion.getINATANCE().getStringArrayValue("exposed_vids", new String[0])) {
                if (keyVidMap.values().contains(str2)) {
                    exposedVids.add(str2);
                } else {
                    deletedVids.add(str2);
                }
            }
            CopyOnWriteArraySet<String> copyOnWriteArraySet = deletedVids;
            String strLJJLIIIJ = C13LP.LJJLIIIJ(copyOnWriteArraySet, ",", null, null, 0, null, null, 62);
            if (strLJJLIIIJ.length() > 0 && (a0.LJJJIL(strLJJLIIIJ) ^ true)) {
                dataProvider.deleteUselessExposedVids(strLJJLIIIJ);
            }
            if (!copyOnWriteArraySet.isEmpty()) {
                CopyOnWriteArraySet<String> copyOnWriteArraySet2 = exposedVidsByUid;
                copyOnWriteArraySet2.removeAll(copyOnWriteArraySet);
                PreciseExposureRepo.Companion companion = PreciseExposureRepo.Companion;
                PreciseExposureRepo inatance2 = companion.getINATANCE();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("exposed_vids_for_current_user_");
                sbLIZ2.append(dataProvider.getCurrentUid());
                inatance2.storeStringArrayValue(C2188811AlT.LIZIZ(sbLIZ2), (String[]) copyOnWriteArraySet2.toArray(new String[0]));
                CopyOnWriteArraySet<String> copyOnWriteArraySet3 = exposedVids;
                copyOnWriteArraySet3.removeAll(copyOnWriteArraySet);
                companion.getINATANCE().storeStringArrayValue("exposed_vids", (String[]) copyOnWriteArraySet3.toArray(new String[0]));
            }
            String strLJJLIIIJ2 = C13LP.LJJLIIIJ(exposedVidsByUid, ",", null, null, 0, null, null, 62);
            if (strLJJLIIIJ2.length() > 0 && (!a0.LJJJIL(strLJJLIIIJ2))) {
                dataProvider.setExposedVidsByUid(strLJJLIIIJ2);
            }
            String strLJJLIIIJ3 = C13LP.LJJLIIIJ(exposedVids, ",", null, null, 0, null, null, 62);
            if (strLJJLIIIJ3.length() > 0 && (!a0.LJJJIL(strLJJLIIIJ3))) {
                dataProvider.setExposedVids(strLJJLIIIJ3);
            }
        }
    }

    public final synchronized void tryExposeLastExposedVidsAfterSwitchAccount() {
        String strLJJJ;
        String strLJJJ2;
        String strLJJLIIIJ;
        String strLJJLIIIJ2;
        SettingsDataProvider dataProvider = SettingsManager.INSTANCE.getDataProvider();
        if (dataProvider != null) {
            CopyOnWriteArraySet<String> copyOnWriteArraySet = exposedVidsByUid;
            if ((!copyOnWriteArraySet.isEmpty()) && (strLJJLIIIJ2 = C13LP.LJJLIIIJ(copyOnWriteArraySet, ",", null, null, 0, null, null, 62)) != null) {
                dataProvider.deleteUselessExposedVids(strLJJLIIIJ2);
            }
            copyOnWriteArraySet.clear();
            CopyOnWriteArraySet<String> copyOnWriteArraySet2 = exposedVids;
            if ((!copyOnWriteArraySet2.isEmpty()) && (strLJJLIIIJ = C13LP.LJJLIIIJ(copyOnWriteArraySet2, ",", null, null, 0, null, null, 62)) != null) {
                dataProvider.deleteUselessExposedVids(strLJJLIIIJ);
            }
            copyOnWriteArraySet2.clear();
            PreciseExposureRepo.Companion companion = PreciseExposureRepo.Companion;
            String[] stringArrayValue = companion.getINATANCE().getStringArrayValue("exposed_vids_for_current_user_" + dataProvider.getCurrentUid(), new String[0]);
            if (stringArrayValue.length != 0 && (strLJJJ2 = C13LQ.LJJJ(stringArrayValue, ",", null, null, null, 62)) != null) {
                dataProvider.setExposedVidsByUid(strLJJJ2);
            }
            C19719612Di.LJJII(copyOnWriteArraySet, stringArrayValue);
            String[] stringArrayValue2 = companion.getINATANCE().getStringArrayValue("exposed_vids", new String[0]);
            if (stringArrayValue2.length != 0 && (strLJJJ = C13LQ.LJJJ(stringArrayValue2, ",", null, null, null, 62)) != null) {
                dataProvider.setExposedVids(strLJJJ);
            }
            C19719612Di.LJJII(copyOnWriteArraySet2, stringArrayValue2);
        }
    }

    private final void deleteUselessVid(String str) {
        PreciseExposureRepo inatance = PreciseExposureRepo.Companion.getINATANCE();
        String stringValue = inatance.getStringValue(str, "");
        if (stringValue.length() > 0) {
            deletedVids.add(stringValue);
        }
        inatance.erase(str);
    }

    public final void appendExposedVid(String str) {
        CacheLevel cacheLevel;
        SettingsDataProvider dataProvider;
        String str2 = keyVidMap.get(str);
        if (str2 == null || (cacheLevel = preciseSettings.get(str)) == null) {
            return;
        }
        if (cacheLevel != CacheLevel.DID) {
            CopyOnWriteArraySet<String> copyOnWriteArraySet = exposedVidsByUid;
            if (copyOnWriteArraySet.add(str2) && (dataProvider = SettingsManager.INSTANCE.getDataProvider()) != null) {
                PreciseExposureRepo inatance = PreciseExposureRepo.Companion.getINATANCE();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("exposed_vids_for_current_user_");
                sbLIZ.append(dataProvider.getCurrentUid());
                inatance.storeStringArrayValue(C2188811AlT.LIZIZ(sbLIZ), (String[]) copyOnWriteArraySet.toArray(new String[0]));
                String strLJJLIIIJ = C13LP.LJJLIIIJ(copyOnWriteArraySet, ",", null, null, 0, null, null, 62);
                if (strLJJLIIIJ.length() > 0 && (!a0.LJJJIL(strLJJLIIIJ))) {
                    dataProvider.setExposedVidsByUid(strLJJLIIIJ);
                    return;
                }
                return;
            }
            return;
        }
        CopyOnWriteArraySet<String> copyOnWriteArraySet2 = exposedVids;
        if (!copyOnWriteArraySet2.add(str2)) {
            return;
        }
        PreciseExposureRepo.Companion.getINATANCE().storeStringArrayValue("exposed_vids", (String[]) copyOnWriteArraySet2.toArray(new String[0]));
        SettingsDataProvider dataProvider2 = SettingsManager.INSTANCE.getDataProvider();
        if (dataProvider2 == null) {
            return;
        }
        String strLJJLIIIJ2 = C13LP.LJJLIIIJ(copyOnWriteArraySet2, ",", null, null, 0, null, null, 62);
        if (strLJJLIIIJ2.length() <= 0 || !(!a0.LJJJIL(strLJJLIIIJ2))) {
            return;
        }
        dataProvider2.setExposedVids(strLJJLIIIJ2);
    }

    public final boolean isPreciseExposure(String str) {
        return preciseSettings.containsKey(str);
    }

    public final boolean isRealPreciseExposure$live_settings_release(String str) {
        return keyVidMap.containsKey(str);
    }

    public final synchronized void savePreciseSettingInfo(Map<String, ? extends CacheLevel> map) {
        preciseSettings = map;
        for (String str : map.keySet()) {
            String stringValue = PreciseExposureRepo.Companion.getINATANCE().getStringValue(str, "");
            if (stringValue.length() > 0) {
                keyVidMap.put(str, stringValue);
            }
        }
    }

    public final void saveKeyVid(n nVar, String str) {
        n nVar2;
        String strLJIL;
        try {
            k kVarLJJIIZ = nVar.LJJIIZ(str);
            if ((kVarLJJIIZ instanceof n) && (nVar2 = (n) kVarLJJIIZ) != null) {
                q qVarLJJIJIIJI = nVar2.LJJIJIIJI("vid");
                if (qVarLJJIJIIJI != null && (strLJIL = qVarLJJIJIIJI.LJIL()) != null) {
                    PreciseExposureRepo.Companion.getINATANCE().storeStringValue(str, strLJIL);
                    keyVidMap.put(str, strLJIL);
                    return;
                } else {
                    INSTANCE.deleteUselessVid(str);
                    return;
                }
            }
            deleteUselessVid(str);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Monitor monitor = SettingsManager.INSTANCE.getMonitor();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("exception: ");
            sbLIZ.append(th.getMessage());
            sbLIZ.append(", key: ");
            sbLIZ.append(str);
            monitor.reportException("PreciseExposureManager#saveKeyVid", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    private final void saveBooleanValue(n nVar, String str, boolean z) {
        n nVar2;
        boolean z2;
        try {
            k kVarLJJIIZ = nVar.LJJIIZ(str);
            if ((kVarLJJIIZ instanceof n) && (nVar2 = (n) kVarLJJIIZ) != null) {
                q qVarLJJIJIIJI = nVar2.LJJIJIIJI("val");
                if (qVarLJJIJIIJI != null) {
                    if (qVarLJJIJIIJI.LL instanceof Number) {
                        SettingsRepo settingsRepo = SettingsRepo.INSTANCE;
                        if (qVarLJJIJIIJI.LJIIJJI() != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        settingsRepo.storeBooleanValue(str, z2);
                        return;
                    }
                    SettingsRepo.INSTANCE.storeBooleanValue(str, qVarLJJIJIIJI.LJ());
                    return;
                }
                if (z) {
                    SettingsRepo.INSTANCE.erase(str);
                    return;
                }
                return;
            }
            SaveSettingsValue.saveBooleanValue(nVar, str, z);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Monitor monitor = SettingsManager.INSTANCE.getMonitor();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("exception: ");
            sbLIZ.append(th.getMessage());
            sbLIZ.append(", key: ");
            sbLIZ.append(str);
            monitor.reportException("PreciseExposureManager#saveBooleanValue", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    private final void saveCustomTypeValue(n nVar, String str, boolean z) {
        n nVar2;
        try {
            k kVarLJJIIZ = nVar.LJJIIZ(str);
            if ((kVarLJJIIZ instanceof n) && (nVar2 = (n) kVarLJJIIZ) != null) {
                k kVarLJJIIZ2 = nVar2.LJJIIZ("val");
                if (kVarLJJIIZ2 != null) {
                    SettingsRepo.INSTANCE.storeStringValue(str, kVarLJJIIZ2.toString());
                    return;
                } else {
                    SaveSettingsValue.saveCustomTypeValue(nVar, str, z);
                    return;
                }
            }
            SaveSettingsValue.saveCustomTypeValue(nVar, str, z);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Monitor monitor = SettingsManager.INSTANCE.getMonitor();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("exception: ");
            sbLIZ.append(th.getMessage());
            sbLIZ.append(", key: ");
            sbLIZ.append(str);
            monitor.reportException("PreciseExposureManager#saveCustomTypeValue", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    private final void saveDoubleValue(n nVar, String str, boolean z) {
        n nVar2;
        try {
            k kVarLJJIIZ = nVar.LJJIIZ(str);
            if ((kVarLJJIIZ instanceof n) && (nVar2 = (n) kVarLJJIIZ) != null) {
                k kVarLJJIIZ2 = nVar2.LJJIIZ("val");
                if (kVarLJJIIZ2 != null) {
                    SettingsRepo.INSTANCE.storeDoubleValue(str, kVarLJJIIZ2.LJIIIZ());
                    return;
                } else {
                    if (z) {
                        SettingsRepo.INSTANCE.erase(str);
                        return;
                    }
                    return;
                }
            }
            SaveSettingsValue.saveDoubleValue(nVar, str, z);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Monitor monitor = SettingsManager.INSTANCE.getMonitor();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("exception: ");
            sbLIZ.append(th.getMessage());
            sbLIZ.append(", key: ");
            sbLIZ.append(str);
            monitor.reportException("PreciseExposureManager#saveDoubleValue", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    private final void saveFloatValue(n nVar, String str, boolean z) {
        n nVar2;
        try {
            k kVarLJJIIZ = nVar.LJJIIZ(str);
            if ((kVarLJJIIZ instanceof n) && (nVar2 = (n) kVarLJJIIZ) != null) {
                k kVarLJJIIZ2 = nVar2.LJJIIZ("val");
                if (kVarLJJIIZ2 != null) {
                    SettingsRepo.INSTANCE.storeFloatValue(str, kVarLJJIIZ2.LJIIJ());
                    return;
                } else {
                    if (z) {
                        SettingsRepo.INSTANCE.erase(str);
                        return;
                    }
                    return;
                }
            }
            SaveSettingsValue.saveFloatValue(nVar, str, z);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Monitor monitor = SettingsManager.INSTANCE.getMonitor();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("exception: ");
            sbLIZ.append(th.getMessage());
            sbLIZ.append(", key: ");
            sbLIZ.append(str);
            monitor.reportException("PreciseExposureManager#saveFloatValue", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    private final void saveIntValue(n nVar, String str, boolean z) {
        n nVar2;
        int i;
        try {
            k kVarLJJIIZ = nVar.LJJIIZ(str);
            if ((kVarLJJIIZ instanceof n) && (nVar2 = (n) kVarLJJIIZ) != null) {
                q qVarLJJIJIIJI = nVar2.LJJIJIIJI("val");
                if (qVarLJJIJIIJI != null) {
                    if (qVarLJJIJIIJI.LL instanceof Boolean) {
                        SettingsRepo settingsRepo = SettingsRepo.INSTANCE;
                        if (qVarLJJIJIIJI.LJ()) {
                            i = 1;
                        } else {
                            i = 0;
                        }
                        settingsRepo.storeIntValue(str, i);
                        return;
                    }
                    SettingsRepo.INSTANCE.storeIntValue(str, qVarLJJIJIIJI.LJIIJJI());
                    return;
                }
                if (z) {
                    SettingsRepo.INSTANCE.erase(str);
                    return;
                }
                return;
            }
            SaveSettingsValue.saveIntValue(nVar, str, z);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Monitor monitor = SettingsManager.INSTANCE.getMonitor();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("exception: ");
            sbLIZ.append(th.getMessage());
            sbLIZ.append(", key: ");
            sbLIZ.append(str);
            monitor.reportException("PreciseExposureManager#saveIntValue", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    private final void saveLongValue(n nVar, String str, boolean z) {
        n nVar2;
        try {
            k kVarLJJIIZ = nVar.LJJIIZ(str);
            if ((kVarLJJIIZ instanceof n) && (nVar2 = (n) kVarLJJIIZ) != null) {
                k kVarLJJIIZ2 = nVar2.LJJIIZ("val");
                if (kVarLJJIIZ2 != null) {
                    SettingsRepo.INSTANCE.storeLongValue(str, kVarLJJIIZ2.LJIIZILJ());
                    return;
                } else {
                    if (z) {
                        SettingsRepo.INSTANCE.erase(str);
                        return;
                    }
                    return;
                }
            }
            SaveSettingsValue.saveLongValue(nVar, str, z);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Monitor monitor = SettingsManager.INSTANCE.getMonitor();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("exception: ");
            sbLIZ.append(th.getMessage());
            sbLIZ.append(", key: ");
            sbLIZ.append(str);
            monitor.reportException("PreciseExposureManager#saveLongValue", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    private final void saveStringArrayValue(n nVar, String str, boolean z) {
        n nVar2;
        try {
            k kVarLJJIIZ = nVar.LJJIIZ(str);
            if ((kVarLJJIIZ instanceof n) && (nVar2 = (n) kVarLJJIIZ) != null) {
                k kVarLJJIIZ2 = nVar2.LJJIIZ("val");
                if (kVarLJJIIZ2 != null) {
                    SettingsRepo settingsRepo = SettingsRepo.INSTANCE;
                    settingsRepo.storeStringArrayValue(str, (String[]) settingsRepo.getGson().LIZJ(kVarLJJIIZ2, String[].class));
                    return;
                } else {
                    SaveSettingsValue.saveStringArrayValue(nVar, str, z);
                    return;
                }
            }
            SaveSettingsValue.saveStringArrayValue(nVar, str, z);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Monitor monitor = SettingsManager.INSTANCE.getMonitor();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("exception: ");
            sbLIZ.append(th.getMessage());
            sbLIZ.append(", key: ");
            sbLIZ.append(str);
            monitor.reportException("PreciseExposureManager#saveStringArrayValue", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    private final void saveStringValue(n nVar, String str, boolean z) {
        n nVar2;
        try {
            k kVarLJJIIZ = nVar.LJJIIZ(str);
            if ((kVarLJJIIZ instanceof n) && (nVar2 = (n) kVarLJJIIZ) != null) {
                k kVarLJJIIZ2 = nVar2.LJJIIZ("val");
                if (kVarLJJIIZ2 != null) {
                    if (!(kVarLJJIIZ2 instanceof q)) {
                        SettingsRepo.INSTANCE.storeStringValue(str, kVarLJJIIZ2.toString());
                        return;
                    } else {
                        SettingsRepo.INSTANCE.storeStringValue(str, ((q) kVarLJJIIZ2).LJIL());
                        return;
                    }
                }
                if (nVar.LJJIJIIJIL(str)) {
                    SettingsRepo.INSTANCE.storeStringValue(str, null);
                    return;
                } else {
                    if (z) {
                        SettingsRepo.INSTANCE.erase(str);
                        return;
                    }
                    return;
                }
            }
            SaveSettingsValue.saveStringValue(nVar, str, z);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Monitor monitor = SettingsManager.INSTANCE.getMonitor();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("exception: ");
            sbLIZ.append(th.getMessage());
            sbLIZ.append(", key: ");
            sbLIZ.append(str);
            monitor.reportException("PreciseExposureManager#saveStringValue", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void saveValue(n nVar, LiveSettingModel liveSettingModel, boolean z) {
        saveKeyVid(nVar, liveSettingModel.getSettingsKey());
        String fieldTypeName = liveSettingModel.getFieldTypeName();
        switch (fieldTypeName.hashCode()) {
            case -1325958191:
                if (fieldTypeName.equals("double")) {
                    saveDoubleValue(nVar, liveSettingModel.getSettingsKey(), z);
                    return;
                }
                break;
            case 104431:
                if (fieldTypeName.equals("int")) {
                    saveIntValue(nVar, liveSettingModel.getSettingsKey(), z);
                    return;
                }
                break;
            case 3327612:
                if (fieldTypeName.equals("long")) {
                    saveLongValue(nVar, liveSettingModel.getSettingsKey(), z);
                    return;
                }
                break;
            case 64711720:
                if (fieldTypeName.equals("boolean")) {
                    saveBooleanValue(nVar, liveSettingModel.getSettingsKey(), z);
                    return;
                }
                break;
            case 97526364:
                if (fieldTypeName.equals("float")) {
                    saveFloatValue(nVar, liveSettingModel.getSettingsKey(), z);
                    return;
                }
                break;
            case 1195259493:
                if (fieldTypeName.equals("java.lang.String")) {
                    saveStringValue(nVar, liveSettingModel.getSettingsKey(), z);
                    return;
                }
                break;
            case 1888107655:
                if (fieldTypeName.equals("java.lang.String[]")) {
                    saveStringArrayValue(nVar, liveSettingModel.getSettingsKey(), z);
                    return;
                }
                break;
        }
        saveCustomTypeValue(nVar, liveSettingModel.getSettingsKey(), z);
    }
}
