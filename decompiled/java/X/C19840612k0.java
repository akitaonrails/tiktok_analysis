package X;

import java.util.Arrays;

/* JADX INFO: renamed from: X.12k0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19840612k0 {
    public final String LIZ;
    public final C19840512jz LIZIZ;
    public C19840512jz LIZJ;

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.LIZ);
        sb.append('{');
        C19840512jz c19840512jz = this.LIZIZ.LIZJ;
        String str = "";
        while (c19840512jz != null) {
            Object obj = c19840512jz.LIZIZ;
            sb.append(str);
            String str2 = c19840512jz.LIZ;
            if (str2 != null) {
                sb.append(str2);
                sb.append('=');
            }
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                sb.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r1.length() - 1);
            }
            c19840512jz = c19840512jz.LIZJ;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }

    public /* synthetic */ C19840612k0(String str) {
        C19840512jz c19840512jz = new C19840512jz();
        this.LIZIZ = c19840512jz;
        this.LIZJ = c19840512jz;
        this.LIZ = str;
    }

    public final void LIZ(Object obj, String str) {
        C19840512jz c19840512jz = new C19840512jz();
        this.LIZJ.LIZJ = c19840512jz;
        this.LIZJ = c19840512jz;
        c19840512jz.LIZIZ = obj;
        c19840512jz.LIZ = str;
    }
}
