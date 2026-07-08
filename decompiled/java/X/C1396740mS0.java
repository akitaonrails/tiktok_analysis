package X;

import android.graphics.Bitmap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: X.0mS0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1396740mS0 {
    public long LIZ;
    public final TreeMap<Integer, C1396760mS2> LIZIZ = new TreeMap<>();
    public final HashMap<String, C1396750mS1> LIZJ = new HashMap<>();
    public final long LIZLLL;

    public C1396740mS0(long j) {
        this.LIZLLL = j;
    }

    public final C1396750mS1 LIZ(AbstractC1396700mRw<?> abstractC1396700mRw, String str) {
        C1396750mS1 c1396750mS1 = this.LIZJ.get(str);
        if (c1396750mS1 != null && ((int) abstractC1396700mRw.LJIIL()) == c1396750mS1.LJ && ((int) abstractC1396700mRw.LJI()) == c1396750mS1.LJFF) {
            return c1396750mS1;
        }
        int iLJIIL = (int) abstractC1396700mRw.LJIIL();
        C1396760mS2 c1396760mS2 = this.LIZIZ.get(Integer.valueOf(iLJIIL));
        if (c1396760mS2 == null) {
            Integer numHigherKey = this.LIZIZ.higherKey(Integer.valueOf((int) abstractC1396700mRw.LJIIL()));
            if (numHigherKey != null) {
                iLJIIL = numHigherKey.intValue();
                c1396760mS2 = this.LIZIZ.get(Integer.valueOf(iLJIIL));
                if (c1396760mS2 == null) {
                    return null;
                }
            } else {
                return null;
            }
        }
        HashMap<String, C1396750mS1> map = c1396760mS2.LIZIZ;
        if (map != null) {
            C1396750mS1 value = (C1396750mS1) C19719512Dh.LIZJ(map).remove(str);
            if (value == null) {
                Iterator<Map.Entry<String, C1396750mS1>> it2 = c1396760mS2.LIZIZ.entrySet().iterator();
                if (it2.hasNext()) {
                    value = it2.next().getValue();
                    it2.remove();
                    if (value == null) {
                        return null;
                    }
                } else {
                    return null;
                }
            }
            Bitmap bitmap = value.LIZIZ;
            if (bitmap != null) {
                c1396760mS2.LIZ -= bitmap.getAllocationByteCount();
                this.LIZ -= (long) bitmap.getAllocationByteCount();
                if (c1396760mS2.LIZIZ.isEmpty()) {
                    this.LIZIZ.remove(Integer.valueOf(iLJIIL));
                }
                return value;
            }
            return null;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableMap<K, V>");
    }
}
