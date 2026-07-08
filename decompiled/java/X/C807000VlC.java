package X;

import android.os.SystemClock;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.experiment.ReDexExperimentOpt;
import java.io.File;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VlC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C807000VlC {
    public static final C807000VlC LIZ = new C807000VlC();
    public static final AtomicLong LIZIZ = new AtomicLong(SystemClock.uptimeMillis());

    public static String LIZ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('_');
        sbLIZ.append(LIZIZ.incrementAndGet());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static long LIZIZ(String str) {
        boolean z;
        File[] fileArrListFiles;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return 0L;
        }
        C0VSJ c0vsj = new C0VSJ(str);
        if (!c0vsj.exists()) {
            return 0L;
        }
        long length = c0vsj.length();
        if (c0vsj.isDirectory() && (fileArrListFiles = c0vsj.listFiles()) != null) {
            C089E c089e = new C089E(fileArrListFiles);
            while (c089e.hasNext()) {
                try {
                    length += LIZIZ(((File) c089e.next()).getAbsolutePath());
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    return 0L;
                }
            }
        }
        return length;
    }

    public static void LIZLLL(JSONObject jSONObject) {
        AppLogNewUtils.onEventV3("tt_network_metric", jSONObject);
    }

    public static EnumC807010VlD LJ(EnumC807060VlI enumC807060VlI) {
        int i = C807070VlJ.LIZ[enumC807060VlI.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return EnumC807010VlD.UNKNOWN_LOG;
                        }
                        return EnumC807010VlD.ALOG;
                    }
                    return EnumC807010VlD.APM_EVENT_LOG;
                }
                return EnumC807010VlD.APM_NET_API_LOG;
            }
            return EnumC807010VlD.APP_LOG;
        }
        return EnumC807010VlD.ORIGIN_LOG;
    }

    public static boolean LIZJ(String str, List list) {
        if (!ReDexExperimentOpt.getAbTest()) {
            return LIZJ$redex$base(str, list);
        }
        return LIZJ$redex$opt(str, list);
    }

    private static boolean LIZJ$redex$base(String str, List list) {
        if (list == null || str == null) {
            return false;
        }
        if (list.size() == 1 && Intrinsics.LJFF(ListProtector.get(list, 0), "*")) {
            return true;
        }
        for (Object obj : list) {
            if (u.LJJIIJZLJL(str, (String) obj, false)) {
                if (obj == null) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    private static boolean LIZJ$redex$opt(String str, List list) {
        if (list == null || str == null) {
            return false;
        }
        if (list.size() == 1 && Intrinsics.LJFF(ListProtector.get(list, 0), "*")) {
            return true;
        }
        int i = 0;
        int size = list.size();
        while (i < size) {
            Object obj = list.get(i);
            i++;
            if (u.LJJIIJZLJL(str, (String) obj, false)) {
                if (obj == null) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }
}
