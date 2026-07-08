package X;

import android.content.res.Configuration;
import android.content.res.Resources;
import androidx.lifecycle.LiveData;
import com.bytedance.android.livesdkapi.host.IHostPersonalized;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ib2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C469460Ib2 {
    public static String LIZ = "";
    public static String LIZIZ = "";

    public static boolean LIZ() {
        IHostPersonalized iHostPersonalized = (IHostPersonalized) C1161920gLG.LIZJ(IHostPersonalized.class);
        return iHostPersonalized != null && iHostPersonalized.BA2();
    }

    public static LiveData LIZIZ() {
        IHostPersonalized iHostPersonalized = (IHostPersonalized) C1161920gLG.LIZJ(IHostPersonalized.class);
        if (iHostPersonalized != null) {
            return iHostPersonalized.cx2();
        }
        return null;
    }

    public static boolean LIZJ() {
        LiveData liveDataLIZIZ;
        return LIZ() && (liveDataLIZIZ = LIZIZ()) != null && Intrinsics.LJFF(liveDataLIZIZ.getValue(), Boolean.TRUE);
    }

    public static boolean LIZLLL(C19EG c19eg) {
        boolean z;
        Resources resources;
        Configuration configuration;
        if (c19eg != null && (resources = c19eg.getResources()) != null && (configuration = resources.getConfiguration()) != null && configuration.orientation == 2) {
            z = true;
        } else {
            z = false;
        }
        return !z;
    }

    public static void LJ(DataChannel dataChannel) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_manage_feeds_click");
        c474500IjALIZ.LJJII(LIZ, "source");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LIZ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LJFF(DataChannel dataChannel, String str) {
        boolean zLJFF;
        LiveData liveDataLIZIZ = LIZIZ();
        if (liveDataLIZIZ != null) {
            zLJFF = Intrinsics.LJFF(liveDataLIZIZ.getValue(), Boolean.FALSE);
        } else {
            zLJFF = 0;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_manage_feeds_popup_click");
        c474500IjALIZ.LJJII(LIZIZ, "from_page");
        c474500IjALIZ.LJJII(str, "click_position");
        c474500IjALIZ.LJJII(Integer.valueOf(!zLJFF), "is_live_non_personalized");
        c474500IjALIZ.LJJII(LIZ, "source");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LIZ();
    }
}
