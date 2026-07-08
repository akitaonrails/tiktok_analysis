package X;

import com.ss.android.ugc.aweme.editSticker.text.font.TextFontStyleData;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextTemplateModel;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.AwS123S0110000_5;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0FHp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C387590FHp implements C0FGR {
    public final VideoPublishEditModel LIZ;
    public final int LIZIZ;
    public final C01GW LIZJ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 139));
    public final C01GW LIZLLL;

    public final C0LAB LJJIJIIJIL() {
        VideoPublishEditModel videoPublishEditModel = this.LIZ;
        String str = videoPublishEditModel.mDraftToEditFrom == 0 ? "general_draft_list" : "shoot_page";
        Pair<Integer, Integer> pairLJIIJJI = C580270MpN.LJIIJJI(videoPublishEditModel);
        int iIntValue = pairLJIIJJI.getFirst().intValue();
        int iIntValue2 = pairLJIIJJI.getSecond().intValue();
        C0LAB c0labLJIILIIL = C1403850mdT.LJIILIIL(this.LIZ);
        c0labLJIILIIL.LJ("creation_id", this.LIZ.getCreationId());
        c0labLJIILIIL.LJ("shoot_way", this.LIZ.mShootWay);
        c0labLJIILIIL.LJ("content_type", C1428470nHB.LJIILL(this.LIZ));
        c0labLJIILIIL.LJ("content_source", C1428470nHB.LJIILIIL(this.LIZ));
        EditPreviewInfo previewInfo = this.LIZ.getPreviewInfo();
        c0labLJIILIIL.LIZ(previewInfo != null ? previewInfo.getPreviewVideoLength() : 0, "creation_duration");
        c0labLJIILIIL.LJ("enter_from", "video_edit_page");
        c0labLJIILIIL.LJ("draft_way", str);
        c0labLJIILIIL.LIZ(iIntValue, "video_cnt");
        c0labLJIILIIL.LIZ(iIntValue2, "pic_cnt");
        c0labLJIILIIL.LIZ(C1428470nHB.LJJLIIIJLJLI(this.LIZ) ? 1 : 0, "is_from_create_template");
        String stickers = this.LIZ.getStickers();
        if (stickers == null) {
            stickers = "";
        }
        c0labLJIILIIL.LJ("prop_list", stickers);
        c0labLJIILIIL.LIZ(this.LIZ.getContainBackgroundVideo() ? 1 : 0, "is_gsv_prop");
        c0labLJIILIIL.LJ("app_language", C0CHQ.LIZ().LJJIJIIJIL());
        c0labLJIILIIL.LIZ(this.LIZIZ, "is_editor_pro");
        c0labLJIILIIL.LJ("current_page", "text_edit_page");
        return c0labLJIILIIL;
    }

    public final C0LAB LJJIJIL() {
        C0LAB c0labLJIILIIL = C1403850mdT.LJIILIIL(this.LIZ);
        c0labLJIILIIL.LJ("enter_from", "video_edit_page");
        c0labLJIILIIL.LJ("creation_id", this.LIZ.getCreationId());
        c0labLJIILIIL.LJ("shoot_way", this.LIZ.mShootWay);
        c0labLJIILIIL.LJ("content_type", C1428470nHB.LJIILL(this.LIZ));
        c0labLJIILIIL.LJ("content_source", C1428470nHB.LJIILIIL(this.LIZ));
        return c0labLJIILIIL;
    }

    public final C0EU4 LJJIJL() {
        return (C0EU4) this.LIZLLL.getValue();
    }

    public final InterfaceC387610FHr LJJIJLIJ() {
        return (InterfaceC387610FHr) this.LIZJ.getValue();
    }

    @Override // X.C0FGR
    public final void LIZIZ() {
        LJJIJLIJ().LIZIZ();
    }

    @Override // X.C0FGR
    public final void LJIILL() {
        C20684815ws.LJIILLIIL("caption_mode_add_hashtag", LJJIJIL().LIZ);
    }

    @Override // X.C0FGR
    public final void LJJI() {
        C20684815ws.LJIILLIIL("click_text_animation_entrance", LJJIJIIJIL().LIZ);
    }

    @Override // X.C0FGR
    public final void LJJII() {
        C20684815ws.LJIILLIIL("caption_mode_add_yours_btn_click", LJJIJIL().LIZ);
    }

    @Override // X.C0FGR
    public final void LIZ(int i) {
        C0LAB c0labLJJIJIIJIL = LJJIJIIJIL();
        c0labLJJIJIIJIL.LJ("color", Integer.toHexString(i));
        C20684815ws.LJIILLIIL("text_color_show", c0labLJJIJIIJIL.LIZ);
    }

    @Override // X.C0FGR
    public final void LIZJ(C1462820oAa c1462820oAa) {
        LJJIJLIJ().LIZJ(c1462820oAa);
    }

    @Override // X.C0FGR
    public final void LIZLLL(C387650FHv c387650FHv) {
        C0LAB c0labLJJIJIL = LJJIJIL();
        c0labLJJIJIL.LJ("enter_method", c387650FHv.LIZ);
        c0labLJJIJIL.LJ("tag_content", c387650FHv.LIZIZ);
        c0labLJJIJIL.LJ("tag_source", "search");
        C20684815ws.LJIILLIIL("edit_page_add_hashtag_show", c0labLJJIJIL.LIZ);
    }

    @Override // X.C0FGR
    public final void LJFF(long j) {
        if (this.LIZIZ == 1 && LJJIJL().LJI - 0 != 0) {
            C0EU4 c0eu4LJJIJL = LJJIJL();
            c0eu4LJJIJL.LJFF = Long.valueOf(j - (LJJIJL().LJI - 0));
            c0eu4LJJIJL.LIZ();
        }
    }

    @Override // X.C0FGR
    public final void LJI(C387650FHv c387650FHv) {
        C0LAB c0labLJJIJIL = LJJIJIL();
        c0labLJJIJIL.LJ("enter_method", c387650FHv.LIZ);
        c0labLJJIJIL.LJ("tag_content", c387650FHv.LIZIZ);
        c0labLJJIJIL.LJ("tag_source", "search");
        C20684815ws.LJIILLIIL("edit_page_add_hashtag_click", c0labLJJIJIL.LIZ);
    }

    @Override // X.C0FGR
    public final void LJII(TextStickerModel textStickerModel) {
        boolean z;
        C1402910mbx c1402910mbx = C1402910mbx.LIZ;
        VideoPublishEditModel videoPublishEditModel = this.LIZ;
        c1402910mbx.getClass();
        C0LAB c0labLIZJ = C1402910mbx.LIZJ(videoPublishEditModel, false);
        if (!textStickerModel.getTextTemplateModel().editedAlign && !textStickerModel.getTextTemplateModel().editedFont && !textStickerModel.getTextTemplateModel().editedColor && !textStickerModel.getTextTemplateModel().editedStyle) {
            c0labLIZJ.LJ("with_previous_text_edit", CardStruct.IStatusCode.DEFAULT);
            c0labLIZJ.LJ("previous_text_edit", "");
        } else {
            c0labLIZJ.LJ("with_previous_text_edit", "1");
            ArrayList arrayList = new ArrayList();
            if (textStickerModel.getTextTemplateModel().editedAlign) {
                arrayList.add("paragraph");
            }
            if (textStickerModel.getTextTemplateModel().editedFont) {
                arrayList.add("font");
            }
            if (textStickerModel.getTextTemplateModel().editedColor) {
                arrayList.add("color");
            }
            if (textStickerModel.getTextTemplateModel().editedStyle) {
                arrayList.add("style");
            }
            if (!arrayList.isEmpty()) {
                c0labLIZJ.LJ("previous_text_edit", C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62));
            }
            TextTemplateModel.LIZ(textStickerModel.getTextTemplateModel(), null, 266469375);
        }
        if (textStickerModel.getTextStr().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            c0labLIZJ.LJ("with_text", "1");
        } else {
            c0labLIZJ.LJ("with_text", CardStruct.IStatusCode.DEFAULT);
        }
        if (C0C0P.LIZ() && !textStickerModel.getTextTemplateModel().enableTextTemplate) {
            if (C0FIW.LIZ.get("pin_first") != null) {
                c0labLIZJ.LJ("is_preload_success", "1");
            } else {
                c0labLIZJ.LJ("is_preload_success", CardStruct.IStatusCode.DEFAULT);
            }
        }
        if (!C0F8Y.LJIIL(textStickerModel) && textStickerModel.getTextTemplateModel().enableTextTemplate) {
            c0labLIZJ.LIZ(0, "is_new_text_template");
        } else {
            c0labLIZJ.LIZ(1, "is_new_text_template");
        }
        C20684815ws.LJIILLIIL("click_photo_text_template_entrance", c0labLIZJ.LIZ);
    }

    @Override // X.C0FGR
    public final void LJIIJ(TextStickerModel textStickerModel) {
        if (this.LIZIZ == 1) {
            return;
        }
        if (textStickerModel.getCaptionModel() != null) {
            C1428470nHB.LLILZ(this.LIZ);
        } else {
            this.LIZ.creativeModel.commonMobModel.editPageFuncTracking.isTextFuncUsed = true;
        }
    }

    @Override // X.C0FGR
    public final void LJIIJJI(TextStickerModel textStickerModel) {
        C0LAB c0labLJJIJIIJIL = LJJIJIIJIL();
        c0labLJJIJIIJIL.LJ("content_source", C1428470nHB.LJIILIIL(this.LIZ));
        c0labLJJIJIIJIL.LJ("content_type", C1428470nHB.LJIILL(this.LIZ));
        c0labLJJIJIIJIL.LJ("creation_id", this.LIZ.getCreationId());
        c0labLJJIJIIJIL.LJ("shoot_way", this.LIZ.mShootWay);
        c0labLJJIJIIJIL.LJ("enter_from", "video_edit_page");
        c0labLJJIJIIJIL.LIZ(this.LIZIZ, "is_editor_pro");
        c0labLJJIJIIJIL.LIZ(0, "is_photo_editor");
        c0labLJJIJIIJIL.LJ("text_type", C387620FHs.LIZ(textStickerModel));
        c0labLJJIJIIJIL.LJ("enter_way", "edit_page_text_sidebar");
        C20684815ws.LJIILLIIL("click_text_font_entrance", c0labLJJIJIIJIL.LIZ);
    }

    @Override // X.C0FGR
    public final void LJIIL(String str) {
        C0LAB c0labLJJIJIIJIL = LJJIJIIJIL();
        c0labLJJIJIIJIL.LJ("caption_template", str);
        C20684815ws.LJIILLIIL("caption_template_click", c0labLJJIJIIJIL.LIZ);
    }

    @Override // X.C0FGR
    public final void LJIILIIL(String str) {
        C0LAB c0labLJJIJIL = LJJIJIL();
        c0labLJJIJIL.LJ("enter_method", str);
        C20684815ws.LJIILLIIL("click_video_at", c0labLJJIJIL.LIZ);
    }

    @Override // X.C0FGR
    public final void LJIILJJIL(String str) {
        C0LAB c0labLJJIJIIJIL = LJJIJIIJIL();
        c0labLJJIJIIJIL.LJ("caption_template", str);
        C20684815ws.LJIILLIIL("caption_template_show", c0labLJJIJIIJIL.LIZ);
    }

    @Override // X.C0FGR
    public final void LJIJ(TextStickerModel textStickerModel) {
        C0LAB c0labLJJIJIIJIL = LJJIJIIJIL();
        c0labLJJIJIIJIL.LJ("content_source", C1428470nHB.LJIILIIL(this.LIZ));
        c0labLJJIJIIJIL.LJ("content_type", C1428470nHB.LJIILL(this.LIZ));
        c0labLJJIJIIJIL.LJ("creation_id", this.LIZ.getCreationId());
        c0labLJJIJIIJIL.LJ("shoot_way", this.LIZ.mShootWay);
        c0labLJJIJIIJIL.LJ("enter_from", "video_edit_page");
        c0labLJJIJIIJIL.LIZ(this.LIZIZ, "is_editor_pro");
        c0labLJJIJIIJIL.LIZ(0, "is_photo_editor");
        c0labLJJIJIIJIL.LJ("text_type", C387620FHs.LIZ(textStickerModel));
        c0labLJJIJIIJIL.LJ("enter_way", "edit_page_text_sidebar");
        C20684815ws.LJIILLIIL("click_text_style_entrance", c0labLJJIJIIJIL.LIZ);
    }

    @Override // X.C0FGR
    public final void LJJ(TextStickerModel textStickerModel) {
        C0LAB c0labLJJIJIIJIL = LJJIJIIJIL();
        c0labLJJIJIIJIL.LJ("content_source", C1428470nHB.LJIILIIL(this.LIZ));
        c0labLJJIJIIJIL.LJ("content_type", C1428470nHB.LJIILL(this.LIZ));
        c0labLJJIJIIJIL.LJ("creation_id", this.LIZ.getCreationId());
        c0labLJJIJIIJIL.LJ("shoot_way", this.LIZ.mShootWay);
        c0labLJJIJIIJIL.LJ("enter_from", "video_edit_page");
        c0labLJJIJIIJIL.LIZ(this.LIZIZ, "is_editor_pro");
        c0labLJJIJIIJIL.LIZ(0, "is_photo_editor");
        c0labLJJIJIIJIL.LJ("text_type", C387620FHs.LIZ(textStickerModel));
        c0labLJJIJIIJIL.LJ("enter_way", "edit_page_text_sidebar");
        C20684815ws.LJIILLIIL("click_text_color_entrance", c0labLJJIJIIJIL.LIZ);
    }

    @Override // X.C0FGR
    public final void LJJIIZI(TextStickerModel textStickerModel) {
        EnumC387600FHq enumC387600FHq;
        InterfaceC387610FHr interfaceC387610FHrLJJIJLIJ = LJJIJLIJ();
        String strValueOf = String.valueOf(textStickerModel.getAlign());
        int i = this.LIZIZ;
        if (textStickerModel.getCaptionModel() != null) {
            enumC387600FHq = EnumC387600FHq.CAPTION;
        } else {
            enumC387600FHq = EnumC387600FHq.TEXT;
        }
        interfaceC387610FHrLJJIJLIJ.LJII(i, strValueOf, enumC387600FHq.getValue(), null, null);
    }

    @Override // X.C0FGR
    public final void LJJIJIIJI(String str) {
        C0LAB c0labLJJIJIIJIL = LJJIJIIJIL();
        c0labLJJIJIIJIL.LJ("method", str);
        C20684815ws.LJIILLIIL("click_keyboard_close", c0labLJJIJIIJIL.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIL(com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel r27) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C387590FHp.LJJIL(com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel):void");
    }

    public C387590FHp(VideoPublishEditModel videoPublishEditModel, boolean z) {
        this.LIZ = videoPublishEditModel;
        this.LIZIZ = z ? 1 : 0;
        this.LIZLLL = C452501pT.LIZIZ(new AwS123S0110000_5(this, z, 1));
    }

    @Override // X.C0FGR
    public final void LJIIIIZZ(TextStickerModel textStickerModel, String str) {
        EnumC387600FHq enumC387600FHq;
        String str2 = str;
        InterfaceC387610FHr interfaceC387610FHrLJJIJLIJ = LJJIJLIJ();
        TextFontStyleData textFontStyleData = new TextFontStyleData();
        textFontStyleData.title = textStickerModel.getFontModel().fontTitle;
        int i = this.LIZIZ;
        if (textStickerModel.getCaptionModel() != null) {
            enumC387600FHq = EnumC387600FHq.CAPTION;
        } else {
            enumC387600FHq = EnumC387600FHq.TEXT;
        }
        String value = enumC387600FHq.getValue();
        if (str2 == null) {
            str2 = "trending";
        }
        interfaceC387610FHrLJJIJLIJ.LJIIIIZZ(textFontStyleData, i, value, null, false, null, "click", str2);
    }

    @Override // X.C0FGR
    public final void LJIILLIIL(String str, String str2) {
        C0LAB c0labLJJIJIIJIL = LJJIJIIJIL();
        c0labLJJIJIIJIL.LJ("text_style_id", str);
        c0labLJJIJIIJIL.LJ("tab_name", str2);
        C20684815ws.LJIILLIIL("text_style_show", c0labLJJIJIIJIL.LIZ);
    }

    @Override // X.C0FGR
    public final void LJIIZILJ(TextStickerModel textStickerModel, String str) {
        EnumC387600FHq enumC387600FHq;
        InterfaceC387610FHr interfaceC387610FHrLJJIJLIJ = LJJIJLIJ();
        int color = textStickerModel.getColor();
        int i = this.LIZIZ;
        if (textStickerModel.getCaptionModel() != null) {
            enumC387600FHq = EnumC387600FHq.CAPTION;
        } else {
            enumC387600FHq = EnumC387600FHq.TEXT;
        }
        interfaceC387610FHrLJJIJLIJ.LJFF(enumC387600FHq.getValue(), color, null, null, i, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0042  */
    @Override // X.C0FGR
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJJ(java.lang.String r4, java.lang.String r5) {
        /*
            r3 = this;
            int r1 = r5.hashCode()
            r0 = -987106822(0xffffffffc529f1fa, float:-2719.1235)
            if (r1 == r0) goto L37
            r0 = -495474733(0xffffffffe277a7d3, float:-1.1421097E21)
            if (r1 == r0) goto L2c
            r0 = 44345269(0x2a4a7b5, float:2.4193893E-37)
            if (r1 != r0) goto L42
            java.lang.String r0 = "style_pager"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L42
            java.lang.String r2 = "click_text_style_tab"
        L1d:
            X.0LAB r1 = r3.LJJIJIIJIL()
            java.lang.String r0 = "tab_name"
            r1.LJ(r0, r4)
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.LIZ
            X.C20684815ws.LJIILLIIL(r2, r0)
            return
        L2c:
            java.lang.String r0 = "font_pager"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L42
            java.lang.String r2 = "click_text_font_tab"
            goto L1d
        L37:
            java.lang.String r0 = "motion_pager"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L42
            java.lang.String r2 = "click_text_animation_tab"
            goto L1d
        L42:
            java.lang.String r2 = ""
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C387590FHp.LJIJJ(java.lang.String, java.lang.String):void");
    }

    @Override // X.C0FGR
    public final void LJIJJLI(String str, String str2) {
        C0LAB c0labLJJIJIIJIL = LJJIJIIJIL();
        c0labLJJIJIIJIL.LJ("text_animation", str);
        c0labLJJIJIIJIL.LJ("tab_name", str2);
        C20684815ws.LJIILLIIL("text_animation_show", c0labLJJIJIIJIL.LIZ);
    }

    @Override // X.C0FGR
    public final void LJJIIZ(long j, long j2) {
        if (this.LIZIZ == 1) {
            C0EU4 c0eu4LJJIJL = LJJIJL();
            c0eu4LJJIJL.LJFF = null;
            c0eu4LJJIJL.LJ = null;
            LJJIJL().LJI = j;
            C0EU4 c0eu4LJJIJL2 = LJJIJL();
            c0eu4LJJIJL2.LJ = Long.valueOf(j2 - j);
            c0eu4LJJIJL2.LIZ();
        }
    }

    @Override // X.C0FGR
    public final void LJIIIZ(String str, String str2, String str3) {
        C0LAB c0labLJJIJIIJIL = LJJIJIIJIL();
        c0labLJJIJIIJIL.LJ("font", str);
        c0labLJJIJIIJIL.LJ("tab_name", str2);
        c0labLJJIJIIJIL.LJ("panel", str3);
        C20684815ws.LJIILLIIL("text_font_show", c0labLJJIJIIJIL.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a9  */
    @Override // X.C0FGR
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIL(java.lang.String r8, com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel r9, java.lang.Integer r10) {
        /*
            r7 = this;
            com.ss.android.ugc.aweme.tools.sticker.core.text.model.CaptionModel r0 = r9.getCaptionModel()
            r5 = 0
            r2 = 1
            if (r0 == 0) goto Lac
            r0 = 1
        L9:
            r3 = 0
            if (r0 == 0) goto L89
            com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextFontModel r0 = r9.getFontModel()
            java.lang.String r1 = r0.fontName
            java.lang.String r0 = "Proxima-Nova-Semibold.otf"
            com.ss.android.ugc.aweme.editSticker.text.font.TextFontStyleData r0 = X.C0FI2.LJIILL(r0)
            if (r0 == 0) goto L1c
            java.lang.String r3 = r0.fontName
        L1c:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r3)
            if (r0 != 0) goto La9
        L22:
            r1 = 1
        L23:
            com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStyleModel r0 = r9.getTextStyle()
            if (r0 != 0) goto L87
            int r0 = r9.getMode()
            if (r0 != r2) goto L87
            r6 = 0
        L30:
            com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextMotionModel r0 = r9.getTextMotionModel()
            int r0 = r0.motionEnabled
            if (r0 != r2) goto L39
            r5 = 1
        L39:
            X.0LAB r4 = r7.LJJIJIIJIL()
            java.lang.String r0 = "action"
            r4.LJ(r0, r8)
            java.lang.String r3 = "1"
            java.lang.String r2 = "0"
            if (r1 == 0) goto L85
            r1 = r3
        L49:
            java.lang.String r0 = "is_font_used"
            r4.LJ(r0, r1)
            if (r6 == 0) goto L83
            r1 = r3
        L51:
            java.lang.String r0 = "is_style_used"
            r4.LJ(r0, r1)
            if (r5 != 0) goto L59
            r3 = r2
        L59:
            java.lang.String r0 = "is_animation_used"
            r4.LJ(r0, r3)
            if (r10 == 0) goto L7a
            int r1 = r10.intValue()
        L64:
            java.lang.String r0 = "word_cnt"
            r4.LIZ(r1, r0)
            java.lang.String r1 = X.C387620FHs.LIZ(r9)
            java.lang.String r0 = "text_type"
            r4.LJ(r0, r1)
            java.util.Map<java.lang.String, java.lang.String> r1 = r4.LIZ
            java.lang.String r0 = "text_keyboard_status"
            X.C20684815ws.LJIILLIIL(r0, r1)
            return
        L7a:
            java.lang.String r0 = r9.getTextStr()
            int r1 = r0.length()
            goto L64
        L83:
            r1 = r2
            goto L51
        L85:
            r1 = r2
            goto L49
        L87:
            r6 = 1
            goto L30
        L89:
            com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextFontModel r0 = r9.getFontModel()
            java.lang.String r1 = r0.fontName
            X.0FI2 r0 = X.C0FI2.LJIJJ()
            java.util.List r0 = r0.LJIJ()
            java.lang.Object r0 = X.C13LP.LJJJLZIJ(r5, r0)
            com.ss.android.ugc.aweme.editSticker.text.font.TextFontStyleData r0 = (com.ss.android.ugc.aweme.editSticker.text.font.TextFontStyleData) r0
            if (r0 == 0) goto La1
            java.lang.String r3 = r0.fontName
        La1:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r3)
            if (r0 != 0) goto La9
            goto L22
        La9:
            r1 = 0
            goto L23
        Lac:
            r0 = 0
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C387590FHp.LJIL(java.lang.String, com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel, java.lang.Integer):void");
    }

    @Override // X.C0FGR
    public final void LJJIFFI(TextStickerModel textStickerModel, String str, String str2) {
        String str3;
        String str4;
        EnumC387600FHq enumC387600FHq;
        int i = this.LIZ.mDraftToEditFrom;
        if (i != 0) {
            if (i != 3) {
                str3 = "";
            } else {
                str3 = "delete_and_edit_draft";
            }
        } else {
            str3 = "general_draft_list";
        }
        if (textStickerModel.getTextMotionModel().motionEnabled == 1) {
            str4 = "on";
        } else {
            str4 = "off";
        }
        if (textStickerModel.getCaptionModel() != null) {
            enumC387600FHq = EnumC387600FHq.CAPTION;
        } else {
            enumC387600FHq = EnumC387600FHq.TEXT;
        }
        String value = enumC387600FHq.getValue();
        InterfaceC387610FHr interfaceC387610FHrLJJIJLIJ = LJJIJLIJ();
        boolean fromPhotoCanvas = this.LIZ.getEditorProModel().getFromPhotoCanvas();
        interfaceC387610FHrLJJIJLIJ.LIZLLL(str3, fromPhotoCanvas ? 1 : 0, this.LIZIZ, str4, value, str, str2);
    }

    @Override // X.C0FGR
    public final void LJJIJ(long j, boolean z, boolean z2) {
        if (AbstractC19994813Le.Default.nextInt(10) > 2) {
            return;
        }
        C0LAB c0lab = new C0LAB();
        c0lab.LIZIZ(j, "cost_time");
        c0lab.LIZ(z ? 1 : 0, "async");
        c0lab.LIZ(!z2 ? 1 : 0, "is_ve_bound_box");
        c0lab.LIZ(this.LIZIZ, "is_editor_pro");
        C20684815ws.LJIILLIIL("tool_performance_effect_text_get_box_cost_time", c0lab.LIZ);
    }

    @Override // X.C0FGR
    public final void LJ(TextStickerModel textStickerModel, String str, String str2, String str3) {
        EnumC387600FHq enumC387600FHq;
        InterfaceC387610FHr interfaceC387610FHrLJJIJLIJ = LJJIJLIJ();
        int mode = textStickerModel.getMode();
        int i = this.LIZIZ;
        if (textStickerModel.getCaptionModel() != null) {
            enumC387600FHq = EnumC387600FHq.CAPTION;
        } else {
            enumC387600FHq = EnumC387600FHq.TEXT;
        }
        interfaceC387610FHrLJJIJLIJ.LJ(enumC387600FHq.getValue(), mode, i, null, null, str, str2, str3);
    }

    @Override // X.C0FGR
    public final void LJJIII(long j, long j2, long j3, boolean z) {
        C0LAB c0lab = new C0LAB();
        c0lab.LIZIZ(j2 - j, "text_panel_exit_duration_animation_begin");
        c0lab.LIZIZ(j3 - j, "text_panel_exit_duration_total");
        c0lab.LIZ(z ? 1 : 0, "is_caption");
        c0lab.LIZ(this.LIZIZ, "is_editor_pro");
        C20684815ws.LJIILLIIL("tool_performance_text_panel_exit", c0lab.LIZ);
    }

    @Override // X.C0FGR
    public final void LJJIIJZLJL(long j, String str, boolean z, boolean z2) {
        C0LAB c0lab = new C0LAB();
        c0lab.LIZ(!z ? 1 : 0, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c0lab.LIZ(z2 ? 1 : 0, "resource_type");
        c0lab.LIZIZ(j, "duration");
        c0lab.LJ("resource_id", str);
        C20684815ws.LJIILLIIL("tool_performance_text_anim_download_success_rate", c0lab.LIZ);
    }

    @Override // X.C0FGR
    public final void LJIJI(int i, long j, Integer num, String str, String str2, boolean z) {
        String str3;
        if (str == null) {
            return;
        }
        C0LAB c0labLJJIJIIJIL = LJJIJIIJIL();
        c0labLJJIJIIJIL.LIZ(i, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c0labLJJIJIIJIL.LIZIZ(j, "duration");
        if (z) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        c0labLJJIJIIJIL.LJ("use_cache", str3);
        c0labLJJIJIIJIL.LIZLLL(num, "error_code");
        c0labLJJIJIIJIL.LJ("error_domain", str2);
        C20684815ws.LJIILLIIL(str, c0labLJJIJIIJIL.LIZ);
    }

    @Override // X.C0FGR
    public final void LJJIIJ(int i, long j, String str, String str2, String str3, boolean z, Integer num, String str4) {
        String str5;
        C0LAB c0labLJJIJIIJIL = LJJIJIIJIL();
        c0labLJJIJIIJIL.LIZ(i, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c0labLJJIJIIJIL.LIZIZ(j, "duration");
        c0labLJJIJIIJIL.LJ("resource_id", str);
        c0labLJJIJIIJIL.LJ("resource_type", str2);
        c0labLJJIJIIJIL.LJ("template_id", str3);
        if (z) {
            str5 = "1";
        } else {
            str5 = CardStruct.IStatusCode.DEFAULT;
        }
        c0labLJJIJIIJIL.LJ("use_cache", str5);
        c0labLJJIJIIJIL.LIZLLL(num, "error_code");
        c0labLJJIJIIJIL.LJ("error_domain", str4);
        C20684815ws.LJIILLIIL("caption_template_download", c0labLJJIJIIJIL.LIZ);
    }
}
