package X;

import com.bytedance.lighten.core.config.ILightenConfigOutService;
import com.ss.android.ugc.aweme.image.LightenConfigOutService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0kqT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1335030kqT extends C09AY implements Function0<ILightenConfigOutService> {
    public C1335030kqT() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.bytedance.lighten.core.config.ILightenConfigOutService, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final ILightenConfigOutService invoke() {
        ?? LIZ = C04TD.LIZ(ILightenConfigOutService.class, false);
        if (LIZ != 0) {
            return LIZ;
        }
        if (C04TD.f115p1 == null) {
            synchronized (ILightenConfigOutService.class) {
                if (C04TD.f115p1 == null) {
                    C04TD.f115p1 = new LightenConfigOutService();
                }
            }
        }
        return C04TD.f115p1;
    }
}
