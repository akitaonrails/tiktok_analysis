package X;

/* JADX INFO: renamed from: X.0yjk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1869020yjk extends C1869040yjm {
    public final boolean LIZIZ;

    public C1869020yjk() {
        super(null);
        this.LIZIZ = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1869020yjk) && this.LIZIZ == ((C1869020yjk) obj).LIZIZ;
    }

    public final int hashCode() {
        return C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LoginComponentData(shouldTrySmartLock=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
