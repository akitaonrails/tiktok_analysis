package X;

/* JADX INFO: renamed from: X.0Id0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C470680Id0<Key, Value> {
    public final C476690Imh LIZ;
    public final AbstractC470740Id6<Key, Value> LIZIZ;
    public AbstractC470940IdQ LIZJ;
    public final C08D8 LIZLLL = C08D9.LIZLLL;

    public C470680Id0(AbstractC470740Id6<Key, Value> abstractC470740Id6, C476690Imh c476690Imh) {
        if (c476690Imh != null) {
            this.LIZIZ = abstractC470740Id6;
            this.LIZ = c476690Imh;
            return;
        }
        throw new IllegalArgumentException("PagedList.Config must be provided");
    }
}
