package X;

/* JADX INFO: renamed from: X.0gZk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1170900gZk extends AbstractC1386130mAt<C1170900gZk> {
    public String LJIILLIIL;
    public String LJIIZILJ;
    public int LJIJ;
    public String LJIJI;

    public C1170900gZk() {
        super("enter_new_collection_creation");
    }

    @Override // X.AbstractC1386130mAt
    public final void LJIIIIZZ() {
        String str = this.LIZLLL;
        if (str != null) {
            LJ("enter_from", str);
        }
        String str2 = this.LJIIZILJ;
        if (str2 != null) {
            LJ("enter_type", str2);
        }
        String str3 = this.LJIJI;
        if (str3 != null) {
            LJ("enter_method", str3);
        }
        LIZLLL(this.LJIJ, "is_new_tag");
        LJ("favourite_enter_method", this.LJIILLIIL);
    }
}
