package X;

/* JADX INFO: renamed from: X.0MdN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC572830MdN<V> implements InterfaceC608270NtR<Object, V> {
    public V LL;

    public abstract V LIZ(String str);

    public abstract void LIZIZ(Object obj, String str);

    @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
    public final V getValue(Object obj, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
        V vLIZ = this.LL;
        if (vLIZ == null) {
            vLIZ = LIZ(interfaceC2217461Bqa.getName());
            if (vLIZ != null) {
                this.LL = vLIZ;
            } else {
                return null;
            }
        }
        return vLIZ;
    }

    @Override // X.InterfaceC608270NtR
    public final void setValue(Object obj, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, V v) {
        LIZIZ(v, interfaceC2217461Bqa.getName());
        this.LL = v;
    }
}
