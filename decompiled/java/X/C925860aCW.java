package X;

import com.bytedance.android.live.liveinteract.platform.common.monitor.LinkMicProcessReportSetting;
import java.util.List;

/* JADX INFO: renamed from: X.0aCW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C925860aCW {
    public static volatile long LIZ;
    public static volatile long LIZIZ;
    public static volatile C925870aCX LIZJ;

    public static C925870aCX LIZ(String str, EnumC925900aCa enumC925900aCa) {
        List<C925880aCY> list;
        if (!LinkMicProcessReportSetting.INSTANCE.enable()) {
            return null;
        }
        C925870aCX c925870aCX = LIZJ;
        if (c925870aCX != null && !c925870aCX.LJFF) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("beginAttempt ");
            sbLIZ.append(str);
            sbLIZ.append(" table=");
            sbLIZ.append(enumC925900aCa);
            sbLIZ.append(" abandons stale type=");
            sbLIZ.append(c925870aCX.LIZ);
            sbLIZ.append(" session=");
            sbLIZ.append(c925870aCX.LIZJ);
            C20441214yg.LIZIZ("LinkMicProcessManager", C2188811AlT.LIZIZ(sbLIZ));
            if (!c925870aCX.LJFF) {
                c925870aCX.LJFF = true;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("abandon route type=");
                sbLIZ2.append(c925870aCX.LIZ);
                sbLIZ2.append(" session=");
                sbLIZ2.append(c925870aCX.LIZJ);
                C20441214yg.LIZIZ("LinkMicProcessTracker", C2188811AlT.LIZIZ(sbLIZ2));
            }
        }
        List<C925880aCY> list2 = C925850aCV.LIZ;
        int i = C925890aCZ.LIZ[enumC925900aCa.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        list = C925850aCV.LIZLLL;
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    list = C925850aCV.LIZJ;
                }
            } else {
                list = C925850aCV.LIZIZ;
            }
        } else {
            list = C925850aCV.LIZ;
        }
        C925870aCX c925870aCX2 = new C925870aCX(str, list);
        long j = LIZ;
        if (j > 0) {
            c925870aCX2.LIZ(EnumC925840aCU.ENTER_ACTION, j);
        }
        long j2 = LIZIZ;
        if (j2 > 0) {
            c925870aCX2.LIZ(EnumC925840aCU.GET_SHARED_PANEL, j2);
        }
        LIZJ = c925870aCX2;
        return c925870aCX2;
    }

    public static void LIZIZ(int i, String str) {
        C925870aCX c925870aCX = LIZJ;
        if (c925870aCX != null) {
            if (c925870aCX.LJFF) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("terminate skip(already) type=");
                sbLIZ.append(c925870aCX.LIZ);
                sbLIZ.append(" session=");
                sbLIZ.append(c925870aCX.LIZJ);
                C20441214yg.LIZIZ("LinkMicProcessTracker", C2188811AlT.LIZIZ(sbLIZ));
            } else {
                c925870aCX.LJFF = true;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("terminate route type=");
                sbLIZ2.append(c925870aCX.LIZ);
                sbLIZ2.append(" errorCode=");
                sbLIZ2.append(i);
                sbLIZ2.append(" errorMessage=");
                sbLIZ2.append(str);
                sbLIZ2.append(" session=");
                sbLIZ2.append(c925870aCX.LIZJ);
                C20441214yg.LIZIZ("LinkMicProcessTracker", C2188811AlT.LIZIZ(sbLIZ2));
                for (C925880aCY c925880aCY : c925870aCX.LIZIZ) {
                    if (c925870aCX.LIZLLL.containsKey(c925880aCY.LIZIZ) && !c925870aCX.LIZLLL.containsKey(c925880aCY.LIZJ)) {
                        c925870aCX.LIZLLL(c925880aCY, i, str, true);
                    }
                }
            }
        }
        LIZJ = null;
    }
}
