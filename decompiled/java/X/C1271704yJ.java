package X;

/* JADX INFO: renamed from: X.04yJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1271704yJ implements InterfaceC1891350zJl {
    public final int LL = -2000;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1271704yJ) && this.LL == ((C1271704yJ) obj).LL;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return this.LL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AdapterLoadingItem(type=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1271704yJ c1271704yJ;
        if (interfaceC1891350zJl instanceof C1271704yJ) {
            c1271704yJ = (C1271704yJ) interfaceC1891350zJl;
        } else {
            c1271704yJ = null;
        }
        if (c1271704yJ == null || this.LL != c1271704yJ.LL) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1271704yJ c1271704yJ;
        if (interfaceC1891350zJl instanceof C1271704yJ) {
            c1271704yJ = (C1271704yJ) interfaceC1891350zJl;
        } else {
            c1271704yJ = null;
        }
        if (c1271704yJ == null || this.LL != c1271704yJ.LL) {
            return false;
        }
        return true;
    }
}
