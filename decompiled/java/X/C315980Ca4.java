package X;

import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Ca4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C315980Ca4 {
    public final C1668880tWw LIZ;
    public final int LIZIZ;
    public final int LIZJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InfoCardIconProperties(icon=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", iconTint=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", backgroundSolidRes=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C315980Ca4(C1668880tWw c1668880tWw, int i, int i2) {
        this.LIZ = c1668880tWw;
        this.LIZIZ = i;
        this.LIZJ = i2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C315980Ca4(C1668880tWw c1668880tWw, int i, int i2, int i3) {
        int i4;
        c1668880tWw = (i2 & 1) != 0 ? C1669660tYC.b0 : c1668880tWw;
        i = (i2 & 2) != 0 ? R.attr.a1m : i;
        if ((i2 & 4) != 0) {
            i4 = R.attr.zi;
        } else {
            i4 = 0;
        }
        this(c1668880tWw, i, i4);
    }
}
