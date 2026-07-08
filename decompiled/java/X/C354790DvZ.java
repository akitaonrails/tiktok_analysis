package X;

import android.view.SurfaceView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DvZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C354790DvZ {
    public final SurfaceView LIZ;
    public final InterfaceC354860Dvg LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C354790DvZ)) {
            return false;
        }
        C354790DvZ c354790DvZ = (C354790DvZ) obj;
        return Intrinsics.LJFF(this.LIZ, c354790DvZ.LIZ) && Intrinsics.LJFF(this.LIZIZ, c354790DvZ.LIZIZ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        InterfaceC354860Dvg interfaceC354860Dvg = this.LIZIZ;
        return iHashCode + (interfaceC354860Dvg == null ? 0 : interfaceC354860Dvg.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MagnifierParam(magnifySurfaceView=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", magnifierDetector=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C354790DvZ(SurfaceView surfaceView, C374280Elu c374280Elu) {
        this.LIZ = surfaceView;
        this.LIZIZ = c374280Elu;
    }
}
