package X;

import com.bytedance.lighten.core.config.ILightenConfigOutService;
import java.io.File;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0kqN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1334970kqN extends C09AY implements Function0<File> {
    public C1334970kqN() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final File invoke() {
        ILightenConfigOutService iLightenConfigOutServiceLIZ = C1335020kqS.LIZ();
        if (iLightenConfigOutServiceLIZ != null) {
            return iLightenConfigOutServiceLIZ.LJIJJLI();
        }
        return null;
    }
}
