package Y;

import X.C09JN;
import X.C1501910pBd;
import X.C1518550pcT;
import X.C1C7U;
import X.C2097908Jt;
import com.ss.android.ugc.aweme.pns.usercommunication.api.NetworkUniversalPopupDispatchResponse;
import com.ss.android.ugc.aweme.pns.usercommunication.api.UserCommunicationProcessorModel;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes24.dex */
public class AfS3S1101100_23 implements C09JN {
    public final int $t;
    public int i2;
    public long j3;
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
        }
    }

    public static final void accept$0(AfS3S1101100_23 afS3S1101100_23, Object obj) {
        int iIntValue;
        Integer num;
        C1C7U.LIZ("UserCommunicationManager@c9a4.requestCommunicationConfigInner$5");
        NetworkUniversalPopupDispatchResponse networkUniversalPopupDispatchResponse = (NetworkUniversalPopupDispatchResponse) obj;
        long jCurrentTimeMillis = System.currentTimeMillis() - afS3S1101100_23.j3;
        if (networkUniversalPopupDispatchResponse != null) {
            C1518550pcT.LIZ.getClass();
            C1518550pcT.LIZIZ(networkUniversalPopupDispatchResponse);
        }
        C1518550pcT c1518550pcT = C1518550pcT.LIZ;
        if (networkUniversalPopupDispatchResponse != null && (num = networkUniversalPopupDispatchResponse.status_code) != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        c1518550pcT.getClass();
        C1518550pcT.LJ(iIntValue, jCurrentTimeMillis, "/popup/dispatch/", true);
        int i = afS3S1101100_23.i2;
        String str = afS3S1101100_23.s0;
        if (str == null) {
            str = "";
        }
        C1518550pcT.LJFF(i, 0, str, true);
        String str2 = afS3S1101100_23.s0;
        if (str2 != null) {
            C1518550pcT.LJI(new UserCommunicationProcessorModel(str2, networkUniversalPopupDispatchResponse, null), Integer.valueOf(afS3S1101100_23.i2), C2097908Jt.LIZJ(new Pair("enter_from", "request_communication_config")));
        }
        Function1 function1 = (Function1) afS3S1101100_23.l1;
        if (function1 != null) {
            function1.invoke(networkUniversalPopupDispatchResponse);
        }
        C1C7U.LIZIZ("UserCommunicationManager@c9a4.requestCommunicationConfigInner$5");
    }

    public static final void accept$1(AfS3S1101100_23 afS3S1101100_23, Object obj) {
        C1C7U.LIZ("UserCommunicationManager@c9a4.requestCommunicationConfigInner$6");
        long jCurrentTimeMillis = System.currentTimeMillis() - afS3S1101100_23.j3;
        int iLIZ = C1501910pBd.LIZ((Throwable) obj);
        C1518550pcT.LIZ.getClass();
        C1518550pcT.LJ(iLIZ, jCurrentTimeMillis, "/popup/dispatch/", false);
        int i = afS3S1101100_23.i2;
        String str = afS3S1101100_23.s0;
        if (str == null) {
            str = "";
        }
        C1518550pcT.LJFF(i, iLIZ, str, false);
        Function1 function1 = (Function1) afS3S1101100_23.l1;
        if (function1 != null) {
            function1.invoke(null);
        }
        C1C7U.LIZIZ("UserCommunicationManager@c9a4.requestCommunicationConfigInner$6");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0003: IPUT (r2 I:long), (r0 I:Y.AfS3S1101100_23) (LINE:83886083) Y.AfS3S1101100_23.j3 long, block:B:2:0x0000 */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0005: IPUT (r4 I:int), (r0 I:Y.AfS3S1101100_23) (LINE:83886085) Y.AfS3S1101100_23.i2 int, block:B:2:0x0000 */
    /* JADX WARN: Type inference failed for: r1v0, types: [Y.AfS3S1101100_23, java.lang.Object] */
    public AfS3S1101100_23(long j, long j2, int i, String str, Function1<? super NetworkUniversalPopupDispatchResponse, Unit> function1) {
        long j3;
        int i2;
        obj.$t = function1;
        obj.j3 = j3;
        obj.i2 = i2;
        obj.s0 = i;
        obj.l1 = str;
        ?? obj = new Object();
    }
}
