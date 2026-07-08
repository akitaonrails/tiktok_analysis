package X;

import com.ss.android.ugc.aweme.series.feed.tab.feed.MiniDramaTabPreloadTaskConfigModel;
import kotlin.jvm.internal.AFwS206S0000000_18;

/* JADX INFO: renamed from: X.0gAb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1155310gAb {
    public static final C1155310gAb LIZ = new C1155310gAb();
    public static final MiniDramaTabPreloadTaskConfigModel LIZIZ;
    public static final C01GW LIZJ;

    static {
        Boolean bool = Boolean.FALSE;
        LIZIZ = new MiniDramaTabPreloadTaskConfigModel(0, 0, 3000L, bool, bool);
        LIZJ = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(5));
    }

    public static int LIZ() {
        int iIntValue;
        Integer num = ((MiniDramaTabPreloadTaskConfigModel) LIZJ.getValue()).networkRetryCount;
        if (num == null || (iIntValue = num.intValue()) < 0) {
            return 0;
        }
        return iIntValue;
    }

    public static long LIZIZ() {
        Long l = ((MiniDramaTabPreloadTaskConfigModel) LIZJ.getValue()).networkRetryDelayMs;
        if (l == null) {
            return 3000L;
        }
        long jLongValue = l.longValue();
        if (jLongValue < 0) {
            return 0L;
        }
        return jLongValue;
    }

    public static boolean LIZJ() {
        Boolean bool = ((MiniDramaTabPreloadTaskConfigModel) LIZJ.getValue()).offlinePlayEnable;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }
}
