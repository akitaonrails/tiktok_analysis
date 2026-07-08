package X;

/* JADX INFO: renamed from: X.097M, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C097M extends AbstractC764660Tz6 {
    public final EnumC1993407rQ LIZ;
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C097M)) {
            return false;
        }
        C097M c097m = (C097M) obj;
        return this.LIZ == c097m.LIZ && this.LIZIZ == c097m.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("KaraokeSwitchChange(type=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", switchState=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C097M(EnumC1993407rQ enumC1993407rQ, boolean z) {
        this.LIZ = enumC1993407rQ;
        this.LIZIZ = z;
    }
}
