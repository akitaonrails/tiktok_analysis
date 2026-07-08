package X;

import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: renamed from: X.1ASn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C2179751ASn {
    public final String LIZ;
    public final int LIZIZ;
    public final int LIZJ;

    public final int hashCode() {
        return Objects.hash(this.LIZ, Integer.valueOf(this.LIZJ));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2179751ASn)) {
            return false;
        }
        C2179751ASn c2179751ASn = (C2179751ASn) obj;
        if (this.LIZIZ >= 0 && c2179751ASn.LIZIZ >= 0) {
            if (TextUtils.equals(this.LIZ, c2179751ASn.LIZ) && this.LIZIZ == c2179751ASn.LIZIZ && this.LIZJ == c2179751ASn.LIZJ) {
                return true;
            }
            return false;
        }
        if (TextUtils.equals(this.LIZ, c2179751ASn.LIZ) && this.LIZJ == c2179751ASn.LIZJ) {
            return true;
        }
        return false;
    }

    public C2179751ASn(String str, int i, int i2) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = i2;
    }
}
