package X;

import com.ss.android.ugc.aweme.ecommerce.core.ab.OSPPreloadSettingConfig;
import kotlin.jvm.internal.AFwS185S0000000_1;

/* JADX INFO: renamed from: X.03RU, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03RU {
    public static final OSPPreloadSettingConfig LIZ = new OSPPreloadSettingConfig(3, 0, 10, Boolean.TRUE, Boolean.TRUE, Boolean.TRUE);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS185S0000000_1.get$arr$(360));

    public static OSPPreloadSettingConfig LIZIZ() {
        return (OSPPreloadSettingConfig) LIZIZ.getValue();
    }

    public static boolean LIZ() {
        Boolean bool = LIZIZ().enableJsbPreload;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }
}
