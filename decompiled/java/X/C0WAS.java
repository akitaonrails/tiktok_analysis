package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: X.0WAS, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WAS {
    public final long LIZ;
    public final long LIZIZ;
    public final C0WAJ LIZJ;
    public final boolean LIZLLL;
    public final List<String> LJ;

    public C0WAS(long j, long j2, C0WAJ c0waj, boolean z, List list) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = c0waj;
        this.LIZLLL = z;
        ArrayList arrayList = (ArrayList) list;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (Object obj : arrayList) {
            Objects.requireNonNull(obj);
            arrayList2.add(obj);
        }
        this.LJ = Collections.unmodifiableList(arrayList2);
    }
}
