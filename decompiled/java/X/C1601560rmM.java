package X;

import com.ss.android.ugc.aweme.feed.ab.ConfigModel;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rmM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1601560rmM {
    public static final ConfigModel LIZ = new ConfigModel(Boolean.FALSE, Boolean.FALSE, null, Boolean.TRUE);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C1601570rmN());

    public static ConfigModel LIZIZ() {
        return (ConfigModel) LIZIZ.getValue();
    }

    public static boolean LIZ(int i) {
        ConfigModel configModelLIZIZ;
        List<Integer> list;
        ConfigModel configModelLIZIZ2 = LIZIZ();
        if (configModelLIZIZ2 == null || !Intrinsics.LJFF(configModelLIZIZ2.enable, Boolean.TRUE) || (configModelLIZIZ = LIZIZ()) == null || (list = configModelLIZIZ.whiteList) == null || !list.contains(Integer.valueOf(i))) {
            return false;
        }
        return true;
    }
}
