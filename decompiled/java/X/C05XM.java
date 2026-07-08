package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.05XM, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C05XM implements Runnable {
    public final /* synthetic */ String LL = "fist_feed_show";
    public final /* synthetic */ Runnable LLILLJJLI;

    public C05XM(Runnable runnable) {
        this.LLILLJJLI = runnable;
    }

    public final void LIZ() {
        Map<String, ArrayList<Runnable>> map = C1239204t4.LIZ;
        ArrayList arrayList = (ArrayList) ((LinkedHashMap) map).get(this.LL);
        if (arrayList == null || !arrayList.contains(this.LLILLJJLI)) {
            return;
        }
        this.LLILLJJLI.run();
        ArrayList arrayList2 = (ArrayList) ((LinkedHashMap) map).get(this.LL);
        if (arrayList2 != null) {
            arrayList2.remove(this.LLILLJJLI);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("MessageOptManager@16fe.cacheRunnable$3");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MessageOptManager@16fe.cacheRunnable$3");
    }
}
