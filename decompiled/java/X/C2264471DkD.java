package X;

import com.ss.android.ugc.aweme.commercialize.ams.adapter.experiment.AppMeasurementMigrateConfig;
import com.ss.android.ugc.aweme.commercialize.ams.di.MeasurementDependencyModules;

/* JADX INFO: renamed from: X.1DkD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2264471DkD {
    public static final C2264471DkD LIZ = new C2264471DkD();
    public static final AppMeasurementMigrateConfig LIZIZ = new AppMeasurementMigrateConfig(0, null, false, false, 0, 31, null);
    public static final C01GW LIZJ = C452501pT.LIZIZ(new C2264521DkI());
    public static final C01GW LIZLLL = C452501pT.LIZIZ(new C2264511DkH());
    public static final C01GW LJ = C452501pT.LIZIZ(new C2264531DkJ());
    public static final C01GW LJFF = C452501pT.LIZIZ(new C2264461DkC());
    public static final C01GW LJI = C452501pT.LIZIZ(new C2264541DkK());
    public static final C01GW LJII = C452501pT.LIZIZ(new C1018520cby());
    public static final C01GW LJIIIIZZ = C452501pT.LIZIZ(new C2264491DkF());
    public static final C01GW LJIIIZ = C452501pT.LIZIZ(new C2264501DkG());
    public static final C01GW LJIIJ = C452501pT.LIZIZ(new C2264481DkE());

    static {
        MeasurementDependencyModules.LIZ.getClass();
        C04TF.LIZ().isDebug();
    }

    public static AppMeasurementMigrateConfig LIZ() {
        return (AppMeasurementMigrateConfig) LIZJ.getValue();
    }

    public static int LIZIZ() {
        return ((Number) LIZLLL.getValue()).intValue();
    }

    public static final boolean LIZJ() {
        return ((Boolean) LJFF.getValue()).booleanValue();
    }

    public static final boolean LJ() {
        return ((Boolean) LJ.getValue()).booleanValue();
    }

    public static final boolean LJFF() {
        return ((Boolean) LJI.getValue()).booleanValue();
    }

    public static final boolean LIZLLL(String str) {
        if (((Boolean) LJII.getValue()).booleanValue()) {
            LIZ.getClass();
            if (LIZ().migratePageTypes.contains(str)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
