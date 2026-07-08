package X;

import android.view.View;
import android.widget.ImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS586S0100000_7;
import kotlin.jvm.internal.AwS621S0100000_7;
import kotlin.jvm.internal.AwS656S0100000_7;

/* JADX INFO: renamed from: X.0K3x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C511430K3x {
    public static final C511430K3x LIZ = new C511430K3x();

    public static C0K77 LJ() {
        Object c098200Yq;
        try {
            ILiveOuterService iLiveOuterService = (ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class);
            c098200Yq = iLiveOuterService != null ? iLiveOuterService.C3() : null;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        return (C0K77) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq);
    }

    public static String LIZ(String str) {
        C0K77 c0k77LJ = LJ();
        if (c0k77LJ != null) {
            return c0k77LJ.LJJJJZ(str);
        }
        return null;
    }

    public static void LIZJ(Object obj, String str) {
        View view;
        C0K77 c0k77LJ;
        if ((obj instanceof View) && (view = (View) obj) != null && (c0k77LJ = LJ()) != null) {
            c0k77LJ.LJJJJ(view, str, null, true);
        }
    }

    public static void LIZLLL(Object obj, String str, String str2) {
        View view;
        C0K77 c0k77LJ;
        if ((obj instanceof View) && (view = (View) obj) != null && (c0k77LJ = LJ()) != null) {
            c0k77LJ.LJJIL(view, str, str2, null, null);
        }
    }

    public static void LIZIZ(C417410GYh c417410GYh, String str, String str2, ImageView.ScaleType scaleType, C0K6Y c0k6y) {
        C0K77 c0k77LJ;
        boolean z = c417410GYh instanceof View;
        C0K42 c0k42 = null;
        if (z && c417410GYh != null && (c0k77LJ = LJ()) != null) {
            if (c0k6y != null) {
                c0k42 = new C0K42(new AwS551S0100000_7(c0k6y, 792), new AwS656S0100000_7(c0k6y, 6), new AwS621S0100000_7(c0k6y, 114), new AwS586S0100000_7((C0K4P) c0k6y, 545));
            }
            c0k77LJ.LJJIL(c417410GYh, str, str2, scaleType, c0k42);
        }
    }
}
