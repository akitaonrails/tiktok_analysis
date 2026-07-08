package X;

import com.ss.android.ugc.aweme.creative.model.CelebrationData;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.draft.DraftInfoModel;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.album.api.config.AlbumEventTrackingConfig;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MediaState;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Knc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C528220Knc implements InterfaceC522160Kdq {
    public final AlbumEventTrackingConfig LIZ;

    public C528220Knc(AlbumEventTrackingConfig albumEventTrackingConfig) {
        this.LIZ = albumEventTrackingConfig;
    }

    @Override // X.InterfaceC522160Kdq
    public final void LJ(ShortVideoContext shortVideoContext) {
        if (shortVideoContext == null) {
            return;
        }
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", shortVideoContext.getCreationId());
        c0lab.LJ("shoot_way", shortVideoContext.shootWay);
        c0lab.LJ("enter_from", shortVideoContext.enterFrom);
        C20684815ws.LJIILLIIL("move_timeline_button", c0lab.LIZ);
    }

    public final void LJIIZILJ(C0LAB c0lab) {
        Map<String, ? extends Map<String, String>> map;
        Map<String, String> map2;
        Map<String, String> map3;
        AlbumEventTrackingConfig albumEventTrackingConfig = this.LIZ;
        if (albumEventTrackingConfig != null && (map3 = albumEventTrackingConfig.passThroughCommonParams) != null) {
            c0lab.LJI(map3);
        }
        AlbumEventTrackingConfig albumEventTrackingConfig2 = this.LIZ;
        if (albumEventTrackingConfig2 != null && (map = albumEventTrackingConfig2.passThroughParams) != null && (map2 = map.get("choose_upload_content")) != null) {
            c0lab.LJI(map2);
        }
    }

    public static void LJIILJJIL(C0LAB c0lab, C528010KnH c528010KnH) {
        if (c528010KnH != null) {
            c0lab.LIZ(c528010KnH.LIZ, "ai_alive_cnt");
            c0lab.LIZ(c528010KnH.LIZIZ, "ai_self_cnt");
            c0lab.LIZ(c528010KnH.LIZJ, "offline_effect_cnt");
        }
    }

    public static void LJIILL(C0LAB c0lab, C528240Kne c528240Kne) {
        int iIntValue;
        String str;
        String mobName;
        if (c528240Kne == null) {
            return;
        }
        EnumC563850M9n enumC563850M9n = c528240Kne.LIZ;
        if (enumC563850M9n != null && (mobName = enumC563850M9n.getMobName()) != null) {
            c0lab.LJ("ai_livephoto_switch_type", mobName);
        }
        Boolean bool = c528240Kne.LIZIZ;
        if (bool != null) {
            if (bool.booleanValue()) {
                str = "on";
            } else {
                str = "off";
            }
            c0lab.LJ("ai_livephoto_switch_status", str);
        }
        Boolean bool2 = c528240Kne.LIZJ;
        if (bool2 != null) {
            c0lab.LIZ(bool2.booleanValue() ? 1 : 0, "is_alive_shoot_page_side_bar");
        }
        Integer num = c528240Kne.LIZLLL;
        if (num != null && (iIntValue = num.intValue()) != -1) {
            c0lab.LIZ(iIntValue, "ai_alive_change_photo");
        }
        Integer num2 = c528240Kne.LJ;
        if (num2 != null) {
            c0lab.LIZ(num2.intValue(), "process_cnt");
        }
        String str2 = c528240Kne.LJFF;
        if (str2 != null) {
            c0lab.LJ("follow_prompt_type", str2);
        }
        String str3 = c528240Kne.LJI;
        if (str3 != null) {
            c0lab.LJ("prompt_type", str3);
        }
        String str4 = c528240Kne.LJII;
        if (str4 != null) {
            c0lab.LJ("origin_ai_alive_prompt", str4);
        }
    }

    public static void LJIILLIIL(C0LAB c0lab, ShortVideoContext shortVideoContext) {
        CreativeModel creativeModel;
        CelebrationData celebrationData;
        Integer celebrationType;
        if (shortVideoContext != null && (creativeModel = shortVideoContext.creativeModel) != null && (celebrationData = creativeModel.celebrationData) != null && (celebrationType = celebrationData.getCelebrationType()) != null && celebrationType.intValue() == 2) {
            c0lab.LJ("album_from_scene", "end_of_year_page");
            c0lab.LJ("album_from_page", "end_of_year_page");
        }
    }

    public static boolean LJIJ(ShortVideoContext shortVideoContext, Integer num) {
        CreativeModel creativeModel;
        CreativeModel creativeModel2;
        if (shortVideoContext != null && (creativeModel2 = shortVideoContext.creativeModel) != null && Intrinsics.LJFF(creativeModel2.templateSchemaData.schemaTag, "template_schema")) {
            return creativeModel2.templateSchemaData.throughTemplateSquareH5;
        }
        if (shortVideoContext != null && (creativeModel = shortVideoContext.creativeModel) != null && C0MUK.LJII(creativeModel) && num != null && num.intValue() == 36) {
            return true;
        }
        return C13LP.LJJJJ(num, C1697810uHb.LJIIJJI(40, 6, 2));
    }

    @Override // X.InterfaceC522160Kdq
    public final void LIZ(boolean z, ShortVideoContext shortVideoContext) {
        String creationId;
        String str;
        String str2;
        C0LAB c0lab = new C0LAB();
        String str3 = "";
        if (shortVideoContext == null || (creationId = shortVideoContext.getCreationId()) == null) {
            creationId = "";
        }
        c0lab.LJ("creation_id", creationId);
        if (shortVideoContext != null && (str2 = shortVideoContext.shootWay) != null) {
            str3 = str2;
        }
        c0lab.LJ("shoot_way", str3);
        if (z) {
            str = "click";
        } else {
            str = "slide";
        }
        c0lab.LJ("enter_method", str);
        C20684815ws.LJIILLIIL("album_scroll", c0lab.LIZ);
    }

    @Override // X.InterfaceC522160Kdq
    public final void LJIIIZ(boolean z, ShortVideoContext shortVideoContext) {
        String creationId;
        String str;
        String str2;
        C0LAB c0lab = new C0LAB();
        String str3 = "";
        if (shortVideoContext == null || (creationId = shortVideoContext.getCreationId()) == null) {
            creationId = "";
        }
        c0lab.LJ("creation_id", creationId);
        if (shortVideoContext != null && (str2 = shortVideoContext.shootWay) != null) {
            str3 = str2;
        }
        c0lab.LJ("shoot_way", str3);
        if (z) {
            str = "multiple";
        } else {
            str = "single";
        }
        c0lab.LJ("to_status", str);
        C20684815ws.LJIILLIIL("change_upload_mode", c0lab.LIZ);
    }

    @Override // X.InterfaceC522160Kdq
    public final void LJFF(ShortVideoContext shortVideoContext, MediaState mediaState, C528230Knd c528230Knd) {
        String creationId;
        String str;
        String str2;
        int i;
        TikTokMediaModel media = mediaState.getMedia();
        if (media != null) {
            C0LAB c0lab = new C0LAB();
            if (shortVideoContext == null || (creationId = shortVideoContext.getCreationId()) == null) {
                creationId = c528230Knd.LIZIZ;
            }
            c0lab.LJ("creation_id", creationId);
            if (shortVideoContext == null || (str = shortVideoContext.shootWay) == null) {
                str = c528230Knd.LIZ;
            }
            c0lab.LJ("shoot_way", str);
            if (media.LJIILJJIL()) {
                str2 = "video";
            } else {
                str2 = "photo";
            }
            c0lab.LJ("content_type", str2);
            if (media.selectIndex >= 0) {
                i = 1;
            } else {
                i = 0;
            }
            c0lab.LIZ(i, "is_select");
            c0lab.LIZ(c528230Knd.LJ ? 1 : 0, "is_draft");
            c0lab.LJ("album_from_page", c528230Knd.LJI);
            c0lab.LJ("album_from_scene", c528230Knd.LJII);
            C20684815ws.LJIILLIIL("slide_content_detail", c0lab.LIZ);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.0LAB] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [int] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [int] */
    /* JADX WARN: Type inference failed for: r6v3 */
    @Override // X.InterfaceC522160Kdq
    public final void LJIIJJI(ShortVideoContext shortVideoContext, long j, long j2) {
        ?? r6;
        ?? r5;
        String str;
        ?? LJJJ = 0;
        if (shortVideoContext != null) {
            boolean zLJJJJLI = shortVideoContext.LJJJJLI();
            boolean zLJJJJZ = shortVideoContext.LJJJJZ();
            LJJJ = shortVideoContext.LJJJ();
            r5 = zLJJJJZ;
            r6 = zLJJJJLI;
        } else {
            r6 = 0;
            r5 = 0;
        }
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        ?? c0lab = new C0LAB();
        c0lab.LIZIZ(System.currentTimeMillis() - j, "first_selection_duration");
        c0lab.LIZIZ(System.currentTimeMillis() - j2, "page_stay_duration");
        c0lab.LIZ(r6, "is_use_sound_sync");
        c0lab.LIZ(r5, "is_ugc_template_from_anchor");
        c0lab.LIZ(LJJJ, "is_photo_template_from_anchor");
        if (shortVideoContext == null || (str = shortVideoContext.shootWay) == null) {
            str = "";
        }
        c0lab.LJ("shoot_way", str);
        C2341909Fp.LIZ("upload_page_duration", c0lab.LIZ);
    }

    @Override // X.InterfaceC522160Kdq
    public final void LJIILIIL(ShortVideoContext shortVideoContext, ArrayList arrayList, C528230Knd c528230Knd) {
        String creationId;
        String str;
        CreativeModel creativeModel;
        if (!C0CHQ.LIZ().getAccountService().LIZ() && C0CHQ.LIZ().getAccountService().isLogin()) {
            Iterator it2 = arrayList.iterator();
            long j = 0;
            while (it2.hasNext()) {
                j += ((MediaModel) it2.next()).duration;
            }
            C0LAB c0lab = new C0LAB();
            if (shortVideoContext == null || (creationId = shortVideoContext.getCreationId()) == null) {
                creationId = c528230Knd.LIZIZ;
            }
            c0lab.LJ("creation_id", creationId);
            c0lab.LIZIZ(j, "creation_duration");
            c0lab.LJ("content_source", "upload");
            if (shortVideoContext == null || (str = shortVideoContext.shootWay) == null) {
                str = c528230Knd.LIZ;
            }
            c0lab.LJ("shoot_way", str);
            if (shortVideoContext != null) {
                creativeModel = shortVideoContext.creativeModel;
            } else {
                creativeModel = null;
            }
            C0MJO.LIZIZ(creativeModel, c0lab);
            int i = 1;
            if (arrayList.size() <= 1) {
                i = 0;
            }
            c0lab.LIZ(i, "is_multi_content");
            c0lab.LJ("enter_method", "manual");
            c0lab.LIZ(c528230Knd.LJ ? 1 : 0, "is_draft");
            c0lab.LJ("album_from_page", c528230Knd.LJI);
            c0lab.LJ("album_from_scene", c528230Knd.LJII);
            C20684815ws.LJIILLIIL("re_enter_upload_page", c0lab.LIZ);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.0LAB] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    @Override // X.InterfaceC522160Kdq
    public final void LIZIZ(ShortVideoContext shortVideoContext, TikTokMediaModel tikTokMediaModel, String str, String str2, String str3, String str4) {
        ?? LJJJJLI;
        String creationId;
        String str5;
        CreativeModel creativeModel;
        String str6;
        int i = 0;
        if (shortVideoContext != null) {
            LJJJJLI = shortVideoContext.LJJJJLI();
        } else {
            LJJJJLI = 0;
        }
        ?? c0lab = new C0LAB();
        if (shortVideoContext == null || (creationId = shortVideoContext.getCreationId()) == null) {
            creationId = "";
        }
        c0lab.LJ("creation_id", creationId);
        if (shortVideoContext != null && (str6 = shortVideoContext.shootWay) != null) {
            str2 = str6;
        } else if (str2 == null) {
            str2 = "";
        }
        c0lab.LJ("shoot_way", str2);
        c0lab.LIZ(LJJJJLI, "is_use_sound_sync");
        if (tikTokMediaModel.LJIIJJI()) {
            str5 = "live";
        } else if (tikTokMediaModel.LJIILJJIL()) {
            str5 = "video";
        } else {
            str5 = "photo";
        }
        c0lab.LJ("content_type", str5);
        if (tikTokMediaModel.selectIndex >= 0) {
            i = 1;
        }
        c0lab.LIZ(i, "is_select");
        if (str == null) {
            str = "";
        }
        c0lab.LJ("mv_id", str);
        c0lab.LJ("enter_from", str3);
        c0lab.LJ("enter_dm", "chat_album");
        c0lab.LJ("tab_name", str4);
        if (shortVideoContext != null) {
            creativeModel = shortVideoContext.creativeModel;
        } else {
            creativeModel = null;
        }
        C0ML9.LIZIZ(creativeModel, c0lab);
        C0ML9.LIZLLL(c0lab, shortVideoContext);
        C20684815ws.LJIILLIIL("click_content_detail", c0lab.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.0LAB] */
    /* JADX WARN: Type inference failed for: r8v1, types: [int] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    @Override // X.InterfaceC522160Kdq
    public final void LIZJ(ShortVideoContext shortVideoContext, String str, String str2, boolean z, String str3, C528230Knd c528230Knd) {
        String str4;
        String str5;
        String str6;
        String creationId;
        ?? c0lab = new C0LAB();
        if (shortVideoContext != null && (creationId = shortVideoContext.getCreationId()) != null) {
            str = creationId;
        }
        c0lab.LJ("creation_id", str);
        if (shortVideoContext != null && (str6 = shortVideoContext.shootWay) != null) {
            str2 = str6;
        }
        c0lab.LJ("shoot_way", str2);
        if (shortVideoContext != null && (str5 = shortVideoContext.enterFrom) != null) {
            str3 = str5;
        }
        c0lab.LJ("enter_from", str3);
        ?? r8 = z;
        if (shortVideoContext != null) {
            CreativeModel creativeModel = shortVideoContext.creativeModel;
            r8 = z;
            if (creativeModel != null) {
                DraftInfoModel draftInfoModel = creativeModel.draftInfoModel;
                r8 = z;
                if (draftInfoModel != null) {
                    r8 = z;
                    if (draftInfoModel.isDraft) {
                        r8 = 1;
                    }
                }
            }
        }
        c0lab.LIZ(r8, "is_draft");
        String str7 = null;
        if (c528230Knd != null) {
            str4 = c528230Knd.LJI;
        } else {
            str4 = null;
        }
        c0lab.LJ("album_from_page", str4);
        if (c528230Knd != null) {
            str7 = c528230Knd.LJII;
        }
        c0lab.LJ("album_from_scene", str7);
        C20684815ws.LJIILLIIL("click_album_selection_entrance", c0lab.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.0LAB] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [int] */
    /* JADX WARN: Type inference failed for: r6v3 */
    @Override // X.InterfaceC522160Kdq
    public final void LJIIIIZZ(ShortVideoContext shortVideoContext, TikTokMediaModel tikTokMediaModel, String str, String str2, String str3, C528230Knd c528230Knd) {
        ?? LJJJJLI;
        String creationId;
        String str4;
        CreativeModel creativeModel;
        String str5;
        int i = 0;
        if (shortVideoContext != null) {
            LJJJJLI = shortVideoContext.LJJJJLI();
        } else {
            LJJJJLI = 0;
        }
        C528010KnH c528010KnH = new C528010KnH(tikTokMediaModel.LJI() ? 1 : 0, tikTokMediaModel.LJIIIZ() ? 1 : 0, tikTokMediaModel.LJII() ? 1 : 0);
        ?? c0lab = new C0LAB();
        if (shortVideoContext == null || (creationId = shortVideoContext.getCreationId()) == null) {
            creationId = c528230Knd.LIZIZ;
        }
        c0lab.LJ("creation_id", creationId);
        if (shortVideoContext != null && (str5 = shortVideoContext.shootWay) != null) {
            str2 = str5;
        } else if (str2 == null) {
            str2 = "";
        }
        c0lab.LJ("shoot_way", str2);
        c0lab.LIZ(LJJJJLI, "is_use_sound_sync");
        if (tikTokMediaModel.LJIIJJI()) {
            str4 = "live";
        } else if (tikTokMediaModel.LJIILJJIL()) {
            str4 = "video";
        } else {
            str4 = "photo";
        }
        c0lab.LJ("content_type", str4);
        if (tikTokMediaModel.selectIndex >= 0) {
            i = 1;
        }
        c0lab.LIZ(i, "is_select");
        if (str == null) {
            str = "";
        }
        c0lab.LJ("mv_id", str);
        c0lab.LJ("tab_name", str3);
        c0lab.LIZ(c528230Knd.LJ ? 1 : 0, "is_draft");
        if (shortVideoContext != null) {
            creativeModel = shortVideoContext.creativeModel;
        } else {
            creativeModel = null;
        }
        C0ML9.LIZIZ(creativeModel, c0lab);
        C0ML9.LIZLLL(c0lab, shortVideoContext);
        LJIILJJIL(c0lab, c528010KnH);
        c0lab.LJ("album_from_page", c528230Knd.LJI);
        c0lab.LJ("album_from_scene", c528230Knd.LJII);
        C20684815ws.LJIILLIIL("click_content_detail", c0lab.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0094  */
    @Override // X.InterfaceC522160Kdq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJII(com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, X.C528240Kne r11, X.C528230Knd r12) {
        /*
            r5 = this;
            r4 = 0
            if (r6 == 0) goto L9a
            com.ss.android.ugc.aweme.creative.model.CreativeModel r3 = r6.creativeModel
        L5:
            X.0LAB r2 = new X.0LAB
            r2.<init>()
            java.lang.String r1 = "content_source"
            java.lang.String r0 = "upload"
            r2.LJ(r1, r0)
            java.lang.String r1 = "content_type"
            java.lang.String r0 = "mv"
            r2.LJ(r1, r0)
            java.lang.String r1 = "upload_type"
            java.lang.String r0 = "multiple_content"
            r2.LJ(r1, r0)
            if (r6 == 0) goto L25
            java.lang.String r1 = r6.shootWay
            if (r1 != 0) goto L29
        L25:
            if (r12 == 0) goto L98
            java.lang.String r1 = r12.LIZ
        L29:
            java.lang.String r0 = "shoot_way"
            r2.LJ(r0, r1)
            if (r6 == 0) goto L35
            java.lang.String r0 = r6.enterFrom
            if (r0 == 0) goto L35
            r10 = r0
        L35:
            java.lang.String r0 = "shoot_enter_from"
            r2.LJ(r0, r10)
            if (r6 == 0) goto L41
            java.lang.String r0 = r6.enterMethod
            if (r0 == 0) goto L41
            r9 = r0
        L41:
            java.lang.String r0 = "shoot_enter_method"
            r2.LJ(r0, r9)
            if (r6 == 0) goto L96
            java.lang.String r1 = r6.getCreationId()
        L4c:
            java.lang.String r0 = "creation_id"
            r2.LJ(r0, r1)
            java.lang.String r0 = "tab_name"
            r2.LJ(r0, r7)
            java.lang.String r0 = "album_name"
            r2.LJ(r0, r8)
            if (r6 == 0) goto L94
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r6.creativeModel
            if (r0 == 0) goto L94
            com.ss.android.ugc.aweme.creative.model.draft.DraftInfoModel r0 = r0.draftInfoModel
            if (r0 == 0) goto L94
            boolean r0 = r0.isDraft
            r1 = 1
            if (r0 != r1) goto L94
        L6a:
            java.lang.String r0 = "is_draft"
            r2.LIZ(r1, r0)
            if (r12 == 0) goto L92
            java.lang.String r1 = r12.LJI
        L73:
            java.lang.String r0 = "album_from_page"
            r2.LJ(r0, r1)
            if (r12 == 0) goto L7c
            java.lang.String r4 = r12.LJII
        L7c:
            java.lang.String r0 = "album_from_scene"
            r2.LJ(r0, r4)
            X.C0ML9.LIZIZ(r3, r2)
            X.C0ML9.LIZLLL(r2, r6)
            LJIILL(r2, r11)
            java.util.Map<java.lang.String, java.lang.String> r1 = r2.LIZ
            java.lang.String r0 = "select_photo_album"
            X.C20684815ws.LJIILLIIL(r0, r1)
            return
        L92:
            r1 = r4
            goto L73
        L94:
            r1 = 0
            goto L6a
        L96:
            r1 = r4
            goto L4c
        L98:
            r1 = r4
            goto L29
        L9a:
            r3 = r4
            goto L5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C528220Knc.LJII(com.ss.android.ugc.aweme.shortvideo.ShortVideoContext, java.lang.String, java.lang.String, java.lang.String, java.lang.String, X.0Kne, X.0Knd):void");
    }

    @Override // X.InterfaceC522160Kdq
    public final void LJIIL(ShortVideoContext shortVideoContext, String str, C528250Knf c528250Knf, int i, String str2, String str3, boolean z, C528240Kne c528240Kne, String str4, C528230Knd c528230Knd) {
        String str5;
        String str6;
        int i2;
        String str7;
        String str8;
        boolean z2;
        CreativeModel creativeModel;
        DraftInfoModel draftInfoModel;
        String str9;
        String creationId;
        C0LAB c0lab = new C0LAB();
        if (shortVideoContext != null && (creationId = shortVideoContext.getCreationId()) != null) {
            str2 = creationId;
        } else if (str2 == null) {
            str2 = "";
        }
        c0lab.LJ("creation_id", str2);
        if (shortVideoContext != null && (str9 = shortVideoContext.shootWay) != null) {
            str3 = str9;
        } else if (str3 == null) {
            str3 = "";
        }
        c0lab.LJ("shoot_way", str3);
        c0lab.LJ("tab_name", str);
        c0lab.LIZ(z ? 1 : 0, "is_upload_direct_enter");
        c0lab.LIZ(c528250Knf.LIZ ? 1 : 0, "is_editor_pro");
        c0lab.LIZ(c528250Knf.LIZIZ ? 1 : 0, "is_pip");
        c0lab.LIZ(c528250Knf.LIZJ ? 1 : 0, "is_replace");
        CreativeModel creativeModel2 = null;
        if (shortVideoContext != null) {
            str5 = shortVideoContext.enterFrom;
        } else {
            str5 = null;
        }
        c0lab.LJ("shoot_enter_from", str5);
        if (shortVideoContext != null) {
            str6 = shortVideoContext.enterMethod;
        } else {
            str6 = null;
        }
        c0lab.LJ("shoot_enter_method", str6);
        boolean z3 = true;
        if (shortVideoContext != null && (creativeModel = shortVideoContext.creativeModel) != null && (draftInfoModel = creativeModel.draftInfoModel) != null && draftInfoModel.isDraft) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        c0lab.LIZ(i2, "is_draft");
        c0lab.LIZ(i, "live_cnt");
        if (c528230Knd != null) {
            str7 = c528230Knd.LJI;
        } else {
            str7 = null;
        }
        c0lab.LJ("album_from_page", str7);
        if (c528230Knd != null) {
            str8 = c528230Knd.LJII;
        } else {
            str8 = null;
        }
        c0lab.LJ("album_from_scene", str8);
        if (shortVideoContext != null) {
            creativeModel2 = shortVideoContext.creativeModel;
        }
        C0ML9.LIZIZ(creativeModel2, c0lab);
        C0ML9.LIZLLL(c0lab, shortVideoContext);
        LJIILL(c0lab, c528240Kne);
        if (str4.length() > 0 && Intrinsics.LJFF(str, "ai_image")) {
            z2 = true;
        } else {
            z2 = false;
        }
        c0lab.LJII("ai_image_tab_entrance_type", str4, z2);
        if (str4.length() <= 0 || !Intrinsics.LJFF(str, "live_recordings")) {
            z3 = false;
        }
        c0lab.LJII("live_recordings_tab_entrance_type", str4, z3);
        C20684815ws.LJIILLIIL("click_upload_tab", c0lab.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00ff  */
    @Override // X.InterfaceC522160Kdq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJ(com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, int r14, int r15, java.lang.String r16, java.lang.String r17, boolean r18, java.util.List<? extends com.ss.android.ugc.aweme.mediachoose.helper.MediaModel> r19, X.C523920Kgg r20, boolean r21, X.C528230Knd r22) {
        /*
            Method dump skipped, instruction units count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C528220Knc.LJIIJ(com.ss.android.ugc.aweme.shortvideo.ShortVideoContext, java.lang.String, java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String, boolean, java.util.List, X.0Kgg, boolean, X.0Knd):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008f  */
    /* JADX WARN: Type inference failed for: r11v0, types: [X.0Knc] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.0LAB] */
    @Override // X.InterfaceC522160Kdq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r12, java.util.List<? extends com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel> r13, X.C0L9I r14, java.lang.String r15, android.util.Size r16, java.lang.String r17, int r18, java.lang.Integer r19, X.C528250Knf r20, java.lang.String r21, boolean r22, java.lang.String r23, java.lang.String r24, boolean r25, int r26, int r27, boolean r28, int r29, boolean r30, java.lang.String r31, java.lang.String r32, X.C528010KnH r33, X.C528240Kne r34, X.C528230Knd r35) {
        /*
            Method dump skipped, instruction units count: 695
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C528220Knc.LIZLLL(com.ss.android.ugc.aweme.shortvideo.ShortVideoContext, java.util.List, X.0L9I, java.lang.String, android.util.Size, java.lang.String, int, java.lang.Integer, X.0Knf, java.lang.String, boolean, java.lang.String, java.lang.String, boolean, int, int, boolean, int, boolean, java.lang.String, java.lang.String, X.0KnH, X.0Kne, X.0Knd):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x034d  */
    /* JADX WARN: Type inference failed for: r14v0, types: [X.0Knc] */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.0LAB] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v54 */
    /* JADX WARN: Type inference failed for: r4v6, types: [int] */
    @Override // X.InterfaceC522160Kdq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r15, X.C0L9I r16, java.lang.String r17, android.util.Size r18, java.lang.String r19, int r20, java.lang.Integer r21, X.C528250Knf r22, java.lang.String r23, boolean r24, java.lang.String r25, java.lang.String r26, int r27, int r28, boolean r29, int r30, boolean r31, java.lang.Boolean r32, java.lang.String r33, java.lang.String r34, X.C528010KnH r35, X.C528240Kne r36, java.lang.String r37, boolean r38, X.C528230Knd r39) {
        /*
            Method dump skipped, instruction units count: 883
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C528220Knc.LJI(com.ss.android.ugc.aweme.shortvideo.ShortVideoContext, X.0L9I, java.lang.String, android.util.Size, java.lang.String, int, java.lang.Integer, X.0Knf, java.lang.String, boolean, java.lang.String, java.lang.String, int, int, boolean, int, boolean, java.lang.Boolean, java.lang.String, java.lang.String, X.0KnH, X.0Kne, java.lang.String, boolean, X.0Knd):void");
    }
}
