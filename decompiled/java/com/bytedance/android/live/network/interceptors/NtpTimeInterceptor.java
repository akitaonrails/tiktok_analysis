package com.bytedance.android.live.network.interceptors;

import X.C080U;
import X.C0X52;
import X.C1494590ozp;
import X.C963140bAe;
import X.C974520bT0;
import X.InterfaceC1904907d9;
import X.InterfaceC841770X0l;
import android.os.SystemClock;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import kotlin.text.u;

/* JADX INFO: loaded from: classes4.dex */
public final class NtpTimeInterceptor implements InterfaceC1904907d9 {
    @Override // X.InterfaceC1904907d9
    public final C0X52<?> intercept(InterfaceC841770X0l interfaceC841770X0l) {
        String str;
        long j;
        long j2;
        String path;
        String path2;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        System.currentTimeMillis();
        Request request = ((C1494590ozp) interfaceC841770X0l).LIZJ;
        C0X52<?> c0x52LIZ = ((C1494590ozp) interfaceC841770X0l).LIZ(request);
        try {
            List<C080U> list = c0x52LIZ.LIZ.LIZLLL;
            if (list == null) {
                str = "";
                j = 0;
                j2 = 0;
            } else {
                str = "";
                j = 0;
                j2 = 0;
                for (C080U c080u : list) {
                    String str2 = c080u.LIZ;
                    String str3 = c080u.LIZIZ;
                    if (u.LJIJI("webcast-ntp-t2", str2, true)) {
                        j = CastLongProtector.parseLong(str3);
                    } else if (u.LJIJI("webcast-ntp-t3", str2, true)) {
                        j2 = CastLongProtector.parseLong(str3);
                    } else if (u.LJIJI("X-Tt-Logid", str2, true)) {
                        str = str3;
                    }
                }
            }
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j3 = ((jElapsedRealtime2 - jElapsedRealtime) - (j2 - j)) / ((long) 2);
            if (j > 0 && j2 > 0) {
                if (request == null || (path2 = request.getPath()) == null) {
                    path2 = "";
                }
                C974520bT0.LIZIZ(j2, j3, path2, str);
            }
            if (j > 0 && j2 > 0 && j3 < 1000) {
                if (request == null || (path = request.getPath()) == null) {
                    path = "";
                }
                C963140bAe.LJIILIIL(j2, jElapsedRealtime2, jCurrentTimeMillis, j3, path);
                return c0x52LIZ;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return c0x52LIZ;
    }
}
