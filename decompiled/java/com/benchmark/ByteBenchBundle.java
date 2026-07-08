package com.benchmark;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: loaded from: classes33.dex */
public class ByteBenchBundle {
    public long mHandle;
    public static Queue<ByteBenchBundle> sPools = new ArrayDeque(8);
    public static final Object sPoolSync = new Object();

    private native long nativeCreate();

    private native boolean nativeGetBool(long j, String str);

    private native float nativeGetFloat(long j, String str);

    private native int nativeGetInt(long j, String str);

    private native int[] nativeGetIntArray(long j, String str);

    private native String nativeGetString(long j, String str);

    public static native void nativeRelease(long j);

    public static native void nativeReleaseAll(long[] jArr);

    private native int nativeSetBool(long j, String str, boolean z);

    private native int nativeSetBundle(long j, String str, long j2);

    private native int nativeSetByteArray(long j, String str, byte[] bArr);

    private native int nativeSetDouble(long j, String str, double d);

    private native int nativeSetDoubleArray(long j, String str, double[] dArr);

    private native int nativeSetFloat(long j, String str, float f);

    private native int nativeSetFloatArray(long j, String str, float[] fArr);

    private native int nativeSetHandle(long j, String str, long j2);

    private native int nativeSetInt(long j, String str, int i);

    private native int nativeSetIntArray(long j, String str, int[] iArr);

    private native int nativeSetIntOrigin(long j, String str, int i);

    private native int nativeSetLong(long j, String str, long j2);

    private native int nativeSetString(long j, String str, String str2);

    private native int nativeSetStringArray(long j, String str, String[] strArr);

    public static void cleanAll() {
        synchronized (sPoolSync) {
            try {
                if (!sPools.isEmpty()) {
                    int size = sPools.size();
                    long[] jArr = new long[size];
                    for (int i = 0; i < size; i++) {
                        ByteBenchBundle byteBenchBundlePoll = sPools.poll();
                        jArr[i] = byteBenchBundlePoll.getHandle();
                        byteBenchBundlePoll.mHandle = 0L;
                    }
                    nativeReleaseAll(jArr);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static ByteBenchBundle obtain() {
        ByteBenchBundle byteBenchBundlePoll;
        synchronized (sPoolSync) {
            try {
                byteBenchBundlePoll = !sPools.isEmpty() ? sPools.poll() : new ByteBenchBundle();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return byteBenchBundlePoll;
    }

    public void recycle() {
        synchronized (sPoolSync) {
            try {
                sPools.add(this);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public ByteBenchBundle() {
        this.mHandle = nativeCreate();
    }

    public void finalize() throws Throwable {
        super.finalize();
        long j = this.mHandle;
        if (j != 0) {
            nativeRelease(j);
        }
    }

    public long getHandle() {
        return this.mHandle;
    }

    public ByteBenchBundle(long j) {
        this.mHandle = j;
    }

    public boolean getBool(String str) {
        return nativeGetBool(this.mHandle, str);
    }

    public float getFloat(String str) {
        return nativeGetFloat(this.mHandle, str);
    }

    public int getInt(String str) {
        return nativeGetInt(this.mHandle, str);
    }

    public int[] getIntArray(String str) {
        return nativeGetIntArray(this.mHandle, str);
    }

    public String getString(String str) {
        return nativeGetString(this.mHandle, str);
    }

    public int setBool(String str, boolean z) {
        return nativeSetBool(this.mHandle, str, z);
    }

    public int setBundle(String str, ByteBenchBundle byteBenchBundle) {
        return nativeSetBundle(this.mHandle, str, byteBenchBundle.mHandle);
    }

    public int setByteArray(String str, byte[] bArr) {
        return nativeSetByteArray(this.mHandle, str, bArr);
    }

    public int setDouble(String str, double d) {
        return nativeSetDouble(this.mHandle, str, d);
    }

    public int setDoubleArray(String str, double[] dArr) {
        return nativeSetDoubleArray(this.mHandle, str, dArr);
    }

    public int setFloat(String str, float f) {
        return nativeSetFloat(this.mHandle, str, f);
    }

    public int setFloatArray(String str, float[] fArr) {
        return nativeSetFloatArray(this.mHandle, str, fArr);
    }

    public int setHandle(String str, long j) {
        return nativeSetHandle(this.mHandle, str, j);
    }

    public int setInt(String str, int i) {
        return nativeSetInt(this.mHandle, str, i);
    }

    public int setIntArray(String str, int[] iArr) {
        return nativeSetIntArray(this.mHandle, str, iArr);
    }

    public int setIntOrigin(String str, int i) {
        return nativeSetIntOrigin(this.mHandle, str, i);
    }

    public int setLong(String str, long j) {
        return nativeSetLong(this.mHandle, str, j);
    }

    public int setString(String str, String str2) {
        return nativeSetString(this.mHandle, str, str2);
    }

    public int setStringArray(String str, String[] strArr) {
        return nativeSetStringArray(this.mHandle, str, strArr);
    }
}
