package X;

import Y.AObserverS214S0100000_10;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.cs.core.model.ClickSearchViewModel;

/* JADX INFO: renamed from: X.0PUG, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PUG {
    public static C0PUF LIZ(ClickSearchViewModel clickSearchViewModel, String str, int i) {
        EnumC645610PTz enumC645610PTz = EnumC645610PTz.LIVE_FEED;
        clickSearchViewModel.getClass();
        if (!ClickSearchViewModel.AQ2(enumC645610PTz)) {
            return null;
        }
        C0PUF c0puf = new C0PUF(clickSearchViewModel);
        clickSearchViewModel.BQ2(new AObserverS214S0100000_10(c0puf, 151));
        c0puf.LIZ(i, null, str);
        return c0puf;
    }
}
