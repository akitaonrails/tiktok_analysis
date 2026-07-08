package X;

import com.bytedance.pumbaa.piz.api.IPizService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;

/* JADX INFO: renamed from: X.0WRs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C823380WRs {
    public static final C823380WRs LIZ = new C823380WRs();

    public static final String LIZ(String str) {
        C2440509hL c2440509hLLIZ;
        String str2;
        new Object() { // from class: X.0WRt
        }.getClass();
        IPizService iPizService = (IPizService) PluggableExtentionKt.pluggableSpi$default(IPizService.class, false, false, false, 14, null);
        if (iPizService != null && (c2440509hLLIZ = iPizService.LIZ(str)) != null && (str2 = c2440509hLLIZ.LIZ) != null) {
            return str2;
        }
        return str;
    }
}
