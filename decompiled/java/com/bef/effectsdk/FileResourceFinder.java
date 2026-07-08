package com.bef.effectsdk;

/* JADX INFO: loaded from: classes34.dex */
public final class FileResourceFinder implements ResourceFinder {
    public final String mDir;

    public static native long nativeCreateFileResourceFinder(long j, String str);

    @Override // com.bef.effectsdk.ResourceFinder
    public long createNativeMD5ResourceFinder(long j) {
        return 0L;
    }

    @Override // com.bef.effectsdk.ResourceFinder
    public void release(long j) {
    }

    public FileResourceFinder(String str) {
        this.mDir = str;
    }

    @Override // com.bef.effectsdk.ResourceFinder
    public long createNativeResourceFinder(long j) {
        return nativeCreateFileResourceFinder(j, this.mDir);
    }
}
