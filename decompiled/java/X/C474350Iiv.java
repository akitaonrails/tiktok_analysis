package X;

import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.sheet.LiveRepostGuideFragment;
import com.bytedance.keva.Keva;
import java.util.Map;

/* JADX INFO: renamed from: X.0Iiv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C474350Iiv {
    public static boolean LIZ(FragmentManager fragmentManager, InterfaceC474360Iiw interfaceC474360Iiw, String str, Map map) {
        C01GW<Keva> c01gw = LiveRepostGuideFragment.LLL;
        if (c01gw.getValue().getBoolean("repost_guide_show", false)) {
            return false;
        }
        c01gw.getValue().storeBoolean("repost_guide_show", true);
        C19322110iZ.LJFF(fragmentManager, new LiveRepostGuideFragment(interfaceC474360Iiw, str, map), "SheetDemoFragment", null, 0);
        return true;
    }
}
