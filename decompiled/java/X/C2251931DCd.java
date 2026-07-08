package X;

import com.ss.android.ugc.aweme.experiment.consumption.UseRealtimeLiveInteractionConfig;
import kotlin.jvm.internal.AFwS226S0000000_35;

/* JADX INFO: renamed from: X.1DCd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2251931DCd {
    public static final UseRealtimeLiveInteractionConfig LIZ = new UseRealtimeLiveInteractionConfig(false, false, false, false, false, false);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(585));
    public static final boolean LIZJ = LIZ().enableIsLiveFollowed;
    public static final boolean LIZLLL = LIZ().enableIsLiveShared;
    public static final boolean LJ = LIZ().enableIsLiveDisliked;
    public static final boolean LJFF = LIZ().enableIsLiveReported;
    public static final boolean LJI = LIZ().enableIsLiveComment;
    public static final boolean LJII = LIZ().enableIsLiveLike;

    public static UseRealtimeLiveInteractionConfig LIZ() {
        return (UseRealtimeLiveInteractionConfig) LIZIZ.getValue();
    }
}
