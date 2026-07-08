package X;

import com.ss.android.ugc.aweme.ecommerce.preloader.model.ECPreloadApiData;
import com.ss.android.ugc.aweme.ecommerce.preloader.model.ECPreloadEntry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.08Wn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2131108Wn extends C09AY implements Function0<ArrayList<ECPreloadApiData>> {
    public C2131108Wn() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final ArrayList<ECPreloadApiData> invoke() {
        ArrayList<ECPreloadApiData> arrayList = new ArrayList<>();
        Iterator it2 = ((ArrayList) C2131308Wp.LIZJ.getValue()).iterator();
        while (it2.hasNext()) {
            List<ECPreloadApiData> list = ((ECPreloadEntry) it2.next()).apiList;
            if (list != null) {
                arrayList.addAll(list);
            }
        }
        return arrayList;
    }
}
