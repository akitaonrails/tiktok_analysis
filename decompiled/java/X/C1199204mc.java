package X;

import android.os.SystemClock;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.ecommerce.dependency.storage.StorageDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.storage.IStorageDependencyService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.04mc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1199204mc extends C09AY implements Function0<Boolean> {
    public C1199204mc() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        AnonymousClass0317 anonymousClass0317CreateIStorageDependencyServicebyMonsterPlugin;
        boolean z = true;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIStorageDependencyServicebyMonsterPlugin = StorageDependencyService.createIStorageDependencyServicebyMonsterPlugin(false);
            C1AQS.LIZJ(jElapsedRealtime, 1, IStorageDependencyService.class.getName(), anonymousClass0317CreateIStorageDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateIStorageDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateIStorageDependencyServicebyMonsterPlugin != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIStorageDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IStorageDependencyService.class);
        }
        EnumC1335310kqv storageState = ((IStorageDependencyService) anonymousClass0317CreateIStorageDependencyServicebyMonsterPlugin).getStorageState();
        if (!C1199304md.LIZIZ.enable) {
            z = false;
        } else if (storageState == EnumC1335310kqv.EXTREME_LOW || storageState == EnumC1335310kqv.ULTRA_LOW || storageState == EnumC1335310kqv.LOW) {
            z = Keva.getRepo("ecom_image_repo").getBoolean("has_used_ecom_disk", false);
            if (z) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("cache low ecom ");
                sbLIZ.append(storageState);
                C2188811AlT.LIZIZ(sbLIZ);
            } else {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("cache main ");
                sbLIZ2.append(storageState);
                C2188811AlT.LIZIZ(sbLIZ2);
            }
        }
        return Boolean.valueOf(z);
    }
}
