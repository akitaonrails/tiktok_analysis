package X;

import android.content.Context;
import com.bytedance.lighten.core.config.ILightenConfigOutService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0kqG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1334900kqG extends C09AY implements Function0<Context> {
    public C1334900kqG() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Context invoke() {
        ILightenConfigOutService iLightenConfigOutServiceLIZ = C1335020kqS.LIZ();
        if (iLightenConfigOutServiceLIZ != null) {
            return iLightenConfigOutServiceLIZ.getContext();
        }
        return null;
    }
}
