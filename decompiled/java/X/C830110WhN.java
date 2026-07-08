package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;

/* JADX INFO: renamed from: X.0WhN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C830110WhN implements InterfaceC830210WhX {
    public final C0VSJ LIZ;
    public final List<InterfaceC830190WhV> LIZIZ;

    public final void LIZ() {
        Iterator it2 = ((ArrayList) this.LIZIZ).iterator();
        while (it2.hasNext()) {
            try {
                ((InterfaceC830190WhV) it2.next()).LIZ();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                AbstractC830080WhK.LJIIJ.log(Level.WARNING, "could not delete file ", (Throwable) e);
            }
        }
        ((ArrayList) this.LIZIZ).clear();
    }

    public C830110WhN() {
        C0VSJ c0vsj = new C0VSJ(System.getProperty("java.io.tmpdir"));
        this.LIZ = c0vsj;
        if (!c0vsj.exists()) {
            c0vsj.mkdirs();
        }
        this.LIZIZ = new ArrayList();
    }
}
