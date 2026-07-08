package X;

import android.content.Context;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0HCM, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HCM extends C09AY implements Function0<Boolean> {
    public C0HCM() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        if (C0HCN.LIZ == 0) {
            C0HCN.LIZ = (int) C0HCL.LIZIZ(contextLIZ.getResources().getDisplayMetrics().heightPixels, contextLIZ);
        }
        return Boolean.valueOf(C0HCN.LIZ <= 640);
    }
}
