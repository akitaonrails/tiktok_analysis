package X;

/* JADX INFO: renamed from: X.0eOe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1087140eOe {
    public final float LIZ;
    public final float LIZIZ;
    public final float LIZJ;
    public final float LIZLLL;

    public C1087140eOe() {
        this(0.0f, 0.0f, 0.0f, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1087140eOe)) {
            return false;
        }
        C1087140eOe c1087140eOe = (C1087140eOe) obj;
        return Float.compare(this.LIZ, c1087140eOe.LIZ) == 0 && Float.compare(this.LIZIZ, c1087140eOe.LIZIZ) == 0 && Float.compare(this.LIZJ, c1087140eOe.LIZJ) == 0 && Float.compare(this.LIZLLL, c1087140eOe.LIZLLL) == 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("WiggleInfo(frequency=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", yAmplitude=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", scaleMin=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", scaleMax=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1087140eOe(float f, float f2, float f3, int i) {
        float f4;
        if ((i & 1) != 0) {
            f4 = 0.4f;
        } else {
            f4 = 0.0f;
        }
        f = (i & 2) != 0 ? 50.0f : f;
        f2 = (i & 4) != 0 ? 0.8f : f2;
        f3 = (i & 8) != 0 ? 1.2f : f3;
        this.LIZ = f4;
        this.LIZIZ = f;
        this.LIZJ = f2;
        this.LIZLLL = f3;
    }
}
