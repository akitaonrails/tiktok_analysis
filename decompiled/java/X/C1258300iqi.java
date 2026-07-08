package X;

import Y.ARunnableS119S0100000_19;
import Y.ARunnableS88S0200000_19;
import android.os.Looper;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.profile.business.profile.tab.MTAwemeListFragment;

/* JADX INFO: renamed from: X.0iqi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1258300iqi implements InterfaceC1253680ijG {
    public final /* synthetic */ MTAwemeListFragment LIZ;

    public final void LIZ() {
        this.LIZ.LLJLILLLLZIIL = true;
        C786410Ut5.LJJZZIII(C2113808Pw.LIZIZ.LL, new ARunnableS119S0100000_19(this, 202));
    }

    public C1258300iqi(MTAwemeListFragment mTAwemeListFragment) {
        this.LIZ = mTAwemeListFragment;
    }

    public final void LIZIZ(FeedItemList feedItemList) {
        if (!((Boolean) C1ELC.LJI.getValue()).booleanValue() && C786410Ut5.u3() == Looper.getMainLooper().getThread()) {
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("registerAwemeCacheCallback  awemeCacheCallback no post main thread ");
            sbLIZ.append(this.LIZ.LLJIJIL);
            C1720106oR.LJI("MTAwemeListFragment", C2188811AlT.LIZIZ(sbLIZ));
            this.LIZ.EU(feedItemList);
            return;
        }
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("registerAwemeCacheCallback  awemeCacheCallback post main thread ");
        sbLIZ2.append(this.LIZ.LLJIJIL);
        C1720106oR.LJI("MTAwemeListFragment", C2188811AlT.LIZIZ(sbLIZ2));
        C786410Ut5.LJJZZIII(C2113808Pw.LIZIZ.LL, new ARunnableS88S0200000_19(this, feedItemList, 60));
    }
}
