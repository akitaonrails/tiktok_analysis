package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsAgreementRecord;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestriction;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionItem;
import com.ss.android.ugc.tiktok.tpsc.privacy.account.restriction.RestrictionResponse;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import org.json.JSONException;

/* JADX INFO: renamed from: X.104q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C191874104q {
    public static final InterfaceC1519050pdH LIZ = C100C.LIZ.LJFF().LIZ(1, "privacy_setting");
    public static String LIZIZ;
    public static RestrictionResponse LIZJ;

    public static RestrictionResponse LIZ() {
        InterfaceC1888940zFs interfaceC1888940zFsLIZJ = C191871104n.LIZJ();
        String strLIZLLL = interfaceC1888940zFsLIZJ != null ? interfaceC1888940zFsLIZJ.LIZLLL() : null;
        String str = LIZIZ;
        if (str == null || !u.LJIJI(str, strLIZLLL, false)) {
            LIZJ = null;
        }
        if (LIZJ == null) {
            try {
                LIZJ = (RestrictionResponse) GsonProtectorUtils.fromJson(C1703730uR9.LIZ(), LIZ.getString(LIZIZ()), RestrictionResponse.class);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            LIZIZ = strLIZLLL;
        }
        return LIZJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0017 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZIZ() {
        /*
            X.0zFs r0 = X.C191871104n.LIZJ()
            if (r0 == 0) goto L18
            java.lang.String r2 = r0.LIZLLL()
            if (r2 == 0) goto L19
            int r0 = r2.length()
            if (r0 == 0) goto L19
            r0 = 0
        L13:
            java.lang.String r1 = "privacy_data"
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
        throw new UnsupportedOperationException("Method not decompiled: X.C191874104q.LIZIZ():java.lang.String");
    }

    public static void LJ(RestrictionResponse restrictionResponse) {
        if (Intrinsics.LJFF(restrictionResponse, LIZJ)) {
            return;
        }
        LIZJ = restrictionResponse;
        if (restrictionResponse == null) {
            LIZ.remove(LIZIZ());
            return;
        }
        InterfaceC1519050pdH interfaceC1519050pdH = LIZ;
        String strLIZIZ = LIZIZ();
        String strLIZJ = C1888930zFr.LIZJ(restrictionResponse);
        if (strLIZJ == null) {
            strLIZJ = "";
        }
        interfaceC1519050pdH.putString(strLIZIZ, strLIZJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZLLL(int r8, java.lang.String r9) {
        /*
            com.ss.android.ugc.tiktok.tpsc.privacy.account.restriction.RestrictionResponse r0 = LIZ()
            if (r0 == 0) goto L40
            java.util.Map r1 = r0.getPopupAgreement()
            if (r1 == 0) goto L40
            boolean r0 = r1.containsKey(r9)
            if (r0 == 0) goto L40
            com.ss.android.ugc.tiktok.tpsc.privacy.account.restriction.RestrictionResponse r2 = LIZ()
            if (r2 == 0) goto L2a
            java.util.Map r4 = LIZJ(r8, r9, r1)
            com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestriction r3 = r2.privacySettingsRestriction
            java.util.Map<java.lang.String, com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsAgreementRecordV2> r5 = r2.popupAgreementV2
            java.util.Map<java.lang.String, com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsAgreementRecord> r6 = r2.postRecord
            boolean r7 = r2.logReportEnable
            com.ss.android.ugc.tiktok.tpsc.privacy.account.restriction.RestrictionResponse r2 = r2.copy(r3, r4, r5, r6, r7)
            if (r2 != 0) goto L3d
        L2a:
            com.ss.android.ugc.tiktok.tpsc.privacy.account.restriction.RestrictionResponse r2 = new com.ss.android.ugc.tiktok.tpsc.privacy.account.restriction.RestrictionResponse
            r3 = 0
            java.util.Map r4 = LIZJ(r8, r9, r1)
            java.util.Map r5 = X.C2097608Jq.LJ()
            java.util.Map r6 = X.C2097608Jq.LJ()
            r7 = 0
            r2.<init>(r3, r4, r5, r6, r7)
        L3d:
            LJ(r2)
        L40:
            com.ss.android.ugc.tiktok.tpsc.privacy.account.restriction.RestrictionResponse r0 = LIZ()
            if (r0 == 0) goto L80
            java.util.Map r1 = r0.getPostRecord()
            if (r1 == 0) goto L80
            boolean r0 = r1.containsKey(r9)
            if (r0 == 0) goto L80
            com.ss.android.ugc.tiktok.tpsc.privacy.account.restriction.RestrictionResponse r2 = LIZ()
            if (r2 == 0) goto L6a
            java.util.Map r6 = LIZJ(r8, r9, r1)
            com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestriction r3 = r2.privacySettingsRestriction
            java.util.Map<java.lang.String, com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsAgreementRecord> r4 = r2.popupAgreement
            java.util.Map<java.lang.String, com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsAgreementRecordV2> r5 = r2.popupAgreementV2
            boolean r7 = r2.logReportEnable
            com.ss.android.ugc.tiktok.tpsc.privacy.account.restriction.RestrictionResponse r2 = r2.copy(r3, r4, r5, r6, r7)
            if (r2 != 0) goto L7d
        L6a:
            com.ss.android.ugc.tiktok.tpsc.privacy.account.restriction.RestrictionResponse r2 = new com.ss.android.ugc.tiktok.tpsc.privacy.account.restriction.RestrictionResponse
            r3 = 0
            java.util.Map r6 = LIZJ(r8, r9, r1)
            java.util.Map r4 = X.C2097608Jq.LJ()
            java.util.Map r5 = X.C2097608Jq.LJ()
            r7 = 0
            r2.<init>(r3, r4, r5, r6, r7)
        L7d:
            LJ(r2)
        L80:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C191874104q.LIZLLL(int, java.lang.String):void");
    }

    public static void LJFF(int i, Map map) {
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        RestrictionResponse restrictionResponse;
        PrivacySettingsRestriction privacySettingsRestriction;
        Map<String, PrivacySettingsRestrictionItem> map2;
        PrivacySettingsRestriction privacySettingsRestriction2;
        Map<String, PrivacySettingsRestrictionItem> map3;
        RestrictionResponse restrictionResponseLIZ = LIZ();
        if (restrictionResponseLIZ != null && (privacySettingsRestriction2 = restrictionResponseLIZ.getPrivacySettingsRestriction()) != null && (map3 = privacySettingsRestriction2.account) != null) {
            linkedHashMap = new LinkedHashMap(map3);
        } else {
            linkedHashMap = new LinkedHashMap();
        }
        RestrictionResponse restrictionResponseLIZ2 = LIZ();
        if (restrictionResponseLIZ2 != null && (privacySettingsRestriction = restrictionResponseLIZ2.getPrivacySettingsRestriction()) != null && (map2 = privacySettingsRestriction.videoPrivacy) != null) {
            linkedHashMap2 = new LinkedHashMap(map2);
        } else {
            linkedHashMap2 = new LinkedHashMap();
        }
        if (i != 0) {
            if (i == 1 || i == 2) {
                linkedHashMap2.putAll(map);
            }
        } else {
            linkedHashMap.putAll(map);
        }
        PrivacySettingsRestriction privacySettingsRestriction3 = new PrivacySettingsRestriction(linkedHashMap, linkedHashMap2);
        RestrictionResponse restrictionResponseLIZ3 = LIZ();
        if (restrictionResponseLIZ3 == null || (restrictionResponse = restrictionResponseLIZ3.copy(privacySettingsRestriction3, restrictionResponseLIZ3.popupAgreement, restrictionResponseLIZ3.popupAgreementV2, restrictionResponseLIZ3.postRecord, restrictionResponseLIZ3.logReportEnable)) == null) {
            restrictionResponse = new RestrictionResponse(privacySettingsRestriction3, C2097608Jq.LJ(), C2097608Jq.LJ(), C2097608Jq.LJ(), false);
        }
        LJ(restrictionResponse);
    }

    public static final Map LIZJ(int i, String str, Map map) {
        PrivacySettingsAgreementRecord privacySettingsAgreementRecord;
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        PrivacySettingsAgreementRecord privacySettingsAgreementRecord2 = (PrivacySettingsAgreementRecord) linkedHashMap.get(str);
        if (privacySettingsAgreementRecord2 != null) {
            privacySettingsAgreementRecord = new PrivacySettingsAgreementRecord(i, privacySettingsAgreementRecord2.popupExtra);
        } else {
            privacySettingsAgreementRecord = new PrivacySettingsAgreementRecord(i, null);
        }
        linkedHashMap.put(str, privacySettingsAgreementRecord);
        return linkedHashMap;
    }
}
