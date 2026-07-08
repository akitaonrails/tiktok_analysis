package X;

import Y.ARunnableS104S0100000_4;
import Y.ARunnableS15S0101000_4;
import android.os.Looper;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS548S0100000_4;

/* JADX INFO: renamed from: X.0CAN, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CAN {
    public int LIZIZ;
    public long LJFF;
    public final int LIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
    public final C01GW LIZJ = C452501pT.LIZIZ(new AwS548S0100000_4(this, 509));
    public final MutableLiveData<Boolean> LIZLLL = new MutableLiveData<>(Boolean.FALSE);
    public final BPEAHandler LJ = new BPEAHandler(Looper.getMainLooper());

    public final void LIZ(Integer num, Function1<? super Integer, Unit> function1) {
        C0CAP c0cap;
        if (num != null) {
            int iIntValue = num.intValue();
            if (iIntValue > 0) {
                c0cap = C0CAP.FLAG_SCROLL_DOWN;
            } else {
                c0cap = C0CAP.FLAG_SCROLL_UP;
            }
            int iAbs = Math.abs(iIntValue);
            int i = C0CAO.LIZ[c0cap.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    int i2 = this.LIZIZ;
                    if (i2 < 0) {
                        this.LIZLLL.postValue(Boolean.FALSE);
                        if (System.currentTimeMillis() - this.LJFF > 800) {
                            C786410Ut5.LJJZZIII(this.LJ, new ARunnableS15S0101000_4(iIntValue, function1, 4));
                            this.LJFF = System.currentTimeMillis();
                            return;
                        }
                        return;
                    }
                    this.LIZIZ = i2 - iAbs;
                    this.LIZLLL.postValue(Boolean.TRUE);
                    return;
                }
                return;
            }
            int i3 = this.LIZIZ;
            if (i3 > this.LIZ) {
                this.LIZLLL.postValue(Boolean.FALSE);
                if (System.currentTimeMillis() - this.LJFF <= 800) {
                    return;
                }
                C786410Ut5.LJJZZIII(this.LJ, new ARunnableS15S0101000_4(iIntValue, function1, 3));
                this.LJFF = System.currentTimeMillis();
                return;
            }
            this.LIZIZ = i3 + iAbs;
            this.LIZLLL.postValue(Boolean.TRUE);
            return;
        }
        if (System.currentTimeMillis() - this.LJFF > 800) {
            C786410Ut5.LJJZZIII(this.LJ, new ARunnableS104S0100000_4(function1, 120));
            this.LJFF = System.currentTimeMillis();
        }
    }
}
