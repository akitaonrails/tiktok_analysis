package com.bytedance.android.bytehook;

import X.C08PL;
import X.C0V4J;
import X.C0V4K;
import X.C0V9A;
import X.C0VAO;
import X.C0VAP;
import X.C0VAQ;
import X.C2112108Pf;
import X.InterfaceC2112308Ph;
import android.os.SystemClock;
import com.bytedance.librarian.Librarian;
import com.bytedance.shadowhook.ShadowHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;

/* JADX INFO: loaded from: classes14.dex */
public class ByteHook {
    public static final C0VAO defaultLibLoader = null;
    public static final InterfaceC2112308Ph defaultShadowhookLibLoader = null;
    public static long initCostMs = -1;
    public static int initStatus = 1;
    public static boolean inited;
    public static final int defaultMode = C0V9A.AUTOMATIC.value;
    public static final C08PL defaultShadowhookMode = C08PL.SHARED;

    public static int init() {
        return init(null);
    }

    public static native int nativeAddIgnore(String str);

    public static native String nativeGetArch();

    public static native boolean nativeGetDebug();

    public static native int nativeGetMode();

    public static native boolean nativeGetRecordable();

    public static native String nativeGetRecords(int i);

    public static native String nativeGetVersion();

    public static native int nativeInit(int i, boolean z);

    public static native void nativeSetDebug(boolean z);

    public static native void nativeSetRecordable(boolean z);

    public static String getArch() {
        return initStatus == 0 ? nativeGetArch() : "unknown";
    }

    public static boolean getDebug() {
        if (initStatus == 0) {
            return nativeGetDebug();
        }
        return false;
    }

    public static C0V9A getMode() {
        if (initStatus != 0) {
            return C0V9A.AUTOMATIC;
        }
        C0V9A c0v9a = C0V9A.AUTOMATIC;
        return c0v9a.value != nativeGetMode() ? C0V9A.MANUAL : c0v9a;
    }

    public static boolean getRecordable() {
        if (initStatus == 0) {
            return nativeGetRecordable();
        }
        return false;
    }

    public static String getVersion() {
        return nativeGetVersion();
    }

    public static long getInitCostMs() {
        return initCostMs;
    }

    public static int getInitErrno() {
        return initStatus;
    }

    public static void INVOKESTATIC_com_bytedance_android_bytehook_ByteHook_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(String str) {
        LoadSoLancet.LIZJ(str);
        long jUptimeMillis = SystemClock.uptimeMillis();
        Librarian.LJFF(str);
        LoadSoLancet.LJ(jUptimeMillis, str);
        LoadSoLancet.LIZLLL(jUptimeMillis, str);
        LoadSoLancet.LIZIZ(str);
    }

    public static int addIgnore(String str) {
        int i = initStatus;
        if (i == 0) {
            return nativeAddIgnore(str);
        }
        return i;
    }

    public static String getRecords(C0VAQ... c0vaqArr) {
        if (initStatus == 0) {
            int i = 0;
            for (C0VAQ c0vaq : c0vaqArr) {
                switch (C0VAP.LIZ[c0vaq.ordinal()]) {
                    case 1:
                        i |= 1;
                        break;
                    case 2:
                        i |= 2;
                        break;
                    case 3:
                        i |= 4;
                        break;
                    case 4:
                        i |= 8;
                        break;
                    case 5:
                        i |= 16;
                        break;
                    case 6:
                        i |= 32;
                        break;
                    case 7:
                        i |= 64;
                        break;
                    case 8:
                        i |= 128;
                        break;
                }
            }
            if (i == 0) {
                i = 255;
            }
            return nativeGetRecords(i);
        }
        return null;
    }

    public static synchronized int init(C0V4K c0v4k) {
        if (inited) {
            return initStatus;
        }
        inited = true;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (c0v4k == null) {
            c0v4k = new C0V4J().LIZ();
        }
        C2112108Pf c2112108Pf = new C2112108Pf();
        c2112108Pf.LIZ = c0v4k.LIZJ.value;
        c2112108Pf.LIZIZ = false;
        c2112108Pf.LIZJ = false;
        ShadowHook.init(c2112108Pf.LIZ());
        try {
            INVOKESTATIC_com_bytedance_android_bytehook_ByteHook_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("bytehook");
            try {
                initStatus = nativeInit(c0v4k.LIZ, c0v4k.LIZIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                initStatus = 101;
            }
            initCostMs = System.currentTimeMillis() - jCurrentTimeMillis;
            return initStatus;
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            initStatus = 100;
            initCostMs = System.currentTimeMillis() - jCurrentTimeMillis;
            return initStatus;
        }
    }

    public static void setDebug(boolean z) {
        if (initStatus == 0) {
            nativeSetDebug(z);
        }
    }

    public static void setRecordable(boolean z) {
        if (initStatus == 0) {
            nativeSetRecordable(z);
        }
    }
}
