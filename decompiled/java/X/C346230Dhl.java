package X;

import android.app.Activity;
import android.content.Context;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.setting.ui.AdSettingsActivity;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Dhl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C346230Dhl extends ClickableSpan {
    public final int $t;
    public Object l0;

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
            case 2:
                onClick$2(this, view);
                break;
            default:
                super.onClick(view);
                break;
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.$t) {
            case 0:
                updateDrawState$0(this, textPaint);
                break;
            case 1:
                updateDrawState$1(this, textPaint);
                break;
            case 2:
                textPaint.setUnderlineText(false);
                break;
            default:
                super.updateDrawState(textPaint);
                break;
        }
    }

    public C346230Dhl(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onClick$0(C346230Dhl c346230Dhl, View view) {
        String aid;
        AdSettingsActivity adSettingsActivity = (AdSettingsActivity) c346230Dhl.l0;
        adSettingsActivity.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        SettingsManager.LIZLLL().getClass();
        String str = "aweme://webview?url=https%3A%2F%2Fwww.tiktok.com%2Ffalcon%2Ftcm%2Fh5%2Fvideo_appeal%3Fhide_nav_bar%3D1%26from%3Dapp";
        String strLJI = SettingsManager.LJI("branded_content_detail_url", "aweme://webview?url=https%3A%2F%2Fwww.tiktok.com%2Ffalcon%2Ftcm%2Fh5%2Fvideo_appeal%3Fhide_nav_bar%3D1%26from%3Dapp");
        if (!TextUtils.isEmpty(strLJI)) {
            str = strLJI;
        }
        sbLIZ.append(str);
        sbLIZ.append("%26item_id%3D");
        Aweme aweme = AdSettingsActivity.LLJJIJIIJIL;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        sbLIZ.append(aid);
        SmartRouter.buildRoute(adSettingsActivity, C2188811AlT.LIZIZ(sbLIZ)).open();
    }

    public static final void onClick$1(C346230Dhl c346230Dhl, View view) {
        ((AdSettingsActivity) c346230Dhl.l0).LLLZ();
    }

    public static final void onClick$2(C346230Dhl c346230Dhl, View view) {
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute((Context) c346230Dhl.l0, "//chatcontrol/setting");
        smartRouteBuildRoute.withParam("enter_from", "notification_page");
        smartRouteBuildRoute.withParam("enter_method", "dm_permission_updated");
        smartRouteBuildRoute.open();
        HandlerHook.viewPostDelay(view, new Runnable() { // from class: X.0CXM
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("MessagePermissionUpdatedSheetView@4722.<init>$2$1$onClick$1");
                try {
                    Activity activityLJFF = C2214201BlK.LJFF();
                    if (activityLJFF != null) {
                        SmartRoute smartRouteBuildRoute2 = SmartRouter.buildRoute(activityLJFF, "aweme://privacy/setting/page?target=direct_message_sheet");
                        smartRouteBuildRoute2.withParam("enter_from", "notification_page");
                        smartRouteBuildRoute2.withParam("enter_method", "dm_permission_updated");
                        smartRouteBuildRoute2.open();
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("MessagePermissionUpdatedSheetView@4722.<init>$2$1$onClick$1");
            }
        }, 200L);
    }

    public static final void updateDrawState$0(C346230Dhl c346230Dhl, TextPaint textPaint) {
        textPaint.setUnderlineText(false);
        textPaint.setColor(C960203pA.LIZ(R.attr.a1j, (AdSettingsActivity) c346230Dhl.l0));
        C444890HcV c444890HcV = new C444890HcV();
        c444890HcV.LIZ(82);
        textPaint.setTypeface(c444890HcV.getTypeface());
    }

    public static final void updateDrawState$1(C346230Dhl c346230Dhl, TextPaint textPaint) {
        textPaint.setUnderlineText(false);
        textPaint.setColor(C960203pA.LIZ(R.attr.a1h, (AdSettingsActivity) c346230Dhl.l0));
        C444890HcV c444890HcV = new C444890HcV();
        c444890HcV.LIZ(82);
        textPaint.setTypeface(c444890HcV.getTypeface());
    }
}
