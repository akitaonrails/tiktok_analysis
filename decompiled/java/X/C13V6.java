package X;

import android.content.Context;
import com.ss.android.ugc.aweme.services.superentrance.ISuperEntranceService;
import java.util.List;

/* JADX INFO: renamed from: X.13V6, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13V6 implements ISuperEntranceService {
    public static final C01GW<C13V6> LIZ = C452501pT.LIZIZ(new C13V7());

    @Override // com.ss.android.ugc.aweme.services.superentrance.ISuperEntranceService
    public final boolean isNeedShowSuperEntranceTabDirect() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.services.superentrance.ISuperEntranceService
    public final boolean isSuperEntranceResReady() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.services.superentrance.ISuperEntranceService
    public final void preDownloadSuperEntranceRes(Context context) {
    }

    @Override // com.ss.android.ugc.aweme.services.superentrance.ISuperEntranceService
    public final void setShowedSuperEntranceTab() {
    }

    @Override // com.ss.android.ugc.aweme.services.superentrance.ISuperEntranceService
    public final void setSuperEntranceRecordClicked(Context context, boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.services.superentrance.ISuperEntranceService
    public final boolean shouldShowSuperEntranceRecord(Context context) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.services.superentrance.ISuperEntranceService
    public final List<String> getSuperEntranceEffectList() {
        return C13BV.INSTANCE;
    }
}
