package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.core.Assembler;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: renamed from: X.0SaK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C723820SaK {
    public final LifecycleOwner LIZ;
    public final AbstractC724890Sc3 LIZIZ;
    public final C01GW LIZJ = C452501pT.LIZIZ(new C723790SaH(this));
    public final List<AbstractC738140SxQ> LIZLLL = new ArrayList();
    public final LinkedBlockingQueue<Runnable> LJ = new LinkedBlockingQueue<>();

    public final Assembler LIZ() {
        return (Assembler) this.LIZJ.getValue();
    }

    public final void LIZIZ() {
        ((ArrayList) this.LIZLLL).clear();
        this.LJ.clear();
    }

    public C723820SaK(LifecycleOwner lifecycleOwner, AbstractC724890Sc3 abstractC724890Sc3) {
        this.LIZ = lifecycleOwner;
        this.LIZIZ = abstractC724890Sc3;
    }
}
