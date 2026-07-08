package X;

import com.ss.android.ugc.aweme.story.experiment.MineStoryDiskCacheConfig;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: renamed from: X.06Ub, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1615106Ub {
    public static final MineStoryDiskCacheConfig LIZ = new MineStoryDiskCacheConfig(false, true, true, 0, 1000, false, false);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(1033));

    public static MineStoryDiskCacheConfig LIZ() {
        return (MineStoryDiskCacheConfig) LIZIZ.getValue();
    }

    public static final boolean LIZIZ() {
        return LIZ().enable;
    }

    public static final boolean LIZJ() {
        return LIZ().enable && LIZ().enableFull;
    }

    public static final boolean LIZLLL() {
        return LIZ().enable && LIZ().enableLight;
    }
}
