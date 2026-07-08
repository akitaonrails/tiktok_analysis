package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.commercialize.download.depend.DownloadConfigDepend;
import com.ss.android.ugc.aweme.commercialize.download.depend.DownloadMonitorLogSender;
import com.ss.android.ugc.aweme.download.component_api.depend.IDownloadSdkMonitorDepend;
import com.ss.android.ugc.aweme.download.component_api.service.IDownloadService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.1B8w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2200121B8w {
    public static final AtomicBoolean LIZ = new AtomicBoolean(false);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.0VX7] */
    public static void LIZ(Context context) {
        IDownloadService iDownloadService;
        AtomicBoolean atomicBoolean = LIZ;
        if (atomicBoolean.get()) {
            return;
        }
        synchronized (atomicBoolean) {
            try {
                if (atomicBoolean.compareAndSet(false, true) && (iDownloadService = (IDownloadService) ServiceManager.get().getService(IDownloadService.class)) != 0) {
                    iDownloadService.LIZ(context, new DownloadMonitorLogSender(), new DownloadConfigDepend());
                    if (C2162308dZ.LJI(context)) {
                        iDownloadService.LIZIZ(new IDownloadSdkMonitorDepend() { // from class: X.0VX7
                            @Override // com.ss.android.ugc.aweme.download.component_api.depend.IDownloadSdkMonitorDepend
                            public final String getAppVersionName() {
                                C844470XAv.LIZ.getClass();
                                return C844470XAv.LIZJ();
                            }

                            @Override // com.ss.android.ugc.aweme.download.component_api.depend.IDownloadSdkMonitorDepend
                            public final String getChannel() {
                                C844470XAv.LIZ.getClass();
                                return C844470XAv.LJIILL;
                            }

                            @Override // com.ss.android.ugc.aweme.download.component_api.depend.IDownloadSdkMonitorDepend
                            public final Context getContext() {
                                C844470XAv.LIZ.getClass();
                                return C844470XAv.LIZ();
                            }

                            @Override // com.ss.android.ugc.aweme.download.component_api.depend.IDownloadSdkMonitorDepend
                            public final String getPackageName() {
                                C844470XAv.LIZ.getClass();
                                return C844470XAv.LIZ().getPackageName();
                            }

                            @Override // com.ss.android.ugc.aweme.download.component_api.depend.IDownloadSdkMonitorDepend
                            public final long getUpdateVersionCode() {
                                C844470XAv.LIZ.getClass();
                                return C844470XAv.LIZLLL();
                            }

                            @Override // com.ss.android.ugc.aweme.download.component_api.depend.IDownloadSdkMonitorDepend
                            public final String getAid() {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("");
                                C844470XAv.LIZ.getClass();
                                sbLIZ.append(C844470XAv.LJIIJ);
                                return C2188811AlT.LIZIZ(sbLIZ);
                            }

                            @Override // com.ss.android.ugc.aweme.download.component_api.depend.IDownloadSdkMonitorDepend
                            public final String getDeviceId() {
                                return DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId();
                            }

                            @Override // com.ss.android.ugc.aweme.download.component_api.depend.IDownloadSdkMonitorDepend
                            public final String[] getMonitorHosts() {
                                return C0VX8.LIZ;
                            }
                        });
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
