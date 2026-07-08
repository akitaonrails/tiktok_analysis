package X;

import android.graphics.Matrix;
import com.ss.ttlivestreamer.core.buffer.VideoFrame;

/* JADX INFO: renamed from: X.0jC6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public interface InterfaceC1271560jC6 extends VideoFrame.Buffer {
    long getFence();

    @Override // com.ss.ttlivestreamer.core.buffer.VideoFrame.Buffer
    int getTextureId();

    Matrix getTransformMatrix();

    float[] getTransformMatrixArray();

    EnumC1273550jFJ getType();

    boolean isFenceValid();

    void setTransformMatrix(Matrix matrix);

    void setTransformMatrixArray(float[] fArr);

    void updateExtraData(VideoFrame.IExtraData iExtraData);

    void waitGlFence();
}
