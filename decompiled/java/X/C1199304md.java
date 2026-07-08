package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.dependency.storage.StorageDependencyService;
import com.ss.android.ugc.aweme.ecommerce.image.EcomImageDiskCacheData;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.storage.IStorageDependencyService;

/* JADX INFO: renamed from: X.04md, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1199304md {
    public static final C1199304md LIZ = new C1199304md();
    public static final EcomImageDiskCacheData LIZIZ;
    public static final C01GW<Boolean> LIZJ;

    static {
        EcomImageDiskCacheData ecomImageDiskCacheData = new EcomImageDiskCacheData(false, 0, 0, 0, 0, null, false, false, false, false, false, null, 4095, null);
        EcomImageDiskCacheData ecomImageDiskCacheData2 = (EcomImageDiskCacheData) C0C64.LJIILLIIL().LJJII(EcomImageDiskCacheData.class, ecomImageDiskCacheData, "ecom_image_disk_cache_exp", true);
        if (ecomImageDiskCacheData2 != null) {
            ecomImageDiskCacheData = ecomImageDiskCacheData2;
        }
        LIZIZ = ecomImageDiskCacheData;
        LIZJ = C452501pT.LIZIZ(new C1199204mc());
    }

    public static long LIZ() {
        AnonymousClass0317 anonymousClass0317CreateIStorageDependencyServicebyMonsterPlugin;
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
        return ((long) ((storageState == EnumC1335310kqv.EXTREME_LOW || storageState == EnumC1335310kqv.ULTRA_LOW || storageState == EnumC1335310kqv.LOW) ? LIZIZ.lowStorageMainSize : LIZIZ.mainDiskSize)) * 1048576;
    }

    public static long LIZIZ() {
        AnonymousClass0317 anonymousClass0317CreateIStorageDependencyServicebyMonsterPlugin;
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
        return ((long) ((storageState == EnumC1335310kqv.EXTREME_LOW || storageState == EnumC1335310kqv.ULTRA_LOW || storageState == EnumC1335310kqv.LOW) ? LIZIZ.lowStorageOperaSize : LIZIZ.operationDiskSize)) * 1048576;
    }
}
