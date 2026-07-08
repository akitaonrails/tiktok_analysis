package X;

import Y.ARunnableS126S0100000_26;
import android.app.Activity;
import android.os.Bundle;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS276S0300000_32;
import kotlin.jvm.internal.AwS433S0200000_32;
import kotlin.jvm.internal.AwS576S0100000_32;

/* JADX INFO: renamed from: X.19C8, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C19C8 {
    public final C19AK<?> LIZ;
    public C19C9 LIZIZ = C19C9.LL;
    public final BPEAHandler LIZJ = new BPEAHandler(Looper.getMainLooper());

    public final void LIZJ() {
        LIZ(new AwS576S0100000_32(this, 343));
    }

    public final void LIZLLL() {
        LIZ(new AwS576S0100000_32(this, 344));
    }

    public final void LJFF() {
        LIZ(new AwS576S0100000_32(this, 345));
    }

    public final void LJI() {
        LIZ(new AwS576S0100000_32(this, 346));
    }

    public final void LJII() {
        LIZ(new AwS576S0100000_32(this, 347));
    }

    public C19C8(C19AK<?> c19ak) {
        this.LIZ = c19ak;
    }

    public final void LIZ(Function0<Unit> function0) {
        try {
            function0.invoke();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C786410Ut5.LJJZZIII(this.LIZJ, new ARunnableS126S0100000_26(th, 56));
            throw th;
        }
    }

    public final void LJ(Bundle bundle) {
        LIZ(new AwS433S0200000_32(this, bundle, 27));
    }

    public final void LIZIZ(Activity activity, Bundle bundle) {
        LIZ(new AwS276S0300000_32(this, activity, bundle, 8));
    }
}
