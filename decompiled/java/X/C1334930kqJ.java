package X;

import com.bytedance.lighten.core.config.ILightenConfigOutService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0kqJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1334930kqJ extends C09AY implements Function0<InterfaceC1334030kor> {
    public C1334930kqJ() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC1334030kor invoke() {
        ILightenConfigOutService iLightenConfigOutServiceLIZ = C1335020kqS.LIZ();
        if (iLightenConfigOutServiceLIZ != null) {
            return iLightenConfigOutServiceLIZ.LJJIJL();
        }
        return null;
    }
}
