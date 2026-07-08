package com.benchmark.strategy.nativePort;

import X.C1300610jwx;
import X.C1300720jx8;
import X.C2079408Cq;
import X.C212350188e;
import X.C786410Ut5;
import android.os.Bundle;
import com.benchmark.ByteBenchBundle;

/* JADX INFO: loaded from: classes33.dex */
public class BXDataProviderPort {
    private native int native_getDeviceFeature(int i, long j);

    private boolean ifEnableNativeEnvironment() {
        return C2079408Cq.LIZIZ;
    }

    public void clearRepo(int i) {
        ifEnableNativeEnvironment();
    }

    public void closeRepo(int i) {
        ifEnableNativeEnvironment();
    }

    public Boolean deleteRepo(int i) {
        if (!ifEnableNativeEnvironment()) {
            return Boolean.FALSE;
        }
        return Boolean.FALSE;
    }

    public void dumpRepo(int i) {
        ifEnableNativeEnvironment();
    }

    public int init(String str) {
        if (!ifEnableNativeEnvironment()) {
            return -1;
        }
        return 0;
    }

    public void isOpenRuntimeDecision(boolean z) {
        ifEnableNativeEnvironment();
    }

    public void openRepo(int i) {
        ifEnableNativeEnvironment();
    }

    public String getString(int i, String str) {
        if (!ifEnableNativeEnvironment()) {
            return null;
        }
        return C212350188e.LIZJ().LIZIZ(i).LJIIIIZZ(str, "");
    }

    public boolean hasValue(int i, String str) {
        if (!ifEnableNativeEnvironment()) {
            return false;
        }
        return C212350188e.LIZJ().LIZIZ(i).LIZ(str);
    }

    public void storeDeviceFeatureFloat(String str, float f) {
        ifEnableNativeEnvironment();
    }

    public void storeStrategy(int i, String str) {
        ifEnableNativeEnvironment();
    }

    public boolean getBoolean(int i, String str, boolean z) {
        if (!ifEnableNativeEnvironment()) {
            return z;
        }
        return C212350188e.LIZJ().LIZIZ(i).LJFF(str, z);
    }

    public void getDeviceFeature(int i, C1300610jwx[] c1300610jwxArr, Bundle bundle) {
        if (!ifEnableNativeEnvironment()) {
            return;
        }
        ByteBenchBundle byteBenchBundleObtain = ByteBenchBundle.obtain();
        native_getDeviceFeature(i, byteBenchBundleObtain.getHandle());
        for (C1300610jwx c1300610jwx : c1300610jwxArr) {
            int i2 = C1300720jx8.LIZ[c1300610jwx.LIZIZ.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        bundle.putBoolean(c1300610jwx.LIZ, byteBenchBundleObtain.getBool(c1300610jwx.LIZ));
                    }
                } else {
                    C786410Ut5.LJJJI(c1300610jwx.LIZ, byteBenchBundleObtain.getString(c1300610jwx.LIZ), bundle);
                }
            } else {
                bundle.putFloat(c1300610jwx.LIZ, byteBenchBundleObtain.getFloat(c1300610jwx.LIZ));
            }
        }
        byteBenchBundleObtain.recycle();
    }

    public float getFloat(int i, String str, float f) {
        if (!ifEnableNativeEnvironment()) {
            return f;
        }
        return C212350188e.LIZJ().LIZIZ(i).LIZIZ(f, str);
    }

    public int getInt(int i, String str, int i2) {
        if (!ifEnableNativeEnvironment()) {
            return i2;
        }
        return C212350188e.LIZJ().LIZIZ(i).LJIIL(i2, str);
    }

    public long getLong(int i, String str, long j) {
        if (!ifEnableNativeEnvironment()) {
            return j;
        }
        return C212350188e.LIZJ().LIZIZ(i).LJIILIIL(j, str);
    }

    public void storeBoolean(int i, String str, boolean z, boolean z2) {
        ifEnableNativeEnvironment();
    }

    public void storeFloat(int i, String str, boolean z, float f) {
        ifEnableNativeEnvironment();
    }

    public void storeInt(int i, String str, boolean z, int i2) {
        ifEnableNativeEnvironment();
    }

    public void storeLong(int i, String str, boolean z, long j) {
        ifEnableNativeEnvironment();
    }

    public void storeString(int i, String str, boolean z, String str2) {
        ifEnableNativeEnvironment();
    }
}
