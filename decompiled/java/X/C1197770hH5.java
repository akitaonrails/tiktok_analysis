package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT;

/* JADX INFO: renamed from: X.0hH5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1197770hH5 extends AbstractC1196150hET {
    public static final C1197770hH5 LIZ = new C1197770hH5();
    public static final String LIZIZ = "nearby_location";
    public static final ILocationBaseServiceForMT LIZJ = (ILocationBaseServiceForMT) PluggableExtentionKt.pluggableSpi$default(ILocationBaseServiceForMT.class, false, false, false, 14, null);

    @Override // X.AbstractC1196150hET
    public final String LIZIZ() {
        return LIZIZ;
    }
}
