package X;

import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;

/* JADX INFO: renamed from: X.1483, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class AnonymousClass1483 {
    public static final AtomicBoolean LIZ = new AtomicBoolean(false);
    public static final AtomicBoolean LIZIZ = new AtomicBoolean(false);
    public static final AtomicBoolean LIZJ = new AtomicBoolean(false);
    public static final Set<String> LIZLLL = Collections.synchronizedSet(new HashSet());

    public static void LIZ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("pitaya setup failed: ");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        AnonymousClass0678.LIZ("observer_applog_run_event", C2097608Jq.LJIIJ(new Pair(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "pitaya_setup_failed"), new Pair("error", str), new Pair("mode", "app_log_observer")));
    }
}
