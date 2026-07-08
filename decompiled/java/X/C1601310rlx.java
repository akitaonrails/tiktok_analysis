package X;

import android.util.SparseArray;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;

/* JADX INFO: renamed from: X.0rlx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1601310rlx {
    public static final C1601310rlx LIZIZ = new C1601310rlx();
    public final SparseArray<InterfaceC1601220rlo<FeedItemList>> LIZ;

    public final InterfaceC1601220rlo LIZ() {
        InterfaceC1601220rlo<FeedItemList> interfaceC1601220rlo = this.LIZ.get(4);
        if (interfaceC1601220rlo == null) {
            return null;
        }
        return interfaceC1601220rlo;
    }

    public C1601310rlx() {
        SparseArray<InterfaceC1601220rlo<FeedItemList>> sparseArray = new SparseArray<>();
        this.LIZ = sparseArray;
        sparseArray.put(4, new C1601330rlz());
    }
}
