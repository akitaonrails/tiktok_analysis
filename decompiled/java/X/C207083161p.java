package X;

import com.bytedance.ies.ugc.statisticloggerapi.IUBTrackingUtilsApi;
import com.ss.android.ugc.aweme.common.UBTrackingWrapperImpl;

/* JADX INFO: renamed from: X.161p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C207083161p implements IUBTrackingUtilsApi {
    public static final C207083161p LIZIZ = new C207083161p();
    public final /* synthetic */ IUBTrackingUtilsApi LIZ;

    @Override // com.bytedance.ies.ugc.statisticloggerapi.IUBTrackingUtilsApi
    public final String LIZ() {
        return this.LIZ.LIZ();
    }

    public C207083161p() {
        IUBTrackingUtilsApi iUBTrackingUtilsApi;
        Object objLIZ = C04TD.LIZ(IUBTrackingUtilsApi.class, false);
        if (objLIZ != null) {
            iUBTrackingUtilsApi = (IUBTrackingUtilsApi) objLIZ;
        } else {
            if (C04TD.LLLLIIL == null) {
                synchronized (IUBTrackingUtilsApi.class) {
                    if (C04TD.LLLLIIL == null) {
                        C04TD.LLLLIIL = new UBTrackingWrapperImpl();
                    }
                }
            }
            iUBTrackingUtilsApi = C04TD.LLLLIIL;
        }
        this.LIZ = iUBTrackingUtilsApi;
    }
}
