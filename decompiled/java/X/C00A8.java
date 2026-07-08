package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00A8, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00A8 {
    public final String LIZ;
    public final String LIZIZ;
    public final C00A3 LIZJ;
    public final List<C118900cl> LIZLLL;
    public final float LJ;
    public final long LJFF;
    public final Map<String, Object> LJI;
    public final List<String> LJII;
    public final C00A6 LJIIIIZZ;
    public final List<AnonymousClass0055> LJIIIZ;
    public final String LJIIJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C00A8)) {
            return false;
        }
        C00A8 c00a8 = (C00A8) obj;
        return Intrinsics.LJFF(this.LIZ, c00a8.LIZ) && Intrinsics.LJFF(this.LIZIZ, c00a8.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c00a8.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c00a8.LIZLLL) && Float.compare(this.LJ, c00a8.LJ) == 0 && this.LJFF == c00a8.LJFF && Intrinsics.LJFF(this.LJI, c00a8.LJI) && Intrinsics.LJFF(this.LJII, c00a8.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c00a8.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c00a8.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c00a8.LJIIJ);
    }

    public final String toString() {
        return "MediaCluster(clusterId=" + this.LIZ + ", strategyName=" + this.LIZIZ + ", theme=" + this.LIZJ + ", assets=" + this.LIZLLL + ", score=" + this.LJ + ", creationTime=" + this.LJFF + ", metadata=" + this.LJI + ", orderedAssetIds=" + this.LJII + ", pipelineTrace=" + this.LJIIIIZZ + ", errors=" + this.LJIIIZ + ", pickId=" + this.LJIIJ + ')';
    }

    public final List<C118900cl> LIZ() {
        List<String> list = this.LJII;
        if (list == null) {
            return this.LIZLLL;
        }
        List<C118900cl> list2 = this.LIZLLL;
        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(list2, 10));
        if (iLIZIZ < 16) {
            iLIZIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
        for (C118900cl c118900cl : list2) {
            linkedHashMap.put(c118900cl.LIZ.id, c118900cl);
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it2 = list.iterator();
        while (it2.hasNext()) {
            Object obj = linkedHashMap.get(it2.next());
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + Float.floatToIntBits(this.LJ)) * 31) + C786410Ut5.Y2(this.LJFF)) * 31) + this.LJI.hashCode()) * 31;
        List<String> list = this.LJII;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        C00A6 c00a6 = this.LJIIIIZZ;
        int iHashCode3 = (((iHashCode2 + (c00a6 == null ? 0 : c00a6.hashCode())) * 31) + this.LJIIIZ.hashCode()) * 31;
        String str = this.LJIIJ;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public C00A8(String str, String str2, C00A3 c00a3, List list, long j, Map map) {
        this(str, str2, c00a3, list, 1.0f, j, map, null, null, C13BV.INSTANCE, null);
    }

    public C00A8(String str, String str2, C00A3 c00a3, List<C118900cl> list, float f, long j, Map<String, ? extends Object> map, List<String> list2, C00A6 c00a6, List<AnonymousClass0055> list3, String str3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = c00a3;
        this.LIZLLL = list;
        this.LJ = f;
        this.LJFF = j;
        this.LJI = map;
        this.LJII = list2;
        this.LJIIIIZZ = c00a6;
        this.LJIIIZ = list3;
        this.LJIIJ = str3;
    }
}
