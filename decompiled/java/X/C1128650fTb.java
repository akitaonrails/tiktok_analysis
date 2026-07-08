package X;

import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0fTb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1128650fTb {
    public static final /* synthetic */ int LIZLLL = 0;
    public final int[] LIZ;
    public final Map<Long, Integer> LIZIZ;
    public final List<Long> LIZJ;

    public final int LIZ(long j) {
        int iIntValue;
        Integer num = this.LIZIZ.get(Long.valueOf(j));
        if (num == null || (iIntValue = num.intValue()) < 0) {
            return -1;
        }
        int[] iArr = this.LIZ;
        if (iIntValue >= iArr.length) {
            return -1;
        }
        return iArr[iIntValue];
    }

    public C1128650fTb(int[] iArr, Map map, List list) {
        this.LIZ = iArr;
        this.LIZIZ = map;
        this.LIZJ = list;
    }
}
