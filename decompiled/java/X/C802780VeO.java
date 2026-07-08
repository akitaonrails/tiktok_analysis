package X;

import Y.ARunnableS82S0200000_13;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import im3.b;

/* JADX INFO: renamed from: X.0VeO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C802780VeO {
    public static void LIZ() {
        C0VSJ c0vsj = new C0VSJ(C802580Ve4.LIZIZ);
        if (c0vsj.exists()) {
            c0vsj.delete();
        }
        C0VSJ c0vsj2 = new C0VSJ(C802580Ve4.LIZ);
        if (c0vsj2.exists()) {
            c0vsj2.delete();
        }
    }

    public static void LIZIZ(C801830Vcr c801830Vcr, C0VSJ c0vsj) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            new BPEAThread(new ARunnableS82S0200000_13(c0vsj, c801830Vcr, 62)).start();
        } else {
            if (b.LJII(C803190Vf3.LIZ.getNativeCrashUploadUrl(), C786410Ut5.J3(c801830Vcr.LIZ), c0vsj).LIZ != 0) {
                return;
            }
            LIZ();
        }
    }
}
