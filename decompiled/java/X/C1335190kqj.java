package X;

import com.ss.android.ugc.aweme.performance.ab.PhotoImageLightenConfig;

/* JADX INFO: renamed from: X.0kqj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1335190kqj {
    public static final PhotoImageLightenConfig LIZ = new PhotoImageLightenConfig(false, 30, 12, false, false, false);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C1335200kqk());
    public static final C01GW LIZJ = C452501pT.LIZIZ(new C1335090kqZ());

    public static final PhotoImageLightenConfig LIZ() {
        return (PhotoImageLightenConfig) LIZIZ.getValue();
    }

    public static final boolean LIZIZ() {
        return ((Boolean) LIZJ.getValue()).booleanValue();
    }

    public static final boolean LIZJ() {
        return LIZIZ() && LIZ().includeExplore;
    }
}
