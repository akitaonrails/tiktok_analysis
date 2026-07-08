package X;

import Y.AComparatorS50S0000000_31;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15Yy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20540215Yy {
    public final Map<C15YM, Boolean> LIZ;
    public final Map<C15YM, Integer> LIZIZ;
    public final Map<C15YM, Long> LIZJ;
    public final Map<C15YM, String> LIZLLL;
    public final Set<C15YM> LJ;

    public C20540215Yy() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20540215Yy)) {
            return false;
        }
        C20540215Yy c20540215Yy = (C20540215Yy) obj;
        return Intrinsics.LJFF(this.LIZ, c20540215Yy.LIZ) && Intrinsics.LJFF(this.LIZIZ, c20540215Yy.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c20540215Yy.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c20540215Yy.LIZLLL) && Intrinsics.LJFF(this.LJ, c20540215Yy.LJ);
    }

    public final int hashCode() {
        return (((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DeltaDataToUpdate(deltaBooleans=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", deltaInts=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", deltaLongs=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", deltaStrings=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", deltaRemovals=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C20540215Yy(int i) {
        TreeMap treeMap = new TreeMap(new AComparatorS50S0000000_31(8));
        TreeMap treeMap2 = new TreeMap(new AComparatorS50S0000000_31(9));
        TreeMap treeMap3 = new TreeMap(new AComparatorS50S0000000_31(10));
        TreeMap treeMap4 = new TreeMap(new AComparatorS50S0000000_31(11));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.LIZ = treeMap;
        this.LIZIZ = treeMap2;
        this.LIZJ = treeMap3;
        this.LIZLLL = treeMap4;
        this.LJ = linkedHashSet;
    }
}
