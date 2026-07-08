package X;

import android.content.Context;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZXV, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZXV implements C0ZXL {
    public final List<Integer> LIZ;
    public final List<Float> LIZIZ;
    public final boolean LIZJ;
    public final C422360GhG LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0ZXV)) {
            return false;
        }
        C0ZXV c0zxv = (C0ZXV) obj;
        return Intrinsics.LJFF(this.LIZ, c0zxv.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0zxv.LIZIZ) && this.LIZJ == c0zxv.LIZJ && Intrinsics.LJFF(this.LIZLLL, c0zxv.LIZLLL);
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Gradient(colorList=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", progressList=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isDiagonal=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", style=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C0ZXL
    public final int LIZ(Context context) {
        Integer num = (Integer) C13LP.LJJJLL(this.LIZ);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public C0ZXV(List<Integer> list, List<Float> list2, boolean z, C422360GhG c422360GhG) {
        this.LIZ = list;
        this.LIZIZ = list2;
        this.LIZJ = z;
        this.LIZLLL = c422360GhG;
    }
}
