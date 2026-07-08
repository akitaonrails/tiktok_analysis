package X;

/* JADX INFO: renamed from: X.0gEJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1157610gEJ implements InterfaceC111300bX {
    public final EnumC1163290gNT LL;

    public C1157610gEJ() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1157610gEJ) && this.LL == ((C1157610gEJ) obj).LL;
    }

    public final int hashCode() {
        EnumC1163290gNT enumC1163290gNT = this.LL;
        if (enumC1163290gNT == null) {
            return 0;
        }
        return enumC1163290gNT.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MeditationExerciseData(type=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1157610gEJ(EnumC1163290gNT enumC1163290gNT) {
        this.LL = enumC1163290gNT;
    }
}
