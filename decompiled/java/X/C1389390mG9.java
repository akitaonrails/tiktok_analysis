package X;

import com.ss.android.ugc.aweme.compliance.api.model.AmberAlertCardInfo;
import java.util.UUID;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0mG9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1389390mG9 {
    public static final C1389390mG9 LIZ = new C1389390mG9();
    public static final UUID LIZIZ = UUID.randomUUID();

    public static C2344009Gk LIZ(AmberAlertCardInfo amberAlertCardInfo) {
        String str;
        C2344009Gk c2344009Gk = new C2344009Gk();
        Integer num = null;
        if (amberAlertCardInfo != null) {
            str = amberAlertCardInfo.alertId;
        } else {
            str = null;
        }
        c2344009Gk.LJIIIIZZ("amberalert_id", str);
        if (amberAlertCardInfo != null) {
            num = amberAlertCardInfo.amberAlertVersion;
        }
        c2344009Gk.LJ(num, "amber_alert_version");
        c2344009Gk.LJFF("session_id", LIZIZ.toString());
        return c2344009Gk;
    }

    public static void LIZIZ(AmberAlertCardInfo amberAlertCardInfo, String str, Function1 function1) {
        C20684815ws.LJIILLIIL(str, ((C2344009Gk) function1.invoke(LIZ(amberAlertCardInfo))).LIZ);
    }
}
