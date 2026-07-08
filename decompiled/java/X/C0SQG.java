package X;

import Y.ARunnableS111S0100000_11;
import android.content.Context;
import android.os.Looper;
import android.view.MotionEvent;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS590S0100000_11;

/* JADX INFO: renamed from: X.0SQG, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SQG implements InterfaceC709010RrX {
    public final Function1<MotionEvent, Unit> LIZ;
    public final long LIZIZ;
    public final C01GW LIZJ;
    public final BPEAHandler LIZLLL;
    public boolean LJ;
    public float LJFF;
    public float LJI;
    public final ARunnableS111S0100000_11 LJII;
    public boolean LJIIIIZZ;

    public C0SQG(Context context, AwS590S0100000_11 awS590S0100000_11) {
        int iIntValue;
        this.LIZ = awS590S0100000_11;
        C01GW c01gw = C277780Aue.LIZ;
        if (((Number) c01gw.getValue()).intValue() > 0) {
            iIntValue = ((Number) c01gw.getValue()).intValue();
        } else {
            iIntValue = 500;
        }
        this.LIZIZ = iIntValue;
        this.LIZJ = C452501pT.LIZIZ(new AwS550S0100000_6(context, 1166));
        this.LIZLLL = new BPEAHandler(Looper.getMainLooper());
        this.LJII = new ARunnableS111S0100000_11(this, 118);
    }

    @Override // X.InterfaceC709010RrX
    public final boolean LIZ(MotionEvent motionEvent, Function0<Boolean> function0) {
        if (this.LJ) {
            return true;
        }
        return function0.invoke().booleanValue();
    }

    @Override // X.InterfaceC709010RrX
    public final boolean LIZIZ(MotionEvent motionEvent, Function0<Boolean> function0) {
        if (this.LJ) {
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                this.LJ = false;
            }
            return true;
        }
        return function0.invoke().booleanValue();
    }
}
