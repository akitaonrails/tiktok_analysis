package X;

import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.album.AlbumModel;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: X.0Kfd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C523270Kfd {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(C0LAB c0lab, ShortVideoContext shortVideoContext, List list, C523920Kgg c523920Kgg) {
        boolean z;
        boolean z2;
        Integer numValueOf;
        CreativeModel creativeModel;
        AlbumModel albumModel;
        Integer numValueOf2;
        CreativeModel creativeModel2;
        AlbumModel albumModel2;
        Integer num;
        CreativeModel creativeModel3;
        AlbumModel albumModel3;
        Set<String> set;
        CreativeModel creativeModel4;
        AlbumModel albumModel4;
        Set<String> set2;
        boolean z3 = true;
        int i = 0;
        if (c0lab.LJIIIIZZ("pic_cnt") == null) {
            z = true;
        } else {
            z = false;
        }
        if (c0lab.LJIIIIZZ("video_cnt") == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0lab.LJIIIIZZ("live_photo_cnt") != null) {
            z3 = false;
        }
        if (z || z2 || z3) {
            Iterator it2 = list.iterator();
            int i2 = 0;
            int i3 = 0;
            while (it2.hasNext()) {
                MediaModel mediaModel = (MediaModel) it2.next();
                if (mediaModel.type == 4) {
                    i2++;
                } else {
                    i++;
                    if (mediaModel.LJIIJJI()) {
                        i3++;
                    }
                }
            }
            if (z) {
                c0lab.LIZ(i, "pic_cnt");
            }
            if (z2) {
                c0lab.LIZ(i2, "video_cnt");
            }
            if (z3) {
                c0lab.LIZ(i3, "live_photo_cnt");
            }
        }
        Integer numValueOf3 = null;
        if (c523920Kgg != null) {
            c0lab.LIZ(c523920Kgg.LIZ.size(), "total_show_item_cnt");
        } else {
            if (shortVideoContext != null && (creativeModel = shortVideoContext.creativeModel) != null && (albumModel = creativeModel.albumModel) != null) {
                numValueOf = Integer.valueOf(albumModel.totalShowItemCnt);
            } else {
                numValueOf = null;
            }
            c0lab.LIZLLL(numValueOf, "total_show_item_cnt");
        }
        if (shortVideoContext != null && (creativeModel4 = shortVideoContext.creativeModel) != null && (albumModel4 = creativeModel4.albumModel) != null && (set2 = albumModel4.enteredTab) != null) {
            numValueOf2 = Integer.valueOf(set2.size());
        } else {
            numValueOf2 = null;
        }
        c0lab.LIZLLL(numValueOf2, "total_show_tab_cnt");
        if (shortVideoContext != null && (creativeModel3 = shortVideoContext.creativeModel) != null && (albumModel3 = creativeModel3.albumModel) != null && (set = albumModel3.enteredAlbum) != null) {
            numValueOf3 = Integer.valueOf(set.size());
        }
        c0lab.LIZLLL(numValueOf3, "total_show_album_cnt");
        if (shortVideoContext != null && (creativeModel2 = shortVideoContext.creativeModel) != null && (albumModel2 = creativeModel2.albumModel) != null && (num = albumModel2.maxSelectItemRank) != null) {
            c0lab.LIZ(num.intValue(), "max_select_item_rank");
        }
    }
}
