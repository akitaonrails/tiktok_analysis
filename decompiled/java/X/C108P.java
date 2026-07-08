package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.tiktok.tpsc.model.ContentReuseAccountExtra;
import com.ss.android.ugc.tiktok.tpsc.model.ContentReuseItemExtra;
import com.ss.android.ugc.tiktok.tpsc.model.PopupExtra;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsAgreementRecord;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestriction;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionItem;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacyUserSettingsV2;
import com.ss.android.ugc.tiktok.tpsc.privacy.data.base.PrivacyUpdateCommonResponse;
import java.util.Map;
import kotlin.Pair;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.108P, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C108P {
    public static final C108P LIZ = new C108P();

    public static void LIZLLL(Fragment fragment) {
        PopupExtra popupExtra;
        C19EG activity = fragment.getActivity();
        if (activity == null) {
            return;
        }
        C10BK.LIZ.getClass();
        C191880104w c191880104w = C191880104w.LIZ;
        c191880104w.getClass();
        PrivacySettingsAgreementRecord privacySettingsAgreementRecordLJI = C191880104w.LJI("account_content_reuse");
        PrivacySettingsAgreementRecord privacySettingsAgreementRecordLJI2 = C191880104w.LJI("item_content_reuse");
        if (privacySettingsAgreementRecordLJI != null) {
            popupExtra = privacySettingsAgreementRecordLJI.popupExtra;
        } else {
            popupExtra = null;
        }
        if (privacySettingsAgreementRecordLJI == null || privacySettingsAgreementRecordLJI.status != 1 || !(popupExtra instanceof ContentReuseAccountExtra)) {
            if ((privacySettingsAgreementRecordLJI2 == null || privacySettingsAgreementRecordLJI2.status != 1 || !(popupExtra instanceof ContentReuseItemExtra)) && !C191880104w.LJIILIIL("unified_toggle_popup")) {
                c191880104w.getClass();
                Integer numLJIIIIZZ = C191880104w.LJIIIIZZ("account_level_off", FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
                if (numLJIIIIZZ != null && numLJIIIIZZ.intValue() == 1) {
                    C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(fragment), null, null, new C754090Ti3(activity, "privacy_settings", null), 3);
                }
            }
        }
    }

    public static void LIZ(Integer num, Integer num2, String str) throws JSONException {
        C191880104w c191880104w = C191880104w.LIZ;
        JSONObject jSONObject = new JSONObject();
        if (num != null) {
            jSONObject.put("comment", String.valueOf(num.intValue()));
        }
        if (num2 != null) {
            jSONObject.put("content_reuse_permission", String.valueOf(num2.intValue()));
        }
        Map mapLIZJ = C2097908Jt.LIZJ(new Pair("extra", C786410Ut5.J3(jSONObject)));
        c191880104w.getClass();
        C191871104n.LIZIZ().getClass();
        C191882104y.LIZ(1, str, mapLIZJ).LJJIIJ(new InterfaceC781210Ukh() { // from class: X.108Y
            @Override // X.InterfaceC781210Ukh
            public final void run() {
                C191880104w.LIZ.getClass();
                C191880104w.LJIIZILJ("account_level_off");
            }
        }).LJJLL(new C09JN() { // from class: X.104p
            @Override // X.C09JN
            public final void accept(Object obj) {
                Map<String, PrivacySettingsRestrictionItem> map;
                PrivacyUserSettingsV2 privacyUserSettings;
                C1C7U.LIZ("RemoveOffPopupManager@e08b.confirmRemoveOff$3");
                PrivacyUpdateCommonResponse privacyUpdateCommonResponse = (PrivacyUpdateCommonResponse) obj;
                if (privacyUpdateCommonResponse != null && (privacyUserSettings = privacyUpdateCommonResponse.getPrivacyUserSettings()) != null) {
                    C191871104n.LJ().getClass();
                    PrivacyUserSettingsV2 privacyUserSettingsV2LIZJ = C191859104b.LIZJ();
                    if (privacyUserSettingsV2LIZJ == null) {
                        privacyUserSettingsV2LIZJ = new PrivacyUserSettingsV2(0);
                    }
                    privacyUserSettingsV2LIZJ.LIZJ(privacyUserSettings);
                    C191880104w.LIZ.getClass();
                    C191871104n.LJ().getClass();
                    C191859104b.LJ(privacyUserSettingsV2LIZJ);
                }
                PrivacySettingsRestriction privacySettingsRestriction = privacyUpdateCommonResponse.getPrivacySettingsRestriction();
                if (privacySettingsRestriction != null && (map = privacySettingsRestriction.account) != null) {
                    C191871104n.LIZIZ().getClass();
                    C191874104q.LJFF(0, map);
                }
                C1C7U.LIZIZ("RemoveOffPopupManager@e08b.confirmRemoveOff$3");
            }
        }, new C09JN() { // from class: X.00Pq
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("RemoveOffPopupManager@e08b.confirmRemoveOff$4");
                C1C7U.LIZIZ("RemoveOffPopupManager@e08b.confirmRemoveOff$4");
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(X.C19EG r26, final com.ss.android.ugc.tiktok.pns.props.RemoveOffProps r27, final java.lang.String r28) {
        /*
            Method dump skipped, instruction units count: 682
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C108P.LIZIZ(X.19EG, com.ss.android.ugc.tiktok.pns.props.RemoveOffProps, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(X.C770770ULj r6, com.ss.android.ugc.tiktok.pns.props.RemoveOffProps r7, com.ss.android.ugc.tiktok.pns.privacy.setting.prompt.removeoff.RemoveOffViewModel r8, java.lang.String r9) {
        /*
            r0 = 1
            r6.LIZIZ = r0
            java.lang.String r1 = "confirm"
            androidx.lifecycle.MutableLiveData<java.lang.Integer> r0 = r8.LL
            java.lang.Object r2 = r0.getValue()
            java.lang.Integer r2 = (java.lang.Integer) r2
            androidx.lifecycle.MutableLiveData<java.lang.Integer> r0 = r8.LLILLJJLI
            java.lang.Object r3 = r0.getValue()
            java.lang.Integer r3 = (java.lang.Integer) r3
            boolean r4 = r7.LIZ
            boolean r5 = r7.LIZLLL
            boolean r6 = r7.LIZJ
            r0 = r9
            X.C108R.LIZJ(r0, r1, r2, r3, r4, r5, r6)
            java.lang.String r4 = r7.confirmActionRecords
            androidx.lifecycle.MutableLiveData<java.lang.Integer> r0 = r8.LL
            java.lang.Object r3 = r0.getValue()
            java.lang.Integer r3 = (java.lang.Integer) r3
            r2 = 0
            if (r3 == 0) goto L49
            r3.intValue()
            boolean r0 = r7.LIZLLL
            if (r0 == 0) goto L49
        L33:
            androidx.lifecycle.MutableLiveData<java.lang.Integer> r0 = r8.LLILLJJLI
            java.lang.Object r1 = r0.getValue()
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto L45
            r1.intValue()
            boolean r0 = r7.LIZJ
            if (r0 == 0) goto L45
            r2 = r1
        L45:
            LIZ(r3, r2, r4)
            return
        L49:
            r3 = r2
            goto L33
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C108P.LIZJ(X.0ULj, com.ss.android.ugc.tiktok.pns.props.RemoveOffProps, com.ss.android.ugc.tiktok.pns.privacy.setting.prompt.removeoff.RemoveOffViewModel, java.lang.String):void");
    }
}
