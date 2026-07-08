package X;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0oyq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1493980oyq {
    public final List<C1495560p1O> LIZ;
    public int LIZIZ;
    public boolean LIZJ;

    public final boolean LIZ() {
        if (this.LIZJ && this.LIZIZ == this.LIZ.size()) {
            this.LIZIZ = 0;
            this.LIZJ = false;
        }
        return this.LIZIZ < this.LIZ.size();
    }

    public C1493980oyq(List<C1495560p1O> list) {
        this.LIZ = list;
        ArrayList arrayList = (ArrayList) list;
        if (arrayList.size() < C1490230osn.LIZIZ().LJFF.get()) {
            ArrayList arrayList2 = new ArrayList(list);
            arrayList.addAll(arrayList2);
            arrayList.addAll(arrayList2);
            this.LIZJ = true;
        }
        if (arrayList.size() > 1) {
            this.LIZJ = true;
        }
    }
}
