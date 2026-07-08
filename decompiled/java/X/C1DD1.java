package X;

import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.feed.count.FeedPlayNumModel;
import com.ss.android.ugc.aweme.feed.count.UserPlayNum;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.Calendar;

/* JADX INFO: renamed from: X.1DD1, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DD1 {
    public static final C1DD1 LIZ = new C1DD1();
    public static final C1DD0 LIZIZ;
    public static final IAccountService LIZJ;
    public static UserPlayNum LIZLLL;

    static {
        C1DD0 c1dd0 = new C1DD0();
        LIZIZ = c1dd0;
        IAccountService iAccountService = (IAccountService) ServiceManager.get().getService(IAccountService.class);
        LIZJ = iAccountService;
        LIZLLL = c1dd0.LIZ(iAccountService.LJIIJ().getCurUserId());
    }

    public static final int LIZ() {
        if (C300410Bq3.LIZ()) {
            return LIZLLL.model.batchNum;
        }
        return -1;
    }

    public static final int LIZIZ() {
        if (C300410Bq3.LIZ()) {
            return LIZLLL.model.batchNumAll;
        }
        return -1;
    }

    public static final int LIZJ() {
        if (C300410Bq3.LIZ()) {
            return LIZLLL.model.playNum;
        }
        return -1;
    }

    public static final int LIZLLL() {
        if (C300410Bq3.LIZ()) {
            return LIZLLL.model.playNumAll;
        }
        return -1;
    }

    public static void LJ() {
        int i = Calendar.getInstance().get(6);
        FeedPlayNumModel feedPlayNumModel = LIZLLL.model;
        if (feedPlayNumModel.date != i) {
            feedPlayNumModel.setPlayNum(0);
            feedPlayNumModel.setBatchNum(0);
            feedPlayNumModel.setRecommendPlayNum(0);
            feedPlayNumModel.setRecommendBatchNum(0);
            feedPlayNumModel.setPlayTimeBefore(0L);
            feedPlayNumModel.setDate(i);
        }
    }
}
