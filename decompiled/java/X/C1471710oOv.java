package X;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;

/* JADX INFO: renamed from: X.0oOv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1471710oOv implements InterfaceC1471730oOx {
    public final Context LIZ;
    public int LIZIZ;

    public C1471710oOv(Context context) {
        this.LIZ = context;
    }

    public final long LIZ(C0XLY c0xly) {
        int i;
        String strLIZ;
        C1471720oOw c1471720oOw = (C1471720oOw) this;
        if (c1471720oOw.LIZJ < 4) {
            try {
                NetworkInfo networkInfoLJIJ = C786410Ut5.LJIJ((ConnectivityManager) C786410Ut5.H2(c1471720oOw.LIZ, "connectivity"));
                if (networkInfoLJIJ != null) {
                    if (networkInfoLJIJ.isAvailable()) {
                        c1471720oOw.LIZIZ = c1471720oOw.LIZIZ + 1;
                        long jMin = (long) (Math.min(((long) (1 << r0)) * Mp4ScreenVideoLoadTimeout.CONTROL, 120000L) + (Math.random() * 10.0d * 1000.0d));
                        if (jMin != -1) {
                            c1471720oOw.LIZJ++;
                            if (c0xly != null) {
                                try {
                                    if (!c0xly.LIZIZ() && (((i = c0xly.LLILLL) == 414 || i == 511 || i == 512) && (strLIZ = c0xly.LIZ("Handshake-Options", null)) != null)) {
                                        for (String str : strLIZ.split(";")) {
                                            if (!TextUtils.isEmpty(str)) {
                                                String[] strArrSplit = str.split("=");
                                                if ("reconnect-interval".equals(strArrSplit[0])) {
                                                    try {
                                                        jMin = CastLongProtector.parseLong(strArrSplit[1]);
                                                        jMin *= 1000;
                                                        return jMin;
                                                    } catch (NumberFormatException e) {
                                                        TryCatchGuardChecker.doCheck(e);
                                                    }
                                                } else {
                                                    continue;
                                                }
                                            }
                                        }
                                    }
                                } catch (Exception e2) {
                                    TryCatchGuardChecker.doCheck(e2);
                                }
                            }
                            return jMin;
                        }
                    }
                }
            } catch (Exception e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
        }
        return -1L;
    }
}
