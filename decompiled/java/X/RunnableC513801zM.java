package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import java.util.Arrays;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.01zM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class RunnableC513801zM implements Runnable {
    public final int $t;
    public long j1;
    public Object l0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).J5((int) this.j1, C786410Ut5.j4("%.2f", Arrays.copyOf(new Object[]{Float.valueOf((((C238400w2) this.l0).element / 1024.0f) / 1024.0f)}, 1)));
    }

    public static final void run$0(RunnableC513801zM runnableC513801zM) {
        boolean zLIZ;
        C1C7U.LIZ("ActiveClearLiveStorage@e066.onCleanActive$2");
        try {
            runnableC513801zM.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ActiveClearLiveStorage@e066.onCleanActive$2");
    }

    public static final void run$1(RunnableC513801zM runnableC513801zM) {
        boolean zLIZ;
        C1C7U.LIZ("IncreaseSDKTrigger@73c4.onEventLocal$1");
        try {
            ((Function1) runnableC513801zM.l0).invoke(Long.valueOf(runnableC513801zM.j1));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("IncreaseSDKTrigger@73c4.onEventLocal$1");
    }

    public static final void run$2(RunnableC513801zM runnableC513801zM) {
        boolean zLIZ;
        C1C7U.LIZ("CustomPollManager@2501.promoteCountDown$2");
        try {
            C1086960eOM.LL.LJIILJJIL(runnableC513801zM.j1, ((C01C1) runnableC513801zM.l0).LIZJ - C158B.LIZ(), (C01C1) runnableC513801zM.l0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CustomPollManager@2501.promoteCountDown$2");
    }

    public RunnableC513801zM(long j, Object obj, int i) {
        this.$t = i;
        this.j1 = j;
        this.l0 = obj;
    }
}
