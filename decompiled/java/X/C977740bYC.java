package X;

/* JADX INFO: renamed from: X.0bYC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C977740bYC {
    public final String LIZ;
    public final int LIZIZ;

    public C977740bYC() {
        this(null, 3, 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PanelTitleState(content=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", position=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C977740bYC(String str, int i) {
        this.LIZ = str;
        this.LIZIZ = i;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C977740bYC(String str, int i, int i2) {
        int i3;
        str = (i & 1) != 0 ? C497740JfY.LJIJI(2131853686) : str;
        if ((i & 2) != 0) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        this(str, i3);
    }
}
