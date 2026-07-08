package X;

import com.ss.android.ugc.aweme.ecommerce.preloader.model.ECPreloadEntry;
import com.ss.android.ugc.aweme.ecommerce.preloader.model.ECPreloadEventData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.08Wq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2131408Wq extends C09AY implements Function0<ArrayList<ECPreloadEventData>> {
    public C2131408Wq() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final ArrayList<ECPreloadEventData> invoke() {
        ArrayList<ECPreloadEventData> arrayList = new ArrayList<>();
        Iterator it2 = ((ArrayList) C2131308Wp.LIZJ.getValue()).iterator();
        while (it2.hasNext()) {
            List<ECPreloadEventData> list = ((ECPreloadEntry) it2.next()).eventList;
            if (list != null) {
                arrayList.addAll(list);
            }
        }
        return arrayList;
    }
}
