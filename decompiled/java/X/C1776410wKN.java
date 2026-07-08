package X;

/* JADX INFO: renamed from: X.0wKN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1776410wKN extends AbstractC1776430wKP {
    public final int LL;

    public final C1776410wKN copy(int i) {
        return new C1776410wKN(i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1776410wKN) && this.LL == ((C1776410wKN) obj).LL;
    }

    public int hashCode() {
        return this.LL;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Solid(color=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int getColor() {
        return this.LL;
    }

    public C1776410wKN(int i) {
        this.LL = i;
    }
}
