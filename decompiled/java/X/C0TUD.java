package X;

import com.ss.android.ugc.aweme.explore.assem.ExploreFeedCell;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0TUD, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TUD {
    public final Aweme LIZ;
    public final WeakReference<ExploreFeedCell> LIZIZ;

    public C0TUD(ExploreFeedCell exploreFeedCell, Aweme aweme) {
        this.LIZ = aweme;
        this.LIZIZ = new WeakReference<>(exploreFeedCell);
    }
}
