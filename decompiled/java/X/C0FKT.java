package X;

import kotlin.Pair;

/* JADX INFO: renamed from: X.0FKT, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FKT {
    public final Pair<String, String> LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;

    public C0FKT() {
        this(0);
    }

    public /* synthetic */ C0FKT(int i) {
        this(new Pair(null, null), false, true);
    }

    public C0FKT(Pair<String, String> pair, boolean z, boolean z2) {
        this.LIZ = pair;
        this.LIZIZ = z;
        this.LIZJ = z2;
    }

    public static C0FKT LIZ(C0FKT c0fkt, Pair pair, int i) {
        boolean z;
        if ((i & 1) != 0) {
            pair = c0fkt.LIZ;
        }
        boolean z2 = false;
        if ((i & 2) != 0) {
            z = c0fkt.LIZIZ;
        } else {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = c0fkt.LIZJ;
        }
        c0fkt.getClass();
        return new C0FKT(pair, z, z2);
    }
}
