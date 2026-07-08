package X;

/* JADX INFO: renamed from: X.0HtU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C455420HtU implements InterfaceC879330YeZ {
    public final long LIZ;
    public final long LIZIZ;
    public final C0Z70 LIZJ;
    public final String LIZLLL;

    @Override // X.InterfaceC879330YeZ
    public final int LIZJ() {
        return 3;
    }

    @Override // X.InterfaceC879330YeZ
    public final String LIZIZ() {
        return String.valueOf(this.LIZIZ);
    }

    public final int hashCode() {
        return (int) this.LIZIZ;
    }

    @Override // X.InterfaceC879330YeZ
    public final String LIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("3:");
        sbLIZ.append(this.LIZIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AiMoji:");
        sbLIZ.append(this.LIZIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean equals(Object obj) {
        if (obj == this || ((obj instanceof C455420HtU) && ((C455420HtU) obj).LIZIZ == this.LIZIZ)) {
            return true;
        }
        return false;
    }

    public C455420HtU(long j, long j2, C0Z70 c0z70, String str) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = c0z70;
        this.LIZLLL = str;
    }
}
