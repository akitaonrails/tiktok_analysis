package X;

import com.bytedance.lighten.core.config.ILightenConfigOutService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0kq9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1334830kq9 extends C09AY implements Function0<InterfaceC1331200kkI> {
    public C1334830kq9() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC1331200kkI invoke() {
        ILightenConfigOutService iLightenConfigOutServiceLIZ = C1335020kqS.LIZ();
        if (iLightenConfigOutServiceLIZ != null) {
            return iLightenConfigOutServiceLIZ.LJFF();
        }
        return null;
    }
}
