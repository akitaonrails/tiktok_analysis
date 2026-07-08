package X;

import Y.ARunnableS92S0000000_13;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.HashSet;

/* JADX INFO: renamed from: X.0WI0, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WI0 {
    public static boolean LIZJ;
    public static final C0WI0 LIZ = new C0WI0();
    public static final BPEAHandler LIZIZ = new BPEAHandler(Looper.getMainLooper());
    public static final HashSet<String> LIZLLL = new HashSet<>();
    public static final ARunnableS92S0000000_13 LJ = new ARunnableS92S0000000_13(52);

    public static void LIZ(C0WI1 c0wi1) {
        LIZJ = true;
        LIZIZ.removeCallbacks(LJ);
        C0WI2 c0wi2 = new C0WI2();
        c0wi2.LIZIZ("share_sdk_read_result");
        c0wi2.LIZ(Boolean.valueOf(c0wi1.LIZIZ), "is_succ");
        c0wi2.LIZ(c0wi1.LIZJ, "err_msg");
        c0wi2.LIZ(Integer.valueOf(c0wi1.LIZLLL), "query_type");
        c0wi2.LIZ(c0wi1.LIZ, "pkg_name");
        c0wi2.LIZJ();
    }

    public static void LIZIZ(C0WI1 c0wi1) {
        if (LIZJ) {
            return;
        }
        HashSet<String> hashSet = LIZLLL;
        hashSet.remove(c0wi1.LIZ);
        if (c0wi1.LIZIZ && !TextUtils.isEmpty(c0wi1.LJFF)) {
            LIZ(c0wi1);
        } else if (TextUtils.isEmpty(c0wi1.LIZ)) {
            LIZ(c0wi1);
        } else if (hashSet.isEmpty()) {
            LIZ(c0wi1);
        }
    }
}
