package X;

/* JADX INFO: renamed from: X.0gbE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1171820gbE extends AbstractC1386130mAt<C1171820gbE> {
    public String LJIILLIIL;
    public String LJIIZILJ;
    public int LJIJ;

    public C1171820gbE() {
        super("favorite_bubble_show");
    }

    @Override // X.AbstractC1386130mAt
    public final void LJIIIIZZ() {
        String str = this.LIZLLL;
        if (str != null) {
            LJ("enter_from", str);
        }
        String str2 = this.LJIILLIIL;
        if (str2 != null) {
            LJ("group_id", str2);
        }
        String str3 = this.LJIIZILJ;
        if (str3 != null) {
            LJ("bubble_type", str3);
        }
        LIZLLL(this.LJIJ, "collection_cnt");
    }
}
