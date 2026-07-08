package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.List;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0n1k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1418900n1k {
    public static final C1418900n1k LIZ = new C1418900n1k();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(272));
    public static boolean LIZJ;

    public static boolean LIZJ() {
        if (LIZJ || ((Keva) LIZIZ.getValue()).getBoolean("key_has_shown_save_local_compliance_tip", false)) {
            return false;
        }
        LIZJ = true;
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C2352709Jt(null), 3);
        return true;
    }

    public static void LIZ(int i, int i2, VideoPublishEditModel videoPublishEditModel, String str) {
        int size;
        List<SingleImageData> imageList;
        C1428470nHB.LJJLIIIJLLLLLLLZ(videoPublishEditModel);
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", videoPublishEditModel.getCreationId());
        c0lab.LJ("enter_from", "video_edit_page");
        c0lab.LJ("shoot_way", videoPublishEditModel.mShootWay);
        c0lab.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModel));
        c0lab.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel));
        c0lab.LIZ(videoPublishEditModel.creativeModel.commonMobModel.originVideoCount, "video_cnt");
        c0lab.LIZ(videoPublishEditModel.creativeModel.commonMobModel.originPhotoCount, "pic_cnt");
        c0lab.LJ("shoot_tab_name", C1428470nHB.LJJIIZI(videoPublishEditModel));
        c0lab.LJ("entrance_type", str);
        c0lab.LIZ(i, "is_save_format_option");
        c0lab.LIZ(i2, "is_choose_photo_option");
        C1413430msv.LIZLLL(videoPublishEditModel, c0lab);
        if (C1428470nHB.LJJZZI(videoPublishEditModel) && Intrinsics.LJFF(C1428470nHB.LJIILIIL(videoPublishEditModel), "shoot")) {
            ImageAlbumData imageAlbumData = videoPublishEditModel.getImageAlbumData();
            if (imageAlbumData != null && (imageList = imageAlbumData.getImageList()) != null) {
                size = imageList.size();
            } else {
                size = 0;
            }
            c0lab.LIZ(size, "pic_cnt");
            c0lab.LJ("shoot_tab_name", C1428470nHB.LJJIIZI(videoPublishEditModel));
        }
        c0lab.LIZ(videoPublishEditModel.creativeModel.photoModeEnterEditingStage.isFromMultiPhotoSpecialPage ? 1 : 0, "is_from_multi_photo_special_page");
        C1413430msv.LJFF(videoPublishEditModel, c0lab);
        c0lab.LIZ(videoPublishEditModel.creativeModel.draftInfoModel.isDraft ? 1 : 0, "is_draft");
        C572310McX.LJ(videoPublishEditModel, c0lab);
        C20684815ws.LJIILLIIL("click_save_local_entrance", c0lab.LIZ);
    }

    public static void LIZIZ(int i, int i2, VideoPublishEditModel videoPublishEditModel, String str, String str2) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", videoPublishEditModel.getCreationId());
        c0lab.LJ("enter_from", "video_edit_page");
        c0lab.LJ("shoot_way", videoPublishEditModel.mShootWay);
        c0lab.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel));
        c0lab.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModel));
        c0lab.LJ("shoot_tab_name", C1428470nHB.LJJIIZI(videoPublishEditModel));
        c0lab.LIZ(videoPublishEditModel.creativeModel.commonMobModel.originVideoCount, "video_cnt");
        c0lab.LIZ(videoPublishEditModel.creativeModel.commonMobModel.originPhotoCount, "pic_cnt");
        c0lab.LJ("entrance_type", str);
        c0lab.LIZ(i, "is_save_format_option");
        c0lab.LIZ(i2, "is_choose_photo_option");
        c0lab.LJ("save_type", str2);
        c0lab.LIZ(videoPublishEditModel.creativeModel.draftInfoModel.isDraft ? 1 : 0, "is_draft");
        C572310McX.LJ(videoPublishEditModel, c0lab);
        C20684815ws.LJIILLIIL("save_local_save_options", c0lab.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x00f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.bytedance.tux.sheet.sheet.TuxSheet LJFF(android.content.Context r6, X.C1408780mlQ r7, kotlin.jvm.functions.Function0 r8, kotlin.jvm.functions.Function0 r9, kotlin.jvm.functions.Function2 r10, kotlin.jvm.functions.Function1 r11) {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1418900n1k.LJFF(android.content.Context, X.0mlQ, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function1):com.bytedance.tux.sheet.sheet.TuxSheet");
    }

    /* JADX WARN: Removed duplicated region for block: B:236:0x0509  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZLLL(android.content.Context r23, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r24, X.InterfaceC1444170ngV r25, X.InterfaceC1455860nzM r26, X.C1451630nsX r27, kotlin.jvm.functions.Function0 r28, kotlin.jvm.functions.Function0 r29, X.InterfaceC1455610nyx r30, kotlin.jvm.functions.Function0 r31) {
        /*
            Method dump skipped, instruction units count: 1511
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1418900n1k.LIZLLL(android.content.Context, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, X.0ngV, X.0nzM, X.0nsX, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, X.0nyx, kotlin.jvm.functions.Function0):void");
    }
}
