package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;

/* JADX INFO: renamed from: X.0nZC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1439640nZC {
    public static final C1439640nZC LIZ = new C1439640nZC();
    public static boolean LIZIZ;

    public static boolean LIZJ(AwemeDraft awemeDraft) {
        boolean zLIZIZ;
        try {
            zLIZIZ = C036E.LIZ.LIZIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            zLIZIZ = false;
        }
        if ((!zLIZIZ && !C0C64.LJIILLIIL().LJIIIZ(31744, "studio_publish_retry_no_check_network", true, false)) || !LIZLLL(awemeDraft)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZLLL(com.ss.android.ugc.aweme.draft.model.AwemeDraft r5) {
        /*
            boolean r0 = r5.LJIILL()
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L11
            long r0 = r5.lastEditTime
            boolean r0 = LIZIZ(r0, r2)
            if (r0 != 0) goto L11
            return r3
        L11:
            com.ss.android.ugc.aweme.compliance.api.services.banappeal.IBanAppealService r0 = com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider.LJFF()
            boolean r0 = r0.LIZJ(r2)
            if (r0 != 0) goto L93
            X.01GW r0 = X.C2547209yY.LIZJ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L93
            boolean r0 = r5.LJIIL()
            if (r0 == 0) goto L3d
            X.0C64 r4 = X.C0C64.LJIILLIIL()
            java.lang.String r1 = "studio_image_album_publish_auto_retry"
            r0 = 31744(0x7c00, float:4.4483E-41)
            boolean r0 = r4.LJIIIZ(r0, r1, r2, r3)
            if (r0 == 0) goto L93
        L3d:
            java.lang.String r4 = r5.LIZJ()
            if (r4 == 0) goto L58
            boolean r1 = r5.LJIILL()
            X.1Ds4 r0 = X.C0CHQ.LIZ()
            X.0nYH r0 = r0.getPublishService()
            r0.LJIIL()
            boolean r0 = X.C1436830nUf.LJIILIIL(r4, r1)
            if (r0 != 0) goto L8a
        L58:
            java.lang.String r4 = r5.LIZJ()
            if (r4 == 0) goto L93
            boolean r1 = r5.LJIILL()
            boolean r0 = r5.LJIILL()
            if (r0 == 0) goto L93
            X.1Ds4 r0 = X.C0CHQ.LIZ()
            X.0nYH r0 = r0.getPublishService()
            r0.LJIIL()
            boolean r0 = X.C1436830nUf.LJIILJJIL(r4)
            if (r0 == 0) goto L93
            X.1Ds4 r0 = X.C0CHQ.LIZ()
            X.0nYH r0 = r0.getPublishService()
            r0.LJIIL()
            boolean r0 = X.C1436830nUf.LJIILIIL(r4, r1)
            if (r0 == 0) goto L93
        L8a:
            long r0 = r5.lastEditTime
            boolean r0 = LIZIZ(r0, r3)
            if (r0 == 0) goto L93
            return r2
        L93:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1439640nZC.LIZLLL(com.ss.android.ugc.aweme.draft.model.AwemeDraft):boolean");
    }

    public static boolean LIZIZ(long j, boolean z) {
        int iIntValue;
        if (z) {
            iIntValue = ((Number) C262740ARk.LIZ.getValue()).intValue();
        } else {
            iIntValue = ((Number) C0ARP.LIZ.getValue()).intValue();
        }
        if (System.currentTimeMillis() - j <= ((long) iIntValue) * 3600 * 1000) {
            return true;
        }
        return false;
    }

    public static void LJ(int i, String str) {
        Keva repo = Keva.getRepo("repo_publish_auto_retry_count");
        if (i <= 0) {
            repo.erase(str);
        } else {
            repo.storeInt(str, i);
        }
        C830690WiJ c830690WiJ = C830690WiJ.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("storeRetryCount, new=");
        sbLIZ.append(i);
        C201955140j.LIZLLL(c830690WiJ, "AutoRetry", C2188811AlT.LIZIZ(sbLIZ));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.InterfaceC1442990neb LIZ(X.C19EG r6, X.C1439050nYF r7, boolean r8) {
        /*
            X.1Ds4 r0 = X.C0CHQ.LIZ()
            X.0o1f r0 = r0.getAccountService()
            boolean r0 = r0.LIZ()
            if (r0 != 0) goto L1d
            X.1Ds4 r0 = X.C0CHQ.LIZ()
            X.0nYH r0 = r0.getPublishService()
            X.0na9 r0 = r0.LJJLIIIIJ()
            r0.LIZ()
        L1d:
            r5 = r7
            com.ss.android.ugc.aweme.draft.model.AwemeDraft r3 = r5.LIZ
            com.ss.android.ugc.aweme.compliance.api.services.banappeal.IBanAppealService r1 = com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider.LJFF()
            r0 = 1
            boolean r2 = r1.LIZJ(r0)
            boolean r0 = X.C1439640nZC.LIZIZ
            r1 = 0
            r4 = r6
            if (r0 == 0) goto L46
            X.0nZC r0 = X.C1439640nZC.LIZ
            r0.getClass()
            boolean r0 = LIZJ(r3)
            if (r0 == 0) goto L46
            X.0nZF r0 = new X.0nZF
            r0.<init>(r4, r3)
            r0.LIZ()
            r3 = 0
        L43:
            X.C1439640nZC.LIZIZ = r1
            return r3
        L46:
            boolean r0 = r3.LJIILL()
            r6 = r8
            if (r0 == 0) goto L53
            boolean r0 = r3.LJIIL()
            if (r0 != 0) goto L7e
        L53:
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r3.LIZ
            com.ss.android.ugc.aweme.creative.model.PaidContentVideoModel r0 = r0.paidContentModel
            java.lang.String r0 = r0.getCollectionId()
            boolean r0 = X.C123100dR.LIZ(r0)
            if (r0 != 0) goto L7e
            X.01GW r0 = X.C1430330nKB.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L7e
            if (r2 == 0) goto L7e
            X.0njF r3 = new X.0njF
            boolean r7 = X.C1439640nZC.LIZIZ
            com.ss.android.ugc.aweme.shortvideo.PublishFailMsg r8 = new com.ss.android.ugc.aweme.shortvideo.PublishFailMsg
            r8.<init>(r1)
            r3.<init>(r4, r5, r6, r7, r8)
            goto L43
        L7e:
            X.0nej r3 = new X.0nej
            r3.<init>(r4, r5, r6)
            goto L43
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1439640nZC.LIZ(X.19EG, X.0nYF, boolean):X.0neb");
    }
}
