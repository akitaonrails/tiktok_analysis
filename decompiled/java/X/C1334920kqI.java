package X;

import com.bytedance.lighten.core.config.ILightenConfigOutService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0kqI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1334920kqI extends C09AY implements Function0<InterfaceC1333840koY> {
    public C1334920kqI() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC1333840koY invoke() {
        ILightenConfigOutService iLightenConfigOutServiceLIZ = C1335020kqS.LIZ();
        if (iLightenConfigOutServiceLIZ != null) {
            return iLightenConfigOutServiceLIZ.LJI();
        }
        return null;
    }
}
