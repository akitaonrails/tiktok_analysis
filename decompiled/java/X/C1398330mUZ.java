package X;

/* JADX INFO: renamed from: X.0mUZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1398330mUZ extends AbstractC1386130mAt<C1398330mUZ> {
    public String LJIILLIIL;
    public Integer LJIIZILJ;
    public String LJIJ;
    public String LJIJI;
    public Integer LJIJJ;
    public String LJIJJLI;
    public String LJIL;
    public String LJJ;
    public String LJJI;
    public String LJJIFFI;
    public String LJJII;
    public String LJJIII;
    public String LJJIIJ;
    public String LJJIIJZLJL;
    public String LJJIIZ;
    public String LJJIIZI;

    public C1398330mUZ() {
        super("shoot");
    }

    @Override // X.AbstractC1386130mAt
    public final void LJIIIIZZ() {
        String str = this.LJIILLIIL;
        if (str != null) {
            LJ("followup_square_action_position", str);
        }
        Integer num = this.LJIIZILJ;
        if (num != null) {
            LIZLLL(num.intValue(), "is_from_followup_square_original_video");
        }
        String str2 = this.LJIJ;
        if (str2 != null) {
            LJ("followup_square_recommend_type", str2);
        }
        String str3 = this.LJIJI;
        if (str3 != null) {
            LJ("followup_square_recommend_reason", str3);
        }
        Integer num2 = this.LJIJJ;
        if (num2 != null && num2.intValue() > 0) {
            LIZLLL(num2.intValue(), "followup_square_video_rank");
        }
        String str4 = this.LJIJJLI;
        if (str4 != null) {
            LJ("group_id", str4);
        }
        String str5 = this.LJIL;
        if (str5 != null) {
            LJ("from_group_id", str5);
        }
        String str6 = this.LJJ;
        if (str6 != null) {
            LJ("last_group_id", str6);
        }
        String str7 = this.LJJI;
        if (str7 != null) {
            LJ("creation_id", str7);
        }
        String str8 = this.LJJIFFI;
        if (str8 != null) {
            LJ("meta_song_id", str8);
        }
        String str9 = this.LJJII;
        if (str9 != null) {
            LJ("music_id", str9);
        }
        String str10 = this.LJJIII;
        if (str10 != null) {
            LJ("prop_id", str10);
        }
        String str11 = this.LJJIIJ;
        if (str11 != null) {
            LJ("tt_template_id", str11);
        }
        String str12 = this.LJJIIJZLJL;
        if (str12 != null) {
            LJ("enter_from", str12);
        }
        String str13 = this.LJJIIZ;
        if (str13 != null) {
            LJ("shoot_way", str13);
        }
        String str14 = this.LJJIIZI;
        if (str14 != null) {
            LJ("music_selected_from", str14);
        }
    }
}
