package X;

import com.bytedance.android.livesdk.comp.api.event.api.data.LiveEventModule;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: renamed from: X.0Ino, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C477380Ino {
    public static LiveEventModule LIZ(InterfaceC1107590evd interfaceC1107590evd) {
        long jLongValue;
        InterfaceC1107590evd interfaceC1107590evdLJ = C1871910yoP.LJ(interfaceC1107590evd, "live_event");
        if (interfaceC1107590evdLJ == null) {
            return null;
        }
        String strLJFF = C1871910yoP.LJFF(interfaceC1107590evdLJ, FollowStatusChangeMethod.PARAM_UID, "");
        String strLJFF2 = C1871910yoP.LJFF(interfaceC1107590evdLJ, "title", "");
        long jLIZLLL = C1871910yoP.LIZLLL(interfaceC1107590evdLJ, "start_time", 0);
        String strLJFF3 = C1871910yoP.LJFF(interfaceC1107590evdLJ, "desc", "");
        Long lLJIILIIL = C2095008Iq.LJIILIIL(C1871910yoP.LJFF(interfaceC1107590evdLJ, "duration", ""));
        if (lLJIILIIL != null) {
            jLongValue = lLJIILIIL.longValue();
        } else {
            jLongValue = 0;
        }
        return new LiveEventModule(strLJFF, jLIZLLL, strLJFF2, null, false, false, C1871910yoP.LIZIZ(interfaceC1107590evdLJ, "has_subscribed", false), strLJFF3, jLongValue, C1871910yoP.LIZIZ(interfaceC1107590evdLJ, "is_default_title", false), false, C1871910yoP.LJFF(interfaceC1107590evdLJ, "periodic_settings", ""), C1871910yoP.LJFF(interfaceC1107590evdLJ, "periodic_shows", ""), 1080, null);
    }
}
