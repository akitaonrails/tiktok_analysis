package X;

import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0MKF, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MKF implements C0MMS {
    public final CreativeInfo LIZ;
    public final ForwardMedia LIZIZ;
    public final C0MMK LIZJ;
    public final Pair<Integer, Integer> LIZLLL;
    public final List<String> LJ;
    public final int LJFF;
    public final int LJI;

    public C0MKF() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0MKF)) {
            return false;
        }
        C0MKF c0mkf = (C0MKF) obj;
        return Intrinsics.LJFF(this.LIZ, c0mkf.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0mkf.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0mkf.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c0mkf.LIZLLL) && Intrinsics.LJFF(this.LJ, c0mkf.LJ) && this.LJFF == c0mkf.LJFF && this.LJI == c0mkf.LJI;
    }

    public final int hashCode() {
        return (((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + this.LJFF) * 31) + this.LJI;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ForwardImageDataWrapper(creativeInfo=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", sourceMedia=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", forwardConfig=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", screenSize=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", imagePath=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", forwardType=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", shareToStoryMediaType=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C0MMS
    public final CreativeInfo LIZ() {
        return this.LIZ;
    }

    @Override // X.C0MMS
    public final ForwardMedia LIZIZ() {
        return this.LIZIZ;
    }

    public C0MKF(CreativeInfo creativeInfo, ForwardMedia forwardMedia, C0MMK c0mmk, Pair pair, List list) {
        this.LIZ = creativeInfo;
        this.LIZIZ = forwardMedia;
        this.LIZJ = c0mmk;
        this.LIZLLL = pair;
        this.LJ = list;
        this.LJFF = 1;
        this.LJI = 3;
    }
}
