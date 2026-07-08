package X;

import com.ss.android.ugc.aweme.shortvideo.edit.audioedit.common.vc.VCOptConfig;
import kotlin.jvm.internal.AFwS210S0000000_22;

/* JADX INFO: renamed from: X.0o7o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1461100o7o {
    public static final VCOptConfig LIZ = new VCOptConfig(2, 44100, 128000);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(346));

    public static final VCOptConfig LIZ() {
        return (VCOptConfig) LIZIZ.getValue();
    }

    public static boolean LIZIZ() {
        return LIZ().sampleRate > 0 && LIZ().bitRate > 0 && LIZ().channels > 0;
    }
}
