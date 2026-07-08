package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.shortvideo.model.BehaviorType;
import com.ss.android.ugc.aweme.shortvideo.model.PublishBehaviorModel;

/* JADX INFO: renamed from: X.0nnx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1448790nnx {
    public static boolean LIZ = true;
    public static boolean LIZIZ = true;
    public static boolean LIZJ = true;
    public static InterfaceC1448800nny LIZLLL;

    public static final void LIZ(String str, String str2, String str3) {
        LIZIZ(str, str2, str3, 8);
    }

    public static void LIZJ(String str) {
        InterfaceC1448800nny interfaceC1448800nny = LIZLLL;
        if (interfaceC1448800nny != null) {
            try {
                interfaceC1448800nny.LIZ(str);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("RuntimeBehaviorManager---> EventType : ");
                sbLIZ.append(str);
                C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                return;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return;
            }
        }
        throw new IllegalStateException("behavior reporter not init");
    }

    public static void LIZLLL(String str, String str2, String str3) {
        try {
            LIZLLL.event(str, str2);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("RuntimeBehaviorManager---> EventType : ");
            sbLIZ.append(str);
            sbLIZ.append(" , code : ");
            sbLIZ.append(str2);
            sbLIZ.append(" , msg : ");
            sbLIZ.append(str3);
            C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static final void LJII(int i, String str, String str2) {
        BehaviorType behaviorType = BehaviorType.FAILED;
        String strValueOf = String.valueOf(i);
        if (str2 == null) {
            str2 = "";
        }
        LJFF(str, behaviorType, "SN", strValueOf, str2);
    }

    public static void LIZIZ(String str, String str2, String str3, int i) {
        if ((i & 2) != 0) {
            str2 = "-1";
        }
        if ((i & 4) != 0) {
            str3 = "";
        }
        if ((i & 8) != 0 && "".length() != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str2);
            sbLIZ.append('-');
            sbLIZ.append("");
            LIZLLL(str, C2188811AlT.LIZIZ(sbLIZ), str3);
            return;
        }
        LIZLLL(str, str2, str3);
    }

    public static void LJFF(String str, BehaviorType behaviorType, String str2, String str3, String str4) {
        try {
            InterfaceC1448800nny interfaceC1448800nny = LIZLLL;
            if (interfaceC1448800nny != null) {
                interfaceC1448800nny.event("publish", C2292508yZ.LIZJ(new PublishBehaviorModel(System.currentTimeMillis(), str, behaviorType, str2, str3, str4)));
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("RuntimeBehaviorManager|id:");
            sbLIZ.append(str);
            sbLIZ.append(" type:");
            sbLIZ.append(behaviorType);
            sbLIZ.append(" stage:");
            sbLIZ.append(str2);
            sbLIZ.append(" code:");
            sbLIZ.append(str3);
            sbLIZ.append(" info:");
            sbLIZ.append(str4);
            C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
