package X;

import com.ss.android.ugc.aweme.interest.model.InterestId;
import com.ss.android.ugc.aweme.interest.model.InterestUpdateData;
import com.ss.android.ugc.aweme.service.interest.model.InterestTag;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0uun, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1722110uun {
    public static String LIZ(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((InterestTag) obj).id != null) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            String str = ((InterestTag) it2.next()).id;
            if (str == null) {
                str = "";
            }
            arrayList2.add(new InterestId(str));
        }
        C1227904rF c1227904rF = C1227904rF.LIZ;
        InterestUpdateData interestUpdateData = new InterestUpdateData(arrayList2, 0, 0, 0);
        c1227904rF.getClass();
        return C1227904rF.LJI(interestUpdateData);
    }
}
