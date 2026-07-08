package com.bytedance.android.live_settings;

import X.C09CT;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes35.dex */
public final class LiveSettingModel {

    @C09CT("cacheNoUpdate")
    public boolean cacheNoUpdate;

    @C09CT("defaultValue")
    public final k defaultValue;

    @C09CT("fieldTypeName")
    public final String fieldTypeName;

    @C09CT("settingsKey")
    public final String settingsKey;

    public final boolean getDefaultBoolean() {
        boolean zLJ = false;
        try {
            k kVar = this.defaultValue;
            if (kVar != null) {
                zLJ = kVar.LJ();
                return zLJ;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return zLJ;
    }

    public final float getDefaultFloat() {
        float fLJIIJ = 0.0f;
        try {
            k kVar = this.defaultValue;
            if (kVar != null) {
                fLJIIJ = kVar.LJIIJ();
                return fLJIIJ;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return fLJIIJ;
    }

    public final int getDefaultInt() {
        int iLJIIJJI = 0;
        try {
            k kVar = this.defaultValue;
            if (kVar != null) {
                iLJIIJJI = kVar.LJIIJJI();
                return iLJIIJJI;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return iLJIIJJI;
    }

    public final double getDefaultDouble() {
        double dLJIIIZ = 0.0d;
        try {
            k kVar = this.defaultValue;
            if (kVar != null) {
                dLJIIIZ = kVar.LJIIIZ();
                return dLJIIIZ;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return dLJIIIZ;
    }

    public final long getDefaultLong() {
        long jLJIIZILJ = 0;
        try {
            k kVar = this.defaultValue;
            if (kVar != null) {
                jLJIIZILJ = kVar.LJIIZILJ();
                return jLJIIZILJ;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return jLJIIZILJ;
    }

    public final String getDefaultString() {
        try {
            k kVar = this.defaultValue;
            if (kVar != null) {
                String strLJIL = kVar.LJIL();
                if (strLJIL != null) {
                    return strLJIL;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return "";
    }

    public int hashCode() {
        return this.settingsKey.hashCode();
    }

    public final boolean getCacheNoUpdate() {
        return this.cacheNoUpdate;
    }

    public final k getDefaultValue() {
        return this.defaultValue;
    }

    public final String getFieldTypeName() {
        return this.fieldTypeName;
    }

    public final String getSettingsKey() {
        return this.settingsKey;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Intrinsics.LJFF(LiveSettingModel.class, obj.getClass())) {
            return Intrinsics.LJFF(this.settingsKey, ((LiveSettingModel) obj).settingsKey);
        }
        return false;
    }

    public final void setCacheNoUpdate(boolean z) {
        this.cacheNoUpdate = z;
    }

    public LiveSettingModel(String str, String str2, k kVar) {
        this.settingsKey = str;
        this.fieldTypeName = str2;
        this.defaultValue = kVar;
    }
}
