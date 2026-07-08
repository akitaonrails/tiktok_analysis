package X;

/* JADX INFO: renamed from: X.0Dcc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C343040Dcc implements InterfaceC1891350zJl {
    public final boolean LL;
    public final int LLILLJJLI = 2131846496;

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public C343040Dcc(boolean z) {
        this.LL = z;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C343040Dcc)) {
            return false;
        }
        C343040Dcc c343040Dcc = (C343040Dcc) interfaceC1891350zJl;
        if (this.LL != c343040Dcc.LL || this.LLILLJJLI != c343040Dcc.LLILLJJLI) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return interfaceC1891350zJl instanceof C343040Dcc;
    }
}
