package X;

import android.app.Activity;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.AwS163S1200000_4;

/* JADX INFO: renamed from: X.0DJ3, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DJ3 {
    public static final C0DJ3 LIZ = new C0DJ3();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(3841));

    public static boolean LIZIZ() {
        return ((Number) LIZIZ.getValue()).intValue() == 1;
    }

    public static void LIZ(InterfaceC494301wD interfaceC494301wD, String str, InterfaceC494301wD interfaceC494301wD2) {
        AbstractC1387200mCc abstractC1387200mCcLIZIZ;
        Activity activityLIZIZ;
        Activity activityLIZ;
        if (interfaceC494301wD != interfaceC494301wD2 && (abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ()) != null && (activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ()) != null && (activityLIZ = C1388190mED.LIZ(activityLIZIZ)) != null) {
            if (C0DHG.LIZ() && C1388190mED.LIZ(activityLIZ) != null) {
                C632670Orh.LIZIZ(activityLIZ, new C19719212De(1209058957, new AwS163S1200000_4(str, interfaceC494301wD, interfaceC494301wD2, 0), true));
                return;
            }
            C1397580mTM c1397580mTM = new C1397580mTM(activityLIZ);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("(debug) error: different ");
            sbLIZ.append(str);
            sbLIZ.append(" instance! ");
            sbLIZ.append(interfaceC494301wD);
            sbLIZ.append(" AND ");
            sbLIZ.append(interfaceC494301wD2);
            c1397580mTM.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
            new C1397510mTF(c1397580mTM).LIZLLL();
        }
    }
}
