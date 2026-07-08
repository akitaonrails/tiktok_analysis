package X;

import com.ss.android.ugc.aweme.feature.info.LiveSessionFeatureInfo;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0pN5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1509010pN5 implements InterfaceC1510030pOj {
    public static final C1509010pN5 LIZIZ = new C1509010pN5();
    public static final Set<String> LIZJ = C13LQ.LJLIIL(new String[]{"livesdk_preview_live_show", "livesdk_live_window_duration_v2"});

    @Override // X.InterfaceC1510030pOj
    public final Set<String> events() {
        return LIZJ;
    }

    @Override // X.InterfaceC1510030pOj
    public final void handleAppLogEvent(String str, C1510130pOt c1510130pOt) {
        String strLIZLLL;
        long jLongValue;
        if (Intrinsics.LJFF(str, "livesdk_preview_live_show")) {
            String strLIZLLL2 = c1510130pOt.LIZLLL("room_id");
            if (strLIZLLL2 != null && Intrinsics.LJFF(c1510130pOt.LIZLLL("action_type"), "click")) {
                LiveSessionFeatureInfo.Companion.getOrPut(strLIZLLL2);
                return;
            }
            return;
        }
        if (!Intrinsics.LJFF(str, "livesdk_live_window_duration_v2") || (strLIZLLL = c1510130pOt.LIZLLL("room_id")) == null) {
            return;
        }
        Number numberLIZJ = c1510130pOt.LIZJ("real_duration");
        if (numberLIZJ != null) {
            jLongValue = numberLIZJ.longValue();
        } else {
            jLongValue = 0;
        }
        LiveSessionFeatureInfo.Companion.getOrPut(strLIZLLL).addFeature("live_preview_play_time", Long.valueOf(jLongValue), false);
    }
}
