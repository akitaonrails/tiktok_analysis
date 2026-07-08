package X;

import Y.AComparatorS43S0000000_24;
import com.ss.android.ugc.aweme.friendstab.model.ContentMetadata;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0rOf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1586870rOf {
    public static final ArrayList<String> LIZ = new ArrayList<>();
    public static final ArrayList<ContentMetadata> LIZIZ = new ArrayList<>();
    public static final List<String> LIZJ = new ArrayList();

    public static C1586880rOg LIZ() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(LIZ);
        ArrayList<ContentMetadata> arrayList2 = LIZIZ;
        ArrayList arrayList3 = new ArrayList();
        for (ContentMetadata contentMetadata : arrayList2) {
            if (C13LP.LJJJJ(contentMetadata.itemId, LIZ)) {
                arrayList3.add(contentMetadata);
            }
        }
        List listLJLLLL = C13LP.LJLLLL(new AComparatorS43S0000000_24(23), arrayList3);
        ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(listLJLLLL, 10));
        Iterator it2 = listLJLLLL.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((ContentMetadata) it2.next()).shareRecallReason);
        }
        List<String> list = LIZJ;
        ArrayList<String> arrayList5 = LIZ;
        ((ArrayList) list).addAll(arrayList5);
        arrayList4.size();
        arrayList5.clear();
        LIZIZ.clear();
        return new C1586880rOg(arrayList, arrayList4);
    }
}
