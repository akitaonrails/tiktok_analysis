package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.07Wc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1875207Wc {
    public static final /* synthetic */ int LIZ = 0;

    public static List LIZ(List list) {
        if (list != null && (!list.isEmpty())) {
            int size = list.size();
            ArrayList arrayList = new ArrayList();
            int i = 0;
            for (Object obj : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    arrayList.add(new C434570H2h(i, size, (Aweme) obj));
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            return arrayList;
        }
        return C13BV.INSTANCE;
    }
}
