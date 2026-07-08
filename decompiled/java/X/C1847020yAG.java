package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS264S0000000_24;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0yAG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1847020yAG {
    public final C16F5 LIZ;
    public final long LIZIZ;
    public final Function1<Boolean, Unit> LIZJ;
    public int LJ;
    public boolean LJFF;
    public String LIZLLL = "";
    public final BPEAHandler LJI = new BPEAHandler(Looper.getMainLooper(), new Handler.Callback() { // from class: X.0yAH
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i = message.what;
            if (i != 1) {
                if (i == 2) {
                    C1847020yAG c1847020yAG = this.LL;
                    c1847020yAG.LIZIZ();
                    Function1<Boolean, Unit> function1 = c1847020yAG.LIZJ;
                    if (function1 != null) {
                        function1.invoke(Boolean.TRUE);
                    }
                }
                return true;
            }
            C1847020yAG c1847020yAG2 = this.LL;
            c1847020yAG2.LJ = (c1847020yAG2.LJ + 1) % 4;
            StringBuilder sb = new StringBuilder(c1847020yAG2.LIZLLL);
            int i2 = this.LL.LJ;
            for (int i3 = 0; i3 < i2; i3++) {
                sb.append(e3.d);
            }
            this.LL.LIZ.setText(sb);
            C786410Ut5.LJLJJI(1, 500L, this.LL.LJI);
            return true;
        }
    });

    public final void LIZIZ() {
        this.LIZ.setText(this.LIZLLL);
        this.LJI.removeMessages(1);
        this.LJI.removeMessages(2);
        this.LIZLLL = "";
        this.LJ = 0;
        this.LJFF = false;
    }

    public final void LIZ() {
        LIZIZ();
        this.LJI.removeMessages(1);
        this.LJI.removeMessages(2);
    }

    public C1847020yAG(C1846630y9d c1846630y9d, long j, AFwS264S0000000_24 aFwS264S0000000_24) {
        this.LIZ = c1846630y9d;
        this.LIZIZ = j;
        this.LIZJ = aFwS264S0000000_24;
    }
}
