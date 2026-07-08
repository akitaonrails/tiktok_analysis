package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: X.0p44, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1497220p44 extends AbstractC1497330p4F {
    public final List<String> LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final boolean LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final AtomicLong LJI;
    public final C1497320p4E LJII;

    @Override // X.AbstractC1497330p4F
    public final Map<String, List<String>> LIZ() {
        C1497320p4E c1497320p4E = this.LJII;
        Map<String, List<String>> map = c1497320p4E.LIZIZ;
        if (map != null) {
            return map;
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (Map.Entry<String, String> entry : c1497320p4E.LIZ) {
            ArrayList arrayList = new ArrayList();
            if (treeMap.containsKey(entry.getKey())) {
                arrayList.addAll((Collection) treeMap.get(entry.getKey()));
            }
            arrayList.add(entry.getValue());
            treeMap.put(entry.getKey(), Collections.unmodifiableList(arrayList));
        }
        Map<String, List<String>> mapUnmodifiableMap = Collections.unmodifiableMap(treeMap);
        c1497320p4E.LIZIZ = mapUnmodifiableMap;
        return mapUnmodifiableMap;
    }

    public final String toString() {
        return C786410Ut5.k4(Locale.ROOT, "UrlResponseInfo@[%s][%s]: urlChain = %s, httpStatus = %d %s, headers = %s, wasCached = %b, negotiatedProtocol = %s, proxyServer= %s, receivedByteCount = %d", new Object[]{Integer.toHexString(System.identityHashCode(this)), ListProtector.get(this.LIZ, r1.size() - 1), this.LIZ.toString(), Integer.valueOf(this.LIZIZ), this.LIZJ, this.LJII.LIZ.toString(), Boolean.valueOf(this.LIZLLL), this.LJ, this.LJFF, Long.valueOf(this.LJI.get())});
    }

    public C1497220p44(List<String> list, int i, String str, List<Map.Entry<String, String>> list2, boolean z, String str2, String str3, long j) {
        this.LIZ = Collections.unmodifiableList(list);
        this.LIZIZ = i;
        this.LIZJ = str;
        this.LJII = new C1497320p4E(Collections.unmodifiableList(list2));
        this.LIZLLL = z;
        this.LJ = str2;
        this.LJFF = str3;
        this.LJI = new AtomicLong(j);
    }
}
