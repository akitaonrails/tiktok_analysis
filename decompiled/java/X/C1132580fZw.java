package X;

import com.bytedance.android.livesdk.gift.model.CpcPromptResponse;
import com.bytedance.android.livesdk.gift.model.CpcTime;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0fZw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1132580fZw {
    public static final CpcPromptResponse LIZ() {
        try {
            CpcPromptResponse cpcPromptResponseLIZIZ = InterfaceC1106030et7.e6.LIZIZ();
            return cpcPromptResponseLIZIZ == null ? new CpcPromptResponse(null, null, 0L, 0L, 0L, false) : cpcPromptResponseLIZIZ;
        } catch (IllegalArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
            return new CpcPromptResponse(null, null, 0L, 0L, 0L, false);
        }
    }

    public static final CpcTime LIZIZ() {
        try {
            String strLIZIZ = InterfaceC1106030et7.d6.LIZIZ();
            if (strLIZIZ != null && C500260Jjc.LJJIIZ(strLIZIZ)) {
                new CpcTime(0L, 0L, 0L, 0L, 0L);
                CpcTime cpcTime = (CpcTime) C1516000pYM.LIZ(CpcTime.class, strLIZIZ);
                if (cpcTime != null) {
                    return cpcTime;
                }
            }
            return new CpcTime(0L, 0L, 0L, 0L, 0L);
        } catch (IllegalArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
            return new CpcTime(0L, 0L, 0L, 0L, 0L);
        }
    }

    public static final boolean LIZJ() {
        return C500260Jjc.LJJIIZ(LIZ().prompt);
    }

    public static final boolean LIZLLL() {
        CpcTime cpcTimeLIZIZ = LIZIZ();
        Long lValueOf = Long.valueOf(LIZ().timeIntervalForNextRequest * 1000);
        long jLongValue = lValueOf.longValue() > 0 ? lValueOf.longValue() : 86400000L;
        boolean zLIZJ = LIZJ();
        if (cpcTimeLIZIZ.apiCallLastTime != 0 && System.currentTimeMillis() - cpcTimeLIZIZ.apiCallLastTime <= jLongValue && zLIZJ) {
            return false;
        }
        InterfaceC1106030et7.d6.LJFF(C1516000pYM.LIZLLL(CpcTime.LIZ(cpcTimeLIZIZ, 0L, System.currentTimeMillis(), 15)));
        return true;
    }

    public static final boolean LJ() {
        CpcTime cpcTimeLIZIZ = LIZIZ();
        Long lValueOf = Long.valueOf(LIZ().timeIntervalForNextPrompt * 1000);
        long jLongValue = lValueOf.longValue() > 0 ? lValueOf.longValue() : 86400000L;
        boolean zLIZJ = LIZJ();
        if (cpcTimeLIZIZ.lastShowingTime != 0 && System.currentTimeMillis() - cpcTimeLIZIZ.lastShowingTime <= jLongValue && zLIZJ) {
            return false;
        }
        InterfaceC1106030et7.d6.LJFF(C1516000pYM.LIZLLL(CpcTime.LIZ(cpcTimeLIZIZ, System.currentTimeMillis(), 0L, 30)));
        return true;
    }
}
