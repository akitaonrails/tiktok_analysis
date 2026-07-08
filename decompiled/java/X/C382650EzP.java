package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EzP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C382650EzP {
    public final int LIZ;
    public final C382700EzU LIZIZ;
    public final List<String> LIZJ;
    public final C375830EoP<List<C379170Etn>> LIZLLL;
    public final C375830EoP<List<C379170Etn>> LJ;
    public final C375830EoP<Unit> LJFF;
    public final boolean LJI;
    public final boolean LJII;
    public final boolean LJIIIIZZ;
    public final boolean LJIIIZ;

    public C382650EzP() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C382650EzP)) {
            return false;
        }
        C382650EzP c382650EzP = (C382650EzP) obj;
        return this.LIZ == c382650EzP.LIZ && Intrinsics.LJFF(this.LIZIZ, c382650EzP.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c382650EzP.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c382650EzP.LIZLLL) && Intrinsics.LJFF(this.LJ, c382650EzP.LJ) && Intrinsics.LJFF(this.LJFF, c382650EzP.LJFF) && this.LJI == c382650EzP.LJI && this.LJII == c382650EzP.LJII && this.LJIIIIZZ == c382650EzP.LJIIIIZZ && this.LJIIIZ == c382650EzP.LJIIIZ;
    }

    public final int hashCode() {
        int i = this.LIZ * 31;
        C382700EzU c382700EzU = this.LIZIZ;
        int iHashCode = (((i + (c382700EzU == null ? 0 : c382700EzU.hashCode())) * 31) + this.LIZJ.hashCode()) * 31;
        C375830EoP<List<C379170Etn>> c375830EoP = this.LIZLLL;
        int iHashCode2 = (iHashCode + (c375830EoP == null ? 0 : c375830EoP.hashCode())) * 31;
        C375830EoP<List<C379170Etn>> c375830EoP2 = this.LJ;
        int iHashCode3 = (iHashCode2 + (c375830EoP2 == null ? 0 : c375830EoP2.hashCode())) * 31;
        C375830EoP<Unit> c375830EoP3 = this.LJFF;
        return ((((((((iHashCode3 + (c375830EoP3 != null ? c375830EoP3.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LJI)) * 31) + C786410Ut5.Z2(this.LJII)) * 31) + C786410Ut5.Z2(this.LJIIIIZZ)) * 31) + C786410Ut5.Z2(this.LJIIIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EPAIGCPreviewStates(selectedIndex=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", currentModel=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", oldResourcePath=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", addMediaState=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", syncMediaState=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", onPanelClosed=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", isInitComplete=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", hidePreviewImageCloseBtn=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", disablePreviewImageClick=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", hidePrompt=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C382650EzP(int i) {
        this(-1, C382660EzQ.LIZIZ, C13BV.INSTANCE, null, null, null, false, false, false, false);
    }

    public C382650EzP(int i, C382700EzU c382700EzU, List<String> list, C375830EoP<List<C379170Etn>> c375830EoP, C375830EoP<List<C379170Etn>> c375830EoP2, C375830EoP<Unit> c375830EoP3, boolean z, boolean z2, boolean z3, boolean z4) {
        this.LIZ = i;
        this.LIZIZ = c382700EzU;
        this.LIZJ = list;
        this.LIZLLL = c375830EoP;
        this.LJ = c375830EoP2;
        this.LJFF = c375830EoP3;
        this.LJI = z;
        this.LJII = z2;
        this.LJIIIIZZ = z3;
        this.LJIIIZ = z4;
    }

    public static C382650EzP LIZ(C382650EzP c382650EzP, int i, C382700EzU c382700EzU, C375830EoP c375830EoP, C375830EoP c375830EoP2, C375830EoP c375830EoP3, boolean z, boolean z2, boolean z3, boolean z4, int i2) {
        List<String> list;
        boolean z5 = z4;
        boolean z6 = z3;
        boolean z7 = z2;
        boolean z8 = z;
        C375830EoP c375830EoP4 = c375830EoP3;
        C375830EoP c375830EoP5 = c375830EoP2;
        C375830EoP c375830EoP6 = c375830EoP;
        C382700EzU c382700EzU2 = c382700EzU;
        int i3 = i;
        if ((i2 & 1) != 0) {
            i3 = c382650EzP.LIZ;
        }
        if ((i2 & 2) != 0) {
            c382700EzU2 = c382650EzP.LIZIZ;
        }
        if ((i2 & 4) != 0) {
            list = c382650EzP.LIZJ;
        } else {
            list = null;
        }
        if ((i2 & 8) != 0) {
            c375830EoP6 = c382650EzP.LIZLLL;
        }
        if ((i2 & 16) != 0) {
            c375830EoP5 = c382650EzP.LJ;
        }
        if ((i2 & 32) != 0) {
            c375830EoP4 = c382650EzP.LJFF;
        }
        if ((i2 & 64) != 0) {
            z8 = c382650EzP.LJI;
        }
        if ((i2 & 128) != 0) {
            z7 = c382650EzP.LJII;
        }
        if ((i2 & 256) != 0) {
            z6 = c382650EzP.LJIIIIZZ;
        }
        if ((i2 & 512) != 0) {
            z5 = c382650EzP.LJIIIZ;
        }
        c382650EzP.getClass();
        return new C382650EzP(i3, c382700EzU2, list, c375830EoP6, c375830EoP5, c375830EoP4, z8, z7, z6, z5);
    }
}
