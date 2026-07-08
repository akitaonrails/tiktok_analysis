package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.model.AVETParameter;
import java.util.Map;
import kotlin.jvm.internal.AwS552S0100000_8;

/* JADX INFO: renamed from: X.0oAc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1462840oAc implements C123N {
    public final AVETParameter LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 372));

    public final C0LAB LJIIIZ() {
        return (C0LAB) this.LIZIZ.getValue();
    }

    public C1462840oAc(AVETParameter aVETParameter) {
        this.LIZ = aVETParameter;
    }

    @Override // X.C123N
    public final void LIZ(String str) {
        C0LAB c0labLJIIIZ = LJIIIZ();
        c0labLJIIIZ.LJ("font", str);
        c0labLJIIIZ.LIZ(0, "is_editor_pro");
        c0labLJIIIZ.LIZ(0, "is_photo_editor");
        c0labLJIIIZ.LJ("enter_way", "edit_page_text_sidebar");
        C2341909Fp.LIZ("select_text_font", c0labLJIIIZ.LIZ);
    }

    @Override // X.C123N
    public final void LIZIZ(C1462850oAd c1462850oAd) {
        C0LAB c0labLJIIIZ = LJIIIZ();
        c0labLJIIIZ.LIZ(c1462850oAd.LJIIIIZZ, "is_toasted");
        c0labLJIIIZ.LIZ(c1462850oAd.LJIIJJI, "is_cover_add_text");
        c0labLJIIIZ.LIZ(c1462850oAd.LJIIL, "is_cover_upload");
        c0labLJIIIZ.LIZ(c1462850oAd.LJIILL, "is_cover_edit");
        c0labLJIIIZ.LIZ(c1462850oAd.LJIILIIL, "is_cover_crop");
        c0labLJIIIZ.LIZ(c1462850oAd.LJIILJJIL, "is_cover_change_frame");
        C2341909Fp.LIZ("cancel_cover_edit", c0labLJIIIZ.LIZ);
    }

    @Override // X.C123N
    public final void LIZJ(String str) {
        C0LAB c0labLJIIIZ = LJIIIZ();
        c0labLJIIIZ.LJ("paragraph_style", str);
        c0labLJIIIZ.LJ("enter_way", "edit_page_text_sidebar");
        c0labLJIIIZ.LIZ(0, "is_editor_pro");
        c0labLJIIIZ.LIZ(0, "is_photo_editor");
        C2341909Fp.LIZ("select_text_paragraph", c0labLJIIIZ.LIZ);
    }

    @Override // X.C123N
    public final void LIZLLL(C1462850oAd c1462850oAd) {
        String str;
        String str2;
        if (C0CHQ.LIZ().getAccountService().LIZ()) {
            return;
        }
        C0LAB c0labLJIIIZ = LJIIIZ();
        c0labLJIIIZ.LJ("text_id", c1462850oAd.LIZIZ);
        c0labLJIIIZ.LJ("font_id", c1462850oAd.LIZJ);
        c0labLJIIIZ.LJ("font_name", c1462850oAd.LIZLLL);
        c0labLJIIIZ.LJ("text_color", c1462850oAd.LJ);
        c0labLJIIIZ.LJ("text_style", c1462850oAd.LJFF);
        c0labLJIIIZ.LIZ(c1462850oAd.LJI, "is_text");
        c0labLJIIIZ.LIZ(c1462850oAd.LJII, "is_pic_adjust");
        c0labLJIIIZ.LIZ(c1462850oAd.LJIIJJI, "is_cover_add_text");
        c0labLJIIIZ.LIZ(c1462850oAd.LJIIL, "is_cover_upload");
        c0labLJIIIZ.LIZ(c1462850oAd.LJIILL, "is_cover_edit");
        c0labLJIIIZ.LIZ(c1462850oAd.LJIILIIL, "is_cover_crop");
        c0labLJIIIZ.LIZ(c1462850oAd.LJIILJJIL, "is_cover_change_frame");
        if (c1462850oAd.LIZ) {
            str = "edit_post_page";
        } else {
            str = "video_post_page";
        }
        c0labLJIIIZ.LJ("enter_from", str);
        if (c1462850oAd.LIZ) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c0labLJIIIZ.LJ("after_post", str2);
        Map<String, String> map = c0labLJIIIZ.LIZ;
        Integer num = c1462850oAd.LJIILLIIL;
        if (num != null) {
            map.put("aweme_type", String.valueOf(num));
        }
        C2341909Fp.LIZ("save_cover_edit", map);
    }

    @Override // X.C123N
    public final void LJ(C1462850oAd c1462850oAd) {
        C0LAB c0labLJIIIZ = LJIIIZ();
        c0labLJIIIZ.LJ("text_id", c1462850oAd.LIZIZ);
        c0labLJIIIZ.LJ("enter_from", "edit_cover_page");
        c0labLJIIIZ.LIZ(c1462850oAd.LJIIIZ, "is_standard");
        C2341909Fp.LIZ("select_cover_text_type", c0labLJIIIZ.LIZ);
    }

    @Override // X.C123N
    public final void LJFF(C1462850oAd c1462850oAd) {
        C0LAB c0labLJIIIZ = LJIIIZ();
        c0labLJIIIZ.LJ("text_id", c1462850oAd.LIZIZ);
        c0labLJIIIZ.LJ("font_id", c1462850oAd.LIZJ);
        c0labLJIIIZ.LJ("font_name", c1462850oAd.LIZLLL);
        c0labLJIIIZ.LJ("text_color", c1462850oAd.LJ);
        c0labLJIIIZ.LJ("text_style", c1462850oAd.LJFF);
        c0labLJIIIZ.LIZ(c1462850oAd.LJIIIZ, "is_standard");
        c0labLJIIIZ.LJ("enter_method", c1462850oAd.LJIIJ);
        c0labLJIIIZ.LIZ(c1462850oAd.LJIIJJI, "is_cover_add_text");
        C2341909Fp.LIZ("complete_cover_text", c0labLJIIIZ.LIZ);
    }

    @Override // X.C123N
    public final void LJI(int i) {
        C0LAB c0labLJIIIZ = LJIIIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("");
        sbLIZ.append(Integer.toHexString(i));
        c0labLJIIIZ.LJ("color", C2188811AlT.LIZIZ(sbLIZ));
        c0labLJIIIZ.LIZ(0, "is_editor_pro");
        c0labLJIIIZ.LIZ(0, "is_photo_editor");
        c0labLJIIIZ.LJ("enter_way", "edit_page_text_sidebar");
        C2341909Fp.LIZ("select_text_color", c0labLJIIIZ.LIZ);
    }

    @Override // X.C123N
    public final void LJII(C1462850oAd c1462850oAd) {
        C0LAB c0labLJIIIZ = LJIIIZ();
        c0labLJIIIZ.LJ("text_id", c1462850oAd.LIZIZ);
        c0labLJIIIZ.LJ("enter_method", c1462850oAd.LJIIJ);
        C2341909Fp.LIZ("edit_cover_text", c0labLJIIIZ.LIZ);
    }

    @Override // X.C123N
    public final void LJIIIIZZ(int i) {
        C0LAB c0labLJIIIZ = LJIIIZ();
        c0labLJIIIZ.LIZ(i, "text_style");
        c0labLJIIIZ.LJ("enter_way", "edit_page_text_sidebar");
        c0labLJIIIZ.LIZ(0, "is_editor_pro");
        c0labLJIIIZ.LIZ(0, "is_photo_editor");
        C2341909Fp.LIZ("select_text_style", c0labLJIIIZ.LIZ);
    }
}
