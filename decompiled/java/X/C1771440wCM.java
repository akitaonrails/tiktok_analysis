package X;

import com.ss.android.ugc.aweme.ecommerce.mixmall.settings.EcMixMallLoadConfig;
import kotlin.jvm.internal.AFwS215S0000000_26;

/* JADX INFO: renamed from: X.0wCM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1771440wCM {
    public static final EcMixMallLoadConfig LIZ = new EcMixMallLoadConfig(5, 2000, 1, 1, 200, 4, 100, 1, 1, 1, 1, 0, 1, 1, 1, 0);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(342));

    public static EcMixMallLoadConfig LIZLLL() {
        return (EcMixMallLoadConfig) LIZIZ.getValue();
    }

    public static boolean LIZ() {
        Integer num = LIZLLL().livePosterOpt;
        return num != null && num.intValue() == 1;
    }

    public static boolean LIZIZ() {
        Integer num = LIZLLL().enableNativeGenerateTdi;
        return num != null && num.intValue() == 1;
    }

    public static boolean LIZJ() {
        Integer num = LIZLLL().playerOpt;
        return num != null && num.intValue() == 1;
    }

    public static boolean LJ() {
        Integer num = LIZLLL().scrollPlay;
        return num != null && num.intValue() == 1;
    }
}
