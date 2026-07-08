package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.base.LsFrequency;
import kotlin.jvm.internal.AFwS206S0000000_18;

/* JADX INFO: renamed from: X.0h8G, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public abstract class AbstractC1192300h8G {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(771));

    public abstract LsFrequency LIZIZ();

    public abstract String LJI();

    public final Keva LIZJ() {
        return (Keva) this.LIZ.getValue();
    }

    public final String LIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("count_");
        sbLIZ.append(LJI());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int LIZLLL(String str) {
        return LIZJ().getInt(LJFF(LIZ(), str), 0);
    }

    public final boolean LJ(String str) {
        Integer num;
        LsFrequency lsFrequencyLIZIZ = LIZIZ();
        if (lsFrequencyLIZIZ == null || (num = lsFrequencyLIZIZ.frequencyDay) == null) {
            return false;
        }
        int iIntValue = num.intValue();
        Integer num2 = lsFrequencyLIZIZ.frequencyTimes;
        if (num2 == null) {
            return false;
        }
        int iIntValue2 = num2.intValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ts_");
        sbLIZ.append(LJI());
        if (System.currentTimeMillis() - LIZJ().getLong(LJFF(C2188811AlT.LIZIZ(sbLIZ), str), 0L) > ((long) (iIntValue * 24 * 60 * 60)) * 1000 || LIZLLL(str) < iIntValue2) {
            return false;
        }
        return true;
    }

    public final void LJII(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ts_");
        sbLIZ.append(LJI());
        LIZJ().storeLong(LJFF(C2188811AlT.LIZIZ(sbLIZ), str), System.currentTimeMillis());
        String strLJFF = LJFF(LIZ(), str);
        int i = LIZJ().getInt(strLJFF, 0);
        if (i > 0) {
            LIZJ().storeInt(strLJFF, i - 1);
        }
    }

    public final void LJIIIIZZ(String str) {
        Integer num;
        LsFrequency lsFrequencyLIZIZ = LIZIZ();
        if (lsFrequencyLIZIZ != null && (num = lsFrequencyLIZIZ.frequencyDay) != null) {
            int iIntValue = num.intValue();
            Integer num2 = lsFrequencyLIZIZ.frequencyTimes;
            if (num2 != null) {
                int iIntValue2 = num2.intValue();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ts_");
                sbLIZ.append(LJI());
                if (System.currentTimeMillis() - LIZJ().getLong(LJFF(C2188811AlT.LIZIZ(sbLIZ), str), 0L) > ((long) (iIntValue * 24 * 60 * 60)) * 1000) {
                    LIZJ().storeInt(LJFF(LIZ(), str), 1);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("ts_");
                    sbLIZ2.append(LJI());
                    LIZJ().storeLong(LJFF(C2188811AlT.LIZIZ(sbLIZ2), str), System.currentTimeMillis());
                    return;
                }
                if (LIZLLL(str) >= iIntValue2) {
                    return;
                }
                LIZJ().storeInt(LJFF(LIZ(), str), LIZLLL(str) + 1);
            }
        }
    }

    public static String LJFF(String str, String str2) {
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('_');
        sbLIZ.append(curUserId);
        sbLIZ.append('_');
        sbLIZ.append(str2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
