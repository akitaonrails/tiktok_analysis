package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.editSticker.text.font.TextFontStyleData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import com.ss.android.ugc.aweme.shortvideo.model.ShortVideoCommonParams;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0oAX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1462790oAX implements InterfaceC387610FHr {
    public final /* synthetic */ C387660FHw LIZ;

    @Override // X.InterfaceC387610FHr
    public final void LIZIZ() {
        C0FWY c0fwy = C0FWY.LIZ;
        VideoPublishEditModel videoPublishEditModel = this.LIZ.LIZ;
        ShortVideoCommonParams shortVideoCommonParams = new ShortVideoCommonParams(videoPublishEditModel.mShootWay, C1428470nHB.LJIILIIL(videoPublishEditModel), C1428470nHB.LJIILL(this.LIZ.LIZ), this.LIZ.LIZ.getCreationId(), 0, 0, 0, 0, null, null, null, null, null, 8176, null);
        c0fwy.getClass();
        C0FWY.LJI(shortVideoCommonParams);
    }

    public C1462790oAX(C387660FHw c387660FHw) {
        this.LIZ = c387660FHw;
    }

    @Override // X.InterfaceC387610FHr
    public final void LIZJ(C1462820oAa c1462820oAa) {
        C1462830oAb c1462830oAb = C1462830oAb.LIZ;
        String strLJIILIIL = C1428470nHB.LJIILIIL(this.LIZ.LIZ);
        String creationId = this.LIZ.LIZ.getCreationId();
        VideoPublishEditModel videoPublishEditModel = this.LIZ.LIZ;
        String str = videoPublishEditModel.mShootWay;
        String strLJIILL = C1428470nHB.LJIILL(videoPublishEditModel);
        String enterFrom = this.LIZ.LIZ.getEnterFrom();
        c1462830oAb.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("content_source", strLJIILIIL);
        c2344009Gk.LJIIIIZZ("creation_id", creationId);
        if (strLJIILL == null) {
            strLJIILL = "";
        }
        c2344009Gk.LJIIIIZZ("content_type", strLJIILL);
        if (str == null) {
            str = "";
        }
        c2344009Gk.LJIIIIZZ("shoot_way", str);
        if (enterFrom == null) {
            enterFrom = "";
        }
        c2344009Gk.LJIIIIZZ("enter_from", enterFrom);
        c2344009Gk.LJIIIIZZ("enter_way", "edit_page_text_sidebar");
        c2344009Gk.LJIIIIZZ("text_type", c1462820oAa.LIZ);
        c2344009Gk.LJ(Boolean.valueOf(c1462820oAa.LIZIZ), "is_editor_pro");
        c2344009Gk.LIZIZ(c1462820oAa.LIZJ, "from_size");
        c2344009Gk.LIZIZ(c1462820oAa.LIZLLL, "to_size");
        C20684815ws.LJIILLIIL("adjust_text_roll_bar", c2344009Gk.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x014f  */
    @Override // X.InterfaceC387610FHr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIZ(X.C1462800oAY r8) {
        /*
            Method dump skipped, instruction units count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1462790oAX.LJIIIZ(X.0oAY):void");
    }

    @Override // X.InterfaceC387610FHr
    public final void LJI(int i, String str) {
        C0LAB c0labLIZ = this.LIZ.LIZ();
        c0labLIZ.LIZ(i, "is_editor_pro");
        c0labLIZ.LJ("text_type", "caption");
        c0labLIZ.LJ("asr_model_lang", this.LIZ.LIZIZ(str));
        C20684815ws.LJIILLIIL("text_cancel", c0labLIZ.LIZ);
    }

    @Override // X.InterfaceC387610FHr
    public final void LJII(int i, String str, String str2, String str3, String str4) {
        String str5;
        C0LAB c0labLIZ = this.LIZ.LIZ();
        this.LIZ.getClass();
        int i2 = CastIntegerProtector.parseInt(str);
        if (i2 != 1) {
            if (i2 != 2 && i2 == 3) {
                str5 = "right";
            } else {
                str5 = "center";
            }
        } else {
            str5 = "left";
        }
        c0labLIZ.LJ("paragraph_style", str5);
        c0labLIZ.LIZ(i, "is_editor_pro");
        c0labLIZ.LJ("text_type", str2);
        if (str4 == null) {
            str4 = "edit_page_text_sidebar";
        }
        c0labLIZ.LJ("enter_way", str4);
        if (Intrinsics.LJFF(str2, "caption")) {
            c0labLIZ.LJ("asr_model_lang", this.LIZ.LIZIZ(str3));
        }
        if (this.LIZ.LIZ.creativeModel.initialModel.dmCameraModel.enableTextStickerOnRecord) {
            c0labLIZ.LJ("is_dm_text_icon", "1");
        }
        String str6 = this.LIZ.LIZ.creativeModel.initialModel.dmCameraModel.enterDM;
        if (str6 != null) {
            c0labLIZ.LJ("enter_dm", str6);
        }
        C0MJO.LIZIZ(this.LIZ.LIZ.creativeModel, c0labLIZ);
        c0labLIZ.LIZ(u4.LJJIL(this.LIZ.LIZ) ? 1 : 0, "is_from_edit_tab");
        c0labLIZ.LIZ(u4.LJJIZ(this.LIZ.LIZ) ? 1 : 0, "is_from_edit_tab_captions");
        C20684815ws.LJIILLIIL("select_text_paragraph", c0labLIZ.LIZ);
    }

    @Override // X.InterfaceC387610FHr
    public final void LJFF(String str, int i, String str2, String str3, int i2, String str4) {
        C0LAB c0labLIZ = this.LIZ.LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("");
        sbLIZ.append(Integer.toHexString(i));
        c0labLIZ.LJ("color", C2188811AlT.LIZIZ(sbLIZ));
        c0labLIZ.LIZ(0, "is_subtitle");
        c0labLIZ.LIZ(i2, "is_editor_pro");
        c0labLIZ.LJ("text_type", str);
        c0labLIZ.LIZ(1, "is_select_all");
        if (str3 == null) {
            str3 = "edit_page_text_sidebar";
        }
        c0labLIZ.LJ("enter_way", str3);
        if (Intrinsics.LJFF(str, "caption")) {
            c0labLIZ.LJ("asr_model_lang", this.LIZ.LIZIZ(str2));
        }
        if (this.LIZ.LIZ.creativeModel.initialModel.dmCameraModel.enableTextStickerOnRecord) {
            c0labLIZ.LJ("is_dm_text_icon", "1");
        }
        String str5 = this.LIZ.LIZ.creativeModel.initialModel.dmCameraModel.enterDM;
        if (str5 != null) {
            c0labLIZ.LJ("enter_dm", str5);
        }
        if (str4 == null) {
            str4 = "click";
        }
        c0labLIZ.LJ("select_method", str4);
        C0MJO.LIZIZ(this.LIZ.LIZ.creativeModel, c0labLIZ);
        c0labLIZ.LIZ(u4.LJJIL(this.LIZ.LIZ) ? 1 : 0, "is_from_edit_tab");
        c0labLIZ.LIZ(u4.LJJIZ(this.LIZ.LIZ) ? 1 : 0, "is_from_edit_tab_captions");
        C20684815ws.LJIILLIIL("select_text_color", c0labLIZ.LIZ);
    }

    @Override // X.InterfaceC387610FHr
    public final void LIZLLL(String str, int i, int i2, String str2, String str3, String str4, String str5) {
        Pair<Integer, Integer> pairLJIIJJI = C580270MpN.LJIIJJI(this.LIZ.LIZ);
        int iIntValue = pairLJIIJJI.getFirst().intValue();
        int iIntValue2 = pairLJIIJJI.getSecond().intValue();
        C0LAB c0labLIZ = this.LIZ.LIZ();
        c0labLIZ.LJ("draft_way", str);
        c0labLIZ.LIZ(iIntValue, "video_cnt");
        c0labLIZ.LIZ(iIntValue2, "pic_cnt");
        c0labLIZ.LIZ(this.LIZ.LIZ.getVideoLength(), "creation_duration");
        c0labLIZ.LIZ(i, "is_from_photo_canvas");
        c0labLIZ.LJ("action_type", str2);
        c0labLIZ.LIZ(i2, "is_editor_pro");
        c0labLIZ.LJ("track_type", str3);
        if (str4 != null) {
            c0labLIZ.LJ("tab_name", str4);
        }
        if (str5 != null) {
            c0labLIZ.LJ("text_animation", str5);
        }
        C20684815ws.LJIILLIIL("text_animation_click", c0labLIZ.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c3 A[PHI: r1
      0x00c3: PHI (r1v8 int) = (r1v0 int), (r1v9 int) binds: [B:5:0x0019, B:9:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.InterfaceC387610FHr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(java.lang.String r6, int r7, int r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13) {
        /*
            r5 = this;
            X.0FHw r0 = r5.LIZ
            X.0LAB r2 = r0.LIZ()
            java.lang.StringBuilder r4 = X.C2188811AlT.LIZ()
            java.lang.String r0 = ""
            r4.append(r0)
            X.0FHw r0 = r5.LIZ
            r0.getClass()
            r3 = 0
            r1 = 1
            if (r7 == r1) goto L21
            r0 = 2
            if (r7 == r0) goto Lc3
            r1 = 3
            if (r7 == r1) goto L22
            r0 = 4
            if (r7 == r0) goto Lc3
        L21:
            r0 = 0
        L22:
            r4.append(r0)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r4)
            java.lang.String r0 = "text_style"
            r2.LJ(r0, r1)
            java.lang.String r0 = "is_subtitle"
            r2.LIZ(r3, r0)
            java.lang.String r0 = "is_editor_pro"
            r2.LIZ(r8, r0)
            java.lang.String r0 = "text_type"
            r2.LJ(r0, r6)
            if (r10 != 0) goto L41
            java.lang.String r10 = "edit_page_text_sidebar"
        L41:
            java.lang.String r0 = "enter_way"
            r2.LJ(r0, r10)
            if (r12 == 0) goto L4d
            java.lang.String r0 = "tab_name"
            r2.LJ(r0, r12)
        L4d:
            if (r13 == 0) goto L54
            java.lang.String r0 = "text_style_id"
            r2.LJ(r0, r13)
        L54:
            java.lang.String r0 = "caption"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r6, r0)
            if (r0 == 0) goto L67
            X.0FHw r0 = r5.LIZ
            java.lang.String r1 = r0.LIZIZ(r9)
            java.lang.String r0 = "asr_model_lang"
            r2.LJ(r0, r1)
        L67:
            X.0FHw r0 = r5.LIZ
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r0.LIZ
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r0.creativeModel
            com.ss.android.ugc.aweme.creative.model.CreativeInitialModel r0 = r0.initialModel
            com.ss.android.ugc.aweme.creative.model.DMCameraModel r0 = r0.dmCameraModel
            boolean r0 = r0.enableTextStickerOnRecord
            if (r0 == 0) goto L7c
            java.lang.String r1 = "is_dm_text_icon"
            java.lang.String r0 = "1"
            r2.LJ(r1, r0)
        L7c:
            X.0FHw r0 = r5.LIZ
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r0.LIZ
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r0.creativeModel
            com.ss.android.ugc.aweme.creative.model.CreativeInitialModel r0 = r0.initialModel
            com.ss.android.ugc.aweme.creative.model.DMCameraModel r0 = r0.dmCameraModel
            java.lang.String r1 = r0.enterDM
            if (r1 == 0) goto L8f
            java.lang.String r0 = "enter_dm"
            r2.LJ(r0, r1)
        L8f:
            X.0FHw r0 = r5.LIZ
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r0.LIZ
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r0.creativeModel
            X.C0MJO.LIZIZ(r0, r2)
            if (r11 != 0) goto L9c
            java.lang.String r11 = "click"
        L9c:
            java.lang.String r0 = "select_method"
            r2.LJ(r0, r11)
            X.0FHw r0 = r5.LIZ
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r0.LIZ
            boolean r1 = com.ss.android.ugc.aweme.shortvideo.edit.u4.LJJIL(r0)
            java.lang.String r0 = "is_from_edit_tab"
            r2.LIZ(r1, r0)
            X.0FHw r0 = r5.LIZ
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r0.LIZ
            boolean r1 = com.ss.android.ugc.aweme.shortvideo.edit.u4.LJJIZ(r0)
            java.lang.String r0 = "is_from_edit_tab_captions"
            r2.LIZ(r1, r0)
            java.util.Map<java.lang.String, java.lang.String> r1 = r2.LIZ
            java.lang.String r0 = "select_text_style"
            X.C20684815ws.LJIILLIIL(r0, r1)
            return
        Lc3:
            r0 = r1
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1462790oAX.LJ(java.lang.String, int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    @Override // X.InterfaceC387610FHr
    public final void LJIIIIZZ(TextFontStyleData textFontStyleData, int i, String str, String str2, boolean z, String str3, String str4, String str5) {
        String str6 = textFontStyleData.title;
        if (str6 != null && str6.length() != 0) {
            C0LAB c0labLIZ = this.LIZ.LIZ();
            c0labLIZ.LJ("font", textFontStyleData.title);
            c0labLIZ.LIZ(0, "is_subtitle");
            c0labLIZ.LIZ(i, "is_editor_pro");
            c0labLIZ.LJ("text_type", str);
            c0labLIZ.LIZ(!z ? 1 : 0, "is_select_all");
            if (str3 == null) {
                str3 = "edit_page_text_sidebar";
            }
            c0labLIZ.LJ("enter_way", str3);
            c0labLIZ.LJ("tab_name", str5);
            if (Intrinsics.LJFF(str, "caption")) {
                c0labLIZ.LJ("asr_model_lang", this.LIZ.LIZIZ(str2));
            }
            if (this.LIZ.LIZ.creativeModel.initialModel.dmCameraModel.enableTextStickerOnRecord) {
                c0labLIZ.LJ("is_dm_text_icon", "1");
            }
            String str7 = this.LIZ.LIZ.creativeModel.initialModel.dmCameraModel.enterDM;
            if (str7 != null) {
                c0labLIZ.LJ("enter_dm", str7);
            }
            C0MJO.LIZIZ(this.LIZ.LIZ.creativeModel, c0labLIZ);
            if (str4 == null) {
                str4 = "click";
            }
            c0labLIZ.LJ("select_method", str4);
            c0labLIZ.LIZ(u4.LJJIL(this.LIZ.LIZ) ? 1 : 0, "is_from_edit_tab");
            c0labLIZ.LIZ(u4.LJJIZ(this.LIZ.LIZ) ? 1 : 0, "is_from_edit_tab_captions");
            C20684815ws.LJIILLIIL("select_text_font", c0labLIZ.LIZ);
        }
    }
}
