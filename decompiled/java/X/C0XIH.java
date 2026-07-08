package X;

import android.content.Context;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.account.TTAccountInit;

/* JADX INFO: renamed from: X.0XIH, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XIH {
    public static volatile C0XIH LIZIZ;
    public final Context LIZ;

    public static C0XIH LIZIZ() {
        TTAccountInit.LIZ();
        return LIZJ(C848000XOk.LIZ());
    }

    public C0XIH(Context context) {
        if (TTAccountInit.LIZIZ == null) {
            this.LIZ = C786410Ut5.N3(context);
        } else {
            this.LIZ = C848000XOk.LIZ();
        }
    }

    public static C0XIH LIZJ(Context context) {
        if (LIZIZ == null) {
            synchronized (C0XIH.class) {
                try {
                    if (LIZIZ == null) {
                        LIZIZ = new C0XIH(context);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZIZ;
    }

    public final void LIZ(String str, C0XIE c0xie) {
        Context context = this.LIZ;
        C846070XGz c846070XGz = new C846070XGz();
        c846070XGz.LIZJ(Scene.SCENE_SERVICE, str);
        c846070XGz.LIZ = C0XH1.LIZ("/passport/account/info/v2/");
        new C0XIF(context, c846070XGz.LIZIZ(), c0xie).LJIIIZ();
    }
}
