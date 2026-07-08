package X;

import com.bytedance.lighten.core.config.ILightenConfigOutService;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0kpV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1334430kpV extends C09AY implements Function0<List<? extends C1330790kjd>> {
    public C1334430kpV() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<? extends C1330790kjd> invoke() {
        ILightenConfigOutService iLightenConfigOutServiceLIZ = C1335020kqS.LIZ();
        if (iLightenConfigOutServiceLIZ != null) {
            return iLightenConfigOutServiceLIZ.LJJIL();
        }
        return null;
    }
}
