package X;

import com.ss.android.storage.AVCreativeCacheCleanTask;
import com.ss.android.storage.PublishedCacheCleanTask;
import com.ss.android.storage.StorageTask;
import com.ss.android.storage.cleaner.ActiveClearLiveStorage;
import com.ss.android.storage.cleaner.AwemeCacheStorageCleaner;
import com.ss.android.storage.cleaner.CTNetCacheStorageCleaner;
import com.ss.android.storage.cleaner.FaqListCacheStorage;
import com.ss.android.storage.cleaner.FeedCacheStorageCleaner;
import com.ss.android.storage.cleaner.FilesDraftStorage;
import com.ss.android.storage.cleaner.FilesDuetStorage;
import com.ss.android.storage.cleaner.FilesMusicDownloadStorage;
import com.ss.android.storage.cleaner.FilesShareStorage;
import com.ss.android.storage.cleaner.FilesVideoPreloadStorage;
import com.ss.android.storage.cleaner.GeckoStorage;
import com.ss.android.storage.cleaner.HybridStorageCleaner;
import com.ss.android.storage.cleaner.LiveGeckoStorage;
import com.ss.android.storage.cleaner.LiveGiftStorage;
import com.ss.android.storage.cleaner.LynxQuickJSStorageCleaner;
import com.ss.android.storage.cleaner.OfflineModeStorage;
import com.ss.android.storage.cleaner.PitayaStorageCleaner;
import com.ss.android.storage.cleaner.TTNetStorageCleaner;
import com.ss.android.storage.cleaner.VideoResourceStorage;
import com.ss.android.storage.cleaner.VideoShareCacheStorageCleanerV2;
import com.ss.android.storage.cleaner.WebViewStorageCleaner;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.legoImpl.task.VideoShareCacheStorage;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.minis.api.IMinisApiService;
import com.ss.android.ugc.aweme.minis.performance.h5.cache.MinisH5ResourceStorageCleaner;
import com.ss.android.ugc.aweme.services.storage.IAVStorageService;
import com.ss.android.ugc.aweme.video.simpreloader.IVideoCacheStorageService;
import com.ss.android.ugc.aweme.video.simpreloader.VideoCacheStorage;
import com.ss.android.ugc.tools.IAiChatFeatureService;
import com.ss.android.ugc.tools.service.AIImagineCacheCleanTask;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS283S0000000_35;

/* JADX INFO: renamed from: X.1E8y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2276581E8y implements InterfaceC2426609f6 {
    public final /* synthetic */ StorageTask LIZ;

    public C2276581E8y(StorageTask storageTask) {
        this.LIZ = storageTask;
    }

    @Override // X.InterfaceC2426609f6
    public final List<InterfaceC345370DgN> getStorageList() {
        InterfaceC2196861AyS interfaceC2196861AySXm;
        MinisH5ResourceStorageCleaner minisH5ResourceStorageCleanerLIZLLL;
        ArrayList<InterfaceC345370DgN> storageList;
        InterfaceC2454409ja cache;
        AIImagineCacheCleanTask aIImagineCacheCleanTaskLIZLLL;
        VideoCacheStorage videoCacheStorageLIZ;
        if (this.LIZ.LL.size() == 0) {
            if (((Boolean) C307280C2s.LIZ.getValue()).booleanValue()) {
                this.LIZ.LL.add(new GeckoStorage());
            }
            this.LIZ.LL.add(new LiveGiftStorage());
            this.LIZ.LL.add(new VideoResourceStorage());
            if (C286930BMl.LIZ()) {
                this.LIZ.LL.add(new AVCreativeCacheCleanTask());
            } else {
                this.LIZ.LL.add(new PublishedCacheCleanTask());
            }
            this.LIZ.LL.add(new LiveGeckoStorage());
            this.LIZ.LL.add(new ActiveClearLiveStorage());
            this.LIZ.LL.add(new OfflineModeStorage());
            this.LIZ.LL.add(new CTNetCacheStorageCleaner());
            this.LIZ.LL.add(new FilesDraftStorage());
            this.LIZ.LL.add(new FilesDuetStorage());
            this.LIZ.LL.add(new FilesMusicDownloadStorage());
            this.LIZ.LL.add(new FilesShareStorage());
            this.LIZ.LL.add(new FilesVideoPreloadStorage());
            IVideoCacheStorageService iVideoCacheStorageService = (IVideoCacheStorageService) PluggableExtentionKt.pluggableSpi$default(IVideoCacheStorageService.class, false, false, false, 14, null);
            if (iVideoCacheStorageService != null && (videoCacheStorageLIZ = iVideoCacheStorageService.LIZ()) != null) {
                this.LIZ.LL.add(videoCacheStorageLIZ);
            }
            this.LIZ.LL.add(new FaqListCacheStorage());
            IAiChatFeatureService iAiChatFeatureService = (IAiChatFeatureService) PluggableExtentionKt.pluggableSpi$default(IAiChatFeatureService.class, false, false, false, 14, null);
            if (iAiChatFeatureService != null && (cache = iAiChatFeatureService.getCache()) != null && (aIImagineCacheCleanTaskLIZLLL = cache.LIZLLL()) != null) {
                this.LIZ.LL.add(aIImagineCacheCleanTaskLIZLLL);
            }
            this.LIZ.LL.addAll(C1E90.LIZIZ.LIZ());
            this.LIZ.LL.addAll(((IAVStorageService) ServiceManager.get().getService(IAVStorageService.class)).getStorageList());
            ILiveOuterService iLiveOuterService = (ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class);
            if (iLiveOuterService != null && (storageList = iLiveOuterService.getStorageList()) != null) {
                this.LIZ.LL.addAll(storageList);
            }
            IMinisApiService iMinisApiService = (IMinisApiService) PluggableExtentionKt.pluggableSpi$default(IMinisApiService.class, false, false, false, 14, null);
            if (iMinisApiService != null && (interfaceC2196861AySXm = iMinisApiService.xm()) != null && (minisH5ResourceStorageCleanerLIZLLL = interfaceC2196861AySXm.LIZLLL()) != null) {
                this.LIZ.LL.add(minisH5ResourceStorageCleanerLIZLLL);
            }
            if (C1336210ksN.LIZ()) {
                this.LIZ.LL.add(new TTNetStorageCleaner());
                this.LIZ.LL.add(new LynxQuickJSStorageCleaner());
                this.LIZ.LL.add(new VideoShareCacheStorageCleanerV2());
                this.LIZ.LL.add(new AwemeCacheStorageCleaner());
                this.LIZ.LL.add(new WebViewStorageCleaner());
                this.LIZ.LL.add(new PitayaStorageCleaner());
                this.LIZ.LL.add(new HybridStorageCleaner());
                if (((Boolean) C2250201D5m.LJIILJJIL.getValue()).booleanValue()) {
                    this.LIZ.LL.add(new FeedCacheStorageCleaner());
                }
                C19719612Di.LJJIIJ(this.LIZ.LL, AFwS283S0000000_35.get$arr$(4), true);
            } else {
                this.LIZ.LL.add(new VideoShareCacheStorage());
            }
        }
        return this.LIZ.LL;
    }
}
