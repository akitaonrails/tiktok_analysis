package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS231S0000000_3;

/* JADX INFO: renamed from: X.13sK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20147013sK implements InterfaceC1840230xzJ {
    public final List<InterfaceC1840230xzJ> LIZ = new ArrayList();
    public final C1D84 LIZIZ;

    public C20147013sK(C1D84 c1d84) {
        this.LIZIZ = c1d84;
    }

    @Override // X.InterfaceC1840230xzJ
    public void onEvent(AbstractC556190Lrd abstractC556190Lrd) {
        Iterator it2 = ((ArrayList) this.LIZ).iterator();
        while (it2.hasNext()) {
            try {
                ((InterfaceC1840230xzJ) it2.next()).onEvent(abstractC556190Lrd);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1D84 c1d84 = this.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("EventObserver event:");
                sbLIZ.append(abstractC556190Lrd.LIZ);
                sbLIZ.append(" run error:");
                AFwS231S0000000_3.get$arr$(9).getClass();
                StringWriter stringWriter = new StringWriter();
                th.printStackTrace(new PrintWriter(stringWriter));
                String string = stringWriter.toString();
                sbLIZ.append(string.substring(0, Math.min(string.length(), Integer.MAX_VALUE)));
                c1d84.LIZIZ(777005, C2188811AlT.LIZIZ(sbLIZ), th);
            }
        }
    }
}
