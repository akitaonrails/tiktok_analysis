package X;

import com.ss.android.agilelogger.ALog;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0POr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C644230POr {
    public final HashMap<String, Object> LIZ = new HashMap<>();

    public final void LIZ(Object obj, String str) {
        this.LIZ.put(str, obj);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("key = ");
        sbLIZ.append(str);
        sbLIZ.append(", value = ");
        sbLIZ.append(obj);
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("SearchChainEventTracker", C2188811AlT.LIZIZ(sbLIZ));
    }
}
