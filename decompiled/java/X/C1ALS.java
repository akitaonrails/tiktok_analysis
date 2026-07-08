package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveBroadcastRequestControlSparseDuration;
import com.bytedance.android.livesdk.livesetting.performance.LiveBroadcastRequestControlStrictDuration;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS577S0100000_33;

/* JADX INFO: renamed from: X.1ALS, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1ALS implements C0UU6 {
    public static final C1ALS LIZ = new C1ALS();
    public static boolean LIZIZ;
    public static final int LIZJ;
    public static final int LIZLLL;
    public static final boolean LJ;
    public static final C1ALU LJFF;

    /* JADX WARN: Type inference failed for: r0v6, types: [X.1ALU] */
    static {
        int value = LiveBroadcastRequestControlStrictDuration.INSTANCE.getValue();
        LIZJ = value;
        int value2 = LiveBroadcastRequestControlSparseDuration.INSTANCE.getValue();
        LIZLLL = value2;
        LJ = (value == 0 && value2 == 0) ? false : true;
        LJFF = new InterfaceC1499650p7z() { // from class: X.1ALU
            @Override // X.InterfaceC1499650p7z
            public final void LIZIZ(String str) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("meetDowngradeRequest:");
                sbLIZ.append(str);
                C20441214yg.LIZIZ("live_broadcast_request_monitor", C2188811AlT.LIZIZ(sbLIZ));
            }

            @Override // X.InterfaceC1499650p7z
            public final void LIZ(long j, String str) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append(" request success, cost cputime:");
                sbLIZ.append(j);
                C20441214yg.LIZIZ("live_broadcast_request_monitor", C2188811AlT.LIZIZ(sbLIZ));
            }
        };
    }

    public static final void LIZ() {
        if (!LJ || LIZIZ) {
            return;
        }
        LIZIZ = true;
        C20441214yg.LIZIZ("live_broadcast_request_monitor", "cancel");
        C1499630p7x.LIZIZ = null;
        C1499630p7x.LIZJ = null;
    }

    public static void LIZIZ(String str, int i, Function0 function0) {
        if (LIZIZ) {
            return;
        }
        if (i == 0) {
            if (function0 != null) {
                function0.invoke();
                return;
            }
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startOpt ");
        sbLIZ.append(str);
        C20441214yg.LIZIZ("live_broadcast_request_monitor", C2188811AlT.LIZIZ(sbLIZ));
        Map<String, InterfaceC1499640p7y> map = C1499630p7x.LIZ;
        C1499630p7x.LIZ(str, LJFF);
        C1492110ovp.LIZ(null, true, Integer.valueOf(i), new AwS577S0100000_33(function0, (Function0<Unit>) 3880));
    }
}
