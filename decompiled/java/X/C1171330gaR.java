package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX INFO: renamed from: X.0gaR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1171330gaR extends AbstractC1386130mAt<C1171330gaR> {
    public String LJIILLIIL;
    public String LJIIZILJ;
    public String LJIJ;
    public String LJIJI;
    public String LJIJJ;
    public int LJIJJLI;
    public String LJIL;
    public String LJJ;
    public String LJJI;
    public String LJJIFFI;
    public String LJJII;
    public boolean LJJIII;

    public C1171330gaR() {
        super("create_new_collection");
        this.LJIJ = "off";
    }

    @Override // X.AbstractC1386130mAt
    public final void LJIIIIZZ() {
        String str = this.LIZLLL;
        if (str != null) {
            LJ("enter_from", str);
        }
        LJ("is_blank", this.LJIILLIIL);
        LJ("public_status", this.LJIJ);
        LJ("collection_type", this.LJIJJ);
        LJ("collection_id", this.LJIJI);
        LIZLLL(this.LJIJJLI, "is_new_tag");
        LJ("enter_type", this.LJIIZILJ);
        LJ("enter_method", this.LJIL);
        LJ("group_id", this.LJJI);
        LJ("collection_name", this.LJJIFFI);
        String str2 = this.LJJII;
        if (str2 == null) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        LJ("system_collection_type", str2);
        LJ("is_ai_name", C1529305yl.LIZ(Boolean.valueOf(this.LJJIII)));
        String str3 = this.LJJ;
        if (str3 != null) {
            LJ("favourite_enter_method", str3);
        }
    }

    public final void LJIILLIIL(Integer num) {
        this.LJIJJ = C1172580gcS.LIZ(num);
    }

    public final void LJIIZILJ(Integer num) {
        this.LJIILLIIL = String.valueOf(num);
    }

    public final void LJIJ(int i) {
        String str;
        if (i == 3) {
            str = "on";
        } else {
            str = "off";
        }
        this.LJIJ = str;
    }
}
