package X;

import Y.ATListenerS454S0100000_21;
import android.os.Looper;
import android.view.View;
import android.view.ViewConfiguration;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS635S0100000_21;

/* JADX INFO: renamed from: X.0kzl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1340790kzl {
    public final View LIZ;
    public final long LIZIZ;
    public final Function1<View, Unit> LIZJ;
    public final Function1<View, Unit> LIZLLL;
    public final Function1<? super View, Unit> LJ;
    public final Long LJFF;
    public final Function0<Boolean> LJI;
    public final BPEAHandler LJII = new BPEAHandler(Looper.getMainLooper());
    public final BPEAHandler LJIIIIZZ = new BPEAHandler(Looper.getMainLooper());
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public boolean LJIIJJI;
    public boolean LJIIL;
    public final int LJIILIIL;
    public float LJIILJJIL;
    public float LJIILL;
    public float LJIILLIIL;
    public float LJIIZILJ;
    public final AwS635S0100000_21 LJIJ;

    /* JADX WARN: Multi-variable type inference failed */
    public C1340790kzl(View view, long j, Function1<? super View, Unit> function1, Function1<? super View, Unit> function12, Function1<? super View, Unit> function13, Long l, Function0<Boolean> function0) {
        this.LIZ = view;
        this.LIZIZ = j;
        this.LIZJ = function1;
        this.LIZLLL = function12;
        this.LJ = function13;
        this.LJFF = l;
        this.LJI = function0;
        this.LJIILIIL = -1;
        AwS635S0100000_21 awS635S0100000_21 = new AwS635S0100000_21(this, 122);
        this.LJIJ = awS635S0100000_21;
        view.setOnTouchListener(new ATListenerS454S0100000_21(awS635S0100000_21, 13));
        this.LJIILIIL = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
    }
}
