package X;

import Y.ARunnableS120S0100000_20;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Handler;
import android.util.AndroidRuntimeException;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttlivestreamer.core.opengl.GLThreadManager;
import com.ss.ttlivestreamer.core.opengl.GlRenderDrawer;
import com.ss.ttlivestreamer.core.opengl.GlUtil;
import com.ss.ttlivestreamer.core.utils.AVLog;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0jGx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1274570jGx implements InterfaceC1275190jHx {
    public final InterfaceC1274510jGr LIZ;
    public final Handler LIZIZ;
    public final Handler LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public final boolean LJII;
    public final boolean LJIIIIZZ;
    public final boolean LJIIIZ;
    public final int LJIIJ;
    public final int LJIIJJI;
    public InterfaceC1274490jGp LJIIL;
    public View LJIILIIL;
    public C1271390jBp LJIILL;
    public GlRenderDrawer LJIILLIIL;
    public ByteBuffer LJIIZILJ;
    public float[] LJIJ;
    public int LJIJI;
    public int LJIJJ;
    public float LJIJJLI;
    public final C1274480jGo LJIL;
    public volatile boolean LJJ;
    public long LJJIFFI;
    public long LJJII;
    public final int[] LJIILJJIL = {0, 0, 0};
    public boolean LJJI = true;

    public final synchronized InterfaceC1274490jGp LJFF() {
        View view;
        InterfaceC1274490jGp interfaceC1274490jGpLJI = null;
        if (this.LJJ) {
            return null;
        }
        InterfaceC1274510jGr interfaceC1274510jGr = this.LIZ;
        if (interfaceC1274510jGr != null && (view = this.LJIILIIL) != null) {
            interfaceC1274490jGpLJI = interfaceC1274510jGr.LJI(view, this.LIZIZ, this.LIZLLL);
        }
        if (interfaceC1274490jGpLJI instanceof C1272880jEE) {
            ((C1272880jEE) interfaceC1274490jGpLJI).LLLLLLJ = this.LJ;
            ((C1272880jEE) interfaceC1274490jGpLJI).LLLLLLL = this.LJFF;
        }
        if (interfaceC1274490jGpLJI != null) {
            interfaceC1274490jGpLJI.LJLLJ(false);
            interfaceC1274490jGpLJI.LJJIIJ();
            interfaceC1274490jGpLJI.setCornerRadius(this.LJIJJLI);
        }
        return interfaceC1274490jGpLJI;
    }

    public final synchronized InterfaceC1274490jGp LJI() {
        if (this.LJJ) {
            return null;
        }
        if (this.LJIIL == null && this.LJIILIIL != null) {
            this.LJIIL = LJFF();
        }
        return this.LJIIL;
    }

    public final synchronized void LJIIIZ() {
        InterfaceC1274490jGp interfaceC1274490jGp = this.LJIIL;
        if (interfaceC1274490jGp != null) {
            if (this.LJJI) {
                interfaceC1274490jGp.release();
            }
            this.LJIIL = null;
        }
    }

    public final synchronized void LJIIL() {
        this.LJJI = false;
    }

    public final void LJIIJ() {
        Handler handler = this.LIZJ;
        if (handler != null) {
            C1283100jUi.LIZIZ(handler, new ARunnableS120S0100000_20(this, 465));
        } else {
            LJIIJJI();
        }
    }

    public final void LJIIJJI() {
        int[] iArr = this.LJIILJJIL;
        if (iArr[0] > 0) {
            GLES20.glDeleteTextures(iArr.length, iArr, 0);
            int i = 0;
            while (true) {
                int[] iArr2 = this.LJIILJJIL;
                if (i >= iArr2.length) {
                    break;
                }
                iArr2[i] = 0;
                i++;
            }
        }
        GlRenderDrawer glRenderDrawer = this.LJIILLIIL;
        if (glRenderDrawer != null) {
            glRenderDrawer.release();
            this.LJIILLIIL = null;
        }
        C1271390jBp c1271390jBp = this.LJIILL;
        if (c1271390jBp != null) {
            c1271390jBp.LIZJ();
            this.LJIILL = null;
        }
        this.LJIIZILJ = null;
        this.LJIJ = null;
        this.LJIJI = 0;
        this.LJIJJ = 0;
    }

    public final void LJIILLIIL() {
        if (this.LJJI) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.LJJII < 2000) {
            return;
        }
        this.LJJII = jCurrentTimeMillis;
    }

    @Override // X.InterfaceC1275190jHx
    public final void release() {
        if (this.LJJ) {
            return;
        }
        this.LJJ = true;
        LJIIIZ();
        LJIIJ();
    }

    @Override // X.InterfaceC1275190jHx
    public final InterfaceC1274490jGp LIZJ() {
        return LJI();
    }

    public final void LJIILL() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.LJJIFFI < 2000) {
            return;
        }
        this.LJJIFFI = jCurrentTimeMillis;
    }

    @Override // X.InterfaceC1275190jHx
    public final long getLatestRenderCostMs() {
        InterfaceC1274490jGp interfaceC1274490jGpLIZJ = LIZJ();
        if (interfaceC1274490jGpLIZJ != null) {
            return interfaceC1274490jGpLIZJ.getLatestRenderCostMs();
        }
        return 0L;
    }

    @Override // X.InterfaceC1275190jHx
    public final synchronized void setCornerRadius(float f) {
        this.LJIJJLI = f;
        InterfaceC1274490jGp interfaceC1274490jGp = this.LJIIL;
        if (interfaceC1274490jGp != null) {
            interfaceC1274490jGp.setCornerRadius(f);
        }
    }

    @Override // X.InterfaceC1275190jHx
    public final synchronized void setRenderTargetWindow(View view) {
        if (this.LJJ) {
            return;
        }
        if (this.LJIILIIL == view) {
            return;
        }
        this.LJIILIIL = view;
        LJIIIZ();
        if (this.LJIILIIL != null) {
            this.LJIIL = LJFF();
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

    public static ByteBuffer LJIILJJIL(int i, int i2, int i3, ByteBuffer byteBuffer) {
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        int iMax = Math.max(0, i2) * i;
        int iMin = Math.min(byteBufferDuplicate.capacity(), (Math.max(0, i3) * i) + iMax);
        byteBufferDuplicate.position(iMax);
        byteBufferDuplicate.limit(iMin);
        return byteBufferDuplicate.slice();
    }

    public static final boolean LJIILIIL(ByteBuffer[] byteBufferArr, EnumC1274530jGt enumC1274530jGt, int i, int i2, String str) {
        if (byteBufferArr != null && byteBufferArr.length != 0) {
            if (byteBufferArr.length == 1) {
                ByteBuffer byteBuffer = byteBufferArr[0];
                if (byteBuffer == null) {
                    AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException("BUG!");
                    C1274070jG9 c1274070jG9 = C1274080jGA.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("LyraxDefaultRenderProcessor.");
                    sbLIZ.append(str);
                    sbLIZ.append(":buffer0_null");
                    c1274070jG9.LIZ(C2188811AlT.LIZIZ(sbLIZ), androidRuntimeException);
                    if (!C1274040jG6.LIZ()) {
                        return true;
                    }
                    throw androidRuntimeException;
                }
                if (byteBuffer.capacity() < ((i * i2) * 3) / 2) {
                    return true;
                }
            } else if (byteBufferArr.length >= 3 && (byteBufferArr[0] == null || byteBufferArr[1] == null || byteBufferArr[2] == null)) {
                AndroidRuntimeException androidRuntimeException2 = new AndroidRuntimeException("BUG!");
                C1274070jG9 c1274070jG92 = C1274080jGA.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("LyraxDefaultRenderProcessor.");
                sbLIZ2.append(str);
                sbLIZ2.append(":plane_null");
                c1274070jG92.LIZ(C2188811AlT.LIZIZ(sbLIZ2), androidRuntimeException2);
                if (!C1274040jG6.LIZ()) {
                    return true;
                }
                throw androidRuntimeException2;
            }
            if (enumC1274530jGt == EnumC1274530jGt.PIXEL_FORMAT_I420) {
                return false;
            }
            AndroidRuntimeException androidRuntimeException3 = new AndroidRuntimeException("BUG!");
            C1274070jG9 c1274070jG93 = C1274080jGA.LIZ;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("LyraxDefaultRenderProcessor.");
            sbLIZ3.append(str);
            c1274070jG93.LIZ(C2188811AlT.LIZIZ(sbLIZ3), androidRuntimeException3);
            if (!C1274040jG6.LIZ()) {
                return true;
            }
            throw androidRuntimeException3;
        }
        AndroidRuntimeException androidRuntimeException4 = new AndroidRuntimeException("BUG!");
        C1274070jG9 c1274070jG94 = C1274080jGA.LIZ;
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("LyraxDefaultRenderProcessor.");
        sbLIZ4.append(str);
        sbLIZ4.append(":buffers_null_or_empty");
        c1274070jG94.LIZ(C2188811AlT.LIZIZ(sbLIZ4), androidRuntimeException4);
        if (!C1274040jG6.LIZ()) {
            return true;
        }
        throw androidRuntimeException4;
    }

    public final void LJ(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, int i3) {
        for (int i4 = 0; i4 < i2; i4++) {
            byteBuffer.limit(byteBuffer.position() + i);
            byteBuffer2.put(byteBuffer);
            if (i3 > i) {
                if (this.LJI) {
                    byteBuffer2.position((byteBuffer2.position() + i3) - i);
                } else {
                    byteBuffer.position(byteBuffer.limit() - (i3 - i));
                    byteBuffer2.put(byteBuffer);
                }
            }
        }
    }

    public final boolean LJIIIIZZ(final ByteBuffer[] byteBufferArr, final int[] iArr, final int i, final int i2, final EnumC1274530jGt enumC1274530jGt, final int i3) {
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        Handler handler = this.LIZJ;
        if (this.LJJ || handler == null || this.LJIILL == null || this.LJIILLIIL == null || this.LJIILJJIL[0] <= 0) {
            return false;
        }
        try {
            C1283100jUi.LIZIZ(handler, new Runnable() { // from class: X.0jGz
                @Override // java.lang.Runnable
                public final void run() {
                    int i4;
                    int iLIZIZ;
                    ByteBuffer byteBufferSlice;
                    ByteBuffer byteBufferSlice2;
                    ByteBuffer byteBufferSlice3;
                    C1274570jGx c1274570jGx = this.LL;
                    EnumC1274530jGt enumC1274530jGt2 = enumC1274530jGt;
                    int i5 = i;
                    ByteBuffer[] byteBufferArr2 = byteBufferArr;
                    int i6 = i2;
                    int[] iArr2 = iArr;
                    int i7 = i3;
                    AtomicBoolean atomicBoolean2 = atomicBoolean;
                    c1274570jGx.getClass();
                    C1C7U.LIZ("LyraxDefaultRenderProcessor@f6ac.loadYuvAndDraw$1L");
                    try {
                        if (!c1274570jGx.LJJ && enumC1274530jGt2 == EnumC1274530jGt.PIXEL_FORMAT_I420 && c1274570jGx.LJIILL != null && c1274570jGx.LJIILLIIL != null) {
                            int[] iArr3 = c1274570jGx.LJIILJJIL;
                            if (iArr3[0] > 0) {
                                int i8 = (((i5 + 8) - 1) / 8) * 8;
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
                                                ByteBuffer byteBuffer2 = c1274570jGx.LJIIZILJ;
                                                if (byteBuffer2 == null || byteBuffer2.capacity() < i14) {
                                                    c1274570jGx.LJIIZILJ = ByteBuffer.allocateDirect(i14);
                                                }
                                                byteBuffer.position(0);
                                                c1274570jGx.LJIIZILJ.position(0);
                                                c1274570jGx.LJIIZILJ.limit(i12);
                                                ByteBuffer byteBufferSlice4 = c1274570jGx.LJIIZILJ.slice();
                                                byteBufferSlice = byteBufferSlice4;
                                                c1274570jGx.LJ(byteBuffer, i5, byteBufferSlice4, i6, i8);
                                                byteBufferSlice4.position(0);
                                                c1274570jGx.LJIIZILJ.position(i12);
                                                int i15 = i12 * 5;
                                                c1274570jGx.LJIIZILJ.limit(i15 / 4);
                                                ByteBuffer byteBufferSlice5 = c1274570jGx.LJIIZILJ.slice();
                                                byteBufferSlice2 = byteBufferSlice5;
                                                c1274570jGx.LJ(byteBuffer, i5 / 2, byteBufferSlice5, i6 / 2, i8 / 2);
                                                byteBufferSlice5.position(0);
                                                c1274570jGx.LJIIZILJ.position(i15 / 4);
                                                c1274570jGx.LJIIZILJ.limit(i13 / 2);
                                                ByteBuffer byteBufferSlice6 = c1274570jGx.LJIIZILJ.slice();
                                                byteBufferSlice3 = byteBufferSlice6;
                                                c1274570jGx.LJ(byteBuffer, i5 / 2, byteBufferSlice6, i6 / 2, i8 / 2);
                                                byteBufferSlice6.position(0);
                                            }
                                            iLIZIZ = c1274570jGx.LJIL.LIZIZ(c1274570jGx.LJIILJJIL, new ByteBuffer[]{byteBufferSlice, byteBufferSlice2, byteBufferSlice3}, null, i8, i6);
                                            i4 = i8;
                                        }
                                    }
                                    C1C7U.LIZIZ("LyraxDefaultRenderProcessor@f6ac.loadYuvAndDraw$1L");
                                    return;
                                }
                                i4 = i8;
                                iLIZIZ = c1274570jGx.LJIL.LIZIZ(iArr3, byteBufferArr2, iArr2, i8, i6);
                                if (iLIZIZ != 0) {
                                    C1C7U.LIZIZ("LyraxDefaultRenderProcessor@f6ac.loadYuvAndDraw$1L");
                                    return;
                                }
                                c1274570jGx.LJIILL.LIZLLL(i5, i6);
                                GLES20.glBindFramebuffer(36160, c1274570jGx.LJIILL.LIZ);
                                if (c1274570jGx.LJIJ == null) {
                                    float[] fArrLJ = C1273010jER.LJ();
                                    c1274570jGx.LJIJ = fArrLJ;
                                    if (i8 != i5 && c1274570jGx.LJI) {
                                        Matrix.orthoM(fArrLJ, 0, -1.0f, ((((i5 * 1.0f) - 0.45f) / i4) * 2.0f) - 1.0f, -1.0f, 1.0f, 1.0f, -1.0f);
                                    }
                                }
                                c1274570jGx.LJIILLIIL.drawYuv(c1274570jGx.LJIILJJIL, c1274570jGx.LJIJ, C1273010jER.LJ(), 0, 0, i5, i6, i7);
                                if (c1274570jGx.LJII) {
                                    GLES20.glFinish();
                                }
                                GLES20.glBindFramebuffer(36160, 0);
                                atomicBoolean2.set(true);
                                C1C7U.LIZIZ("LyraxDefaultRenderProcessor@f6ac.loadYuvAndDraw$1L");
                                return;
                            }
                        }
                        C1C7U.LIZIZ("LyraxDefaultRenderProcessor@f6ac.loadYuvAndDraw$1L");
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        AVLog.ioe("LyraxDefaultRenderProcessor", "loadYuvAndDraw error", th);
                        c1274570jGx.LJIIJJI();
                        C1C7U.LIZIZ("LyraxDefaultRenderProcessor@f6ac.loadYuvAndDraw$1L");
                    }
                }
            });
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            AVLog.ioe("LyraxDefaultRenderProcessor", "loadYuvAndDraw invoke error", th);
            if (C786410Ut5.u3() == handler.getLooper().getThread()) {
                LJIIJJI();
            } else {
                LJIIJ();
            }
        }
        return atomicBoolean.get();
    }

    public C1274570jGx(InterfaceC1274510jGr interfaceC1274510jGr, Handler handler, Handler handler2, boolean z, boolean z2, int i, int i2, boolean z3) {
        this.LIZ = interfaceC1274510jGr;
        this.LIZIZ = handler;
        this.LIZJ = handler2 == null ? GLThreadManager.getMainGlHandle() : handler2;
        this.LIZLLL = false;
        this.LJ = true;
        this.LJFF = false;
        this.LJI = z;
        this.LJII = z2;
        this.LJIIIIZZ = false;
        this.LJIIIZ = false;
        this.LJIIJ = i;
        this.LJIIJJI = i2;
        this.LJIL = new C1274480jGo("LyraxDefaultRenderProcessor", z3, false, null);
    }

    @Override // X.InterfaceC1275190jHx
    public final void LIZLLL(int i, int i2, int i3, int i4, int i5, long j, EnumC1274530jGt enumC1274530jGt, C1274550jGv c1274550jGv, RunnableC1275220jI0 runnableC1275220jI0, Map map, float[] fArr) {
        EnumC1274530jGt enumC1274530jGt2;
        boolean z;
        float[] fArrLIZIZ = fArr;
        if (this.LJJ) {
            return;
        }
        InterfaceC1274490jGp interfaceC1274490jGpLJI = LJI();
        if (interfaceC1274490jGpLJI != null && i2 > 0 && i3 > 0 && (enumC1274530jGt == (enumC1274530jGt2 = EnumC1274530jGt.TEXTURE_OES) || enumC1274530jGt == EnumC1274530jGt.TEXTURE_2D)) {
            if (enumC1274530jGt == enumC1274530jGt2) {
                z = true;
            } else {
                z = false;
            }
            if (fArrLIZIZ == null) {
                android.graphics.Matrix matrixLIZJ = C1273520jFG.LIZJ(true);
                matrixLIZJ.preTranslate(0.0f, 0.5f);
                matrixLIZJ.preScale(1.0f, -1.0f);
                matrixLIZJ.preTranslate(0.0f, -0.5f);
                fArrLIZIZ = C1273010jER.LIZIZ(matrixLIZJ);
            }
            if (interfaceC1274490jGpLJI instanceof C1272880jEE) {
                interfaceC1274490jGpLJI.LJII(i, z, i2, i3, i4, fArrLIZIZ, j * 1000, c1274550jGv, runnableC1275220jI0, i5, map);
                LJIILLIIL();
                return;
            } else {
                interfaceC1274490jGpLJI.LLIILZL(i, z, i2, i3, i4, fArrLIZIZ, j * 1000, c1274550jGv, runnableC1275220jI0, map);
                LJIILLIIL();
                return;
            }
        }
        LJIILL();
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x00e9, code lost:
    
        if (r28.LJIILJJIL[0] > 0) goto L63;
     */
    @Override // X.InterfaceC1275190jHx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZ(int r29, int r30, int r31, int r32, int r33, long r34, X.EnumC1274530jGt r36, X.C1271970jCl r37, X.RunnableC1275220jI0 r38, java.util.Map r39, int[] r40, java.nio.ByteBuffer[] r41) {
        /*
            Method dump skipped, instruction units count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1274570jGx.LIZ(int, int, int, int, int, long, X.0jGt, X.0jCl, X.0jI0, java.util.Map, int[], java.nio.ByteBuffer[]):boolean");
    }

    @Override // X.InterfaceC1275190jHx
    public final void LIZIZ(int i, int i2, int i3, int i4, int i5, long j, EnumC1274530jGt enumC1274530jGt, C1271970jCl c1271970jCl, RunnableC1275220jI0 runnableC1275220jI0, Map map, int[] iArr, ByteBuffer[] byteBufferArr) {
        if (this.LJJ) {
            return;
        }
        InterfaceC1274490jGp interfaceC1274490jGpLJI = LJI();
        if (interfaceC1274490jGpLJI != null && !LJIILIIL(byteBufferArr, enumC1274530jGt, i3, i4, "processByteBufferFrame")) {
            if (interfaceC1274490jGpLJI instanceof C1272880jEE) {
                interfaceC1274490jGpLJI.LLILLL(byteBufferArr, iArr, i3, i4, i, i2, j * 1000, runnableC1275220jI0, c1271970jCl, i5, map);
                LJIILLIIL();
                return;
            } else {
                interfaceC1274490jGpLJI.LLI(byteBufferArr, iArr, i3, i4, j * 1000, runnableC1275220jI0, i, c1271970jCl, map);
                LJIILLIIL();
                return;
            }
        }
        LJIILL();
        runnableC1275220jI0.run();
    }
}
