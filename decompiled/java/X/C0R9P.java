package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.net.ui.INetworkStandardUIService;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0R9P, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0R9P {
    public static final C0R9P LIZ = new C0R9P();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C297180Bkq());

    public static boolean LIZ() {
        return C1697810uHb.LJIIJJI(1, 2).contains(Integer.valueOf(LIZIZ()));
    }

    public static int LIZIZ() {
        return ((Number) LIZIZ.getValue()).intValue();
    }

    public static final void LIZJ(EnumC1609900rzo enumC1609900rzo) {
        List listLJIIJJI = C1697810uHb.LJIIJJI(1, 2);
        LIZ.getClass();
        if (listLJIIJJI.contains(Integer.valueOf(LIZIZ()))) {
            ((INetworkStandardUIService) ServiceManager.get().getService(INetworkStandardUIService.class)).removeLazyToast(enumC1609900rzo);
        }
    }

    public static void LJ(Function0 function0) {
        if (C1697810uHb.LJIIJJI(1, 2).contains(Integer.valueOf(LIZIZ()))) {
            function0.invoke();
        }
    }

    public static final void LIZLLL(EnumC1609900rzo enumC1609900rzo, C19EG c19eg) {
        List listLJIIJJI = C1697810uHb.LJIIJJI(1, 2);
        LIZ.getClass();
        if (listLJIIJJI.contains(Integer.valueOf(LIZIZ()))) {
            ((INetworkStandardUIService) ServiceManager.get().getService(INetworkStandardUIService.class)).startLazyToast(enumC1609900rzo, c19eg);
        }
    }
}
