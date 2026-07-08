package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: X.0T5l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class RunnableC741150T5l implements Runnable {
    public final HashMap<Integer, C1269510j8n> LL = new HashMap<>();
    public final Runnable LLILLJJLI;

    public final void LIZ() {
        for (Map.Entry<Integer, C1269510j8n> entry : this.LL.entrySet()) {
            C1269500j8m.LIZJ().LJFF(entry.getKey().intValue(), entry.getValue());
        }
        Runnable runnable = this.LLILLJJLI;
        if (runnable != null) {
            runnable.run();
        }
        Iterator<Integer> it2 = this.LL.keySet().iterator();
        while (it2.hasNext()) {
            C1269500j8m.LIZJ().LIZLLL(it2.next().intValue());
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("PrivacyCertManager$RunnableWithCert@ab82.run");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PrivacyCertManager$RunnableWithCert@ab82.run");
    }

    public RunnableC741150T5l(Runnable runnable, int[] iArr) {
        this.LLILLJJLI = runnable;
        for (int i : iArr) {
            if (i >= 0 && i < 2) {
                this.LL.put(Integer.valueOf(i), C1269500j8m.LIZJ().LIZLLL(i));
            }
        }
    }
}
