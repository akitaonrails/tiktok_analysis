package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.services.external.IAbnormalExitLogService;

/* JADX INFO: renamed from: X.0nak, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1440600nak implements IAbnormalExitLogService {
    public static final C1440600nak LIZ = new C1440600nak();

    @Override // com.ss.android.ugc.aweme.services.external.IAbnormalExitLogService
    public final void logAppAbnormalExit() {
        C863370Xtv.LIZ("story").LIZLLL();
        C1439210nYV.LIZ().LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.services.external.IAbnormalExitLogService
    public final void logRestoreDialogShow(boolean z) {
        String str;
        String strLIZIZ = C1439210nYV.LIZ().LIZIZ();
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("last_status", strLIZIZ);
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c0lab.LJ("is_draft", str);
        Activity activityLJFF = C2214201BlK.LJFF();
        if (activityLJFF != null) {
            C804770Vhb c804770Vhb = C804770Vhb.LIZ;
            c0lab.LJ("exit_reason", C804770Vhb.LIZJ(activityLJFF, false));
            c0lab.LIZ(C804770Vhb.LJFF ? 1 : 0, "is_out_app_share");
            c0lab.LIZIZ(System.currentTimeMillis() - C804770Vhb.LJFF(activityLJFF), "interval_from_exit_app");
        }
        C20684815ws.LJIILLIIL("continue_popup_show", c0lab.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.services.external.IAbnormalExitLogService
    public final void logRestoreDialogClick(boolean z, boolean z2) {
        String str;
        String str2;
        String strLIZIZ = C1439210nYV.LIZ().LIZIZ();
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("last_status", strLIZIZ);
        if (z) {
            str = "confirm";
        } else {
            str = "cancel";
        }
        c0lab.LJ("click_position", str);
        if (z2) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c0lab.LJ("is_draft", str2);
        Activity activityLJFF = C2214201BlK.LJFF();
        if (activityLJFF != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            C804770Vhb c804770Vhb = C804770Vhb.LIZ;
            c0lab.LIZIZ(jCurrentTimeMillis - C804770Vhb.LJFF(activityLJFF), "interval_from_exit_app");
        }
        C20684815ws.LJIILLIIL("continue_popup_click", c0lab.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.services.external.IAbnormalExitLogService
    public final void logRestoreDialogDismiss(String str, boolean z) {
        String str2;
        C0LAB c0lab = new C0LAB();
        Activity activityLJFF = C2214201BlK.LJFF();
        if (activityLJFF != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            C804770Vhb c804770Vhb = C804770Vhb.LIZ;
            c0lab.LIZIZ(jCurrentTimeMillis - C804770Vhb.LJFF(activityLJFF), "interval_from_exit_app");
            c0lab.LJ("dismiss_type", str);
            c0lab.LJ("exit_reason", C804770Vhb.LIZJ(activityLJFF, false));
            if (z) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            c0lab.LJ("is_draft", str2);
        }
        C20684815ws.LJIILLIIL("continue_popup_dismiss", c0lab.LIZ);
    }
}
