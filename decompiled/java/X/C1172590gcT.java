package X;

/* JADX INFO: renamed from: X.0gcT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1172590gcT extends AbstractC1386130mAt<C1172590gcT> {
    public String LJIILLIIL;
    public String LJIIZILJ;

    public C1172590gcT() {
        super("collection_create_failure_net");
    }

    @Override // X.AbstractC1386130mAt
    public final void LJIIIIZZ() {
        String str = this.LIZLLL;
        if (str != null) {
            LJ("enter_from", str);
        }
        String str2 = this.LJIILLIIL;
        if (str2 != null) {
            LJ("error_code", str2);
        }
        String str3 = this.LJIIZILJ;
        if (str3 != null) {
            LJ("error_reason", str3);
        }
    }
}
