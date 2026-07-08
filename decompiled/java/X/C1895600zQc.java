package X;

import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0zQc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1895600zQc {
    public static boolean LIZJ;
    public static final BPEAHandler LIZ = new BPEAHandler(Looper.getMainLooper());
    public static final List<InterfaceC1895690zQl> LIZIZ = new ArrayList();
    public static final C1895650zQh LIZLLL = new C1895650zQh();

    public static void LIZ() {
        C786410Ut5.LJLIIL(((C1899200zWQ.LIZ(C1899200zWQ.LIZ) + ((long) 86400)) - ((long) C1899200zWQ.LIZIZ())) * 1000, LIZ, new RunnableC1869970ylH(LIZLLL));
    }
}
