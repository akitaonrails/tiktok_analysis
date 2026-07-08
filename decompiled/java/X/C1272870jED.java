package X;

import android.graphics.Matrix;
import android.opengl.GLES20;
import android.opengl.GLES30;
import com.ss.ttlivestreamer.core.opengl.GlUtil;
import com.ss.ttlivestreamer.core.utils.AVLog;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: X.0jED, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1272870jED {
    public int[] LIZ;
    public int LIZIZ;
    public int LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public long LJI;
    public long LJII;
    public float[] LJIIIIZZ;
    public Matrix LJIIIZ;
    public final C1272950jEL LJIIJ = new C1272950jEL();
    public int LJIIJJI = 0;
    public boolean LJIIL = true;
    public boolean LJIILIIL = false;
    public int LJIILJJIL = 0;

    public final void LIZJ() {
        int[] iArr = this.LIZ;
        if (iArr != null) {
            GLES20.glDeleteTextures(iArr.length, iArr, 0);
            this.LIZ = null;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this);
            sbLIZ.append(" release mYuvWidth:");
            sbLIZ.append(this.LIZIZ);
            sbLIZ.append(" mYuvHeight:");
            sbLIZ.append(this.LIZJ);
            AVLog.logKibana(4, "VideoFrameRender", C2188811AlT.LIZIZ(sbLIZ), null);
            this.LIZIZ = 0;
            this.LIZJ = 0;
        }
    }

    public static int LIZIZ(int i, int i2, int i3) {
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

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ae, code lost:
    
        if (r2.LIZIZ != null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00dd, code lost:
    
        if (r8.equals(r2.LIZIZ) == true) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e7, code lost:
    
        if (java.util.Arrays.equals((float[]) null, r1) == false) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZ(com.ss.ttlivestreamer.core.buffer.VideoFrame r27, com.ss.ttlivestreamer.core.opengl.GlRenderDrawer r28, float[] r29, int r30, int r31) {
        /*
            Method dump skipped, instruction units count: 849
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1272870jED.LIZ(com.ss.ttlivestreamer.core.buffer.VideoFrame, com.ss.ttlivestreamer.core.opengl.GlRenderDrawer, float[], int, int):boolean");
    }

    public final void LIZLLL(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, int i5) {
        GLES20.glActiveTexture(i);
        GLES20.glBindTexture(3553, i2);
        if (this.LIZLLL && i5 >= i3) {
            GLES30.glPixelStorei(3314, i5);
        }
        GLES20.glTexSubImage2D(3553, 0, 0, 0, i3, i4, 6409, 5121, byteBuffer);
        if (this.LIZLLL && i5 >= i3) {
            GLES30.glPixelStorei(3314, 0);
        }
    }
}
