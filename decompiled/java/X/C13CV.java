package X;

/* JADX INFO: renamed from: X.13CV, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13CV {
    public static final Object[] LIZIZ(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 2];
        C13DL.LJ(objArr, objArr2, 0, i, 6);
        int i2 = i + 2;
        System.arraycopy(objArr, i2, objArr2, i, objArr.length - i2);
        return objArr2;
    }

    public static final Object[] LIZ(int i, Object obj, Object obj2, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length + 2];
        C13DL.LJ(objArr, objArr2, 0, i, 6);
        System.arraycopy(objArr, i, objArr2, i + 2, objArr.length - i);
        objArr2[i] = obj;
        objArr2[i + 1] = obj2;
        return objArr2;
    }
}
