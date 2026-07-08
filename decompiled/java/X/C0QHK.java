package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.search.df.api.cointask.core.spi.ISearchCoinHintService;
import java.util.List;

/* JADX INFO: renamed from: X.0QHK, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QHK implements InterfaceC1601620rmS {
    public static final C0QHK LIZ = new C0QHK();

    @Override // X.InterfaceC1601620rmS
    public final void LLZZ(boolean z) {
        C670650QSh.LIZ.getClass();
        if (C0QS0.LIZ()) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C670580QSa(z, null), 3);
        }
    }

    @Override // X.InterfaceC1601620rmS
    public final void LLLIIII(List<? extends Aweme> list, boolean z) {
        if (list != null && !list.isEmpty()) {
            ISearchCoinHintService.LIZ.getClass();
            ISearchCoinHintService iSearchCoinHintServiceLIZ = C0QQF.LIZ();
            if (iSearchCoinHintServiceLIZ != null) {
                iSearchCoinHintServiceLIZ.LIZ();
            }
            for (Aweme aweme : list) {
                if (aweme != null) {
                    AwemeExtKt.appendExtraParamUseInSearch(aweme, "is_first_refresh", String.valueOf(z));
                }
            }
        }
    }
}
