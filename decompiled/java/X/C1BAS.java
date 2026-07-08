package X;

import java.util.Arrays;

/* JADX INFO: renamed from: X.1BAS, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BAS {
    public final String LIZ;
    public final C1BAV LIZIZ;
    public C1BAV LIZJ;

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.LIZ);
        sb.append('{');
        C1BAV c1bav = this.LIZIZ.LIZIZ;
        String str = "";
        while (c1bav != null) {
            Object obj = c1bav.LIZ;
            sb.append(str);
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                sb.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r1.length() - 1);
            }
            c1bav = c1bav.LIZIZ;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }

    public /* synthetic */ C1BAS(String str) {
        C1BAV c1bav = new C1BAV();
        this.LIZIZ = c1bav;
        this.LIZJ = c1bav;
        this.LIZ = str;
    }
}
