package com.bef.effectsdk.game;

import android.os.SystemClock;
import com.bytedance.librarian.Librarian;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class NativeInterface {
    public static final List<String> list;

    public interface NativeMessageListener {
        int nativeOnMsgReceived(long j, long j2, long j3, String str);
    }

    public static native int nativeAddMessageListener(long j, NativeMessageListener nativeMessageListener);

    public static native void nativeCreateHandle(long[] jArr);

    public static native int nativeDestroy(long j);

    public static native int nativeInit(long j, int i, int i2);

    public static native int nativePause(long j);

    public static native int nativePostMessage(long j, long j2, long j3, long j4, String str);

    public static native int nativeProcess(long j, int i, int i2, double d);

    public static native int nativeRemoveMessageListener(long j, NativeMessageListener nativeMessageListener);

    public static native int nativeResume(long j);

    public static native int nativeSetSize(long j, int i, int i2);

    public static native int nativeSetStickerPath(long j, String str);

    public static native int nativeTouchesBegin(long j, int[] iArr, float[] fArr, float[] fArr2);

    public static native int nativeTouchesEnd(long j, int[] iArr, float[] fArr, float[] fArr2);

    public static native int nativeTouchesMove(long j, int[] iArr, float[] fArr, float[] fArr2);

    static {
        List<String> listAsList = Arrays.asList("effect");
        list = listAsList;
        try {
            Iterator<String> it2 = listAsList.iterator();
            while (it2.hasNext()) {
                INVOKESTATIC_com_bef_effectsdk_game_NativeInterface_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(it2.next());
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static void INVOKESTATIC_com_bef_effectsdk_game_NativeInterface_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(String str) {
        LoadSoLancet.LIZJ(str);
        long jUptimeMillis = SystemClock.uptimeMillis();
        Librarian.LJFF(str);
        LoadSoLancet.LJ(jUptimeMillis, str);
        LoadSoLancet.LIZLLL(jUptimeMillis, str);
        LoadSoLancet.LIZIZ(str);
    }

    public static void createHandle(long[] jArr) {
        nativeCreateHandle(jArr);
    }

    public static int destroy(long j) {
        return nativeDestroy(j);
    }

    public static int pause(long j) {
        return nativePause(j);
    }

    public static int resume(long j) {
        return nativeResume(j);
    }

    public static int addMessageListener(long j, NativeMessageListener nativeMessageListener) {
        return nativeAddMessageListener(j, nativeMessageListener);
    }

    public static int removeMessageListener(long j, NativeMessageListener nativeMessageListener) {
        return nativeRemoveMessageListener(j, nativeMessageListener);
    }

    public static int setGameBundlePath(long j, String str) {
        return nativeSetStickerPath(j, str);
    }

    public static int init(long j, int i, int i2) {
        return nativeInit(j, i, i2);
    }

    public static int setSize(long j, int i, int i2) {
        return nativeSetSize(j, i, i2);
    }

    public static int processFrame(long j, int i, int i2, double d) {
        return nativeProcess(j, i, i2, d);
    }

    public static int touchesBegin(long j, int[] iArr, float[] fArr, float[] fArr2) {
        return nativeTouchesBegin(j, iArr, fArr, fArr2);
    }

    public static int touchesEnd(long j, int[] iArr, float[] fArr, float[] fArr2) {
        return nativeTouchesEnd(j, iArr, fArr, fArr2);
    }

    public static int touchesMove(long j, int[] iArr, float[] fArr, float[] fArr2) {
        return nativeTouchesMove(j, iArr, fArr, fArr2);
    }

    public static int postMessage(long j, long j2, long j3, long j4, String str) {
        return nativePostMessage(j, j2, j3, j4, str);
    }
}
