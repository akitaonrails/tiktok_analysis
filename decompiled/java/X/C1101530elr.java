package X;

/* JADX INFO: renamed from: X.0elr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1101530elr {
    public static final Object LIZ = new Object();

    public static final <E> void LIZ(C1119470fEn<E> c1119470fEn) {
        int i = c1119470fEn.LLILZ;
        int[] iArr = c1119470fEn.LLILLJJLI;
        Object[] objArr = c1119470fEn.LLILLL;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != LIZ) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        c1119470fEn.LL = false;
        c1119470fEn.LLILZ = i2;
    }
}
