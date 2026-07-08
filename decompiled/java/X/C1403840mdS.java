package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.internal.IPrivacyService;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mdS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1403840mdS {
    public static final C1403840mdS LIZ = new C1403840mdS();
    public static boolean LIZIZ;

    public static String LIZIZ(int i, boolean z) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i == 4 ? "only_subscriber" : "public" : "exclude" : "friends" : "private" : z ? "followers" : "public";
    }

    public static String LIZ(VideoPublishEditModel videoPublishEditModel) {
        if (Intrinsics.LJFF(videoPublishEditModel.getEnterFrom(), "video_post_page")) {
            return C1428470nHB.LJIILIIL(videoPublishEditModel);
        }
        return C1428470nHB.LJIILIIL(videoPublishEditModel);
    }

    public static final void LIZJ(VideoPublishEditModel videoPublishEditModel, String str, Function1<? super C0LAB, Unit> function1) {
        boolean zLIZJ = ((IPrivacyService) ServiceManager.get().getService(IPrivacyService.class)).LIZJ();
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", videoPublishEditModel.getCreationId());
        c0lab.LJ("enter_from", str);
        c0lab.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModel));
        c0lab.LJ("content_source", LIZ(videoPublishEditModel));
        c0lab.LJ("shoot_way", videoPublishEditModel.mShootWay);
        c0lab.LJ("enter_method", "publishing");
        c0lab.LJ("enter_type", u4.LJIJJLI(videoPublishEditModel));
        c0lab.LIZ(zLIZJ ? 1 : 0, "is_private");
        c0lab.LJ("current_status", LIZIZ(videoPublishEditModel.isPrivate, zLIZJ));
        c0lab.LIZ(C573570MeZ.LIZJ(videoPublishEditModel) ? 1 : 0, "is_pic_frame_single_pic_edit");
        if (C573570MeZ.LIZJ(videoPublishEditModel) || C573570MeZ.LIZIZ(videoPublishEditModel)) {
            c0lab.LIZ(1, "pic_cnt");
            c0lab.LJ("content_type", "multi_photo");
        }
        C580270MpN.LIZIZ(videoPublishEditModel, c0lab, false);
        C0ML9.LIZIZ(videoPublishEditModel.creativeModel, c0lab);
        C1413430msv.LIZ(videoPublishEditModel, c0lab);
        C1413430msv.LIZLLL(videoPublishEditModel, c0lab);
        C1413430msv.LIZIZ(videoPublishEditModel, c0lab);
        c0lab.LJ("edit_tab_entrance", C1403850mdT.LIZLLL(videoPublishEditModel));
        c0lab.LJ("editorpro_click_from", videoPublishEditModel.getEditorProModel().getClickFrom());
        if (function1 != null) {
            function1.invoke(c0lab);
        }
        C0MJO.LIZIZ(videoPublishEditModel.creativeModel, c0lab);
        c0lab.LIZ(videoPublishEditModel.creativeModel.photoModeEnterEditingStage.isFromMultiPhotoSpecialPage ? 1 : 0, "is_from_multi_photo_special_page");
        C1413430msv.LJFF(videoPublishEditModel, c0lab);
        c0lab.LJ("is_from_save_draft_popup", CardStruct.IStatusCode.DEFAULT);
        c0lab.LIZ(videoPublishEditModel.creativeModel.draftInfoModel.isDraft ? 1 : 0, "is_draft");
        C572310McX.LJ(videoPublishEditModel, c0lab);
        C20684815ws.LJIILLIIL("click_privacy_setting", c0lab.LIZ);
    }

    public static final void LIZLLL(int i, String str, String str2, AbstractC343940De4 abstractC343940De4) {
        String str3;
        boolean z;
        String str4;
        String str5;
        if (abstractC343940De4 instanceof C1419790n3B) {
            str3 = "click_post";
        } else if (abstractC343940De4 instanceof C343980De8) {
            str3 = "click_cross";
        } else if (abstractC343940De4 instanceof C343960De6) {
            str3 = "made_choice";
        } else {
            str3 = "background";
        }
        C19292410dm currentUser = C0CHQ.LIZ().getAccountService().getCurrentUser();
        if (currentUser != null && currentUser.LJIIJJI()) {
            z = true;
        } else {
            z = false;
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    str4 = "empty";
                } else {
                    str4 = "friends";
                }
            } else {
                str4 = "private";
            }
        } else if (z) {
            str4 = "followers";
        } else {
            str4 = "everyone";
        }
        C0LAB c0lab = new C0LAB();
        if (LIZIZ) {
            str5 = "1";
        } else {
            str5 = CardStruct.IStatusCode.DEFAULT;
        }
        c0lab.LJ("is_1st_show", str5);
        c0lab.LJ("enter_from", str);
        c0lab.LJ("enter_method", str2);
        c0lab.LJ("exit_method", str3);
        c0lab.LJ("audience_choice", str4);
        C20684815ws.LJIILLIIL("audience_select_bottom_sheet_results", c0lab.LIZ);
    }

    public static final void LJ(VideoPublishEditModel videoPublishEditModel, String str, String str2, String str3) {
        String str4;
        String creationId;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("event_page", str);
        c0lab.LJ("auth_type", "ai_remix");
        c0lab.LJ("prev_status", str2);
        c0lab.LJ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str3);
        String str5 = "";
        if (videoPublishEditModel == null) {
            str4 = "";
        } else {
            Iterator<C546230LbZ> it2 = C546300Lbg.LIZIZ(videoPublishEditModel.creativeModel, false).iterator();
            while (it2.hasNext()) {
                C0LO3 c0lo3 = (C0LO3) it2.next().LJIIJ.getValue();
                if (c0lo3 != null && (str4 = c0lo3.LIZLLL) != null) {
                    break;
                }
            }
            str4 = "";
        }
        c0lab.LJ("ai_function_type", str4);
        if (videoPublishEditModel != null && (creationId = videoPublishEditModel.getCreationId()) != null) {
            str5 = creationId;
        }
        c0lab.LJ("creation_id", str5);
        C20684815ws.LJIILLIIL("ttcrt_item_authorize_status_change", c0lab.LIZ);
    }

    public static final void LJI(int i, VideoPublishEditModel videoPublishEditModel, String str, Function1 function1) {
        boolean z;
        String str2;
        String str3;
        C19292410dm currentUser = C0CHQ.LIZ().getAccountService().getCurrentUser();
        boolean z2 = false;
        if (currentUser != null && currentUser.LJIIJJI()) {
            z = true;
        } else {
            z = false;
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    str2 = "empty";
                } else {
                    str2 = "friends";
                }
            } else {
                str2 = "private";
            }
        } else if (z) {
            str2 = "followers";
        } else {
            str2 = "everyone";
        }
        if (videoPublishEditModel.isPrivate() == -1) {
            z2 = true;
        }
        LIZIZ = z2;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", videoPublishEditModel.getCreationId());
        c0lab.LJ("shoot_way", videoPublishEditModel.mShootWay);
        c0lab.LJ("enter_from", str);
        c0lab.LJ("content_source", LIZ(videoPublishEditModel));
        c0lab.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModel));
        c0lab.LJ("enter_method", videoPublishEditModel.creativeModel.transientPostPageModel.LJJIIJZLJL);
        if (LIZIZ) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        c0lab.LJ("is_1st_show", str3);
        c0lab.LJ("default_choice", str2);
        if (function1 != null) {
            function1.invoke(c0lab);
        }
        C20684815ws.LJIILLIIL("show_audience_select_bottom_sheet", c0lab.LIZ);
    }

    public static final void LJFF(VideoPublishEditModel videoPublishEditModel, String str, int i, int i2, Function1<? super C0LAB, Unit> function1) {
        boolean zLIZJ = ((IPrivacyService) ServiceManager.get().getService(IPrivacyService.class)).LIZJ();
        String strLIZIZ = LIZIZ(i, zLIZJ);
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", videoPublishEditModel.getCreationId());
        c0lab.LJ("shoot_way", videoPublishEditModel.mShootWay);
        c0lab.LJ("content_source", LIZ(videoPublishEditModel));
        c0lab.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModel));
        c0lab.LJ("enter_from", str);
        c0lab.LJ("to_status", strLIZIZ);
        c0lab.LIZ(zLIZJ ? 1 : 0, "is_private");
        c0lab.LJ("enter_method", "publishing");
        c0lab.LJ("from_status", LIZIZ(i2, zLIZJ));
        c0lab.LJ("is_from_save_draft_popup", CardStruct.IStatusCode.DEFAULT);
        C580270MpN.LIZIZ(videoPublishEditModel, c0lab, false);
        C0ML9.LIZIZ(videoPublishEditModel.creativeModel, c0lab);
        if (C298680BnG.LIZ()) {
            c0lab.LIZ(C298630BnB.LIZ() ? 1 : 0, "if_key_sub_creator");
        }
        if (function1 != null) {
            function1.invoke(c0lab);
        }
        C20684815ws.LJIILLIIL("select_privacy_setting", c0lab.LIZ);
    }
}
