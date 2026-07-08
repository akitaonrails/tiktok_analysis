package com.bef.effectsdk.algorithm;

import android.graphics.Bitmap;
import com.bef.effectsdk.ResourceFinder;

/* JADX INFO: loaded from: classes31.dex */
public class GeneralObjDetector {
    public final int ModelType_kPureDetect = 1;
    public final int ParamType_kDetectShortSideLen = 1;
    public ResourceFinder mFinder;
    public long mFinderHandle;
    public long mNativeHandle;

    private native long nativeCreate();

    private native int nativeDestroy(long j);

    private native int nativeInit(long j, long j2, int i);

    private native int nativeInitWithPath(long j, String str, int i);

    private native GeneralObjDetectResult nativeProcess(long j, Bitmap bitmap, int i);

    private native int nativeSetParamF(long j, int i, float f);

    private native int nativeSetParamS(long j, int i, String str);

    private boolean isFinderHandleValid() {
        return 0 != this.mFinderHandle;
    }

    private boolean isNativeHandleValid() {
        return 0 != this.mNativeHandle;
    }

    public boolean create() {
        this.mNativeHandle = nativeCreate();
        return isNativeHandleValid();
    }

    public void destroy() {
        if (isNativeHandleValid()) {
            nativeDestroy(this.mNativeHandle);
            this.mNativeHandle = 0L;
        }
        if (this.mFinder == null || !isFinderHandleValid()) {
            return;
        }
        this.mFinder.release(this.mFinderHandle);
        this.mFinderHandle = 0L;
    }

    public boolean init(ResourceFinder resourceFinder, int i) {
        if (resourceFinder == null || !isNativeHandleValid()) {
            return false;
        }
        this.mFinder = resourceFinder;
        this.mFinderHandle = resourceFinder.createNativeResourceFinder(this.mNativeHandle);
        if (!isFinderHandleValid()) {
            destroy();
            return false;
        }
        if (nativeInit(this.mNativeHandle, this.mFinderHandle, i) != 0) {
            return false;
        }
        return true;
    }

    public boolean initWithPath(String str, int i) {
        if (str == null || str.length() == 0 || !isNativeHandleValid() || nativeInitWithPath(this.mNativeHandle, str, i) != 0) {
            return false;
        }
        return true;
    }

    public GeneralObjDetectResult process(Bitmap bitmap, int i) {
        if (isNativeHandleValid() && bitmap != null) {
            GeneralObjDetectResult generalObjDetectResultNativeProcess = nativeProcess(this.mNativeHandle, bitmap, i);
            generalObjDetectResultNativeProcess.logData();
            return generalObjDetectResultNativeProcess;
        }
        return new GeneralObjDetectResult();
    }

    public boolean setParamF(int i, float f) {
        if (!isNativeHandleValid() || nativeSetParamF(this.mNativeHandle, i, f) != 0) {
            return false;
        }
        return true;
    }

    public boolean setParamS(int i, String str) {
        if (!isNativeHandleValid() || nativeSetParamS(this.mNativeHandle, i, str) != 0) {
            return false;
        }
        return true;
    }
}
