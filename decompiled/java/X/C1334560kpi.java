package X;

import com.bytedance.lighten.core.config.ILightenConfigOutService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0kpi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1334560kpi extends C09AY implements Function0<Boolean> {
    public C1334560kpi() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        ILightenConfigOutService iLightenConfigOutServiceLIZ = C1335020kqS.LIZ();
        if (iLightenConfigOutServiceLIZ != null) {
            return Boolean.valueOf(iLightenConfigOutServiceLIZ.LJJLI());
        }
        return null;
    }
}
