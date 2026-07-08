package X;

import android.os.Build;
import java.util.Map;

/* JADX INFO: renamed from: X.0Uac, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C774960Uac {
    public final C774950Uab LIZ = C774950Uab.LIZ;
    public final C775080Uao LIZIZ = C775080Uao.LIZ;

    public final void LIZ(boolean z) {
        if (!z) {
            C775080Uao.LIZ();
            return;
        }
        C775080Uao.LIZIZ();
        this.LIZ.getClass();
        Map<String, Object> map = C1338270kvh.LIZ;
        if (Build.VERSION.SDK_INT <= 28) {
            return;
        }
        C774950Uab.LIZIZ();
        C774950Uab.LIZJ = false;
    }
}
