package X;

import java.util.List;

/* JADX INFO: renamed from: X.0MNU, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MNU {
    public final String LIZ;
    public final String LIZIZ;
    public final List<C1EJ2> LIZJ;

    public C0MNU() {
        this(127, null, null);
    }

    public C0MNU(int i, String str, String str2) {
        str = (i & 1) != 0 ? null : str;
        str2 = (i & 2) != 0 ? null : str2;
        C13BV c13bv = (i & 64) != 0 ? C13BV.INSTANCE : null;
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = c13bv;
    }
}
