package X;

import android.graphics.Shader;

/* JADX INFO: renamed from: X.0u9c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1692860u9c {
    public static final AbstractC1668700tWe LIZ(C21530119Nr c21530119Nr) {
        Shader shader = c21530119Nr.LIZ;
        if (shader == null) {
            if (c21530119Nr.LIZJ != 0) {
                if (shader == null) {
                    return new C1680950tqP(C1685850tyJ.LIZIZ(c21530119Nr.LIZJ));
                }
            } else {
                return null;
            }
        }
        return new C1692640u9G(shader);
    }
}
