package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacyUserSettingsV2;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;

/* JADX INFO: renamed from: X.104b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C191859104b {
    public static PrivacyUserSettingsV2 LIZ;
    public static String LIZIZ;
    public static final InterfaceC1519050pdH LIZJ = C100C.LIZ.LJFF().LIZ(1, "privacy_setting");

    public static PrivacyUserSettingsV2 LIZJ() {
        if (LIZ == null) {
            try {
                C191860104c c191860104c = (C191860104c) GsonProtectorUtils.fromJson(C1703730uR9.LIZ(), LIZJ.getString(LIZLLL()), C191860104c.class);
                if (c191860104c != null) {
                    LIZ = c191860104c.LIZ;
                    LIZIZ = c191860104c.LIZIZ;
                }
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        PrivacyUserSettingsV2 privacyUserSettingsV2 = LIZ;
        if (privacyUserSettingsV2 != null) {
            return new PrivacyUserSettingsV2(privacyUserSettingsV2.LIZ);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0017 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZLLL() {
        /*
            X.0zFs r0 = X.C191871104n.LIZJ()
            if (r0 == 0) goto L18
            java.lang.String r2 = r0.LIZLLL()
            if (r2 == 0) goto L19
            int r0 = r2.length()
            if (r0 == 0) goto L19
            r0 = 0
        L13:
            java.lang.String r1 = "privacy_user_setting_v3"
            if (r0 == 0) goto L1b
            return r1
        L18:
            r2 = 0
        L19:
            r0 = 1
            goto L13
        L1b:
            java.lang.StringBuilder r0 = X.C2188811AlT.LIZ()
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C191859104b.LIZLLL():java.lang.String");
    }

    public static void LIZIZ(C191860104c c191860104c) {
        String strLIZJ = C1888930zFr.LIZJ(c191860104c);
        if (strLIZJ == null) {
            return;
        }
        LIZJ.putString(LIZLLL(), strLIZJ);
    }

    public static void LJ(PrivacyUserSettingsV2 privacyUserSettingsV2) {
        PrivacyUserSettingsV2 privacyUserSettingsV22;
        if (privacyUserSettingsV2 != null) {
            privacyUserSettingsV22 = new PrivacyUserSettingsV2(privacyUserSettingsV2.LIZ);
        } else {
            privacyUserSettingsV22 = null;
        }
        LIZ = privacyUserSettingsV22;
        if (privacyUserSettingsV2 != null) {
            LIZIZ(new C191860104c(privacyUserSettingsV22, LIZIZ));
            C191862104e c191862104e = C191862104e.LIZ;
            PrivacyUserSettingsV2 privacyUserSettingsV23 = new PrivacyUserSettingsV2(privacyUserSettingsV2.LIZ);
            c191862104e.getClass();
            Iterator it2 = ((CopyOnWriteArrayList) C191862104e.LIZIZ).iterator();
            while (it2.hasNext()) {
                ((InterfaceC989510brB) it2.next()).LLZZLLIL(privacyUserSettingsV23);
            }
        }
    }

    public static void LIZ(PrivacyUserSettingsV2 privacyUserSettingsV2, String str) {
        PrivacyUserSettingsV2 privacyUserSettingsV2LIZJ = LIZJ();
        if (privacyUserSettingsV2LIZJ == null) {
            privacyUserSettingsV2LIZJ = privacyUserSettingsV2;
        } else {
            for (String str2 : privacyUserSettingsV2.LIZ.keySet()) {
                Integer numLIZ = privacyUserSettingsV2.LIZ(str2);
                if (numLIZ != null) {
                    privacyUserSettingsV2LIZJ.LIZIZ(numLIZ.intValue(), str2);
                }
            }
        }
        LIZIZ(new C191860104c(privacyUserSettingsV2LIZJ, str));
        LJ(privacyUserSettingsV2);
        LIZIZ = str;
    }
}
