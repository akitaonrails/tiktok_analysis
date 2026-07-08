package X;

import android.opengl.GLES20;

/* JADX INFO: renamed from: X.0jWA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1284000jWA {
    public static void LIZ(String str) {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError == 0) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(": glError ");
        sbLIZ.append(iGlGetError);
        throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
    }
}
