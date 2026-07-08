package X;

import android.content.Context;
import android.net.wifi.WifiInfo;
import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Uta, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C786720Uta {
    public final C787140UuG LIZ;

    public final String LIZ() {
        String str;
        C787140UuG c787140UuG = this.LIZ;
        if (Build.VERSION.SDK_INT < 24) {
            c787140UuG.getClass();
            return "NOT_SUPPORTED";
        }
        synchronized (c787140UuG.LJIIIIZZ) {
            try {
                str = c787140UuG.LIZJ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return str;
    }

    public final int LIZIZ() {
        int i;
        WifiInfo wifiInfoLIZ;
        Integer numValueOf;
        C787140UuG c787140UuG = this.LIZ;
        synchronized (c787140UuG) {
            if ("WIFI".equals(c787140UuG.LIZLLL) && c787140UuG.LJI == -2) {
                try {
                    InterfaceC786740Utc interfaceC786740Utc = c787140UuG.LJIIZILJ;
                    if (interfaceC786740Utc != null && (wifiInfoLIZ = C786600UtO.LIZ(((C786730Utb) interfaceC786740Utc).LIZ)) != null && (numValueOf = Integer.valueOf(C2204961BRm.LJLLLL(wifiInfoLIZ, new C0WZX("dzBzEgAjS8/YVFkiQFyUaP/mqC5RLlqtbe3gIsdOVcSzDVFLDDbsyDm0XyAPCDatnQ==", null)))) != null) {
                        c787140UuG.LJI = numValueOf.intValue();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    return c787140UuG.LJI;
                }
            }
            i = c787140UuG.LJI;
        }
        return i;
    }

    public C786720Uta(Context context, C786730Utb c786730Utb) {
        this.LIZ = null;
        synchronized (C787140UuG.LJIJI) {
            try {
                if (C787140UuG.LJIJJ == null) {
                    C787140UuG.LJIJJ = new C787140UuG(context);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        C787140UuG c787140UuG = C787140UuG.LJIJJ;
        this.LIZ = c787140UuG;
        c787140UuG.LJIIZILJ = c786730Utb;
    }
}
