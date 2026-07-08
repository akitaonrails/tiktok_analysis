package X;

/* JADX INFO: renamed from: X.04DX, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C04DX implements InterfaceC1891350zJl {
    public final boolean LL;

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public C04DX(boolean z) {
        this.LL = z;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if ((interfaceC1891350zJl instanceof C04DX) && ((C04DX) interfaceC1891350zJl).LL == this.LL) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return interfaceC1891350zJl instanceof C04DX;
    }
}
