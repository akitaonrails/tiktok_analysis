package X;

import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0KmZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C527570KmZ {
    public static final C527570KmZ LIZ = new C527570KmZ();

    public static void LIZ(C0LAB c0lab, ShortVideoContext shortVideoContext, List list) {
        int i;
        if (shortVideoContext == null) {
            return;
        }
        CreativeModel creativeModel = shortVideoContext.creativeModel;
        if (creativeModel.albumModel.albumSelectionRestoreState == null) {
            return;
        }
        C527580Kma.LIZ(creativeModel, c0lab);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof TikTokMediaModel) {
                arrayList.add(obj);
            }
        }
        ArrayList<MediaModel> arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (true) {
            i = 0;
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (((TikTokMediaModel) next).selectionScenario == C0L90.SELECTION_RESTORE) {
                arrayList2.add(next);
            }
        }
        int i2 = 0;
        int i3 = 0;
        for (MediaModel mediaModel : arrayList2) {
            if (mediaModel.type == 4) {
                i2++;
            } else {
                i++;
                if (mediaModel.LJIIJJI()) {
                    i3++;
                }
            }
        }
        c0lab.LJ("preselect_pic_cnt", String.valueOf(i));
        c0lab.LJ("preselect_video_cnt", String.valueOf(i2));
        c0lab.LJ("preselect_live_photo_cnt", String.valueOf(i3));
    }

    public static void LIZIZ(ShortVideoContext shortVideoContext, String str, int i, int i2, int i3) {
        if (shortVideoContext == null) {
            return;
        }
        C1411520mpq c1411520mpq = C1411520mpq.LIZ;
        C13DA c13da = new C13DA();
        c13da.put("creation_id", shortVideoContext.getCreationId());
        String str2 = shortVideoContext.shootWay;
        String str3 = "_unknown";
        if (str2 == null) {
            str2 = "_unknown";
        }
        c13da.put("shoot_way", str2);
        String str4 = shortVideoContext.enterFrom;
        if (str4 != null) {
            str3 = str4;
        }
        c13da.put("enter_from", str3);
        c13da.put("action_type", str);
        c13da.put("preselect_pic_cnt", String.valueOf(i));
        c13da.put("preselect_video_cnt", String.valueOf(i2));
        c13da.put("preselect_live_photo_cnt", String.valueOf(i3));
        Map mapBuild = c13da.build();
        c1411520mpq.getClass();
        C1411520mpq.LIZIZ("album_clear_last_selection", mapBuild);
    }
}
