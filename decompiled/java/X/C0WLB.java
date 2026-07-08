package X;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0WLB, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WLB {
    public boolean LIZ;
    public final List<Object> LIZIZ;
    public final List<String> LIZJ;
    public final InterfaceC800420Vaa LIZLLL;

    public C0WLB() {
        this(false, null, null, 15);
    }

    public C0WLB(boolean z, List list, List list2, int i) {
        z = (i & 1) != 0 ? false : z;
        list = (i & 2) != 0 ? new ArrayList() : list;
        list2 = (i & 4) != 0 ? new ArrayList() : list2;
        this.LIZ = z;
        this.LIZIZ = list;
        this.LIZJ = list2;
        this.LIZLLL = null;
    }
}
