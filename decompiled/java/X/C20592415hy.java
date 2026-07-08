package X;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.15hy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20592415hy extends C09AY implements Function0<InterfaceC20528082k> {
    public C20592415hy() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC20528082k invoke() {
        C20593115i5.LIZ.getClass();
        return C20593115i5.LJIILIIL() ? C20591215hm.LIZ : new InterfaceC20528082k() { // from class: X.10iA
            public static int LIZIZ;
            public static final ArrayList<String> LIZJ = C1697810uHb.LJ("com.ss.android.ugc.aweme.deeplink.DeepLinkActivityV2", "com.ss.android.ugc.aweme.journey.NewUserJourneyActivity", "com.ss.android.ugc.aweme.main.MainActivity", "com.ss.android.ugc.aweme.main.MainRootFragment", "com.ss.android.ugc.aweme.feed.landscape.LandscapeFeedActivity", "com.ss.android.ugc.aweme.feed.landscape.Landscape270FeedActivity", "com.ss.android.ugc.aweme.live.LivePlayActivity", "com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity");

            @Override // X.InterfaceC20528082k
            public final void LIZ(Activity activity) {
            }

            @Override // X.InterfaceC20528082k
            public final void LIZIZ() {
            }

            @Override // X.InterfaceC20528082k
            public final void onConfigurationChanged(Activity activity, Configuration configuration) {
            }

            @Override // X.InterfaceC20528082k
            public final void LIZJ(Activity activity, Bundle bundle) {
                LIZLLL(activity, bundle, activity.getClass().getSimpleName(), activity.getClass().getCanonicalName());
            }

            public static void LIZLLL(Activity activity, Bundle bundle, String str, String str2) {
                if (bundle == null) {
                    try {
                        String canonicalName = activity.getClass().getCanonicalName();
                        if (canonicalName != null) {
                            LIZIZ++;
                            if (activity.getResources().getConfiguration().orientation != 1) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append(str);
                                sbLIZ.append(".orientation:");
                                sbLIZ.append(activity.getResources().getConfiguration().orientation);
                                sbLIZ.append(" , onActivityPreCreated");
                                C1909520zn4.LIZIZ("orientationFix", C2188811AlT.LIZIZ(sbLIZ));
                                C2241008qG c2241008qG = new C2241008qG();
                                c2241008qG.LIZ.put("page_name", str);
                                c2241008qG.LIZ.put("class_name", str2);
                                c2241008qG.LIZ.put("enter_method", "preCreated");
                                c2241008qG.LIZ.put("page_number", Integer.valueOf(LIZIZ));
                                C20684815ws.LJIJ("fix_activity_orientation_phone", c2241008qG.LJ());
                                if (!LIZJ.contains(canonicalName)) {
                                    activity.setRequestedOrientation(1);
                                }
                            }
                        }
                    } catch (IllegalStateException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            }
        };
    }
}
