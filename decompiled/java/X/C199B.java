package X;

import kotlin.Pair;

/* JADX INFO: renamed from: X.199B, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C199B {
    public final C199E LIZ;
    public final Pair<Integer, Integer> LIZIZ;
    public final Pair<Integer, Integer> LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final InterfaceC686650QwZ LJFF;
    public final C671260QUq LJI;

    public C199B(C199E c199e, Pair pair, Pair pair2, boolean z, boolean z2, C669830QPd c669830QPd, C671260QUq c671260QUq, int i) {
        c199e = (i & 1) != 0 ? null : c199e;
        pair = (i & 2) != 0 ? null : pair;
        pair2 = (i & 4) != 0 ? null : pair2;
        z = (i & 8) != 0 ? false : z;
        z2 = (i & 16) != 0 ? false : z2;
        c669830QPd = (i & 32) != 0 ? null : c669830QPd;
        c671260QUq = (i & 64) != 0 ? null : c671260QUq;
        this.LIZ = c199e;
        this.LIZIZ = pair;
        this.LIZJ = pair2;
        this.LIZLLL = z;
        this.LJ = z2;
        this.LJFF = c669830QPd;
        this.LJI = c671260QUq;
    }
}
