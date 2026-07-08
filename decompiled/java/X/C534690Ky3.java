package X;

import com.ss.android.ugc.aweme.creative.model.AIGCOfflineModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.List;

/* JADX INFO: renamed from: X.0Ky3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C534690Ky3 {
    public static final void LIZIZ(C528230Knd c528230Knd) {
        String str;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", c528230Knd.LIZIZ);
        c0lab.LJ("shoot_way", c528230Knd.LIZ);
        c0lab.LJ("album_from_page", c528230Knd.LJI);
        c0lab.LJ("album_from_scene", c528230Knd.LJII);
        c0lab.LJ("shoot_enter_method", c528230Knd.LIZLLL);
        c0lab.LJ("shoot_enter_from", c528230Knd.LIZJ);
        if (c528230Knd.LJIILJJIL) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c0lab.LJ("is_aigc_prop_selected", str);
        c0lab.LJ("prop_id", c528230Knd.LJIILLIIL);
        c0lab.LJ("prop_resource_id", c528230Knd.LJIIZILJ);
        c0lab.LJ("effect_source", c528230Knd.LJIJ);
        c0lab.LJ("is_ai_prop", c528230Knd.LJJ);
        c0lab.LJ("ai_prop_type", c528230Knd.LJIL);
        c0lab.LJ("is_async", c528230Knd.LJIJI);
        c0lab.LJ("sub_ai_prop_type", c528230Knd.LJIJJ);
        c0lab.LJ("ai_prop_model_name", c528230Knd.LJIJJLI);
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C2341909Fp.LIZ("click_upload_entrance", c0lab.LIZ);
    }

    public static final C528230Knd LIZLLL(VideoPublishEditModel videoPublishEditModel) {
        String str = videoPublishEditModel.mShootWay;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String creationId = videoPublishEditModel.getCreationId();
        String strLJJIIJ = C1428470nHB.LJJIIJ(videoPublishEditModel, false);
        if (strLJJIIJ == null) {
            strLJJIIJ = "";
        }
        String shootEnterMethod = videoPublishEditModel.getShootEnterMethod();
        if (shootEnterMethod != null) {
            str2 = shootEnterMethod;
        }
        AIGCOfflineModel aIGCOfflineModel = videoPublishEditModel.creativeModel.aigcOfflineModel;
        return new C528230Knd(str, creationId, strLJJIIJ, str2, false, 0, null, null, false, false, false, null, aIGCOfflineModel.propId, aIGCOfflineModel.resourceId, aIGCOfflineModel.effectSource, aIGCOfflineModel.isAsync, aIGCOfflineModel.subAiPropType, aIGCOfflineModel.aiPropModelName, aIGCOfflineModel.aiPropType, aIGCOfflineModel.isAiProp, 65520);
    }

    public static final C528230Knd LJ(ShortVideoContext shortVideoContext) {
        String str = shortVideoContext.shootWay;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String creationId = shortVideoContext.getCreationId();
        String str3 = shortVideoContext.creativeModel.commonMobModel.shootEnterFrom;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = shortVideoContext.enterMethod;
        if (str4 != null) {
            str2 = str4;
        }
        return new C528230Knd(str, creationId, str3, str2, false, 0, null, null, false, false, false, null, null, null, null, null, null, null, null, null, 33554416);
    }

    public static final void LIZJ(ShortVideoContext shortVideoContext, C534700Ky4 c534700Ky4) {
        C0LAB c0labLIZ = LIZ(c534700Ky4.LJFF, shortVideoContext, c534700Ky4.LJI);
        c0labLIZ.LJ("album_from_page", c534700Ky4.LIZ.LJI);
        c0labLIZ.LJ("album_from_scene", c534700Ky4.LIZ.LJII);
        c0labLIZ.LIZIZ(System.currentTimeMillis() - c534700Ky4.LIZIZ, "load_duration");
        c0labLIZ.LIZ(c534700Ky4.LJ + c534700Ky4.LIZJ, "local_total_cnt");
        c0labLIZ.LIZ(c534700Ky4.LIZJ, "local_pic_count");
        c0labLIZ.LIZ(c534700Ky4.LIZLLL, "local_live_photo_cnt");
        c0labLIZ.LIZ(c534700Ky4.LJ, "local_video_cnt");
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C2341909Fp.LIZ("upload_page_load_finish", c0labLIZ.LIZ);
    }

    public static final C0LAB LIZ(String str, ShortVideoContext shortVideoContext, String str2) {
        if (shortVideoContext == null) {
            C0LAB c0lab = new C0LAB();
            c0lab.LJ("creation_id", str2);
            c0lab.LJ("shoot_way", str);
            return c0lab;
        }
        C0LAB c0lab2 = new C0LAB();
        c0lab2.LJ("creation_id", shortVideoContext.getCreationId());
        c0lab2.LJ("shoot_way", shortVideoContext.shootWay);
        return c0lab2;
    }
}
