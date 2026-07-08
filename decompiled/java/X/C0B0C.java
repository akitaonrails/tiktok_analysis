package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.specact.api.ISpecActService;

/* JADX INFO: renamed from: X.0B0C, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0B0C {
    public static final C0B0C LIZ = new C0B0C();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C0B0B());

    public static boolean LIZ() {
        ISpecActService iSpecActService = (ISpecActService) PluggableExtentionKt.pluggableSpi$default(ISpecActService.class, false, false, false, 14, null);
        if (iSpecActService != null) {
            iSpecActService.LJIJ();
        }
        return LIZIZ() != -1;
    }

    public static int LIZIZ() {
        return ((Number) LIZIZ.getValue()).intValue();
    }
}
