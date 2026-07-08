package X;

import android.app.Activity;
import android.view.View;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacyUserSettingsV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS601S0100000_22;
import uxk.a;

/* JADX INFO: renamed from: X.0o9J, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1462030o9J {
    public static final void LIZLLL(long j, Activity activity) {
        Keva keva = C516990KPh.LIZ;
        int i = keva.getInt("SUB_ONLY_STORY_TOOLTIP_VIEW_COUNT", 0);
        if (i < ((Number) C264120AWs.LIZ.getValue()).intValue()) {
            C450720Hlu c450720Hlu = new C450720Hlu(activity);
            c450720Hlu.LIZ((int) (j >> 32), C1676820tjk.LIZJ(j));
            EnumC1235690iGF enumC1235690iGF = EnumC1235690iGF.START;
            C1391600mJi c1391600mJi = c450720Hlu.LLILLJJLI;
            c1391600mJi.LIZLLL = enumC1235690iGF;
            c1391600mJi.LJII = 3000L;
            c450720Hlu.LJIIJ(2131839715);
            c450720Hlu.LIZIZ().show();
            int i2 = i + 1;
            C1462040o9K c1462040o9K = new Object() { // from class: X.0o9K
            };
            boolean zLIZ = C0L44.LIZ();
            c1462040o9K.getClass();
            C0LAB c0lab = new C0LAB();
            c0lab.LIZ(i2, "tooltip_show_cnt");
            c0lab.LIZ(zLIZ ? 1 : 0, "is_subscription_creator");
            C20684815ws.LJIILLIIL("subscription_story_tooltip_show", c0lab.LIZ);
            keva.storeInt("SUB_ONLY_STORY_TOOLTIP_VIEW_COUNT", i2);
        }
    }

    public static final void LIZIZ(Activity activity, long j, Function0<Unit> function0) {
        int i;
        PrivacyUserSettingsV2 privacyUserSettingsV2LJIIIIZZ = ComplianceServiceProvider.LJIJJ().LJIIIIZZ();
        if (privacyUserSettingsV2LJIIIIZZ != null && C103K.LIZ(privacyUserSettingsV2LJIIIIZZ)) {
            i = 2131846204;
        } else {
            i = 2131846202;
        }
        LJ(i, activity, j, function0);
        a.LIZ.getClass();
        a.LJFF();
    }

    public static final void LIZJ(Activity activity, long j, Function0<Unit> function0) {
        int i;
        String str;
        PrivacyUserSettingsV2 privacyUserSettingsV2LJIIIIZZ = ComplianceServiceProvider.LJIJJ().LJIIIIZZ();
        if (privacyUserSettingsV2LJIIIIZZ != null && C103K.LIZ(privacyUserSettingsV2LJIIIIZZ)) {
            i = 2131846205;
        } else {
            i = 2131846206;
        }
        LJ(i, activity, j, function0);
        a.LIZ.getClass();
        a.LJI();
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", "tooltip");
        int iLIZLLL = a.LIZLLL();
        if (iLIZLLL != 1) {
            if (iLIZLLL != 2) {
                PrivacyUserSettingsV2 privacyUserSettingsV2LJIIIIZZ2 = ComplianceServiceProvider.LJIJJ().LJIIIIZZ();
                if (privacyUserSettingsV2LJIIIIZZ2 != null && C103K.LIZ(privacyUserSettingsV2LJIIIIZZ2)) {
                    str = "Follower";
                } else {
                    str = "Everyone";
                }
            } else {
                str = "Friend";
            }
        } else {
            str = "Only you";
        }
        c0lab.LJ("default_status", str);
        C20684815ws.LJIILLIIL("show_visibility_notice", c0lab.LIZ);
    }

    public static final C0P0T LIZ(int i, Activity activity, View view, Function0<Unit> function0) {
        C450720Hlu c450720Hlu = new C450720Hlu(activity);
        C1391600mJi c1391600mJi = c450720Hlu.LLILLJJLI;
        c1391600mJi.LIZIZ = view;
        c1391600mJi.LIZLLL = EnumC1235690iGF.START;
        c1391600mJi.LJII = 3000L;
        c1391600mJi.LJIJJ = true;
        c450720Hlu.LJIIJ(i);
        c450720Hlu.LIZJ(new AwS601S0100000_22(function0, (Function0<Unit>) 598));
        return c450720Hlu.LIZIZ();
    }

    public static final void LJ(int i, Activity activity, long j, Function0<Unit> function0) {
        C450720Hlu c450720Hlu = new C450720Hlu(activity);
        c450720Hlu.LIZ((int) (j >> 32), C1676820tjk.LIZJ(j));
        EnumC1235690iGF enumC1235690iGF = EnumC1235690iGF.START;
        C1391600mJi c1391600mJi = c450720Hlu.LLILLJJLI;
        c1391600mJi.LIZLLL = enumC1235690iGF;
        c1391600mJi.LJII = 3000L;
        c1391600mJi.LJIJJ = true;
        c450720Hlu.LJIIJ(i);
        c450720Hlu.LIZJ(new AwS601S0100000_22(function0, (Function0<Unit>) 599));
        c450720Hlu.LIZIZ().show();
    }
}
