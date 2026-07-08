package X;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0jec, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1289240jec extends AbstractC1289250jed {
    public InterfaceC1289270jef LIZ;
    public final SensorManager LIZIZ;
    public C1289260jee LIZJ;
    public HashMap<Integer, Sensor> LIZLLL;
    public final InterfaceC1289060jeK LJ;

    @Override // X.AbstractC1289250jed
    public final void LIZJ() throws Throwable {
        InterfaceC1289060jeK interfaceC1289060jeK = this.LJ;
        if (interfaceC1289060jeK == null) {
            C2204961BRm.LJJLIIIJJI(this.LIZIZ, this.LIZJ, new C0WZX("dzBzEg4jUdKSVlYvUxOXKNA2KQ74T5sG8LBlUCEVvaWIt8N9fyb3tLmurZtZnu1RWNT+9w==", null));
            return;
        }
        ((C1289040jeI) interfaceC1289060jeK).LIZ.LIZLLL(this.LIZIZ, this.LIZJ);
    }

    @Override // X.AbstractC1289250jed
    public final void LIZ(InterfaceC1289270jef interfaceC1289270jef) {
        synchronized (this) {
            try {
                this.LIZ = interfaceC1289270jef;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public C1289240jec(Context context, C1289040jeI c1289040jeI) {
        this.LIZIZ = (SensorManager) C786410Ut5.H2(context, "sensor");
        this.LJ = c1289040jeI;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ce  */
    /* JADX WARN: Type inference failed for: r0v27, types: [X.0jee] */
    @Override // X.AbstractC1289250jed
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZIZ(int r10, java.util.List r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1289240jec.LIZIZ(int, java.util.List):boolean");
    }
}
