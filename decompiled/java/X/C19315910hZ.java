package X;

import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: renamed from: X.10hZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19315910hZ {
    public static final C19315910hZ LIZ = new C19315910hZ();
    public static final String LIZIZ;
    public static final String LIZJ;
    public static final Set<String> LIZLLL;
    public static final Set<String> LJ;
    public static final Set<String> LJFF;
    public static final Set<String> LJI;
    public static final Set<String> LJII;
    public static final Set<String> LJIIIIZZ;
    public static final Set<String> LJIIIZ;
    public static final Set<String> LJIIJ;
    public static final Set<String> LJIIJJI;
    public static final Set<String> LJIIL;

    static {
        IAccountService iAccountService = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null);
        LIZIZ = iAccountService != null ? iAccountService.getStoreRegionUpperCase() : null;
        IAccountService iAccountService2 = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null);
        LIZJ = iAccountService2 != null ? iAccountService2.LJIIIIZZ() : null;
        Set<String> setLJLIIL = C13LQ.LJLIIL(new String[]{"AT", "BE", "BG", "CH", "CY", "CZ", "DE", "DK", "EE", "ES", "FI", "FR", "GB", "GR", "HR", "HU", "IE", "IS", "IT", "LI", "LT", "LU", "LV", "MT", "NL", "NO", "PL", "PT", "RO", "SE", "SI", "SK"});
        LIZLLL = setLJLIIL;
        Set<String> setLJLIIL2 = C13LQ.LJLIIL(new String[]{"BR", "MX", "CO", "KR", "AU", "SG", "PH", "JP", "NZ", "EL"});
        LJ = setLJLIIL2;
        Set<String> setLJLIIL3 = C13LQ.LJLIIL(new String[]{"US", "AS", "GU", "MP", "PR", "VI", "UM"});
        LJFF = setLJLIIL3;
        Set<String> setLJLIIL4 = C13LQ.LJLIIL(new String[]{"AT", "BE", "BG", "CH", "CY", "CZ", "DE", "DK", "EE", "ES", "FI", "FR", "GB", "GR", "HR", "HU", "IE", "IS", "IT", "LI", "LT", "LU", "LV", "MT", "NL", "NO", "PL", "PT", "RO", "SE", "SI", "SK", "GP", "GF", "RE", "MQ", "YT", "MF", "NC", "PF", "WF", "TF"});
        LJI = setLJLIIL4;
        Set<String> setSingleton = Collections.singleton("EL");
        LJII = setSingleton;
        Set<String> setLJIIIZ = C15442062u.LJIIIZ(setLJLIIL, setSingleton);
        LJIIIIZZ = setLJIIIZ;
        LJIIIZ = C15442062u.LJIIIIZZ("BR", C15442062u.LJIIIIZZ("US", setLJIIIZ));
        LJIIJ = C13LQ.LJLIIL(new String[]{"FR", "DE", "IT", "HU", "AT"});
        LJIIJJI = C13LQ.LJLIIL(new String[]{"JP", "KR"});
        LJIIL = C15442062u.LJIIIZ(C15442062u.LJIIIZ(setLJLIIL2, setLJLIIL3), setLJLIIL4);
    }

    public static boolean LIZ() {
        return C13LP.LJJJJ(LIZIZ, LJIIIZ);
    }
}
