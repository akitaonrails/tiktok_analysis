package X;

/* JADX INFO: renamed from: X.19kO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public abstract class AbstractC21626619kO implements InterfaceC21543319St {
    public final InterfaceC21627219kU LIZ;

    public abstract boolean LIZIZ();

    public AbstractC21626619kO(InterfaceC21627219kU interfaceC21627219kU) {
        this.LIZ = interfaceC21627219kU;
    }

    @Override // X.InterfaceC21543319St
    public final boolean LIZ(int i, CharSequence charSequence) {
        if (charSequence != null && i >= 0 && charSequence.length() - i >= 0) {
            InterfaceC21627219kU interfaceC21627219kU = this.LIZ;
            if (interfaceC21627219kU == null) {
                return LIZIZ();
            }
            int iLIZ = interfaceC21627219kU.LIZ(i, charSequence);
            if (iLIZ == 0) {
                return true;
            }
            if (iLIZ != 1) {
                return LIZIZ();
            }
            return false;
        }
        throw new IllegalArgumentException();
    }
}
