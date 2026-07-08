package X;

import com.ss.android.ugc.aweme.music.ab.MusicDetailAutoPlayConfig;
import kotlin.jvm.internal.AFwS195S0000000_9;

/* JADX INFO: renamed from: X.0OlI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C628700OlI {
    public static final MusicDetailAutoPlayConfig LIZ = new MusicDetailAutoPlayConfig(false, 0, false, false, false);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(483));

    public static MusicDetailAutoPlayConfig LIZ() {
        return (MusicDetailAutoPlayConfig) LIZIZ.getValue();
    }

    public static final boolean LIZIZ() {
        return LIZ().musicCoverDesign != 0;
    }

    public static final boolean LIZJ() {
        return LIZ().musicCoverDesign == 1;
    }
}
