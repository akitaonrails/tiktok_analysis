package X;

import com.ss.android.ugc.aweme.internalshare.api.experiment.QuickShareButtonConfig;

/* JADX INFO: renamed from: X.0cEm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1004140cEm {
    public static final C1004140cEm LIZ = new C1004140cEm();
    public static final QuickShareButtonConfig LIZIZ = new QuickShareButtonConfig(0, 0, 0, 1, 16000, 1, 1, 0, 500);
    public static final C01GW LIZJ;

    static {
        new QuickShareButtonConfig(1, 1, 1, 1, 16000, 1, 1, 1, 500L);
        LIZJ = C452501pT.LIZIZ(new C1004150cEn());
    }

    public static QuickShareButtonConfig LIZ() {
        return (QuickShareButtonConfig) LIZJ.getValue();
    }

    public static boolean LIZIZ() {
        return LIZ().reverseExternalShare == 1;
    }
}
