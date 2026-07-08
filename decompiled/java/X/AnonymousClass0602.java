package X;

import android.app.Activity;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.0602, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class AnonymousClass0602 {
    public static AnonymousClass0956 LIZ;

    public static final void LIZ(AnonymousClass0604 anonymousClass0604, String str, String str2, String str3) {
        Activity activityLIZ;
        C19EG c19eg;
        Activity activityLIZIZ;
        AnonymousClass0956 anonymousClass0956 = LIZ;
        if (anonymousClass0956 != null && anonymousClass0956.isActive()) {
            return;
        }
        AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
        if (abstractC1387200mCcLIZIZ != null && (activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ()) != null) {
            activityLIZ = C1388190mED.LIZ(activityLIZIZ);
        } else {
            activityLIZ = null;
        }
        if ((activityLIZ instanceof C19EG) && (c19eg = (C19EG) activityLIZ) != null) {
            DialogC1389620mGW dialogC1389620mGW = new DialogC1389620mGW(c19eg);
            dialogC1389620mGW.LJJLL(false);
            dialogC1389620mGW.LJJLIIJ(false);
            LIZ = C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ.plus(new C1770106wV(CoroutineExceptionHandler.LJJLIL, dialogC1389620mGW, 1))), null, null, new C1536905zz(anonymousClass0604, dialogC1389620mGW, str, str2, str3, c19eg, null), 3);
        }
    }
}
