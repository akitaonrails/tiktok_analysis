package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.preloader.model.ECPreloadEntry;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1Dzl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2274111Dzl extends C09AY implements Function0<ECPreloadEntry[]> {
    public C2274111Dzl() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final ECPreloadEntry[] invoke() {
        ECPreloadEntry[] eCPreloadEntryArr;
        try {
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            eCPreloadEntryArr = C2274141Dzo.LIZ;
            ECPreloadEntry[] eCPreloadEntryArr2 = (ECPreloadEntry[]) settingsManagerLIZLLL.LJIIIIZZ("ec_common_preload_entry_list_ext5", ECPreloadEntry[].class, eCPreloadEntryArr);
            if (eCPreloadEntryArr2 != null) {
                eCPreloadEntryArr = eCPreloadEntryArr2;
            }
        } catch (ClassCastException e) {
            TryCatchGuardChecker.doCheck(e);
            eCPreloadEntryArr = C2274141Dzo.LIZ;
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            eCPreloadEntryArr = C2274141Dzo.LIZ;
        }
        for (ECPreloadEntry eCPreloadEntry : eCPreloadEntryArr) {
            eCPreloadEntry.LIZ();
        }
        return eCPreloadEntryArr;
    }
}
