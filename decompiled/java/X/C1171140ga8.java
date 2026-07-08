package X;

/* JADX INFO: renamed from: X.0ga8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1171140ga8 extends AbstractC1386130mAt<C1171140ga8> {
    public String LJIILLIIL;
    public String LJIIZILJ;
    public String LJIJ;
    public Integer LJIJI;

    public C1171140ga8() {
        super("collection_add_post_click");
    }

    @Override // X.AbstractC1386130mAt
    public final void LJIIIIZZ() {
        String str = this.LIZLLL;
        if (str != null) {
            LJ("enter_from", str);
        }
        String str2 = this.LJIILLIIL;
        if (str2 != null) {
            LJ("collection_id", str2);
        }
        String str3 = this.LJIIZILJ;
        if (str3 != null) {
            LJ("collection_name", str3);
        }
        String str4 = this.LJIJ;
        if (str4 != null) {
            LJ("enter_method", str4);
        }
        Integer num = this.LJIJI;
        if (num != null) {
            LIZLLL(num.intValue(), "collection_cnt");
        }
    }
}
