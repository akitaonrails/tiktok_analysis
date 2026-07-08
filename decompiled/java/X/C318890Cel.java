package X;

/* JADX INFO: renamed from: X.0Cel, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C318890Cel {
    public final boolean LIZ;
    public final boolean LIZIZ;

    public C318890Cel() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C318890Cel)) {
            return false;
        }
        C318890Cel c318890Cel = (C318890Cel) obj;
        return this.LIZ == c318890Cel.LIZ && this.LIZIZ == c318890Cel.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BottomCreateEffectBtnShowData(show=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", withAnim=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C318890Cel(int i) {
        this(false, true);
    }

    public C318890Cel(boolean z, boolean z2) {
        this.LIZ = z;
        this.LIZIZ = z2;
    }
}
