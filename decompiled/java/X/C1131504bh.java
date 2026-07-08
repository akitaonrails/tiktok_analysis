package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.04bh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1131504bh {
    public static final List<String> LIZ;
    public static final List<String> LIZIZ;

    static {
        List<String> listSingletonList = Collections.singletonList("_update_timing_from_server");
        LIZ = listSingletonList;
        try {
            List<String> list = (List) C0C64.LJIILLIIL().LJJII(List.class, listSingletonList, "ec_ug_allowlist_lynx_timing_flag", true);
            if (list != null) {
                listSingletonList = list;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            listSingletonList = LIZ;
        }
        LIZIZ = listSingletonList;
    }
}
