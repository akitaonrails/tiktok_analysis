package X;

import Y.AObserverS213S0100000_9;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.notification.bean.NotificationSubscribeSettingsList;
import com.ss.android.ugc.aweme.notification.bean.UnSubscribeSettingsData;
import com.ss.android.ugc.aweme.notification.vh.SubscribeSettingsCell;
import com.ss.android.ugc.aweme.notification.vm.SubscribeSettingVM;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS410S0200000_9;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: renamed from: X.0OwN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C635570OwN {
    public final C19EG LIZ;
    public final int LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public TuxSheet LJ;
    public final C01GW LJFF;
    public NotificationSubscribeSettingsList LJI;

    public final void LIZIZ() {
        NotificationSubscribeSettingsList notificationSubscribeSettingsList = this.LJI;
        if (notificationSubscribeSettingsList == null) {
            this.LIZLLL = true;
            ((SubscribeSettingVM) this.LJFF.getValue()).vQ2(this.LIZIZ);
            return;
        }
        TuxSheet tuxSheet = this.LJ;
        if (tuxSheet == null) {
            View viewLJLLJ = C786410Ut5.LJLLJ(this.LIZ, R.layout.aab, null);
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) viewLJLLJ.findViewById(R.id.wii);
            viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(SubscribeSettingsCell.class);
            ArrayList arrayList = new ArrayList();
            List<UnSubscribeSettingsData> list = notificationSubscribeSettingsList.unSubscribeSettingList;
            if (list != null) {
                for (UnSubscribeSettingsData unSubscribeSettingsData : list) {
                    arrayList.add(new C635590OwP(unSubscribeSettingsData.group, unSubscribeSettingsData.labelTitle, unSubscribeSettingsData.label, unSubscribeSettingsData.subscribePrompt, unSubscribeSettingsData.unsubscribePrompt, Boolean.valueOf(unSubscribeSettingsData.isUnsubscribe)));
                }
            }
            if (!arrayList.isEmpty()) {
                viewOnAttachStateChangeListenerC20604515jv.getState().LJFF(null);
                viewOnAttachStateChangeListenerC20604515jv.getState().LIZLLL(arrayList, null);
                C0OM1 c0om1 = new C0OM1();
                c0om1.LIZLLL = true;
                C1250250idj c1250250idj = new C1250250idj();
                c1250250idj.LIZJ = this.LIZ.getString(2131836021);
                c0om1.LIZJ = c1250250idj;
                C1251150ifB c1251150ifB = new C1251150ifB();
                c1251150ifB.LIZLLL();
                c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
                c1251150ifB.LIZJ(new AwS410S0200000_9(this, viewLJLLJ, 55));
                c0om1.LIZIZ(c1251150ifB);
                C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
                c1390920mIc.LIZ.LLJJIII = viewLJLLJ;
                c1390920mIc.LJIIIIZZ(1);
                TuxSheet tuxSheet2 = c1390920mIc.LIZ;
                tuxSheet2.LLJJIJIL = c0om1;
                tuxSheet2.LLJJJ = null;
                tuxSheet2.LLILLJJLI = new C0P4R(notificationSubscribeSettingsList, this, 3);
                this.LJ = tuxSheet2;
            }
            tuxSheet = this.LJ;
            if (tuxSheet == null) {
                return;
            }
        }
        this.LIZJ = false;
        tuxSheet.show(this.LIZ.getSupportFragmentManager(), "notification_subscribe_settings");
        LIZ("show_inbox_notification_setting", this.LIZIZ, "", this.LJI);
    }

    public C635570OwN(int i, C19EG c19eg) {
        this.LIZ = c19eg;
        this.LIZIZ = i;
        C01GW c01gwLIZJ = C0DTR.LIZJ(new AwS553S0100000_9(this, 1368));
        this.LJFF = c01gwLIZJ;
        ((SubscribeSettingVM) c01gwLIZJ.getValue()).LLILLJJLI.observe(this.LIZ, new AObserverS213S0100000_9(this, 9));
    }

    public static void LIZ(String str, int i, String str2, NotificationSubscribeSettingsList notificationSubscribeSettingsList) {
        String str3;
        List<UnSubscribeSettingsData> list;
        String str4;
        if (i != 81) {
            if (i != 82) {
                str3 = "other";
            } else {
                str3 = "business_account";
            }
        } else {
            str3 = "promote_assistant";
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJFF("channel_type", str3);
        c2344009Gk.LIZJ(i, "notice_group");
        if (!TextUtils.isEmpty(str2)) {
            c2344009Gk.LJFF("action_type", str2);
        }
        if (notificationSubscribeSettingsList != null && (list = notificationSubscribeSettingsList.unSubscribeSettingList) != null) {
            for (UnSubscribeSettingsData unSubscribeSettingsData : list) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("setting_type_label_");
                sbLIZ.append(unSubscribeSettingsData.label);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                if (unSubscribeSettingsData.isUnsubscribe) {
                    str4 = "unsubscribed";
                } else {
                    str4 = "subscribed";
                }
                c2344009Gk.LJFF(strLIZIZ, str4);
            }
        }
        C20684815ws.LJIILLIIL(str, c2344009Gk.LIZ);
    }
}
