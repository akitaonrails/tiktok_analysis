package Y;

import X.C09JN;
import X.C1C7U;
import X.C632140Oqq;
import X.C632190Oqv;

/* JADX INFO: loaded from: classes10.dex */
public class AfS0S1000100_9 implements C09JN {
    public final int $t;
    public long j1;
    public String s0;

    @Override // X.C09JN
    public final void accept(T t) {
        switch (this.$t) {
            case 0:
                accept$0(this, t);
                break;
            case 1:
                accept$1(this, t);
                break;
            case 2:
                accept$2(this, t);
                break;
            case 3:
                accept$3(this, t);
                break;
        }
    }

    public AfS0S1000100_9(long j, int i) {
        this.$t = i;
        this.s0 = "/tiktok/v1/edibility/birthdate/";
        this.j1 = j;
    }

    public static final void accept$0(AfS0S1000100_9 afS0S1000100_9, Object obj) {
        C1C7U.LIZ("ComplianceBizNetworkMonitorKt@21f4.monitorNetworkApi$1");
        C632140Oqq.LIZ(0, System.currentTimeMillis() - afS0S1000100_9.j1, afS0S1000100_9.s0, true);
        C1C7U.LIZIZ("ComplianceBizNetworkMonitorKt@21f4.monitorNetworkApi$1");
    }

    public static final void accept$1(AfS0S1000100_9 afS0S1000100_9, Object obj) {
        C1C7U.LIZ("ComplianceBizNetworkMonitorKt@21f4.monitorNetworkApi$2");
        String str = afS0S1000100_9.s0;
        C632140Oqq.LIZ(C632190Oqv.LIZIZ((Throwable) obj), System.currentTimeMillis() - afS0S1000100_9.j1, str, false);
        C1C7U.LIZIZ("ComplianceBizNetworkMonitorKt@21f4.monitorNetworkApi$2");
    }

    public static final void accept$2(AfS0S1000100_9 afS0S1000100_9, Object obj) {
        C1C7U.LIZ("ComplianceBizNetworkMonitorKt@21f4.monitorNetworkApiDetailCode$1");
        C632140Oqq.LIZ(0, System.currentTimeMillis() - afS0S1000100_9.j1, afS0S1000100_9.s0, true);
        C1C7U.LIZIZ("ComplianceBizNetworkMonitorKt@21f4.monitorNetworkApiDetailCode$1");
    }

    public static final void accept$3(AfS0S1000100_9 afS0S1000100_9, Object obj) {
        C1C7U.LIZ("ComplianceBizNetworkMonitorKt@21f4.monitorNetworkApiDetailCode$2");
        String str = afS0S1000100_9.s0;
        C632140Oqq.LIZ(C632190Oqv.LIZ((Throwable) obj), System.currentTimeMillis() - afS0S1000100_9.j1, str, false);
        C1C7U.LIZIZ("ComplianceBizNetworkMonitorKt@21f4.monitorNetworkApiDetailCode$2");
    }

    public AfS0S1000100_9(String str, long j, int i) {
        this.$t = i;
        this.s0 = str;
        this.j1 = j;
    }
}
