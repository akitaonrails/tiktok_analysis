package X;

/* JADX INFO: renamed from: X.01hb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C403701hb extends AbstractC399701gx {
    public final boolean LIZ = false;
    public final boolean LIZIZ = true;
    public final boolean LIZJ = false;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C403701hb)) {
            return false;
        }
        C403701hb c403701hb = (C403701hb) obj;
        return this.LIZ == c403701hb.LIZ && this.LIZIZ == c403701hb.LIZIZ && this.LIZJ == c403701hb.LIZJ;
    }

    public final int hashCode() {
        return (((C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UpdateAIBeautyActionStatus(isEnable=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isCancel=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isRetry=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
