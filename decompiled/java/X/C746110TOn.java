package X;

import androidx.fragment.app.FragmentManager;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.AdFreeTrialPageInfo;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.Description;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.SubscriptionVM;
import com.bytedance.tux.sheet.intro.TuxPanel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS296S0000000_12;

/* JADX INFO: renamed from: X.0TOn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C746110TOn {
    public static void LIZ(C19EG c19eg, AdFreeTrialPageInfo adFreeTrialPageInfo, C20656615sK c20656615sK) {
        SubscriptionVM subscriptionVMLIZ;
        FragmentManager supportFragmentManager;
        Description description;
        if (adFreeTrialPageInfo == null) {
            return;
        }
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(c19eg);
        if (c19egLIZIZ != null) {
            subscriptionVMLIZ = C0TQ7.LIZ(c19egLIZIZ);
        } else {
            subscriptionVMLIZ = null;
        }
        C0TOY.LIZIZ = subscriptionVMLIZ;
        C1391960mKI c1391960mKI = new C1391960mKI();
        C0HTI c0hti = new C0HTI();
        c0hti.LIZ = R.drawable.f625yd;
        c1391960mKI.LIZLLL = c0hti.LIZ(c19eg);
        c1391960mKI.LJI = 2;
        String title = adFreeTrialPageInfo.getTitle();
        String str = "";
        if (title == null) {
            title = "";
        }
        c1391960mKI.LJII = title;
        List<Description> description2 = adFreeTrialPageInfo.getDescription();
        if (description2 != null && (description = (Description) C13LP.LJJJLL(description2)) != null) {
            C746100TOm c746100TOm = C746100TOm.LIZ;
            String str2 = description.description;
            List<String> list = description.hyperText;
            List<String> list2 = description.hyperLink;
            Integer numValueOf = Integer.valueOf(R.attr.a1h);
            Boolean bool = Boolean.TRUE;
            c746100TOm.getClass();
            c1391960mKI.LJIIIIZZ = C746100TOm.LIZLLL(c19eg, str2, list, list2, numValueOf, bool);
        }
        c1391960mKI.LJIIL = true;
        String buttonText = adFreeTrialPageInfo.getButtonText();
        if (buttonText != null) {
            str = buttonText;
        }
        c1391960mKI.LIZIZ(str, AFwS296S0000000_12.get$arr$(13));
        c1391960mKI.LIZ = true;
        C439850HMp c439850HMpLIZ = c1391960mKI.LIZ();
        DialogInterfaceOnDismissListenerC786080UsY dialogInterfaceOnDismissListenerC786080UsY = new DialogInterfaceOnDismissListenerC786080UsY(c20656615sK, 38);
        TuxPanel tuxPanel = c439850HMpLIZ.LIZ;
        tuxPanel.LLILZIL = dialogInterfaceOnDismissListenerC786080UsY;
        C19EG c19egLIZIZ2 = C1388190mED.LIZIZ(c19eg);
        if (c19egLIZIZ2 != null && (supportFragmentManager = c19egLIZIZ2.getSupportFragmentManager()) != null) {
            tuxPanel.show(supportFragmentManager, "NotificationPromptManager");
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LIZJ(0, "prompt_type");
            C20684815ws.LJIILLIIL("show_ttadfree_reminder", c2344009Gk.LIZ);
            SubscriptionVM subscriptionVM = C0TOY.LIZIZ;
            if (subscriptionVM != null) {
                subscriptionVM.xQ2(1, null, null);
            }
        }
    }
}
