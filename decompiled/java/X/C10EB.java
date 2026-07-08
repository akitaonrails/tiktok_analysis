package X;

import Y.AObjectS371S0100000_28;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ab.SubscribeSettingsExp;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.ChannelsAuthRefactorExp;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.GuideOutPushUGNewExp;
import com.ss.android.ugc.aweme.unifiedauthapi.model.PopupInstanceConfig;
import com.ss.android.ugc.aweme.unifiedauthapi.model.UnifiedAuthPopupConfig;
import com.ss.android.ugc.aweme.unifiedauthapi.push.IUniAuthGuidePopupApi;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.10EB, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10EB implements Runnable {
    public final /* synthetic */ Context LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ C19EG LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ C10EF LLILZLL;
    public final /* synthetic */ boolean LLIZ;
    public final /* synthetic */ C10EA LLIZLLLIL;
    public final /* synthetic */ C10EW LLJ;
    public final /* synthetic */ User LLJI;

    public final void LIZ() {
        String strLIZ;
        C1397510mTF c1397510mTF;
        AlertDialog alertDialogCreate;
        User user;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("needShowOpenNotificationGuide(13+: ");
        int i = Build.VERSION.SDK_INT;
        sbLIZ.append(i >= 33);
        sbLIZ.append(")");
        C2188811AlT.LIZIZ(sbLIZ);
        if ((C824390WVp.LIZJ(this.LL) || ((Boolean) GuideOutPushUGNewExp.LJIIIIZZ.getValue()).booleanValue()) && !this.LLILLJJLI) {
            int i2 = C2187451AjH.LIZ;
            if (i < 33 || !C1514430pVp.LIZLLL().booleanValue()) {
                if (!ChannelsAuthRefactorExp.INSTANCE.enabled()) {
                    C19212010Ec.LIZJ.LJZL(this.LL, new C1917290zzb("new_ui_settings", this.LLILZ, "", "app_launch", "", "bottom", 0L, 0L, "", null, null, ""));
                    return;
                }
                UnifiedAuthPopupConfig unifiedAuthPopupConfigLIZJ = ((IUniAuthGuidePopupApi) ServiceManager.get().getService(IUniAuthGuidePopupApi.class)).LIZJ("app_launch");
                unifiedAuthPopupConfigLIZJ.setSceneId("app_launch");
                unifiedAuthPopupConfigLIZJ.setEnterFrom(this.LLILZ);
                unifiedAuthPopupConfigLIZJ.setPopupTriggerId("ug_338_follow_feed");
                ((PopupInstanceConfig) ListProtector.get(unifiedAuthPopupConfigLIZJ.popupInstances, 0)).setPopupCombinationType(1);
                ((IUniAuthGuidePopupApi) ServiceManager.get().getService(IUniAuthGuidePopupApi.class)).LIZLLL(this.LL, null, unifiedAuthPopupConfigLIZJ);
                return;
            }
            return;
        }
        final C19EG c19eg = this.LLILLL;
        final String str = this.LLILZ;
        final boolean z = this.LLILZIL;
        final C10EF c10ef = this.LLILZLL;
        final boolean z2 = this.LLIZ;
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: X.10ED
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) throws Throwable {
                C19EG c19eg2 = c19eg;
                String str2 = str;
                boolean z3 = z;
                C10EF c10ef2 = c10ef;
                boolean z4 = z2;
                try {
                    C824390WVp.LJFF(c19eg2, str2);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    Intent intent = new Intent("android.settings.SETTINGS");
                    RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(c19eg2, intent, "Context_startActivity_1");
                    C1701330uNH.LIZ(intent, c19eg2);
                    C2204961BRm.LLJJJJ(c19eg2, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP+8apPdkhyI+u0Rq9Nw2evFfNlhJP20thA=", null));
                }
                if (z3) {
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LJIIIIZZ("enter_from", "notification_setting_page");
                    c2344009Gk.LJIIIIZZ("inbox_mode", C19212010Ec.LIZJ.LIZJ().getMobValue());
                    C20684815ws.LJIILLIIL("notification_setting_alert_click", c2344009Gk.LIZ);
                } else if (c10ef2 != null) {
                    C2344009Gk c2344009Gk2 = new C2344009Gk();
                    c2344009Gk2.LJIIIIZZ("enter_from", c10ef2.LIZJ);
                    c2344009Gk2.LJIIIIZZ("enter_method", c10ef2.LIZLLL);
                    c2344009Gk2.LJIIIIZZ("room_id", c10ef2.LIZ);
                    c2344009Gk2.LJIIIIZZ("anchor_id", c10ef2.LIZIZ);
                    c2344009Gk2.LJIIIIZZ("enter_reason", "general");
                    C20684815ws.LJIILLIIL("push_pre_permission_auth", c2344009Gk2.LIZ);
                } else if (z4) {
                    C2344009Gk c2344009Gk3 = new C2344009Gk();
                    c2344009Gk3.LJIIIIZZ("enter_from", str2);
                    c2344009Gk3.LJIIIIZZ("enter_method", "notification_bell");
                    c2344009Gk3.LJIIIIZZ("enter_reason", "general");
                    C20684815ws.LJIILLIIL("push_pre_permission_auth", c2344009Gk3.LIZ);
                } else {
                    C20684815ws.LJIILLIIL("push_pre_permission_auth", new C2344009Gk().LIZ);
                }
                C10E9.LJIIIZ(c19eg2);
                C849850XVn.LIZIZ.LIZJ().LJIJI("477", "btn_open", true);
                if (dialogInterface != null) {
                    dialogInterface.dismiss();
                }
            }
        };
        DialogInterface.OnClickListener onClickListener2 = new DialogInterface.OnClickListener() { // from class: X.10EE
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                boolean z3 = z;
                C10EF c10ef2 = c10ef;
                boolean z4 = z2;
                String str2 = str;
                C19EG c19eg2 = c19eg;
                dialogInterface.dismiss();
                if (z3) {
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LJIIIIZZ("enter_from", "notification_setting_page");
                    c2344009Gk.LJIIIIZZ("inbox_mode", C19212010Ec.LIZJ.LIZJ().getMobValue());
                    C20684815ws.LJIILLIIL("notification_setting_alert_close", c2344009Gk.LIZ);
                } else if (c10ef2 != null) {
                    C2344009Gk c2344009Gk2 = new C2344009Gk();
                    c2344009Gk2.LJIIIIZZ("enter_from", c10ef2.LIZJ);
                    c2344009Gk2.LJIIIIZZ("enter_method", c10ef2.LIZLLL);
                    c2344009Gk2.LJIIIIZZ("room_id", c10ef2.LIZ);
                    c2344009Gk2.LJIIIIZZ("anchor_id", c10ef2.LIZIZ);
                    c2344009Gk2.LJIIIIZZ("enter_reason", "general");
                    C20684815ws.LJIILLIIL("push_pre_permission_deny", c2344009Gk2.LIZ);
                } else if (z4) {
                    C2344009Gk c2344009Gk3 = new C2344009Gk();
                    c2344009Gk3.LJIIIIZZ("enter_from", str2);
                    c2344009Gk3.LJIIIIZZ("enter_method", "notification_bell");
                    c2344009Gk3.LJIIIIZZ("enter_reason", "general");
                    C20684815ws.LJIILLIIL("push_pre_permission_deny", c2344009Gk3.LIZ);
                } else {
                    C20684815ws.LJIILLIIL("push_pre_permission_deny", new C2344009Gk().LIZ);
                }
                C10E9.LJIIIZ(c19eg2);
                C1440005kM.LIZ(new C0T0H());
                C849850XVn.LIZIZ.LIZJ().LJIJI("477", "later", false);
            }
        };
        C10EH c10eh = new C10EH(this);
        if (this.LLILLJJLI) {
            alertDialogCreate = new AlertDialog.Builder(this.LLILLL).setTitle(2131847796).setMessage((!z2 || !SubscribeSettingsExp.LIZIZ() || (user = this.LLJI) == null || TextUtils.isEmpty(user.getNickname())) ? c19eg.getString(2131847799) : c19eg.getString(2131849304, this.LLJI.getNickname())).setPositiveButton(2131847798, onClickListener).setNegativeButton(2131847797, onClickListener2).create();
            alertDialogCreate.setOnShowListener(new DialogInterface.OnShowListener() { // from class: X.10EG
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    if (dialogInterface instanceof AlertDialog) {
                        AlertDialog alertDialog = (AlertDialog) dialogInterface;
                        alertDialog.getButton(-1).setTextColor(-16777216);
                        alertDialog.getButton(-2).setTextColor(-16777216);
                    }
                }
            });
            alertDialogCreate.setCanceledOnTouchOutside(false);
            c1397510mTF = null;
        } else {
            C1397580mTM c1397580mTM = new C1397580mTM(c19eg);
            c1397580mTM.LJIIIZ = new C1391810mK3(R.drawable.awh, 0, c19eg);
            C19EG c19eg2 = this.LLILLL;
            String strLIZ2 = SharePrefCache.inst().getRequestNotificationTitle().LIZ();
            if (TextUtils.isEmpty(strLIZ2)) {
                strLIZ2 = c19eg2.getString(2131850514);
            }
            c1397580mTM.LJI(strLIZ2);
            C19EG c19eg3 = this.LLILLL;
            if (this.LLILZIL) {
                strLIZ = c19eg3.getString(2131830584);
            } else {
                strLIZ = SharePrefCache.inst().getRequestNotificationText().LIZ();
                if (TextUtils.isEmpty(strLIZ)) {
                    strLIZ = c19eg3.getString(2131830583);
                }
            }
            c1397580mTM.LIZIZ(strLIZ);
            C1397620mTQ c1397620mTQ = new C1397620mTQ(this.LLILLL);
            c1397620mTQ.LJFF(R.string.eq0, new AObjectS371S0100000_28(onClickListener, 3));
            c1397620mTQ.LJII(2131836425, new AObjectS371S0100000_28(onClickListener2, 4));
            c1397580mTM.LJIIL = c1397620mTQ;
            c1397580mTM.LJII = false;
            c1397580mTM.LIZLLL = new DialogInterfaceOnDismissListenerC19333410kO(this.LLIZLLLIL, this.LLJ, c10eh, 0);
            c1397510mTF = new C1397510mTF(c1397580mTM);
            C10E9.LIZ = new WeakReference<>(c1397510mTF);
            alertDialogCreate = null;
        }
        if (c19eg.isFinishing()) {
            return;
        }
        try {
            if (!C849850XVn.LIZIZ.LIZJ().LJJ("477_low_system")) {
                PopupManager.LJIJI(new C10EC(this.LLILLL, this.LLILLJJLI, alertDialogCreate, c1397510mTF, c10eh), true);
                return;
            }
            C10EC c10ec = new C10EC(this.LLILLL, this.LLILLJJLI, alertDialogCreate, c1397510mTF, c10eh);
            boolean z3 = this.LLILLJJLI;
            PopupManager.LJIJ(c10ec, z3 ? "477" : "477_low_system", new C1668306g5(z3 ? "ug_477_notification" : "ug_477_low_system_notification"));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("NotificationsHelper@e816.checkNotification$1");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("NotificationsHelper@e816.checkNotification$1");
    }

    public C10EB(Context context, boolean z, C19EG c19eg, String str, boolean z2, C10EF c10ef, boolean z3, C10EA c10ea, C10EW c10ew, User user) {
        this.LL = context;
        this.LLILLJJLI = z;
        this.LLILLL = c19eg;
        this.LLILZ = str;
        this.LLILZIL = z2;
        this.LLILZLL = c10ef;
        this.LLIZ = z3;
        this.LLIZLLLIL = c10ea;
        this.LLJ = c10ew;
        this.LLJI = user;
    }
}
