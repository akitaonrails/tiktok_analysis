package X;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.13LK, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13LK {
    public int LIZ = 10;
    public final C13E8<C1879107Xp> LIZIZ = new C13E8<>(this.LIZ);
    public final AtomicReference<String> LIZJ = new AtomicReference<>("");
    public int LIZLLL = -1;

    public final String LIZIZ() {
        String string;
        if (this.LIZIZ.isEmpty()) {
            string = "";
        } else {
            StringBuilder sb = new StringBuilder();
            Long lValueOf = null;
            for (C1879107Xp c1879107Xp : C13LP.LJLJJLL(this.LIZIZ)) {
                sb.append(c1879107Xp.LIZ);
                sb.append(',');
                sb.append(c1879107Xp.LIZIZ);
                sb.append(',');
                if (lValueOf == null) {
                    sb.append(c1879107Xp.LIZJ);
                } else {
                    sb.append(lValueOf.longValue() - c1879107Xp.LIZJ);
                }
                sb.append(',');
                sb.append(c1879107Xp.LIZLLL ? 1 : 0);
                sb.append(';');
                lValueOf = Long.valueOf(c1879107Xp.LIZJ);
            }
            string = sb.toString();
        }
        return LIZJ(string, C20163513uz.LIZJ());
    }

    public final synchronized void LIZ(C1879107Xp c1879107Xp) {
        System.currentTimeMillis();
        if (this.LIZIZ.size() >= this.LIZ) {
            this.LIZIZ.removeFirst();
        }
        this.LIZIZ.addLast(c1879107Xp);
        this.LIZJ.set(LIZIZ());
    }

    public final String LIZJ(String str, String str2) {
        int i;
        if (str.length() == 0) {
            return "";
        }
        if (this.LIZLLL == -1) {
            if (str2.length() == 0) {
                i = 3;
            } else {
                int length = str2.length();
                long j = 0;
                int i2 = 0;
                while (i2 < length) {
                    long jCharAt = str2.charAt(i2);
                    i2++;
                    j += jCharAt * ((long) i2);
                }
                i = ((int) (j % ((long) 25))) + 1;
            }
            this.LIZLLL = i;
        }
        StringBuilder sb = new StringBuilder();
        int length2 = str.length();
        for (int i3 = 0; i3 < length2; i3++) {
            char cCharAt = str.charAt(i3);
            int i4 = this.LIZLLL;
            int iLJJIZ = a0.LJJIZ("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789,;", cCharAt, 0, false, 6);
            if (iLJJIZ != -1) {
                cCharAt = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789,;".charAt((iLJJIZ + i4) % 64);
            }
            sb.append(cCharAt);
        }
        return sb.toString();
    }
}
