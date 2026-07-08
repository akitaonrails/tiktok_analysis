package X;

import android.app.KeyguardManager;
import android.content.Context;
import android.hardware.biometrics.BiometricManager;
import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: X.19mw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21642419mw {
    public final InterfaceC1836560xtO LIZ;
    public final BiometricManager LIZIZ;
    public final C21642919n1 LIZJ;

    public final int LIZIZ() {
        C21642919n1 c21642919n1 = this.LIZJ;
        if (c21642919n1 == null) {
            return 1;
        }
        if (c21642919n1.LIZIZ()) {
            return !this.LIZJ.LIZ() ? 11 : 0;
        }
        return 12;
    }

    public C21642419mw(C1836550xtN c1836550xtN) {
        BiometricManager biometricManagerLIZIZ;
        this.LIZ = c1836550xtN;
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            biometricManagerLIZIZ = C21642819n0.LIZIZ(c1836550xtN.LIZ);
        } else {
            biometricManagerLIZIZ = null;
        }
        this.LIZIZ = biometricManagerLIZIZ;
        this.LIZJ = i <= 29 ? new C21642919n1(c1836550xtN.LIZ) : null;
    }

    public final int LIZ(int i) {
        BiometricPrompt.CryptoObject cryptoObjectLIZIZ;
        int i2 = Build.VERSION.SDK_INT;
        int iLIZ = 1;
        if (i2 >= 30) {
            BiometricManager biometricManager = this.LIZIZ;
            if (biometricManager == null) {
                return 1;
            }
            return C21644119nD.LIZ(biometricManager, i);
        }
        if (!C1836530xtL.LIZJ(i)) {
            return -2;
        }
        if (i != 0 && C21642019ms.LIZ(((C1836550xtN) this.LIZ).LIZ) != null) {
            if (C1836530xtL.LIZIZ(i)) {
                KeyguardManager keyguardManagerLIZ = C21642019ms.LIZ(((C1836550xtN) this.LIZ).LIZ);
                if (keyguardManagerLIZ != null && C21642019ms.LIZIZ(keyguardManagerLIZ)) {
                    return 0;
                }
                return 11;
            }
            if (i2 == 29) {
                if ((i & 255) == 255) {
                    BiometricManager biometricManager2 = this.LIZIZ;
                    if (biometricManager2 == null) {
                        return 1;
                    }
                    return C21642819n0.LIZ(biometricManager2);
                }
                Method methodLIZJ = C21642819n0.LIZJ();
                if (methodLIZJ != null && (cryptoObjectLIZIZ = C14BX.LIZIZ(C14BX.LIZ())) != null) {
                    try {
                        Object objInvoke = methodLIZJ.invoke(this.LIZIZ, cryptoObjectLIZIZ);
                        if (objInvoke instanceof Integer) {
                            iLIZ = ((Integer) objInvoke).intValue();
                            return iLIZ;
                        }
                    } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
                BiometricManager biometricManager3 = this.LIZIZ;
                if (biometricManager3 != null) {
                    iLIZ = C21642819n0.LIZ(biometricManager3);
                }
                Context context = ((C1836550xtN) this.LIZ).LIZ;
                String str = Build.MODEL;
                if ((Build.VERSION.SDK_INT < 30 && C20144013rq.LIZ(context, R.array.g, str)) || iLIZ != 0) {
                    return iLIZ;
                }
                KeyguardManager keyguardManagerLIZ2 = C21642019ms.LIZ(((C1836550xtN) this.LIZ).LIZ);
                if (keyguardManagerLIZ2 != null && C21642019ms.LIZIZ(keyguardManagerLIZ2)) {
                    if (LIZIZ() == 0) {
                        return 0;
                    }
                    return -1;
                }
                return LIZIZ();
            }
            if (i2 == 28) {
                if (C21643519n7.LIZ(((C1836550xtN) this.LIZ).LIZ)) {
                    KeyguardManager keyguardManagerLIZ3 = C21642019ms.LIZ(((C1836550xtN) this.LIZ).LIZ);
                    if (keyguardManagerLIZ3 != null && C21642019ms.LIZIZ(keyguardManagerLIZ3)) {
                        if (LIZIZ() == 0) {
                            return 0;
                        }
                        return -1;
                    }
                    return LIZIZ();
                }
                return 12;
            }
            return LIZIZ();
        }
        return 12;
    }
}
