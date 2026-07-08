package X;

import Y.ARunnableS120S0100000_20;
import android.content.Context;
import android.opengl.GLES20;
import android.opengl.GLES30;
import android.opengl.Matrix;
import android.os.Bundle;
import android.os.Handler;
import android.util.AndroidRuntimeException;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttlivestreamer.core.buffer.SurfaceTextureHelper;
import com.ss.ttlivestreamer.core.buffer.VideoFrame;
import com.ss.ttlivestreamer.core.buffer.k;
import com.ss.ttlivestreamer.core.mixer.VideoMixer;
import com.ss.ttlivestreamer.core.opengl.GLThreadManager;
import com.ss.ttlivestreamer.core.opengl.GlRenderDrawer;
import com.ss.ttlivestreamer.core.opengl.GlUtil;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.TimeUtils;
import com.ss.ttlivestreamer.livestreamv2.sdkparams.VPassInteractCfg;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0jGm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1274460jGm extends C1269960j9W implements InterfaceC1274540jGu {
    public final C1274250jGR LLILLL;
    public final Handler LLILZ;
    public final String LLILZIL;
    public InterfaceC1274500jGq LLILZLL;
    public final View LLIZ;
    public InterfaceC1274490jGp LLIZLLLIL;
    public C1271390jBp LLJI;
    public GlRenderDrawer LLJIJIL;
    public int LLJILJIL;
    public int LLJILJILJ;
    public float[] LLJILLL;
    public ByteBuffer LLJJ;
    public boolean LLJJI;
    public boolean LLJJIJI;
    public final boolean LLJJIJIIJIL;
    public final boolean LLJJIJIL;
    public final boolean LLJJJ;
    public int LLJJJIL;
    public long LLJJJJ;
    public final boolean LLJJJJJIL;
    public final boolean LLJJJJLIIL;
    public int LLJJL;
    public C1274960jHa LLJL;
    public final C1269300j8S LLJLILLLLZIIL;
    public final int[] LLJ = {0, 0, 0};
    public boolean LLJJIII = true;
    public final C1274520jGs LLJJLIIIJLLLLLLLZ = new C1274520jGs();
    public boolean LLJLIL = false;
    public long LLJLL = 0;

    public final SurfaceView LJIILIIL() {
        View view = this.LLIZ;
        if (view != null && (view instanceof SurfaceView)) {
            return (SurfaceView) view;
        }
        return null;
    }

    public final TextureView LJIILJJIL() {
        View view = this.LLIZ;
        if (view != null && (view instanceof TextureView)) {
            return (TextureView) view;
        }
        return null;
    }

    @Override // X.C1271610jCB
    public final String LIZLLL() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InteractVideoSink_");
        sbLIZ.append(this.LL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C1271610jCB
    public final void release() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("begin release [");
        sbLIZ.append(this);
        sbLIZ.append(e3.f);
        AVLog.ioi("InteractVideoSink", C2188811AlT.LIZIZ(sbLIZ));
        this.LLJJI = true;
        this.LLJJIJI = false;
        this.LLJJJJ = 0L;
        if (this.LLJIJIL != null || this.LLJI != null) {
            C1283100jUi.LIZIZ(this.LLILZ, new ARunnableS120S0100000_20(this, 294));
        }
        InterfaceC1274490jGp interfaceC1274490jGp = this.LLIZLLLIL;
        if (interfaceC1274490jGp != null) {
            interfaceC1274490jGp.release();
            this.LLIZLLLIL = null;
        }
        InterfaceC1274500jGq interfaceC1274500jGq = this.LLILZLL;
        if (interfaceC1274500jGq != null) {
            interfaceC1274500jGq.stop();
            this.LLILZLL.release();
            this.LLILZLL = null;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("end release [");
        sbLIZ2.append(this);
        sbLIZ2.append(e3.f);
        AVLog.ioi("InteractVideoSink", C2188811AlT.LIZIZ(sbLIZ2));
    }

    public final long LJIIJ(long j) {
        if (this.LLJJJJ == 0) {
            this.LLJJJJ = j - TimeUtils.currentTimeMs();
        }
        return j - this.LLJJJJ;
    }

    public final void LJIILLIIL(String str) throws JSONException {
        C1269300j8S c1269300j8S;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.LLJLL > 2000 && (c1269300j8S = this.LLJLILLLLZIIL) != null) {
            this.LLJLL = jCurrentTimeMillis;
            c1269300j8S.LIZ("rtc_subscribe_render_error", "buffer_error", str, null);
        }
    }

    public final void LJIIZILJ(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("render old state:");
        sbLIZ.append(this.LLJJIII);
        sbLIZ.append(", new state:");
        sbLIZ.append(z);
        AVLog.ioi("InteractVideoSink", C2188811AlT.LIZIZ(sbLIZ));
        this.LLJJIII = z;
    }

    public static int LJIIL(int i, int i2, int i3) {
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

    public final void LJIJ(int[] iArr, ByteBuffer[] byteBufferArr, int[] iArr2, int i, int i2) throws JSONException {
        int i3;
        int i4;
        int i5;
        int i6 = (i + 1) >> 1;
        int i7 = (i2 + 1) >> 1;
        int i8 = iArr[0];
        if (iArr2 != null) {
            i3 = iArr2[0];
        } else {
            i3 = -1;
        }
        LJIJI(byteBufferArr[0], 33984, i8, i, i2, i3);
        int i9 = iArr[1];
        if (iArr2 != null) {
            i4 = iArr2[1];
        } else {
            i4 = -1;
        }
        LJIJI(byteBufferArr[1], 33985, i9, i6, i7, i4);
        int i10 = iArr[2];
        if (iArr2 != null) {
            i5 = iArr2[2];
        } else {
            i5 = -1;
        }
        LJIJI(byteBufferArr[2], 33986, i10, i6, i7, i5);
    }

    public final void LJIJI(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, int i5) throws JSONException {
        int iGlGetError;
        if (this.LLJJJ) {
            if (byteBuffer == null) {
                LJIILLIIL("buffer is null");
            }
            if (!byteBuffer.isDirect() && !byteBuffer.hasArray()) {
                LJIILLIIL("buffer is not direct, but has no array");
            }
            if (byteBuffer.isDirect() && C801590VcT.LIZ(byteBuffer) == 0) {
                LJIILLIIL("buffer is direct, but has no array");
            }
        }
        GLES20.glActiveTexture(i);
        GLES20.glBindTexture(3553, i2);
        if (this.LLJJJJLIIL && i5 >= i3) {
            GLES30.glPixelStorei(3314, i5);
        }
        GLES20.glTexSubImage2D(3553, 0, 0, 0, i3, i4, 6409, 5121, byteBuffer);
        if (this.LLJJJJLIIL && i5 >= i3) {
            GLES30.glPixelStorei(3314, 0);
        }
        if (this.LLJJJ && (iGlGetError = GLES20.glGetError()) != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateI20Image GLES error:");
            sbLIZ.append(iGlGetError);
            AVLog.logKibana(6, "InteractVideoSink", C2188811AlT.LIZIZ(sbLIZ), null);
        }
    }

    public C1274460jGm(String str, boolean z, int i, boolean z2, C1271090jBL c1271090jBL, Handler handler, boolean z3, boolean z4) {
        Handler mainGlHandle;
        AbstractC1273900jFs abstractC1273900jFsLIZ;
        this.LLJJIJIIJIL = true;
        this.LLJJIJIL = true;
        this.LLILZIL = str;
        C1274250jGR c1274250jGR = c1271090jBL.LLILZIL;
        this.LLILLL = c1274250jGR;
        VPassInteractCfg vPassInteractCfg = c1274250jGR.LJFF;
        AbstractC1273900jFs abstractC1273900jFsLIZ2 = c1274250jGR.LIZ();
        if (abstractC1273900jFsLIZ2 != null) {
            abstractC1273900jFsLIZ2.LJJIIJZLJL().LIZ.ttlhABSettingsConfigs.getClass();
            this.LLJLILLLLZIIL = (C1269300j8S) abstractC1273900jFsLIZ2.LJJIIJZLJL().LIZJ.getService(C1269300j8S.class);
        }
        this.LLJJJIL = i;
        if (handler != null) {
            mainGlHandle = handler;
        } else {
            mainGlHandle = GLThreadManager.getMainGlHandle();
        }
        this.LLILZ = mainGlHandle;
        this.LLJJJJJIL = z4;
        try {
            this.LLJJIJIIJIL = true;
            this.LLJJIJIL = true;
            boolean zLJFF = vPassInteractCfg.LJFF();
            this.LLJJJ = zLJFF;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("mUseBufferPoolInSingleView: ");
            sbLIZ.append(zLJFF);
            AVLog.logKibana(4, "InteractVideoSink", C2188811AlT.LIZIZ(sbLIZ), null);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C1274250jGR c1274250jGR2 = this.LLILLL;
        if (c1274250jGR2.LIZJ == EnumC1275210jHz.CLIENT_MIX && !this.LLJJJJJIL && this.LLILZLL == null && (abstractC1273900jFsLIZ = c1274250jGR2.LIZ()) != null) {
            InterfaceC1274500jGq interfaceC1274500jGqLJJZ = abstractC1273900jFsLIZ.LJJZ();
            this.LLILZLL = interfaceC1274500jGqLJJZ;
            if (interfaceC1274500jGqLJJZ != null) {
                interfaceC1274500jGqLJJZ.start();
                this.LLILZLL.LJIILJJIL(VideoMixer.VideoMixerDescription.INVISIABLE());
            }
        }
        if (!z2) {
            Context context = this.LLILLL.LIZLLL;
            if (context == null) {
                AVLog.iow("InteractVideoSink", "Maybe livecore is being released.");
                return;
            } else if (z) {
                this.LLIZ = new TextureView(context);
            } else {
                this.LLIZ = new SurfaceView(context);
            }
        } else {
            AbstractC1273900jFs abstractC1273900jFsLIZ3 = this.LLILLL.LIZ();
            if (abstractC1273900jFsLIZ3 != null && abstractC1273900jFsLIZ3.LLFF() != null) {
                this.LLIZLLLIL = this.LLILLL.LIZ().LJIILIIL(str);
            }
        }
        if (this.LLIZ != null) {
            InterfaceC1274490jGp interfaceC1274490jGpLJI = this.LLILLL.LIZ().LJI(this.LLIZ, handler, z3);
            this.LLIZLLLIL = interfaceC1274490jGpLJI;
            if (interfaceC1274490jGpLJI instanceof C1272880jEE) {
                C1272880jEE c1272880jEE = (C1272880jEE) interfaceC1274490jGpLJI;
                c1272880jEE.LLLLLLJ = true;
                c1272880jEE.LLLLLLL = false;
            }
            this.LLJJJJLIIL = GlUtil.isGLES3Support(this.LLIZ.getContext());
        }
        this.LLJJIJI = true;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("new interactvideosink: uid ");
        sbLIZ2.append(str);
        sbLIZ2.append(", view ");
        sbLIZ2.append(this.LLIZ);
        sbLIZ2.append(", renderSink ");
        sbLIZ2.append(this.LLIZLLLIL);
        AVLog.ioi("InteractVideoSink", C2188811AlT.LIZIZ(sbLIZ2));
    }

    public final void LJIIJJI(final ByteBuffer[] byteBufferArr, final int[] iArr, final EnumC1274530jGt enumC1274530jGt, final int i, final int i2, final int i3, long j, ARunnableS120S0100000_20 aRunnableS120S0100000_20, int i4, Map map) {
        boolean z;
        C1271390jBp c1271390jBp;
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        if (this.LLJI != null && this.LLJIJIL != null && this.LLJ[0] > 0) {
            C1283100jUi.LIZIZ(this.LLILZ, new Runnable() { // from class: X.0jGn
                public final void LIZ() throws JSONException {
                    int iGlGetError;
                    ByteBuffer byteBufferSlice;
                    ByteBuffer byteBufferSlice2;
                    ByteBuffer byteBufferSlice3;
                    C1274460jGm c1274460jGm = this.LLIZLLLIL;
                    if (c1274460jGm.LLJJI) {
                        return;
                    }
                    if (enumC1274530jGt != EnumC1274530jGt.PIXEL_FORMAT_I420) {
                        AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException("BUG!");
                        C1274080jGA.LIZ.LIZ("InteractVideoSink.loadYuvAndDraw", androidRuntimeException);
                        if (C1274040jG6.LIZ()) {
                            throw androidRuntimeException;
                        }
                        return;
                    }
                    int i5 = (((i2 + 8) - 1) / 8) * 8;
                    ByteBuffer[] byteBufferArr2 = byteBufferArr;
                    if (byteBufferArr2.length == 1) {
                        ByteBuffer byteBuffer = byteBufferArr2[0];
                        int iCapacity = byteBuffer.capacity();
                        int i6 = i2;
                        if (iCapacity < ((i3 * i6) * 3) / 2) {
                            return;
                        }
                        if (i5 == i6 && byteBuffer.isDirect()) {
                            byteBuffer.position(0);
                            byteBuffer.limit(i2 * i3);
                            byteBufferSlice = byteBuffer.slice();
                            byteBuffer.position(i2 * i3);
                            byteBuffer.limit(((i2 * i3) * 5) / 4);
                            byteBufferSlice2 = byteBuffer.slice();
                            byteBuffer.position(((i2 * i3) * 5) / 4);
                            byteBuffer.limit(((i2 * i3) * 3) / 2);
                            byteBufferSlice3 = byteBuffer.slice();
                        } else {
                            int i7 = ((i3 * i5) * 3) / 2;
                            ByteBuffer byteBuffer2 = this.LLIZLLLIL.LLJJ;
                            if (byteBuffer2 == null || byteBuffer2.capacity() < i7) {
                                this.LLIZLLLIL.LLJJ = ByteBuffer.allocateDirect(i7);
                            }
                            byteBuffer.position(0);
                            this.LLIZLLLIL.LLJJ.position(0);
                            this.LLIZLLLIL.LLJJ.limit(i3 * i5);
                            byteBufferSlice = this.LLIZLLLIL.LLJJ.slice();
                            int i8 = i2;
                            if (i5 == i8) {
                                byteBuffer.limit(i8 * i3);
                                byteBufferSlice.put(byteBuffer);
                            } else {
                                for (int i9 = 0; i9 < i3; i9++) {
                                    byteBuffer.limit(byteBuffer.position() + i2);
                                    byteBufferSlice.put(byteBuffer);
                                    if (this.LLIZLLLIL.LLJJIJIIJIL) {
                                        byteBufferSlice.position((byteBufferSlice.position() + i5) - i2);
                                    } else {
                                        byteBuffer.position(byteBuffer.limit() - (i5 - i2));
                                        byteBufferSlice.put(byteBuffer);
                                    }
                                }
                            }
                            byteBufferSlice.position(0);
                            this.LLIZLLLIL.LLJJ.position(i3 * i5);
                            this.LLIZLLLIL.LLJJ.limit(((i3 * i5) * 5) / 4);
                            byteBufferSlice2 = this.LLIZLLLIL.LLJJ.slice();
                            int i10 = i2;
                            if (i5 == i10) {
                                byteBuffer.limit(((i10 * i3) * 5) / 4);
                                byteBufferSlice2.put(byteBuffer);
                            } else {
                                for (int i11 = 0; i11 < i3 / 2; i11++) {
                                    byteBuffer.limit(byteBuffer.position() + (i2 / 2));
                                    byteBufferSlice2.put(byteBuffer);
                                    if (this.LLIZLLLIL.LLJJIJIIJIL) {
                                        byteBufferSlice2.position(byteBufferSlice2.position() + ((i5 - i2) / 2));
                                    } else {
                                        byteBuffer.position(byteBuffer.limit() - ((i5 - i2) / 2));
                                        byteBufferSlice2.put(byteBuffer);
                                    }
                                }
                            }
                            byteBufferSlice2.position(0);
                            this.LLIZLLLIL.LLJJ.position(((i3 * i5) * 5) / 4);
                            this.LLIZLLLIL.LLJJ.limit(((i3 * i5) * 3) / 2);
                            byteBufferSlice3 = this.LLIZLLLIL.LLJJ.slice();
                            int i12 = i2;
                            if (i5 == i12) {
                                byteBuffer.limit(((i12 * i3) * 3) / 2);
                                byteBufferSlice3.put(byteBuffer);
                            } else {
                                for (int i13 = 0; i13 < i3 / 2; i13++) {
                                    byteBuffer.limit(byteBuffer.position() + (i2 / 2));
                                    byteBufferSlice3.put(byteBuffer);
                                    if (this.LLIZLLLIL.LLJJIJIIJIL) {
                                        byteBufferSlice3.position(byteBufferSlice3.position() + ((i5 - i2) / 2));
                                    } else {
                                        byteBuffer.position(byteBuffer.limit() - ((i5 - i2) / 2));
                                        byteBufferSlice3.put(byteBuffer);
                                    }
                                }
                            }
                            byteBufferSlice3.position(0);
                        }
                        C1274460jGm c1274460jGm2 = this.LLIZLLLIL;
                        c1274460jGm2.LJIJ(c1274460jGm2.LLJ, new ByteBuffer[]{byteBufferSlice, byteBufferSlice2, byteBufferSlice3}, null, i5, i3);
                    } else {
                        c1274460jGm.LJIJ(c1274460jGm.LLJ, byteBufferArr2, iArr, i5, i3);
                    }
                    this.LLIZLLLIL.LLJI.LIZLLL(i2, i3);
                    GLES20.glBindFramebuffer(36160, this.LLIZLLLIL.LLJI.LIZ);
                    C1274460jGm c1274460jGm3 = this.LLIZLLLIL;
                    if (c1274460jGm3.LLJILLL == null) {
                        c1274460jGm3.LLJILLL = C1273010jER.LJ();
                        int i14 = i2;
                        if (i5 != i14) {
                            C1274460jGm c1274460jGm4 = this.LLIZLLLIL;
                            if (c1274460jGm4.LLJJIJIIJIL) {
                                Matrix.orthoM(c1274460jGm4.LLJILLL, 0, -1.0f, ((((i14 * 1.0f) - 0.45f) / i5) * 2.0f) - 1.0f, -1.0f, 1.0f, 1.0f, -1.0f);
                            }
                        }
                    }
                    C1274460jGm c1274460jGm5 = this.LLIZLLLIL;
                    c1274460jGm5.LLJIJIL.drawYuv(c1274460jGm5.LLJ, c1274460jGm5.LLJILLL, C1273010jER.LJ(), 0, 0, i2, i3, i);
                    if (this.LLIZLLLIL.LLJJJ && (iGlGetError = GLES20.glGetError()) != 0) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("drawYuv GLES error:");
                        sbLIZ.append(iGlGetError);
                        AVLog.logKibana(6, "InteractVideoSink", C2188811AlT.LIZIZ(sbLIZ), null);
                    }
                    if (this.LLIZLLLIL.LLJJIJIL) {
                        GLES20.glFinish();
                    } else {
                        GLES20.glFlush();
                    }
                    GLES20.glBindFramebuffer(36160, 0);
                    atomicBoolean.set(true);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("InteractVideoSink@c470.loadYuvAndDraw$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("InteractVideoSink@c470.loadYuvAndDraw$1");
                }
            });
            z = atomicBoolean.get();
        } else {
            z = atomicBoolean.get();
        }
        if (z && (c1271390jBp = this.LLJI) != null) {
            LJIILL(c1271390jBp.LIZIZ, i2, i3, 0, i4, j, EnumC1274530jGt.TEXTURE_2D, null, aRunnableS120S0100000_20, map, null);
        }
    }

    public final void LJIILL(final int i, final int i2, final int i3, int i4, int i5, final long j, EnumC1274530jGt enumC1274530jGt, final C1274550jGv c1274550jGv, Runnable runnable, Map map, float[] fArr) {
        boolean z;
        float[] fArrCopyOf;
        float[] fArr2;
        float[] fArrLIZIZ = fArr;
        if (!this.LLJJIII) {
            return;
        }
        boolean z2 = true;
        if (C1273520jFG.LIZJ) {
            C1274520jGs c1274520jGs = this.LLJJLIIIJLLLLLLLZ;
            if (c1274520jGs.LIZ == null || (((fArr2 = c1274520jGs.LIZIZ) != null || fArrLIZIZ != null) && !Arrays.equals(fArr2, fArrLIZIZ))) {
                if (fArrLIZIZ != null) {
                    fArrCopyOf = Arrays.copyOf(fArrLIZIZ, fArrLIZIZ.length);
                } else {
                    fArrCopyOf = null;
                }
                c1274520jGs.LIZIZ = fArrCopyOf;
                if (fArrLIZIZ == null) {
                    android.graphics.Matrix matrix = new android.graphics.Matrix();
                    matrix.preTranslate(0.0f, 0.5f);
                    matrix.preScale(1.0f, -1.0f);
                    matrix.preTranslate(0.0f, -0.5f);
                    fArrLIZIZ = C1273010jER.LIZIZ(matrix);
                }
                c1274520jGs.LIZ = fArrLIZIZ;
            }
            fArrLIZIZ = this.LLJJLIIIJLLLLLLLZ.LIZ;
        } else if (fArrLIZIZ == null) {
            android.graphics.Matrix matrixLIZJ = C1273520jFG.LIZJ(true);
            matrixLIZJ.preTranslate(0.0f, 0.5f);
            matrixLIZJ.preScale(1.0f, -1.0f);
            matrixLIZJ.preTranslate(0.0f, -0.5f);
            fArrLIZIZ = C1273010jER.LIZIZ(matrixLIZJ);
        }
        final AbstractC1273900jFs abstractC1273900jFsLIZ = this.LLILLL.LIZ();
        if (abstractC1273900jFsLIZ != null && abstractC1273900jFsLIZ.LLJJI() && abstractC1273900jFsLIZ.LJJII()) {
            if (enumC1274530jGt == EnumC1274530jGt.TEXTURE_OES) {
                if (c1274550jGv != null) {
                    c1274550jGv.retain();
                }
                final float[] fArr3 = fArrLIZIZ;
                C786410Ut5.LJJZZIII(this.LLILZ, new Runnable() { // from class: X.0jGk
                    public final void LIZ() {
                        C1274460jGm c1274460jGm = this.LLIZLLLIL;
                        if (c1274460jGm.LLJI == null) {
                            C1271300jBg c1271300jBg = new C1271300jBg();
                            c1271300jBg.LIZ = false;
                            c1274460jGm.LLJI = new C1271390jBp(c1271300jBg);
                        }
                        C1274460jGm c1274460jGm2 = this.LLIZLLLIL;
                        if (c1274460jGm2.LLJIJIL == null) {
                            c1274460jGm2.LLJIJIL = new GlRenderDrawer();
                        }
                        android.graphics.Matrix matrixLIZJ2 = C1273010jER.LIZJ(0, fArr3);
                        matrixLIZJ2.preTranslate(0.5f, 0.5f);
                        matrixLIZJ2.preScale(1.0f, -1.0f);
                        matrixLIZJ2.preTranslate(-0.5f, -0.5f);
                        this.LLIZLLLIL.LLJI.LIZLLL(i2, i3);
                        GLES20.glBindFramebuffer(36160, this.LLIZLLLIL.LLJI.LIZ);
                        this.LLIZLLLIL.LLJIJIL.drawOes(i, null, C1273010jER.LIZIZ(matrixLIZJ2), 0, 0, i2, i3);
                        GLES20.glFinish();
                        GLES20.glBindFramebuffer(36160, 0);
                        InterfaceC1272490jDb interfaceC1272490jDb = c1274550jGv;
                        if (interfaceC1272490jDb != null) {
                            interfaceC1272490jDb.release();
                        }
                        int i6 = this.LLIZLLLIL.LLJI.LIZIZ;
                        android.graphics.Matrix matrix2 = new android.graphics.Matrix();
                        matrix2.preTranslate(0.5f, 0.5f);
                        matrix2.preScale(1.0f, -1.0f);
                        matrix2.preTranslate(-0.5f, -0.5f);
                        k kVar = new k(i2, i3, EnumC1273550jFJ.RGB, i6, matrix2, (SurfaceTextureHelper) null, (Runnable) null);
                        if (abstractC1273900jFsLIZ.LLJ()) {
                            kVar.setTransformMatrixArray(C1267770j5z.LIZ);
                        }
                        Bundle bundle = new Bundle();
                        C786410Ut5.LJJJI("stream_id", this.LLIZLLLIL.LLILZIL, bundle);
                        this.LLIZLLLIL.LJIIIZ(new VideoFrame(kVar, 0, j), bundle);
                        C1274460jGm c1274460jGm3 = this.LLIZLLLIL;
                        if (c1274460jGm3.LLJLIL) {
                            return;
                        }
                        ((C1274900jHU) c1274460jGm3.LLJL.LJIILIIL).LIZ(0, 0, c1274460jGm3.LLILZIL);
                        this.LLIZLLLIL.LLJLIL = true;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("InteractVideoSink@c470.onTextureVideoFrameInternal$1");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("InteractVideoSink@c470.onTextureVideoFrameInternal$1");
                    }
                });
                return;
            }
            android.graphics.Matrix matrix2 = new android.graphics.Matrix();
            matrix2.preTranslate(0.5f, 0.5f);
            matrix2.preScale(1.0f, -1.0f);
            matrix2.preTranslate(-0.5f, -0.5f);
            k kVar = new k(i2, i3, EnumC1273550jFJ.RGB, i, matrix2, (SurfaceTextureHelper) null, (Runnable) null);
            if (abstractC1273900jFsLIZ.LLJ()) {
                kVar.setTransformMatrixArray(C1267770j5z.LIZ);
            }
            Bundle bundle = new Bundle();
            C786410Ut5.LJJJI("stream_id", this.LLILZIL, bundle);
            LJIIIZ(new VideoFrame(kVar, 0, j), bundle);
            if (this.LLJLIL) {
                return;
            }
            ((C1274900jHU) this.LLJL.LJIILIIL).LIZ(0, 0, this.LLILZIL);
            this.LLJLIL = true;
            return;
        }
        InterfaceC1274490jGp interfaceC1274490jGp = this.LLIZLLLIL;
        if (interfaceC1274490jGp != null) {
            if (enumC1274530jGt == EnumC1274530jGt.TEXTURE_OES) {
                z = true;
            } else {
                z = false;
            }
            interfaceC1274490jGp.LJII(i, z, i2, i3, i4, fArrLIZIZ, j * 1000, c1274550jGv, runnable, i5, map);
        }
        InterfaceC1274500jGq interfaceC1274500jGq = this.LLILZLL;
        if (interfaceC1274500jGq == null || this.LLILLL.LIZJ != EnumC1275210jHz.CLIENT_MIX) {
            return;
        }
        if (enumC1274530jGt != EnumC1274530jGt.TEXTURE_OES) {
            z2 = false;
        }
        interfaceC1274500jGq.LJIIJJI(1000 * j, i, i2, i3, fArrLIZIZ, 0, z2);
    }
}
