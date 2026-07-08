package X;

/* JADX INFO: renamed from: X.0sSZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1627730sSZ<T1, T2, R> implements InterfaceC1487280oo2<Object[], R> {
    public final InterfaceC500500Jk0<? super T1, ? super T2, ? extends R> LL;

    public C1627730sSZ(InterfaceC500500Jk0<? super T1, ? super T2, ? extends R> interfaceC500500Jk0) {
        this.LL = interfaceC500500Jk0;
    }

    @Override // X.InterfaceC1487280oo2
    public final Object apply(Object[] objArr) {
        Object[] objArr2 = objArr;
        if (objArr2.length == 2) {
            return this.LL.apply(objArr2[0], objArr2[1]);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Array of size 2 expected but got ");
        sbLIZ.append(objArr2.length);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }
}
