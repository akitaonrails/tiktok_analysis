package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.0nir, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1445630nir {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(VideoPublishEditModel videoPublishEditModel, C0LAB c0lab) {
        int i;
        if (C1428470nHB.LJJZZI(videoPublishEditModel) && videoPublishEditModel.creativeModel.editPostModel != null) {
            i = 1;
        } else {
            i = 0;
        }
        c0lab.LIZ(i, "is_edit_post");
    }

    public static void LIZIZ(C0LAB c0lab, C1445640nis c1445640nis) {
        c0lab.LIZ(c1445640nis.LIZ, "is_edit_take_effect");
        c0lab.LIZ(c1445640nis.LIZIZ, "is_title_edited");
        c0lab.LIZ(c1445640nis.LIZJ, "is_description_edited");
        c0lab.LIZ(c1445640nis.LIZLLL, "is_photo_deleted");
        c0lab.LIZ(c1445640nis.LJ, "is_photo_reordered");
        c0lab.LIZ(c1445640nis.LJFF, "is_photo_edited");
        c0lab.LIZ(c1445640nis.LJI, "is_cover_changed");
        c0lab.LIZ(c1445640nis.LJII, "is_photo_modify_added");
        c0lab.LIZ(c1445640nis.LJIIIIZZ, "is_photo_text_sticker_added");
        c0lab.LIZ(c1445640nis.LJIIIZ, "is_photo_template_added");
        c0lab.LIZ(c1445640nis.LJIIJ, "is_photo_sticker_added");
    }
}
