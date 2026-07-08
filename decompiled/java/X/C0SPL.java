package X;

import com.ss.android.ugc.aweme.feed.experiment.ExpandVideoConfig;

/* JADX INFO: renamed from: X.0SPL, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SPL {
    public static final ExpandVideoConfig LIZ = new ExpandVideoConfig(true, 0);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C0SPK());

    public static final boolean LIZ() {
        ExpandVideoConfig expandVideoConfig = (ExpandVideoConfig) LIZIZ.getValue();
        if (expandVideoConfig == null) {
            expandVideoConfig = LIZ;
        }
        return expandVideoConfig.allowExpandOnVideo;
    }
}
