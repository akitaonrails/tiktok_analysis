package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.11wa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19663811wa {
    public static C19663611wY LIZ(InterfaceC1107590evd interfaceC1107590evd) {
        long jLongValue;
        Long lLJIILIIL = C2095008Iq.LJIILIIL(C1871910yoP.LJFF(interfaceC1107590evd, FollowStatusChangeMethod.PARAM_UID, ""));
        long jLongValue2 = 0;
        if (lLJIILIIL != null) {
            jLongValue = lLJIILIIL.longValue();
        } else {
            jLongValue = 0;
        }
        String strLJFF = C1871910yoP.LJFF(interfaceC1107590evd, "title", "");
        long jLIZLLL = C1871910yoP.LIZLLL(interfaceC1107590evd, "start_time", 0);
        Long lLJIILIIL2 = C2095008Iq.LJIILIIL(C1871910yoP.LJFF(interfaceC1107590evd, "subscriber_count", ""));
        if (lLJIILIIL2 != null) {
            jLongValue2 = lLJIILIIL2.longValue();
        }
        boolean zLIZIZ = C1871910yoP.LIZIZ(interfaceC1107590evd, "has_subscribed", false);
        boolean zLIZIZ2 = C1871910yoP.LIZIZ(interfaceC1107590evd, "is_paid_event", false);
        C19663611wY c19663611wY = new C19663611wY(jLongValue, strLJFF, jLIZLLL * ((long) LSPassThroughRecordSizeConfig.DEFAULT), jLongValue2, new ArrayList(), "100", CardStruct.IStatusCode.DEFAULT);
        c19663611wY.LJIIJ = zLIZIZ;
        c19663611wY.LJIIJJI = zLIZIZ2;
        return c19663611wY;
    }
}
