package X;

import android.view.View;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15hd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20590315hd {
    public final EnumC20591315hn LIZ;
    public final C20590215hc LIZIZ;
    public final C20590215hc LIZJ;
    public final C19389510tR LIZLLL;
    public final WeakReference<View> LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20590315hd)) {
            return false;
        }
        C20590315hd c20590315hd = (C20590315hd) obj;
        return this.LIZ == c20590315hd.LIZ && Intrinsics.LJFF(this.LIZIZ, c20590315hd.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c20590315hd.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c20590315hd.LIZLLL) && Intrinsics.LJFF(this.LJ, c20590315hd.LJ);
    }

    public final int hashCode() {
        int iHashCode = ((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31;
        WeakReference<View> weakReference = this.LJ;
        return iHashCode + (weakReference == null ? 0 : weakReference.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BreakPointUpdate(orientation=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", horizontalBreakPoint=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", verticalBreakPoint=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", pageSize=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", viewWR=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C20590315hd(EnumC20591315hn enumC20591315hn, C20590215hc c20590215hc, C20590215hc c20590215hc2, C19389510tR c19389510tR) {
        this(enumC20591315hn, c20590215hc, c20590215hc2, c19389510tR, null);
    }

    public C20590315hd(EnumC20591315hn enumC20591315hn, C20590215hc c20590215hc, C20590215hc c20590215hc2, C19389510tR c19389510tR, WeakReference<View> weakReference) {
        this.LIZ = enumC20591315hn;
        this.LIZIZ = c20590215hc;
        this.LIZJ = c20590215hc2;
        this.LIZLLL = c19389510tR;
        this.LJ = weakReference;
    }
}
