package X;

/* JADX INFO: renamed from: X.0aqM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C950560aqM<T1, T2, T3, T4, R> implements InterfaceC1487280oo2<Object[], R> {
    public final InterfaceC941150abB<T1, T2, T3, T4, R> LL;

    public C950560aqM(InterfaceC941150abB<T1, T2, T3, T4, R> interfaceC941150abB) {
        this.LL = interfaceC941150abB;
    }

    @Override // X.InterfaceC1487280oo2
    public final Object apply(Object[] objArr) {
        Object[] objArr2 = objArr;
        if (objArr2.length == 4) {
            return this.LL.LIZ((T1) objArr2[0], (T2) objArr2[1], (T3) objArr2[2], (T4) objArr2[3]);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Array of size 4 expected but got ");
        sbLIZ.append(objArr2.length);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }
}
