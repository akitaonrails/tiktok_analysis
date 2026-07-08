package X;

import Y.ARunnableS120S0100000_20;
import Y.ARunnableS21S1100000_16;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;

/* JADX INFO: renamed from: X.0kay, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1325420kay {
    public static void LIZ(String str) {
        C1332160klq c1332160klqLJIIIZ = C1332160klq.LJIIIZ();
        if (c1332160klqLJIIIZ.LIZIZ.LJJIJIIJIL.LIZ() != null && ((Boolean) c1332160klqLJIIIZ.LIZIZ.LJJIJIIJIL.LIZ()).booleanValue() && Looper.getMainLooper() == Looper.myLooper()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(".   Any question please contact @weixin.gary");
            throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static boolean LIZIZ(String str) {
        LIZ("isImageDownloaded may cause ANR,use isImageDownloadedAsync or call it in Non-UI Thread");
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return C1331660kl2.LIZJ().LJIIIZ(UriProtector.parse(str));
    }

    public static void LIZLLL(Runnable runnable) {
        C0STY.LIZ.execute(runnable);
    }

    public static void LIZJ(InterfaceC442640HXi interfaceC442640HXi, String str) {
        if (TextUtils.isEmpty(str)) {
            LIZLLL(new ARunnableS120S0100000_20(interfaceC442640HXi, 392));
        }
        C823050WQl.LIZLLL().execute(new ARunnableS21S1100000_16(interfaceC442640HXi, str, 10));
    }
}
