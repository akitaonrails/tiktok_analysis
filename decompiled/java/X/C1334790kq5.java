package X;

import com.bytedance.lighten.core.config.ILightenConfigOutService;
import com.bytedance.lighten.core.config.SharpConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0kq5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1334790kq5 extends C09AY implements Function0<SharpConfig> {
    public C1334790kq5() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final SharpConfig invoke() {
        ILightenConfigOutService iLightenConfigOutServiceLIZ = C1335020kqS.LIZ();
        if (iLightenConfigOutServiceLIZ != null) {
            return iLightenConfigOutServiceLIZ.LJJJJJL();
        }
        return null;
    }
}
