package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00V0, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00V0 {
    public List<Pair<String, String>> LIZ;
    public List<String> LIZIZ;

    public C00V0() {
        C13BV c13bv = C13BV.INSTANCE;
        this.LIZ = c13bv;
        this.LIZIZ = c13bv;
    }

    public final List<String> LIZ(String str) {
        String second;
        List<Pair<String, String>> list = this.LIZ;
        ArrayList arrayList = new ArrayList();
        for (Pair<String, String> pair : list) {
            if (Intrinsics.LJFF(pair.getFirst(), str) && (second = pair.getSecond()) != null) {
                arrayList.add(second);
            }
        }
        return arrayList;
    }

    public static final void LIZIZ(Set<String> set, C00V0 c00v0, List<String> list, String str) {
        set.add(str);
        List<Pair<String, String>> list2 = c00v0.LIZ;
        ArrayList arrayList = new ArrayList();
        for (Pair<String, String> pair : list2) {
            if (Intrinsics.LJFF(pair.getSecond(), str)) {
                arrayList.add(pair);
            }
        }
        ArrayList<String> arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((Pair) it2.next()).getFirst());
        }
        for (String str2 : arrayList2) {
            if (!set.contains(str2)) {
                LIZIZ(set, c00v0, list, str2);
            }
        }
        ((ArrayList) list).add(str);
    }
}
