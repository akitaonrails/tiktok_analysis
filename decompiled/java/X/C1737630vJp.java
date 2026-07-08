package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.effectcreator.IEffectCreatorService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;

/* JADX INFO: renamed from: X.0vJp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1737630vJp {
    public static final InterfaceC1737080vIw LIZ() {
        InterfaceC1737080vIw interfaceC1737080vIwLIZLLL = null;
        try {
            IEffectCreatorService iEffectCreatorService = (IEffectCreatorService) PluggableExtentionKt.pluggableSpi$default(IEffectCreatorService.class, false, false, false, 14, null);
            if (iEffectCreatorService != null) {
                interfaceC1737080vIwLIZLLL = iEffectCreatorService.LIZLLL();
                return interfaceC1737080vIwLIZLLL;
            }
        } catch (NoClassDefFoundError e) {
            TryCatchGuardChecker.doCheck(e);
            e.printStackTrace();
        }
        return interfaceC1737080vIwLIZLLL;
    }
}
