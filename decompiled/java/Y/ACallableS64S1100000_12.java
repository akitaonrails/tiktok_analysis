package Y;

import X.C01GW;
import X.C0T5M;
import X.C0T9S;
import X.C13LP;
import X.C1C7U;
import X.C20684815ws;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.feed.model.consistency.ConsistencyGroupStruct;
import com.ss.android.ugc.aweme.feed.model.consistency.ConsistencyRspStruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Unit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public class ACallableS64S1100000_12 implements Callable {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            case 3:
                return call$3(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS64S1100000_12 aCallableS64S1100000_12) {
        C1C7U.LIZ("InsertionDataRepository@5e2f.rawData$1");
        C0T5M.LIZ.getClass();
        if (((CopyOnWriteArraySet) C0T5M.LJIIIZ.getValue()).contains(aCallableS64S1100000_12.s0)) {
            C01GW c01gw = C0T5M.LJIIIIZZ;
            ((CopyOnWriteArrayList) c01gw.getValue()).clear();
            ((CopyOnWriteArrayList) c01gw.getValue()).addAll(((FeedItemList) aCallableS64S1100000_12.l1).getItems());
            C0T5M.LIZLLL().clear();
        } else {
            ConsistencyRspStruct consistencyRspStruct = (ConsistencyRspStruct) ((ConcurrentHashMap) C0T5M.LIZJ.getValue()).get(aCallableS64S1100000_12.s0);
            if (consistencyRspStruct != null) {
                FeedItemList feedItemList = (FeedItemList) aCallableS64S1100000_12.l1;
                String str = aCallableS64S1100000_12.s0;
                C01GW c01gw2 = C0T5M.LJIIIIZZ;
                if (!((CopyOnWriteArrayList) c01gw2.getValue()).isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    for (Aweme aweme : (CopyOnWriteArrayList) c01gw2.getValue()) {
                        long jLJ = C0T5M.LJ(aweme.getAid());
                        ConsistencyGroupStruct consistencyGroupStructLIZJ = C0T5M.LIZJ(jLJ, aweme.getAid(), "cached_video");
                        HashMap<Long, ConsistencyGroupStruct> consistencyGroups = consistencyRspStruct.getConsistencyGroups();
                        if (consistencyGroups != null) {
                            consistencyGroups.put(Long.valueOf(jLJ), consistencyGroupStructLIZJ);
                        }
                        arrayList.add(Long.valueOf(jLJ));
                    }
                    consistencyRspStruct.setClientGidList(arrayList);
                    ((CopyOnWriteArrayList) C0T5M.LJIIIIZZ.getValue()).clear();
                }
                C0T5M.LIZ.getClass();
                if (feedItemList != null && feedItemList.getItems() != null) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.addAll(consistencyRspStruct.getClientGidList());
                    Iterator<Aweme> it2 = feedItemList.getItems().iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(Long.valueOf(C0T5M.LJ(it2.next().getAid())));
                    }
                    consistencyRspStruct.setClientGidList(arrayList2);
                    consistencyRspStruct.setFinalGidList(arrayList2);
                }
                C0T5M.LIZ.getClass();
                C0T5M.LJI(consistencyRspStruct, str, true);
                C0T5M.LIZLLL().add(consistencyRspStruct);
            }
        }
        C0T5M.LIZ.getClass();
        C01GW c01gw3 = C0T5M.LIZJ;
        if (((ConcurrentHashMap) c01gw3.getValue()).containsKey(aCallableS64S1100000_12.s0)) {
            ((ConcurrentHashMap) c01gw3.getValue()).remove(aCallableS64S1100000_12.s0);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("InsertionDataRepository@5e2f.rawData$1");
        return unit;
    }

    public static final Object call$1(ACallableS64S1100000_12 aCallableS64S1100000_12) {
        ConsistencyRspStruct consistencyRspStruct;
        HashMap<Long, ConsistencyGroupStruct> consistencyGroups;
        C1C7U.LIZ("InsertionDataRepository@5e2f.record$1");
        for (Aweme aweme : (List) aCallableS64S1100000_12.l1) {
            C0T5M c0t5m = C0T5M.LIZ;
            String aid = aweme.getAid();
            c0t5m.getClass();
            long jLJ = C0T5M.LJ(aid);
            ConsistencyGroupStruct consistencyGroupStructLIZJ = C0T5M.LIZJ(jLJ, aweme.getAid(), aCallableS64S1100000_12.s0);
            if (!C0T5M.LIZLLL().isEmpty() && (consistencyRspStruct = (ConsistencyRspStruct) C13LP.LJJJJZI(C0T5M.LIZLLL())) != null && (consistencyGroups = consistencyRspStruct.getConsistencyGroups()) != null) {
                consistencyGroups.put(Long.valueOf(jLJ), consistencyGroupStructLIZJ);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("InsertionDataRepository@5e2f.record$1");
        return unit;
    }

    public static final Object call$2(ACallableS64S1100000_12 aCallableS64S1100000_12) {
        C1C7U.LIZ("DownloadAwemeVideoServiceImpl@6b64.getProxyAbsMointorDownloadListener$1$onSuccess$1");
        ((C0T9S) aCallableS64S1100000_12.l1).LIZ();
        ((C0T9S) aCallableS64S1100000_12.l1).onSuccess(aCallableS64S1100000_12.s0);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DownloadAwemeVideoServiceImpl@6b64.getProxyAbsMointorDownloadListener$1$onSuccess$1");
        return unit;
    }

    public static final Object call$3(ACallableS64S1100000_12 aCallableS64S1100000_12) {
        C1C7U.LIZ("CommentLogger@c1c.onEventReportInBackground$2");
        C20684815ws.LJIJ(aCallableS64S1100000_12.s0, (JSONObject) aCallableS64S1100000_12.l1);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CommentLogger@c1c.onEventReportInBackground$2");
        return unit;
    }

    public ACallableS64S1100000_12(Object obj, String str, int i) {
        this.$t = i;
        this.s0 = str;
        this.l1 = obj;
    }
}
