package X;

import android.graphics.PointF;
import android.opengl.GLES20;
import com.ss.ttlivestreamer.core.opengl.GLTexture;
import com.ss.ttlivestreamer.core.opengl.UVRange;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* JADX INFO: renamed from: X.0jEc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1273120jEc {
    public final FloatBuffer LIZ;
    public final FloatBuffer LIZIZ;
    public final FloatBuffer LIZJ;
    public int LIZLLL;
    public int LJ;
    public final C1273180jEi LJFF;
    public final C1273180jEi LJI;

    public C1273120jEc() {
        float[] fArr = {-1.0f, -1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 1.0f, -1.0f, 0.0f, 1.0f, 1.0f, 0.0f};
        float[] fArr2 = {0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f};
        float[] fArrLIZIZ = C1273510jFF.LIZIZ();
        this.LJFF = new C1273180jEi(0);
        this.LJI = new C1273180jEi(1);
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(48).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.LIZ = floatBufferAsFloatBuffer;
        if (floatBufferAsFloatBuffer != null) {
            floatBufferAsFloatBuffer.put(fArr);
            floatBufferAsFloatBuffer.position(0);
        }
        FloatBuffer floatBufferAsFloatBuffer2 = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.LIZIZ = floatBufferAsFloatBuffer2;
        if (floatBufferAsFloatBuffer2 != null) {
            floatBufferAsFloatBuffer2.put(fArr2);
            floatBufferAsFloatBuffer2.position(0);
        }
        FloatBuffer floatBufferAsFloatBuffer3 = ByteBuffer.allocateDirect(64).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.LIZJ = floatBufferAsFloatBuffer3;
        if (floatBufferAsFloatBuffer3 != null) {
            floatBufferAsFloatBuffer3.put(fArrLIZIZ);
            floatBufferAsFloatBuffer3.position(0);
        }
    }

    public final void LIZ(GLTexture gLTexture, C1273150jEf c1273150jEf) {
        C1273180jEi c1273180jEi;
        GLES20.glViewport(0, 0, this.LIZLLL, this.LJ);
        if (gLTexture.getTextureType() == 0) {
            c1273180jEi = this.LJFF;
        } else {
            c1273180jEi = this.LJI;
        }
        GLES20.glUseProgram(c1273180jEi.LIZIZ);
        int textureId = gLTexture.getTextureId();
        GLES20.glActiveTexture(33984);
        int i = c1273180jEi.LIZ;
        if (i != 0) {
            if (i == 1) {
                GLES20.glBindTexture(36197, textureId);
            }
        } else {
            GLES20.glBindTexture(3553, textureId);
        }
        GLES20.glUniform1i(c1273180jEi.LJFF, 0);
        GLES20.glEnableVertexAttribArray(c1273180jEi.LIZJ);
        GLES20.glEnableVertexAttribArray(c1273180jEi.LIZLLL);
        FloatBuffer floatBuffer = this.LIZ;
        if (floatBuffer != null) {
            floatBuffer.put(c1273150jEf.LJ);
        }
        FloatBuffer floatBuffer2 = this.LIZ;
        if (floatBuffer2 != null) {
            floatBuffer2.position(0);
        }
        GLES20.glVertexAttribPointer(c1273180jEi.LIZJ, 3, 5126, false, 0, (Buffer) this.LIZ);
        UVRange uvRange = gLTexture.getUvRange();
        float f = this.LIZLLL;
        PointF pointF = c1273150jEf.LIZJ;
        float f2 = 2;
        UVRange uVRangeLIZ = C1271600jCA.LIZ(uvRange, gLTexture.getRotatedWidth(), gLTexture.getRotatedHeight(), (f * ((pointF.x - c1273150jEf.LIZ.x) / f2)) / (this.LJ * ((c1273150jEf.LIZLLL.y - pointF.y) / f2)));
        FloatBuffer floatBuffer3 = this.LIZIZ;
        if (floatBuffer3 != null) {
            float f3 = uVRangeLIZ.uMin;
            float f4 = uVRangeLIZ.vMin;
            float f5 = uVRangeLIZ.vMax;
            float f6 = uVRangeLIZ.uMax;
            floatBuffer3.put(new float[]{f3, f4, f3, f5, f6, f4, f6, f5});
        }
        FloatBuffer floatBuffer4 = this.LIZIZ;
        if (floatBuffer4 != null) {
            floatBuffer4.position(0);
        }
        GLES20.glVertexAttribPointer(c1273180jEi.LIZLLL, 2, 5126, false, 0, (Buffer) this.LIZIZ);
        FloatBuffer floatBuffer5 = this.LIZJ;
        if (floatBuffer5 != null) {
            floatBuffer5.put(gLTexture.getTransformMatrixFloats4x4());
        }
        FloatBuffer floatBuffer6 = this.LIZJ;
        if (floatBuffer6 != null) {
            floatBuffer6.position(0);
        }
        GLES20.glUniformMatrix4fv(c1273180jEi.LJ, 1, false, this.LIZJ);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glDisableVertexAttribArray(c1273180jEi.LIZJ);
        GLES20.glDisableVertexAttribArray(c1273180jEi.LIZLLL);
    }
}
