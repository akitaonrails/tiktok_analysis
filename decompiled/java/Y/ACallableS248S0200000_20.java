package Y;

import X.C1326950kdR;
import X.C1336010ks3;
import X.C1C7U;
import X.InterfaceC1324680kZm;
import android.graphics.Bitmap;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes21.dex */
public class ACallableS248S0200000_20 implements Callable {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            case 3:
                return call$3(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS248S0200000_20 aCallableS248S0200000_20) {
        C1C7U.LIZ("StoryPublishServiceImpl@e66c.extractBitmap$3$processFrame$1");
        ((Function1) aCallableS248S0200000_20.l0).invoke((Bitmap) aCallableS248S0200000_20.l1);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StoryPublishServiceImpl@e66c.extractBitmap$3$processFrame$1");
        return unit;
    }

    public static final Object call$1(ACallableS248S0200000_20 aCallableS248S0200000_20) {
        C1C7U.LIZ("BufferedDiskCache@f3ba.containsAsync$1");
        Boolean boolValueOf = Boolean.valueOf(((C1326950kdR) aCallableS248S0200000_20.l1).LIZIZ((InterfaceC1324680kZm) aCallableS248S0200000_20.l0));
        C1C7U.LIZIZ("BufferedDiskCache@f3ba.containsAsync$1");
        return boolValueOf;
    }

    public static final Object call$2(ACallableS248S0200000_20 aCallableS248S0200000_20) {
        C1C7U.LIZ("BufferedDiskCache@f3ba.remove$1");
        try {
            C1336010ks3.LIZIZ();
            ((C1326950kdR) aCallableS248S0200000_20.l1).LJFF.LIZLLL((InterfaceC1324680kZm) aCallableS248S0200000_20.l0);
            ((C1326950kdR) aCallableS248S0200000_20.l1).LIZ.LJ((InterfaceC1324680kZm) aCallableS248S0200000_20.l0);
            C1336010ks3.LIZIZ();
            C1C7U.LIZIZ("BufferedDiskCache@f3ba.remove$1");
            return null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1336010ks3.LIZIZ();
            throw th;
        }
    }

    public static final Object call$3(ACallableS248S0200000_20 aCallableS248S0200000_20) {
        C1C7U.LIZ("BufferedDiskCache@f3ba.clearByPercentage$1");
        ((C1326950kdR) aCallableS248S0200000_20.l1).LIZ.LIZJ((Double) aCallableS248S0200000_20.l0);
        C1C7U.LIZIZ("BufferedDiskCache@f3ba.clearByPercentage$1");
        return null;
    }

    public ACallableS248S0200000_20(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj;
    }
}
