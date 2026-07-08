package X;

import Y.ARunnableS113S0100000_13;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: renamed from: X.0VRt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C797910VRt implements C1BNA {
    public static volatile boolean LL = true;

    @Override // X.C1BNA
    public final void LIZ() {
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (C0XQ7.LJFF() == null || LL) {
            LL = false;
            return;
        }
        if (((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            ComplianceServiceProvider.LJFF().LIZLLL();
        }
        LL = false;
        if (C1827607Du.LJ(AFwS189S0000000_3.get$arr$(1114), C1785006yu.LIZJ())) {
            C823050WQl.LIZIZ().submit(new ARunnableS113S0100000_13(this, 15));
        } else {
            LIZJ();
        }
    }

    @Override // X.C1BNA
    public final void LIZIZ() {
    }

    public static void LIZJ() {
        try {
            C844470XAv.LIZ.getClass();
            NetworkInfo networkInfoLJIJ = C786410Ut5.LJIJ((ConnectivityManager) C786410Ut5.H2(C844470XAv.LIZ(), "connectivity"));
            C804440Vh4 c804440Vh4 = C036E.LIZ;
            c804440Vh4.getClass();
            synchronized (C804440Vh4.class) {
                try {
                    c804440Vh4.LIZ = networkInfoLJIJ;
                    c804440Vh4.LJFF(networkInfoLJIJ);
                } finally {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        } catch (Exception th) {
        }
    }
}
