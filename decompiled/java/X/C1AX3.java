package X;

import android.view.SurfaceView;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1AX3, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AX3 {
    public final C1AXI LIZ;
    public final FrameLayout LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1AX3)) {
            return false;
        }
        C1AX3 c1ax3 = (C1AX3) obj;
        return Intrinsics.LJFF(this.LIZ, c1ax3.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1ax3.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MicWindow(micInfo=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", container=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int LIZ() {
        InterfaceC1268870j7l interfaceC1268870j7l;
        C1AXI c1axi = this.LIZ;
        EnumC918810a19 enumC918810a19 = c1axi.LIZ;
        int iHashCode = 0;
        int iHashCode2 = ((enumC918810a19 != EnumC918810a19.StateJoined || c1axi.LJI == enumC918810a19) ? c1axi.hashCode() : 0) * 31;
        String str = this.LIZ.LIZJ;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        SurfaceView surfaceView = this.LIZ.LIZLLL;
        int iHashCode4 = (iHashCode3 + (surfaceView != null ? surfaceView.hashCode() : 0)) * 31;
        WeakReference<InterfaceC1268870j7l> weakReference = this.LIZ.LJFF;
        if (weakReference != null && (interfaceC1268870j7l = weakReference.get()) != null) {
            iHashCode = interfaceC1268870j7l.hashCode();
        }
        return iHashCode4 + iHashCode;
    }

    public C1AX3(C1AXI c1axi, FrameLayout frameLayout) {
        this.LIZ = c1axi;
        this.LIZIZ = frameLayout;
    }
}
