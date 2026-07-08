package X;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18EW, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18EW {
    public final WeakReference<Object> LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final String LJFF;
    public final boolean LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18EW)) {
            return false;
        }
        C18EW c18ew = (C18EW) obj;
        return Intrinsics.LJFF(this.LIZ, c18ew.LIZ) && Intrinsics.LJFF(this.LIZIZ, c18ew.LIZIZ) && this.LIZJ == c18ew.LIZJ && this.LIZLLL == c18ew.LIZLLL && this.LJ == c18ew.LJ && Intrinsics.LJFF(this.LJFF, c18ew.LJFF) && this.LJI == c18ew.LJI;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BtmPageInstance(pageRef=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", btm=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", auto=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", singleton=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", reuse=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", sourceBtmToken=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", ignoreSystemFirstResume=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C18EW(WeakReference weakReference, String str, boolean z, String str2, int i) {
        this(weakReference, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? true : z, false, false, (i & 32) != 0 ? null : str2, false);
    }

    public C18EW(WeakReference<Object> weakReference, String str, boolean z, boolean z2, boolean z3, String str2, boolean z4) {
        this.LIZ = weakReference;
        this.LIZIZ = str;
        this.LIZJ = z;
        this.LIZLLL = z2;
        this.LJ = z3;
        this.LJFF = str2;
        this.LJI = z4;
    }
}
