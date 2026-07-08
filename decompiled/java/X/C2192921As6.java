package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.dsp.common.MusicActionReporterApi;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.1As6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2192921As6 {
    public static C11NZ LIZ(String str) {
        MusicActionReporterApi.MusicActionReporterOperatorApi musicActionReporterOperatorApi = MusicActionReporterApi.LIZ;
        if (musicActionReporterOperatorApi == null) {
            InterfaceC2661011f interfaceC2661011fLIZ = ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).LIZ(C359001aO.LIZ);
            if (interfaceC2661011fLIZ != null) {
                musicActionReporterOperatorApi = (MusicActionReporterApi.MusicActionReporterOperatorApi) interfaceC2661011fLIZ.create(MusicActionReporterApi.MusicActionReporterOperatorApi.class);
            } else {
                musicActionReporterOperatorApi = null;
            }
            MusicActionReporterApi.LIZ = musicActionReporterOperatorApi;
        }
        return musicActionReporterOperatorApi.actionReport(str);
    }
}
