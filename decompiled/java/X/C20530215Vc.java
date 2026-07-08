package X;

import com.ss.android.ugc.aweme.explore.experiment.ExploreWhiteScreenConfig;

/* JADX INFO: renamed from: X.15Vc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20530215Vc {
    public static final ExploreWhiteScreenConfig LIZ = new ExploreWhiteScreenConfig(false, true, true, 500, true, true, 6, true, true, 500, true);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C20530815Vi());

    public static final ExploreWhiteScreenConfig LIZ() {
        return (ExploreWhiteScreenConfig) LIZIZ.getValue();
    }

    public static boolean LIZIZ() {
        return LIZ().isEnable();
    }

    public static boolean LIZJ() {
        return LIZ().isEnable() && LIZ().needLoadBitmap;
    }
}
