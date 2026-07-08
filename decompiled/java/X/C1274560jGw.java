package X;

import Y.ARunnableS120S0100000_20;
import Y.ARunnableS7S0102000_20;
import android.graphics.Matrix;
import android.opengl.GLES20;
import android.os.Bundle;
import android.os.Handler;
import android.util.AndroidRuntimeException;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttlivestreamer.core.buffer.SurfaceTextureHelper;
import com.ss.ttlivestreamer.core.buffer.VideoFrame;
import com.ss.ttlivestreamer.core.buffer.k;
import com.ss.ttlivestreamer.core.opengl.GlRenderDrawer;
import com.ss.ttlivestreamer.core.opengl.GlUtil;
import com.ss.ttlivestreamer.core.utils.AVLog;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0jGw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1274560jGw implements InterfaceC1275190jHx {
    public final C1273190jEj LIZ;
    public final String LIZIZ;
    public final Handler LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final int[] LJFF = {0, 0, 0};
    public C1271390jBp LJI;
    public GlRenderDrawer LJII;
    public ByteBuffer LJIIIIZZ;
    public float[] LJIIIZ;
    public int LJIIJ;
    public int LJIIJJI;
    public final C1274480jGo LJIIL;
    public volatile boolean LJIILIIL;

    @Override // X.InterfaceC1275190jHx
    public final /* synthetic */ InterfaceC1274490jGp LIZJ() {
        return null;
    }

    @Override // X.InterfaceC1275190jHx
    public final long getLatestRenderCostMs() {
        return 0L;
    }

    @Override // X.InterfaceC1275190jHx
    public final /* synthetic */ void setCornerRadius(float f) {
    }

    @Override // X.InterfaceC1275190jHx
    public final /* synthetic */ void setRenderTargetWindow(View view) {
    }

    public final void LJIIIZ() {
        int[] iArr = this.LJFF;
        if (iArr[0] > 0) {
            GLES20.glDeleteTextures(iArr.length, iArr, 0);
            int i = 0;
            while (true) {
                int[] iArr2 = this.LJFF;
                if (i >= iArr2.length) {
                    break;
                }
                iArr2[i] = 0;
                i++;
            }
        }
        GlRenderDrawer glRenderDrawer = this.LJII;
        if (glRenderDrawer != null) {
            glRenderDrawer.release();
            this.LJII = null;
        }
        C1271390jBp c1271390jBp = this.LJI;
        if (c1271390jBp != null) {
            c1271390jBp.LIZJ();
            this.LJI = null;
        }
        this.LJIIIIZZ = null;
        this.LJIIIZ = null;
        this.LJIIJ = 0;
        this.LJIIJJI = 0;
    }

    @Override // X.InterfaceC1275190jHx
    public final void release() {
        if (this.LJIILIIL) {
            return;
        }
        this.LJIILIIL = true;
        Handler handler = this.LIZJ;
        if (handler != null) {
            C1283100jUi.LIZIZ(handler, new ARunnableS120S0100000_20(this, 466));
        } else {
            LJIIIZ();
        }
    }

    public final boolean LJFF(int i, int i2) {
        Handler handler = this.LIZJ;
        if (handler == null) {
            return false;
        }
        if (this.LJIIJ == i && this.LJIIJJI == i2 && this.LJI != null && this.LJII != null && this.LJFF[0] > 0) {
            return true;
        }
        try {
            C1283100jUi.LIZIZ(handler, new ARunnableS7S0102000_20(i, this, i2, 13));
            if (this.LJIIJ != i || this.LJIIJJI != i2 || this.LJI == null || this.LJII == null || this.LJFF[0] <= 0) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            AVLog.ioe("LyraxSingleViewRenderProcessor", "ensureTextureDrawer error", th);
            if (C786410Ut5.u3() == handler.getLooper().getThread()) {
                LJIIIZ();
                return false;
            }
            Handler handler2 = this.LIZJ;
            if (handler2 != null) {
                C1283100jUi.LIZIZ(handler2, new ARunnableS120S0100000_20(this, 466));
                return false;
            }
            LJIIIZ();
            return false;
        }
    }

    public static final int LJII(int i, int i2, int i3) {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        GLES20.glActiveTexture(i);
        GLES20.glBindTexture(3553, iArr[0]);
        GLES20.glTexParameterf(3553, 10241, GlUtil.getFilterType(9729));
        GLES20.glTexParameterf(3553, 10240, GlUtil.getFilterType(9729));
        GLES20.glTexParameterf(3553, 10242, 33071.0f);
        GLES20.glTexParameterf(3553, 10243, 33071.0f);
        GLES20.glTexImage2D(3553, 0, 6409, i2, i3, 0, 6409, 5121, null);
        return iArr[0];
    }

    public final void LJIIJ(int i, int i2, int i3, long j) {
        if (this.LJIILIIL) {
            return;
        }
        Matrix matrix = new Matrix();
        matrix.preTranslate(0.5f, 0.5f);
        matrix.preScale(1.0f, -1.0f);
        matrix.preTranslate(-0.5f, -0.5f);
        k kVar = new k(i2, i3, EnumC1273550jFJ.RGB, i, matrix, (SurfaceTextureHelper) null, (Runnable) null);
        if (this.LIZLLL) {
            kVar.setTransformMatrixArray(C1267770j5z.LIZ);
        }
        VideoFrame videoFrame = new VideoFrame(kVar, 0, j);
        try {
            C1273190jEj c1273190jEj = this.LIZ;
            Bundle bundle = new Bundle();
            String str = this.LIZIZ;
            if (str != null) {
                C786410Ut5.LJJJI("stream_id", str, bundle);
            }
            c1273190jEj.onData(videoFrame, bundle);
        } finally {
            try {
            } catch (Throwable th) {
            }
        }
        videoFrame.release();
    }

    public static final void LJ(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, int i3) {
        for (int i4 = 0; i4 < i2; i4++) {
            byteBuffer.limit(byteBuffer.position() + i);
            byteBuffer2.put(byteBuffer);
            if (i3 > i) {
                byteBuffer2.position((byteBuffer2.position() + i3) - i);
            }
        }
    }

    public C1274560jGw(Handler handler, C1273190jEj c1273190jEj, String str, boolean z, boolean z2, boolean z3, C1269300j8S c1269300j8S) {
        this.LIZ = c1273190jEj;
        this.LIZIZ = str;
        this.LIZJ = handler;
        this.LIZLLL = z;
        this.LJ = z3;
        this.LJIIL = new C1274480jGo("LyraxSingleViewRenderProcessor", z2, z3, c1269300j8S);
    }

    public final boolean LJIIIIZZ(Handler handler, final ByteBuffer[] byteBufferArr, final int[] iArr, final int i, final int i2, final EnumC1274530jGt enumC1274530jGt, final int i3) {
        Handler handler2;
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        try {
        } catch (Throwable th) {
            th = th;
        }
        try {
            C1283100jUi.LIZIZ(handler, new Runnable() { // from class: X.0jGy
                @Override // java.lang.Runnable
                public final void run() {
                    int i4;
                    int iLIZIZ;
                    int iGlGetError;
                    ByteBuffer byteBufferSlice;
                    ByteBuffer byteBufferSlice2;
                    ByteBuffer byteBufferSlice3;
                    C1274560jGw c1274560jGw = this.LL;
                    EnumC1274530jGt enumC1274530jGt2 = enumC1274530jGt;
                    int i5 = i;
                    ByteBuffer[] byteBufferArr2 = byteBufferArr;
                    int i6 = i2;
                    int[] iArr2 = iArr;
                    int i7 = i3;
                    AtomicBoolean atomicBoolean2 = atomicBoolean;
                    c1274560jGw.getClass();
                    C1C7U.LIZ("LyraxSingleViewRenderProcessor@ac26.loadYuvAndDraw$1L");
                    try {
                        if (!c1274560jGw.LJIILIIL && enumC1274530jGt2 == EnumC1274530jGt.PIXEL_FORMAT_I420 && c1274560jGw.LJI != null && c1274560jGw.LJII != null) {
                            int[] iArr3 = c1274560jGw.LJFF;
                            if (iArr3[0] > 0) {
                                int i8 = (((i5 + 8) - 1) / 8) * 8;
                                try {
                                    if (byteBufferArr2.length == 1) {
                                        ByteBuffer byteBuffer = byteBufferArr2[0];
                                        if (byteBuffer != null) {
                                            int i9 = i5 * i6;
                                            int i10 = i9 * 3;
                                            if (byteBuffer.capacity() >= i10 / 2) {
                                                if (i8 == i5 && byteBuffer.isDirect()) {
                                                    byteBuffer.position(0);
                                                    byteBuffer.limit(i9);
                                                    byteBufferSlice = byteBuffer.slice();
                                                    byteBuffer.position(i9);
                                                    int i11 = i9 * 5;
                                                    byteBuffer.limit(i11 / 4);
                                                    byteBufferSlice2 = byteBuffer.slice();
                                                    byteBuffer.position(i11 / 4);
                                                    byteBuffer.limit(i10 / 2);
                                                    byteBufferSlice3 = byteBuffer.slice();
                                                } else {
                                                    int i12 = i8 * i6;
                                                    int i13 = i12 * 3;
                                                    int i14 = i13 / 2;
                                                    ByteBuffer byteBuffer2 = c1274560jGw.LJIIIIZZ;
                                                    if (byteBuffer2 == null || byteBuffer2.capacity() < i14) {
                                                        c1274560jGw.LJIIIIZZ = ByteBuffer.allocateDirect(i14);
                                                    }
                                                    byteBuffer.position(0);
                                                    c1274560jGw.LJIIIIZZ.position(0);
                                                    c1274560jGw.LJIIIIZZ.limit(i12);
                                                    byteBufferSlice = c1274560jGw.LJIIIIZZ.slice();
                                                    C1274560jGw.LJ(byteBuffer, i5, byteBufferSlice, i6, i8);
                                                    byteBufferSlice.position(0);
                                                    c1274560jGw.LJIIIIZZ.position(i12);
                                                    int i15 = i12 * 5;
                                                    c1274560jGw.LJIIIIZZ.limit(i15 / 4);
                                                    ByteBuffer byteBufferSlice4 = c1274560jGw.LJIIIIZZ.slice();
                                                    byteBufferSlice2 = byteBufferSlice4;
                                                    C1274560jGw.LJ(byteBuffer, i5 / 2, byteBufferSlice4, i6 / 2, i8 / 2);
                                                    byteBufferSlice4.position(0);
                                                    c1274560jGw.LJIIIIZZ.position(i15 / 4);
                                                    c1274560jGw.LJIIIIZZ.limit(i13 / 2);
                                                    byteBufferSlice3 = c1274560jGw.LJIIIIZZ.slice();
                                                    C1274560jGw.LJ(byteBuffer, i5 / 2, byteBufferSlice3, i6 / 2, i8 / 2);
                                                    byteBufferSlice3.position(0);
                                                }
                                                iLIZIZ = c1274560jGw.LJIIL.LIZIZ(c1274560jGw.LJFF, new ByteBuffer[]{byteBufferSlice, byteBufferSlice2, byteBufferSlice3}, null, i8, i6);
                                                i4 = i8;
                                            }
                                        }
                                        C1C7U.LIZIZ("LyraxSingleViewRenderProcessor@ac26.loadYuvAndDraw$1L");
                                        return;
                                    }
                                    i4 = i8;
                                    iLIZIZ = c1274560jGw.LJIIL.LIZIZ(iArr3, byteBufferArr2, iArr2, i8, i6);
                                    if (iLIZIZ != 0) {
                                        C1C7U.LIZIZ("LyraxSingleViewRenderProcessor@ac26.loadYuvAndDraw$1L");
                                        return;
                                    }
                                    c1274560jGw.LJI.LIZLLL(i5, i6);
                                    GLES20.glBindFramebuffer(36160, c1274560jGw.LJI.LIZ);
                                    if (c1274560jGw.LJIIIZ == null) {
                                        float[] fArrLJ = C1273010jER.LJ();
                                        c1274560jGw.LJIIIZ = fArrLJ;
                                        if (i8 != i5) {
                                            android.opengl.Matrix.orthoM(fArrLJ, 0, -1.0f, ((((i5 * 1.0f) - 0.45f) / i4) * 2.0f) - 1.0f, -1.0f, 1.0f, 1.0f, -1.0f);
                                        }
                                    }
                                    c1274560jGw.LJII.drawYuv(c1274560jGw.LJFF, c1274560jGw.LJIIIZ, C1273010jER.LJ(), 0, 0, i5, i6, i7);
                                    if (c1274560jGw.LJ && (iGlGetError = GLES20.glGetError()) != 0) {
                                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                                        sbLIZ.append("drawYuv GLES error:");
                                        sbLIZ.append(iGlGetError);
                                        AVLog.logKibana(6, "LyraxSingleViewRenderProcessor", C2188811AlT.LIZIZ(sbLIZ), null);
                                    }
                                    GLES20.glFinish();
                                    GLES20.glBindFramebuffer(36160, 0);
                                    atomicBoolean2.set(true);
                                    C1C7U.LIZIZ("LyraxSingleViewRenderProcessor@ac26.loadYuvAndDraw$1L");
                                    return;
                                } catch (Throwable th2) {
                                    th = th2;
                                    TryCatchGuardChecker.doCheck(th);
                                    AVLog.ioe("LyraxSingleViewRenderProcessor", "loadYuvAndDraw error", th);
                                    c1274560jGw.LJIIIZ();
                                    C1C7U.LIZIZ("LyraxSingleViewRenderProcessor@ac26.loadYuvAndDraw$1L");
                                    return;
                                }
                            }
                        }
                        C1C7U.LIZIZ("LyraxSingleViewRenderProcessor@ac26.loadYuvAndDraw$1L");
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
            });
        } catch (Throwable th2) {
            th = th2;
            TryCatchGuardChecker.doCheck(th);
            AVLog.ioe("LyraxSingleViewRenderProcessor", "loadYuvAndDraw invoke error", th);
            if (C786410Ut5.u3() != handler.getLooper().getThread() && (handler2 = this.LIZJ) != null) {
                C1283100jUi.LIZIZ(handler2, new ARunnableS120S0100000_20(this, 466));
            } else {
                LJIIIZ();
            }
        }
        return atomicBoolean.get();
    }

    public final void LJI(ByteBuffer[] byteBufferArr, int[] iArr, EnumC1274530jGt enumC1274530jGt, int i, int i2, int i3, long j, C1271970jCl c1271970jCl) {
        if (this.LJIILIIL) {
            return;
        }
        if (byteBufferArr != null && byteBufferArr.length != 0) {
            if (byteBufferArr.length == 1) {
                ByteBuffer byteBuffer = byteBufferArr[0];
                if (byteBuffer == null) {
                    AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException("BUG!");
                    C1274070jG9 c1274070jG9 = C1274080jGA.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("LyraxSingleViewRenderProcessor.");
                    sbLIZ.append("forwardByteBufferFrameToMixManager");
                    sbLIZ.append(":buffer0_null");
                    c1274070jG9.LIZ(C2188811AlT.LIZIZ(sbLIZ), androidRuntimeException);
                    if (C1274040jG6.LIZ()) {
                        throw androidRuntimeException;
                    }
                    return;
                }
                if (byteBuffer.capacity() < ((i2 * i3) * 3) / 2) {
                    return;
                }
            } else if (byteBufferArr.length >= 3 && (byteBufferArr[0] == null || byteBufferArr[1] == null || byteBufferArr[2] == null)) {
                AndroidRuntimeException androidRuntimeException2 = new AndroidRuntimeException("BUG!");
                C1274070jG9 c1274070jG92 = C1274080jGA.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("LyraxSingleViewRenderProcessor.");
                sbLIZ2.append("forwardByteBufferFrameToMixManager");
                sbLIZ2.append(":plane_null");
                c1274070jG92.LIZ(C2188811AlT.LIZIZ(sbLIZ2), androidRuntimeException2);
                if (C1274040jG6.LIZ()) {
                    throw androidRuntimeException2;
                }
                return;
            }
            if (enumC1274530jGt != EnumC1274530jGt.PIXEL_FORMAT_I420) {
                AndroidRuntimeException androidRuntimeException3 = new AndroidRuntimeException("BUG!");
                C1274070jG9 c1274070jG93 = C1274080jGA.LIZ;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("LyraxSingleViewRenderProcessor.");
                sbLIZ3.append("forwardByteBufferFrameToMixManager");
                c1274070jG93.LIZ(C2188811AlT.LIZIZ(sbLIZ3), androidRuntimeException3);
                if (C1274040jG6.LIZ()) {
                    throw androidRuntimeException3;
                }
                return;
            }
            Handler handler = this.LIZJ;
            if (handler == null) {
                return;
            }
            com.ss.bytertc.engine.video.VideoFrame videoFrame = c1271970jCl.LIZ;
            if (videoFrame != null) {
                videoFrame.retain();
            }
            try {
                if (!LJFF(i2, i3)) {
                    c1271970jCl.LIZ();
                    return;
                }
                if (!LJIIIIZZ(handler, byteBufferArr, iArr, i2, i3, enumC1274530jGt, i)) {
                    c1271970jCl.LIZ();
                    return;
                }
                C1271390jBp c1271390jBp = this.LJI;
                if (c1271390jBp != null) {
                    LJIIJ(c1271390jBp.LIZIZ, i2, i3, j);
                }
                c1271970jCl.LIZ();
                return;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c1271970jCl.LIZ();
                throw th;
            }
        }
        AndroidRuntimeException androidRuntimeException4 = new AndroidRuntimeException("BUG!");
        C1274070jG9 c1274070jG94 = C1274080jGA.LIZ;
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("LyraxSingleViewRenderProcessor.");
        sbLIZ4.append("forwardByteBufferFrameToMixManager");
        sbLIZ4.append(":buffers_null_or_empty");
        c1274070jG94.LIZ(C2188811AlT.LIZIZ(sbLIZ4), androidRuntimeException4);
        if (C1274040jG6.LIZ()) {
            throw androidRuntimeException4;
        }
    }

    @Override // X.InterfaceC1275190jHx
    public final void LIZLLL(final int i, final int i2, final int i3, int i4, int i5, final long j, EnumC1274530jGt enumC1274530jGt, final C1274550jGv c1274550jGv, RunnableC1275220jI0 runnableC1275220jI0, Map map, final float[] fArr) {
        if (!this.LJIILIIL) {
            if (enumC1274530jGt == EnumC1274530jGt.TEXTURE_OES) {
                Handler handler = this.LIZJ;
                if (handler != null) {
                    c1274550jGv.retain();
                    if (!C786410Ut5.LJJZZIII(handler, new Runnable() { // from class: X.0jH0
                        @Override // java.lang.Runnable
                        public final void run() {
                            C1274560jGw c1274560jGw = this.LL;
                            InterfaceC1272490jDb interfaceC1272490jDb = c1274550jGv;
                            int i6 = i2;
                            int i7 = i3;
                            float[] fArr2 = fArr;
                            int i8 = i;
                            long j2 = j;
                            c1274560jGw.getClass();
                            C1C7U.LIZ("LyraxSingleViewRenderProcessor@ac26.forwardTextureFrameToMixManager$1L");
                            if (c1274560jGw.LJIILIIL) {
                                if (interfaceC1272490jDb != null) {
                                    interfaceC1272490jDb.release();
                                }
                                C1C7U.LIZIZ("LyraxSingleViewRenderProcessor@ac26.forwardTextureFrameToMixManager$1L");
                                return;
                            }
                            if (!c1274560jGw.LJFF(i6, i7)) {
                                if (interfaceC1272490jDb != null) {
                                    interfaceC1272490jDb.release();
                                }
                                C1C7U.LIZIZ("LyraxSingleViewRenderProcessor@ac26.forwardTextureFrameToMixManager$1L");
                                return;
                            }
                            C1271390jBp c1271390jBp = c1274560jGw.LJI;
                            GlRenderDrawer glRenderDrawer = c1274560jGw.LJII;
                            if (c1271390jBp == null || glRenderDrawer == null) {
                                if (interfaceC1272490jDb != null) {
                                    interfaceC1272490jDb.release();
                                }
                                C1C7U.LIZIZ("LyraxSingleViewRenderProcessor@ac26.forwardTextureFrameToMixManager$1L");
                                return;
                            }
                            try {
                                Matrix matrixLIZJ = fArr2 != null ? C1273010jER.LIZJ(0, fArr2) : new Matrix();
                                matrixLIZJ.preTranslate(0.5f, 0.5f);
                                matrixLIZJ.preScale(1.0f, -1.0f);
                                matrixLIZJ.preTranslate(-0.5f, -0.5f);
                                c1271390jBp.LIZLLL(i6, i7);
                                GLES20.glBindFramebuffer(36160, c1271390jBp.LIZ);
                                glRenderDrawer.drawOes(i8, null, C1273010jER.LIZIZ(matrixLIZJ), 0, 0, i6, i7);
                                GLES20.glFinish();
                                GLES20.glBindFramebuffer(36160, 0);
                                c1274560jGw.LJIIJ(c1271390jBp.LIZIZ, i6, i7, j2);
                            } catch (Throwable th) {
                                try {
                                    TryCatchGuardChecker.doCheck(th);
                                    AVLog.ioe("LyraxSingleViewRenderProcessor", "forwardTextureFrameToMixManager error", th);
                                    c1274560jGw.LJIIIZ();
                                    if (interfaceC1272490jDb != null) {
                                    }
                                } catch (Throwable th2) {
                                    TryCatchGuardChecker.doCheck(th2);
                                    if (interfaceC1272490jDb != null) {
                                        interfaceC1272490jDb.release();
                                    }
                                    throw th2;
                                }
                            }
                            if (interfaceC1272490jDb != null) {
                                interfaceC1272490jDb.release();
                            }
                            C1C7U.LIZIZ("LyraxSingleViewRenderProcessor@ac26.forwardTextureFrameToMixManager$1L");
                        }
                    })) {
                        c1274550jGv.release();
                        return;
                    }
                    return;
                }
                return;
            }
            LJIIJ(i, i2, i3, j);
        }
    }

    @Override // X.InterfaceC1275190jHx
    public final boolean LIZ(int i, int i2, int i3, int i4, int i5, long j, EnumC1274530jGt enumC1274530jGt, C1271970jCl c1271970jCl, RunnableC1275220jI0 runnableC1275220jI0, Map map, int[] iArr, ByteBuffer[] byteBufferArr) {
        LJI(byteBufferArr, iArr, enumC1274530jGt, i, i3, i4, j, c1271970jCl);
        return true;
    }

    @Override // X.InterfaceC1275190jHx
    public final void LIZIZ(int i, int i2, int i3, int i4, int i5, long j, EnumC1274530jGt enumC1274530jGt, C1271970jCl c1271970jCl, RunnableC1275220jI0 runnableC1275220jI0, Map map, int[] iArr, ByteBuffer[] byteBufferArr) {
        LJI(byteBufferArr, iArr, enumC1274530jGt, i, i3, i4, j, c1271970jCl);
    }
}
