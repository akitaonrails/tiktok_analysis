package X;

import com.ss.android.ugc.aweme.ab.EcSearchSevenScreenMoveEntranceConfig;
import kotlin.jvm.internal.AFwS225S0000000_34;

/* JADX INFO: renamed from: X.1Ao6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2190441Ao6 {
    public static final EcSearchSevenScreenMoveEntranceConfig LIZ = new EcSearchSevenScreenMoveEntranceConfig(0, null, null, 7, null);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(33));

    public static boolean LIZ(int i) {
        C01GW c01gw = LIZIZ;
        int i2 = ((EcSearchSevenScreenMoveEntranceConfig) c01gw.getValue()).strategy;
        if (i2 != 1) {
            if (i2 == 2 && !((EcSearchSevenScreenMoveEntranceConfig) c01gw.getValue()).disableEntranceList.contains(Integer.valueOf(i))) {
                return true;
            }
            return false;
        }
        return ((EcSearchSevenScreenMoveEntranceConfig) c01gw.getValue()).enableEntranceList.contains(Integer.valueOf(i));
    }
}
