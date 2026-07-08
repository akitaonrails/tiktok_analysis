package X;

import java.io.Serializable;

/* JADX INFO: renamed from: X.1Dsu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2269861Dsu extends AbstractC2269871Dsv {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final Serializable LIZJ;

    public C2269861Dsu() {
        this(false, false, 7);
    }

    public C2269861Dsu(boolean z, boolean z2, int i) {
        String str;
        z = (i & 1) != 0 ? false : z;
        z2 = (i & 2) != 0 ? false : z2;
        if ((i & 4) != 0) {
            str = "";
        } else {
            str = null;
        }
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = str;
    }
}
