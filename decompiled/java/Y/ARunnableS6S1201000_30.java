package Y;

import X.C14W1;
import X.C19858012mo;
import X.C1C7U;
import X.InterfaceC1019840ce6;
import X.InterfaceC19858112mp;
import android.os.RemoteException;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.cut_downloader.AbsDownloadService;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public class ARunnableS6S1201000_30 implements Runnable {
    public final int $t;
    public int i3;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public static final void run$0(ARunnableS6S1201000_30 aRunnableS6S1201000_30) {
        boolean zLIZ;
        C1C7U.LIZ("FileSelectionMethod@9cd5.handle$1$onFailed$1");
        try {
            ((C14W1) aRunnableS6S1201000_30.l1).LLILLJJLI.LIZ();
            ((InterfaceC1019840ce6) aRunnableS6S1201000_30.l2).LIZ(aRunnableS6S1201000_30.i3, aRunnableS6S1201000_30.s0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FileSelectionMethod@9cd5.handle$1$onFailed$1");
    }

    public static final void run$1(ARunnableS6S1201000_30 aRunnableS6S1201000_30) {
        int i = aRunnableS6S1201000_30.i3;
        String str = aRunnableS6S1201000_30.s0;
        C19858012mo c19858012mo = (C19858012mo) aRunnableS6S1201000_30.l1;
        AbsDownloadService absDownloadService = (AbsDownloadService) aRunnableS6S1201000_30.l2;
        C1C7U.LIZ("AbsDownloadService$Callback@ecce.error$1L");
        Iterator<Integer> it2 = c19858012mo.LIZJ.iterator();
        while (it2.hasNext()) {
            int iIntValue = it2.next().intValue();
            List list = (List) ((LinkedHashMap) absDownloadService.LLILLJJLI).get(Integer.valueOf(iIntValue));
            if (list != null) {
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    try {
                        ((InterfaceC19858112mp) it3.next()).LJJJJI(str, i);
                    } catch (RemoteException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            }
        }
        c19858012mo.LIZJ.clear();
        absDownloadService.LLILLL.remove(c19858012mo.LIZ);
        C1C7U.LIZIZ("AbsDownloadService$Callback@ecce.error$1L");
    }

    public ARunnableS6S1201000_30(int i, String str, Object obj, Object obj2, int i2) {
        this.$t = i2;
        this.i3 = i;
        this.s0 = str;
        this.l1 = obj;
        this.l2 = obj2;
    }
}
