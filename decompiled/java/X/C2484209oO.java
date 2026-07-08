package X;

import android.os.Build;
import android.util.Log;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.ss.android.ttve.nativePort.TELogcat;

/* JADX INFO: renamed from: X.09oO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2484209oO {
    public static String LIZ = "VESDK-";
    public static byte LIZIZ = 7;
    public static boolean LIZJ = true;

    public static String LJFF(String str) {
        if (Build.VERSION.SDK_INT >= 29 && PatternProtector.compile("%[^n]+n").matcher(str).find()) {
            return str.replace("%", "*");
        }
        return str;
    }

    public static void LJIIIZ(Throwable th) {
        if (LIZJ && (LIZIZ & 2) != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(LIZ);
            sbLIZ.append("TextureHolder");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("attachToGLContext, exception occurred.");
            sbLIZ2.append("\n***StackTrace***\n");
            sbLIZ2.append(Log.getStackTraceString(th));
            TELogcat.nativeLog((byte) 2, strLIZIZ, C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    public static void LIZ(String str, String str2) {
        if (LIZJ && (LIZIZ & 8) != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(LIZ);
            sbLIZ.append(str);
            TELogcat.nativeLog((byte) 8, C2188811AlT.LIZIZ(sbLIZ), str2);
        }
    }

    public static void LIZJ(String str, String str2) {
        if ((LIZIZ & 1) != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(LIZ);
            sbLIZ.append(str);
            TELogcat.nativeLog((byte) 1, C2188811AlT.LIZIZ(sbLIZ), str2);
        }
    }

    public static void LJI(String str, String str2) {
        if (LIZJ && (LIZIZ & 4) != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(LIZ);
            sbLIZ.append(str);
            TELogcat.nativeLog((byte) 4, C2188811AlT.LIZIZ(sbLIZ), str2);
        }
    }

    public static void LJII(String str, String str2) {
        if (LIZJ && (LIZIZ & 16) != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(LIZ);
            sbLIZ.append(str);
            TELogcat.nativeLog((byte) 16, C2188811AlT.LIZIZ(sbLIZ), str2);
        }
    }

    public static void LJIIIIZZ(String str, String str2) {
        if (LIZJ && (LIZIZ & 2) != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(LIZ);
            sbLIZ.append(str);
            TELogcat.nativeLog((byte) 2, C2188811AlT.LIZIZ(sbLIZ), str2);
        }
    }

    public static void LIZIZ(Class<?> cls, String str, Throwable th) {
        if ((LIZIZ & 1) != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(LIZ);
            sbLIZ.append(cls.getSimpleName());
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str);
            sbLIZ2.append("\n***StackTrace***\n");
            sbLIZ2.append(Log.getStackTraceString(th));
            TELogcat.nativeLog((byte) 1, strLIZIZ, C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    public static void LIZLLL(String str, String str2, Throwable th) {
        if ((LIZIZ & 1) != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(LIZ);
            sbLIZ.append(str);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str2);
            sbLIZ2.append("\n***StackTrace***\n");
            sbLIZ2.append(Log.getStackTraceString(th));
            TELogcat.nativeLog((byte) 1, strLIZIZ, C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    public static String LJ(String str, String str2, C2484309oP... c2484309oPArr) {
        StringBuilder sb = new StringBuilder(C786410Ut5.j4("%s; (Msg): {%s}; ", new Object[]{str, str2}));
        for (C2484309oP c2484309oP : c2484309oPArr) {
            if (c2484309oP != null) {
                sb.append(C786410Ut5.j4("(%s): {%s}[%s], ", new Object[]{c2484309oP.LIZ, c2484309oP.LIZIZ, c2484309oP.LIZJ}));
            }
        }
        sb.append("_for_auto_analysis_");
        return sb.toString();
    }
}
