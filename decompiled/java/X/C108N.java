package X;

import android.content.Context;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.tiktok.pns.privacy.setting.agechange.AgeDownReminderInfo;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsAgreementRecordV2;
import java.util.Arrays;
import kotlin.Pair;

/* JADX INFO: renamed from: X.108N, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C108N {
    public static final C108N LIZ = new C108N();

    public static AgeDownReminderInfo LIZ() {
        C106V.LIZ.getClass();
        C106V.LIZIZ().getClass();
        PrivacySettingsAgreementRecordV2 privacySettingsAgreementRecordV2LJII = C191880104w.LJII("age_down_reminder");
        try {
            return (AgeDownReminderInfo) C1703730uR9.LIZ().LJII(privacySettingsAgreementRecordV2LJII != null ? privacySettingsAgreementRecordV2LJII.extra : null, AgeDownReminderInfo.class);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    public static void LIZLLL(AgeDownReminderInfo ageDownReminderInfo) {
        C106V.LIZ.getClass();
        C191880104w.LJIILLIIL(C106V.LIZIZ(), "age_down_reminder", 1).LJJIIJ(new InterfaceC781210Ukh() { // from class: X.108V
            @Override // X.InterfaceC781210Ukh
            public final void run() {
                C106V.LIZ.getClass();
                C106V.LIZIZ().getClass();
                C191880104w.LJIIZILJ("age_down_reminder");
            }
        }).LJJLL(new C09JN() { // from class: X.108T
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("AgeDownReminderHelper@5370.onClickClose$2");
                C1C7U.LIZIZ("AgeDownReminderHelper@5370.onClickClose$2");
            }
        }, new C09JN() { // from class: X.108U
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("AgeDownReminderHelper@5370.onClickClose$3");
                C1C7U.LIZIZ("AgeDownReminderHelper@5370.onClickClose$3");
            }
        });
        C1163504gr c1163504gr = C1163504gr.LIZIZ;
        c1163504gr.onEventV3("privacy_settings_interaction_UAS_UAM", C2097608Jq.LJIIIIZZ(new Pair("variant", String.valueOf(ageDownReminderInfo.upperAge)), new Pair("interaction", "x")));
        c1163504gr.onEventV3("pns_age_down_interaction", C2097608Jq.LJIIIIZZ(new Pair("enter_from", "setting_banner"), new Pair("variant", String.valueOf(ageDownReminderInfo.upperAge))));
    }

    public static void LJ(AgeDownReminderInfo ageDownReminderInfo) {
        C1163504gr c1163504gr = C1163504gr.LIZIZ;
        c1163504gr.onEventV3("privacy_settings_show_UAS_UAM", C2097908Jt.LIZJ(new Pair("variant", String.valueOf(ageDownReminderInfo.upperAge))));
        c1163504gr.onEventV3("pns_age_down_notification", C2097608Jq.LJIIIIZZ(new Pair("enter_from", "setting_banner"), new Pair("variant", String.valueOf(ageDownReminderInfo.upperAge))));
    }

    public static String LIZIZ(Context context, AgeDownReminderInfo ageDownReminderInfo) {
        return C786410Ut5.j4(context.getString(2131857738), Arrays.copyOf(new Object[]{String.valueOf(ageDownReminderInfo.upperAge)}, 1));
    }

    public static void LIZJ(Context context, AgeDownReminderInfo ageDownReminderInfo) {
        String str = ageDownReminderInfo.url;
        if (str != null && str.length() != 0) {
            SmartRouter.buildRoute(context, ageDownReminderInfo.url).open();
            C1163504gr c1163504gr = C1163504gr.LIZIZ;
            c1163504gr.onEventV3("privacy_settings_interaction_UAS_UAM", C2097608Jq.LJIIIIZZ(new Pair("variant", String.valueOf(ageDownReminderInfo.upperAge)), new Pair("interaction", "review&appeal")));
            c1163504gr.onEventV3("pns_age_down_interaction", C2097608Jq.LJIIIIZZ(new Pair("enter_from", "setting_banner"), new Pair("variant", String.valueOf(ageDownReminderInfo.upperAge)), new Pair("action", "click_review")));
        }
    }
}
