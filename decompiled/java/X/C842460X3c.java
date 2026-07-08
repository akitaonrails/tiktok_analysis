package X;

import com.ss.android.ugc.aweme.ml.api.SmartCDNRankService;
import com.ss.android.ugc.aweme.ml.impl.SmartCDNRankServiceImpl;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0X3c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C842460X3c extends C09AY implements Function0<SmartCDNRankService> {
    public C842460X3c() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.ml.api.SmartCDNRankService, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final SmartCDNRankService invoke() {
        ?? LIZ = C04TD.LIZ(SmartCDNRankService.class, false);
        if (LIZ != 0) {
            return LIZ;
        }
        if (C04TD.z2 == null) {
            synchronized (SmartCDNRankService.class) {
                if (C04TD.z2 == null) {
                    C04TD.z2 = new SmartCDNRankServiceImpl();
                }
            }
        }
        return C04TD.z2;
    }
}
