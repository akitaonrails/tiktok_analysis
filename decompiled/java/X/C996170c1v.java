package X;

import android.R;
import android.app.Activity;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.commercialize.utils.AdPopUpWebPageHelper;
import com.ss.android.ugc.aweme.landpage.popup.IAdLandingPagePopUpService;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0c1v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C996170c1v {
    public static void LIZ(Activity activity) {
        boolean z;
        ViewGroup viewGroup;
        Map<Integer, AdPopUpWebPageHelper> map = AdPopUpWebPageHelper.LLJILJIL;
        AdPopUpWebPageHelper adPopUpWebPageHelper = (AdPopUpWebPageHelper) ((LinkedHashMap) map).get(Integer.valueOf(activity.hashCode()));
        if (adPopUpWebPageHelper != null) {
            C19EG c19egLIZ = adPopUpWebPageHelper.LIZ();
            if (c19egLIZ != null) {
                IAdLandingPagePopUpService iAdLandingPagePopUpService = (IAdLandingPagePopUpService) adPopUpWebPageHelper.LLIZLLLIL.getValue();
                if (iAdLandingPagePopUpService != null) {
                    new C343950De5();
                    iAdLandingPagePopUpService.LJIILIIL();
                }
                c19egLIZ.getLifecycle().removeObserver(adPopUpWebPageHelper);
                C1035340d36 c1035340d36 = adPopUpWebPageHelper.LLILZLL;
                if (c1035340d36 != null) {
                    C1025930cnv params = c1035340d36.getParams();
                    boolean z2 = false;
                    if (params != null) {
                        z = params.LJII;
                    } else {
                        z = false;
                    }
                    C1035340d36 c1035340d36LIZ = C1028450crz.LIZ(c19egLIZ, z);
                    if (c1035340d36LIZ != null) {
                        c1035340d36LIZ.LJIJJ(true);
                        C1025930cnv c1025930cnv = c1035340d36LIZ.LLJJLIIIJLLLLLLLZ;
                        if (c1025930cnv != null) {
                            z2 = c1025930cnv.LJII;
                        }
                        C786410Ut5.LJJJZ(c1035340d36LIZ, C1028450crz.LIZIZ(c19egLIZ, z2));
                        if (z && (viewGroup = (ViewGroup) c19egLIZ.findViewById(R.id.content)) != null) {
                            C786410Ut5.LJJJLZIJ(c19egLIZ.findViewById(com.zhiliaoapp.musically.R.id.pax), viewGroup);
                        }
                    }
                }
            }
            map.remove(Integer.valueOf(activity.hashCode()));
        }
    }
}
