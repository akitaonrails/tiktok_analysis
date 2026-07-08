package X;

/* JADX INFO: renamed from: X.0auJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C953010auJ<T1, T2, T3, R> implements InterfaceC1487280oo2<Object[], R> {
    public final InterfaceC953020auK<T1, T2, T3, R> LL;

    public C953010auJ(InterfaceC953020auK<T1, T2, T3, R> interfaceC953020auK) {
        this.LL = interfaceC953020auK;
    }

    @Override // X.InterfaceC1487280oo2
    public final Object apply(Object[] objArr) {
        Object[] objArr2 = objArr;
        if (objArr2.length == 3) {
            return this.LL.LIZ((T1) objArr2[0], (T2) objArr2[1], (T3) objArr2[2]);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Array of size 3 expected but got ");
        sbLIZ.append(objArr2.length);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }
}
