package X;

import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: X.0KzA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class CallableC535380KzA<V> implements Callable {
    public static final CallableC535380KzA<V> LL = new CallableC535380KzA<>();

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C1C7U.LIZ("PublishParallelDraftList@4fa0.loadAndReset$1");
        List<String> listLIZLLL = C0CHQ.LIZ().getPublishService().LJIIL().LIZLLL();
        ArrayList arrayList = new ArrayList();
        Iterator<String> it2 = listLIZLLL.iterator();
        while (it2.hasNext()) {
            AwemeDraft awemeDraftLJI = C0CHQ.LIZ().LJI().LJIILJJIL().LJI(new C558570LvT(new CreativeInfo(it2.next(), 0, null, 6, null), true, false, false, 12));
            if (awemeDraftLJI != null && System.currentTimeMillis() - awemeDraftLJI.saveTime <= 86400000) {
                arrayList.add(awemeDraftLJI);
            }
        }
        List listLLIIII = C13LP.LLIIII(arrayList);
        C1C7U.LIZIZ("PublishParallelDraftList@4fa0.loadAndReset$1");
        return listLLIIII;
    }
}
