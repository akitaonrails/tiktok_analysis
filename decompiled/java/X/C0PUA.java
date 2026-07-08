package X;

import Y.AObserverS214S0100000_10;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.cs.core.model.ClickSearchViewModel;

/* JADX INFO: renamed from: X.0PUA, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PUA {
    public static C0PU6 LIZ(ClickSearchViewModel clickSearchViewModel) {
        for (EnumC645610PTz enumC645610PTz : C0PU6.LJIIIIZZ) {
            clickSearchViewModel.getClass();
            if (ClickSearchViewModel.AQ2(enumC645610PTz)) {
                C0PU6 c0pu6 = new C0PU6(clickSearchViewModel);
                clickSearchViewModel.BQ2(new AObserverS214S0100000_10(c0pu6, 152));
                return c0pu6;
            }
        }
        return null;
    }
}
