package X;

import X.InterfaceC833080WmA;
import java.util.Arrays;

/* JADX INFO: renamed from: X.0WjU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C831420WjU<O extends InterfaceC833080WmA> {
    public final int LIZ;
    public final C832010WkR<O> LIZIZ;
    public final O LIZJ;
    public final String LIZLLL;

    public final int hashCode() {
        return this.LIZ;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C831420WjU)) {
            return false;
        }
        C831420WjU c831420WjU = (C831420WjU) obj;
        if (!C0W0T.LIZIZ(this.LIZIZ, c831420WjU.LIZIZ) || !C0W0T.LIZIZ(this.LIZJ, c831420WjU.LIZJ) || !C0W0T.LIZIZ(this.LIZLLL, c831420WjU.LIZLLL)) {
            return false;
        }
        return true;
    }

    public C831420WjU(C832010WkR<O> c832010WkR, O o, String str) {
        this.LIZIZ = c832010WkR;
        this.LIZJ = o;
        this.LIZLLL = str;
        this.LIZ = Arrays.hashCode(new Object[]{c832010WkR, o, str});
    }
}
