package X;

import android.app.Activity;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.setting.serverpush.model.FetchPushOffReasonsResp;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushOffReasonsData;
import com.ss.android.ugc.aweme.setting.serverpush.ui.PushOffReasonBottomSheetFragment;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AFwS215S0000000_26;

/* JADX INFO: renamed from: X.0veX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1750470veX implements C10E3, InterfaceC1750490veZ {
    public static final C1750470veX LL = new C1750470veX();
    public static final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(11));
    public static final C1750480veY LLILLL = new C1750480veY();
    public static WeakReference<Activity> LLILZ;
    public static String LLILZIL;

    @Override // X.InterfaceC1750490veZ
    public final void J92() {
        Activity activity;
        WeakReference<Activity> weakReference = LLILZ;
        if (weakReference != null && (activity = weakReference.get()) != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(activity);
            c1389890mGx.LJIIIZ(R.string.m25);
            c1389890mGx.LJIIJJI();
        }
        ((C1260870iur) LLILLJJLI.getValue()).LIZ();
        LLILZIL = null;
    }

    @Override // X.C10E3
    public final void LIZ(Activity activity) {
        if (!C10EU.LJIILIIL()) {
            SettingsManager.LIZLLL().getClass();
            if (SettingsManager.LIZ("show_feedback_dlg_4_push_off_reasons", false)) {
                C1750480veY c1750480veY = LLILLL;
                c1750480veY.getClass();
                if (System.currentTimeMillis() >= c1750480veY.LIZ.getLong("key_next_push_off_dialog_showtime", 0L)) {
                    C01GW c01gw = LLILLJJLI;
                    ((C1260870iur) c01gw.getValue()).LLILLJJLI = this;
                    ((C1260870iur) c01gw.getValue()).LIZJ(new Object[0]);
                    LLILZIL = "follow_new_video_push";
                    LLILZ = new WeakReference<>(activity);
                }
            }
        }
    }

    @Override // X.InterfaceC1750490veZ
    public final void MV0(FetchPushOffReasonsResp fetchPushOffReasonsResp) {
        Activity activity;
        C19EG c19eg;
        PushOffReasonsData pushOffReasonsData = fetchPushOffReasonsResp.data;
        if (pushOffReasonsData == null) {
            return;
        }
        LLILLL.LIZ.storeLong("key_next_push_off_dialog_showtime", System.currentTimeMillis() + ((long) (pushOffReasonsData.interval * LSPassThroughRecordSizeConfig.DEFAULT)));
        C1245240iVe c1245240iVe = C1245240iVe.LIZ;
        String str = LLILZIL;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        c1245240iVe.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "push_setting_page");
        c2344009Gk.LJIIIIZZ("label", str);
        C20684815ws.LJIILLIIL("push_feedback_pop_up_show", c2344009Gk.LIZ);
        WeakReference<Activity> weakReference = LLILZ;
        if (weakReference != null) {
            activity = weakReference.get();
        } else {
            activity = null;
        }
        if ((activity instanceof C19EG) && (c19eg = (C19EG) activity) != null) {
            C1255390im1 c1255390im1 = new C1255390im1("settings_page", "manual", null, null, null, null, 248);
            String str3 = LLILZIL;
            if (str3 != null) {
                str2 = str3;
            }
            PushOffReasonBottomSheetFragment pushOffReasonBottomSheetFragmentLIZ = C1749230vcX.LIZ(c19eg, c1255390im1, str2, pushOffReasonsData);
            if (pushOffReasonBottomSheetFragmentLIZ != null) {
                pushOffReasonBottomSheetFragmentLIZ.LLILZIL = new WeakReference<>(this);
            }
        }
        ((C1260870iur) LLILLJJLI.getValue()).LIZ();
        LLILZIL = null;
    }

    @Override // X.InterfaceC1750490veZ
    public final void r60(boolean z) {
        Activity activity;
        WeakReference<Activity> weakReference = LLILZ;
        if (weakReference != null && (activity = weakReference.get()) != null) {
            if (z) {
                C1389890mGx c1389890mGx = new C1389890mGx(activity);
                c1389890mGx.LJIIJ(activity.getString(2131838245));
                c1389890mGx.LJFF(R.raw.icon_tick_fill_small);
                c1389890mGx.LJII(R.attr.a0i);
                c1389890mGx.LJIIJJI();
                return;
            }
            C1389890mGx c1389890mGx2 = new C1389890mGx(activity);
            c1389890mGx2.LJIIIZ(R.string.m25);
            c1389890mGx2.LJIIJJI();
        }
    }
}
