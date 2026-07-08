package X;

import android.content.Intent;
import android.os.SystemClock;
import androidx.fragment.app.Fragment;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0iK9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1238110iK9 {
    public static final C1238110iK9 LIZ = new C1238110iK9();

    public static void LIZIZ(C19EG c19eg, Intent intent, Fragment fragment) throws Throwable {
        String stringExtra;
        String stringExtra2;
        String stringExtra3;
        String str = "";
        if (intent == null) {
            stringExtra = "";
        } else {
            try {
                stringExtra = intent.getStringExtra("platform");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (stringExtra == null) {
                stringExtra = "";
            }
        }
        if (intent == null) {
            stringExtra2 = "";
        } else {
            try {
                stringExtra2 = intent.getStringExtra("enter_method");
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            if (stringExtra2 == null) {
                stringExtra2 = "";
            }
        }
        if (intent == null) {
            stringExtra3 = "";
        } else {
            try {
                stringExtra3 = intent.getStringExtra("enter_from");
            } catch (Exception e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            if (stringExtra3 == null) {
                stringExtra3 = "";
            }
        }
        if (intent != null) {
            try {
                String stringExtra4 = intent.getStringExtra("login_panel_type");
                if (stringExtra4 != null) {
                    str = stringExtra4;
                }
            } catch (Exception e4) {
                TryCatchGuardChecker.doCheck(e4);
            }
        }
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("platform", stringExtra);
        c0xgr.LIZLLL("enter_method", stringExtra2);
        c0xgr.LIZLLL("enter_from", stringExtra3);
        c0xgr.LIZLLL("login_panel_type", str);
        C20684815ws.LJIILLIIL("3p_auth_page_show", c0xgr.LIZ);
        if (intent != null) {
            C20431814xA.LIZ.LIZ = System.currentTimeMillis();
            if (fragment != null) {
                C19EG c19egRequireActivity = fragment.requireActivity();
                if (!((ArrayList) C304770Bx5.LIZIZ.getValue()).contains(stringExtra)) {
                    C0CQH.LIZ.getClass();
                    C0CQH.LIZIZ.put("authorize", Long.valueOf(SystemClock.elapsedRealtime()));
                    C1701330uNH.LIZ(intent, fragment);
                    C2204961BRm.LLJL(fragment, intent, 1001, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOurYJDb0ibECfF1owskw7ZzjpAkGL23W6ZUpSsOMbBq/TuSENdRhpJwjoadQ5/D", null));
                    return;
                }
                C0TT5.LIZIZ(c19egRequireActivity, intent, stringExtra);
                return;
            }
            C0TT5.LIZIZ(c19eg, intent, stringExtra);
            return;
        }
        PopupManager.LIZJ(C1912380zrg.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0159  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.Intent LIZ(android.app.Activity r16, boolean r17, java.lang.String r18, X.InterfaceC852200Xbu r19) {
        /*
            Method dump skipped, instruction units count: 504
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1238110iK9.LIZ(android.app.Activity, boolean, java.lang.String, X.0Xbu):android.content.Intent");
    }
}
