package X;

import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0MKG, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MKG implements C0MMS {
    public final CreativeInfo LIZ;
    public final ForwardMedia LIZIZ;
    public final C0MMK LIZJ;
    public final Pair<Integer, Integer> LIZLLL;
    public final String LJ;
    public final int LJFF;
    public final int LJI;

    public C0MKG() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0MKG)) {
            return false;
        }
        C0MKG c0mkg = (C0MKG) obj;
        return Intrinsics.LJFF(this.LIZ, c0mkg.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0mkg.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0mkg.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c0mkg.LIZLLL) && Intrinsics.LJFF(this.LJ, c0mkg.LJ) && this.LJFF == c0mkg.LJFF && this.LJI == c0mkg.LJI;
    }

    public final int hashCode() {
        return (((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + this.LJFF) * 31) + this.LJI;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ForwardVideoDataWrapper(creativeInfo=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", sourceMedia=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", forwardConfig=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", screenSize=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", videoPath=");
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

    public C0MKG(CreativeInfo creativeInfo, ForwardMedia forwardMedia, C0MMK c0mmk, Pair pair, String str) {
        this.LIZ = creativeInfo;
        this.LIZIZ = forwardMedia;
        this.LIZJ = c0mmk;
        this.LIZLLL = pair;
        this.LJ = str;
        this.LJFF = 1;
        this.LJI = 1;
    }
}
