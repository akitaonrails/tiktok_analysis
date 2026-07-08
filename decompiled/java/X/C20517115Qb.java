package X;

import Y.ARunnableS100S0200000_31;
import android.graphics.Bitmap;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.fly_main_color.FlyMainColor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.15Qb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20517115Qb {
    public boolean LIZ;
    public final AtomicBoolean LIZIZ = new AtomicBoolean(false);
    public final BPEAHandler LIZJ = new BPEAHandler(Looper.getMainLooper());
    public InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> LIZLLL;

    public static Integer LIZ(Bitmap bitmap) {
        try {
            C204674156y c204674156yLIZ = FlyMainColor.LIZ.LIZ(new C2439109h7(bitmap, null));
            c204674156yLIZ.LJFF(C144Y.LIZ().mergingTolerance);
            c204674156yLIZ.LJ(C144Y.LIZ().cLeft, C144Y.LIZ().cRight, C144Y.LIZ().iLeft, C144Y.LIZ().iRight, C144Y.LIZ().strategyThreshold);
            c204674156yLIZ.LJI(C144Y.LIZ().lightnessAddition);
            return c204674156yLIZ.LIZIZ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    public final void LIZIZ(InterfaceC20517315Qd interfaceC20517315Qd) {
        C786410Ut5.LJJZZIII(this.LIZJ, new ARunnableS100S0200000_31(this, interfaceC20517315Qd, 74));
    }
}
