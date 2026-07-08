package X;

import com.ss.android.ugc.feed.platform.ab.NarrowScreenOptConfig;

/* JADX INFO: renamed from: X.0RIl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C693570RIl {
    public static final NarrowScreenOptConfig LIZ = new NarrowScreenOptConfig(0, 100, false);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C693580RIm());
    public static final NarrowScreenOptConfig LIZJ = new NarrowScreenOptConfig(0, 100, false);

    public static final boolean LIZ() {
        NarrowScreenOptConfig narrowScreenOptConfig = (NarrowScreenOptConfig) LIZIZ.getValue();
        if (narrowScreenOptConfig == null) {
            narrowScreenOptConfig = LIZJ;
        }
        int i = narrowScreenOptConfig.adaptionTarget;
        NarrowScreenOptConfig.Companion.getClass();
        return i > NarrowScreenOptConfig.NONE_ADAPTION;
    }

    public static final boolean LIZIZ() {
        NarrowScreenOptConfig narrowScreenOptConfig = (NarrowScreenOptConfig) LIZIZ.getValue();
        return narrowScreenOptConfig != null && narrowScreenOptConfig.adaptionNarrowScreenFont;
    }

    public static final boolean LIZJ(int i) {
        NarrowScreenOptConfig narrowScreenOptConfig = (NarrowScreenOptConfig) LIZIZ.getValue();
        if (narrowScreenOptConfig == null) {
            narrowScreenOptConfig = LIZJ;
        }
        int i2 = narrowScreenOptConfig.adaptionTarget;
        NarrowScreenOptConfig.Companion.getClass();
        if (i2 == NarrowScreenOptConfig.NONE_ADAPTION) {
            return false;
        }
        int i3 = narrowScreenOptConfig.adaptionTarget;
        if (i3 == NarrowScreenOptConfig.ALL_DEVICE) {
            return true;
        }
        if (i3 != NarrowScreenOptConfig.ONLY_NARROW || (i != 1 && i != 3)) {
            return false;
        }
        return true;
    }
}
