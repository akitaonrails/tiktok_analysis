package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommerce.preloader.model.ECPreloadEntry;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.08Wr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2131508Wr extends C09AY implements Function0<ECPreloadEntry[]> {
    public C2131508Wr() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final ECPreloadEntry[] invoke() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        ECPreloadEntry[] eCPreloadEntryArr = C2131308Wp.LIZ;
        ECPreloadEntry[] eCPreloadEntryArr2 = (ECPreloadEntry[]) settingsManagerLIZLLL.LJIIIIZZ("ec_common_preload_entry_list", ECPreloadEntry[].class, eCPreloadEntryArr);
        if (eCPreloadEntryArr2 != null) {
            eCPreloadEntryArr = eCPreloadEntryArr2;
        }
        for (ECPreloadEntry eCPreloadEntry : eCPreloadEntryArr) {
            eCPreloadEntry.LIZ();
        }
        return eCPreloadEntryArr;
    }
}
