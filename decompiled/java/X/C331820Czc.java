package X;

import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.recommend.model.UcpRecommendationItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0Czc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C331820Czc {
    public static List LIZ() {
        ArrayList arrayList = new ArrayList(6);
        int i = 0;
        do {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("loading_");
            sbLIZ.append(i);
            arrayList.add(new C08LM(C2188811AlT.LIZIZ(sbLIZ), i, true));
            i++;
        } while (i < 6);
        return arrayList;
    }

    public static List LIZIZ(List list) {
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i >= 0) {
                UcpRecommendationItem ucpRecommendationItem = (UcpRecommendationItem) obj;
                String uniqueId = ucpRecommendationItem.getUniqueId();
                if (a0.LJJJIL(uniqueId)) {
                    uniqueId = ucpRecommendationItem.getId();
                    if (a0.LJJJIL(uniqueId)) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("seed_");
                        sbLIZ.append(i);
                        uniqueId = C2188811AlT.LIZIZ(sbLIZ);
                    }
                }
                arrayList.add(new C08LM(uniqueId, i, true));
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        return arrayList;
    }
}
