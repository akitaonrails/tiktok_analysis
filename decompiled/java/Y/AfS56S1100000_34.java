package Y;

import X.C09JN;
import X.C1C7U;
import X.C201955140j;
import X.C2188811AlT;
import X.C2216011BoF;
import X.C830690WiJ;

/* JADX INFO: loaded from: classes35.dex */
public class AfS56S1100000_34 implements C09JN {
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
            case 3:
                accept$3(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS56S1100000_34 afS56S1100000_34, Object obj) {
        C1C7U.LIZ("PostPublishClarityScoreScheduler@617a.reportInitialCoverEvent$1");
        C830690WiJ c830690WiJ = C830690WiJ.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("submit quality advisor initial events success postItemId=");
        sbLIZ.append(afS56S1100000_34.s0);
        sbLIZ.append(" publishId=");
        sbLIZ.append(((C2216011BoF) afS56S1100000_34.l1).LIZ);
        C201955140j.LIZLLL(c830690WiJ, "PostPublishClarityScoreScheduler", C2188811AlT.LIZIZ(sbLIZ));
        C1C7U.LIZIZ("PostPublishClarityScoreScheduler@617a.reportInitialCoverEvent$1");
    }

    public static final void accept$1(AfS56S1100000_34 afS56S1100000_34, Object obj) {
        C1C7U.LIZ("PostPublishClarityScoreScheduler@617a.reportInitialCoverEvent$2");
        C830690WiJ c830690WiJ = C830690WiJ.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("submit quality advisor initial events failed postItemId=");
        sbLIZ.append(afS56S1100000_34.s0);
        sbLIZ.append(" publishId=");
        sbLIZ.append(((C2216011BoF) afS56S1100000_34.l1).LIZ);
        sbLIZ.append(": ");
        sbLIZ.append(obj);
        C201955140j.LJIIIIZZ(c830690WiJ, "PostPublishClarityScoreScheduler", C2188811AlT.LIZIZ(sbLIZ));
        C1C7U.LIZIZ("PostPublishClarityScoreScheduler@617a.reportInitialCoverEvent$2");
    }

    public static final void accept$2(AfS56S1100000_34 afS56S1100000_34, Object obj) {
        C1C7U.LIZ("PostPublishClarityScoreScheduler@617a.reportQualityAdvisorEvents$1");
        C830690WiJ c830690WiJ = C830690WiJ.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("submit quality advisor score event success postItemId=");
        sbLIZ.append(afS56S1100000_34.s0);
        sbLIZ.append(" publishId=");
        sbLIZ.append(((C2216011BoF) afS56S1100000_34.l1).LIZ);
        C201955140j.LIZLLL(c830690WiJ, "PostPublishClarityScoreScheduler", C2188811AlT.LIZIZ(sbLIZ));
        C1C7U.LIZIZ("PostPublishClarityScoreScheduler@617a.reportQualityAdvisorEvents$1");
    }

    public static final void accept$3(AfS56S1100000_34 afS56S1100000_34, Object obj) {
        C1C7U.LIZ("PostPublishClarityScoreScheduler@617a.reportQualityAdvisorEvents$2");
        C830690WiJ c830690WiJ = C830690WiJ.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("submit quality advisor score event failed postItemId=");
        sbLIZ.append(afS56S1100000_34.s0);
        sbLIZ.append(" publishId=");
        sbLIZ.append(((C2216011BoF) afS56S1100000_34.l1).LIZ);
        sbLIZ.append(": ");
        sbLIZ.append(obj);
        C201955140j.LJIIIIZZ(c830690WiJ, "PostPublishClarityScoreScheduler", C2188811AlT.LIZIZ(sbLIZ));
        C1C7U.LIZIZ("PostPublishClarityScoreScheduler@617a.reportQualityAdvisorEvents$2");
    }

    public AfS56S1100000_34(String str, C2216011BoF c2216011BoF, int i) {
        this.$t = i;
        this.s0 = str;
        this.l1 = c2216011BoF;
    }
}
