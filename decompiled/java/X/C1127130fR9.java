package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0fR9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1127130fR9 {
    public long LIZ;
    public int LIZIZ;
    public boolean LIZJ;
    public final Map<Long, Integer> LIZLLL = new LinkedHashMap();

    public final String toString() {
        Object objLJIL;
        StringBuilder sb = new StringBuilder("FreqLimitInfo(giftId=");
        sb.append(this.LIZ);
        sb.append(", remainTimes=");
        sb.append(this.LIZIZ);
        sb.append(", forSingleAnchor=");
        sb.append(this.LIZJ);
        sb.append(", anchorIdList=");
        Map<Long, Integer> map = this.LIZLLL;
        if (!this.LIZJ || map == null || (objLJIL = C2097808Js.LJIL(map)) == null) {
            objLJIL = C13BV.INSTANCE;
        }
        sb.append(objLJIL);
        sb.append(')');
        return sb.toString();
    }
}
