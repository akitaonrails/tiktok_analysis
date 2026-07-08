package X;

/* JADX INFO: renamed from: X.13qd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20136513qd<T> implements InterfaceC608270NtR<Object, T> {
    public T LL;

    public final String toString() {
        String strLIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NotNullProperty(");
        if (this.LL != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("value=");
            sbLIZ2.append(this.LL);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        } else {
            strLIZIZ = "value not initialized yet";
        }
        sbLIZ.append(strLIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
    public final T getValue(Object obj, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
        T t = this.LL;
        if (t != null) {
            return t;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Property ");
        sbLIZ.append(interfaceC2217461Bqa.getName());
        sbLIZ.append(" should be initialized before get.");
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC608270NtR
    public final void setValue(Object obj, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, T t) {
        this.LL = t;
    }
}
