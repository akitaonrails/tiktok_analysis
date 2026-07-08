package X;

import com.bytedance.lighten.core.config.ILightenConfigOutService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0kqM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1334960kqM extends C09AY implements Function0<InterfaceC1331950klV> {
    public C1334960kqM() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC1331950klV invoke() {
        ILightenConfigOutService iLightenConfigOutServiceLIZ = C1335020kqS.LIZ();
        if (iLightenConfigOutServiceLIZ != null) {
            return iLightenConfigOutServiceLIZ.LJJJJ();
        }
        return null;
    }
}
