package X;

/* JADX INFO: renamed from: X.0uC3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1694370uC3 implements InterfaceC1694380uC4 {
    public final int LIZIZ = 1;

    public final int hashCode() {
        return this.LIZIZ;
    }

    public final String toString() {
        int i = this.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AndroidContentDataType(androidAutofillType=");
        sbLIZ.append(i);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean equals(Object obj) {
        int i = this.LIZIZ;
        if (!(obj instanceof C1694370uC3) || i != ((C1694370uC3) obj).LIZIZ) {
            return false;
        }
        return true;
    }
}
