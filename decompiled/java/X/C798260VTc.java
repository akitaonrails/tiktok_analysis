package X;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.AwS557S0100000_13;

/* JADX INFO: renamed from: X.0VTc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C798260VTc {
    public final Handler LIZ;
    public final Context LIZIZ;
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(6088));
    public final C01GW LIZLLL = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1749));
    public final C01GW LJ = C452501pT.LIZIZ(new AwS557S0100000_13(this, 203));
    public float LJFF = Float.NaN;
    public final C01GW LJI = C452501pT.LIZIZ(new AwS557S0100000_13(this, 200));

    public final void LIZ() {
        C786410Ut5.LJLIIL(((Number) this.LIZJ.getValue()).longValue(), this.LIZ, (Runnable) this.LJI.getValue());
    }

    public final void LIZIZ(int i) {
        boolean z;
        String name;
        Activity activityLIZIZ;
        Activity activityLIZ;
        C0CMU c0cmu = C0CMU.LIZ;
        boolean z2 = false;
        int i2 = 1;
        if (C0CMU.LIZIZ == C0CBL.ENTERED) {
            z = true;
        } else {
            z = false;
        }
        C2241008qG c2241008qG = new C2241008qG();
        c2241008qG.LIZ.put("is_background", Integer.valueOf(C2213981Bky.LIZIZ.isAppBackground() ? 1 : 0));
        if (z && C584360Mvy.LIZIZ()) {
            z2 = true;
        }
        c2241008qG.LIZ.put("in_5vv_scene", Boolean.valueOf(z2));
        AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
        String str = "";
        if (abstractC1387200mCcLIZIZ == null || (activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ()) == null || (activityLIZ = C1388190mED.LIZ(activityLIZIZ)) == null) {
            name = "";
        } else {
            name = activityLIZ.getClass().getName();
        }
        c2241008qG.LIZ.put("scene_tech", name);
        String str2 = C2187451AjH.LJIIIZ;
        if (str2 != null) {
            str = str2;
        }
        c2241008qG.LIZ.put("scene_business", str);
        if (((C793270V9x) this.LJ.getValue()).LIZLLL) {
            i2 = 2;
        }
        c2241008qG.LIZ.put("is_incharge", Integer.valueOf(i2));
        c2241008qG.LIZ.put("battery_thermal_state", Float.valueOf(((C793270V9x) this.LJ.getValue()).LJFF));
        c2241008qG.LIZ.put("cold_start_duration", Long.valueOf(SystemClock.uptimeMillis() - C202094145s.LJII));
        c2241008qG.LIZ.put("direction", Integer.valueOf(i));
        C20684815ws.LJIJ("prf_thermal_info", c2241008qG.LJ());
    }

    public C798260VTc(Context context, BPEAHandler bPEAHandler) {
        this.LIZ = bPEAHandler;
        this.LIZIZ = context;
    }
}
