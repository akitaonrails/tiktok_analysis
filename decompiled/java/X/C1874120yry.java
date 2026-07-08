package X;

/* JADX INFO: renamed from: X.0yry, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public class C1874120yry implements InterfaceC1891350zJl {
    public final EnumC1874080yru LL;

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public C1874120yry(EnumC1874080yru enumC1874080yru) {
        this.LL = enumC1874080yru;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C1874120yry)) {
            return false;
        }
        return this.LL.areContentsTheSame(((C1874120yry) interfaceC1891350zJl).LL);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C1874120yry)) {
            return false;
        }
        return this.LL.areItemTheSame(((C1874120yry) interfaceC1891350zJl).LL);
    }
}
