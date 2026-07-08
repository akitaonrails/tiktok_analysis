package X;

import com.bytedance.lighten.core.config.ILightenConfigOutService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0kpx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1334710kpx extends C09AY implements Function0<InterfaceC1330810kjf> {
    public C1334710kpx() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC1330810kjf invoke() {
        ILightenConfigOutService iLightenConfigOutServiceLIZ = C1335020kqS.LIZ();
        if (iLightenConfigOutServiceLIZ != null) {
            return iLightenConfigOutServiceLIZ.LJJIIZI();
        }
        return null;
    }
}
