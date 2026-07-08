package X;

import com.bytedance.lighten.core.config.ILightenConfigOutService;
import com.bytedance.lighten.core.config.SRConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0kq3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1334770kq3 extends C09AY implements Function0<SRConfig> {
    public C1334770kq3() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final SRConfig invoke() {
        ILightenConfigOutService iLightenConfigOutServiceLIZ = C1335020kqS.LIZ();
        if (iLightenConfigOutServiceLIZ != null) {
            return iLightenConfigOutServiceLIZ.LJIILJJIL();
        }
        return null;
    }
}
