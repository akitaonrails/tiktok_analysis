package com.bytedance.android.live.dynamicstrategy.setting;

import X.C2097608Jq;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.mt.protector.impl.string2number.CastDoubleProtector;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes4.dex */
@SettingsKey(preciseExperiment = false, value = "live_epi_server_feature_types")
public final class LiveEpiServerFeatureTypesSetting {
    public static final LiveEpiServerFeatureTypesSetting INSTANCE = new LiveEpiServerFeatureTypesSetting();
    public static final HashMap<String, String> DEFAULT = new HashMap<>();
    public static final Map<String, Class<? extends Object>> typeMap = C2097608Jq.LJIIIIZZ(new Pair("int", Integer.TYPE), new Pair("float", Float.TYPE), new Pair("double", Double.TYPE), new Pair("long", Long.TYPE), new Pair("bool", Boolean.TYPE), new Pair("string", String.class));

    private final HashMap<String, String> getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        HashMap<String, String> map = DEFAULT;
        HashMap<String, String> map2 = (HashMap) settingsManager.getValueSafely("live_epi_server_feature_types", map);
        return map2 != null ? map2 : map;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final Object getValue(Map.Entry<String, String> entry) {
        try {
            String str = getValue().get(entry.getKey());
            if (str != null) {
                String lowerCase = str.toLowerCase(Locale.ROOT);
                switch (lowerCase.hashCode()) {
                    case -1325958191:
                        if (lowerCase.equals("double")) {
                            return Double.valueOf(CastDoubleProtector.parseDouble(entry.getValue()));
                        }
                        break;
                    case -891985903:
                        if (lowerCase.equals("string")) {
                            return entry.getValue();
                        }
                        break;
                    case 104431:
                        if (lowerCase.equals("int")) {
                            return Integer.valueOf(CastIntegerProtector.parseInt(entry.getValue()));
                        }
                        break;
                    case 3029738:
                        if (lowerCase.equals("bool")) {
                            return Boolean.valueOf(Boolean.parseBoolean(entry.getValue()));
                        }
                        break;
                    case 3327612:
                        if (lowerCase.equals("long")) {
                            return Long.valueOf(CastLongProtector.parseLong(entry.getValue()));
                        }
                        break;
                    case 97526364:
                        if (lowerCase.equals("float")) {
                            return Float.valueOf(CastFloatProtector.parseFloat(entry.getValue()));
                        }
                        break;
                    default:
                        return null;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return null;
    }
}
