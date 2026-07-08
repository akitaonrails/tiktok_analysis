package X;

/* JADX INFO: renamed from: X.0u6m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1691100u6m {
    public static final int LIZ(int i, C19968013Aw c19968013Aw) {
        int i2 = c19968013Aw.LLILLL - 1;
        int i3 = 0;
        while (i3 < i2) {
            int i4 = ((i2 - i3) / 2) + i3;
            Object[] objArr = c19968013Aw.LL;
            int i5 = ((C1691050u6h) objArr[i4]).LIZ;
            if (i5 != i) {
                if (i5 < i) {
                    i3 = i4 + 1;
                    if (i < ((C1691050u6h) objArr[i3]).LIZ) {
                    }
                } else {
                    i2 = i4 - 1;
                }
            }
            return i4;
        }
        return i3;
    }
}
