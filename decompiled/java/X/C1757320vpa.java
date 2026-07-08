package X;

import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.communication.ISeaPdpCommunicationService;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vpa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1757320vpa {
    public WeakReference<C04FR> LIZ;
    public WeakReference<InterfaceC1764530w1D> LIZIZ;
    public WeakReference<InterfaceC1760150vu9<?>> LIZJ;
    public WeakReference<ISeaPdpCommunicationService> LIZLLL;
    public C1487890op1 LJ;
    public WeakReference<InterfaceC1756930vox> LJFF;
    public WeakReference<View> LJI;

    public C1757320vpa() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1757320vpa)) {
            return false;
        }
        C1757320vpa c1757320vpa = (C1757320vpa) obj;
        return Intrinsics.LJFF(this.LIZ, c1757320vpa.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1757320vpa.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1757320vpa.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1757320vpa.LIZLLL) && Intrinsics.LJFF(this.LJ, c1757320vpa.LJ) && Intrinsics.LJFF(this.LJFF, c1757320vpa.LJFF) && Intrinsics.LJFF(this.LJI, c1757320vpa.LJI);
    }

    public final int hashCode() {
        WeakReference<C04FR> weakReference = this.LIZ;
        int iHashCode = (weakReference == null ? 0 : weakReference.hashCode()) * 31;
        WeakReference<InterfaceC1764530w1D> weakReference2 = this.LIZIZ;
        int iHashCode2 = (iHashCode + (weakReference2 == null ? 0 : weakReference2.hashCode())) * 31;
        WeakReference<InterfaceC1760150vu9<?>> weakReference3 = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (weakReference3 == null ? 0 : weakReference3.hashCode())) * 31;
        WeakReference<ISeaPdpCommunicationService> weakReference4 = this.LIZLLL;
        int iHashCode4 = (iHashCode3 + (weakReference4 == null ? 0 : weakReference4.hashCode())) * 31;
        C1487890op1 c1487890op1 = this.LJ;
        int iHashCode5 = (iHashCode4 + (c1487890op1 == null ? 0 : c1487890op1.hashCode())) * 31;
        WeakReference<InterfaceC1756930vox> weakReference5 = this.LJFF;
        int iHashCode6 = (iHashCode5 + (weakReference5 == null ? 0 : weakReference5.hashCode())) * 31;
        WeakReference<View> weakReference6 = this.LJI;
        return iHashCode6 + (weakReference6 != null ? weakReference6.hashCode() : 0);
    }

    public final View LIZ() {
        WeakReference<View> weakReference = this.LJI;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public C1757320vpa(Object obj) {
        this.LIZ = null;
        this.LIZIZ = null;
        this.LIZJ = null;
        this.LIZLLL = null;
        this.LJ = null;
        this.LJFF = null;
        this.LJI = null;
    }
}
