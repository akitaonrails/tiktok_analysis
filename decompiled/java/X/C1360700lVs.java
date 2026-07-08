package X;

import Y.AComparatorS40S0000000_21;
import com.ss.android.ugc.aweme.repostfeed.model.RepostNewContentMeta;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0lVs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1360700lVs {
    public static final ArrayList<String> LIZ = new ArrayList<>();
    public static final ArrayList<RepostNewContentMeta> LIZIZ = new ArrayList<>();
    public static final List<String> LIZJ = new ArrayList();

    public static C1586880rOg LIZ() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(LIZ);
        ArrayList<RepostNewContentMeta> arrayList2 = LIZIZ;
        ArrayList arrayList3 = new ArrayList();
        for (RepostNewContentMeta repostNewContentMeta : arrayList2) {
            if (LIZ.contains(repostNewContentMeta.itemId)) {
                arrayList3.add(repostNewContentMeta);
            }
        }
        List listLJLLLL = C13LP.LJLLLL(new AComparatorS40S0000000_21(13), arrayList3);
        ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(listLJLLLL, 10));
        Iterator it2 = listLJLLLL.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((RepostNewContentMeta) it2.next()).feedRecallReason);
        }
        List<String> list = LIZJ;
        ArrayList<String> arrayList5 = LIZ;
        ((ArrayList) list).addAll(arrayList5);
        arrayList4.size();
        arrayList5.clear();
        LIZIZ.clear();
        return new C1586880rOg(arrayList, arrayList4);
    }

    public static void LIZIZ(List list) {
        LIZ.clear();
        ArrayList<RepostNewContentMeta> arrayList = LIZIZ;
        arrayList.clear();
        ((ArrayList) LIZJ).clear();
        if (list != null) {
            arrayList.addAll(list);
        }
    }
}
