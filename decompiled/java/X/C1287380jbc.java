package X;

import android.content.Context;
import android.graphics.Color;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.os.SystemClock;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.nio.Buffer;
import java.util.List;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: renamed from: X.0jbc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1287380jbc implements GLSurfaceView.Renderer {
    public static final /* synthetic */ int LLJILLL = 0;
    public String LL;
    public String LLILLJJLI;
    public boolean LLILLL;
    public C1287370jbb LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public float LLIZ;
    public final float[] LLIZLLLIL = new float[16];
    public final float[] LLJ = new float[16];
    public final float[] LLJI = new float[16];
    public final float[] LLJIJIL = new float[16];
    public C1287390jbd LLJILJIL;
    public List<? extends List<Float>> LLJILJILJ;

    public C1287380jbc(Context context) {
    }

    public static List LIZIZ(int i) {
        return C1697810uHb.LJIIJJI(Float.valueOf(Color.red(i) / 255.0f), Float.valueOf(Color.green(i) / 255.0f), Float.valueOf(Color.blue(i) / 255.0f));
    }

    public final void LIZLLL(C1287390jbd c1287390jbd) {
        this.LLJILJIL = c1287390jbd;
        this.LLJILJILJ = C1697810uHb.LJIIJJI(LIZIZ(c1287390jbd.LJFF), LIZIZ(c1287390jbd.LJI), LIZIZ(c1287390jbd.LJII), LIZIZ(c1287390jbd.LJIIIIZZ), LIZIZ(c1287390jbd.LJIIIZ));
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        float[] fArr = new float[16];
        GLES20.glClear(16640);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        if (this.LLILLL) {
            Matrix.setLookAtM(this.LLJI, 0, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
        } else {
            Matrix.setLookAtM(this.LLJI, 0, 3.0f, -3.0f, -2.0f, 3.5f, -3.0f, 0.0f, 1.0f, 1.0f, 1.0f);
        }
        Matrix.multiplyMM(this.LLIZLLLIL, 0, this.LLJ, 0, this.LLJI, 0);
        C1287370jbb c1287370jbb = this.LLILZ;
        if (c1287370jbb != null) {
            float[] fArr2 = this.LLJ;
            float[] fArr3 = this.LLJI;
            C1287390jbd c1287390jbd = this.LLJILJIL;
            short[] sArr = null;
            if (c1287390jbd == null) {
                c1287390jbd = null;
            }
            List<? extends List<Float>> list = this.LLJILJILJ;
            if (list == null) {
                list = null;
            }
            float f = c1287390jbd.LIZIZ;
            float f2 = c1287370jbb.LJJII;
            if (f != f2) {
                c1287370jbb.LJJIII = (c1287370jbb.LJJIII - f2) + f;
                c1287370jbb.LJJII = f;
            }
            c1287370jbb.LJJIII += ((SystemClock.elapsedRealtime() - c1287370jbb.LJJIFFI) / 1000000.0f) * 60.0f * c1287390jbd.LIZ;
            c1287370jbb.LJJIFFI = SystemClock.elapsedRealtime();
            GLES20.glUseProgram(c1287370jbb.LJFF);
            int iGlGetAttribLocation = GLES20.glGetAttribLocation(c1287370jbb.LJFF, "aPos");
            c1287370jbb.LJI = iGlGetAttribLocation;
            GLES20.glEnableVertexAttribArray(iGlGetAttribLocation);
            GLES20.glVertexAttribPointer(c1287370jbb.LJI, 3, 5126, false, 12, (Buffer) c1287370jbb.LIZLLL);
            c1287370jbb.LJII = GLES20.glGetUniformLocation(c1287370jbb.LJFF, "uResolution");
            c1287370jbb.LJIIIIZZ = GLES20.glGetUniformLocation(c1287370jbb.LJFF, "uTime");
            c1287370jbb.LJIIIZ = GLES20.glGetUniformLocation(c1287370jbb.LJFF, "uSpeed");
            c1287370jbb.LJIIJ = GLES20.glGetUniformLocation(c1287370jbb.LJFF, "uTimeOffset");
            c1287370jbb.LJIIJJI = GLES20.glGetUniformLocation(c1287370jbb.LJFF, "uLightness");
            c1287370jbb.LJIIL = GLES20.glGetUniformLocation(c1287370jbb.LJFF, "uPosition");
            c1287370jbb.LJIILIIL = GLES20.glGetUniformLocation(c1287370jbb.LJFF, "uScale");
            c1287370jbb.LJIILJJIL = GLES20.glGetUniformLocation(c1287370jbb.LJFF, "uColor1");
            c1287370jbb.LJIILL = GLES20.glGetUniformLocation(c1287370jbb.LJFF, "uColor2");
            c1287370jbb.LJIILLIIL = GLES20.glGetUniformLocation(c1287370jbb.LJFF, "uColor3");
            c1287370jbb.LJIIZILJ = GLES20.glGetUniformLocation(c1287370jbb.LJFF, "uColor4");
            c1287370jbb.LJIJ = GLES20.glGetUniformLocation(c1287370jbb.LJFF, "uBgColor");
            c1287370jbb.LJIJI = GLES20.glGetUniformLocation(c1287370jbb.LJFF, "uComplex");
            c1287370jbb.LJIJJ = GLES20.glGetUniformLocation(c1287370jbb.LJFF, "uMorph");
            GLES20.glUniform2f(c1287370jbb.LJII, c1287370jbb.LIZIZ, c1287370jbb.LIZJ);
            GLES20.glUniform1f(c1287370jbb.LJIIIIZZ, c1287370jbb.LJJIII);
            GLES20.glUniform1f(c1287370jbb.LJIIIZ, c1287390jbd.LIZ);
            GLES20.glUniform1f(c1287370jbb.LJIIJ, c1287390jbd.LIZIZ);
            GLES20.glUniform1f(c1287370jbb.LJIIJJI, c1287390jbd.LIZJ);
            GLES20.glUniform2f(c1287370jbb.LJIIL, ((Number) ListProtector.get(c1287390jbd.LIZLLL, 0)).floatValue(), ((Number) ListProtector.get(c1287390jbd.LIZLLL, 1)).floatValue());
            GLES20.glUniform2f(c1287370jbb.LJIILIIL, ((Number) ListProtector.get(c1287390jbd.LJ, 0)).floatValue(), ((Number) ListProtector.get(c1287390jbd.LJ, 1)).floatValue());
            GLES20.glUniform3f(c1287370jbb.LJIILJJIL, ((Number) ListProtector.get((List) ListProtector.get(list, 0), 0)).floatValue(), ((Number) ListProtector.get((List) ListProtector.get(list, 0), 1)).floatValue(), ((Number) ListProtector.get((List) ListProtector.get(list, 0), 2)).floatValue());
            GLES20.glUniform3f(c1287370jbb.LJIILL, ((Number) ListProtector.get((List) ListProtector.get(list, 1), 0)).floatValue(), ((Number) ListProtector.get((List) ListProtector.get(list, 1), 1)).floatValue(), ((Number) ListProtector.get((List) ListProtector.get(list, 1), 2)).floatValue());
            GLES20.glUniform3f(c1287370jbb.LJIILLIIL, ((Number) ListProtector.get((List) ListProtector.get(list, 2), 0)).floatValue(), ((Number) ListProtector.get((List) ListProtector.get(list, 2), 1)).floatValue(), ((Number) ListProtector.get((List) ListProtector.get(list, 2), 2)).floatValue());
            GLES20.glUniform3f(c1287370jbb.LJIIZILJ, ((Number) ListProtector.get((List) ListProtector.get(list, 3), 0)).floatValue(), ((Number) ListProtector.get((List) ListProtector.get(list, 3), 1)).floatValue(), ((Number) ListProtector.get((List) ListProtector.get(list, 3), 2)).floatValue());
            GLES20.glUniform3f(c1287370jbb.LJIJ, ((Number) ListProtector.get((List) ListProtector.get(list, 4), 0)).floatValue(), ((Number) ListProtector.get((List) ListProtector.get(list, 4), 1)).floatValue(), ((Number) ListProtector.get((List) ListProtector.get(list, 4), 2)).floatValue());
            GLES20.glUniform1f(c1287370jbb.LJIJI, c1287390jbd.LJIIJ);
            GLES20.glUniform1f(c1287370jbb.LJIJJ, c1287390jbd.LJIIJJI);
            c1287370jbb.LJIJJLI = GLES20.glGetUniformLocation(c1287370jbb.LJFF, "uProjectionMatrix");
            c1287370jbb.LJIL = GLES20.glGetUniformLocation(c1287370jbb.LJFF, "uModelViewMatrix");
            C1284000jWA.LIZ("glGetUniformLocation");
            GLES20.glUniformMatrix4fv(c1287370jbb.LJIJJLI, 1, false, fArr2, 0);
            GLES20.glUniformMatrix4fv(c1287370jbb.LJIL, 1, false, fArr3, 0);
            C1284000jWA.LIZ("glUniformMatrix4fv");
            short[] sArr2 = c1287370jbb.LJJI;
            if (sArr2 != null) {
                sArr = sArr2;
            }
            GLES20.glDrawElements(4, sArr.length, 5123, c1287370jbb.LJ);
        }
        Matrix.setRotateM(this.LLJIJIL, 0, this.LLIZ, 0.0f, 0.0f, 1.0f);
        Matrix.multiplyMM(fArr, 0, this.LLIZLLLIL, 0, this.LLJIJIL, 0);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        String str = this.LL;
        String str2 = null;
        if (str == null) {
            str = null;
        }
        String str3 = this.LLILLJJLI;
        if (str3 != null) {
            str2 = str3;
        }
        C1287370jbb c1287370jbb = new C1287370jbb(str, str2, this.LLILLL);
        c1287370jbb.LIZIZ = this.LLILZIL;
        c1287370jbb.LIZJ = this.LLILZLL;
        this.LLILZ = c1287370jbb;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
        GLES20.glViewport(0, 0, i, i2);
        if (this.LLILLL) {
            Matrix.frustumM(this.LLJ, 0, -1.0f, 1.0f, -1.0f, 1.0f, 3.0f, 7.0f);
        } else {
            Matrix.frustumM(this.LLJ, 0, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f, 9.0f);
        }
    }
}
