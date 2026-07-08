package X;

import Y.ARunnableS9S1000000_16;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0dPB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1049030dPB {
    public static final C1049030dPB LIZ = new C1049030dPB();
    public static final Set<String> LIZIZ = new LinkedHashSet();
    public static final Set<String> LIZJ = new LinkedHashSet();
    public static final C1519760peQ<InterfaceC1049130dPL> LIZLLL = new C1519760peQ<>();
    public static final BPEAHandler LJ = new BPEAHandler(Looper.getMainLooper());

    public final synchronized void LIZ(String str) {
        Set<String> set = LIZIZ;
        if (set.contains(str)) {
            return;
        }
        set.add(str);
        ARunnableS9S1000000_16 aRunnableS9S1000000_16 = new ARunnableS9S1000000_16(str, 5);
        if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            aRunnableS9S1000000_16.run();
        } else {
            C786410Ut5.LJJZZIII(LJ, aRunnableS9S1000000_16);
        }
    }
}
