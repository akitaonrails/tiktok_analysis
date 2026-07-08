package X;

import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsAgreementRecord;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.10BM, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10BM {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(int i) {
        return i != 0 ? i != 1 ? i != 3 ? "" : "onlyyou" : "friends" : "everyone";
    }

    public static String LIZIZ(int i) {
        return i != 1 ? i != 4 ? i != 5 ? "" : "onlyyou" : "friends" : "everyone";
    }

    public static String LIZJ(boolean z) {
        boolean z2;
        C191880104w.LIZ.getClass();
        PrivacySettingsAgreementRecord privacySettingsAgreementRecordLJI = C191880104w.LJI("account_content_reuse");
        boolean z3 = true;
        if (privacySettingsAgreementRecordLJI != null && privacySettingsAgreementRecordLJI.status == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        PrivacySettingsAgreementRecord privacySettingsAgreementRecordLJI2 = C191880104w.LJI("item_content_reuse");
        if (privacySettingsAgreementRecordLJI2 == null || privacySettingsAgreementRecordLJI2.status != 1) {
            z3 = false;
        }
        if (z2) {
            if (!z3) {
                return "type3";
            }
            return "type2";
        }
        if (z3) {
            if (z) {
                return "type1";
            }
            return "type2";
        }
        return "type4";
    }

    public static void LJ(String str, String str2, Map map) {
        C1163504gr c1163504gr = C1163504gr.LIZIZ;
        C191969108h c191969108h = new C191969108h();
        c191969108h.LIZLLL("enter_method", "system_show");
        c191969108h.LIZLLL("enter_from", str2);
        c191969108h.LIZLLL("user_type", LIZJ(Intrinsics.LJFF("video_type1", str)));
        c191969108h.LIZLLL("popup_type", str);
        if (map != null) {
            ((HashMap) c191969108h.LIZ).putAll(map);
        }
        c1163504gr.onEventV3("reuse_content_popup_show", c191969108h.LIZ);
    }

    public static void LIZLLL(String str, String str2, String str3, Map map) {
        C1163504gr c1163504gr = C1163504gr.LIZIZ;
        C191969108h c191969108h = new C191969108h();
        c191969108h.LIZLLL("enter_method", "system_show");
        c191969108h.LIZLLL("enter_from", str2);
        c191969108h.LIZLLL("click_status", str3);
        c191969108h.LIZLLL("user_type", LIZJ(Intrinsics.LJFF("video_type1", str)));
        c191969108h.LIZLLL("popup_type", str);
        if (map != null) {
            ((HashMap) c191969108h.LIZ).putAll(map);
        }
        c1163504gr.onEventV3("reuse_content_popup_click", c191969108h.LIZ);
    }
}
