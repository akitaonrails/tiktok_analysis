package X;

import android.content.Context;
import android.os.Build;
import android.util.LruCache;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Locale;

/* JADX INFO: renamed from: X.0Wv2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C838580Wv2 {
    public static String LIZ(Context context) {
        Locale locale;
        if (context == null) {
            return "zh-CN";
        }
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                locale = context.getResources().getConfiguration().getLocales().get(0);
            } else {
                locale = context.getResources().getConfiguration().locale;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(C786410Ut5.t2(locale));
            sbLIZ.append("-");
            LruCache<Integer, String> lruCache = C0SRQ.LIZ;
            sbLIZ.append(C837920Wty.LIZIZ(locale));
            return C2188811AlT.LIZIZ(sbLIZ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "zh-CN";
        }
    }
}
