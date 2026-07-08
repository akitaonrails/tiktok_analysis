package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.1BNX, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BNX {
    public static final String LIZ;

    static {
        String strLIZIZ;
        Context context = C1542560qFC.LIZ;
        String str = null;
        if (context != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            try {
                strLIZIZ = C08KH.LIZIZ(context.getResources().openRawResource(R.raw.pia_worker_polyfill), "");
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1BPP.LIZIZ("[Worker] load worker polyfill error:", th);
                strLIZIZ = null;
            }
            C1BPP.LJ("[Worker] load worker polyfill success, cost: " + (System.currentTimeMillis() - jCurrentTimeMillis));
            if (!TextUtils.isEmpty(strLIZIZ)) {
                str = strLIZIZ;
            }
        }
        LIZ = str;
    }
}
