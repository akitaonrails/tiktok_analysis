package X;

import com.ss.android.ugc.aweme.im.search.sdk.config.SearchSdkOptions;

/* JADX INFO: renamed from: X.0ZjV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C907870ZjV {
    public static C907880ZjW LIZ;
    public static SearchSdkOptions LIZIZ = new SearchSdkOptions(false);

    public static C907880ZjW LIZ() {
        C907880ZjW c907880ZjW = LIZ;
        if (c907880ZjW != null) {
            return c907880ZjW;
        }
        throw new IllegalStateException("Search config is not initialized");
    }
}
