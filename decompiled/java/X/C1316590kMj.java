package X;

import Y.ARunnableS120S0100000_20;
import Y.ARunnableS26S0201000_20;
import Y.ARunnableS28S0400000_20;
import Y.ARunnableS89S0200000_20;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0kMj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1316590kMj implements InterfaceC1316540kMe {
    public final InterfaceC1316540kMe LIZ;
    public final ArrayList<Runnable> LIZIZ = new ArrayList<>();

    public final synchronized void LJ() {
        if (this.LIZIZ.isEmpty()) {
            return;
        }
        Iterator<Runnable> it2 = this.LIZIZ.iterator();
        while (it2.hasNext()) {
            it2.next().run();
        }
        this.LIZIZ.clear();
    }

    public C1316590kMj(C1315690kLH c1315690kLH) {
        this.LIZ = c1315690kLH;
    }

    @Override // X.InterfaceC1316540kMe
    public final synchronized void LIZIZ(JSONObject jSONObject) {
        LIZLLL(new ARunnableS89S0200000_20(this, jSONObject, 193));
    }

    public final synchronized void LIZLLL(Runnable runnable) {
        this.LIZIZ.add(runnable);
        C1289620jfE.LIZLLL(new ARunnableS120S0100000_20(this, 325));
    }

    @Override // X.InterfaceC1316540kMe
    public final synchronized void LIZJ(int i, Throwable th) {
        LIZLLL(new ARunnableS26S0201000_20(th, i, this, 14));
    }

    @Override // X.InterfaceC1316540kMe
    public final synchronized void LIZ(C1315930kLf c1315930kLf, C1315700kLI c1315700kLI, C1316350kML c1316350kML) {
        LIZLLL(new ARunnableS28S0400000_20(c1315930kLf, c1315700kLI, c1316350kML, this, 16));
    }
}
