package X;

/* JADX INFO: renamed from: X.0rsB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1605170rsB {
    public static final void LIZ(C2344009Gk c2344009Gk, C1605200rsE c1605200rsE) {
        Integer numValueOf;
        c2344009Gk.LJIIIIZZ("enter_from", c1605200rsE.LIZ);
        c2344009Gk.LJIIIIZZ("previous_page", c1605200rsE.LIZIZ);
        c2344009Gk.LJIIIIZZ("card_position", c1605200rsE.LIZJ.getValue());
        c2344009Gk.LIZJ(c1605200rsE.LIZLLL, "card_index");
        c2344009Gk.LIZJ(c1605200rsE.LJ ? 1 : 0, "is_first_screen");
        c2344009Gk.LJIIIIZZ("group_id", c1605200rsE.LJFF);
        c2344009Gk.LJIIIIZZ("author_id", c1605200rsE.LJI);
        c2344009Gk.LJIIIIZZ("request_id", c1605200rsE.LJII);
        c2344009Gk.LIZJ(c1605200rsE.LJIIIIZZ, "aweme_type");
        c2344009Gk.LJ(c1605200rsE.LJIIIZ, "description_length");
        c2344009Gk.LJ(c1605200rsE.LJIIJ, "displayed_description_length");
        c2344009Gk.LJ(c1605200rsE.LJIIJJI, "displayed_title_length");
        Boolean bool = c1605200rsE.LJIIL;
        if (bool != null) {
            numValueOf = Integer.valueOf(bool.booleanValue() ? 1 : 0);
        } else {
            numValueOf = null;
        }
        c2344009Gk.LJ(numValueOf, "is_description_title");
        c2344009Gk.LJ(c1605200rsE.LJIILIIL, "is_inspiration_added");
        c2344009Gk.LJ(c1605200rsE.LJIILJJIL, "no_hashtag_description_length");
        c2344009Gk.LJ(c1605200rsE.LJIILL, "title_length");
        c2344009Gk.LJ(c1605200rsE.LJIILLIIL, "is_photo_text_added");
        c2344009Gk.LJ(c1605200rsE.LJIIZILJ, "model_source");
        c2344009Gk.LJ(c1605200rsE.LJIJ, "session_id");
        c2344009Gk.LJ(c1605200rsE.LJIJI, "is_first_refresh");
    }
}
