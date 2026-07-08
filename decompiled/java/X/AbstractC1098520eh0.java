package X;

import java.util.UUID;

/* JADX INFO: renamed from: X.0eh0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC1098520eh0 implements InterfaceC1102300en6, InterfaceC1102060emi {
    public final String LIZ;

    @Override // X.InterfaceC1102300en6
    public final void LJIIL() {
    }

    @Override // X.InterfaceC1102300en6
    public String LJIILL() {
        return null;
    }

    @Override // X.InterfaceC1102300en6
    public String Wc() {
        return null;
    }

    @Override // X.InterfaceC1102300en6
    public String cd() {
        return null;
    }

    public AbstractC1098520eh0() {
        C1102250en1.LIZ.getClass();
        this.LIZ = UUID.randomUUID().toString();
    }

    @Override // X.InterfaceC1102060emi
    public final String getId() {
        return this.LIZ;
    }
}
