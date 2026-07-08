package X;

import com.bytedance.android.starship.engine.graph.config.SamplingConfig;

/* JADX INFO: renamed from: X.0k7N, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1307070k7N {
    public static final C01GW LIZ = C452501pT.LIZIZ(new C1307080k7O());

    public static final boolean LIZ(SamplingConfig samplingConfig, String str) {
        Integer numValueOf;
        C054G c054g = C1306520k6U.LIZ;
        C1307940k8m.LIZIZ().isDebug();
        InterfaceC1307110k7R.LIZ.getClass();
        if (samplingConfig != null && (numValueOf = Integer.valueOf(samplingConfig.method)) != null && numValueOf.intValue() == 0) {
            if (C1307100k7Q.LIZIZ.LIZIZ.nextDouble() < samplingConfig.rate) {
                return true;
            }
            return false;
        }
        return false;
    }
}
