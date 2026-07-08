package X;

import android.graphics.Rect;
import com.ss.android.vesdk.algorithm.VEBachQRCodeResult;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HiS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C448580HiS {
    public final VEBachQRCodeResult LIZ;
    public final String LIZIZ;
    public final Rect LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C448580HiS)) {
            return false;
        }
        C448580HiS c448580HiS = (C448580HiS) obj;
        return Intrinsics.LJFF(this.LIZ, c448580HiS.LIZ) && Intrinsics.LJFF(this.LIZIZ, c448580HiS.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c448580HiS.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("QRCodeCandidate(result=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", text=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", rect=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C448580HiS(VEBachQRCodeResult vEBachQRCodeResult, String str, Rect rect) {
        this.LIZ = vEBachQRCodeResult;
        this.LIZIZ = str;
        this.LIZJ = rect;
    }
}
