package X;

import android.view.View;
import com.ss.android.ugc.aweme.feed.model.ad.AdOneStopLandingPageComponentAnimationConfig;

/* JADX INFO: renamed from: X.1DYI, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public abstract class C1DYI<T> implements C1DYA {
    public abstract T LIZIZ(Object obj);

    public abstract C1DY1 LIZJ(View view, C1DYJ<T> c1dyj, InterfaceC2257451DXj interfaceC2257451DXj);

    public abstract boolean LIZLLL(String str);

    @Override // X.C1DYA
    public final C1DY1 LIZ(View view, AdOneStopLandingPageComponentAnimationConfig adOneStopLandingPageComponentAnimationConfig, InterfaceC2257451DXj interfaceC2257451DXj) {
        T tLIZIZ;
        T tLIZIZ2;
        T tLIZIZ3;
        long jLongValue;
        if (!LIZLLL(adOneStopLandingPageComponentAnimationConfig.getProperty())) {
            return null;
        }
        Object value = adOneStopLandingPageComponentAnimationConfig.getValue();
        if (value != null) {
            tLIZIZ = LIZIZ(value);
            if (tLIZIZ != null) {
                return LIZJ(view, new C1DYJ<>(tLIZIZ, null, null, 0L, null), interfaceC2257451DXj);
            }
        } else {
            tLIZIZ = null;
        }
        Object start = adOneStopLandingPageComponentAnimationConfig.getStart();
        if (start != null) {
            tLIZIZ2 = LIZIZ(start);
        } else {
            tLIZIZ2 = null;
        }
        Object end = adOneStopLandingPageComponentAnimationConfig.getEnd();
        if (end == null || (tLIZIZ3 = LIZIZ(end)) == null) {
            return null;
        }
        Long duration = adOneStopLandingPageComponentAnimationConfig.getDuration();
        if (duration != null) {
            jLongValue = duration.longValue();
        } else {
            jLongValue = 0;
        }
        return LIZJ(view, new C1DYJ<>(tLIZIZ, tLIZIZ2, tLIZIZ3, jLongValue, adOneStopLandingPageComponentAnimationConfig.getEasing()), interfaceC2257451DXj);
    }
}
