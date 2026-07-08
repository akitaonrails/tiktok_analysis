package X;

import android.opengl.GLES20;
import android.opengl.GLES30;
import com.ss.ttlivestreamer.core.utils.AVLog;
import java.nio.ByteBuffer;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0jGo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1274480jGo {
    public final String LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final C1269300j8S LIZLLL;
    public long LJ;

    public final void LIZ(String str) throws JSONException {
        C1269300j8S c1269300j8S;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.LJ > 2000 && (c1269300j8S = this.LIZLLL) != null) {
            this.LJ = jCurrentTimeMillis;
            c1269300j8S.LIZ("rtc_subscribe_render_error", "buffer_error", str, null);
        }
    }

    public C1274480jGo(String str, boolean z, boolean z2, C1269300j8S c1269300j8S) {
        this.LIZ = str;
        this.LIZIZ = z;
        this.LIZJ = z2;
        this.LIZLLL = c1269300j8S;
    }

    public final int LIZIZ(int[] iArr, ByteBuffer[] byteBufferArr, int[] iArr2, int i, int i2) throws JSONException {
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
        int iLIZJ = LIZJ(byteBufferArr[0], 33984, i8, i, i2, i3);
        if (iLIZJ != 0) {
            return iLIZJ;
        }
        int i9 = iArr[1];
        if (iArr2 != null) {
            i4 = iArr2[1];
        } else {
            i4 = -1;
        }
        int iLIZJ2 = LIZJ(byteBufferArr[1], 33985, i9, i6, i7, i4);
        if (iLIZJ2 != 0) {
            return iLIZJ2;
        }
        int i10 = iArr[2];
        if (iArr2 != null) {
            i5 = iArr2[2];
        } else {
            i5 = -1;
        }
        return LIZJ(byteBufferArr[2], 33986, i10, i6, i7, i5);
    }

    public final int LIZJ(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, int i5) throws JSONException {
        boolean z;
        ByteBuffer byteBufferAllocateDirect;
        int iGlGetError;
        int i6 = i5;
        if (byteBuffer == null) {
            return -1;
        }
        if (this.LIZJ) {
            if (!byteBuffer.isDirect() && !byteBuffer.hasArray()) {
                LIZ("buffer is not direct, but has no array");
            }
            if (byteBuffer.isDirect() && C801590VcT.LIZ(byteBuffer) == 0) {
                LIZ("buffer is direct, but has no array");
            }
        }
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        if (i6 > 0 && i6 != i3 && (!this.LIZIZ || i6 < i3)) {
            z = true;
        } else {
            z = false;
        }
        if (byteBuffer.isDirect() && C801590VcT.LIZ(byteBuffer) != 0 && !z) {
            byteBufferAllocateDirect = byteBuffer;
        } else {
            int i7 = i3 * i4;
            if (i6 > 0 && i6 != i3) {
                byteBufferAllocateDirect = ByteBuffer.allocateDirect(i7);
                int iLimit2 = byteBuffer.limit();
                for (int i8 = 0; i8 < i4; i8++) {
                    int iPosition2 = byteBuffer.position() + i3;
                    if (iPosition2 <= iLimit2) {
                        byteBuffer.limit(iPosition2);
                        byteBufferAllocateDirect.put(byteBuffer);
                        byteBuffer.limit(iLimit2);
                        byteBuffer.position((byteBuffer.position() + i6) - i3);
                    } else {
                        byteBuffer.position(iPosition);
                        byteBuffer.limit(iLimit);
                        return -1;
                    }
                }
                byteBufferAllocateDirect.position(0);
                i6 = i3;
            } else {
                if (byteBuffer.remaining() >= i7) {
                    byteBufferAllocateDirect = ByteBuffer.allocateDirect(i7);
                    byteBuffer.limit(byteBuffer.position() + i7);
                    byteBufferAllocateDirect.put(byteBuffer);
                    byteBufferAllocateDirect.position(0);
                    i6 = i3;
                }
                byteBuffer.position(iPosition);
                byteBuffer.limit(iLimit);
                return -1;
            }
        }
        GLES20.glActiveTexture(i);
        GLES20.glBindTexture(3553, i2);
        if (this.LIZIZ && i6 >= i3) {
            GLES30.glPixelStorei(3314, i6);
        }
        GLES20.glTexSubImage2D(3553, 0, 0, 0, i3, i4, 6409, 5121, byteBufferAllocateDirect);
        if (this.LIZIZ && i6 >= i3) {
            GLES30.glPixelStorei(3314, 0);
        }
        byteBuffer.position(iPosition);
        byteBuffer.limit(iLimit);
        if (this.LIZJ && (iGlGetError = GLES20.glGetError()) != 0) {
            String str = this.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateI420Image GLES error:");
            sbLIZ.append(iGlGetError);
            AVLog.logKibana(6, str, C2188811AlT.LIZIZ(sbLIZ), null);
        }
        return 0;
    }
}
