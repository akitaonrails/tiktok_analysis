package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.ss.android.ugc.aweme.setting.I18nSettingManageMyAccountActivity;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.14cj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20305114cj extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C20694515yR LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ Activity LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ C05P0<Boolean> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20305114cj(C20694515yR c20694515yR, Context context, boolean z, Activity activity, boolean z2, C05P0<Boolean> c05p0) {
        super(0);
        this.LL = c20694515yR;
        this.LLILLJJLI = context;
        this.LLILLL = z;
        this.LLILZ = activity;
        this.LLILZIL = z2;
        this.LLILZLL = c05p0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (!this.LL.LLJJIII.LIZ() || C824420WVs.LIZIZ(this.LLILLJJLI, "click_subpage_with_schema_push_cell")) {
            C20694515yR c20694515yR = this.LL;
            if (!c20694515yR.LLJILJIL || this.LLILLL) {
                C19343410m0 c19343410m0 = C19343410m0.LIZ;
                String str = c20694515yR.LLJJIII.schema;
                Context context = this.LLILLJJLI;
                c19343410m0.getClass();
                C19343410m0.LIZ(context, str, "settings_page");
                if (this.LL.LLJILJIL) {
                    C1245240iVe.LIZ.getClass();
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LJIIIIZZ("page_name", "sms_notifications");
                    C20684815ws.LJIILLIIL("tiktok_sms_notification_tab_click", c2344009Gk.LIZ);
                }
            } else {
                this.LLILZLL.setValue(Boolean.TRUE);
                Activity activity = this.LLILZ;
                String str2 = I18nSettingManageMyAccountActivity._pnsPageId;
                Bundle bundle = new Bundle();
                bundle.putInt("phone_number_source", EnumC1237820iJg.DYA_BIND_PHONE_NUMBER_SOURCE_TYPE_ACCOUNT_MANAGEMENT_PHONE_NUMBER.getValue());
                C0XQ7.LIZ().bindMobile(activity, "manage_my_account", bundle, true, (C0XTR) null);
                C1245240iVe.LIZ.getClass();
                C2344009Gk c2344009Gk2 = new C2344009Gk();
                c2344009Gk2.LJIIIIZZ("page_name", "phone_bind_page");
                C20684815ws.LJIILLIIL("tiktok_sms_notification_tab_click", c2344009Gk2.LIZ);
            }
            C19343410m0 c19343410m02 = C19343410m0.LIZ;
            C20694515yR c20694515yR2 = this.LL;
            PushItem pushItem = c20694515yR2.LLJJIII;
            boolean z = c20694515yR2.LLJJIJI;
            boolean z2 = this.LLILZIL;
            c19343410m02.getClass();
            if (z && Intrinsics.LJFF(pushItem.itemId, "sms")) {
                C1245240iVe.LIZ.getClass();
                C2344009Gk c2344009Gk3 = new C2344009Gk();
                c2344009Gk3.LJIIIIZZ("previous_page", "notification_setting_page");
                c2344009Gk3.LJIIIIZZ("page_name", "sms_setting_page");
                c2344009Gk3.LJIIIIZZ("exp_name", "sms_notification");
                C20684815ws.LJIILLIIL("enter_sms_notification_setting", c2344009Gk3.LIZ);
            } else if (!Intrinsics.LJFF(pushItem.itemId, "follow_new_video_push") && !Intrinsics.LJFF(pushItem.itemId, "live_push")) {
                C1245240iVe c1245240iVe = C1245240iVe.LIZ;
                String str3 = pushItem.itemId;
                c1245240iVe.getClass();
                C1245240iVe.LIZIZ(str3, "");
                if (!z2 && z) {
                    if (Intrinsics.LJFF(pushItem.itemId, "im_alert_tones")) {
                        C2344009Gk c2344009Gk4 = new C2344009Gk();
                        c2344009Gk4.LJIIIIZZ("enter_from", "settings");
                        C20684815ws.LJIILLIIL("msg_settings_alert_tone_click", c2344009Gk4.LIZ);
                    } else if (Intrinsics.LJFF(pushItem.itemId, "im_notification_permissions")) {
                        C2344009Gk c2344009Gk5 = new C2344009Gk();
                        c2344009Gk5.LJIIIIZZ("enter_from", "settings");
                        C20684815ws.LJIILLIIL("msg_settings_notif_permission_click", c2344009Gk5.LIZ);
                    }
                }
            }
        }
        return Unit.LIZ;
    }
}
