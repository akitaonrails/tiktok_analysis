package X;

import java.util.Arrays;

/* JADX INFO: renamed from: X.19av, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21567919av {
    public final int LIZ;
    public final CharSequence LIZIZ;

    public final int hashCode() {
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(this.LIZ);
        CharSequence charSequence = this.LIZIZ;
        objArr[1] = charSequence != null ? charSequence.toString() : null;
        return Arrays.hashCode(objArr);
    }

    public final boolean equals(Object obj) {
        String string;
        if (obj instanceof C21567919av) {
            C21567919av c21567919av = (C21567919av) obj;
            if (this.LIZ == c21567919av.LIZ) {
                CharSequence charSequence = c21567919av.LIZIZ;
                CharSequence charSequence2 = this.LIZIZ;
                String string2 = null;
                if (charSequence2 != null) {
                    string = charSequence2.toString();
                } else {
                    string = null;
                }
                if (charSequence != null) {
                    string2 = charSequence.toString();
                }
                if (string == null) {
                    if (string2 == null) {
                        return true;
                    }
                } else if (string.equals(string2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public C21567919av(int i, CharSequence charSequence) {
        this.LIZ = i;
        this.LIZIZ = charSequence;
    }
}
