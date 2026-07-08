package X;

import com.bytedance.lighten.core.config.ILightenConfigOutService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0kqE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1334880kqE extends C09AY implements Function0<InterfaceC1335580krM> {
    public C1334880kqE() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC1335580krM invoke() {
        ILightenConfigOutService iLightenConfigOutServiceLIZ = C1335020kqS.LIZ();
        if (iLightenConfigOutServiceLIZ != null) {
            return iLightenConfigOutServiceLIZ.LJJIJIL();
        }
        return null;
    }
}
