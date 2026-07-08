package X;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: X.0VMt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C796610VMt {
    public final int[] LIZ;
    public final String[] LIZIZ;
    public final AbstractC796650VMx LIZJ;
    public final Set<String> LIZLLL;

    public C796610VMt(AbstractC796650VMx abstractC796650VMx, int[] iArr, String[] strArr) {
        this.LIZJ = abstractC796650VMx;
        this.LIZ = iArr;
        this.LIZIZ = strArr;
        if (iArr.length == 1) {
            HashSet hashSet = new HashSet();
            hashSet.add(strArr[0]);
            this.LIZLLL = Collections.unmodifiableSet(hashSet);
            return;
        }
        this.LIZLLL = null;
    }
}
