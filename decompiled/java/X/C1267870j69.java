package X;

import Y.ARunnableS120S0100000_20;
import Y.ARunnableS25S1100000_20;
import android.content.Intent;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0j69, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1267870j69 implements InterfaceC1270540jAS {
    public final WeakReference<C1266350j3h> LL;
    public String LLILLJJLI;
    public InterfaceC1270560jAU LLILLL;
    public C1270520jAQ LLILZ;

    @Override // X.InterfaceC1270540jAS
    public final /* synthetic */ void LIZIZ(Intent intent) {
    }

    @Override // X.InterfaceC1270540jAS
    public final void stop() {
        if (this.LL.get() == null) {
            LIZJ(11, 0, 0L, "stream publish no start.");
            return;
        }
        C1266350j3h c1266350j3h = this.LL.get();
        if (c1266350j3h.LLJZ.get() != 7) {
            C786410Ut5.LJJZZIII(c1266350j3h.LL, new ARunnableS120S0100000_20(c1266350j3h, 356));
        }
    }

    @Override // X.InterfaceC1270540jAS
    public final C1270520jAQ getConfig() {
        return this.LLILZ;
    }

    public C1267870j69(WeakReference weakReference) {
        this.LL = weakReference;
    }

    @Override // X.InterfaceC1270540jAS
    public final void LIZ(String str, InterfaceC1270560jAU interfaceC1270560jAU, C1270520jAQ c1270520jAQ, int i) {
        boolean zLJJZZIII;
        this.LLILLJJLI = str;
        this.LLILLL = interfaceC1270560jAU;
        this.LLILZ = c1270520jAQ;
        if (this.LL.get() != null) {
            C1266350j3h c1266350j3h = this.LL.get();
            String str2 = this.LLILLJJLI;
            if (c1266350j3h.LLJZ.get() != 7) {
                zLJJZZIII = C786410Ut5.LJJZZIII(c1266350j3h.LL, new ARunnableS25S1100000_20(c1266350j3h, str2, 30));
            } else {
                zLJJZZIII = false;
            }
            C1270500jAO c1270500jAO = c1266350j3h.LLJLLL;
            if (!zLJJZZIII && c1270500jAO != null) {
                InterfaceC1270540jAS interfaceC1270540jAS = c1270500jAO.LL;
                if (interfaceC1270540jAS instanceof C1267870j69) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Publiser status exception(");
                    sbLIZ.append(c1266350j3h.LLJZ);
                    sbLIZ.append(")");
                    ((C1267870j69) interfaceC1270540jAS).LIZJ(11, 0, 0L, C2188811AlT.LIZIZ(sbLIZ));
                }
            }
        }
    }

    public final void LIZJ(int i, int i2, long j, String str) {
        InterfaceC1270560jAU interfaceC1270560jAU = this.LLILLL;
        if (interfaceC1270560jAU == null) {
            return;
        }
        interfaceC1270560jAU.LIZIZ(0, new Exception(str));
    }
}
