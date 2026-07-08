package X;

import com.ss.android.common.lib.AppLogNewUtils;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0TAa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class RunnableC742340TAa implements Runnable {
    public static boolean LLILLL;
    public final String LL;
    public final JSONObject LLILLJJLI;

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("SearchMobRefactorLancet$OnEventV3ByConstParamsLancetRunnable@562c.run");
        try {
            LLILLL = true;
            AppLogNewUtils.LJFF(this.LL, this.LLILLJJLI);
        } finally {
            try {
            } finally {
                if (!zLIZ) {
                }
            }
        }
        C1C7U.LIZIZ("SearchMobRefactorLancet$OnEventV3ByConstParamsLancetRunnable@562c.run");
    }

    public RunnableC742340TAa(String str, JSONObject jSONObject) {
        this.LL = str;
        this.LLILLJJLI = jSONObject;
    }
}
