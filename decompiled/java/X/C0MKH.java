package X;

import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0MKH, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MKH implements C0MMS {
    public final CreativeInfo LIZ;
    public final ForwardMedia LIZIZ;
    public final C0MMK LIZJ;
    public final C0MMG LIZLLL;
    public final Pair<Integer, Integer> LJ;
    public final int LJFF;
    public final int LJI = 8;
    public final int LJII = 3;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0MKH)) {
            return false;
        }
        C0MKH c0mkh = (C0MKH) obj;
        return Intrinsics.LJFF(this.LIZ, c0mkh.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0mkh.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0mkh.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c0mkh.LIZLLL) && Intrinsics.LJFF(this.LJ, c0mkh.LJ) && this.LJFF == c0mkh.LJFF && this.LJI == c0mkh.LJI && this.LJII == c0mkh.LJII;
    }

    public final int hashCode() {
        return (((((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + this.LJFF) * 31) + this.LJI) * 31) + this.LJII;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ForwardCanvasDataWrapperV2(creativeInfo=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", sourceMedia=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", forwardConfig=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", canvasMediaInfo=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", screenSize=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", originVideoAIGCLabelType=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", forwardType=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", shareToStoryMediaType=");
        sbLIZ.append(this.LJII);
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

    public C0MKH(CreativeInfo creativeInfo, ForwardMedia forwardMedia, C0MMK c0mmk, C0MMG c0mmg, Pair pair, int i) {
        this.LIZ = creativeInfo;
        this.LIZIZ = forwardMedia;
        this.LIZJ = c0mmk;
        this.LIZLLL = c0mmg;
        this.LJ = pair;
        this.LJFF = i;
    }
}
