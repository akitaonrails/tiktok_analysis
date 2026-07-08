package X;

import java.util.Arrays;

/* JADX INFO: renamed from: X.135T, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C135T {
    public final String LIZ;
    public final C135R LIZIZ;
    public C135R LIZJ;

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.LIZ);
        sb.append('{');
        C135R c135r = this.LIZIZ.LIZJ;
        String str = "";
        while (c135r != null) {
            Object obj = c135r.LIZIZ;
            sb.append(str);
            String str2 = c135r.LIZ;
            if (str2 != null) {
                sb.append(str2);
                sb.append('=');
            }
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                String strDeepToString = Arrays.deepToString(new Object[]{obj});
                sb.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
            }
            c135r = c135r.LIZJ;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }

    public C135T(String str) {
        C135R c135r = new C135R();
        this.LIZIZ = c135r;
        this.LIZJ = c135r;
        this.LIZ = str;
    }

    public final void LIZ(long j, String str) {
        String strValueOf = String.valueOf(j);
        C135V c135v = new C135V();
        this.LIZJ.LIZJ = c135v;
        this.LIZJ = c135v;
        c135v.LIZIZ = strValueOf;
        c135v.LIZ = str;
    }

    public final void LIZIZ(Object obj, String str) {
        C135R c135r = new C135R();
        this.LIZJ.LIZJ = c135r;
        this.LIZJ = c135r;
        c135r.LIZIZ = obj;
        c135r.LIZ = str;
    }
}
