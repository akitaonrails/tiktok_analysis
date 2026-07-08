package X;

import android.content.res.Resources;
import android.opengl.GLES20;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

/* JADX INFO: renamed from: X.0jbZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1287350jbZ {
    public static void LIZ() {
        while (GLES20.glGetError() != 0) {
        }
    }

    public static int LIZIZ(String str, String str2) {
        int iLIZLLL;
        int iLIZLLL2 = LIZLLL(35633, str);
        if (iLIZLLL2 == 0 || (iLIZLLL = LIZLLL(35632, str2)) == 0) {
            return 0;
        }
        int iGlCreateProgram = GLES20.glCreateProgram();
        if (iGlCreateProgram != 0) {
            GLES20.glAttachShader(iGlCreateProgram, iLIZLLL2);
            LIZ();
            GLES20.glAttachShader(iGlCreateProgram, iLIZLLL);
            LIZ();
            GLES20.glLinkProgram(iGlCreateProgram);
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
            if (iArr[0] != 1) {
                GLES20.glDeleteProgram(iGlCreateProgram);
                return 0;
            }
        }
        return iGlCreateProgram;
    }

    public static String LIZJ(Resources resources, String str) {
        String str2;
        InputStream inputStreamOpen;
        ByteArrayOutputStream byteArrayOutputStream;
        try {
            inputStreamOpen = resources.getAssets().open(str);
            byteArrayOutputStream = new ByteArrayOutputStream();
        } catch (Exception e) {
            e = e;
            str2 = null;
        }
        while (true) {
            int i = inputStreamOpen.read();
            if (i != -1) {
                byteArrayOutputStream.write(i);
            } else {
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                inputStreamOpen.close();
                str2 = new String(byteArray, "UTF-8");
                try {
                    str2 = str2.replaceAll("\\r\\n", "\n");
                    return str2;
                } catch (Exception e2) {
                    e = e2;
                }
            }
            TryCatchGuardChecker.doCheck(e);
            return str2;
        }
    }

    public static int LIZLLL(int i, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i);
        if (iGlCreateShader != 0) {
            GLES20.glShaderSource(iGlCreateShader, str);
            GLES20.glCompileShader(iGlCreateShader);
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
            if (iArr[0] == 0) {
                GLES20.glDeleteShader(iGlCreateShader);
                return 0;
            }
            return iGlCreateShader;
        }
        return iGlCreateShader;
    }
}
