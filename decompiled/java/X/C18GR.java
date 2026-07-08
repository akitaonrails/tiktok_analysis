package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18GR, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18GR<T> implements InterfaceC1778290wNP {
    public final C18EH<T> LIZ;
    public final String LIZIZ;
    public final T LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18GR)) {
            return false;
        }
        C18GR c18gr = (C18GR) obj;
        return Intrinsics.LJFF(this.LIZ, c18gr.LIZ) && Intrinsics.LJFF(this.LIZIZ, c18gr.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c18gr.LIZJ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        T t = this.LIZJ;
        return iHashCode2 + (t != null ? t.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LocalStoreData(localStore=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", key=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", value=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C18GR(C18EH<T> c18eh, String str, T t) {
        this.LIZ = c18eh;
        this.LIZIZ = str;
        this.LIZJ = t;
    }
}
