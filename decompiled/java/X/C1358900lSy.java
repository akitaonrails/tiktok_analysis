package X;

import android.util.LruCache;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0lSy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1358900lSy extends C09AY implements Function0<LruCache<String, UpvoteList>> {
    public C1358900lSy() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final LruCache<String, UpvoteList> invoke() {
        return new LruCache<>(100);
    }
}
