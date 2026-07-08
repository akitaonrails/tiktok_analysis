package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IInternalAVService;
import kotlin.jvm.internal.AFwS219S0000000_30;

/* JADX INFO: renamed from: X.13VP, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13VP {
    public static volatile boolean LIZIZ;
    public static final C13VP LIZ = new C13VP();
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(219));

    public static boolean LIZ() {
        return !((IInternalAVService) ServiceManager.get().getService(IInternalAVService.class)).isPublishing(null) && (((Number) LIZJ.getValue()).intValue() & 1) == 1;
    }

    public static boolean LIZIZ() {
        return !((IInternalAVService) ServiceManager.get().getService(IInternalAVService.class)).isPublishing(null) && (((Number) C274590ApV.LIZ.getValue()).intValue() & 2) == 2;
    }
}
