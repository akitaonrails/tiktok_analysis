package X;

import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.Set;

/* JADX INFO: renamed from: X.0iud, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1260730iud {
    public static final Set<String> LIZ;
    public static final String LIZIZ;

    static {
        C323580CmK c323580CmK = new C323580CmK(2);
        c323580CmK.LIZ("US");
        C19315910hZ.LIZ.getClass();
        c323580CmK.LIZIZ(C19315910hZ.LJIIIIZZ.toArray(new String[0]));
        LIZ = C13LQ.LJLIIL(c323580CmK.LIZLLL(new String[c323580CmK.LIZJ()]));
        LIZIZ = ((IAccountService) ServiceManager.get().getService(IAccountService.class)).getStoreRegionUpperCase();
    }
}
