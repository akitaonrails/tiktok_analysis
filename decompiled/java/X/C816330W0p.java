package X;

import android.util.SparseArray;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0W0p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C816330W0p {
    public static final SparseArray<EnumC816340W0q> LIZ = new SparseArray<>();
    public static final HashMap<EnumC816340W0q, Integer> LIZIZ;

    static {
        HashMap<EnumC816340W0q, Integer> map = new HashMap<>();
        LIZIZ = map;
        map.put(EnumC816340W0q.DEFAULT, 0);
        map.put(EnumC816340W0q.VERY_LOW, 1);
        map.put(EnumC816340W0q.HIGHEST, 2);
        for (EnumC816340W0q enumC816340W0q : map.keySet()) {
            LIZ.append(LIZIZ.get(enumC816340W0q).intValue(), enumC816340W0q);
        }
    }

    public static int LIZ(EnumC816340W0q enumC816340W0q) {
        Integer num = LIZIZ.get(enumC816340W0q);
        if (num != null) {
            return num.intValue();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PriorityMapping is missing known Priority value ");
        sbLIZ.append(enumC816340W0q);
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static EnumC816340W0q LIZIZ(int i) {
        EnumC816340W0q enumC816340W0q = LIZ.get(i);
        if (enumC816340W0q != null) {
            return enumC816340W0q;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Unknown Priority for value ");
        sbLIZ.append(i);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }
}
