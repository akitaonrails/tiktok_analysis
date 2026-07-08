package X;

import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0roa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1602940roa {
    public static volatile C1602940roa LIZJ;
    public final List<RunnableC1602950rob> LIZ = new ArrayList();
    public final BPEAHandler LIZIZ = new BPEAHandler(Looper.getMainLooper());

    public static C1602940roa LIZ() {
        if (LIZJ == null) {
            synchronized (C1602940roa.class) {
                try {
                    if (LIZJ == null) {
                        LIZJ = new C1602940roa();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZJ;
    }

    public final void LIZJ(C1603030roj c1603030roj) {
        Aweme aweme = c1603030roj.LIZIZ;
        if (aweme != null && !TextUtils.isEmpty(aweme.getAid()) && c1603030roj.LIZLLL != null) {
            RunnableC1602950rob runnableC1602950rob = new RunnableC1602950rob(c1603030roj);
            ((ArrayList) this.LIZ).add(runnableC1602950rob);
            C786410Ut5.LJLIIL(c1603030roj.LIZ, this.LIZIZ, runnableC1602950rob);
        }
    }

    public final RunnableC1602950rob LIZIZ(String str, EnumC1604800rra enumC1604800rra) {
        C1603030roj c1603030roj;
        Aweme aweme;
        for (RunnableC1602950rob runnableC1602950rob : (ArrayList) this.LIZ) {
            if (runnableC1602950rob != null && (c1603030roj = runnableC1602950rob.LL) != null && (aweme = c1603030roj.LIZIZ) != null && aweme.getAid() != null && runnableC1602950rob.LL.LIZIZ.getAid().equals(str) && runnableC1602950rob.LL.LIZLLL == enumC1604800rra) {
                return runnableC1602950rob;
            }
        }
        return null;
    }
}
