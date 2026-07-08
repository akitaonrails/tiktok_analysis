package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.service.IMiniDramaProfileLandingService;
import java.util.Map;

/* JADX INFO: renamed from: X.0rB8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1578480rB8 implements IMiniDramaProfileLandingService {
    public static final C1578480rB8 LIZIZ = new C1578480rB8();
    public final /* synthetic */ IMiniDramaProfileLandingService LIZ;

    @Override // com.ss.android.ugc.aweme.service.IMiniDramaProfileLandingService
    public final void LIZ(String str, String str2, String str3, boolean z) {
        this.LIZ.LIZ(str, str2, str3, z);
    }

    @Override // com.ss.android.ugc.aweme.service.IMiniDramaProfileLandingService
    public final Map LIZIZ(long j) {
        return this.LIZ.LIZIZ(j);
    }

    public C1578480rB8() {
        IMiniDramaProfileLandingService iMiniDramaProfileLandingService = (IMiniDramaProfileLandingService) PluggableExtentionKt.pluggableSpi$default(IMiniDramaProfileLandingService.class, false, false, false, 14, null);
        if (iMiniDramaProfileLandingService != null) {
            this.LIZ = iMiniDramaProfileLandingService;
        } else {
            "no implement IMiniDramaProfileLandingService".toString();
            throw new IllegalStateException("no implement IMiniDramaProfileLandingService");
        }
    }
}
