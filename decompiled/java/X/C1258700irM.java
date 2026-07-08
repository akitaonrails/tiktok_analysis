package X;

import Y.ARunnableS88S0200000_19;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.profile.business.profile.tab.MTAwemeListFragment;

/* JADX INFO: renamed from: X.0irM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1258700irM implements InterfaceC1253230iiX {
    public final /* synthetic */ MTAwemeListFragment LIZ;

    public C1258700irM(MTAwemeListFragment mTAwemeListFragment) {
        this.LIZ = mTAwemeListFragment;
    }

    @Override // X.InterfaceC1253230iiX
    public final void LIZIZ(Exception exc) {
        this.LIZ.LLJLILLLLZIIL = true;
        C786410Ut5.LJJZZIII(C2113808Pw.LIZIZ.LL, new ARunnableS88S0200000_19(this, exc, 54));
    }

    @Override // X.InterfaceC1253230iiX
    public final void LIZ(final FeedItemList feedItemList, final String str, final boolean z) {
        if (feedItemList == null) {
            int i = C2187451AjH.LIZ;
            C1720106oR.LIZ("MTAwemeListFragment", "registerAwemeResponseCallback callback awemeList is null");
        } else if (C371410EhH.LIZ()) {
            this.LIZ.JU(feedItemList, str, z);
        } else {
            C786410Ut5.LJJZZIII(C2113808Pw.LIZIZ.LL, new Runnable() { // from class: X.0ire
                @Override // java.lang.Runnable
                public final void run() {
                    C1258700irM c1258700irM = this.LL;
                    FeedItemList feedItemList2 = feedItemList;
                    String str2 = str;
                    boolean z2 = z;
                    c1258700irM.getClass();
                    C1C7U.LIZ("MTAwemeListFragment@205c.registerAwemeResponseCallback$1$awemeApiResponseCallback$1L");
                    c1258700irM.LIZ.JU(feedItemList2, str2, z2);
                    C1C7U.LIZIZ("MTAwemeListFragment@205c.registerAwemeResponseCallback$1$awemeApiResponseCallback$1L");
                }
            });
        }
    }
}
