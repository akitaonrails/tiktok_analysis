package X;

/* JADX INFO: renamed from: X.0KpT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C529370KpT implements InterfaceC529350KpR {
    public final int LIZIZ;

    public final int hashCode() {
        return this.LIZIZ;
    }

    public final String toString() {
        int i = this.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ExceedMaxDuration(maxDuration=");
        sbLIZ.append(i);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean equals(Object obj) {
        int i = this.LIZIZ;
        if (!(obj instanceof C529370KpT) || i != ((C529370KpT) obj).LIZIZ) {
            return false;
        }
        return true;
    }
}
