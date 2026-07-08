package X;

import java.util.Arrays;

/* JADX INFO: renamed from: X.08N7, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08N7 {
    public String LIZ;
    public String LIZIZ;

    public final String LIZ() {
        String str = this.LIZ;
        if (str == null || str.length() == 0) {
            return null;
        }
        String strSubstring = C2084708Er.LIZ(this.LIZ).substring(0, Math.min(16, this.LIZ.length()));
        String str2 = this.LIZIZ;
        return (str2 == null || str2.length() == 0) ? strSubstring : C786410Ut5.j4("%s_%s", Arrays.copyOf(new Object[]{strSubstring, C2084708Er.LIZ(this.LIZIZ).substring(0, Math.min(8, this.LIZIZ.length()))}, 2));
    }

    public final String LIZIZ() {
        String str = this.LIZ;
        if (str == null || str.length() == 0) {
            return null;
        }
        String str2 = this.LIZIZ;
        return (str2 == null || str2.length() == 0) ? this.LIZ : C786410Ut5.j4("%s_%s", Arrays.copyOf(new Object[]{this.LIZ, this.LIZIZ}, 2));
    }
}
