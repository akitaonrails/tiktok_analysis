package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeItems;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0iXf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1246490iXf {
    public static final int LIZ(List<NoticeItems> list) {
        int size;
        int i = 0;
        if (list != null) {
            Iterator<NoticeItems> it2 = list.iterator();
            i = 0;
            while (it2.hasNext()) {
                List<? extends MusNotice> list2 = it2.next().items;
                if (list2 != null) {
                    size = list2.size();
                } else {
                    size = 0;
                }
                i += size;
            }
        }
        return i;
    }
}
