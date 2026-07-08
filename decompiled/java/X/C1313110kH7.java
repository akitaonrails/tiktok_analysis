package X;

import android.text.Spanned;
import android.util.LruCache;
import j27.s;

/* JADX INFO: renamed from: X.0kH7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1313110kH7 {
    public final LruCache<C1316750kMz, C1316730kMx> LIZ = new LruCache<>(500);

    public final C1316730kMx LIZ(s sVar, C1316750kMz c1316750kMz) {
        C1310290kCZ c1310290kCZ = sVar.LLLIIII;
        if (c1310290kCZ != null && !c1310290kCZ.LJJIZ) {
            return new C1316730kMx(sVar, c1316750kMz);
        }
        C1316730kMx c1316730kMx = this.LIZ.get(c1316750kMz);
        if (c1316730kMx != null) {
            return c1316730kMx;
        }
        C1316730kMx c1316730kMx2 = new C1316730kMx(sVar, c1316750kMz);
        C1316720kMw c1316720kMw = c1316750kMz.LIZ.LIZIZ;
        if (!c1316720kMw.LJIILLIIL && !c1316720kMw.LJIIZILJ) {
            Spanned spanned = (Spanned) c1316730kMx2.LIZ.getText();
            C1311620kEi[] c1311620kEiArr = (C1311620kEi[]) spanned.getSpans(0, spanned.length(), C1311620kEi.class);
            C1315120kKM[] c1315120kKMArr = (C1315120kKM[]) spanned.getSpans(0, spanned.length(), C1315120kKM.class);
            if ((c1311620kEiArr == null || c1311620kEiArr.length == 0) && (c1315120kKMArr == null || c1315120kKMArr.length == 0)) {
                this.LIZ.put(c1316750kMz, c1316730kMx2);
            }
        }
        return c1316730kMx2;
    }
}
