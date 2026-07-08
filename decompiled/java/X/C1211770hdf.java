package X;

import android.view.SurfaceView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hdf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1211770hdf extends AbstractC1211760hde {
    public final SurfaceView LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1211770hdf) && Intrinsics.LJFF(this.LIZ, ((C1211770hdf) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SurfaceVideoView(surfaceView=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1211770hdf(SurfaceView surfaceView) {
        this.LIZ = surfaceView;
    }
}
