package Y;

import X.AnonymousClass0576;
import X.C09JN;
import X.C12998056u;
import X.C13000056w;
import X.C13002056y;
import X.C13003056z;
import X.C1C7U;
import X.C2188811AlT;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.friends.model.ShortenUrlModel;
import com.ss.android.ugc.aweme.im.frequencycontrol.impl.sync.api.model.FrequencyBatchSyncResponse;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public class AfS40S1100000_2 implements C09JN {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS40S1100000_2 afS40S1100000_2, Object obj) {
        C1C7U.LIZ("InviteFriendsSharePackageV2@4fd5.getShortenUrl$1");
        Function1 function1 = (Function1) afS40S1100000_2.l1;
        String url = ((ShortenUrlModel) obj).getUrl();
        if (url == null) {
            url = afS40S1100000_2.s0;
        }
        function1.invoke(url);
        C1C7U.LIZIZ("InviteFriendsSharePackageV2@4fd5.getShortenUrl$1");
    }

    public static final void accept$1(AfS40S1100000_2 afS40S1100000_2, Object obj) {
        C1C7U.LIZ("GlobalAppSyncManager@2ef9.fullBatchSyncWith$1$disp$1");
        FrequencyBatchSyncResponse frequencyBatchSyncResponse = (FrequencyBatchSyncResponse) obj;
        String str = afS40S1100000_2.s0;
        List list = (List) afS40S1100000_2.l1;
        synchronized (C12998056u.LIZIZ) {
            try {
                C12998056u.LIZJ = null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        C12998056u.LIZ(frequencyBatchSyncResponse, str, list);
        Integer num = frequencyBatchSyncResponse.statusCode;
        if (num != null && num.intValue() == 0) {
            long jLongValue = ((Number) C12998056u.LIZLLL.invoke()).longValue();
            C13002056y.LIZ.getClass();
            C13002056y.LJII(jLongValue, str);
            C13003056z.LIZ.LIZJ(false);
        } else {
            C13003056z.LIZ.LIZJ(true);
        }
        C1C7U.LIZIZ("GlobalAppSyncManager@2ef9.fullBatchSyncWith$1$disp$1");
    }

    public static final void accept$2(AfS40S1100000_2 afS40S1100000_2, Object obj) {
        C1C7U.LIZ("PeriodicSyncScheduler@38b.syncWith$disp$2");
        C13000056w.LIZJ((AnonymousClass0576) afS40S1100000_2.l1);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(afS40S1100000_2.s0);
        sbLIZ.append(": batchSync failed: ");
        sbLIZ.append(((Throwable) obj).getMessage());
        C2188811AlT.LIZIZ(sbLIZ);
        C1C7U.LIZIZ("PeriodicSyncScheduler@38b.syncWith$disp$2");
    }

    public AfS40S1100000_2(String str, Object obj, int i) {
        this.$t = i;
        this.s0 = str;
        this.l1 = obj;
    }
}
