package X;

/* JADX INFO: renamed from: X.0iwI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1261760iwI extends AbstractC1261840iwQ<C1261770iwJ> {
    public final C1261770iwJ LLILLJJLI;
    public final C1262090iwp LLILLL;
    public final C1261770iwJ LLILZ;

    @Override // X.AbstractC1261840iwQ
    public final int hashCode() {
        return this.LLILZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AuthItem(authCard: ");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1261840iwQ
    public final /* bridge */ /* synthetic */ InterfaceC1262230ix3 LIZIZ() {
        return this.LLILLJJLI;
    }

    @Override // X.AbstractC1261840iwQ
    public final boolean equals(Object obj) {
        if (!(obj instanceof C1261760iwI)) {
            return false;
        }
        return areItemTheSame((InterfaceC1891350zJl) obj);
    }

    public C1261760iwI(C1261770iwJ c1261770iwJ, C1262090iwp c1262090iwp) {
        this.LLILLJJLI = c1261770iwJ;
        this.LLILLL = c1262090iwp;
        this.LLILZ = c1261770iwJ;
    }
}
