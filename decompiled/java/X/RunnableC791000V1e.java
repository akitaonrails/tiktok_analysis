package X;

import java.util.Map;

/* JADX INFO: renamed from: X.0V1e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class RunnableC791000V1e implements Runnable {
    public final /* synthetic */ String LL;
    public final /* synthetic */ Map LLILLJJLI;
    public final /* synthetic */ float LLILLL;
    public final /* synthetic */ C790990V1d LLILZ;

    public final void LIZ() {
        C791010V1f c791010V1f = this.LLILZ.LLILLJJLI.get(this.LL);
        if (c791010V1f == null) {
            this.LLILZ.LLILLJJLI.put(this.LL, new C791010V1f(this.LLILLL));
        } else {
            c791010V1f.LIZ += this.LLILLL;
            c791010V1f.LIZJ++;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("FpsAggregateManger@622d.aggregate$1");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FpsAggregateManger@622d.aggregate$1");
    }

    public RunnableC791000V1e(C790990V1d c790990V1d, String str, Map map, float f) {
        this.LLILZ = c790990V1d;
        this.LL = str;
        this.LLILLJJLI = map;
        this.LLILLL = f;
    }
}
