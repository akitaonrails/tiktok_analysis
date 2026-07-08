package X;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0V84, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0V84 {
    public Map<String, C0V88> LIZ;
    public Map<String, C0V88> LIZIZ;
    public final int LIZJ = Math.min(3, 25);
    public int LIZLLL = 0;

    public final synchronized void LIZ(long j, String str, String str2) {
        if (this.LIZIZ == null) {
            this.LIZIZ = new HashMap();
        }
        if (((HashMap) this.LIZIZ).containsKey(str)) {
            C0V88 c0v88 = (C0V88) ((HashMap) this.LIZIZ).get(str);
            c0v88.LLILZ++;
            c0v88.LLILZIL = System.currentTimeMillis();
            int i = c0v88.LLILZ;
            if (i > this.LIZLLL) {
                this.LIZLLL = i;
            }
        } else {
            Map<String, C0V88> map = this.LIZ;
            if (map != null) {
                long j2 = Long.MAX_VALUE;
                String str3 = null;
                if (((HashMap) map).containsKey(str)) {
                    C0V88 c0v882 = (C0V88) ((HashMap) this.LIZ).get(str);
                    int i2 = c0v882.LLILZ;
                    c0v882.LLILZ = i2 + 1;
                    c0v882.LLILZIL = System.currentTimeMillis();
                    if (i2 > this.LIZJ) {
                        ((HashMap) this.LIZ).remove(str);
                        if (((HashMap) this.LIZIZ).size() >= 20) {
                            long jCurrentTimeMillis = ((System.currentTimeMillis() - 0) / 2) + 0;
                            for (Map.Entry entry : ((HashMap) this.LIZIZ).entrySet()) {
                                if (((C0V88) entry.getValue()).LLILZIL < jCurrentTimeMillis && ((C0V88) entry.getValue()).LLILZ < j2) {
                                    j2 = ((C0V88) entry.getValue()).LLILZ;
                                    str3 = ((C0V88) entry.getValue()).LL;
                                }
                            }
                            if (str3 != null) {
                                ((HashMap) this.LIZIZ).remove(str3);
                            }
                        }
                        ((HashMap) this.LIZIZ).put(str, c0v882);
                    }
                } else {
                    if (((HashMap) this.LIZ).size() >= 50) {
                        for (Map.Entry entry2 : ((HashMap) this.LIZ).entrySet()) {
                            if (((C0V88) entry2.getValue()).LLILZIL < j2) {
                                j2 = ((C0V88) entry2.getValue()).LLILZIL;
                                str3 = ((C0V88) entry2.getValue()).LL;
                            }
                        }
                        if (str3 != null) {
                            ((HashMap) this.LIZ).remove(str3);
                        }
                    }
                    ((HashMap) this.LIZ).put(str, new C0V88(str, j, str2));
                }
            } else {
                HashMap map2 = new HashMap();
                this.LIZ = map2;
                map2.put(str, new C0V88(str, j, str2));
            }
        }
    }
}
