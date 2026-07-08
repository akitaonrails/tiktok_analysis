package X;

import android.util.SparseArray;

/* JADX INFO: renamed from: X.08PI, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08PI {
    public static final SparseArray<C08PQ> LIZ = new SparseArray<>();

    public static void LIZ(int i, C08PQ c08pq) {
        SparseArray<C08PQ> sparseArray = LIZ;
        C08PQ c08pq2 = sparseArray.get(i);
        if (c08pq2 != null) {
            throw new RuntimeException(C786410Ut5.j4("%s had been register.", new Object[]{c08pq2.toString()}));
        }
        sparseArray.put(i, c08pq);
    }
}
