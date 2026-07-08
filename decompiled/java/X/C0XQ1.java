package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import com.ss.android.ugc.aweme.user.UserStore;
import java.text.SimpleDateFormat;

/* JADX INFO: renamed from: X.0XQ1, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XQ1 {
    public static void LIZ(Activity activity) {
        final boolean z;
        if (C848230XPh.LL.LJI() && !DialogC848780XRk.LLJ) {
            DialogC848780XRk dialogC848780XRk = DialogC848780XRk.LLJI;
            if (dialogC848780XRk != null && dialogC848780XRk.isShowing()) {
                return;
            }
            UserStore.LIZ.getClass();
            SharedPreferences sharedPreferences = UserStore.LIZLLL;
            String str = "";
            String string = sharedPreferences.getString("mandatory_2sv_nudge_period", "");
            if (string != null) {
                str = string;
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (System.currentTimeMillis() > new SimpleDateFormat("yyyy-MM-dd").parse(str).getTime()) {
                z = true;
            } else if (System.currentTimeMillis() - sharedPreferences.getLong("last_show_hpas_dialog_time", 0L) <= 86400000 || !sharedPreferences.getBoolean("mandatory_2sv", false)) {
                return;
            } else {
                z = false;
            }
            final C19EG c19eg = (C19EG) activity;
            PopupManager.LJIJI(new AbstractC20660015ss<Dialog>(c19eg, z) { // from class: X.0XRl
                public final C19EG LL;
                public final boolean LLILLJJLI;
                public final int LLILLL = 395;

                @Override // X.InterfaceC20660415sw
                public final C688120Qyw i2() {
                    C19EG c19eg2 = this.LL;
                    return new C688120Qyw(c19eg2, c19eg2, null);
                }

                @Override // X.InterfaceC20660515sx
                public final int getPriority() {
                    return this.LLILLL;
                }

                @Override // com.bytedance.poplayer.IPopupTask
                public final Object showPopup(C688120Qyw c688120Qyw) throws Throwable {
                    DialogC848780XRk dialogC848780XRk2 = new DialogC848780XRk(this.LL, this.LLILLJJLI);
                    C1391850mK7.LIZIZ(dialogC848780XRk2, "92");
                    dialogC848780XRk2.show();
                    C785410UrT.LIZIZ(dialogC848780XRk2);
                    PopupMonitorServiceImpl.LIZ.getClass();
                    PopupMonitorServiceImpl.LJJJ(dialogC848780XRk2);
                    C816490W1f.LIZ(dialogC848780XRk2);
                    DialogC848780XRk.LLJI = dialogC848780XRk2;
                    return dialogC848780XRk2;
                }

                {
                    this.LL = c19eg;
                    this.LLILLJJLI = z;
                }
            }, true);
        }
    }
}
