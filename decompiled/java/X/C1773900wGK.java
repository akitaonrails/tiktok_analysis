package X;

import com.ss.android.ugc.aweme.ecommerce.memory.EcMemoryOptSettingsModel;

/* JADX INFO: renamed from: X.0wGK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1773900wGK {
    public static final EcMemoryOptSettingsModel LIZ = new EcMemoryOptSettingsModel();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C1773950wGP());

    public static EcMemoryOptSettingsModel LIZLLL() {
        return (EcMemoryOptSettingsModel) LIZIZ.getValue();
    }

    public static boolean LIZ() {
        return LIZLLL().getEnable();
    }

    public static boolean LIZIZ() {
        return LIZ() && LIZLLL().getEnableImageSize();
    }

    public static boolean LIZJ() {
        return LIZ() && LIZLLL().getEnableShopMallCacheOpt();
    }
}
