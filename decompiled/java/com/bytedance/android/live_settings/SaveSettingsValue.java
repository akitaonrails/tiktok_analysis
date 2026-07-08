package com.bytedance.android.live_settings;

import X.C2188811AlT;
import com.bytedance.android.live_settings.repo.OtherRepo;
import com.bytedance.android.live_settings.repo.SettingsRepo;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.q;
import java.util.List;

/* JADX INFO: loaded from: classes35.dex */
public class SaveSettingsValue {
    public static long getLatestSettingsSavedTime() {
        return OtherRepo.INSTANCE.getLongValue("settings_saved_time", 0L);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static void realSave(n nVar, List<LiveSettingModel> list, boolean z) {
        for (LiveSettingModel liveSettingModel : list) {
            PreciseExposureManager preciseExposureManager = PreciseExposureManager.INSTANCE;
            if (preciseExposureManager.isPreciseExposure(liveSettingModel.getSettingsKey())) {
                preciseExposureManager.saveValue(nVar, liveSettingModel, z);
            } else {
                String fieldTypeName = liveSettingModel.getFieldTypeName();
                fieldTypeName.getClass();
                switch (fieldTypeName.hashCode()) {
                    case -1325958191:
                        if (!fieldTypeName.equals("double")) {
                            saveCustomTypeValue(nVar, liveSettingModel.getSettingsKey(), z);
                        } else {
                            saveDoubleValue(nVar, liveSettingModel.getSettingsKey(), z);
                        }
                        break;
                    case 104431:
                        if (!fieldTypeName.equals("int")) {
                            saveCustomTypeValue(nVar, liveSettingModel.getSettingsKey(), z);
                        } else {
                            saveIntValue(nVar, liveSettingModel.getSettingsKey(), z);
                        }
                        break;
                    case 3327612:
                        if (!fieldTypeName.equals("long")) {
                            saveCustomTypeValue(nVar, liveSettingModel.getSettingsKey(), z);
                        } else {
                            saveLongValue(nVar, liveSettingModel.getSettingsKey(), z);
                        }
                        break;
                    case 64711720:
                        if (!fieldTypeName.equals("boolean")) {
                            saveCustomTypeValue(nVar, liveSettingModel.getSettingsKey(), z);
                        } else {
                            saveBooleanValue(nVar, liveSettingModel.getSettingsKey(), z);
                        }
                        break;
                    case 97526364:
                        if (!fieldTypeName.equals("float")) {
                            saveCustomTypeValue(nVar, liveSettingModel.getSettingsKey(), z);
                        } else {
                            saveFloatValue(nVar, liveSettingModel.getSettingsKey(), z);
                        }
                        break;
                    case 1195259493:
                        if (!fieldTypeName.equals("java.lang.String")) {
                            saveCustomTypeValue(nVar, liveSettingModel.getSettingsKey(), z);
                        } else {
                            saveStringValue(nVar, liveSettingModel.getSettingsKey(), z);
                        }
                        break;
                    case 1888107655:
                        if (!fieldTypeName.equals("java.lang.String[]")) {
                            saveCustomTypeValue(nVar, liveSettingModel.getSettingsKey(), z);
                        } else {
                            saveStringArrayValue(nVar, liveSettingModel.getSettingsKey(), z);
                        }
                        break;
                    default:
                        saveCustomTypeValue(nVar, liveSettingModel.getSettingsKey(), z);
                        break;
                }
            }
        }
    }

    public static void save(n nVar, List<LiveSettingModel> list, boolean z) {
        realSave(nVar, list, z);
        OtherRepo.INSTANCE.storeLongValue("settings_saved_time", System.currentTimeMillis());
        PreciseExposureManager.INSTANCE.tryExposeLastExposedVids();
    }

    public static void saveBooleanValue(n nVar, String str, boolean z) {
        boolean z2;
        try {
            q qVarLJJIJIIJI = nVar.LJJIJIIJI(str);
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
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Monitor monitor = SettingsManager.INSTANCE.getMonitor();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("exception: ");
            sbLIZ.append(th.getMessage());
            sbLIZ.append(", key: ");
            sbLIZ.append(str);
            monitor.reportException("SaveSettingsValue#saveBooleanValue", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static void saveCustomTypeValue(n nVar, String str, boolean z) {
        try {
            k kVarLJJIIZ = nVar.LJJIIZ(str);
            if (kVarLJJIIZ != null) {
                SettingsRepo.INSTANCE.storeStringValue(str, kVarLJJIIZ.toString());
            } else if (nVar.LJJIJIIJIL(str)) {
                SettingsRepo.INSTANCE.storeStringValue(str, null);
            } else if (z) {
                SettingsRepo.INSTANCE.erase(str);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Monitor monitor = SettingsManager.INSTANCE.getMonitor();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("exception: ");
            sbLIZ.append(th.getMessage());
            sbLIZ.append(", key: ");
            sbLIZ.append(str);
            monitor.reportException("SaveSettingsValue#saveCustomTypeValue", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static void saveDoubleValue(n nVar, String str, boolean z) {
        try {
            k kVarLJJIIZ = nVar.LJJIIZ(str);
            if (kVarLJJIIZ != null) {
                SettingsRepo.INSTANCE.storeDoubleValue(str, kVarLJJIIZ.LJIIIZ());
            } else if (z) {
                SettingsRepo.INSTANCE.erase(str);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Monitor monitor = SettingsManager.INSTANCE.getMonitor();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("exception: ");
            sbLIZ.append(th.getMessage());
            sbLIZ.append(", key: ");
            sbLIZ.append(str);
            monitor.reportException("SaveSettingsValue#saveDoubleValue", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static void saveFloatValue(n nVar, String str, boolean z) {
        try {
            k kVarLJJIIZ = nVar.LJJIIZ(str);
            if (kVarLJJIIZ != null) {
                SettingsRepo.INSTANCE.storeFloatValue(str, kVarLJJIIZ.LJIIJ());
            } else if (z) {
                SettingsRepo.INSTANCE.erase(str);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Monitor monitor = SettingsManager.INSTANCE.getMonitor();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("exception: ");
            sbLIZ.append(th.getMessage());
            sbLIZ.append(", key: ");
            sbLIZ.append(str);
            monitor.reportException("SaveSettingsValue#saveFloatValue", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static void saveIntValue(n nVar, String str, boolean z) {
        int i;
        try {
            q qVarLJJIJIIJI = nVar.LJJIJIIJI(str);
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
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Monitor monitor = SettingsManager.INSTANCE.getMonitor();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("exception: ");
            sbLIZ.append(th.getMessage());
            sbLIZ.append(", key: ");
            sbLIZ.append(str);
            monitor.reportException("SaveSettingsValue#saveIntValue", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static void saveLongValue(n nVar, String str, boolean z) {
        try {
            k kVarLJJIIZ = nVar.LJJIIZ(str);
            if (kVarLJJIIZ != null) {
                SettingsRepo.INSTANCE.storeLongValue(str, kVarLJJIIZ.LJIIZILJ());
            } else if (z) {
                SettingsRepo.INSTANCE.erase(str);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Monitor monitor = SettingsManager.INSTANCE.getMonitor();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("exception: ");
            sbLIZ.append(th.getMessage());
            sbLIZ.append(", key: ");
            sbLIZ.append(str);
            monitor.reportException("SaveSettingsValue#saveLongValue", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static void saveStringArrayValue(n nVar, String str, boolean z) {
        try {
            k kVarLJJIIZ = nVar.LJJIIZ(str);
            if (kVarLJJIIZ != null) {
                SettingsRepo settingsRepo = SettingsRepo.INSTANCE;
                settingsRepo.storeStringArrayValue(str, (String[]) settingsRepo.getGson().LIZJ(kVarLJJIIZ, String[].class));
            } else if (nVar.LJJIJIIJIL(str)) {
                SettingsRepo.INSTANCE.storeStringArrayValue(str, null);
            } else if (z) {
                SettingsRepo.INSTANCE.erase(str);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Monitor monitor = SettingsManager.INSTANCE.getMonitor();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("exception: ");
            sbLIZ.append(th.getMessage());
            sbLIZ.append(", key: ");
            sbLIZ.append(str);
            monitor.reportException("SaveSettingsValue#saveStringArrayValue", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static void saveStringValue(n nVar, String str, boolean z) {
        try {
            k kVarLJJIIZ = nVar.LJJIIZ(str);
            if (kVarLJJIIZ != null) {
                if (!(kVarLJJIIZ instanceof q)) {
                    SettingsRepo.INSTANCE.storeStringValue(str, kVarLJJIIZ.toString());
                    return;
                } else {
                    SettingsRepo.INSTANCE.storeStringValue(str, kVarLJJIIZ.LJIL());
                    return;
                }
            }
            if (nVar.LJJIJIIJIL(str)) {
                SettingsRepo.INSTANCE.storeStringValue(str, null);
            } else if (z) {
                SettingsRepo.INSTANCE.erase(str);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Monitor monitor = SettingsManager.INSTANCE.getMonitor();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("exception: ");
            sbLIZ.append(th.getMessage());
            sbLIZ.append(", key: ");
            sbLIZ.append(str);
            monitor.reportException("SaveSettingsValue#saveStringValue", C2188811AlT.LIZIZ(sbLIZ));
        }
    }
}
