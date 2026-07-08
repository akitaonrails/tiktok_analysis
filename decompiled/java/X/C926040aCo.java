package X;

import kotlin.jvm.internal.AwS58S0010000_15;
import webcast.data.MGEnterActionInfo;

/* JADX INFO: renamed from: X.0aCo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C926040aCo {
    public static final /* synthetic */ int LIZ = 0;

    public static AbstractC926030aCn LIZ(MGEnterActionInfo mGEnterActionInfo, C926050aCp c926050aCp, boolean z) {
        if (mGEnterActionInfo.enterActionReason == 1 && mGEnterActionInfo.enterActionOriginLinkmicId.length() > 0) {
            return new C926020aCm(mGEnterActionInfo.enterActionSourceUser, mGEnterActionInfo.enterActionOriginLinkmicId);
        }
        C926000aCk c926000aCk = new C926000aCk(mGEnterActionInfo.enterActionSourceUser, z, mGEnterActionInfo.enterActionSourceTimeMs, c926050aCp.LIZLLL);
        c926000aCk.LIZ(new AwS58S0010000_15(z, 1));
        return c926000aCk;
    }
}
