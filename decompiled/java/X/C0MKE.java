package X;

import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0MKE, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MKE implements C0MMS {
    public final CreativeInfo LIZ;
    public final ForwardMedia LIZIZ;
    public final C0MMK LIZJ;
    public final C0MMG LIZLLL;
    public final C0MM6 LJ;
    public final Pair<Integer, Integer> LJFF;
    public final int LJI;
    public final int LJII;
    public final int LJIIIIZZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0MKE)) {
            return false;
        }
        C0MKE c0mke = (C0MKE) obj;
        return Intrinsics.LJFF(this.LIZ, c0mke.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0mke.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0mke.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c0mke.LIZLLL) && Intrinsics.LJFF(this.LJ, c0mke.LJ) && Intrinsics.LJFF(this.LJFF, c0mke.LJFF) && this.LJI == c0mke.LJI && this.LJII == c0mke.LJII && this.LJIIIIZZ == c0mke.LJIIIIZZ;
    }

    public final int hashCode() {
        int iHashCode = ((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31;
        C0MM6 c0mm6 = this.LJ;
        return ((((((((iHashCode + (c0mm6 == null ? 0 : c0mm6.hashCode())) * 31) + this.LJFF.hashCode()) * 31) + this.LJI) * 31) + this.LJII) * 31) + this.LJIIIIZZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ForwardCanvasDataWrapper(creativeInfo=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", sourceMedia=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", forwardConfig=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", canvasMediaInfo=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", styleConfig=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", screenSize=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", originVideoAIGCLabelType=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", forwardType=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", shareToStoryMediaType=");
        sbLIZ.append(this.LJIIIIZZ);
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

    public C0MKE(CreativeInfo creativeInfo, ForwardMedia forwardMedia, C0MMK c0mmk, C0MMG c0mmg, C0MM6 c0mm6, Pair<Integer, Integer> pair, int i, int i2, int i3) {
        this.LIZ = creativeInfo;
        this.LIZIZ = forwardMedia;
        this.LIZJ = c0mmk;
        this.LIZLLL = c0mmg;
        this.LJ = c0mm6;
        this.LJFF = pair;
        this.LJI = i;
        this.LJII = i2;
        this.LJIIIIZZ = i3;
    }

    public /* synthetic */ C0MKE(CreativeInfo creativeInfo, ForwardMedia forwardMedia, C0MMK c0mmk, C0MMG c0mmg, C0MM6 c0mm6, Pair pair, int i, int i2, int i3, int i4) {
        this(creativeInfo, forwardMedia, c0mmk, c0mmg, c0mm6, pair, (i4 & 64) != 0 ? 0 : i, (i4 & 128) != 0 ? 1 : i2, (i4 & 256) != 0 ? 0 : i3);
    }
}
