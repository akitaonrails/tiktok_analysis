package X;

import android.graphics.Bitmap;
import com.bytedance.lighten.core.config.ILightenConfigOutService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0kqD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1334870kqD extends C09AY implements Function0<Bitmap.Config> {
    public C1334870kqD() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Bitmap.Config invoke() {
        ILightenConfigOutService iLightenConfigOutServiceLIZ = C1335020kqS.LIZ();
        if (iLightenConfigOutServiceLIZ != null) {
            return iLightenConfigOutServiceLIZ.LIZ();
        }
        return null;
    }
}
