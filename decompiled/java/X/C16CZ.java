package X;

import android.graphics.Path;
import android.transition.PathMotion;

/* JADX INFO: renamed from: X.16CZ, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C16CZ extends PathMotion {
    @Override // android.transition.PathMotion
    public final Path getPath(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(f, f2);
        path.lineTo(f3, f4);
        return path;
    }
}
