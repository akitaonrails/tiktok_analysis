package X;

import com.ss.android.common.lib.AppLogNewUtils;
import java.util.Map;

/* JADX INFO: renamed from: X.0TAZ, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public class C0TAZ implements Runnable {
    public static boolean LLILLL;
    public final String LL;
    public final Map<String, String> LLILLJJLI;

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("SearchMobRefactorLancet$OnAppLogNewUtilsEventV3MapLancetRunnable@fd7d.run");
        try {
            LLILLL = true;
            AppLogNewUtils.LJI(this.LL, this.LLILLJJLI);
        } finally {
            try {
            } finally {
                if (!zLIZ) {
                }
            }
        }
        C1C7U.LIZIZ("SearchMobRefactorLancet$OnAppLogNewUtilsEventV3MapLancetRunnable@fd7d.run");
    }

    public C0TAZ(String str, Map<String, String> map) {
        this.LL = str;
        this.LLILLJJLI = map;
    }
}
