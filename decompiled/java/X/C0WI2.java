package X;

import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.lib.AppLogNewUtils;

/* JADX INFO: renamed from: X.0WI2, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WI2 {
    public String LIZ;
    public Bundle LIZIZ;

    public final void LIZJ() {
        try {
            AppLogNewUtils.LJ(this.LIZ, this.LIZIZ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void LIZIZ(String str) {
        this.LIZ = str;
        LIZ("uc_login", "params_for_special");
    }

    public final void LIZ(Object obj, String str) {
        if (this.LIZIZ == null) {
            this.LIZIZ = new Bundle();
        }
        try {
            C786410Ut5.LJJJI(str, obj.toString(), this.LIZIZ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
