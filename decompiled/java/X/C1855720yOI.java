package X;

/* JADX INFO: renamed from: X.0yOI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1855720yOI implements InterfaceC0148002o {
    public final boolean LL;

    public C1855720yOI() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1855720yOI) && this.LL == ((C1855720yOI) obj).LL;
    }

    public final int hashCode() {
        return C786410Ut5.Z2(this.LL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AdditionalAreaState(hasShownToolTip=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1855720yOI(int i) {
        this(C1860520yW2.LJI());
        C1860520yW2.LIZ.getClass();
    }

    public C1855720yOI(boolean z) {
        this.LL = z;
    }
}
