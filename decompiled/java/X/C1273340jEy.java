package X;

import android.opengl.GLES20;
import android.os.Looper;
import android.view.Surface;
import com.byted.cast.common.api.ISurfaceListener;
import com.bytedance.android.livesdk.dataChannel.PhoneAsCameraSurfaceAvailable;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ttlivestreamer.core.opengl.GLSurface;
import com.ss.ttlivestreamer.core.opengl.GLThreadManager;
import com.ss.ttlivestreamer.core.opengl.GlRenderDrawer;
import javax.microedition.khronos.egl.EGLContext;

/* JADX INFO: renamed from: X.0jEy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1273340jEy implements C0UHD, ISurfaceListener {
    public boolean LL;
    public Surface LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public GLSurface LLILZIL;
    public GlRenderDrawer LLILZLL;
    public BPEAHandler LLIZ;
    public DataChannel LLIZLLLIL;

    public final void surfaceAvailable(Surface surface, int i, int i2) {
        this.LLILLJJLI = surface;
        this.LLILLL = i;
        this.LLILZ = i2;
        DataChannel dataChannel = this.LLIZLLLIL;
        if (dataChannel != null) {
            dataChannel.FQ2(PhoneAsCameraSurfaceAvailable.class);
        }
    }

    @Override // X.C0UHD
    public final void u(EGLContext eGLContext, int i, boolean z, int i2, int i3, long j, float[] fArr, Object... objArr) {
        Looper looperMyLooper;
        Surface surface = this.LLILLJJLI;
        if (surface != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(" onTextureFrameAvailable() width= ");
            sbLIZ.append(this.LLILLL);
            sbLIZ.append(" height= ");
            sbLIZ.append(this.LLILZ);
            C20441214yg.LJIIIZ("GameDualDeviceFrameListener", C2188811AlT.LIZIZ(sbLIZ));
            int i4 = this.LLILLL;
            int i5 = this.LLILZ;
            if (this.LLIZ == null && (looperMyLooper = Looper.myLooper()) != null) {
                this.LLIZ = new BPEAHandler(looperMyLooper);
            }
            GLSurface gLSurface = this.LLILZIL;
            if (gLSurface != null) {
                gLSurface.surfaceDestroy();
            }
            GLSurface gLSurface2 = this.LLILZIL;
            if (gLSurface2 != null) {
                gLSurface2.release();
            }
            GLSurface gLSurface3 = new GLSurface();
            gLSurface3.nativeSurfaceCreate(i4, i5, surface);
            gLSurface3.nativeMakeCurrent();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("createSurface nativeQuerySurfaceWidth() = ");
            sbLIZ2.append(gLSurface3.nativeQuerySurfaceWidth());
            sbLIZ2.append(" nativeQuerySurfaceHeight() = ");
            sbLIZ2.append(gLSurface3.nativeQuerySurfaceHeight());
            sbLIZ2.append(", width = ");
            sbLIZ2.append(i4);
            sbLIZ2.append(",height =");
            sbLIZ2.append(i5);
            C20441214yg.LJIIIZ("GameDualDeviceFrameListener", C2188811AlT.LIZIZ(sbLIZ2));
            this.LLILZIL = gLSurface3;
            if (this.LLILZLL == null) {
                this.LLILZLL = new GlRenderDrawer();
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("createSurface drawer = ");
            sbLIZ3.append(this.LLILZLL);
            sbLIZ3.append(" glSurface = ");
            sbLIZ3.append(this.LLILZIL);
            C20441214yg.LJIIIZ("GameDualDeviceFrameListener", C2188811AlT.LIZIZ(sbLIZ3));
            this.LLILLJJLI = null;
        }
        GLSurface gLSurface4 = this.LLILZIL;
        if (gLSurface4 != null) {
            if (this.LL) {
                gLSurface4.nativeSwapBuffers();
            } else {
                this.LL = true;
            }
            if (z) {
                GlRenderDrawer glRenderDrawer = this.LLILZLL;
                if (glRenderDrawer != null) {
                    glRenderDrawer.drawOes(i, null, fArr, 0, 0, this.LLILLL, this.LLILZ);
                }
                if (GLThreadManager.isNeedFinish()) {
                    GLES20.glFinish();
                    return;
                }
            } else {
                GlRenderDrawer glRenderDrawer2 = this.LLILZLL;
                if (glRenderDrawer2 != null) {
                    glRenderDrawer2.drawRgb(i, null, fArr, 0, 0, this.LLILLL, this.LLILZ);
                }
            }
            GLES20.glFlush();
        }
    }

    @Override // X.C0UHD
    public final void LLLLZLL(EGLContext eGLContext, int i, boolean z, InterfaceC1272490jDb interfaceC1272490jDb, int i2, int i3, long j, float[] fArr, long j2, Object... objArr) {
        u(eGLContext, i, z, i2, i3, j, fArr, objArr);
    }
}
