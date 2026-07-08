package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.feed.model.ACLCommonShare;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeACLShare;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.poi.PoiDataStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0lro, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1374300lro {
    public static void LIZJ(Aweme aweme, String str, String str2) {
        Integer numValueOf;
        String region;
        int size;
        PhotoModeImageInfo photoModeImageInfo;
        List<PhotoModeImageUrlModel> imageList;
        User author;
        C2344009Gk c2344009Gk = new C2344009Gk();
        String aid = null;
        if (aweme != null) {
            numValueOf = Integer.valueOf(aweme.getAwemeType());
        } else {
            numValueOf = null;
        }
        c2344009Gk.LJ(numValueOf, "aweme_type");
        if (aweme != null && (author = aweme.getAuthor()) != null) {
            region = author.getRegion();
        } else {
            region = null;
        }
        c2344009Gk.LJIIIIZZ("country_name", region);
        c2344009Gk.LJIIIIZZ("download_method", str);
        if (aweme != null) {
            aid = aweme.getAid();
        }
        c2344009Gk.LJIIIIZZ("group_id", aid);
        if (aweme != null && (photoModeImageInfo = aweme.getPhotoModeImageInfo()) != null && (imageList = photoModeImageInfo.getImageList()) != null) {
            size = imageList.size();
        } else {
            size = 0;
        }
        c2344009Gk.LIZJ(size, "pic_cnt");
        c2344009Gk.LJIIIIZZ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str2);
        C20684815ws.LJIILLIIL("download_popup_click", c2344009Gk.LIZ);
    }

    public static void LIZIZ(Aweme aweme, String str, String str2, String str3, int i, SharePackage sharePackage, int i2) {
        String idStr;
        String strLIZ;
        String str4;
        String str5;
        String string;
        String str6;
        Bundle bundle;
        Bundle bundle2;
        String title;
        C1370890lmJ c1370890lmJ = C1370890lmJ.LIZ;
        C735840Sti c735840Sti = C735840Sti.LIZ;
        C19651011uW c19651011uW = C19651011uW.LIZIZ;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("group_id", aweme.getAid());
        c2344009Gk.LJIIIIZZ("author_id", C735370Ssx.LIZLLL(aweme));
        c2344009Gk.LJIIIIZZ("enter_from", str2);
        c2344009Gk.LJIIIIZZ("download_method", str3);
        c2344009Gk.LIZJ(aweme.getAwemeType(), "aweme_type");
        c2344009Gk.LIZJ(1, "pic_cnt");
        c2344009Gk.LIZJ(1, "download_pic_cnt");
        Music music = aweme.getMusic();
        String string2 = null;
        if (music != null) {
            idStr = music.getIdStr();
        } else {
            idStr = null;
        }
        c2344009Gk.LJIIIIZZ("music_id", idStr);
        c2344009Gk.LIZJ(i, "is_photo_download");
        int i3 = 0;
        c2344009Gk.LJIIIIZZ("save_photo_content", C721220SQu.LIZJ(aweme, Collections.singleton(0)));
        PhotoModeImageInfo photoModeImageInfo = aweme.getPhotoModeImageInfo();
        if (photoModeImageInfo == null || (title = photoModeImageInfo.getTitle()) == null || a0.LJJJIL(title)) {
            i3 = 1;
        }
        c2344009Gk.LIZJ(i3 ^ 1, "has_title");
        c2344009Gk.LJIIIIZZ("from_page", str);
        if (!Intrinsics.LJFF("homepage_hot", str2)) {
            strLIZ = "";
        } else {
            strLIZ = C1383360m6Q.LIZ(aweme);
        }
        c2344009Gk.LJIIIIZZ("redistribute_reason", strLIZ);
        Object objLJIIIZ = c19651011uW.LJIIIZ(aweme, c2344009Gk);
        c735840Sti.getClass();
        C735840Sti.LIZIZ(aweme, objLJIIIZ);
        Object objAppendCreationParams = c1370890lmJ.appendCreationParams(objLJIIIZ, aweme);
        C1EE2 c1ee2 = C1EE2.LIZIZ;
        C2344009Gk c2344009Gk2 = (C2344009Gk) c1ee2.LJJLIL(aweme, objAppendCreationParams);
        C1357660lQy.LJI(c2344009Gk2, aweme);
        C1357660lQy.LJIIIIZZ(c2344009Gk2, aweme);
        C1357660lQy.LIZLLL(c2344009Gk2, aweme);
        PoiDataStruct poiDataStruct = aweme.getPoiDataStruct();
        if (poiDataStruct != null) {
            str4 = poiDataStruct.poiId;
        } else {
            str4 = null;
        }
        c2344009Gk2.getClass();
        c2344009Gk2.LJIIIIZZ("poi_id", str4);
        PoiDataStruct poiDataStruct2 = aweme.getPoiDataStruct();
        if (poiDataStruct2 != null) {
            str5 = poiDataStruct2.collectInfo;
        } else {
            str5 = null;
        }
        c2344009Gk2.LJIIIIZZ("collect_info", str5);
        C1205210hT5.LIZ(aweme, c2344009Gk2, str2, "download");
        if (C720360SNm.LJI(aweme)) {
            c2344009Gk2.LJFF("is_text_mode", "1");
        }
        Map<String, String> mapLIZIZ = C1348720lCY.LIZIZ(aweme);
        if (mapLIZIZ != null) {
            c2344009Gk2.LJII(mapLIZIZ);
        }
        c2344009Gk2.LJIIIIZZ("request_id", C735370Ssx.LJIJJ(aweme));
        if (sharePackage != null && (bundle2 = sharePackage.extras) != null) {
            string = bundle2.getString("explore_from_group_id", "");
        } else {
            string = null;
        }
        C1366720lfa.LIZIZ(aweme, c2344009Gk2, str2, string);
        if (c1ee2.LIZLLL()) {
            c2344009Gk2.LIZJ(i2, "is_enter_graphic_detail");
        }
        C15WT c15wt = C15WT.LIZIZ;
        if (sharePackage != null && (bundle = sharePackage.extras) != null) {
            string2 = bundle.getString("explore_from_group_id", "");
        }
        c15wt.LJFF(c2344009Gk2, str2, string2, aweme.getAid());
        if (i == 1) {
            c2344009Gk2.LJFF("is_save_with_watermark", "1");
        } else {
            C1376010luZ.LIZ.getClass();
            if (!C1376010luZ.LJIIJ(aweme)) {
                str6 = "1";
            } else {
                str6 = CardStruct.IStatusCode.DEFAULT;
            }
            c2344009Gk2.LJFF("is_save_with_watermark", str6);
        }
        CommentService.LIZ.getClass();
        Map<String, String> contentRecReasonParams = C523420Kfs.LIZ().getContentRecReasonParams(aweme, str2);
        if (contentRecReasonParams != null) {
            c2344009Gk2.LJII(contentRecReasonParams);
        }
        if (C735370Ssx.LJJIJL(str2)) {
            c2344009Gk2.LJFF("log_pb", C584850Mwl.LIZ.LIZIZ(C735370Ssx.LJIJJ(aweme)));
        }
        if (C720360SNm.LJIIJJI(aweme)) {
            c2344009Gk2.LJIIIIZZ("is_text_trans_pic", "1");
            c2344009Gk2.LJFF("is_text_mode", "1");
        }
        if (C720360SNm.LJFF(aweme)) {
            c2344009Gk2.LJFF("is_comment_to_post", "1");
        }
        C20684815ws.LJIILLIIL("download", c2344009Gk2.LIZ);
    }

    public static void LIZ(C1374300lro c1374300lro, C1376330lv5 c1376330lv5, Aweme aweme, String str, String str2, String str3, SharePackage sharePackage, int i, boolean z, int i2, int i3) {
        ACLCommonShare downloadGeneral;
        int i4 = i2;
        boolean z2 = z;
        int i5 = i;
        if ((i3 & 64) != 0) {
            i5 = 1;
        }
        if ((i3 & 128) != 0) {
            z2 = false;
        }
        if ((i3 & 256) != 0) {
            i4 = 0;
        }
        c1374300lro.getClass();
        C1376010luZ c1376010luZ = C1376010luZ.LIZ;
        Set setLJ = C093Y.LJ(0);
        C1374050lrP c1374050lrP = new C1374050lrP(0);
        c1374050lrP.LIZIZ = false;
        AwemeACLShare awemeACLShare = aweme.awemeACLShareInfo;
        if (awemeACLShare != null) {
            downloadGeneral = awemeACLShare.getDownloadGeneral();
        } else {
            downloadGeneral = null;
        }
        c1374050lrP.LIZ = downloadGeneral;
        C1376010luZ.LJIIJJI(c1376010luZ, str, str2, c1376330lv5, aweme, setLJ, c1374050lrP.LIZ(), z2, new C1374310lrp(c1374300lro, aweme, str3, str, str2, i5, sharePackage, i4), 64);
    }
}
