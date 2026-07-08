package X;

import com.bytedance.lighten.core.config.ILightenConfigOutService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0kqK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1334940kqK extends C09AY implements Function0<AbstractC1334330kpL> {
    public C1334940kqK() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final AbstractC1334330kpL invoke() {
        ILightenConfigOutService iLightenConfigOutServiceLIZ = C1335020kqS.LIZ();
        if (iLightenConfigOutServiceLIZ != null) {
            return iLightenConfigOutServiceLIZ.LJIL();
        }
        return null;
    }
}
