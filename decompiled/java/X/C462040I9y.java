package X;

import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0I9y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C462040I9y extends C0IA2 {
    public final C0IA3 LIZJ;
    public final C0IA3 LIZLLL;
    public final C0IA3 LJ;

    public C462040I9y() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C462040I9y)) {
            return false;
        }
        C462040I9y c462040I9y = (C462040I9y) obj;
        return Intrinsics.LJFF(this.LIZJ, c462040I9y.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c462040I9y.LIZLLL) && Intrinsics.LJFF(this.LJ, c462040I9y.LJ);
    }

    public final int hashCode() {
        C0IA3 c0ia3 = this.LIZJ;
        int iHashCode = (c0ia3 == null ? 0 : c0ia3.hashCode()) * 31;
        C0IA3 c0ia32 = this.LIZLLL;
        int iHashCode2 = (iHashCode + (c0ia32 == null ? 0 : c0ia32.hashCode())) * 31;
        C0IA3 c0ia33 = this.LJ;
        return iHashCode2 + (c0ia33 != null ? c0ia33.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RemoveWithAnimation(topTask=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", midTask=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", bottomTask=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C0IA2
    public final String LIZJ() {
        PublishModel publishModelLIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(super.LIZJ());
        sbLIZ.append(", bottomTask=");
        C0IA3 c0ia3 = this.LJ;
        sbLIZ.append((c0ia3 == null || (publishModelLIZIZ = c0ia3.LIZIZ()) == null) ? null : publishModelLIZIZ.creationId);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C0IA2
    public final C0IA3 LIZ() {
        return this.LIZLLL;
    }

    @Override // X.C0IA2
    public final C0IA3 LIZIZ() {
        return this.LIZJ;
    }

    public C462040I9y(C0IA3 c0ia3, C0IA3 c0ia32, C0IA3 c0ia33) {
        this.LIZJ = c0ia3;
        this.LIZLLL = c0ia32;
        this.LJ = c0ia33;
    }
}
