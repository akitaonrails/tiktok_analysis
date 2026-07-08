package X;

import com.bytedance.lighten.core.config.ILightenConfigOutService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0kqR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1335010kqR extends C09AY implements Function0<String> {
    public C1335010kqR() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        ILightenConfigOutService iLightenConfigOutServiceLIZ = C1335020kqS.LIZ();
        if (iLightenConfigOutServiceLIZ != null) {
            return iLightenConfigOutServiceLIZ.LJIJ();
        }
        return null;
    }
}
