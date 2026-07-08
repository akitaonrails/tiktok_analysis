package X;

import com.ss.android.ugc.aweme.settings.GlipAnchorsConfig;

/* JADX INFO: renamed from: X.04me, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1199404me {
    public static final GlipAnchorsConfig LIZ;

    static {
        GlipAnchorsConfig glipAnchorsConfig = new GlipAnchorsConfig(false, null, 3, null);
        GlipAnchorsConfig glipAnchorsConfig2 = (GlipAnchorsConfig) C0C64.LJIILLIIL().LJJII(GlipAnchorsConfig.class, glipAnchorsConfig, "live_glip_anchor_event_track_config", true);
        if (glipAnchorsConfig2 != null) {
            glipAnchorsConfig = glipAnchorsConfig2;
        }
        LIZ = glipAnchorsConfig;
    }

    public static boolean LIZ(int[] iArr) {
        if (!LIZ.enable) {
            return false;
        }
        for (int i : iArr) {
            if (LIZ.anchorsList.contains(Integer.valueOf(i))) {
                return true;
            }
        }
        return false;
    }
}
