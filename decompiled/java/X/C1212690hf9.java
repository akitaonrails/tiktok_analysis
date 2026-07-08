package X;

import com.ss.android.ugc.aweme.im.common.setting.DMAvatarLoadConfig;
import kotlin.jvm.internal.AFwS207S0000000_19;

/* JADX INFO: renamed from: X.0hf9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1212690hf9 {
    public static final C1212690hf9 LIZ = new C1212690hf9();
    public static final DMAvatarLoadConfig LIZIZ = new DMAvatarLoadConfig(5, 5, false, false);
    public static final C01GW LIZJ;
    public static final C01GW LIZLLL;
    public static final C01GW LJ;
    public static final boolean LJFF;
    public static final boolean LJI;

    static {
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(8));
        LIZJ = c01gwLIZIZ;
        LIZLLL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(9));
        LJ = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(10));
        LJFF = ((DMAvatarLoadConfig) c01gwLIZIZ.getValue()).useStrictUri;
        LJI = ((DMAvatarLoadConfig) c01gwLIZIZ.getValue()).useEmptyPlaceholder;
    }
}
