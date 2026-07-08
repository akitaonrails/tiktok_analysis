package X;

import com.ss.android.ugc.aweme.unifiedauthapi.experiment.ChannelsAuthOptimizeETPrinting;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.10Fw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19216610Fw {
    public static void LIZIZ(List list) {
        if (ChannelsAuthOptimizeETPrinting.INSTANCE.optPrinting()) {
            C844470XAv.LIZ.getClass();
            if (!Intrinsics.LJFF(C844470XAv.LJIILL, "local_test")) {
                return;
            }
        }
        C211000rc.LIZ("PopupTracking");
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ((C10GS) it2.next()).LIZ();
        }
        C211000rc.LIZ("PopupTracking");
    }

    public static C10GS LIZ(long j, int i, String str, int i2, String str2, String str3, long j2, String str4) {
        return new C10GS(j, str, j2, i, str2, str3, i2, str4, 1536);
    }
}
