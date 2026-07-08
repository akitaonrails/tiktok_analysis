package X;

import com.ss.android.ugc.aweme.feed.utils.SearchPostConsumptionInfoRecord;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0R15, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0R15 {
    public final int LIZ;
    public final LinkedList<SearchPostConsumptionInfoRecord> LIZIZ = new LinkedList<>();

    public final synchronized List<SearchPostConsumptionInfoRecord> LIZIZ() {
        return C13LP.LLIIII(this.LIZIZ);
    }

    public C0R15(int i) {
        this.LIZ = i;
    }

    public final synchronized void LIZ(SearchPostConsumptionInfoRecord searchPostConsumptionInfoRecord) {
        SearchPostConsumptionInfoRecord next;
        Iterator<SearchPostConsumptionInfoRecord> it2 = this.LIZIZ.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.searchId, searchPostConsumptionInfoRecord.searchId)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        if (next != null) {
            return;
        }
        if (this.LIZIZ.size() >= this.LIZ) {
            this.LIZIZ.pollFirst();
        }
        this.LIZIZ.addLast(searchPostConsumptionInfoRecord);
    }
}
