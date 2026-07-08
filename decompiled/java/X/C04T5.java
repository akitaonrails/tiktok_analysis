package X;

import com.ss.android.ugc.aweme.outreach.dispersion.impl.DispersionServiceImpl;
import com.ss.android.ugc.aweme.outreach.dispersion.spi.OutreachDispersionService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.04T5, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C04T5 extends C09AY implements Function0<OutreachDispersionService> {
    public C04T5() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.outreach.dispersion.spi.OutreachDispersionService, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final OutreachDispersionService invoke() {
        ?? LIZ = C04TD.LIZ(OutreachDispersionService.class, false);
        if (LIZ != 0) {
            return LIZ;
        }
        if (C04TD.W2 == null) {
            synchronized (OutreachDispersionService.class) {
                if (C04TD.W2 == null) {
                    C04TD.W2 = new DispersionServiceImpl();
                }
            }
        }
        return C04TD.W2;
    }
}
