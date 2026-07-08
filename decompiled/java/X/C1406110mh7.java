package X;

import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.text.Regex;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0mh7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1406110mh7 {
    public static final C1406110mh7 LIZ = new C1406110mh7();

    public static C0LAB LJFF(VideoPublishEditModel videoPublishEditModel) {
        int size;
        List<SingleImageData> imageList;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", videoPublishEditModel.getCreationId());
        c0lab.LJ("shoot_way", videoPublishEditModel.mShootWay);
        c0lab.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel));
        c0lab.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModel));
        c0lab.LJ("enter_from", "video_post_page");
        ImageAlbumData imageAlbumData = videoPublishEditModel.getImageAlbumData();
        if (imageAlbumData != null && (imageList = imageAlbumData.getImageList()) != null) {
            size = imageList.size();
        } else {
            size = 0;
        }
        c0lab.LIZ(size, "pic_cnt");
        return c0lab;
    }

    public static void LIZIZ(C0LAB c0lab, String str) {
        int i;
        if (str.length() > 0) {
            i = 1;
        } else {
            i = 0;
        }
        c0lab.LIZ(i, "with_caption");
    }

    public static void LIZJ(C0LAB c0lab, String str) {
        int i;
        if (str.length() > 0) {
            i = 1;
        } else {
            i = 0;
        }
        c0lab.LIZ(i, "with_description");
    }

    public static boolean LIZLLL(VideoPublishEditModel videoPublishEditModel, String str) {
        Iterator<String> it2 = videoPublishEditModel.creativeModel.imagePublishBackSaveModel.inspirations.iterator();
        while (it2.hasNext()) {
            if (a0.LJJIIZI(str, it2.next(), false)) {
                return true;
            }
        }
        return false;
    }

    public static boolean LJ(VideoPublishEditModel videoPublishEditModel, String str) {
        Iterator<String> it2 = videoPublishEditModel.creativeModel.imagePublishBackSaveModel.photoTexts.iterator();
        while (it2.hasNext()) {
            if (a0.LJJIIZI(str, it2.next(), false)) {
                return true;
            }
        }
        return false;
    }

    public static void LIZ(VideoPublishEditModel videoPublishEditModel, C1403560md0 c1403560md0, String str) {
        int i;
        LIZ.getClass();
        ArrayList arrayList = new ArrayList();
        int length = new Regex("\\s+").replace(str, "").length();
        int i2 = 0;
        int i3 = 0;
        int length2 = 0;
        for (String str2 : videoPublishEditModel.creativeModel.imagePublishBackSaveModel.inspirations) {
            if (a0.LJJIIZI(str, str2, false)) {
                i3++;
                String strReplace = new Regex("\\s+").replace(str2, "");
                length2 += strReplace.length() + 1;
                arrayList.add(strReplace);
            }
        }
        Iterator<String> it2 = videoPublishEditModel.creativeModel.imagePublishBackSaveModel.continueInspirations.iterator();
        int i4 = 0;
        while (it2.hasNext()) {
            if (a0.LJJIIZI(str, it2.next(), false)) {
                i4++;
            }
        }
        C1406110mh7 c1406110mh7 = LIZ;
        if (i3 > 0) {
            i = 1;
        } else {
            i = 0;
        }
        c1406110mh7.getClass();
        c1403560md0.LIZ(i, "is_inspiration_added");
        c1403560md0.LJ("topic_type", videoPublishEditModel.creativeModel.imagePublishBackSaveModel.hitVertical);
        c1403560md0.LIZ(i4, "inspiration_followed_text_cnt");
        c1403560md0.LIZ(length - length2, "text_length_without_inspiration");
        c1403560md0.LIZ(i3, "used_inspiration_cnt");
        c1403560md0.LIZ(length2, "inspiration_text_length");
        c1403560md0.LJ("inspiration_content", C13LP.LJJLIIIJ(arrayList, null, null, null, 0, null, null, 63));
        int i5 = 0;
        int length3 = 0;
        for (String str3 : videoPublishEditModel.creativeModel.imagePublishBackSaveModel.photoTexts) {
            if (a0.LJJIIZI(str, str3, false)) {
                i5++;
                length3 += str3.length();
            }
        }
        C1406110mh7 c1406110mh72 = LIZ;
        if (i5 > 0) {
            i2 = 1;
        }
        c1406110mh72.getClass();
        c1403560md0.LIZ(i2, "is_photo_text_added");
        c1403560md0.LIZ(length3, "photo_text_used_length");
    }
}
