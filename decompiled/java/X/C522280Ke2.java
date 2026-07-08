package X;

import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0Ke2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C522280Ke2 {
    public static String LIZ(List list) {
        if ((list instanceof Collection) && list.isEmpty()) {
            return "photo";
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            if (((MediaModel) it2.next()).LJIILJJIL()) {
                return "video";
            }
        }
        return "photo";
    }

    public static int LIZIZ(List list) {
        TikTokMediaModel tikTokMediaModel;
        if (list.isEmpty()) {
            return 0;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            MediaModel mediaModel = (MediaModel) it2.next();
            if ((mediaModel instanceof TikTokMediaModel) && (tikTokMediaModel = (TikTokMediaModel) mediaModel) != null && tikTokMediaModel.selectIndex > 200) {
                return 1;
            }
        }
        return 0;
    }
}
