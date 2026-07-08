package X;

import android.text.TextUtils;

/* JADX INFO: renamed from: X.0O0d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C612370O0d {
    public final boolean LIZ;
    public final String LIZIZ;
    public final long LIZJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("file");
        sbLIZ.append(": ");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append("  exists?");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(" size: ");
        sbLIZ.append(this.LIZJ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C612370O0d(String str) {
        this.LIZIZ = str;
        if (!TextUtils.isEmpty(str)) {
            C0VSJ c0vsj = new C0VSJ(str);
            if (c0vsj.exists() && c0vsj.isFile()) {
                this.LIZ = true;
                this.LIZJ = c0vsj.length();
                return;
            }
        }
        this.LIZ = false;
        this.LIZJ = 0L;
    }
}
