package X;

import Y.ARunnableS85S0200000_16;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cHv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1006090cHv {
    public static final /* synthetic */ int LJI = 0;
    public String LIZ;
    public int LIZIZ;
    public final ARunnableS85S0200000_16 LIZLLL;
    public C1351210lGZ LJFF;
    public final BPEAHandler LIZJ = new BPEAHandler(Looper.getMainLooper());
    public final Map<String, Long> LJ = new LinkedHashMap();

    public C1006090cHv(C1006070cHt c1006070cHt) {
        this.LIZLLL = new ARunnableS85S0200000_16(this, c1006070cHt, 20);
    }

    public final int LIZ(int i, String str, boolean z) {
        boolean z2;
        String str2 = this.LIZ;
        boolean z3 = false;
        if (str2 == null && i < 15 && str != null) {
            z2 = true;
        } else {
            z2 = false;
            if (str2 != null && !Intrinsics.LJFF(str, str2) && i < 15) {
                z3 = true;
            }
        }
        if (!z2 && !z3) {
            if (z) {
                if (Intrinsics.LJFF(str, this.LIZ)) {
                    if (i <= 15) {
                        C786410Ut5.LJLIIL(50L, this.LIZJ, this.LIZLLL);
                        return i;
                    }
                    this.LIZJ.removeCallbacks(this.LIZLLL);
                    return i;
                }
            } else if (i < 15) {
                return this.LIZIZ * 5;
            }
            this.LIZ = null;
            this.LIZJ.removeCallbacks(this.LIZLLL);
            return i;
        }
        this.LIZ = str;
        this.LIZIZ = 1;
        C786410Ut5.LJLIIL(50L, this.LIZJ, this.LIZLLL);
        return 5;
    }
}
