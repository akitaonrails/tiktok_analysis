package X;

import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeedList;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.0PNl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C643910PNl {
    public static final C0X9S<C1515820pY4<SearchMixFeedList>> LIZ(C15O7<?> c15o7) {
        C0POX.LIZ.getClass();
        return (C0X9S) ((LinkedHashMap) C0POX.LIZJ).get(c15o7);
    }

    public static final void LIZIZ(C15O7<?> c15o7, C0X9S<C1515820pY4<SearchMixFeedList>> c0x9s) {
        if (c0x9s != null) {
            C0POX.LIZ.getClass();
            C0POX.LIZJ.put(c15o7, c0x9s);
        } else {
            C0POX.LIZ.getClass();
            C0POX.LIZJ.remove(c15o7);
        }
    }
}
