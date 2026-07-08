package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.SAFExtensionKt;

/* JADX INFO: renamed from: X.0ntj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1452370ntj {
    public static final void LIZ(Activity activity) {
        C19EG c19eg;
        InterfaceC214902198i interfaceC214902198iLJIILLIIL;
        if (C296250BjL.LIZIZ()) {
            if ((activity instanceof C19EG) && (c19eg = (C19EG) activity) != null && (interfaceC214902198iLJIILLIIL = SAFExtensionKt.LJIILLIIL(c19eg)) != null) {
                interfaceC214902198iLJIILLIIL.finish();
                return;
            } else {
                activity.finish();
                return;
            }
        }
        activity.finish();
    }
}
