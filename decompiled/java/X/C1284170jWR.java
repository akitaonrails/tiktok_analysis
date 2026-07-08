package X;

import android.graphics.SurfaceTexture;
import android.os.Build;

/* JADX INFO: renamed from: X.0jWR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1284170jWR extends SurfaceTexture {
    public boolean LIZ;

    public C1284170jWR() {
        super(false);
    }

    @Override // android.graphics.SurfaceTexture
    public final synchronized void detachFromGLContext() {
        if (isReleased()) {
            return;
        }
        super.detachFromGLContext();
    }

    @Override // android.graphics.SurfaceTexture
    public final synchronized long getTimestamp() {
        if (isReleased()) {
            return -1L;
        }
        return super.getTimestamp();
    }

    @Override // android.graphics.SurfaceTexture
    public final synchronized void release() {
        if (isReleased()) {
            return;
        }
        super.release();
        this.LIZ = true;
    }

    @Override // android.graphics.SurfaceTexture
    public final synchronized void releaseTexImage() {
        if (isReleased()) {
            return;
        }
        super.releaseTexImage();
    }

    @Override // android.graphics.SurfaceTexture
    public final synchronized void updateTexImage() {
        if (isReleased()) {
            return;
        }
        super.updateTexImage();
    }

    @Override // android.graphics.SurfaceTexture
    public final boolean isReleased() {
        return Build.VERSION.SDK_INT >= 26 ? super.isReleased() : this.LIZ;
    }

    public C1284170jWR(int i) {
        super(i);
    }

    @Override // android.graphics.SurfaceTexture
    public final synchronized void attachToGLContext(int i) {
        if (isReleased()) {
            return;
        }
        super.attachToGLContext(i);
    }

    @Override // android.graphics.SurfaceTexture
    public final synchronized void getTransformMatrix(float[] fArr) {
        if (isReleased()) {
            return;
        }
        super.getTransformMatrix(fArr);
    }

    @Override // android.graphics.SurfaceTexture
    public final synchronized void setDefaultBufferSize(int i, int i2) {
        if (isReleased()) {
            return;
        }
        super.setDefaultBufferSize(i, i2);
    }
}
