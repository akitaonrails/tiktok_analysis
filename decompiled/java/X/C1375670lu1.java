package X;

import android.os.Bundle;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lu1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1375670lu1 {
    public static final C1375670lu1 LIZ = new C1375670lu1();
    public static long LIZIZ;

    public static void LIZLLL(Aweme aweme, int i, Set set) {
        String aid;
        Integer numValueOf;
        int size;
        PhotoModeImageInfo photoModeImageInfo;
        List<PhotoModeImageUrlModel> imageList;
        String authorUid;
        C2344009Gk c2344009Gk = new C2344009Gk();
        String str = "";
        if (aweme == null || (aid = aweme.getAid()) == null) {
            aid = "";
        }
        c2344009Gk.LJIIIIZZ("group_id", aid);
        if (aweme != null && (authorUid = AwemeExtKt.getAuthorUid(aweme)) != null) {
            str = authorUid;
        }
        c2344009Gk.LJIIIIZZ("author_id", str);
        if (aweme != null) {
            numValueOf = Integer.valueOf(aweme.getAwemeType());
        } else {
            numValueOf = null;
        }
        c2344009Gk.LJ(numValueOf, "aweme_type");
        if (aweme != null && (photoModeImageInfo = aweme.getPhotoModeImageInfo()) != null && (imageList = photoModeImageInfo.getImageList()) != null) {
            size = imageList.size();
        } else {
            size = 0;
        }
        c2344009Gk.LIZJ(size, "pic_cnt");
        c2344009Gk.LIZJ(i, "download_pic_cnt");
        c2344009Gk.LJIIIIZZ("download_pic_location", String.valueOf(set));
        C20684815ws.LJIILLIIL("download_failure_window_show", ((C2344009Gk) C1EE2.LIZIZ.LJJLIL(aweme, c2344009Gk)).LIZ);
    }

    public static void LJ(int i, int i2, Aweme aweme) {
        String aid;
        Integer numValueOf;
        int size;
        PhotoModeImageInfo photoModeImageInfo;
        List<PhotoModeImageUrlModel> imageList;
        LIZIZ = SystemClock.elapsedRealtime();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZLLL(LIZIZ, "start_download");
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        c2344009Gk.LJIIIIZZ("aweme_id", aid);
        if (aweme != null) {
            numValueOf = Integer.valueOf(aweme.getAwemeType());
        } else {
            numValueOf = null;
        }
        c2344009Gk.LJ(numValueOf, "aweme_type");
        if (aweme != null && (photoModeImageInfo = aweme.getPhotoModeImageInfo()) != null && (imageList = photoModeImageInfo.getImageList()) != null) {
            size = imageList.size();
        } else {
            size = 0;
        }
        c2344009Gk.LIZJ(size, "pic_cnt");
        c2344009Gk.LIZJ(i, "download_pic_cnt");
        c2344009Gk.LIZJ(i2, "is_photo_download");
        C1606660rua.LIZIZ.LIZJ(null, (HashMap) c2344009Gk.LIZ, aweme, true);
        C1367960lha.LIZ.getClass();
        Map mapLJIILJJIL = C1367960lha.LIZ().LJIILJJIL(aweme, null);
        if (!mapLJIILJJIL.isEmpty()) {
            c2344009Gk.LJII(mapLJIILJJIL);
        }
        C20684815ws.LJIILLIIL("download_start", ((C2344009Gk) C1EE2.LIZIZ.LJJLIL(aweme, c2344009Gk)).LIZ);
    }

    public static void LIZ(int i, Aweme aweme, String str, String str2) {
        String aid;
        Integer numValueOf;
        int size;
        String string;
        PhotoModeImageInfo photoModeImageInfo;
        List<PhotoModeImageUrlModel> imageList;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        String string2 = null;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        c2344009Gk.LJIIIIZZ("group_id", aid);
        if (aweme != null) {
            numValueOf = Integer.valueOf(aweme.getAwemeType());
        } else {
            numValueOf = null;
        }
        c2344009Gk.LJ(numValueOf, "aweme_type");
        if (aweme != null && (photoModeImageInfo = aweme.getPhotoModeImageInfo()) != null && (imageList = photoModeImageInfo.getImageList()) != null) {
            size = imageList.size();
        } else {
            size = 0;
        }
        c2344009Gk.LIZJ(size, "pic_cnt");
        c2344009Gk.LIZJ(i, "download_pic_cnt");
        c2344009Gk.LJIIIIZZ("save_photo_content", str2);
        C1376010luZ.LIZ.getClass();
        Bundle bundle = C1376010luZ.LJJIFFI;
        if (bundle != null) {
            string2 = bundle.getString("detail_tab_name");
        }
        String str3 = "";
        if (string2 == null) {
            string2 = "";
        }
        c2344009Gk.LJIIIIZZ("detail_tab_name", string2);
        Bundle bundle2 = C1376010luZ.LJJIFFI;
        if (bundle2 != null && (string = bundle2.getString("download_method")) != null) {
            str3 = string;
        }
        c2344009Gk.LJIIIIZZ("download_method", str3);
        C20684815ws.LJIILLIIL("download_cancel", ((C2344009Gk) C1EE2.LIZIZ.LJJLIL(aweme, c2344009Gk)).LIZ);
    }

    public static void LIZIZ(int i, int i2, int i3, Aweme aweme, String str, String str2) {
        String aid;
        String aid2;
        String authorUid;
        User author;
        Integer numValueOf;
        String logPbString;
        String str3;
        int size;
        String str4;
        String string;
        String string2;
        String string3;
        String string4;
        PhotoModeImageInfo photoModeImageInfo;
        List<PhotoModeImageUrlModel> imageList;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        C735840Sti c735840Sti = C735840Sti.LIZ;
        C19651011uW c19651011uW = C19651011uW.LIZIZ;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZLLL(jElapsedRealtime, "end_download");
        String aid3 = null;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        c2344009Gk.LJIIIIZZ("aweme_id", aid);
        c2344009Gk.LIZLLL(jElapsedRealtime - LIZIZ, "duration");
        String str5 = "";
        if (aweme == null || (aid2 = aweme.getAid()) == null) {
            aid2 = "";
        }
        c2344009Gk.LJIIIIZZ("group_id", aid2);
        if (aweme == null || (authorUid = AwemeExtKt.getAuthorUid(aweme)) == null) {
            authorUid = "";
        }
        c2344009Gk.LJIIIIZZ("author_id", authorUid);
        if (aweme != null) {
            author = aweme.getAuthor();
        } else {
            author = null;
        }
        c2344009Gk.LJIIIIZZ("follow_status", C735370Ssx.LJIJJLI(author));
        if (aweme != null) {
            numValueOf = Integer.valueOf(aweme.getAwemeType());
        } else {
            numValueOf = null;
        }
        c2344009Gk.LJ(numValueOf, "aweme_type");
        c2344009Gk.LJIIIIZZ("request_id", C735370Ssx.LJIJJ(aweme));
        if (aweme != null) {
            logPbString = aweme.getLogPbString();
        } else {
            logPbString = null;
        }
        c2344009Gk.LJIIIIZZ("log_pb", logPbString);
        c2344009Gk.LJIIIIZZ("save_photo_content", str2);
        if (C729510SjV.LJJ(aweme)) {
            str3 = "story";
        } else {
            str3 = "post";
        }
        c2344009Gk.LJIIIIZZ("story_type", str3);
        if (aweme != null && (photoModeImageInfo = aweme.getPhotoModeImageInfo()) != null && (imageList = photoModeImageInfo.getImageList()) != null) {
            size = imageList.size();
        } else {
            size = 0;
        }
        c2344009Gk.LIZJ(size, "pic_cnt");
        if (str == null) {
            str4 = "";
        } else {
            str4 = str;
        }
        c2344009Gk.LJIIIIZZ("enter_from", str4);
        c2344009Gk.LIZJ(i2, "is_photo_download");
        c2344009Gk.LIZJ(i3, "download_result");
        C1376010luZ.LIZ.getClass();
        Bundle bundle = C1376010luZ.LJJIFFI;
        if (bundle == null || (string = bundle.getString("now_type")) == null) {
            string = "";
        }
        c2344009Gk.LJIIIIZZ("now_type", string);
        Bundle bundle2 = C1376010luZ.LJJIFFI;
        if (bundle2 == null || (string2 = bundle2.getString("download_method")) == null) {
            string2 = "";
        }
        c2344009Gk.LJIIIIZZ("download_method", string2);
        Bundle bundle3 = C1376010luZ.LJJIFFI;
        if (bundle3 != null && (string4 = bundle3.getString("detail_tab_name")) != null) {
            str5 = string4;
        }
        c2344009Gk.LJIIIIZZ("detail_tab_name", str5);
        c2344009Gk.LIZJ(i, "download_pic_cnt");
        if (Intrinsics.LJFF(str, "homepage_nearby")) {
            C1606660rua.LIZIZ.LIZJ(str, (HashMap) c2344009Gk.LIZ, aweme, true);
        }
        C1367960lha.LIZ.getClass();
        Map mapLJIILJJIL = C1367960lha.LIZ().LJIILJJIL(aweme, null);
        if (true ^ mapLJIILJJIL.isEmpty()) {
            c2344009Gk.LJII(mapLJIILJJIL);
        }
        Object objLJIIIZ = c19651011uW.LJIIIZ(aweme, c2344009Gk);
        c735840Sti.getClass();
        C735840Sti.LIZIZ(aweme, objLJIIIZ);
        C2344009Gk c2344009Gk2 = (C2344009Gk) C1EE2.LIZIZ.LJJLIL(aweme, objLJIIIZ);
        C15WT c15wt = C15WT.LIZIZ;
        Bundle bundle4 = C1376010luZ.LJJIFFI;
        if (bundle4 != null) {
            string3 = bundle4.getString("explore_from_group_id");
        } else {
            string3 = null;
        }
        if (aweme != null) {
            aid3 = aweme.getAid();
        }
        c15wt.LJFF(c2344009Gk2, str, string3, aid3);
        C20684815ws.LJIILLIIL("download_end", c2344009Gk2.LIZ);
        LIZIZ = 0L;
    }
}
