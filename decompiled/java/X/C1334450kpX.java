package X;

import com.bytedance.lighten.core.config.ILightenConfigOutService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0kpX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1334450kpX extends C09AY implements Function0<Boolean> {
    public C1334450kpX() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        ILightenConfigOutService iLightenConfigOutServiceLIZ = C1335020kqS.LIZ();
        if (iLightenConfigOutServiceLIZ != null) {
            return Boolean.valueOf(iLightenConfigOutServiceLIZ.LJJIIJ());
        }
        return null;
    }
}
