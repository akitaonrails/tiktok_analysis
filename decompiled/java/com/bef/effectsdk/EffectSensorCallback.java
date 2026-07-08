package com.bef.effectsdk;

/* JADX INFO: loaded from: classes31.dex */
public class EffectSensorCallback {
    public static GetSensorInfo sGetSensorInfo;

    public interface GetSensorInfo {
        boolean onRegister(int i, int i2);

        boolean onSetRate(int i, int i2);

        boolean onUnregister(int i);
    }

    public static void setSensorInfoCallback(GetSensorInfo getSensorInfo) {
        sGetSensorInfo = getSensorInfo;
    }

    public static boolean unregisterStr(int i) {
        GetSensorInfo getSensorInfo = sGetSensorInfo;
        if (getSensorInfo == null) {
            return true;
        }
        return getSensorInfo.onUnregister(i);
    }

    public static boolean registerStr(int i, int i2) {
        GetSensorInfo getSensorInfo = sGetSensorInfo;
        if (getSensorInfo == null) {
            return true;
        }
        return getSensorInfo.onRegister(i, i2);
    }

    public static boolean setRateStr(int i, int i2) {
        GetSensorInfo getSensorInfo = sGetSensorInfo;
        if (getSensorInfo == null) {
            return true;
        }
        return getSensorInfo.onSetRate(i, i2);
    }
}
