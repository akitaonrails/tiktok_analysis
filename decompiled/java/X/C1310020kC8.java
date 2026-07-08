package X;

import android.content.SharedPreferences;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.devtoolwrapper.DevToolLifecycle;
import com.lynx.tasm.LynxEnv;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX INFO: renamed from: X.0kC8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1310020kC8 {
    public static volatile C1310020kC8 LIZJ;
    public SharedPreferences LIZ;
    public volatile boolean LIZIZ;

    public static C1310020kC8 LIZIZ() {
        if (LIZJ == null) {
            synchronized (C1310020kC8.class) {
                try {
                    if (LIZJ == null) {
                        LIZJ = new C1310020kC8();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZJ;
    }

    public static void LIZLLL(String str, boolean z) {
        String str2;
        if (DevToolLifecycle.LIZ().LIZ.ordinal() >= EnumC1310030kC9.INITIALIZED.ordinal()) {
            LynxEnv lynxEnvInst = LynxEnv.inst();
            if (z) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            lynxEnvInst.nativeSetLocalEnv(str, str2);
        }
    }

    public final boolean LIZ(String str, boolean z) {
        SharedPreferences sharedPreferences = this.LIZ;
        if (sharedPreferences != null) {
            return sharedPreferences.getBoolean(str, z);
        }
        return z;
    }

    public final void LIZJ(String str, boolean z) {
        SharedPreferences sharedPreferences = this.LIZ;
        if (sharedPreferences != null) {
            sharedPreferences.edit().putBoolean(str, z).apply();
        }
    }
}
