package X;

import Y.ARunnableS118S0100000_18;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AwS102S1000000_18;
import kotlin.jvm.internal.AwS167S1100000_18;

/* JADX INFO: renamed from: X.0gL6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1161820gL6 {
    public C1161640gKo LIZ;
    public InterfaceC1161830gL7 LIZIZ;
    public long LIZJ;
    public int LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public final BPEAHandler LJI = new BPEAHandler(Looper.getMainLooper());
    public final ARunnableS118S0100000_18 LJII = new ARunnableS118S0100000_18(this, 4);
    public final ARunnableS118S0100000_18 LJIIIIZZ = new ARunnableS118S0100000_18(this, 5);
    public final Set<String> LJIIIZ = new LinkedHashSet();
    public final LinkedHashSet<String> LJIIJ = new LinkedHashSet<>();

    public final void LIZ() {
        this.LIZIZ = null;
        this.LIZJ = 0L;
        this.LIZLLL = 0;
        this.LJ = false;
        this.LJFF = false;
        this.LJIIIZ.clear();
        this.LJIIJ.clear();
        this.LJI.removeCallbacks(this.LJII);
        this.LJI.removeCallbacks(this.LJIIIIZZ);
    }

    public final void LIZIZ(String str) {
        if (this.LJ) {
            return;
        }
        this.LJ = true;
        this.LJI.removeCallbacks(this.LJII);
        this.LJI.removeCallbacks(this.LJIIIIZZ);
        if (this.LIZLLL > 0) {
            new C1043010dFT();
            C1043010dFT.LIZIZ("MynaMultiViews", new AwS167S1100000_18(str, this, 3));
            InterfaceC1161830gL7 interfaceC1161830gL7 = this.LIZIZ;
            if (interfaceC1161830gL7 != null) {
                interfaceC1161830gL7.LIZ(this.LIZJ);
                return;
            }
            return;
        }
        new C1043010dFT();
        C1043010dFT.LIZIZ("MynaMultiViews", new AwS102S1000000_18(str, 4));
        InterfaceC1161830gL7 interfaceC1161830gL72 = this.LIZIZ;
        if (interfaceC1161830gL72 == null) {
            return;
        }
        interfaceC1161830gL72.LIZIZ(C13BV.INSTANCE);
    }
}
