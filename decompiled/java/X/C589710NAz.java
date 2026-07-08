package X;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0NAz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C589710NAz {
    public volatile boolean LIZ;
    public final List<InterfaceC1320200kSY<?>> LIZIZ = new ArrayList();

    public final synchronized void LIZIZ() {
        this.LIZ = true;
        for (InterfaceC1320200kSY interfaceC1320200kSY : (ArrayList) this.LIZIZ) {
            if (!interfaceC1320200kSY.LIZ()) {
                interfaceC1320200kSY.close();
            }
        }
        ((ArrayList) this.LIZIZ).clear();
    }

    public final synchronized void LIZ(AbstractC1321260kUG abstractC1321260kUG) {
        if (this.LIZ) {
            if (!abstractC1321260kUG.LIZ()) {
                abstractC1321260kUG.close();
            }
        } else {
            ((ArrayList) this.LIZIZ).add(abstractC1321260kUG);
        }
    }
}
