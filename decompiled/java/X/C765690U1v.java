package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0U1v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C765690U1v {
    public static final /* synthetic */ int LIZLLL = 0;
    public final int LIZ;
    public final boolean LIZIZ;
    public final List<C0U22> LIZJ;

    public C765690U1v() {
        throw null;
    }

    public final C765690U1v LIZ(C0U22 c0u22) {
        if (!this.LIZJ.contains(c0u22)) {
            return this;
        }
        return C765530U1f.LIZ(this.LIZ, this.LIZIZ, C13LP.LJLIIIL(c0u22, this.LIZJ));
    }

    public final C765690U1v LIZIZ(long j) {
        Iterator<C0U22> it2 = this.LIZJ.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            C0U22 next = it2.next();
            if (next.LIZ == j) {
                if (next != null) {
                    ArrayList arrayList = new ArrayList(C13LP.LJLIIIL(next, this.LIZJ));
                    if (arrayList.size() > 1) {
                        ListProtector.add(arrayList, 1, next);
                    }
                    return C765530U1f.LIZ(this.LIZ, this.LIZIZ, arrayList);
                }
            }
        }
        return this;
    }

    public C765690U1v(List list, boolean z, int i) {
        this.LIZ = i;
        this.LIZIZ = z;
        this.LIZJ = list;
    }

    public final C765690U1v LIZJ(int i, boolean z, List<C0U22> list) {
        return C765530U1f.LIZ(i, z, C13LP.LJLIL(list, this.LIZJ));
    }
}
