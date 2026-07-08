package X;

import java.util.List;

/* JADX INFO: renamed from: X.13bm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20044413bm {
    public final List<C20044113bj> LIZ;
    public final List<InterfaceC20044913br>[] LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public final /* synthetic */ C20044213bk LJ;

    public C20044413bm(C20044213bk c20044213bk, List<C20044113bj> list) {
        this.LJ = c20044213bk;
        this.LIZ = list;
        this.LIZIZ = new List[list.size()];
        if (!(!list.isEmpty())) {
            C1691080u6k.LIZ("NestedPrefetchController shouldn't be created with no states");
        }
    }
}
