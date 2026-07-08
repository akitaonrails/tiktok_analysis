package X;

/* JADX INFO: renamed from: X.0NTU, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public abstract class C0NTU<V> implements InterfaceC608270NtR<Object, V> {
    public V LL;

    public abstract void LIZ(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa, Object obj2);

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ObservableProperty(value=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0NTU(V v) {
        this.LL = v;
    }

    @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
    public final V getValue(Object obj, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
        return this.LL;
    }

    @Override // X.InterfaceC608270NtR
    public final void setValue(Object obj, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, V v) {
        V v2 = this.LL;
        this.LL = v;
        LIZ(v2, interfaceC2217461Bqa, v);
    }
}
