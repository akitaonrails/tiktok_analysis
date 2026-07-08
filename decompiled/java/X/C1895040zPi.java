package X;

import android.app.Activity;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.touchpoint.api.model.OnboardingLink;
import com.bytedance.touchpoint.data.parser.notify.OnboardingLinkViewModel;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.0zPi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1895040zPi {
    public static final C736950SvV LIZ;
    public static boolean LIZIZ;
    public static boolean LIZJ;
    public static boolean LIZLLL;
    public static OnboardingLink LJ;

    static {
        LifecycleOwner lifecycleOwner = C0J3E.LL;
        LIZ = new C736950SvV(C13LE.LIZ(OnboardingLinkViewModel.class), null, new C452070Ho5(), C724750Sbp.LJII(lifecycleOwner), C1220000hqw.LIZ(lifecycleOwner instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) lifecycleOwner : null), new C1895050zPj(), null, null, null);
    }

    public static void LIZ() {
        Activity activityLJIILL;
        String str;
        AbstractC1896090zRP abstractC1896090zRP = (AbstractC1896090zRP) C1619720sFe.LIZ.LIZ(0);
        if (abstractC1896090zRP == null || (activityLJIILL = abstractC1896090zRP.LJIILL()) == null) {
            return;
        }
        C1893580zNM c1893580zNM = C1893580zNM.LIZ;
        OnboardingLink onboardingLink = LJ;
        Integer numValueOf = onboardingLink != null ? Integer.valueOf(onboardingLink.LIZ) : null;
        OnboardingLink onboardingLink2 = LJ;
        if (onboardingLink2 == null || (str = onboardingLink2.jumpLink) == null) {
            str = "";
        }
        C1893580zNM.LJ(c1893580zNM, activityLJIILL, numValueOf, str, null, false, null, null, null, 248);
        LIZJ = true;
        C01GW<C1894700zPA> c01gw = C1894700zPA.LJIJ;
        C1894700zPA c1894700zPALIZ = C2178808gE.LIZ();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        OnboardingLink onboardingLink3 = LJ;
        linkedHashMap.put("notification_id", onboardingLink3 != null ? onboardingLink3.notificationId : null);
        linkedHashMap.put("classification", "onboarding_url");
        c1894700zPALIZ.getClass();
        C15O7.LIZJ(new CallableC1849870yEr(0, linkedHashMap));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("jumpLink: ");
        OnboardingLink onboardingLink4 = LJ;
        sbLIZ.append(onboardingLink4 != null ? onboardingLink4.jumpLink : null);
        C2188811AlT.LIZIZ(sbLIZ);
    }
}
