package X;

import android.graphics.Path;

/* JADX INFO: renamed from: X.0GQf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C415310GQf {
    public static Path LIZ(float[] fArr, boolean z) {
        Path path = new Path();
        if (fArr != null) {
            if (fArr.length >= 2) {
                path.moveTo(fArr[0], fArr[1]);
                for (int i = 2; i < fArr.length; i += 2) {
                    path.lineTo(fArr[i], fArr[i + 1]);
                }
                if (z) {
                    path.close();
                }
            }
        }
        return path;
    }
}
