package X;

import com.ss.android.ugc.aweme.feed.ghouse.CacheEntry;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0NGy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C591260NGy extends C09AY implements Function1<CacheEntry, CharSequence> {
    public C591260NGy() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final CharSequence invoke(CacheEntry cacheEntry) {
        Aweme aweme;
        CacheEntry cacheEntry2 = cacheEntry;
        String aid = cacheEntry2.key;
        if (aid.length() > 0 || 0 != 0 || ((aweme = cacheEntry2.value) != null && (aid = aweme.getAid()) != null)) {
            return aid;
        }
        return "";
    }
}
