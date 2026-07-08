package X;

import android.view.View;
import android.widget.ImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import java.util.List;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS586S0100000_7;
import kotlin.jvm.internal.AwS621S0100000_7;
import kotlin.jvm.internal.AwS656S0100000_7;

/* JADX INFO: renamed from: X.0K3w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C511420K3w {
    public static final C0K4T LJIIJ = new Object() { // from class: X.0K4T
    };
    public Object LIZ;
    public List<String> LIZIZ;
    public Integer LIZJ;
    public Integer LIZLLL;
    public Boolean LJ;
    public Float LJFF;
    public ImageView.ScaleType LJI;
    public Boolean LJII;
    public boolean LJIIIIZZ;
    public C0K4P LJIIIZ;

    public final void LIZ(Object obj) {
        View view;
        Object c098200Yq;
        Float fValueOf;
        C0K42 c0k42 = null;
        if ((obj instanceof View) && (view = (View) obj) != null) {
            try {
                ILiveOuterService iLiveOuterService = (ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class);
                if (iLiveOuterService != null) {
                    c098200Yq = iLiveOuterService.C3();
                } else {
                    c098200Yq = null;
                }
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            C0K77 c0k77 = (C0K77) c098200Yq;
            if (c0k77 == null) {
                return;
            }
            Float f = this.LJFF;
            if (f != null) {
                float fFloatValue = f.floatValue();
                float f2 = view.getResources().getDisplayMetrics().density;
                if (f2 > 0.0f) {
                    fValueOf = Float.valueOf(fFloatValue / f2);
                } else {
                    fValueOf = null;
                }
            } else {
                fValueOf = null;
            }
            try {
                Object obj2 = this.LIZ;
                List<String> list = this.LIZIZ;
                Integer num = this.LIZJ;
                Integer num2 = this.LIZLLL;
                ImageView.ScaleType scaleType = this.LJI;
                Boolean bool = this.LJII;
                Boolean bool2 = this.LJ;
                boolean z = this.LJIIIIZZ;
                C0K4P c0k4p = this.LJIIIZ;
                if (c0k4p != null) {
                    c0k42 = new C0K42(new AwS551S0100000_7(c0k4p, 792), new AwS656S0100000_7(c0k4p, 6), new AwS621S0100000_7(c0k4p, 114), new AwS586S0100000_7(c0k4p, 545));
                }
                C189200o6.m2constructorimpl(Boolean.valueOf(c0k77.LJJJJJ(view, obj2, list, num, num2, scaleType, bool, bool2, fValueOf, z, c0k42)));
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                C189200o6.m2constructorimpl(new C098200Yq(th2));
            }
        }
    }
}
