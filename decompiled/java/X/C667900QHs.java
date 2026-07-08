package X;

import com.ss.android.ugc.aweme.search.pages.middlepage.core.repo.signal.SearchIntermediateAwemeInfo;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QHs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C667900QHs extends C09AY implements Function2<C667760QHe, C660270Pv7, C667760QHe> {
    public C667900QHs() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final C667760QHe invoke(C667760QHe c667760QHe, C660270Pv7 c660270Pv7) {
        Object next;
        C667760QHe c667760QHe2 = c667760QHe;
        C660270Pv7 c660270Pv72 = c660270Pv7;
        if (!c667760QHe2.LIZ) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(c667760QHe2.LJI);
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(((SearchIntermediateAwemeInfo) next).groupId, c660270Pv72.LIZ.groupId)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            SearchIntermediateAwemeInfo searchIntermediateAwemeInfo = (SearchIntermediateAwemeInfo) next;
            if (searchIntermediateAwemeInfo == null) {
                arrayList.add(c660270Pv72.LIZ);
            } else {
                long j = searchIntermediateAwemeInfo.innerPlayTime + searchIntermediateAwemeInfo.outerPlayTime;
                SearchIntermediateAwemeInfo searchIntermediateAwemeInfo2 = c660270Pv72.LIZ;
                if (j <= searchIntermediateAwemeInfo2.innerPlayTime + searchIntermediateAwemeInfo2.outerPlayTime) {
                    arrayList.remove(searchIntermediateAwemeInfo);
                    arrayList.add(c660270Pv72.LIZ);
                }
            }
            if (arrayList.size() > 10) {
                C19719612Di.LJJIIZI(arrayList);
            }
            return C667760QHe.LIZ(c667760QHe2, false, false, 0L, 0L, null, null, arrayList, 63);
        }
        return c667760QHe2;
    }
}
