package X;

import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0CVl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C314750CVl {
    public static boolean LIZ;
    public static final ConcurrentHashMap<String, String> LIZIZ = new ConcurrentHashMap<>();

    public static void LIZ() {
        if (LIZ) {
            try {
                LIZIZ.clear();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("clearDiskCacheVisitCountMap mImageLoadDurationMap clear failed! t = ");
                sbLIZ.append(th);
                C1328570kg3.LIZIZ("MemoryCacheUtil", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        if (C314720CVi.LIZIZ) {
            AFwS190S0000000_4 aFwS190S0000000_4 = AFwS190S0000000_4.get$arr$(4019);
            if (Intrinsics.LJFF(Looper.getMainLooper(), Looper.myLooper())) {
                C23250099c.LIZLLL(C817503Hh.LL, null, null, new C319001Lo(aFwS190S0000000_4, null), 3);
            } else {
                aFwS190S0000000_4.invoke();
            }
        }
    }

    public static void LIZIZ(String str) {
        if (LIZ && !TextUtils.isEmpty(str) && str.contains("_uri_end") && str.contains("resizeOption:")) {
            try {
                LIZIZ.remove(str.substring(0, str.indexOf("resizeOption:")));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("removeReuseBitmapCache: Throwable = ");
                sbLIZ.append(th);
                C1328570kg3.LIZIZ("MemoryCacheUtil", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        C314720CVi.LIZIZ(str);
    }
}
