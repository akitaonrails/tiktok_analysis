package X;

import android.opengl.GLES20;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.LinkedList;

/* JADX INFO: renamed from: X.0jbj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1287450jbj extends AbstractC1287470jbl {
    public final LinkedList<C1287480jbm> LIZ = new LinkedList<>();

    public static C1287480jbm LIZ(String str, float f, float f2, float f3, float f4) {
        float[] fArr = new float[8];
        C2247371Cxj.LIZJ(fArr, f, f2, f3, f4);
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        floatBufferAsFloatBuffer.put(fArr);
        floatBufferAsFloatBuffer.position(0);
        float[] fArr2 = new float[8];
        C2247371Cxj.LIZJ(fArr2, 0.0f, 0.0f, 1.0f, 1.0f);
        FloatBuffer floatBufferAsFloatBuffer2 = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        floatBufferAsFloatBuffer2.put(fArr2);
        floatBufferAsFloatBuffer2.position(0);
        int iLIZIZ = C1287350jbZ.LIZIZ("\nattribute vec4 aPosition;\nattribute vec2 aTextureCoord;\nvarying vec2 vTextureCoord;\n\nvoid main() {\n    gl_Position = aPosition;\n    vTextureCoord = aTextureCoord;\n}\n", str);
        if (iLIZIZ == 0) {
            C1287350jbZ.LIZ();
            return null;
        }
        int iGlGetAttribLocation = GLES20.glGetAttribLocation(iLIZIZ, "aPosition");
        C1287350jbZ.LIZ();
        if (iGlGetAttribLocation != -1) {
            int iGlGetAttribLocation2 = GLES20.glGetAttribLocation(iLIZIZ, "aTextureCoord");
            C1287350jbZ.LIZ();
            if (iGlGetAttribLocation2 != -1) {
                return new C1287480jbm(floatBufferAsFloatBuffer, floatBufferAsFloatBuffer2, iLIZIZ, iGlGetAttribLocation, iGlGetAttribLocation2);
            }
            throw new RuntimeException("Could not get attrib location for aTextureCoord");
        }
        throw new RuntimeException("Could not get attrib location for aPosition");
    }
}
