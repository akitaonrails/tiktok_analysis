package X;

import Y.ARunnableS113S0100000_13;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0UxN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C789070UxN {
    public final BPEAHandler LIZ = new BPEAHandler(Looper.getMainLooper());

    public void LIZ(C1543910qHN c1543910qHN, Function1<? super Boolean, Unit> function1) {
        C786410Ut5.LJJZZIII(this.LIZ, new ARunnableS113S0100000_13(function1, 250));
    }
}
