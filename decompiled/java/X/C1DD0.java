package X;

import Y.ARunnableS30S1100000_26;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.count.FeedPlayNumModel;
import com.ss.android.ugc.aweme.feed.count.UserPlayNum;
import java.util.Calendar;
import kotlin.jvm.internal.AFwS226S0000000_35;

/* JADX INFO: renamed from: X.1DD0, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DD0 {
    public final C01GW LIZ = C452501pT.LIZIZ(new C1DD3());
    public final C0S4J LIZIZ = new C0S4J("play_num");

    public final UserPlayNum LIZ(String str) {
        if (!C300410Bq3.LIZ()) {
            return new UserPlayNum(str, new FeedPlayNumModel(0, 0, 0, 0, 0, 0, 0L, Calendar.getInstance().get(6)));
        }
        String string = ((Keva) this.LIZ.getValue()).getString(str, "");
        if (string != null && string.length() != 0) {
            try {
                UserPlayNum userPlayNum = new UserPlayNum(str, (FeedPlayNumModel) C7740030o.LIZ().getGson().LJII(string, FeedPlayNumModel.class));
                int i = Calendar.getInstance().get(6);
                FeedPlayNumModel feedPlayNumModel = userPlayNum.model;
                if (i != feedPlayNumModel.date) {
                    feedPlayNumModel.setPlayNum(0);
                    userPlayNum.model.setBatchNum(0);
                    userPlayNum.model.setRecommendPlayNum(0);
                    userPlayNum.model.setRecommendBatchNum(0);
                    userPlayNum.model.setPlayTimeBefore(0L);
                    userPlayNum.model.setDate(Calendar.getInstance().get(6));
                }
                return userPlayNum;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                if (C300410Bq3.LIZ()) {
                    new ARunnableS30S1100000_26(this, str, 4).run();
                }
                this.LIZIZ.LJII(AFwS226S0000000_35.get$arr$(431));
                return C1DD2.LIZ(str);
            }
        }
        return C1DD2.LIZ(str);
    }

    public final void LIZIZ(UserPlayNum userPlayNum) {
        if (!C300410Bq3.LIZ()) {
            return;
        }
        try {
            ((Keva) this.LIZ.getValue()).storeString(userPlayNum.uid, C7740030o.LIZ().getGson().LJIILL(userPlayNum.model));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.LIZIZ.LJII(AFwS226S0000000_35.get$arr$(432));
        }
    }
}
