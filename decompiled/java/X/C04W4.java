package X;

import com.ss.android.ugc.aweme.im.sdk.chat.analytics.IMCategoryAnalytics;
import com.ss.android.ugc.aweme.im.service.analytics.IIMCategoryAnalytics;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.04W4, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C04W4 extends C09AY implements Function0<IIMCategoryAnalytics> {
    public C04W4() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.im.service.analytics.IIMCategoryAnalytics, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final IIMCategoryAnalytics invoke() {
        ?? LIZ = C04TD.LIZ(IIMCategoryAnalytics.class, false);
        if (LIZ != 0) {
            return LIZ;
        }
        if (C04TD.Z0 == null) {
            synchronized (IIMCategoryAnalytics.class) {
                if (C04TD.Z0 == null) {
                    C04TD.Z0 = new IMCategoryAnalytics.Service();
                }
            }
        }
        return C04TD.Z0;
    }
}
