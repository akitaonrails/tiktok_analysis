package X;

import android.opengl.GLES20;

/* JADX INFO: renamed from: X.0jWq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1284420jWq {
    public static final float[] LJ = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
    public C1283310jV3 LIZ;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;

    public final void LIZJ() {
        double d = 0.0f;
        float fCos = (float) Math.cos(d);
        float fSin = (float) Math.sin(d);
        this.LIZ.LIZ();
        GLES20.glUniformMatrix2fv(this.LIZJ, 1, false, new float[]{fCos, fSin, -fSin, fCos}, 0);
    }

    public final void LIZIZ() {
        C1283310jV3 c1283310jV3 = this.LIZ;
        if (c1283310jV3 != null) {
            int i = c1283310jV3.LIZ;
            if (i != 0) {
                GLES20.glDeleteProgram(i);
                c1283310jV3.LIZ = 0;
            }
            this.LIZ = null;
        }
        int i2 = this.LIZIZ;
        if (i2 != 0) {
            GLES20.glDeleteBuffers(1, new int[]{i2}, 0);
            this.LIZIZ = 0;
        }
    }

    public final void LIZ(int i) {
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, i);
        GLES20.glBindBuffer(34962, this.LIZIZ);
        GLES20.glEnableVertexAttribArray(0);
        GLES20.glVertexAttribPointer(0, 2, 5126, false, 0, 0);
        this.LIZ.LIZ();
        GLES20.glDrawArrays(5, 0, 4);
    }
}
