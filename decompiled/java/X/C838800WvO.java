package X;

import android.text.TextUtils;
import android.webkit.CookieManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0WvO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C838800WvO {
    public static InterfaceC838870WvV LIZ;

    public static InterfaceC838870WvV LIZ() {
        if (LIZ == null) {
            synchronized (C838800WvO.class) {
                try {
                    if (LIZ == null) {
                        try {
                            LIZ = (InterfaceC838870WvV) Class.forName("com.bytedance.sdk.account.adapter.bpea.AccountSdkBpeaAdapter").newInstance();
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZ;
    }

    public static Object LIZIZ(Object... objArr) throws C838820WvQ {
        boolean z;
        if (TextUtils.isEmpty("CookieManager") || TextUtils.isEmpty("getCookie")) {
            return null;
        }
        if (LIZ() != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return LIZ().LIZ();
        }
        try {
            CookieManager cookieManagerA2 = C786410Ut5.A2();
            if (cookieManagerA2 != null) {
                return C2204961BRm.LLIZ(cookieManagerA2, (String) objArr[0], new C0WZX("dzBzEgAjS8/YVFkiQFyXYrVAyWIUdI6xHarJswOCYEKX2n/zQJkz3A8L", null));
            }
            throw new C838820WvQ("directInvoke, cookieManager == null");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!(th instanceof C838820WvQ)) {
                throw new C838820WvQ("directInvoke exception", th);
            }
            throw th;
        }
    }
}
