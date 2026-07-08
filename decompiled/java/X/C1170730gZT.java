package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX INFO: renamed from: X.0gZT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1170730gZT extends AbstractC1386130mAt<C1170730gZT> {
    public String LJIILLIIL;
    public String LJIIZILJ;
    public String LJIJ;
    public String LJIJI;
    public String LJIJJ;
    public String LJIJJLI;
    public String LJIL;
    public int LJJ;
    public String LJJI;
    public String LJJIFFI;

    public C1170730gZT() {
        super("collection_add_videos");
        this.LJIL = "";
        this.LJJ = 1;
        this.LJJI = "off";
    }

    @Override // X.AbstractC1386130mAt
    public final void LJIIIIZZ() {
        String str = this.LIZLLL;
        if (str != null) {
            LJ("enter_from", str);
        }
        LJ("public_status", this.LJJI);
        LJ("collection_type", this.LJIJJLI);
        LJ("enter_method", this.LJIIZILJ);
        LJ("collection_id", this.LJIJI);
        LJ("collection_name", this.LJIJJ);
        String str2 = this.LJJIFFI;
        if (str2 == null) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        LJ("system_collection_type", str2);
        LJ("group_id_list", this.LJIL);
        LIZLLL(this.LJJ, "video_cnt");
        LJ("previous_page", this.LJIJ);
        LJ("favourite_enter_method", this.LJIILLIIL);
    }

    public final void LJIILLIIL(Integer num) {
        String str;
        if (num != null && num.intValue() == 3) {
            str = "on";
        } else {
            str = "off";
        }
        this.LJJI = str;
    }
}
