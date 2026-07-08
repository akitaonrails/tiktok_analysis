package X;

import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0JgA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C498120JgA {
    public final boolean LIZIZ;
    public int LIZLLL;
    public final boolean LIZ = false;
    public final BPEAHandler LIZJ = new BPEAHandler(Looper.getMainLooper());
    public final List<AbstractC498530Jgp<? extends AbstractC521080Kc6>> LJ = new ArrayList();
    public final CopyOnWriteArrayList<AbstractC498550Jgr<? extends AbstractC521080Kc6>> LJFF = new CopyOnWriteArrayList<>();

    public C498120JgA(boolean z) {
        this.LIZIZ = z;
    }
}
