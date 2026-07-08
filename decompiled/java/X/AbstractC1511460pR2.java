package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.ml.api.SmartCommentConfig;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pR2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public abstract class AbstractC1511460pR2 extends AbstractC1511510pR7 implements InterfaceC1488230opZ {
    public final C01GW LIZ;
    public C1511470pR3 LIZIZ;
    public boolean LIZJ;

    public abstract SmartCommentConfig LIZIZ();

    @Override // X.AbstractC1511510pR7
    public final C1512100pS4 lastResult() {
        return null;
    }

    public AbstractC1511460pR2() {
        super("homepage_hot");
        this.LIZ = C452501pT.LIZIZ(new C1511620pRI(this));
    }

    @Override // X.AbstractC1511510pR7
    public final boolean enable() {
        return this.LIZ.getValue() != null;
    }

    @Override // X.AbstractC1511510pR7
    public final void preloadEnv() {
        C1511470pR3 c1511470pR3 = this.LIZIZ;
        if (c1511470pR3 != null) {
            c1511470pR3.preloadEnv();
        }
    }

    @Override // X.InterfaceC1488230opZ
    public final boolean LIZ(JSONObject jSONObject, C1509310pNZ c1509310pNZ) {
        String aid;
        String str;
        Aweme awemeLIZ = C1511360pQs.LIZ(c1509310pNZ);
        if (awemeLIZ != null && (aid = awemeLIZ.getAid()) != null) {
            C1509610pO3 c1509610pO3 = C1509610pO3.LIZIZ;
            AbstractC1509490pNr abstractC1509490pNrLIZ = C1509610pO3.LIZ(aid);
            if (abstractC1509490pNrLIZ == null) {
                return false;
            }
            try {
                if (C1509460pNo.LIZIZ(abstractC1509490pNrLIZ, "comment") > 0) {
                    str = "1";
                } else {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                jSONObject.put("ss_result", str);
                return true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        return false;
    }

    @Override // X.AbstractC1511510pR7
    public final void runAsyncDelay(long j, C1509310pNZ c1509310pNZ, InterfaceC1511740pRU interfaceC1511740pRU) {
        if (c1509310pNZ != null && enable()) {
            C1511470pR3 c1511470pR3 = this.LIZIZ;
            if (c1511470pR3 != null) {
                c1511470pR3.runAsyncDelay(j, c1509310pNZ, interfaceC1511740pRU);
                return;
            }
            return;
        }
        if (interfaceC1511740pRU != null) {
            interfaceC1511740pRU.LIZ(null);
        }
    }
}
