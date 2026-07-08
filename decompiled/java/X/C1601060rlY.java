package X;

import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0rlY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1601060rlY implements C0N6Y {
    public static WeakReference<C1212490hep> LIZ;

    @Override // X.C0N6Y
    public final String LIZ() {
        return "filter_consumed_in_other_scene_video";
    }

    @Override // X.C0N6Y
    public final void LIZIZ(C0N6X c0n6x, FeedItemList feedItemList, C1160560gJ4 c1160560gJ4) {
        C1212490hep c1212490hep;
        if (c0n6x.LIZ == 8) {
            return;
        }
        feedItemList.setItems(new C1601250rlr(feedItemList.getItems(), c1160560gJ4));
        WeakReference<C1212490hep> weakReference = LIZ;
        if (weakReference != null && (c1212490hep = weakReference.get()) != null) {
            c1212490hep.LIZ(c0n6x.LIZ, feedItemList.getItems());
        }
    }
}
