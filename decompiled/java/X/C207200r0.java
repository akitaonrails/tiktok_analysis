package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.00r0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C207200r0 {
    public static final /* synthetic */ int LIZ = 0;

    public static final String LIZ(List<? extends Aweme> list) {
        ArrayList arrayList;
        if (list != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<? extends Aweme> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().getAid());
            }
        } else {
            arrayList = null;
        }
        return String.valueOf(arrayList);
    }
}
