package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: X.14gR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class RunnableC20328114gR implements Runnable {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    public RunnableC20328114gR(String str, String str2, String str3) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
    }

    public final void LIZ() {
        try {
            Set<InterfaceC20328314gT> set = C204662156m.LIZJ;
            ArrayList arrayList = new ArrayList();
            for (Object obj : set) {
                if (((InterfaceC20328314gT) obj).isEnable()) {
                    arrayList.add(obj);
                }
            }
            String str = this.LL;
            String str2 = this.LLILLJJLI;
            String str3 = this.LLILLL;
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((InterfaceC20328314gT) it2.next()).LIZ(str, str2, str3);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20328514gV c20328514gV = C204662156m.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("monitor exception ");
            sbLIZ.append(e.getMessage());
            c20328514gV.LJFF("AnchorMonitor", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("AnchorMonitor@9c78.report$1");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AnchorMonitor@9c78.report$1");
    }
}
