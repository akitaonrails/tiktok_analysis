package X;

import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: X.129b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C197085129b {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(List list, List list2) {
        Object objPrevious;
        int rank;
        String promotionTag;
        ListIterator listIterator = list.listIterator(list.size());
        do {
            objPrevious = null;
            if (!listIterator.hasPrevious()) {
                break;
            } else {
                objPrevious = listIterator.previous();
            }
        } while (((MusicModel) objPrevious).getRank() <= 0);
        MusicModel musicModel = (MusicModel) objPrevious;
        if (musicModel != null) {
            rank = musicModel.getRank() + 1;
        } else {
            rank = 1;
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            MusicModel musicModel2 = (MusicModel) it2.next();
            Music music = musicModel2.getMusic();
            if (music == null || (promotionTag = music.getPromotionTag()) == null || promotionTag.length() == 0) {
                musicModel2.setRank(rank);
                rank++;
            }
        }
    }
}
