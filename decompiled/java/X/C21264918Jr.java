package X;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.18Jr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C21264918Jr {
    public C21265318Jv LIZ;
    public boolean LIZIZ;
    public int LIZLLL;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public int LIZJ = 1;
    public boolean LJ = true;
    public boolean LJFF = true;
    public boolean LJI = true;
    public boolean LJII = true;
    public boolean LJIIIIZZ = true;

    public final void LIZ(int i, int[] iArr) {
        if (iArr.length == 0) {
            return;
        }
        if (this.LIZ == null) {
            this.LIZ = new C21265318Jv();
        }
        int length = iArr.length;
        Integer[] numArr = new Integer[length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            numArr[i2] = Integer.valueOf(iArr[i2]);
        }
        C21265318Jv c21265318Jv = this.LIZ;
        c21265318Jv.getClass();
        if (length != 0) {
            Map<Integer, Set<Integer>> map = c21265318Jv.LIZ;
            Integer numValueOf = Integer.valueOf(i);
            LinkedHashMap linkedHashMap = (LinkedHashMap) map;
            if (linkedHashMap.get(numValueOf) == null) {
                linkedHashMap.put(numValueOf, C13LQ.LJLIIL(numArr));
            }
        }
    }
}
