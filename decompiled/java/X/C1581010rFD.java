package X;

import android.content.Context;
import android.view.View;
import com.bytedance.hybrid.spark.SparkContext;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.xplatform.service.IMiniDramaLynxViewCenterService;
import java.util.Map;

/* JADX INFO: renamed from: X.0rFD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1581010rFD implements IMiniDramaLynxViewCenterService {
    public static final C1581010rFD LIZIZ = new C1581010rFD();
    public final /* synthetic */ IMiniDramaLynxViewCenterService LIZ;

    @Override // com.ss.android.ugc.aweme.xplatform.service.IMiniDramaLynxViewCenterService
    public final View LIZ(Context context, SparkContext sparkContext, String str, C1548440qOg c1548440qOg) {
        return this.LIZ.LIZ(context, sparkContext, str, c1548440qOg);
    }

    @Override // com.ss.android.ugc.aweme.xplatform.service.IMiniDramaLynxViewCenterService
    public final void LIZIZ(String str, String str2, C1548440qOg c1548440qOg) {
        this.LIZ.LIZIZ(str, str2, c1548440qOg);
    }

    @Override // com.ss.android.ugc.aweme.xplatform.service.IMiniDramaLynxViewCenterService
    public final C1548440qOg LIZJ(Map map, C13BV c13bv, boolean z, EnumC1548460qOi enumC1548460qOi) {
        return this.LIZ.LIZJ(map, c13bv, z, enumC1548460qOi);
    }

    @Override // com.ss.android.ugc.aweme.xplatform.service.IMiniDramaLynxViewCenterService
    public final void LIZLLL(SparkContext sparkContext, String str, C1548440qOg c1548440qOg) {
        this.LIZ.LIZLLL(sparkContext, str, c1548440qOg);
    }

    @Override // com.ss.android.ugc.aweme.xplatform.service.IMiniDramaLynxViewCenterService
    public final SparkContext LJ(String str, C1548440qOg c1548440qOg) {
        return this.LIZ.LJ(str, c1548440qOg);
    }

    @Override // com.ss.android.ugc.aweme.xplatform.service.IMiniDramaLynxViewCenterService
    public final void N5(String str) {
        this.LIZ.N5(str);
    }

    public C1581010rFD() {
        IMiniDramaLynxViewCenterService iMiniDramaLynxViewCenterService = (IMiniDramaLynxViewCenterService) PluggableExtentionKt.pluggableSpi$default(IMiniDramaLynxViewCenterService.class, false, false, false, 14, null);
        if (iMiniDramaLynxViewCenterService != null) {
            this.LIZ = iMiniDramaLynxViewCenterService;
        } else {
            "no implement IMiniDramaLynxViewCenterService".toString();
            throw new IllegalStateException("no implement IMiniDramaLynxViewCenterService");
        }
    }
}
