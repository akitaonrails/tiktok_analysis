package com.bd.cu.fp;

import android.os.SystemClock;
import com.bytedance.librarian.Librarian;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;

/* JADX INFO: loaded from: classes4.dex */
public class NativeUtils {
    public static native byte[] crypt(long j, byte[] bArr);

    public static native long nativeInit(String str);

    public static native void release(long j);

    static {
        INVOKESTATIC_com_bd_cu_fp_NativeUtils_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("fileprotect");
    }

    public static void INVOKESTATIC_com_bd_cu_fp_NativeUtils_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(String str) {
        LoadSoLancet.LIZJ(str);
        long jUptimeMillis = SystemClock.uptimeMillis();
        Librarian.LJFF(str);
        LoadSoLancet.LJ(jUptimeMillis, str);
        LoadSoLancet.LIZLLL(jUptimeMillis, str);
        LoadSoLancet.LIZIZ(str);
    }
}
